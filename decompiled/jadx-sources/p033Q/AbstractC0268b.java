package p033Q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: Q.b */
/* loaded from: classes.dex */
public abstract class AbstractC0268b {
    /* renamed from: a */
    public static ColorStateList m786a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m787b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* renamed from: c */
    public static void m788c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m789d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
