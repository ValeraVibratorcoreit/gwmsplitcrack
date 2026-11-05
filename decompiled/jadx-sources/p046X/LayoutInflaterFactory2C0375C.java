package p046X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import p006C.AbstractC0062j;
import p044W.AbstractC0350a;
import p048Y.AbstractC0434d;
import p048Y.C0431a;
import p048Y.C0433c;
import p070g.AbstractActivityC0870i;

/* renamed from: X.C */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0375C implements LayoutInflater.Factory2 {

    /* renamed from: f */
    public final C0387O f1117f;

    public LayoutInflaterFactory2C0375C(C0387O c0387o) {
        this.f1117f = c0387o;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        C0394W m1018f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        C0387O c0387o = this.f1117f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, c0387o);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0350a.f1001a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0423v.class.isAssignableFrom(C0381I.m978b(attributeValue, context.getClassLoader()));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0423v m988B = resourceId != -1 ? c0387o.m988B(resourceId) : null;
                if (m988B == null && string != null) {
                    m988B = c0387o.m989C(string);
                }
                if (m988B == null && id != -1) {
                    m988B = c0387o.m988B(id);
                }
                if (m988B == null) {
                    C0381I m991E = c0387o.m991E();
                    context.getClassLoader();
                    m988B = m991E.m980a(attributeValue);
                    m988B.f1369r = true;
                    m988B.f1333A = resourceId != 0 ? resourceId : id;
                    m988B.f1334B = id;
                    m988B.f1335C = string;
                    m988B.f1370s = true;
                    m988B.f1374w = c0387o;
                    C0427z c0427z = c0387o.f1168t;
                    m988B.f1375x = c0427z;
                    AbstractActivityC0870i abstractActivityC0870i = c0427z.f1385l;
                    m988B.f1340H = true;
                    if ((c0427z != null ? c0427z.f1384k : null) != null) {
                        m988B.f1340H = true;
                    }
                    m1018f = c0387o.m1010a(m988B);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + m988B + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (m988B.f1370s) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    m988B.f1370s = true;
                    m988B.f1374w = c0387o;
                    C0427z c0427z2 = c0387o.f1168t;
                    m988B.f1375x = c0427z2;
                    AbstractActivityC0870i abstractActivityC0870i2 = c0427z2.f1385l;
                    m988B.f1340H = true;
                    if ((c0427z2 != null ? c0427z2.f1384k : null) != null) {
                        m988B.f1340H = true;
                    }
                    m1018f = c0387o.m1018f(m988B);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + m988B + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0433c c0433c = AbstractC0434d.f1401a;
                AbstractC0434d.m1143b(new C0431a(m988B, "Attempting to use <fragment> tag to add fragment " + m988B + " to container " + viewGroup));
                AbstractC0434d.m1142a(m988B).getClass();
                m988B.f1341I = viewGroup;
                m1018f.m1057k();
                m1018f.m1056j();
                View view2 = m988B.f1342J;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC0062j.m161o("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m988B.f1342J.getTag() == null) {
                    m988B.f1342J.setTag(string);
                }
                m988B.f1342J.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0374B(this, m1018f));
                return m988B.f1342J;
            }
        }
        return null;
    }
}
