package com.altaysoft.t500_split;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import p001A0.RunnableC0024r;
import p062d0.ChoreographerFrameCallbackC0733f;
import p109u0.C1537g;

/* loaded from: classes.dex */
public final class MarqueeTextView extends TextView {

    /* renamed from: p */
    public static final /* synthetic */ int f2317p = 0;

    /* renamed from: f */
    public final Choreographer f2318f;

    /* renamed from: g */
    public final Choreographer.FrameCallback f2319g;

    /* renamed from: h */
    public CharSequence f2320h;

    /* renamed from: i */
    public float f2321i;

    /* renamed from: j */
    public float f2322j;

    /* renamed from: k */
    public boolean f2323k;

    /* renamed from: l */
    public boolean f2324l;

    /* renamed from: m */
    public long f2325m;

    /* renamed from: n */
    public long f2326n;

    /* renamed from: o */
    public final int f2327o;

    public MarqueeTextView(C1537g c1537g) {
        super(c1537g);
        this.f2318f = Choreographer.getInstance();
        this.f2319g = new ChoreographerFrameCallbackC0733f(1, this);
        this.f2320h = "";
        this.f2327o = getGravity();
        setSingleLine(true);
        setMaxLines(1);
        setEllipsize(null);
        setHorizontallyScrolling(true);
    }

    /* renamed from: a */
    public static void m1692a(MarqueeTextView marqueeTextView, long j2) {
        if (!marqueeTextView.f2323k || marqueeTextView.f2322j <= 2.0f || !marqueeTextView.isAttachedToWindow() || marqueeTextView.getVisibility() != 0) {
            marqueeTextView.f2323k = false;
            return;
        }
        boolean z2 = marqueeTextView.f2324l;
        Choreographer.FrameCallback frameCallback = marqueeTextView.f2319g;
        Choreographer choreographer = marqueeTextView.f2318f;
        if (z2) {
            if (SystemClock.uptimeMillis() < marqueeTextView.f2326n) {
                choreographer.postFrameCallback(frameCallback);
                return;
            }
            marqueeTextView.f2324l = false;
            marqueeTextView.f2325m = j2;
            choreographer.postFrameCallback(frameCallback);
            return;
        }
        if (marqueeTextView.f2325m == 0) {
            marqueeTextView.f2325m = j2;
        }
        float f2 = (j2 - marqueeTextView.f2325m) / 1.0E9f;
        marqueeTextView.f2325m = j2;
        if (f2 > 0.05f) {
            f2 = 0.016f;
        }
        float f3 = (f2 * 38.0f) + marqueeTextView.f2321i;
        marqueeTextView.f2321i = f3;
        float f4 = marqueeTextView.f2322j;
        if (f3 >= f4) {
            marqueeTextView.f2321i = f3 - f4;
        }
        marqueeTextView.invalidate();
        choreographer.postFrameCallback(frameCallback);
    }

    /* renamed from: b */
    public final void m1693b() {
        this.f2323k = false;
        this.f2324l = true;
        this.f2325m = 0L;
        this.f2318f.removeFrameCallback(this.f2319g);
    }

    /* renamed from: c */
    public final void m1694c() {
        if (!isAttachedToWindow() || getVisibility() != 0) {
            m1693b();
            return;
        }
        Layout layout = getLayout();
        int max = Math.max(0, (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight());
        float lineWidth = (layout == null || layout.getLineCount() <= 0) ? 0.0f : layout.getLineWidth(0);
        if (layout == null || max <= 0) {
            return;
        }
        float f2 = max;
        if (lineWidth <= 2.0f + f2) {
            this.f2322j = 0.0f;
            this.f2321i = 0.0f;
            int gravity = getGravity();
            int i = this.f2327o;
            if (gravity != i) {
                setGravity(i);
            }
            m1693b();
            invalidate();
            return;
        }
        if (getGravity() != 8388627) {
            setGravity(8388627);
        }
        float max2 = Math.max(40.0f * getResources().getDisplayMetrics().density, f2 * 0.28f) + lineWidth;
        this.f2322j = max2;
        if (this.f2321i >= max2) {
            this.f2321i = 0.0f;
        }
        if (!this.f2323k) {
            this.f2324l = true;
            this.f2326n = SystemClock.uptimeMillis() + 900;
            this.f2325m = 0L;
            this.f2323k = true;
            this.f2318f.postFrameCallback(this.f2319g);
        }
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        m1693b();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        float lineWidth = (layout == null || layout.getLineCount() <= 0) ? 0.0f : layout.getLineWidth(0);
        int max = Math.max(0, (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight());
        TextPaint paint = getPaint();
        paint.drawableState = getDrawableState();
        paint.setColor(getCurrentTextColor());
        if (layout != null) {
            float f2 = max;
            if (lineWidth > 2.0f + f2) {
                float max2 = Math.max(40.0f * getResources().getDisplayMetrics().density, f2 * 0.28f) + lineWidth;
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int extendedPaddingTop = getExtendedPaddingTop();
                int height = (getHeight() - getExtendedPaddingTop()) - getExtendedPaddingBottom();
                int height2 = layout.getHeight();
                int i = extendedPaddingTop + ((height2 <= 0 || height <= height2) ? 0 : (height - height2) / 2);
                canvas.save();
                canvas.clipRect(compoundPaddingLeft, 0, getWidth() - compoundPaddingRight, getHeight());
                canvas.translate(compoundPaddingLeft - this.f2321i, i);
                layout.draw(canvas);
                canvas.translate(max2, 0.0f);
                layout.draw(canvas);
                canvas.restore();
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        m1694c();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            m1693b();
        } else {
            post(new RunnableC0024r(21, this));
        }
    }

    public void setMarqueeText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean equals = charSequence.equals(this.f2320h);
        this.f2320h = charSequence;
        if (!equals) {
            this.f2321i = 0.0f;
            setText(charSequence);
        }
        post(new RunnableC0024r(21, this));
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2318f = Choreographer.getInstance();
        this.f2319g = new ChoreographerFrameCallbackC0733f(1, this);
        this.f2320h = "";
        this.f2327o = getGravity();
        setSingleLine(true);
        setMaxLines(1);
        setEllipsize(null);
        setHorizontallyScrolling(true);
    }
}
