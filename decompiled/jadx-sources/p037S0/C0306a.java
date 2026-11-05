package p037S0;

import android.R;
import android.content.res.ColorStateList;
import p033Q.AbstractC0268b;
import p082l.C1053C;
import p121y0.AbstractC1687o;

/* renamed from: S0.a */
/* loaded from: classes.dex */
public final class C0306a extends C1053C {

    /* renamed from: l */
    public static final int[][] f875l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j */
    public ColorStateList f876j;

    /* renamed from: k */
    public boolean f877k;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f876j == null) {
            int m4948s = AbstractC1687o.m4948s(this, com.altaysoft.t500_split.R.attr.colorControlActivated);
            int m4948s2 = AbstractC1687o.m4948s(this, com.altaysoft.t500_split.R.attr.colorOnSurface);
            int m4948s3 = AbstractC1687o.m4948s(this, com.altaysoft.t500_split.R.attr.colorSurface);
            this.f876j = new ColorStateList(f875l, new int[]{AbstractC1687o.m4909B(1.0f, m4948s3, m4948s), AbstractC1687o.m4909B(0.54f, m4948s3, m4948s2), AbstractC1687o.m4909B(0.38f, m4948s3, m4948s2), AbstractC1687o.m4909B(0.38f, m4948s3, m4948s2)});
        }
        return this.f876j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f877k && AbstractC0268b.m786a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f877k = z2;
        if (z2) {
            AbstractC0268b.m788c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0268b.m788c(this, null);
        }
    }
}
