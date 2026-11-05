package com.airbnb.lottie.utils;

import com.sun.jna.Function;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public class GammaEvaluator {
    private static float EOCF_sRGB(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float OECF_sRGB(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f2, int i, int i2) {
        if (i == i2 || f2 <= 0.0f) {
            return i;
        }
        if (f2 >= 1.0f) {
            return i2;
        }
        float f3 = ((i >> 24) & Function.USE_VARARGS) / 255.0f;
        float f4 = ((i >> 16) & Function.USE_VARARGS) / 255.0f;
        float f5 = ((i >> 8) & Function.USE_VARARGS) / 255.0f;
        float f6 = ((i2 >> 24) & Function.USE_VARARGS) / 255.0f;
        float f7 = ((i2 >> 16) & Function.USE_VARARGS) / 255.0f;
        float f8 = ((i2 >> 8) & Function.USE_VARARGS) / 255.0f;
        float EOCF_sRGB = EOCF_sRGB(f4);
        float EOCF_sRGB2 = EOCF_sRGB(f5);
        float EOCF_sRGB3 = EOCF_sRGB((i & Function.USE_VARARGS) / 255.0f);
        float EOCF_sRGB4 = EOCF_sRGB(f7);
        float EOCF_sRGB5 = EOCF_sRGB(f8);
        float EOCF_sRGB6 = EOCF_sRGB((i2 & Function.USE_VARARGS) / 255.0f);
        float m149c = AbstractC0062j.m149c(f6, f3, f2, f3);
        float m149c2 = AbstractC0062j.m149c(EOCF_sRGB4, EOCF_sRGB, f2, EOCF_sRGB);
        float m149c3 = AbstractC0062j.m149c(EOCF_sRGB5, EOCF_sRGB2, f2, EOCF_sRGB2);
        float m149c4 = AbstractC0062j.m149c(EOCF_sRGB6, EOCF_sRGB3, f2, EOCF_sRGB3);
        float OECF_sRGB = OECF_sRGB(m149c2) * 255.0f;
        float OECF_sRGB2 = OECF_sRGB(m149c3) * 255.0f;
        return Math.round(OECF_sRGB(m149c4) * 255.0f) | (Math.round(OECF_sRGB) << 16) | (Math.round(m149c * 255.0f) << 24) | (Math.round(OECF_sRGB2) << 8);
    }
}
