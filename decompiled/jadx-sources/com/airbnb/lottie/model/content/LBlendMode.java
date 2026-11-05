package com.airbnb.lottie.model.content;

import p006C.EnumC0053a;

/* loaded from: classes.dex */
public enum LBlendMode {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public EnumC0053a toNativeBlendMode() {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return EnumC0053a.f195c;
        }
        if (ordinal == 2) {
            return EnumC0053a.f196d;
        }
        if (ordinal == 3) {
            return EnumC0053a.f197e;
        }
        if (ordinal == 4) {
            return EnumC0053a.f198f;
        }
        if (ordinal == 5) {
            return EnumC0053a.f199g;
        }
        if (ordinal != 16) {
            return null;
        }
        return EnumC0053a.f194b;
    }
}
