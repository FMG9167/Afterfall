package io.github.FMG9167.afterfall.entities.mutant;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class MutantModel<T extends MutantEntity> extends SinglePartEntityModel<T> {
    private final ModelPart Mutant;
    private final ModelPart Head;
    public MutantModel(ModelPart root) {
        this.Mutant = root.getChild("Mutant");
        this.Head = this.Mutant.getChild("Head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Mutant = modelPartData.addChild("Mutant", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData Hip = Mutant.addChild("Hip", ModelPartBuilder.create().uv(0, 34).cuboid(-11.0F, -35.0F, 3.0F, 22.0F, 18.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Head = Mutant.addChild("Head", ModelPartBuilder.create().uv(58, 34).cuboid(-6.0F, -52.0F, -7.0F, 12.0F, 12.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Torso = Mutant.addChild("Torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Torso_r1 = Torso.addChild("Torso_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-18.0F, -19.0F, -2.0F, 36.0F, 19.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -23.0F, 2.0F, 0.48F, 0.0F, 0.0F));

        ModelPartData Right_foot = Mutant.addChild("Right_foot", ModelPartBuilder.create().uv(78, 81).cuboid(4.0F, -2.0F, 0.0F, 7.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Right_shin = Mutant.addChild("Right_shin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Right_shin_r1 = Right_shin.addChild("Right_shin_r1", ModelPartBuilder.create().uv(0, 82).cuboid(-5.0F, -8.5F, -0.75F, 7.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -3.0F, 3.0F, 0.4363F, 0.0F, 0.0F));

        ModelPartData Right_thigh = Mutant.addChild("Right_thigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Right_thigh_r1 = Right_thigh.addChild("Right_thigh_r1", ModelPartBuilder.create().uv(22, 82).cuboid(-5.0F, -8.5F, -0.75F, 7.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -12.0F, 0.0F, -0.6981F, 0.0F, 0.0F));

        ModelPartData Left_thigh = Mutant.addChild("Left_thigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Left_thigh_r1 = Left_thigh.addChild("Left_thigh_r1", ModelPartBuilder.create().uv(0, 97).cuboid(-5.0F, -8.5F, -0.75F, 7.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -12.0F, 0.0F, -0.6981F, 0.0F, 0.0F));

        ModelPartData Left_shin = Mutant.addChild("Left_shin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Left_shin_r1 = Left_shin.addChild("Left_shin_r1", ModelPartBuilder.create().uv(78, 90).cuboid(-5.0F, -8.5F, -0.75F, 7.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -3.0F, 3.0F, 0.4363F, 0.0F, 0.0F));

        ModelPartData Left_foot = Mutant.addChild("Left_foot", ModelPartBuilder.create().uv(84, 58).cuboid(-11.0F, -2.0F, 0.0F, 7.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Right_forearm = Mutant.addChild("Right_forearm", ModelPartBuilder.create(), ModelTransform.of(19.0F, -34.0F, 4.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData Right_forearm_r1 = Right_forearm.addChild("Right_forearm_r1", ModelPartBuilder.create().uv(0, 59).cuboid(-3.9132F, -14.5533F, -2.7444F, 7.0F, 17.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 10.0F, -7.0F, 1.8762F, -0.0873F, -0.0873F));

        ModelPartData Right_bicep = Mutant.addChild("Right_bicep", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Right_bicep_r1 = Right_bicep.addChild("Right_bicep_r1", ModelPartBuilder.create().uv(58, 58).cuboid(-4.0F, -7.5549F, -3.464F, 7.0F, 17.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(22.0F, -30.0F, 1.0F, 2.618F, -0.0873F, -0.0873F));

        ModelPartData Left_forearm = Mutant.addChild("Left_forearm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Left_forearm_r1 = Left_forearm.addChild("Left_forearm_r1", ModelPartBuilder.create().uv(52, 81).cuboid(-4.0F, -14.8456F, -3.6968F, 7.0F, 17.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-22.0F, -24.0F, -3.0F, 1.8762F, 0.0873F, 0.0873F));

        ModelPartData Left_bicep = Mutant.addChild("Left_bicep", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Left_bicep_r1 = Left_bicep.addChild("Left_bicep_r1", ModelPartBuilder.create().uv(26, 59).cuboid(-4.0F, -7.5549F, -3.464F, 7.0F, 17.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-21.0F, -29.0F, 1.0F, 2.618F, 0.0873F, 0.0873F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void setAngles(MutantEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        Mutant.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return Mutant;
    }
}