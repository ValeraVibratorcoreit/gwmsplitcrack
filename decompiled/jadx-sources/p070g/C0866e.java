package p070g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.altaysoft.t500_split.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0669j;
import java.lang.ref.WeakReference;
import p067f.AbstractC0770a;

/* renamed from: g.e */
/* loaded from: classes.dex */
public final class C0866e {

    /* renamed from: a */
    public final Context f4332a;

    /* renamed from: b */
    public final DialogInterfaceC0867f f4333b;

    /* renamed from: c */
    public final Window f4334c;

    /* renamed from: d */
    public CharSequence f4335d;

    /* renamed from: e */
    public AlertController$RecycleListView f4336e;

    /* renamed from: f */
    public View f4337f;

    /* renamed from: h */
    public Button f4339h;

    /* renamed from: i */
    public Button f4340i;

    /* renamed from: j */
    public Button f4341j;

    /* renamed from: k */
    public NestedScrollView f4342k;

    /* renamed from: l */
    public Drawable f4343l;

    /* renamed from: m */
    public ImageView f4344m;

    /* renamed from: n */
    public TextView f4345n;

    /* renamed from: o */
    public TextView f4346o;

    /* renamed from: p */
    public View f4347p;

    /* renamed from: q */
    public ListAdapter f4348q;

    /* renamed from: s */
    public final int f4350s;

    /* renamed from: t */
    public final int f4351t;

    /* renamed from: u */
    public final int f4352u;

    /* renamed from: v */
    public final int f4353v;

    /* renamed from: w */
    public final boolean f4354w;

    /* renamed from: x */
    public final HandlerC0864c f4355x;

    /* renamed from: g */
    public boolean f4338g = false;

    /* renamed from: r */
    public int f4349r = -1;

    /* renamed from: y */
    public final ViewOnClickListenerC0669j f4356y = new ViewOnClickListenerC0669j(1, this);

    public C0866e(Context context, DialogInterfaceC0867f dialogInterfaceC0867f, Window window) {
        this.f4332a = context;
        this.f4333b = dialogInterfaceC0867f;
        this.f4334c = window;
        HandlerC0864c handlerC0864c = new HandlerC0864c();
        handlerC0864c.f4331a = new WeakReference(dialogInterfaceC0867f);
        this.f4355x = handlerC0864c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0770a.f3898e, R.attr.alertDialogStyle, 0);
        this.f4350s = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f4351t = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f4352u = obtainStyledAttributes.getResourceId(7, 0);
        this.f4353v = obtainStyledAttributes.getResourceId(3, 0);
        this.f4354w = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0867f.m2399f().mo2421f(1);
    }

    /* renamed from: a */
    public static boolean m2396a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2396a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ViewGroup m2397b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
