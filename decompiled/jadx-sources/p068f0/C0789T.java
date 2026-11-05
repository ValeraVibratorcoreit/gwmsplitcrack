package p068f0;

/* renamed from: f0.T */
/* loaded from: classes.dex */
public final class C0789T {

    /* renamed from: a */
    public int f3973a;

    /* renamed from: b */
    public int f3974b;

    /* renamed from: c */
    public int f3975c;

    /* renamed from: d */
    public int f3976d;

    /* renamed from: e */
    public int f3977e;

    /* renamed from: f */
    public boolean f3978f;

    /* renamed from: g */
    public boolean f3979g;

    /* renamed from: h */
    public boolean f3980h;

    /* renamed from: i */
    public boolean f3981i;

    /* renamed from: j */
    public boolean f3982j;

    /* renamed from: k */
    public boolean f3983k;

    /* renamed from: l */
    public int f3984l;

    /* renamed from: m */
    public long f3985m;

    /* renamed from: n */
    public int f3986n;

    /* renamed from: a */
    public final void m2264a(int i) {
        if ((this.f3976d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3976d));
    }

    /* renamed from: b */
    public final int m2265b() {
        return this.f3979g ? this.f3974b - this.f3975c : this.f3977e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3973a + ", mData=null, mItemCount=" + this.f3977e + ", mIsMeasuring=" + this.f3981i + ", mPreviousLayoutItemCount=" + this.f3974b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3975c + ", mStructureChanged=" + this.f3978f + ", mInPreLayout=" + this.f3979g + ", mRunSimpleAnimations=" + this.f3982j + ", mRunPredictiveAnimations=" + this.f3983k + '}';
    }
}
