package io.github.FMG9167.afterfall.entities.mutant;

import io.github.FMG9167.afterfall.Afterfall;
import io.github.FMG9167.afterfall.entities.AfterfallModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MutantRenderer extends MobEntityRenderer<MutantEntity, MutantModel<MutantEntity>> {
    private static final Identifier TEXTURE = new Identifier(Afterfall.MOD_ID, "textures/entity/mutant.png");

    public MutantRenderer(EntityRendererFactory.Context context) {
        super(context, new MutantModel<>(context.getPart(AfterfallModelLayers.MUTANT)), 0.6f);
    }

    @Override
    public Identifier getTexture(MutantEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(MutantEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f, 1f, 1f);

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
