package p034Q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.sun.jna.win32.DLLCallback;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p006C.AbstractC0062j;
import p022K.AbstractC0169Q;

/* renamed from: Q0.k */
/* loaded from: classes.dex */
public abstract class AbstractC0294k {

    /* renamed from: a */
    public static final int[] f823a = {R.attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f824b = {R.attr.colorPrimaryVariant};

    /* renamed from: c */
    public static final C0295l f825c = new C0295l(0);

    /* renamed from: a */
    public static void m840a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f165D, i, i2);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m842c(context, f824b, "Theme.MaterialComponents");
            }
        }
        m842c(context, f823a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m841b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f165D, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z2 = true;
            obtainStyledAttributes.recycle();
            if (!z2) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    /* renamed from: c */
    public static void m842c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC0062j.m161o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public static float m843d(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static ArrayList m844e(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m845f(View view) {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: g */
    public static TypedArray m846g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m840a(context, attributeSet, i, i2);
        m841b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: h */
    public static PorterDuff.Mode m847h(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case DLLCallback.DLL_FPTRS /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
