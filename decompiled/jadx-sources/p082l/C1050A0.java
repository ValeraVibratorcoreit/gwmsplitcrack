package p082l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.jcraft.jsch.SftpATTRS;
import java.lang.reflect.Method;
import p010D1.AbstractC0088l;
import p033Q.AbstractC0278l;
import p067f.AbstractC0770a;
import p079k.InterfaceC1003C;

/* renamed from: l.A0 */
/* loaded from: classes.dex */
public class C1050A0 implements InterfaceC1003C {

    /* renamed from: F */
    public static final Method f4993F;

    /* renamed from: G */
    public static final Method f4994G;

    /* renamed from: A */
    public final Handler f4995A;

    /* renamed from: C */
    public Rect f4997C;

    /* renamed from: D */
    public boolean f4998D;

    /* renamed from: E */
    public final C1049A f4999E;

    /* renamed from: f */
    public final Context f5000f;

    /* renamed from: g */
    public ListAdapter f5001g;

    /* renamed from: h */
    public C1130n0 f5002h;

    /* renamed from: k */
    public int f5005k;

    /* renamed from: l */
    public int f5006l;

    /* renamed from: n */
    public boolean f5008n;

    /* renamed from: o */
    public boolean f5009o;

    /* renamed from: p */
    public boolean f5010p;

    /* renamed from: s */
    public C1150x0 f5013s;

    /* renamed from: t */
    public View f5014t;

    /* renamed from: u */
    public AdapterView.OnItemClickListener f5015u;

    /* renamed from: v */
    public AdapterView.OnItemSelectedListener f5016v;

    /* renamed from: i */
    public final int f5003i = -2;

    /* renamed from: j */
    public int f5004j = -2;

    /* renamed from: m */
    public final int f5007m = 1002;

    /* renamed from: q */
    public int f5011q = 0;

    /* renamed from: r */
    public final int f5012r = Integer.MAX_VALUE;

    /* renamed from: w */
    public final RunnableC1148w0 f5017w = new RunnableC1148w0(this, 1);

    /* renamed from: x */
    public final ViewOnTouchListenerC1154z0 f5018x = new ViewOnTouchListenerC1154z0(this);

    /* renamed from: y */
    public final C1152y0 f5019y = new C1152y0(this);

    /* renamed from: z */
    public final RunnableC1148w0 f5020z = new RunnableC1148w0(this, 0);

    /* renamed from: B */
    public final Rect f4996B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4993F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f4994G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C1050A0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f5000f = context;
        this.f4995A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3908o, i, 0);
        this.f5005k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f5006l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5008n = true;
        }
        obtainStyledAttributes.recycle();
        C1049A c1049a = new C1049A(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3912s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            AbstractC0278l.m807c(c1049a, obtainStyledAttributes2.getBoolean(2, false));
        }
        c1049a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0088l.m257D(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f4999E = c1049a;
        c1049a.setInputMethodMode(1);
    }

    /* renamed from: a */
    public final void m2645a(int i) {
        this.f5005k = i;
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: b */
    public final boolean mo2577b() {
        return this.f4999E.isShowing();
    }

    /* renamed from: d */
    public final int m2646d() {
        return this.f5005k;
    }

    @Override // p079k.InterfaceC1003C
    public final void dismiss() {
        C1049A c1049a = this.f4999E;
        c1049a.dismiss();
        c1049a.setContentView(null);
        this.f5002h = null;
        this.f4995A.removeCallbacks(this.f5017w);
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: f */
    public final void mo2578f() {
        int i;
        int paddingBottom;
        C1130n0 c1130n0;
        C1130n0 c1130n02 = this.f5002h;
        C1049A c1049a = this.f4999E;
        Context context = this.f5000f;
        if (c1130n02 == null) {
            C1130n0 mo2652p = mo2652p(context, !this.f4998D);
            this.f5002h = mo2652p;
            mo2652p.setAdapter(this.f5001g);
            this.f5002h.setOnItemClickListener(this.f5015u);
            this.f5002h.setFocusable(true);
            this.f5002h.setFocusableInTouchMode(true);
            this.f5002h.setOnItemSelectedListener(new C1142t0(0, this));
            this.f5002h.setOnScrollListener(this.f5019y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f5016v;
            if (onItemSelectedListener != null) {
                this.f5002h.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1049a.setContentView(this.f5002h);
        }
        Drawable background = c1049a.getBackground();
        Rect rect = this.f4996B;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f5008n) {
                this.f5006l = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int m2769a = AbstractC1144u0.m2769a(c1049a, this.f5014t, this.f5006l, c1049a.getInputMethodMode() == 2);
        int i3 = this.f5003i;
        if (i3 == -1) {
            paddingBottom = m2769a + i;
        } else {
            int i4 = this.f5004j;
            int m2742a = this.f5002h.m2742a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED), m2769a);
            paddingBottom = m2742a + (m2742a > 0 ? this.f5002h.getPaddingBottom() + this.f5002h.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f4999E.getInputMethodMode() == 2;
        AbstractC0278l.m808d(c1049a, this.f5007m);
        if (c1049a.isShowing()) {
            if (this.f5014t.isAttachedToWindow()) {
                int i5 = this.f5004j;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f5014t.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c1049a.setWidth(this.f5004j == -1 ? -1 : 0);
                        c1049a.setHeight(0);
                    } else {
                        c1049a.setWidth(this.f5004j == -1 ? -1 : 0);
                        c1049a.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c1049a.setOutsideTouchable(true);
                View view = this.f5014t;
                int i6 = this.f5005k;
                int i7 = this.f5006l;
                if (i5 < 0) {
                    i5 = -1;
                }
                c1049a.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f5004j;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f5014t.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c1049a.setWidth(i8);
        c1049a.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f4993F;
            if (method != null) {
                try {
                    method.invoke(c1049a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1146v0.m2771b(c1049a, true);
        }
        c1049a.setOutsideTouchable(true);
        c1049a.setTouchInterceptor(this.f5018x);
        if (this.f5010p) {
            AbstractC0278l.m807c(c1049a, this.f5009o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f4994G;
            if (method2 != null) {
                try {
                    method2.invoke(c1049a, this.f4997C);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC1146v0.m2770a(c1049a, this.f4997C);
        }
        c1049a.showAsDropDown(this.f5014t, this.f5005k, this.f5006l, this.f5011q);
        this.f5002h.setSelection(-1);
        if ((!this.f4998D || this.f5002h.isInTouchMode()) && (c1130n0 = this.f5002h) != null) {
            c1130n0.setListSelectionHidden(true);
            c1130n0.requestLayout();
        }
        if (this.f4998D) {
            return;
        }
        this.f4995A.post(this.f5020z);
    }

    /* renamed from: g */
    public final int m2647g() {
        if (this.f5008n) {
            return this.f5006l;
        }
        return 0;
    }

    /* renamed from: h */
    public final Drawable m2648h() {
        return this.f4999E.getBackground();
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: j */
    public final C1130n0 mo2579j() {
        return this.f5002h;
    }

    /* renamed from: l */
    public final void m2649l(Drawable drawable) {
        this.f4999E.setBackgroundDrawable(drawable);
    }

    /* renamed from: m */
    public final void m2650m(int i) {
        this.f5006l = i;
        this.f5008n = true;
    }

    /* renamed from: n */
    public void mo2651n(ListAdapter listAdapter) {
        C1150x0 c1150x0 = this.f5013s;
        if (c1150x0 == null) {
            this.f5013s = new C1150x0(this);
        } else {
            ListAdapter listAdapter2 = this.f5001g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1150x0);
            }
        }
        this.f5001g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5013s);
        }
        C1130n0 c1130n0 = this.f5002h;
        if (c1130n0 != null) {
            c1130n0.setAdapter(this.f5001g);
        }
    }

    /* renamed from: p */
    public C1130n0 mo2652p(Context context, boolean z2) {
        return new C1130n0(context, z2);
    }

    /* renamed from: q */
    public final void m2653q(int i) {
        Drawable background = this.f4999E.getBackground();
        if (background == null) {
            this.f5004j = i;
            return;
        }
        Rect rect = this.f4996B;
        background.getPadding(rect);
        this.f5004j = rect.left + rect.right + i;
    }
}
