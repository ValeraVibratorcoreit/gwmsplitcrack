package p054a1;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.altaysoft.t500_split.R;

/* renamed from: a1.w */
/* loaded from: classes.dex */
public final class C0514w extends AbstractC0507p {

    /* renamed from: e */
    public final int f1664e;

    /* renamed from: f */
    public EditText f1665f;

    /* renamed from: g */
    public final ViewOnClickListenerC0492a f1666g;

    public C0514w(C0506o c0506o, int i) {
        super(c0506o);
        this.f1664e = R.drawable.design_password_eye;
        this.f1666g = new ViewOnClickListenerC0492a(2, this);
        if (i != 0) {
            this.f1664e = i;
        }
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: b */
    public final void mo1236b() {
        m1238q();
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: c */
    public final int mo1201c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: d */
    public final int mo1202d() {
        return this.f1664e;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: f */
    public final View.OnClickListener mo1204f() {
        return this.f1666g;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: k */
    public final boolean mo1237k() {
        return true;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: l */
    public final boolean mo1216l() {
        EditText editText = this.f1665f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: m */
    public final void mo1206m(EditText editText) {
        this.f1665f = editText;
        m1238q();
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: r */
    public final void mo1208r() {
        EditText editText = this.f1665f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1665f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: s */
    public final void mo1209s() {
        EditText editText = this.f1665f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
