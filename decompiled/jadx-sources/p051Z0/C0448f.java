package p051Z0;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: Z0.f */
/* loaded from: classes.dex */
public final class C0448f {

    /* renamed from: a */
    public String f1427a;

    /* renamed from: b */
    public int f1428b;

    /* renamed from: c */
    public View f1429c;

    /* renamed from: d */
    public TabLayout f1430d;

    /* renamed from: e */
    public C0450h f1431e;

    /* renamed from: a */
    public final void m1151a(String str) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(str)) {
            this.f1431e.setContentDescription(str);
        }
        this.f1427a = str;
        C0450h c0450h = this.f1431e;
        if (c0450h != null) {
            c0450h.m1155d();
        }
    }
}
