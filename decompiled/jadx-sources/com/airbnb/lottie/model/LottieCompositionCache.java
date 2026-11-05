package com.airbnb.lottie.model;

import com.airbnb.lottie.LottieComposition;
import p091o.C1196f;

/* loaded from: classes.dex */
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final C1196f cache = new C1196f(20);

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.m2863c(-1);
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.cache.m2861a(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.cache.m2862b(str, lottieComposition);
    }

    public void resize(int i) {
        C1196f c1196f = this.cache;
        if (i <= 0) {
            c1196f.getClass();
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (c1196f) {
            c1196f.f5397c = i;
        }
        c1196f.m2863c(i);
    }
}
