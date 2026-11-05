package p054a1;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p024L.C0240j;
import p031P.C0264b;

/* renamed from: a1.p */
/* loaded from: classes.dex */
public abstract class AbstractC0507p {

    /* renamed from: a */
    public final TextInputLayout f1613a;

    /* renamed from: b */
    public final C0506o f1614b;

    /* renamed from: c */
    public final Context f1615c;

    /* renamed from: d */
    public final CheckableImageButton f1616d;

    public AbstractC0507p(C0506o c0506o) {
        this.f1613a = c0506o.f1592f;
        this.f1614b = c0506o;
        this.f1615c = c0506o.getContext();
        this.f1616d = c0506o.f1598l;
    }

    /* renamed from: a */
    public void mo1200a() {
    }

    /* renamed from: b */
    public void mo1236b() {
    }

    /* renamed from: c */
    public int mo1201c() {
        return 0;
    }

    /* renamed from: d */
    public int mo1202d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo1203e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo1204f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo1205g() {
        return null;
    }

    /* renamed from: h */
    public C0264b mo1213h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo1214i(int i) {
        return true;
    }

    /* renamed from: j */
    public boolean mo1215j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo1237k() {
        return this instanceof C0502k;
    }

    /* renamed from: l */
    public boolean mo1216l() {
        return false;
    }

    /* renamed from: m */
    public void mo1206m(EditText editText) {
    }

    /* renamed from: n */
    public void mo1217n(C0240j c0240j) {
    }

    /* renamed from: o */
    public void mo1218o(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo1207p(boolean z2) {
    }

    /* renamed from: q */
    public final void m1238q() {
        this.f1614b.m1227f(false);
    }

    /* renamed from: r */
    public void mo1208r() {
    }

    /* renamed from: s */
    public void mo1209s() {
    }
}
