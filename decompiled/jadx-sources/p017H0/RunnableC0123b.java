package p017H0;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000A.AbstractC0000a;
import p109u0.C1474D;
import p109u0.C1477E0;
import p109u0.C1491L0;
import p109u0.C1506T0;
import p109u0.C1568q0;
import p109u0.C1574t;
import p109u0.C1576u;
import p109u0.C1583x0;

/* renamed from: H0.b */
/* loaded from: classes.dex */
public final class RunnableC0123b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f380a;

    /* renamed from: b */
    public int f381b;

    /* renamed from: c */
    public final /* synthetic */ Object f382c;

    /* renamed from: d */
    public final /* synthetic */ Object f383d;

    public /* synthetic */ RunnableC0123b(Object obj, int i, Object obj2) {
        this.f380a = i;
        this.f383d = obj;
        this.f382c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        Drawable drawable;
        ImageView imageView2;
        Drawable drawable2;
        ImageView imageView3;
        Drawable drawable3;
        ImageView imageView4;
        Drawable drawable4;
        ImageView imageView5;
        Drawable drawable5;
        ImageView imageView6;
        Drawable drawable6;
        ImageView imageView7;
        Drawable drawable7;
        switch (this.f380a) {
            case 0:
                ((BottomSheetBehavior) this.f383d).m2034E(this.f381b, (View) this.f382c, false);
                break;
            case 1:
                ((TextView) this.f382c).setTypeface((Typeface) this.f383d, this.f381b);
                break;
            case 2:
                C1576u c1576u = (C1576u) this.f383d;
                if (c1576u.m4605z1() && (imageView = c1576u.f8795o) != null && c1576u.f8703C1 != null) {
                    C1574t c1574t = (C1574t) this.f382c;
                    int i = c1574t.f8687b;
                    if (i != 0) {
                        drawable = AbstractC0000a.m1b(c1576u.f8759c, i);
                    } else if (imageView.getDrawable() != null) {
                        drawable = c1576u.f8795o.getDrawable();
                    } else {
                        if (c1574t.f8688c != null) {
                            int i2 = this.f381b;
                            this.f381b = i2 + 1;
                            if (i2 < 30) {
                                c1576u.f8795o.postDelayed(this, 50L);
                                break;
                            }
                        }
                        drawable = null;
                    }
                    if (drawable != null) {
                        c1576u.f8795o.setImageDrawable(null);
                        c1576u.f8703C1.m4163e(drawable);
                        c1576u.f8795o.setBackground(c1576u.f8703C1);
                        c1576u.m4602y1();
                        break;
                    }
                }
                break;
            case 3:
                C1474D c1474d = (C1474D) this.f383d;
                if (c1474d.m3526G0() && (imageView2 = c1474d.f7272o) != null && c1474d.f7244b1 != null) {
                    C1574t c1574t2 = (C1574t) this.f382c;
                    int i3 = c1574t2.f8687b;
                    if (i3 != 0) {
                        drawable2 = AbstractC0000a.m1b(c1474d.f7245c, i3);
                    } else if (imageView2.getDrawable() != null) {
                        drawable2 = c1474d.f7272o.getDrawable();
                    } else {
                        if (c1574t2.f8688c != null) {
                            int i4 = this.f381b;
                            this.f381b = i4 + 1;
                            if (i4 < 30) {
                                c1474d.f7272o.postDelayed(this, 50L);
                                break;
                            }
                        }
                        drawable2 = null;
                    }
                    if (drawable2 != null) {
                        c1474d.f7272o.setImageDrawable(null);
                        c1474d.f7244b1.m4163e(drawable2);
                        c1474d.f7272o.setBackground(c1474d.f7244b1);
                        c1474d.m3524F0();
                        break;
                    }
                }
                break;
            case 4:
                C1568q0 c1568q0 = (C1568q0) this.f383d;
                if (c1568q0.m4448z1() && (imageView3 = c1568q0.f8636o) != null && c1568q0.f8644q1 != null) {
                    C1574t c1574t3 = (C1574t) this.f382c;
                    int i5 = c1574t3.f8687b;
                    if (i5 != 0) {
                        drawable3 = AbstractC0000a.m1b(c1568q0.f8600c, i5);
                    } else if (imageView3.getDrawable() != null) {
                        drawable3 = c1568q0.f8636o.getDrawable();
                    } else {
                        if (c1574t3.f8688c != null) {
                            int i6 = this.f381b;
                            this.f381b = i6 + 1;
                            if (i6 < 30) {
                                c1568q0.f8636o.postDelayed(this, 50L);
                                break;
                            }
                        }
                        drawable3 = null;
                    }
                    if (drawable3 != null) {
                        c1568q0.f8636o.setImageDrawable(null);
                        c1568q0.f8644q1.m4163e(drawable3);
                        c1568q0.f8636o.setBackground(c1568q0.f8644q1);
                        c1568q0.m4445y1();
                        break;
                    }
                }
                break;
            case 5:
                C1583x0 c1583x0 = (C1583x0) this.f383d;
                if (c1583x0.m4738z1() && (imageView4 = c1583x0.f8941o) != null && c1583x0.f8943o1 != null) {
                    C1574t c1574t4 = (C1574t) this.f382c;
                    int i7 = c1574t4.f8687b;
                    if (i7 != 0) {
                        drawable4 = AbstractC0000a.m1b(c1583x0.f8905c, i7);
                    } else if (imageView4.getDrawable() != null) {
                        drawable4 = c1583x0.f8941o.getDrawable();
                    } else {
                        if (c1574t4.f8688c != null) {
                            int i8 = this.f381b;
                            this.f381b = i8 + 1;
                            if (i8 < 30) {
                                c1583x0.f8941o.postDelayed(this, 50L);
                                break;
                            }
                        }
                        drawable4 = null;
                    }
                    if (drawable4 != null) {
                        c1583x0.f8941o.setImageDrawable(null);
                        c1583x0.f8943o1.m4163e(drawable4);
                        c1583x0.f8941o.setBackground(c1583x0.f8943o1);
                        c1583x0.m4735y1();
                        break;
                    }
                }
                break;
            case 6:
                C1477E0 c1477e0 = (C1477E0) this.f383d;
                if (c1477e0.m3613B1() && (imageView5 = c1477e0.f7397o) != null && c1477e0.f7399o1 != null) {
                    C1574t c1574t5 = (C1574t) this.f382c;
                    int i9 = c1574t5.f8687b;
                    if (i9 != 0) {
                        drawable5 = AbstractC0000a.m1b(c1477e0.f7361c, i9);
                    } else if (imageView5.getDrawable() != null) {
                        drawable5 = c1477e0.f7397o.getDrawable();
                    } else {
                        if (c1574t5.f8688c != null) {
                            int i10 = this.f381b;
                            this.f381b = i10 + 1;
                            if (i10 < 30) {
                                c1477e0.f7397o.postDelayed(this, 50L);
                                break;
                            }
                        }
                        drawable5 = null;
                    }
                    if (drawable5 != null) {
                        c1477e0.f7397o.setImageDrawable(null);
                        c1477e0.f7399o1.m4163e(drawable5);
                        c1477e0.f7397o.setBackground(c1477e0.f7399o1);
                        c1477e0.m3610A1();
                        break;
                    }
                }
                break;
            case 7:
                C1491L0 c1491l0 = (C1491L0) this.f383d;
                if (c1491l0.m3779B1() && (imageView6 = c1491l0.f7624o) != null && c1491l0.f7626o1 != null) {
                    C1574t c1574t6 = (C1574t) this.f382c;
                    int i11 = c1574t6.f8687b;
                    if (i11 != 0) {
                        drawable6 = AbstractC0000a.m1b(c1491l0.f7588c, i11);
                    } else if (imageView6.getDrawable() != null) {
                        drawable6 = c1491l0.f7624o.getDrawable();
                    } else {
                        if (c1574t6.f8688c != null) {
                            int i12 = this.f381b;
                            this.f381b = i12 + 1;
                            if (i12 < 30) {
                                c1491l0.f7624o.postDelayed(this, 50L);
                                break;
                            }
                        }
                        drawable6 = null;
                    }
                    if (drawable6 != null) {
                        c1491l0.f7624o.setImageDrawable(null);
                        c1491l0.f7626o1.m4163e(drawable6);
                        c1491l0.f7624o.setBackground(c1491l0.f7626o1);
                        c1491l0.m3776A1();
                        break;
                    }
                }
                break;
            default:
                C1506T0 c1506t0 = (C1506T0) this.f383d;
                if (c1506t0.m4034t1() && (imageView7 = c1506t0.f7857o) != null && c1506t0.f7843i1 != null) {
                    C1574t c1574t7 = (C1574t) this.f382c;
                    int i13 = c1574t7.f8687b;
                    if (i13 != 0) {
                        drawable7 = AbstractC0000a.m1b(c1506t0.f7823c, i13);
                    } else if (imageView7.getDrawable() != null) {
                        drawable7 = c1506t0.f7857o.getDrawable();
                    } else {
                        if (c1574t7.f8688c != null) {
                            int i14 = this.f381b;
                            this.f381b = i14 + 1;
                            if (i14 < 30) {
                                c1506t0.f7857o.postDelayed(this, 50L);
                                break;
                            }
                        }
                        drawable7 = null;
                    }
                    if (drawable7 != null) {
                        c1506t0.f7857o.setImageDrawable(null);
                        c1506t0.f7843i1.m4163e(drawable7);
                        c1506t0.f7857o.setBackground(c1506t0.f7843i1);
                        c1506t0.m4031s1();
                        break;
                    }
                }
                break;
        }
    }

    public RunnableC0123b(TextView textView, Typeface typeface, int i) {
        this.f380a = 1;
        this.f382c = textView;
        this.f383d = typeface;
        this.f381b = i;
    }

    public RunnableC0123b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f380a = 0;
        this.f383d = bottomSheetBehavior;
        this.f382c = view;
        this.f381b = i;
    }
}
