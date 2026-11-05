package p001A0;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.widget.ScrollView;
import com.altaysoft.t500_split.EditPpBridgeReceiver;
import com.altaysoft.t500_split.IPOverlayService;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.radio.RadioState;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import com.altaysoft.t500_split.userthemes.UserThemeSlotsActivity;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.vosk.Model;
import p010D1.AbstractC0088l;
import p049Y0.C0440f;
import p052a.C0470j;
import p058c.C0570d;
import p058c.InterfaceC0568b;
import p062d0.C0728a;
import p062d0.InterfaceC0731d;
import p098q0.AbstractC1372y1;
import p098q0.C1315f1;
import p098q0.C1324i1;
import p106t0.EnumC1456b;
import p107t1.AbstractC1461d;
import p109u0.AbstractC1569q1;
import p124z0.RunnableC1704c;

/* renamed from: A0.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0017k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46a;

    /* renamed from: b */
    public final /* synthetic */ int f47b;

    /* renamed from: c */
    public final /* synthetic */ Object f48c;

    /* renamed from: d */
    public final /* synthetic */ Object f49d;

    public /* synthetic */ RunnableC0017k(Context context, int i, String str) {
        this.f46a = 5;
        this.f49d = str;
        this.f48c = context;
        this.f47b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Model model;
        cfgData m1784i;
        Intent launchIntentForPackage;
        Bitmap bitmap;
        String str;
        int i = 2;
        switch (this.f46a) {
            case 0:
                String str2 = (String) this.f49d;
                C0021o c0021o = (C0021o) this.f48c;
                c0021o.getClass();
                try {
                    model = new Model(str2);
                } catch (Exception | UnsatisfiedLinkError unused) {
                    model = null;
                }
                c0021o.f61a.post(new RunnableC0019m(c0021o, this.f47b, model, str2, 0));
                break;
            case 1:
                C0470j c0470j = (C0470j) this.f48c;
                AbstractC1461d.m3494e("this$0", c0470j);
                Object obj = ((C0440f) this.f49d).f1414a;
                String str3 = (String) c0470j.f1490a.get(Integer.valueOf(this.f47b));
                if (str3 != null) {
                    C0570d c0570d = (C0570d) c0470j.f1494e.get(str3);
                    if ((c0570d != null ? c0570d.f2177a : null) != null) {
                        InterfaceC0568b interfaceC0568b = c0570d.f2177a;
                        if (c0470j.f1493d.remove(str3)) {
                            interfaceC0568b.mo784b(obj);
                            break;
                        }
                    } else {
                        c0470j.f1496g.remove(str3);
                        c0470j.f1495f.put(str3, obj);
                        break;
                    }
                }
                break;
            case 2:
                C0470j c0470j2 = (C0470j) this.f48c;
                AbstractC1461d.m3494e("this$0", c0470j2);
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f49d;
                AbstractC1461d.m3494e("$e", sendIntentException);
                c0470j2.m1179a(this.f47b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            case 3:
                ((RadioState) this.f48c).lambda$applyPush$2(this.f47b, (String) this.f49d);
                break;
            case 4:
                ((InterfaceC0731d) ((C0728a) this.f48c).f3831c).mo947g(this.f47b, (Serializable) this.f49d);
                break;
            case 5:
                int i2 = EditPpBridgeReceiver.f2271a;
                boolean equals = "com.altaysoft.t500_split.action.EDIT_PP_PAUSE".equals((String) this.f49d);
                Context context = (Context) this.f48c;
                if (!equals) {
                    try {
                        cfgData m1784i2 = cfgData.m1784i();
                        if (m1784i2 != null) {
                            m1784i2.m1791k(context, false);
                        }
                    } catch (Exception unused2) {
                    }
                    int i3 = this.f47b;
                    if (i3 >= 1 && i3 >= 1 && i3 <= 9 && (m1784i = cfgData.m1784i()) != null) {
                        int i4 = AbstractC1569q1.f8666a;
                        int length = (EnumC1456b.values().length + i3) - 1;
                        if (AbstractC1569q1.m4453e(length) && m1784i.f2620e1 != length) {
                            m1784i.f2620e1 = length;
                            m1784i.f2615d1 = EnumC1456b.simple;
                            try {
                                m1784i.m1795o(context);
                            } catch (Exception unused3) {
                            }
                        }
                    }
                    IPOverlayService.m1670d(context, false);
                    break;
                } else {
                    IPOverlayService.m1670d(context, true);
                    break;
                }
                break;
            case 6:
                String str4 = (String) this.f49d;
                int i5 = this.f47b;
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                MainActivity mainActivity = (MainActivity) this.f48c;
                mainActivity.getClass();
                try {
                    if (AbstractC1372y1.m3313s(i5, str4) >= 0 && (launchIntentForPackage = mainActivity.getPackageManager().getLaunchIntentForPackage(str4)) != null) {
                        launchIntentForPackage.addFlags(131072);
                        ActivityOptions makeBasic = ActivityOptions.makeBasic();
                        makeBasic.setLaunchDisplayId(i5);
                        mainActivity.startActivity(launchIntentForPackage, makeBasic.toBundle());
                        break;
                    }
                } catch (Exception unused4) {
                    return;
                }
                break;
            case 7:
                C1324i1 c1324i1 = (C1324i1) this.f48c;
                Bitmap bitmap2 = (Bitmap) this.f49d;
                if (bitmap2 != null) {
                    c1324i1.getClass();
                    if (!bitmap2.isRecycled() && bitmap2.getWidth() > 0 && bitmap2.getHeight() > 0) {
                        int max = Math.max(1, Math.min(8, 25));
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, Math.max(48, bitmap2.getWidth() / 4), Math.max(48, bitmap2.getHeight() / 4), true);
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap copy = createScaledBitmap.copy(config, true);
                        if (createScaledBitmap != bitmap2 && createScaledBitmap != copy) {
                            createScaledBitmap.recycle();
                        }
                        AbstractC0088l.m270h(copy, max);
                        AbstractC0088l.m270h(copy, Math.max(1, max / 2));
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.55f);
                        colorMatrix.postConcat(new ColorMatrix(new float[]{1.12f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 1.12f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 1.12f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                        Bitmap createBitmap = Bitmap.createBitmap(copy.getWidth(), copy.getHeight(), config);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(2);
                        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        canvas.drawBitmap(copy, 0.0f, 0.0f, paint);
                        int[] iArr = new int[copy.getHeight() * copy.getWidth()];
                        createBitmap.getPixels(iArr, 0, copy.getWidth(), 0, 0, copy.getWidth(), copy.getHeight());
                        copy.setPixels(iArr, 0, copy.getWidth(), 0, 0, copy.getWidth(), copy.getHeight());
                        createBitmap.recycle();
                        bitmap = copy;
                        c1324i1.f6208b.post(new RunnableC0019m(c1324i1, this.f47b, bitmap, bitmap2, 2));
                        break;
                    }
                }
                bitmap = null;
                c1324i1.f6208b.post(new RunnableC0019m(c1324i1, this.f47b, bitmap, bitmap2, 2));
                break;
            case 8:
                C1315f1 c1315f1 = (C1315f1) this.f48c;
                c1315f1.getClass();
                int i6 = UserThemeImportActivity.f3298V;
                UserThemeImportActivity userThemeImportActivity = (UserThemeImportActivity) c1315f1.f6118f;
                if (userThemeImportActivity.m2001u() && userThemeImportActivity.f3312R != null && (str = (String) this.f49d) != null) {
                    userThemeImportActivity.m1999B(true);
                    int i7 = this.f47b;
                    if (i7 >= 0) {
                        str = userThemeImportActivity.getString(R.string.ut_log_pct, str, Integer.valueOf(i7));
                    }
                    boolean z2 = userThemeImportActivity.f3315U;
                    StringBuilder sb = userThemeImportActivity.f3314T;
                    if (z2) {
                        int lastIndexOf = sb.lastIndexOf("\n");
                        if (lastIndexOf >= 0) {
                            sb.setLength(lastIndexOf + 1);
                        } else {
                            sb.setLength(0);
                        }
                    } else if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(str);
                    userThemeImportActivity.f3315U = true;
                    userThemeImportActivity.f3312R.setText(sb.toString());
                    ScrollView scrollView = userThemeImportActivity.f3313S;
                    if (scrollView != null) {
                        scrollView.post(new RunnableC1704c(userThemeImportActivity, i));
                        break;
                    }
                }
                break;
            default:
                UserThemeSlotsActivity userThemeSlotsActivity = (UserThemeSlotsActivity) this.f48c;
                Bitmap bitmap3 = userThemeSlotsActivity.f3323K;
                Bitmap bitmap4 = (Bitmap) this.f49d;
                if (bitmap3 == bitmap4) {
                    userThemeSlotsActivity.m2008u(bitmap4, this.f47b + 1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0017k(Object obj, int i, Object obj2, int i2) {
        this.f46a = i2;
        this.f48c = obj;
        this.f47b = i;
        this.f49d = obj2;
    }

    public /* synthetic */ RunnableC0017k(Object obj, Object obj2, int i, int i2) {
        this.f46a = i2;
        this.f48c = obj;
        this.f49d = obj2;
        this.f47b = i;
    }
}
