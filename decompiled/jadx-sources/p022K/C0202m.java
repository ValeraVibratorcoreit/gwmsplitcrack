package p022K;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: K.m */
/* loaded from: classes.dex */
public final class C0202m {

    /* renamed from: a */
    public ViewParent f543a;

    /* renamed from: b */
    public ViewParent f544b;

    /* renamed from: c */
    public final ViewGroup f545c;

    /* renamed from: d */
    public boolean f546d;

    /* renamed from: e */
    public int[] f547e;

    public C0202m(ViewGroup viewGroup) {
        this.f545c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m633a(float f2, float f3, boolean z2) {
        ViewParent m637e;
        if (!this.f546d || (m637e = m637e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0173V.m513a(m637e, this.f545c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + m637e + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m634b(float f2, float f3) {
        ViewParent m637e;
        if (!this.f546d || (m637e = m637e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0173V.m514b(m637e, this.f545c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + m637e + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m635c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m637e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f546d || (m637e = m637e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f545c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f547e == null) {
                this.f547e = new int[2];
            }
            iArr3 = this.f547e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (m637e instanceof InterfaceC0204n) {
            ((InterfaceC0204n) m637e).mo644c(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                AbstractC0173V.m515c(m637e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + m637e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean m636d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m637e;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f546d || (m637e = m637e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f545c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f547e == null) {
                this.f547e = new int[2];
            }
            int[] iArr4 = this.f547e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (m637e instanceof InterfaceC0206o) {
            ((InterfaceC0206o) m637e).mo648d(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (m637e instanceof InterfaceC0204n) {
                ((InterfaceC0204n) m637e).mo645e(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    AbstractC0173V.m516d(m637e, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m637e + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: e */
    public final ViewParent m637e(int i) {
        if (i == 0) {
            return this.f543a;
        }
        if (i != 1) {
            return null;
        }
        return this.f544b;
    }

    /* renamed from: f */
    public final boolean m638f(int i) {
        return m637e(i) != null;
    }

    /* renamed from: g */
    public final boolean m639g(int i, int i2) {
        boolean m518f;
        if (m638f(i2)) {
            return true;
        }
        if (this.f546d) {
            ViewGroup viewGroup = this.f545c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0204n;
                if (z2) {
                    m518f = ((InterfaceC0204n) parent).mo646f(view, viewGroup, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            m518f = AbstractC0173V.m518f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    m518f = false;
                }
                if (m518f) {
                    if (i2 == 0) {
                        this.f543a = parent;
                    } else if (i2 == 1) {
                        this.f544b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0204n) parent).mo642a(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            AbstractC0173V.m517e(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m640h(int i) {
        ViewParent m637e = m637e(i);
        if (m637e != null) {
            boolean z2 = m637e instanceof InterfaceC0204n;
            ViewGroup viewGroup = this.f545c;
            if (z2) {
                ((InterfaceC0204n) m637e).mo643b(viewGroup, i);
            } else if (i == 0) {
                try {
                    AbstractC0173V.m519g(m637e, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m637e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.f543a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f544b = null;
            }
        }
    }
}
