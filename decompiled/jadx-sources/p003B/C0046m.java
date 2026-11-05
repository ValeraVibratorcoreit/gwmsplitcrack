package p003B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: B.m */
/* loaded from: classes.dex */
public final class C0046m {

    /* renamed from: a */
    public final ColorStateList f143a;

    /* renamed from: b */
    public final Configuration f144b;

    /* renamed from: c */
    public final int f145c;

    public C0046m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f143a = colorStateList;
        this.f144b = configuration;
        this.f145c = theme == null ? 0 : theme.hashCode();
    }
}
