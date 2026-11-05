package p098q0;

import android.app.Dialog;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.FileProvider;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import p070g.DialogInterfaceC0867f;
import p112v0.AbstractC1612e;
import p112v0.EnumC1609b;
import p115w0.EnumC1620b;
import p124z0.RunnableC1704c;

/* renamed from: q0.j0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1326j0 implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f6265f;

    /* renamed from: g */
    public final /* synthetic */ Object f6266g;

    /* renamed from: h */
    public final /* synthetic */ Object f6267h;

    /* renamed from: i */
    public final /* synthetic */ Object f6268i;

    public /* synthetic */ ViewOnClickListenerC1326j0(Dialog dialog, MainActivity mainActivity, EnumC1609b enumC1609b) {
        this.f6265f = 2;
        this.f6266g = dialog;
        this.f6268i = mainActivity;
        this.f6267h = enumC1609b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FileOutputStream fileOutputStream;
        byte[] bArr;
        File file = null;
        Object obj = this.f6268i;
        Object obj2 = this.f6267h;
        Object obj3 = this.f6266g;
        switch (this.f6265f) {
            case 0:
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                MainActivity mainActivity = (MainActivity) obj;
                mainActivity.getClass();
                AbstractC1256E0.m3027t((DialogInterfaceC0867f) obj3, (View) obj2, null);
                mainActivity.f2316L = null;
                InputStream openRawResource = mainActivity.getResources().openRawResource(R.raw.gwm_split_ext);
                String file2 = Environment.getExternalStorageDirectory().toString();
                cfgData cfgdata = mainActivity.f2309E;
                File file3 = new File(file2, cfgdata.f2673p);
                try {
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        bArr = new byte[1024];
                    } finally {
                    }
                } catch (IOException unused) {
                }
                while (true) {
                    int read = openRawResource.read(bArr);
                    if (read <= 0) {
                        openRawResource.close();
                        fileOutputStream.close();
                        file = file3;
                        if (file == null || !file.exists()) {
                            mainActivity.m1683F(mainActivity.getString(R.string.ext_install_copy_failed));
                            mainActivity.m1684G();
                            return;
                        }
                        if (file.exists()) {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setDataAndType(FileProvider.m1335d(mainActivity, cfgdata.f2678q, file), cfgdata.f2658m);
                            intent.addFlags(1);
                            mainActivity.startActivity(intent);
                        }
                        mainActivity.finish();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                break;
            case 1:
                AbstractC1256E0.m3027t((DialogInterfaceC0867f) obj3, (View) obj2, (RunnableC1704c) obj);
                return;
            case 2:
                ((Dialog) obj3).dismiss();
                AbstractC1612e.m4770b((MainActivity) obj, (EnumC1609b) obj2);
                return;
            case 3:
                int i = RemindersActivity.f3106I;
                EnumC1620b[] enumC1620bArr = (EnumC1620b[]) obj;
                enumC1620bArr[0] = (EnumC1620b) obj3;
                int i2 = 0;
                while (true) {
                    LinearLayout linearLayout = (LinearLayout) obj2;
                    if (i2 >= linearLayout.getChildCount()) {
                        return;
                    }
                    View childAt = linearLayout.getChildAt(i2);
                    childAt.setBackgroundResource(((EnumC1620b) childAt.getTag()) == enumC1620bArr[0] ? R.drawable.dialog_input_bg : android.R.color.transparent);
                    i2++;
                }
            default:
                AbstractC1256E0.m3027t((DialogInterfaceC0867f) obj3, (View) obj2, null);
                ((Runnable) obj).run();
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC1326j0(DialogInterfaceC0867f dialogInterfaceC0867f, View view, Runnable runnable, int i) {
        this.f6265f = i;
        this.f6266g = dialogInterfaceC0867f;
        this.f6267h = view;
        this.f6268i = runnable;
    }

    public /* synthetic */ ViewOnClickListenerC1326j0(Object obj, Object obj2, View view, int i) {
        this.f6265f = i;
        this.f6268i = obj;
        this.f6266g = obj2;
        this.f6267h = view;
    }
}
