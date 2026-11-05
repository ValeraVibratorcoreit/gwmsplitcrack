package p022K;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p006C.C0058f;

/* renamed from: K.t0 */
/* loaded from: classes.dex */
public class C0217t0 {

    /* renamed from: b */
    public static final C0221v0 f570b;

    /* renamed from: a */
    public final C0221v0 f571a;

    static {
        int i = Build.VERSION.SDK_INT;
        f570b = (i >= 30 ? new C0203m0() : i >= 29 ? new C0201l0() : new C0199k0()).mo614b().f573a.mo668a().f573a.mo663b().f573a.mo664c();
    }

    public C0217t0(C0221v0 c0221v0) {
        this.f571a = c0221v0;
    }

    /* renamed from: a */
    public C0221v0 mo668a() {
        return this.f571a;
    }

    /* renamed from: b */
    public C0221v0 mo663b() {
        return this.f571a;
    }

    /* renamed from: c */
    public C0221v0 mo664c() {
        return this.f571a;
    }

    /* renamed from: d */
    public void mo653d(View view) {
    }

    /* renamed from: e */
    public C0194i mo669e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0217t0)) {
            return false;
        }
        C0217t0 c0217t0 = (C0217t0) obj;
        return mo657n() == c0217t0.mo657n() && mo666m() == c0217t0.mo666m() && Objects.equals(mo655j(), c0217t0.mo655j()) && Objects.equals(mo665h(), c0217t0.mo665h()) && Objects.equals(mo669e(), c0217t0.mo669e());
    }

    /* renamed from: f */
    public C0058f mo654f(int i) {
        return C0058f.f202e;
    }

    /* renamed from: g */
    public C0058f mo670g() {
        return mo655j();
    }

    /* renamed from: h */
    public C0058f mo665h() {
        return C0058f.f202e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo657n()), Boolean.valueOf(mo666m()), mo655j(), mo665h(), mo669e());
    }

    /* renamed from: i */
    public C0058f mo671i() {
        return mo655j();
    }

    /* renamed from: j */
    public C0058f mo655j() {
        return C0058f.f202e;
    }

    /* renamed from: k */
    public C0058f mo672k() {
        return mo655j();
    }

    /* renamed from: l */
    public C0221v0 mo656l(int i, int i2, int i3, int i4) {
        return f570b;
    }

    /* renamed from: m */
    public boolean mo666m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo657n() {
        return false;
    }

    /* renamed from: o */
    public void mo658o(C0058f[] c0058fArr) {
    }

    /* renamed from: p */
    public void mo659p(C0221v0 c0221v0) {
    }

    /* renamed from: q */
    public void mo667q(C0058f c0058f) {
    }
}
