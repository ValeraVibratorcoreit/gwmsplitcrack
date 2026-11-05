package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p006C.AbstractC0062j;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;
import p022K.C0221v0;
import p044W.AbstractC0350a;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0381I;
import p046X.C0387O;
import p046X.C0394W;
import p046X.C0398a;
import p046X.C0427z;
import p070g.AbstractActivityC0870i;
import p107t1.AbstractC1461d;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f */
    public final ArrayList f1952f;

    /* renamed from: g */
    public final ArrayList f1953g;

    /* renamed from: h */
    public View.OnApplyWindowInsetsListener f1954h;

    /* renamed from: i */
    public boolean f1955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        AbstractC1461d.m3494e("context", context);
        this.f1952f = new ArrayList();
        this.f1953g = new ArrayList();
        this.f1955i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0350a.f1002b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* renamed from: a */
    public final void m1357a(View view) {
        if (this.f1953g.contains(view)) {
            this.f1952f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC1461d.m3494e("child", view);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0423v ? (AbstractComponentCallbacksC0423v) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0221v0 c0221v0;
        AbstractC1461d.m3494e("insets", windowInsets);
        C0221v0 m680g = C0221v0.m680g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1954h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC1461d.m3493d("onApplyWindowInsetsListe…lyWindowInsets(v, insets)", onApplyWindowInsets);
            c0221v0 = C0221v0.m680g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            WindowInsets m685f = m680g.m685f();
            if (m685f != null) {
                WindowInsets m418b = AbstractC0156D.m418b(this, m685f);
                if (!m418b.equals(m685f)) {
                    m680g = C0221v0.m680g(this, m418b);
                }
            }
            c0221v0 = m680g;
        }
        if (!c0221v0.f573a.mo666m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                WindowInsets m685f2 = c0221v0.m685f();
                if (m685f2 != null) {
                    WindowInsets m417a = AbstractC0156D.m417a(childAt, m685f2);
                    if (!m417a.equals(m685f2)) {
                        C0221v0.m680g(childAt, m417a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC1461d.m3494e("canvas", canvas);
        if (this.f1955i) {
            Iterator it = this.f1952f.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC1461d.m3494e("canvas", canvas);
        AbstractC1461d.m3494e("child", view);
        if (this.f1955i) {
            ArrayList arrayList = this.f1952f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC1461d.m3494e("view", view);
        this.f1953g.remove(view);
        if (this.f1952f.remove(view)) {
            this.f1955i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0423v> F getFragment() {
        AbstractActivityC0870i abstractActivityC0870i;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v;
        C0387O m2405l;
        View view = this;
        while (true) {
            abstractActivityC0870i = null;
            if (view == null) {
                abstractComponentCallbacksC0423v = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0423v = tag instanceof AbstractComponentCallbacksC0423v ? (AbstractComponentCallbacksC0423v) tag : null;
            if (abstractComponentCallbacksC0423v != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0423v == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0870i) {
                    abstractActivityC0870i = (AbstractActivityC0870i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0870i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            m2405l = abstractActivityC0870i.m2405l();
        } else {
            if (!abstractComponentCallbacksC0423v.m1134q()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0423v + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            m2405l = abstractComponentCallbacksC0423v.m1125h();
        }
        return (F) m2405l.m988B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC1461d.m3494e("insets", windowInsets);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC1461d.m3493d("view", childAt);
                m1357a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC1461d.m3494e("view", view);
        m1357a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AbstractC1461d.m3493d("view", childAt);
        m1357a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC1461d.m3494e("view", view);
        m1357a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC1461d.m3493d("view", childAt);
            m1357a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC1461d.m3493d("view", childAt);
            m1357a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1955i = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC1461d.m3494e("listener", onApplyWindowInsetsListener);
        this.f1954h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC1461d.m3494e("view", view);
        if (view.getParent() == this) {
            this.f1953g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C0387O c0387o) {
        super(context, attributeSet);
        View view;
        AbstractC1461d.m3494e("context", context);
        AbstractC1461d.m3494e("attrs", attributeSet);
        AbstractC1461d.m3494e("fm", c0387o);
        this.f1952f = new ArrayList();
        this.f1953g = new ArrayList();
        this.f1955i = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0350a.f1002b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0423v m988B = c0387o.m988B(id);
        if (classAttribute != null && m988B == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0062j.m161o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0381I m991E = c0387o.m991E();
            context.getClassLoader();
            AbstractComponentCallbacksC0423v m980a = m991E.m980a(classAttribute);
            AbstractC1461d.m3493d("fm.fragmentFactory.insta…ontext.classLoader, name)", m980a);
            m980a.f1340H = true;
            C0427z c0427z = m980a.f1375x;
            if ((c0427z == null ? null : c0427z.f1384k) != null) {
                m980a.f1340H = true;
            }
            C0398a c0398a = new C0398a(c0387o);
            c0398a.f1242o = true;
            m980a.f1341I = this;
            c0398a.m1075e(getId(), m980a, string, 1);
            if (!c0398a.f1234g) {
                c0398a.f1243p.m1038z(c0398a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = c0387o.f1151c.m913f().iterator();
        while (it.hasNext()) {
            C0394W c0394w = (C0394W) it.next();
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
            if (abstractComponentCallbacksC0423v.f1334B == getId() && (view = abstractComponentCallbacksC0423v.f1342J) != null && view.getParent() == null) {
                abstractComponentCallbacksC0423v.f1341I = this;
                c0394w.m1048b();
            }
        }
    }
}
