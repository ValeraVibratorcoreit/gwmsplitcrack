package p017H0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p001A0.RunnableC0024r;
import p022K.AbstractC0169Q;
import p117x.AbstractC1636a;

/* renamed from: H0.h */
/* loaded from: classes.dex */
public final class C0129h {

    /* renamed from: a */
    public final /* synthetic */ int f396a;

    /* renamed from: b */
    public int f397b;

    /* renamed from: c */
    public boolean f398c;

    /* renamed from: d */
    public final Runnable f399d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC1636a f400e;

    public C0129h(SideSheetBehavior sideSheetBehavior) {
        this.f396a = 1;
        this.f400e = sideSheetBehavior;
        this.f399d = new RunnableC0024r(4, this);
    }

    /* renamed from: a */
    public final void m385a(int i) {
        Runnable runnable = this.f399d;
        AbstractC1636a abstractC1636a = this.f400e;
        switch (this.f396a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC1636a;
                WeakReference weakReference = bottomSheetBehavior.f3384U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f397b = i;
                    if (!this.f398c) {
                        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                        ((View) bottomSheetBehavior.f3384U.get()).postOnAnimation((RunnableC0020n) runnable);
                        this.f398c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC1636a;
                WeakReference weakReference2 = sideSheetBehavior.f3591p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f397b = i;
                    if (!this.f398c) {
                        WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                        ((View) sideSheetBehavior.f3591p.get()).postOnAnimation((RunnableC0024r) runnable);
                        this.f398c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C0129h(BottomSheetBehavior bottomSheetBehavior) {
        this.f396a = 0;
        this.f400e = bottomSheetBehavior;
        this.f399d = new RunnableC0020n(1, this);
    }
}
