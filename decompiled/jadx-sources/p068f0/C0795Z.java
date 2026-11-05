package p068f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.Z */
/* loaded from: classes.dex */
public final class C0795Z extends AbstractC0781K {

    /* renamed from: a */
    public boolean f4017a = false;

    /* renamed from: b */
    public final /* synthetic */ C0826x f4018b;

    public C0795Z(C0826x c0826x) {
        this.f4018b = c0826x;
    }

    @Override // p068f0.AbstractC0781K
    /* renamed from: a */
    public final void mo2075a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f4017a) {
            this.f4017a = false;
            this.f4018b.m2336h();
        }
    }

    @Override // p068f0.AbstractC0781K
    /* renamed from: b */
    public final void mo2076b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f4017a = true;
    }
}
