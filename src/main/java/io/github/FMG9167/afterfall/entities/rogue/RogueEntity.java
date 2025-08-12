package io.github.FMG9167.afterfall.entities.rogue;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class RogueEntity extends ZombieEntity {
    public RogueEntity(EntityType<? extends ZombieEntity> entityType, World world) {
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

    public static DefaultAttributeContainer.Builder createRogueAttributes() {
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
