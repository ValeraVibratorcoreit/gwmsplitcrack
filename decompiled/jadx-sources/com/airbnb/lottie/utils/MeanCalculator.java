package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public class MeanCalculator {

    /* renamed from: n */
    private int f2257n;
    private float sum;

    public void add(float f2) {
        float f3 = this.sum + f2;
        this.sum = f3;
        int i = this.f2257n + 1;
        this.f2257n = i;
        if (i == Integer.MAX_VALUE) {
            this.sum = f3 / 2.0f;
            this.f2257n = i / 2;
        }
    }

    public float getMean() {
        int i = this.f2257n;
        if (i == 0) {
            return 0.0f;
        }
        return this.sum / i;
    }
}
