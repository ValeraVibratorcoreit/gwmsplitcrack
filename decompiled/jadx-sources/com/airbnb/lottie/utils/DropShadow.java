package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.sun.jna.Function;

/* loaded from: classes.dex */
public class DropShadow {
    private int color;

    /* renamed from: dx */
    private float f2255dx;

    /* renamed from: dy */
    private float f2256dy;
    private float radius;
    private float[] vecs;

    public DropShadow() {
        this.radius = 0.0f;
        this.f2255dx = 0.0f;
        this.f2256dy = 0.0f;
        this.color = 0;
    }

    public void applyTo(Paint paint) {
        if (Color.alpha(this.color) > 0) {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.f2255dx, this.f2256dy, this.color);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void applyWithAlpha(int i, Paint paint) {
        int mixOpacities = Utils.mixOpacities(Color.alpha(this.color), MiscUtils.clamp(i, 0, Function.USE_VARARGS));
        if (mixOpacities <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.f2255dx, this.f2256dy, Color.argb(mixOpacities, Color.red(this.color), Color.green(this.color), Color.blue(this.color)));
        }
    }

    public int getColor() {
        return this.color;
    }

    public float getDx() {
        return this.f2255dx;
    }

    public float getDy() {
        return this.f2256dy;
    }

    public float getRadius() {
        return this.radius;
    }

    public void multiplyOpacity(int i) {
        this.color = Color.argb(Math.round((MiscUtils.clamp(i, 0, Function.USE_VARARGS) * Color.alpha(this.color)) / 255.0f), Color.red(this.color), Color.green(this.color), Color.blue(this.color));
    }

    public boolean sameAs(DropShadow dropShadow) {
        return this.radius == dropShadow.radius && this.f2255dx == dropShadow.f2255dx && this.f2256dy == dropShadow.f2256dy && this.color == dropShadow.color;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setDx(float f2) {
        this.f2255dx = f2;
    }

    public void setDy(float f2) {
        this.f2256dy = f2;
    }

    public void setRadius(float f2) {
        this.radius = f2;
    }

    public void transformBy(Matrix matrix) {
        if (this.vecs == null) {
            this.vecs = new float[2];
        }
        float[] fArr = this.vecs;
        fArr[0] = this.f2255dx;
        fArr[1] = this.f2256dy;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.vecs;
        this.f2255dx = fArr2[0];
        this.f2256dy = fArr2[1];
        this.radius = matrix.mapRadius(this.radius);
    }

    public void applyTo(OffscreenLayer.ComposeOp composeOp) {
        if (Color.alpha(this.color) > 0) {
            composeOp.shadow = this;
        } else {
            composeOp.shadow = null;
        }
    }

    public void applyWithAlpha(int i, OffscreenLayer.ComposeOp composeOp) {
        DropShadow dropShadow = new DropShadow(this);
        composeOp.shadow = dropShadow;
        dropShadow.multiplyOpacity(i);
    }

    public DropShadow(float f2, float f3, float f4, int i) {
        this.radius = f2;
        this.f2255dx = f3;
        this.f2256dy = f4;
        this.color = i;
        this.vecs = null;
    }

    public DropShadow(DropShadow dropShadow) {
        this.radius = 0.0f;
        this.f2255dx = 0.0f;
        this.f2256dy = 0.0f;
        this.color = 0;
        this.radius = dropShadow.radius;
        this.f2255dx = dropShadow.f2255dx;
        this.f2256dy = dropShadow.f2256dy;
        this.color = dropShadow.color;
        this.vecs = null;
    }
}
