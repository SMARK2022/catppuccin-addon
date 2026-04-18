package me.pindour.catppuccin.mixin.meteorclient;

import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.renderer.Scissor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import java.util.Stack;

@Mixin(value = GuiRenderer.class, remap = false)
public interface GuiRendererAccessor {
    @Accessor("scissorStack")
    Stack<Scissor> catppuccin$getScissorStack();
}
