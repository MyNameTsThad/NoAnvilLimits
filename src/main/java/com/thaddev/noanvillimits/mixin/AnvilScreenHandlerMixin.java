package com.thaddev.iwant2tryhardtweaks.mixin;

import net.minecraft.SharedConstants;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilScreenHandler.class)
public abstract class AnvilScreenHandlerMixin {
    // :(
//    @Inject(method = "sanitize", at = @At("HEAD"), cancellable = true)
//    private static void sanitize(String text, CallbackInfoReturnable<String> cir) {
//        String string = SharedConstants.stripInvalidChars(text);
//        if (string.length() <= 32767) {
//            cir.setReturnValue(string);
//            return;
//        }
//        cir.setReturnValue(null);
//    }
}
