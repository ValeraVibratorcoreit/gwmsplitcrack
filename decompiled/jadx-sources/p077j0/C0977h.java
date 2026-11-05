package p077j0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.altaysoft.t500_split.R;
import java.util.HashMap;

/* renamed from: j0.h */
/* loaded from: classes.dex */
public final class C0977h extends AbstractC0982m {

    /* renamed from: B */
    public static final String[] f4677B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A */
    public final int f4678A;

    public C0977h(int i) {
        this();
        this.f4678A = i;
    }

    /* renamed from: I */
    public static void m2543I(C0989t c0989t) {
        int visibility = c0989t.f4726b.getVisibility();
        HashMap hashMap = c0989t.f4725a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0989t.f4726b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: K */
    public static float m2544K(C0989t c0989t, float f2) {
        Float f3;
        return (c0989t == null || (f3 = (Float) c0989t.f4725a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0969E m2545L(C0989t c0989t, C0989t c0989t2) {
        C0969E c0969e = new C0969E();
        c0969e.f4648a = false;
        c0969e.f4649b = false;
        if (c0989t != null) {
            HashMap hashMap = c0989t.f4725a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                c0969e.f4650c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                c0969e.f4652e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (c0989t2 != null) {
                    HashMap hashMap2 = c0989t2.f4725a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        c0969e.f4651d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        c0969e.f4653f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (c0989t == null && c0989t2 != null) {
                            int i = c0969e.f4650c;
                            int i2 = c0969e.f4651d;
                            if (i == i2 && c0969e.f4652e == c0969e.f4653f) {
                                return c0969e;
                            }
                            if (i != i2) {
                                if (i == 0) {
                                    c0969e.f4649b = false;
                                    c0969e.f4648a = true;
                                } else if (i2 == 0) {
                                    c0969e.f4649b = true;
                                    c0969e.f4648a = true;
                                }
                            } else if (c0969e.f4653f == null) {
                                c0969e.f4649b = false;
                                c0969e.f4648a = true;
                            } else if (c0969e.f4652e == null) {
                                c0969e.f4649b = true;
                                c0969e.f4648a = true;
                            }
                        } else if (c0989t != null && c0969e.f4651d == 0) {
                            c0969e.f4649b = true;
                            c0969e.f4648a = true;
                        } else if (c0989t2 == null && c0969e.f4650c == 0) {
                            c0969e.f4649b = false;
                            c0969e.f4648a = true;
                        }
                        return c0969e;
                    }
                }
                c0969e.f4651d = -1;
                c0969e.f4653f = null;
                if (c0989t == null) {
                }
                if (c0989t != null) {
                }
                if (c0989t2 == null) {
                    c0969e.f4649b = false;
                    c0969e.f4648a = true;
                }
                return c0969e;
            }
        }
        c0969e.f4650c = -1;
        c0969e.f4652e = null;
        if (c0989t2 != null) {
        }
        c0969e.f4651d = -1;
        c0969e.f4653f = null;
        if (c0989t == null) {
        }
        if (c0989t != null) {
        }
        if (c0989t2 == null) {
        }
        return c0969e;
    }

    /* renamed from: J */
    public final ObjectAnimator m2546J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        AbstractC0991v.f4728a.mo2512Z(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC0991v.f4729b, f3);
        C0976g c0976g = new C0976g(view);
        ofFloat.addListener(c0976g);
        m2559o().m2553a(c0976g);
        return ofFloat;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: d */
    public final void mo2530d(C0989t c0989t) {
        m2543I(c0989t);
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: g */
    public final void mo2532g(C0989t c0989t) {
        m2543I(c0989t);
        View view = c0989t.f4726b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(AbstractC0991v.f4728a.mo2513v(view)) : Float.valueOf(0.0f);
        }
        c0989t.f4725a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (m2545L(m2558n(r3, false), m2560r(r3, false)).f4648a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    @Override // p077j0.AbstractC0982m
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo2540k(FrameLayout frameLayout, C0989t c0989t, C0989t c0989t2) {
        boolean z2;
        View view;
        int i;
        View view2;
        View view3;
        ViewGroup viewGroup;
        int i2;
        Bitmap bitmap;
        C0969E m2545L = m2545L(c0989t, c0989t2);
        if (!m2545L.f4648a || (m2545L.f4652e == null && m2545L.f4653f == null)) {
            return null;
        }
        boolean z3 = false;
        if (m2545L.f4649b) {
            if ((this.f4678A & 1) == 1 && c0989t2 != null) {
                View view4 = c0989t2.f4726b;
                if (c0989t == null) {
                    View view5 = (View) view4.getParent();
                }
                AbstractC0991v.f4728a.getClass();
                return m2546J(view4, m2544K(c0989t, 0.0f), 1.0f);
            }
            return null;
        }
        int i3 = m2545L.f4651d;
        if ((this.f4678A & 2) == 2 && c0989t != null) {
            View view6 = c0989t2 != null ? c0989t2.f4726b : null;
            View view7 = c0989t.f4726b;
            View view8 = (View) view7.getTag(R.id.save_overlay_view);
            if (view8 != null) {
                i = i3;
                z3 = true;
                view3 = null;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        z2 = false;
                        view = null;
                        if (z2) {
                            if (view7.getParent() == null) {
                                i = i3;
                                view3 = view;
                                view8 = view7;
                            } else if (view7.getParent() instanceof View) {
                                View view9 = (View) view7.getParent();
                                if (m2545L(m2560r(view9, true), m2558n(view9, true)).f4648a) {
                                    i = i3;
                                    view2 = view;
                                    int id = view9.getId();
                                    if (view9.getParent() == null && id != -1) {
                                        frameLayout.findViewById(id);
                                    }
                                    view8 = view6;
                                    view3 = view2;
                                    z3 = false;
                                } else {
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    C0965A c0965a = AbstractC0991v.f4728a;
                                    c0965a.mo2510d0(view7, matrix);
                                    c0965a.mo2511e0(frameLayout, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = Math.round(rectF.left);
                                    int round2 = Math.round(rectF.top);
                                    int round3 = Math.round(rectF.right);
                                    int round4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    boolean isAttachedToWindow = view7.isAttachedToWindow();
                                    boolean z4 = frameLayout != null && frameLayout.isAttachedToWindow();
                                    if (isAttachedToWindow) {
                                        view2 = view;
                                        viewGroup = null;
                                        i2 = 0;
                                    } else if (z4) {
                                        ViewGroup viewGroup2 = (ViewGroup) view7.getParent();
                                        int indexOfChild = viewGroup2.indexOfChild(view7);
                                        frameLayout.getOverlay().add(view7);
                                        viewGroup = viewGroup2;
                                        view2 = view;
                                        i2 = indexOfChild;
                                    } else {
                                        i = i3;
                                        view2 = view;
                                        bitmap = null;
                                        if (bitmap != null) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view8 = imageView;
                                        view3 = view2;
                                        z3 = false;
                                    }
                                    i = i3;
                                    int round5 = Math.round(rectF.width());
                                    int round6 = Math.round(rectF.height());
                                    if (round5 <= 0 || round6 <= 0) {
                                        bitmap = null;
                                    } else {
                                        float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                        int round7 = Math.round(round5 * min);
                                        int round8 = Math.round(round6 * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        Picture picture = new Picture();
                                        Canvas beginRecording = picture.beginRecording(round7, round8);
                                        beginRecording.concat(matrix);
                                        view7.draw(beginRecording);
                                        picture.endRecording();
                                        bitmap = AbstractC0988s.m2565a(picture);
                                    }
                                    if (!isAttachedToWindow) {
                                        frameLayout.getOverlay().remove(view7);
                                        viewGroup.addView(view7, i2);
                                    }
                                    if (bitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    view8 = imageView;
                                    view3 = view2;
                                    z3 = false;
                                }
                            }
                        }
                        i = i3;
                        view2 = view;
                        view8 = view6;
                        view3 = view2;
                        z3 = false;
                    }
                } else if (i3 == 4 || view7 == view6) {
                    view = view6;
                    z2 = false;
                    view6 = null;
                    if (z2) {
                    }
                    i = i3;
                    view2 = view;
                    view8 = view6;
                    view3 = view2;
                    z3 = false;
                }
                z2 = true;
                view6 = null;
                view = null;
                if (z2) {
                }
                i = i3;
                view2 = view;
                view8 = view6;
                view3 = view2;
                z3 = false;
            }
            if (view8 != null) {
                if (!z3) {
                    int[] iArr = (int[]) c0989t.f4725a.get("android:visibility:screenLocation");
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int[] iArr2 = new int[2];
                    frameLayout.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i4 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i5 - iArr2[1]) - view8.getTop());
                    frameLayout.getOverlay().add(view8);
                }
                C0965A c0965a2 = AbstractC0991v.f4728a;
                c0965a2.getClass();
                ObjectAnimator m2546J = m2546J(view8, m2544K(c0989t, 1.0f), 0.0f);
                if (m2546J == null) {
                    c0965a2.mo2512Z(view8, m2544K(c0989t2, 1.0f));
                }
                if (z3) {
                    return m2546J;
                }
                if (m2546J == null) {
                    frameLayout.getOverlay().remove(view8);
                    return m2546J;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                C0968D c0968d = new C0968D(this, frameLayout, view8, view7);
                m2546J.addListener(c0968d);
                m2546J.addPauseListener(c0968d);
                m2559o().m2553a(c0968d);
                return m2546J;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                AbstractC0991v.m2569b(view3, 0);
                C0965A c0965a3 = AbstractC0991v.f4728a;
                c0965a3.getClass();
                ObjectAnimator m2546J2 = m2546J(view3, m2544K(c0989t, 1.0f), 0.0f);
                if (m2546J2 == null) {
                    c0965a3.mo2512Z(view3, m2544K(c0989t2, 1.0f));
                }
                if (m2546J2 != null) {
                    C0967C c0967c = new C0967C(view3, i);
                    m2546J2.addListener(c0967c);
                    m2559o().m2553a(c0967c);
                } else {
                    AbstractC0991v.m2569b(view3, visibility);
                }
                return m2546J2;
            }
        }
        return null;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: q */
    public final String[] mo2541q() {
        return f4677B;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: s */
    public final boolean mo2547s(C0989t c0989t, C0989t c0989t2) {
        if (c0989t == null && c0989t2 == null) {
            return false;
        }
        if (c0989t != null && c0989t2 != null && c0989t2.f4725a.containsKey("android:visibility:visibility") != c0989t.f4725a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0969E m2545L = m2545L(c0989t, c0989t2);
        if (m2545L.f4648a) {
            return m2545L.f4650c == 0 || m2545L.f4651d == 0;
        }
        return false;
    }

    public C0977h() {
        this.f4678A = 3;
    }
}
