package com.thaddev.iwant2tryhardtweaks.mixin;

import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(AnvilScreen.class)
public abstract class AnvilScreenMixin {
    //le funny failed :(
//    @ModifyArg(method = "setup", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/widget/TextFieldWidget;setMaxLength(I)V"), index = 0)
//    private int setMaxLength(int maxLength) {
//        return 32767;
//    }
}
