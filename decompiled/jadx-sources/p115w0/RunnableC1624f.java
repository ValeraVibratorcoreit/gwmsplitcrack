package p115w0;

import android.widget.EditText;
import com.altaysoft.t500_split.reminders.RemindersActivity;

/* renamed from: w0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1624f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9263a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean[] f9264b;

    /* renamed from: c */
    public final /* synthetic */ EditText f9265c;

    /* renamed from: d */
    public final /* synthetic */ int f9266d;

    /* renamed from: e */
    public final /* synthetic */ EditText f9267e;

    public /* synthetic */ RunnableC1624f(boolean[] zArr, EditText editText, int i, EditText editText2) {
        this.f9264b = zArr;
        this.f9265c = editText;
        this.f9266d = i;
        this.f9267e = editText2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        EditText editText = this.f9267e;
        int i3 = this.f9266d;
        EditText editText2 = this.f9265c;
        boolean[] zArr = this.f9264b;
        switch (this.f9263a) {
            case 0:
                int i4 = RemindersActivity.f3106I;
                if (!zArr[0]) {
                    zArr[0] = true;
                    try {
                        i = Integer.parseInt(editText2.getText().toString().trim());
                    } catch (Exception unused) {
                        i = 0;
                    }
                    editText.setText(String.valueOf(Math.max(0, i) + i3));
                    zArr[0] = false;
                    break;
                }
                break;
            default:
                int i5 = RemindersActivity.f3106I;
                if (!zArr[0]) {
                    zArr[0] = true;
                    try {
                        i2 = Integer.parseInt(editText2.getText().toString().trim());
                    } catch (Exception unused2) {
                        i2 = i3;
                    }
                    editText.setText(String.valueOf(Math.max(0, i2 - i3)));
                    zArr[0] = false;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1624f(boolean[] zArr, EditText editText, EditText editText2, int i) {
        this.f9264b = zArr;
        this.f9265c = editText;
        this.f9267e = editText2;
        this.f9266d = i;
    }
}
