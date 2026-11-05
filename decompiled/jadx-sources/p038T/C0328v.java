package p038T;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p121y0.AbstractC1687o;

/* renamed from: T.v */
/* loaded from: classes.dex */
public final class C0328v extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f929a;

    /* renamed from: b */
    public final ArrayList f930b;

    public C0328v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f930b = new ArrayList();
        AbstractC1687o.m4939h("watcherClass cannot be null", cls);
        this.f929a = cls;
    }

    /* renamed from: a */
    public final void m921a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f930b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0327u) arrayList.get(i)).f928g.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void m922b() {
        m925e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f930b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0327u) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* renamed from: c */
    public final C0327u m923c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f930b;
            if (i >= arrayList.size()) {
                return null;
            }
            C0327u c0327u = (C0327u) arrayList.get(i);
            if (c0327u.f927f == obj) {
                return c0327u;
            }
            i++;
        }
    }

    /* renamed from: d */
    public final boolean m924d(Object obj) {
        if (obj != null) {
            if (this.f929a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: e */
    public final void m925e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f930b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0327u) arrayList.get(i)).f928g.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0327u m923c;
        if (m924d(obj) && (m923c = m923c(obj)) != null) {
            obj = m923c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0327u m923c;
        if (m924d(obj) && (m923c = m923c(obj)) != null) {
            obj = m923c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0327u m923c;
        if (m924d(obj) && (m923c = m923c(obj)) != null) {
            obj = m923c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f929a != cls) {
            return super.getSpans(i, i2, cls);
        }
        C0327u[] c0327uArr = (C0327u[]) super.getSpans(i, i2, C0327u.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0327uArr.length);
        for (int i3 = 0; i3 < c0327uArr.length; i3++) {
            objArr[i3] = c0327uArr[i3].f927f;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f929a == cls) {
            cls = C0327u.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0327u c0327u;
        if (m924d(obj)) {
            c0327u = m923c(obj);
            if (c0327u != null) {
                obj = c0327u;
            }
        } else {
            c0327u = null;
        }
        super.removeSpan(obj);
        if (c0327u != null) {
            this.f930b.remove(c0327u);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m924d(obj)) {
            C0327u c0327u = new C0327u(obj);
            this.f930b.add(c0327u);
            obj = c0327u;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C0328v(this.f929a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m921a();
        super.replace(i, i2, charSequence);
        m925e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C0328v(Class cls, C0328v c0328v, int i, int i2) {
        super(c0328v, i, i2);
        this.f930b = new ArrayList();
        AbstractC1687o.m4939h("watcherClass cannot be null", cls);
        this.f929a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m921a();
        super.replace(i, i2, charSequence, i3, i4);
        m925e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
