package p046X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.altaysoft.t500_split.R;
import p003B.C0043j;
import p010D1.AbstractC0088l;
import p014G.C0102c;

/* renamed from: X.f */
/* loaded from: classes.dex */
public final class C0407f extends AbstractC0408g {

    /* renamed from: c */
    public final boolean f1280c;

    /* renamed from: d */
    public boolean f1281d;

    /* renamed from: e */
    public C0043j f1282e;

    public C0407f(C0401b0 c0401b0, C0102c c0102c, boolean z2) {
        super(c0401b0, c0102c);
        this.f1280c = z2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:59|(3:73|74|(4:76|65|27|28))|61|62|(4:64|65|27|28)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ed, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ee, code lost:
    
        if (r0 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f0, code lost:
    
        r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        if (r9 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f6, code lost:
    
        r9 = new p003B.C0043j(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fd, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0043j m1083k(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        C0043j c0043j;
        C0043j c0043j2;
        if (this.f1281d) {
            return this.f1282e;
        }
        C0401b0 c0401b0 = (C0401b0) this.f1283a;
        boolean z2 = c0401b0.f1263a == 2;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0401b0.f1265c;
        C0420s c0420s = abstractComponentCallbacksC0423v.f1345M;
        int i2 = c0420s == null ? 0 : c0420s.f1325f;
        if (!this.f1280c) {
            if (z2) {
                if (c0420s != null) {
                    i = c0420s.f1321b;
                    abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0423v.f1341I;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    c0043j2 = null;
                    this.f1282e = c0043j2;
                    this.f1281d = true;
                    return c0043j2;
                }
                i = 0;
                abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0423v.f1341I;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                c0043j2 = null;
                this.f1282e = c0043j2;
                this.f1281d = true;
                return c0043j2;
            }
            if (c0420s != null) {
                i = c0420s.f1322c;
                abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0423v.f1341I;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                c0043j2 = null;
                this.f1282e = c0043j2;
                this.f1281d = true;
                return c0043j2;
            }
            i = 0;
            abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0423v.f1341I;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            c0043j2 = null;
            this.f1282e = c0043j2;
            this.f1281d = true;
            return c0043j2;
        }
        if (!z2) {
            if (c0420s != null) {
                i = c0420s.f1324e;
                abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0423v.f1341I;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                c0043j2 = null;
                this.f1282e = c0043j2;
                this.f1281d = true;
                return c0043j2;
            }
            i = 0;
            abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0423v.f1341I;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            c0043j2 = null;
            this.f1282e = c0043j2;
            this.f1281d = true;
            return c0043j2;
        }
        if (c0420s != null) {
            i = c0420s.f1323d;
            abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0423v.f1341I;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0423v.f1341I.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? AbstractC0088l.m280r0(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0088l.m280r0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? AbstractC0088l.m280r0(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0088l.m280r0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                    if (equals) {
                        try {
                            loadAnimation = AnimationUtils.loadAnimation(context, i);
                        } catch (Resources.NotFoundException e2) {
                            throw e2;
                        } catch (RuntimeException unused) {
                        }
                        if (loadAnimation != null) {
                            c0043j = new C0043j(loadAnimation);
                            c0043j2 = c0043j;
                            this.f1282e = c0043j2;
                            this.f1281d = true;
                            return c0043j2;
                        }
                    }
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (loadAnimator != null) {
                        c0043j = new C0043j(loadAnimator);
                        c0043j2 = c0043j;
                        this.f1282e = c0043j2;
                        this.f1281d = true;
                        return c0043j2;
                    }
                }
            }
            c0043j2 = null;
            this.f1282e = c0043j2;
            this.f1281d = true;
            return c0043j2;
        }
        i = 0;
        abstractComponentCallbacksC0423v.m1121M(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0423v.f1341I;
        if (viewGroup != null) {
            abstractComponentCallbacksC0423v.f1341I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? AbstractC0088l.m280r0(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0088l.m280r0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? AbstractC0088l.m280r0(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0088l.m280r0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        c0043j2 = null;
        this.f1282e = c0043j2;
        this.f1281d = true;
        return c0043j2;
    }
}
