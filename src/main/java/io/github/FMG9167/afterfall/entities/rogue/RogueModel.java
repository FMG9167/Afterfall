package io.github.FMG9167.afterfall.entities.rogue;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;

public class RogueModel<T extends ZombieEntity> extends ZombieEntityModel<T> {
    private final ModelPart Rogue;
    private final ModelPart Head;
    public RogueModel(ModelPart root) {
        super(root);
        this.Rogue = root.getChild("Rogue");
        this.Head = this.Rogue.getChild("Head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Rogue = modelPartData.addChild("Rogue", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData Body = Rogue.addChild("Body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

        ModelPartData Head = Rogue.addChild("Head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
                .uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

        ModelPartData RightArm = Rogue.addChild("RightArm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

        ModelPartData RightArm_r1 = RightArm.addChild("RightArm_r1", ModelPartBuilder.create().uv(40, 16).cuboid(-8.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

        ModelPartData LeftArm = Rogue.addChild("LeftArm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

        ModelPartData LeftArm_r1 = LeftArm.addChild("LeftArm_r1", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-5.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

        ModelPartData RightLeg = Rogue.addChild("RightLeg", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, -12.0F, 0.0F));

        ModelPartData LeftLeg = Rogue.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(1.9F, -12.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
}
