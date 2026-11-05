package p071g0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0544i;
import java.util.LinkedHashSet;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p033Q.AbstractC0268b;
import p033Q.AbstractC0269c;
import p067f.AbstractC0770a;
import p070g.C0868g;
import p082l.AbstractC1118h0;
import p082l.C1137r;
import p088n.C1172c;
import p088n.C1175f;
import p107t1.AbstractC1461d;

/* renamed from: g0.d */
/* loaded from: classes.dex */
public final class C0891d {

    /* renamed from: a */
    public boolean f4468a;

    /* renamed from: b */
    public boolean f4469b;

    /* renamed from: c */
    public boolean f4470c;

    /* renamed from: d */
    public final Object f4471d;

    /* renamed from: e */
    public Parcelable f4472e;

    /* renamed from: f */
    public Object f4473f;

    public /* synthetic */ C0891d(TextView textView) {
        this.f4472e = null;
        this.f4473f = null;
        this.f4468a = false;
        this.f4469b = false;
        this.f4471d = textView;
    }

    /* renamed from: a */
    public void m2461a() {
        CompoundButton compoundButton = (CompoundButton) this.f4471d;
        Drawable m790a = AbstractC0269c.m790a(compoundButton);
        if (m790a != null) {
            if (this.f4468a || this.f4469b) {
                Drawable mutate = m790a.mutate();
                if (this.f4468a) {
                    AbstractC0070a.m206h(mutate, (ColorStateList) this.f4472e);
                }
                if (this.f4469b) {
                    AbstractC0070a.m207i(mutate, (PorterDuff.Mode) this.f4473f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public void m2462b() {
        C1137r c1137r = (C1137r) this.f4471d;
        Drawable checkMarkDrawable = c1137r.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f4468a || this.f4469b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f4468a) {
                    AbstractC0070a.m206h(mutate, (ColorStateList) this.f4472e);
                }
                if (this.f4469b) {
                    AbstractC0070a.m207i(mutate, (PorterDuff.Mode) this.f4473f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c1137r.getDrawableState());
                }
                c1137r.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: c */
    public Bundle m2463c(String str) {
        if (!this.f4469b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f4472e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f4472e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f4472e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f4472e = null;
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2464d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f4471d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0770a.f3906m;
        C0198k m591r = C0198k.m591r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) m591r.f534c;
        AbstractC0169Q.m504i(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) m591r.f534c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0088l.m257D(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    AbstractC0268b.m788c(compoundButton, m591r.m597g(2));
                }
                if (typedArray.hasValue(3)) {
                    AbstractC0268b.m789d(compoundButton, AbstractC1118h0.m2730b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0088l.m257D(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            m591r.m609t();
        }
    }

    /* renamed from: e */
    public void m2465e(String str, InterfaceC0890c interfaceC0890c) {
        Object obj;
        AbstractC1461d.m3494e("provider", interfaceC0890c);
        C1175f c1175f = (C1175f) this.f4471d;
        C1172c mo2825a = c1175f.mo2825a(str);
        if (mo2825a != null) {
            obj = mo2825a.f5352b;
        } else {
            C1172c c1172c = new C1172c(str, interfaceC0890c);
            c1175f.f5361d++;
            C1172c c1172c2 = c1175f.f5359b;
            if (c1172c2 == null) {
                c1175f.f5358a = c1172c;
                c1175f.f5359b = c1172c;
            } else {
                c1172c2.f5353c = c1172c;
                c1172c.f5354d = c1172c2;
                c1175f.f5359b = c1172c;
            }
            obj = null;
        }
        if (((InterfaceC0890c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: f */
    public void m2466f() {
        if (!this.f4470c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0868g c0868g = (C0868g) this.f4473f;
        if (c0868g == null) {
            c0868g = new C0868g(this);
        }
        this.f4473f = c0868g;
        try {
            C0544i.class.getDeclaredConstructor(null);
            C0868g c0868g2 = (C0868g) this.f4473f;
            if (c0868g2 != null) {
                ((LinkedHashSet) c0868g2.f4361b).add(C0544i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0544i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public C0891d() {
        this.f4471d = new C1175f();
        this.f4470c = true;
    }
}
