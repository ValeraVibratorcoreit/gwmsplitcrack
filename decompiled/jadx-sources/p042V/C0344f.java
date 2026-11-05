package p042V;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p010D1.AbstractC0088l;

/* renamed from: V.f */
/* loaded from: classes.dex */
public final class C0344f extends AbstractC0088l {

    /* renamed from: c */
    public final TextView f980c;

    /* renamed from: d */
    public final C0342d f981d;

    /* renamed from: e */
    public boolean f982e = true;

    public C0344f(TextView textView) {
        this.f980c = textView;
        this.f981d = new C0342d(textView);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: H */
    public final InputFilter[] mo285H(InputFilter[] inputFilterArr) {
        if (!this.f982e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0342d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C0342d c0342d = this.f981d;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0342d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c0342d) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: j0 */
    public final void mo308j0(boolean z2) {
        if (z2) {
            m937v0();
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: m0 */
    public final void mo314m0(boolean z2) {
        this.f982e = z2;
        m937v0();
        TextView textView = this.f980c;
        textView.setFilters(mo285H(textView.getFilters()));
    }

    /* renamed from: v0 */
    public final void m937v0() {
        TextView textView = this.f980c;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f982e) {
            if (!(transformationMethod instanceof C0348j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0348j(transformationMethod);
            }
        } else if (transformationMethod instanceof C0348j) {
            transformationMethod = ((C0348j) transformationMethod).f988a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
