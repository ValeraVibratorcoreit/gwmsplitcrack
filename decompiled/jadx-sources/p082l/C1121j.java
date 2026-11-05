package p082l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.altaysoft.t500_split.R;
import p008D.AbstractC0070a;
import p079k.C1007b;

/* renamed from: l.j */
/* loaded from: classes.dex */
public final class C1121j extends C1151y implements InterfaceC1125l {

    /* renamed from: f */
    public final /* synthetic */ C1123k f5172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121j(C1123k c1123k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f5172f = c1123k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1099Z0.m2725a(this, getContentDescription());
        setOnTouchListener(new C1007b(this, this));
    }

    @Override // p082l.InterfaceC1125l
    /* renamed from: a */
    public final boolean mo1257a() {
        return false;
    }

    @Override // p082l.InterfaceC1125l
    /* renamed from: c */
    public final boolean mo1259c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f5172f.m2735l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0070a.m204f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
