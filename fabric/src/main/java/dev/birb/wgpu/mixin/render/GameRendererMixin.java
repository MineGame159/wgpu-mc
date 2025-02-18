package dev.birb.wgpu.mixin.render;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.resource.ResourceFactory;
import net.minecraft.resource.ResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    /**
     * @author wgpu-mc
     * @reason do no such thing
     */
    @Overwrite
    public void preloadShaders(ResourceFactory factory) {

    }

    /**
     * @author wgpu-mc
     * @reason do no such thing
     */
    @Overwrite
    public void reload(ResourceManager manager) {
    }

    /**
     * @author wgpu-mc
     * @reason don't
     */
    @Overwrite
    public void renderWorld(float tickDelta, long limitTime, MatrixStack matrices) {

    }

}
