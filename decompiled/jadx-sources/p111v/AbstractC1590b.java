package p111v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p102s.AbstractC1411i;
import p102s.C1406d;

/* renamed from: v.b */
/* loaded from: classes.dex */
public abstract class AbstractC1590b extends View {

    /* renamed from: f */
    public int[] f8996f;

    /* renamed from: g */
    public int f8997g;

    /* renamed from: h */
    public Context f8998h;

    /* renamed from: i */
    public AbstractC1411i f8999i;

    /* renamed from: j */
    public String f9000j;

    /* renamed from: k */
    public String f9001k;

    /* renamed from: l */
    public HashMap f9002l;

    public AbstractC1590b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8996f = new int[32];
        this.f9002l = new HashMap();
        this.f8998h = context;
        mo1308g(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4741a(String str) {
        Context context;
        int i;
        HashMap hashMap;
        if (str == null || str.length() == 0 || (context = this.f8998h) == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.f1869r) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.f1869r.get(trim);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = m4746f(constraintLayout, trim);
                }
                if (i == 0) {
                    try {
                        i = AbstractC1604p.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i == 0) {
                    this.f9002l.put(Integer.valueOf(i), trim);
                    m4742b(i);
                    return;
                } else {
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    return;
                }
            }
        }
        i = 0;
        if (i == 0) {
            i = m4746f(constraintLayout, trim);
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
    }

    /* renamed from: b */
    public final void m4742b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f8997g + 1;
        int[] iArr = this.f8996f;
        if (i2 > iArr.length) {
            this.f8996f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8996f;
        int i3 = this.f8997g;
        iArr2[i3] = i;
        this.f8997g = i3 + 1;
    }

    /* renamed from: c */
    public final void m4743c(String str) {
        if (str == null || str.length() == 0 || this.f8998h == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1592d) && trim.equals(((C1592d) layoutParams).f9028Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m4742b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4744d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f8997g; i++) {
            View view = (View) constraintLayout.f1857f.get(this.f8996f[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo4745e(ConstraintLayout constraintLayout) {
    }

    /* renamed from: f */
    public final int m4746f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f8998h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public void mo1308g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1605q.f9209b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f9000j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f9001k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8996f, this.f8997g);
    }

    /* renamed from: h */
    public abstract void mo1309h(C1406d c1406d, boolean z2);

    /* renamed from: i */
    public final void m4747i() {
        if (this.f8999i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1592d) {
            ((C1592d) layoutParams).f9061p0 = this.f8999i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f9000j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f9001k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f9000j = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f8997g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m4741a(str.substring(i));
                return;
            } else {
                m4741a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f9001k = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f8997g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m4743c(str.substring(i));
                return;
            } else {
                m4743c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f9000j = null;
        this.f8997g = 0;
        for (int i : iArr) {
            m4742b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f9000j == null) {
            m4742b(i);
        }
    }
}
