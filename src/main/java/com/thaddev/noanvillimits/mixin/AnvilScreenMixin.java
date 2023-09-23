package com.thaddev.noanvillimits.mixin;

import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(AnvilScreen.class)
public abstract class AnvilScreenMixin {
    @ModifyArg(method = "setup", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/widget/TextFieldWidget;setMaxLength(I)V"), index = 0)
    private int setMaxLength(int maxLength) {
        return 32767;
    }
}
