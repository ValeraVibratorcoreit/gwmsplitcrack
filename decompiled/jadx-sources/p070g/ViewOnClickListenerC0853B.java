package p070g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006C.AbstractC0062j;

/* renamed from: g.B */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0853B implements View.OnClickListener {

    /* renamed from: f */
    public final View f4266f;

    /* renamed from: g */
    public final String f4267g;

    /* renamed from: h */
    public Method f4268h;

    /* renamed from: i */
    public Context f4269i;

    public ViewOnClickListenerC0853B(View view, String str) {
        this.f4266f = view;
        this.f4267g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f4268h == null) {
            View view2 = this.f4266f;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f4267g;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder m163q = AbstractC0062j.m163q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    m163q.append(view2.getClass());
                    m163q.append(str);
                    throw new IllegalStateException(m163q.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f4268h = method;
                        this.f4269i = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f4268h.invoke(this.f4269i, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
