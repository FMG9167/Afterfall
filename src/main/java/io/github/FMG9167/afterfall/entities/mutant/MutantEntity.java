package io.github.FMG9167.afterfall.entities.mutant;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class MutantEntity extends HostileEntity {
    public MutantEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void initGoals() {
        this.goalSelector.add(0, new AttackGoal(this));
        this.goalSelector.add(4, new ActiveTargetGoal<>(this, PlayerEntity.class, true, true));
        this.goalSelector.add(2, new LookAroundGoal(this));
        this.goalSelector.add(3, new WanderAroundGoal(this, 1D));
        this.goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 12.0F));
    }

    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(MutantEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }

        if(this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 40;
            attackAnimationState.start(this.age);
        } else {
            --this.attackAnimationTimeout;
        }

        if(!this.isAttacking()) {
            attackAnimationState.stop();
        }
    }

    public void tick() {
        super.tick();
        if(this.getWorld().isClient){
            setupAnimationStates();
        }
    }

    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
    }

    public static DefaultAttributeContainer.Builder createMutantAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 50)
                .add(EntityAttributes.ZOMBIE_SPAWN_REINFORCEMENTS)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2)
                .add(EntityAttributes.GENERIC_ARMOR, 10)
                .add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, 1)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 2)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32);
    }
}
