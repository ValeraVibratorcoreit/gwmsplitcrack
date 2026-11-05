package p001A0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.FileProvider;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.altaysoft.t500_split.ClimateTestActivity;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.MyAccessibilityService;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.AbstractC0650r;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.media.InterfaceC0649q;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p003B.AbstractC0035b;
import p006C.AbstractC0062j;
import p016H.C0112d;
import p016H.C0117i;
import p031P.C0264b;
import p046X.C0404d;
import p047X0.C0429b;
import p051Z0.C0454l;
import p052a.AbstractActivityC0472l;
import p052a.C0457C;
import p052a.C0466f;
import p062d0.AbstractC0735h;
import p070g.AbstractActivityC0870i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p070g.ExecutorC0874m;
import p098q0.AbstractC1256E0;
import p098q0.C1245A1;
import p098q0.C1288V;
import p098q0.C1315f1;
import p098q0.C1330k1;
import p098q0.C1344p0;
import p098q0.EnumC1314f0;
import p109u0.AbstractC1540h;
import p109u0.AbstractC1569q1;
import p109u0.C1472C;
import p109u0.C1474D;
import p109u0.C1568q0;
import p109u0.C1576u;
import p109u0.RunnableC1543i;
import p109u0.RunnableC1544i0;
import p109u0.RunnableC1578v;
import p121y0.AbstractC1680h;
import p124z0.RunnableC1704c;

/* renamed from: A0.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0018l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f50a;

    /* renamed from: b */
    public final /* synthetic */ Object f51b;

    /* renamed from: c */
    public final /* synthetic */ Object f52c;

    public /* synthetic */ RunnableC0018l(Object obj, int i, Object obj2) {
        this.f50a = i;
        this.f51b = obj;
        this.f52c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06f2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Context context;
        C0639g c0639g = null;
        int i = 2;
        boolean z2 = false;
        z2 = false;
        int i2 = 1;
        switch (this.f50a) {
            case 0:
                C0021o c0021o = (C0021o) this.f51b;
                String str = (String) this.f52c;
                Context context2 = c0021o.f67g;
                if (context2 != null && AbstractC0015i.m22b(context2, str)) {
                    c0021o.m29a();
                    C0006C m10c = C0006C.m10c(c0021o.f67g);
                    int ordinal = AbstractC1256E0.m3026s(c0021o.f67g).ordinal();
                    m10c.f10b.post(new RunnableC0018l(m10c, i, ordinal != 1 ? ordinal != 2 ? "Привет! Команда?" : "مرحبا! أمر؟" : "Hi! Command?"));
                    return;
                }
                Context context3 = c0021o.f67g;
                if (context3 == null) {
                    return;
                }
                EnumMap enumMap = AbstractC0015i.f43a;
                C0014h m25e = AbstractC0015i.m25e(AbstractC1256E0.m3026s(context3));
                String m24d = AbstractC0015i.m24d(str);
                if (!m24d.isEmpty() && !"[unk]".equals(m24d) && !AbstractC0015i.m22b(context3, str)) {
                    long j2 = cfgData.m1784i().f2555P0;
                    C0013g c0013g = (C0013g) m25e.f42c.get(m24d);
                    if (c0013g == null) {
                        for (Map.Entry entry : m25e.f42c.entrySet()) {
                            if (m24d.contains((CharSequence) entry.getKey())) {
                                C0013g c0013g2 = (C0013g) entry.getValue();
                                if ((j2 & (1 << c0013g2.f35a.f20a)) != 0) {
                                    c0639g = new C0639g(i2, c0013g2);
                                }
                            }
                        }
                    } else if (((1 << c0013g.f35a.f20a) & j2) != 0) {
                        c0639g = new C0639g(i2, c0013g);
                    }
                    if (c0639g != null) {
                        if (!c0021o.m31e() || (context = c0021o.f67g) == null) {
                            return;
                        }
                        C0006C m10c2 = C0006C.m10c(context);
                        m10c2.f10b.post(new RunnableC0018l(m10c2, i, str));
                        return;
                    }
                    if (c0021o.m31e()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!((C0013g) c0639g.f3011g).f36b.equals(c0021o.f76p) || currentTimeMillis - c0021o.f77q >= 1600) {
                            c0021o.f76p = ((C0013g) c0639g.f3011g).f36b;
                            c0021o.f77q = currentTimeMillis;
                            Context context4 = c0021o.f67g;
                            if (context4 != null) {
                                C0006C m10c3 = C0006C.m10c(context4);
                                m10c3.f10b.post(new RunnableC0018l(m10c3, i, "✓ " + ((C0013g) c0639g.f3011g).f37c));
                            }
                            if (!c0021o.f73m && c0021o.f67g != null) {
                                c0021o.f73m = true;
                                try {
                                    ((C0013g) c0639g.f3011g).f39e.mo15d(c0021o.f67g);
                                } catch (Exception unused) {
                                }
                                c0021o.f73m = false;
                            }
                            c0021o.f61a.postDelayed(new RunnableC0016j(c0021o, i), 800L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c0639g = null;
                if (c0639g != null) {
                }
                break;
            case 1:
                int i3 = VoiceSettingsActivity.f3324M;
                VoiceSettingsActivity voiceSettingsActivity = (VoiceSettingsActivity) this.f51b;
                if (voiceSettingsActivity.isFinishing()) {
                    return;
                }
                ArrayList arrayList = (ArrayList) this.f52c;
                if (arrayList.isEmpty()) {
                    voiceSettingsActivity.m2012v(voiceSettingsActivity.getString(R.string.voice_dlg_not_found));
                    voiceSettingsActivity.m2011u();
                    return;
                }
                File file = (File) arrayList.get(0);
                View inflate = LayoutInflater.from(voiceSettingsActivity).inflate(R.layout.dialog_voice_model_confirm, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.txt_voice_model_title);
                TextView textView2 = (TextView) inflate.findViewById(R.id.txt_voice_model_msg);
                AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(R.id.btn_voice_model_go);
                appCompatButton.setText(R.string.voice_btn_load);
                EnumMap enumMap2 = AbstractC0015i.f43a;
                textView.setText(voiceSettingsActivity.getString(R.string.voice_found_title, AbstractC0015i.m23c(AbstractC1256E0.m3026s(voiceSettingsActivity))));
                String string = arrayList.size() > 1 ? voiceSettingsActivity.getString(R.string.voice_found_extra, Integer.valueOf(arrayList.size() - 1)) : "";
                String absolutePath = file.getAbsolutePath();
                EnumC1314f0 m3026s = AbstractC1256E0.m3026s(voiceSettingsActivity);
                File externalFilesDir = voiceSettingsActivity.getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    externalFilesDir = voiceSettingsActivity.getFilesDir();
                }
                textView2.setText(voiceSettingsActivity.getString(R.string.voice_found_msg, absolutePath, new File(externalFilesDir, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s))).getAbsolutePath(), string));
                C0117i c0117i = new C0117i(voiceSettingsActivity, R.style.T500Split_Dialog);
                ((C0863b) c0117i.f369g).f4328i = inflate;
                DialogInterfaceC0867f m365a = c0117i.m365a();
                m365a.setCancelable(true);
                m365a.setCanceledOnTouchOutside(false);
                AbstractC1256E0.m3022o(m365a);
                inflate.findViewById(R.id.btn_voice_model_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate, z2 ? 1 : 0));
                appCompatButton.setOnClickListener(new ViewOnClickListenerC0028v(voiceSettingsActivity, m365a, inflate, file, 0));
                AbstractC1256E0.m3002Q(m365a, inflate);
                return;
            case 2:
                TextView textView3 = ((C0006C) this.f51b).f12d;
                if (textView3 != null) {
                    textView3.setText((CharSequence) this.f52c);
                    return;
                }
                return;
            case 3:
                ((AbstractC0035b) this.f51b).mo53h((Typeface) this.f52c);
                return;
            case 4:
                AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this.f51b;
                C0457C c0457c = (C0457C) this.f52c;
                int i4 = AbstractActivityC0472l.f1500x;
                abstractActivityC0870i.f1501f.m1377a(new C0466f(c0457c, abstractActivityC0870i));
                return;
            case 5:
                C0429b c0429b = (C0429b) this.f51b;
                if (c0429b == null || AbstractC0641i.f3018e != c0429b.f1391f) {
                    return;
                }
                if (((String) c0429b.f1392g).equals(AbstractC0641i.f3015b)) {
                    Boolean bool = (Boolean) this.f52c;
                    if (bool != null && bool.booleanValue()) {
                        z2 = true;
                    }
                    AbstractC0641i.f3016c = Boolean.valueOf(z2);
                    AbstractC0641i.m1890g();
                    return;
                }
                return;
            case 6:
                Context context5 = (Context) this.f51b;
                C0112d c0112d = (C0112d) this.f52c;
                try {
                    SharedPreferences sharedPreferences = context5.getApplicationContext().getSharedPreferences("ym_oauth", 0);
                    String string2 = sharedPreferences.getString("device_id", "");
                    if (string2 != null) {
                        if (string2.length() < 6) {
                        }
                        JSONObject m1926f = AbstractC0650r.m1926f("https://oauth.yandex.ru/device/code", AbstractC0650r.m1923c("client_id", "23cabbbdc6cd418abb4b39c32c41195d", "client_secret", "53bc75238f0c4d08a118e51fe9203300", "scope", "music:content music:read music:write", "device_id", string2, "device_name", "T500Split"));
                        String string3 = m1926f.getString("device_code");
                        String string4 = m1926f.getString("user_code");
                        String optString = m1926f.optString("verification_url", m1926f.optString("verification_uri", "https://ya.ru/device"));
                        int max = Math.max(2, m1926f.optInt("interval", 5));
                        long currentTimeMillis2 = System.currentTimeMillis() + (m1926f.optInt("expires_in", 300) * 1000);
                        AbstractC0650r.m1925e(c0112d, new C0404d(string4, optString));
                        AbstractC0650r.m1924d(context5, string3, max, currentTimeMillis2, c0112d);
                        return;
                    }
                    string2 = "t500split-" + UUID.randomUUID();
                    sharedPreferences.edit().putString("device_id", string2).apply();
                    JSONObject m1926f2 = AbstractC0650r.m1926f("https://oauth.yandex.ru/device/code", AbstractC0650r.m1923c("client_id", "23cabbbdc6cd418abb4b39c32c41195d", "client_secret", "53bc75238f0c4d08a118e51fe9203300", "scope", "music:content music:read music:write", "device_id", string2, "device_name", "T500Split"));
                    String string32 = m1926f2.getString("device_code");
                    String string42 = m1926f2.getString("user_code");
                    String optString2 = m1926f2.optString("verification_url", m1926f2.optString("verification_uri", "https://ya.ru/device"));
                    int max2 = Math.max(2, m1926f2.optInt("interval", 5));
                    long currentTimeMillis22 = System.currentTimeMillis() + (m1926f2.optInt("expires_in", 300) * 1000);
                    AbstractC0650r.m1925e(c0112d, new C0404d(string42, optString2));
                    AbstractC0650r.m1924d(context5, string32, max2, currentTimeMillis22, c0112d);
                    return;
                } catch (Exception e2) {
                    AbstractC0650r.f3069c = false;
                    AbstractC0650r.m1925e(c0112d, new C0264b(e2));
                    return;
                }
            case 7:
                ((InterfaceC0649q) this.f51b).mo19e((C0112d) this.f52c);
                return;
            case 8:
                ((ProfileInstallerInitializer) this.f51b).getClass();
                AbstractC0735h.m2186a(Looper.getMainLooper()).postDelayed(new RunnableC0011e((Context) this.f52c, i2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case Platform.GNU /* 9 */:
                Runnable runnable = (Runnable) this.f52c;
                ExecutorC0874m executorC0874m = (ExecutorC0874m) this.f51b;
                executorC0874m.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0874m.m2415a();
                }
            case Platform.KFREEBSD /* 10 */:
                try {
                    ((WindowManager) this.f51b).removeView((View) this.f52c);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case Platform.NETBSD /* 11 */:
                ClimateTestActivity climateTestActivity = (ClimateTestActivity) this.f51b;
                Runnable runnable2 = (Runnable) this.f52c;
                int i5 = ClimateTestActivity.f2265I;
                climateTestActivity.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    climateTestActivity.f2269H = false;
                }
            case Platform.DRAGONFLYBSD /* 12 */:
                DialogInterfaceC0867f dialogInterfaceC0867f = (DialogInterfaceC0867f) this.f51b;
                if (dialogInterfaceC0867f != null) {
                    try {
                        if (dialogInterfaceC0867f.isShowing()) {
                            dialogInterfaceC0867f.dismiss();
                        }
                    } catch (RuntimeException unused3) {
                    }
                }
                RunnableC1704c runnableC1704c = (RunnableC1704c) this.f52c;
                if (runnableC1704c != null) {
                    runnableC1704c.run();
                    return;
                }
                return;
            case 13:
                View view = C1288V.f5998F;
                View view2 = (View) this.f52c;
                C1288V c1288v = (C1288V) this.f51b;
                if (view != view2) {
                    c1288v.getClass();
                    return;
                } else {
                    if (c1288v.f6020p) {
                        c1288v.m3144u();
                        return;
                    }
                    return;
                }
            case 14:
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                MainActivity mainActivity = (MainActivity) this.f51b;
                if (mainActivity.isFinishing() || mainActivity.isDestroyed()) {
                    return;
                }
                AbstractC1569q1.m4464p(mainActivity, (String) this.f52c);
                return;
            case 15:
                MyAccessibilityService myAccessibilityService = MyAccessibilityService.f2328m;
                ((MyAccessibilityService) this.f51b).startService((Intent) this.f52c);
                return;
            case DLLCallback.DLL_FPTRS /* 16 */:
                RunnableC0024r runnableC0024r = (RunnableC0024r) this.f52c;
                C1344p0 c1344p0 = (C1344p0) this.f51b;
                c1344p0.getClass();
                Looper.prepare();
                try {
                    c1344p0.f6321b.m1398g(c1344p0.f6320a.m1928a(C1344p0.f6318h));
                } catch (Exception unused4) {
                } catch (Throwable th) {
                    C1344p0.m3240b(runnableC0024r);
                    throw th;
                }
                C1344p0.m3240b(runnableC0024r);
                return;
            case 17:
                String str2 = (String) this.f52c;
                Context context6 = ((C1344p0) this.f51b).f6324e;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(FileProvider.m1335d(context6, "DMPTools.provider", new File(str2)), "application/vnd.android.package-archive");
                    intent.setFlags(268435457);
                    context6.startActivity(intent);
                    carData.getInstance().f2468q.m1398g(Boolean.FALSE);
                    return;
                } catch (Exception unused5) {
                    return;
                }
            case 18:
                TextView textView4 = (TextView) this.f51b;
                int width = (textView4.getWidth() - textView4.getPaddingLeft()) - textView4.getPaddingRight();
                CharSequence charSequence = (CharSequence) this.f52c;
                if (width <= 0) {
                    textView4.setText(charSequence);
                    return;
                } else {
                    textView4.setText(TextUtils.ellipsize(charSequence, textView4.getPaint(), width, TextUtils.TruncateAt.END));
                    return;
                }
            case 19:
                C0454l c0454l = (C0454l) this.f51b;
                c0454l.m1163b();
                ArrayList arrayList2 = (ArrayList) ((C1315f1) this.f52c).f6118f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                HashMap hashMap = new HashMap();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C1330k1 c1330k1 = (C1330k1) it.next();
                    List list = (List) hashMap.get(Integer.valueOf(c1330k1.f6279a));
                    if (list == null) {
                        list = new ArrayList();
                        hashMap.put(Integer.valueOf(c1330k1.f6279a), list);
                    }
                    list.add(c1330k1.f6280b);
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    Integer num = (Integer) entry2.getKey();
                    int intValue = num.intValue();
                    List list2 = (List) entry2.getValue();
                    Context context7 = (Context) c0454l.f1452b;
                    try {
                        DisplayManager displayManager = (DisplayManager) context7.getSystemService("display");
                        Display display = displayManager != null ? displayManager.getDisplay(intValue) : null;
                        if (display != null) {
                            Context createDisplayContext = context7.createDisplayContext(display);
                            WindowManager windowManager = (WindowManager) createDisplayContext.getSystemService("window");
                            if (windowManager != null) {
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                display.getRealMetrics(displayMetrics);
                                cfgData m1784i = cfgData.m1784i();
                                int m2990E = intValue == 0 ? AbstractC1256E0.m2990E(m1784i) : 0;
                                int i6 = intValue == 0 ? m1784i.f2531J0 : 0;
                                C1245A1 c1245a1 = new C1245A1(createDisplayContext);
                                ArrayList arrayList3 = c1245a1.f5552l;
                                arrayList3.clear();
                                if (list2 != null) {
                                    arrayList3.addAll(list2);
                                }
                                c1245a1.invalidate();
                                c1245a1.setVisibility(c0454l.f1451a ? 0 : 8);
                                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(displayMetrics.widthPixels + m2990E, displayMetrics.heightPixels + i6, 2038, 536, -3);
                                layoutParams.gravity = 8388659;
                                layoutParams.x = -m2990E;
                                layoutParams.y = -i6;
                                windowManager.addView(c1245a1, layoutParams);
                                ((HashMap) c0454l.f1454d).put(num, windowManager);
                                ((HashMap) c0454l.f1455e).put(num, c1245a1);
                            }
                        }
                    } catch (Exception unused6) {
                    }
                }
                return;
            case 20:
                FrameLayout frameLayout = (FrameLayout) ((ViewGroup) this.f51b);
                View view3 = (View) this.f52c;
                int height = view3.getHeight();
                if (height <= 0) {
                    return;
                }
                View findViewById = frameLayout.findViewById(R.id.ip_legacy_bottom_cover);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AbstractC1540h.f8257a, 8388659);
                layoutParams2.topMargin = height;
                if (findViewById == null) {
                    findViewById = new View(frameLayout.getContext());
                    findViewById.setId(R.id.ip_legacy_bottom_cover);
                    findViewById.setBackgroundColor(-16777216);
                    findViewById.setClickable(false);
                    findViewById.setFocusable(false);
                    int indexOfChild = frameLayout.indexOfChild(view3);
                    frameLayout.addView(findViewById, indexOfChild >= 0 ? indexOfChild + 1 : frameLayout.getChildCount(), layoutParams2);
                } else {
                    findViewById.setLayoutParams(layoutParams2);
                    int indexOfChild2 = frameLayout.indexOfChild(view3);
                    int childCount = indexOfChild2 >= 0 ? indexOfChild2 + 1 : frameLayout.getChildCount();
                    if (frameLayout.indexOfChild(findViewById) != childCount) {
                        frameLayout.removeView(findViewById);
                        frameLayout.addView(findViewById, Math.min(childCount, frameLayout.getChildCount()), layoutParams2);
                    }
                }
                findViewById.setVisibility(0);
                return;
            case 21:
                ((C1576u) this.f51b).m4512I((TextView) this.f52c);
                return;
            case 22:
                C1576u c1576u = (C1576u) this.f51b;
                c1576u.getClass();
                ImageView imageView = (ImageView) this.f52c;
                if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
                    imageView.post(new RunnableC1543i(c1576u, 19));
                    return;
                }
                c1576u.f8785k1 = (imageView.getWidth() * 0.5f) + imageView.getLeft();
                c1576u.f8788l1 = (imageView.getHeight() * 0.5f) + imageView.getTop();
                c1576u.f8791m1 = true;
                return;
            case 23:
                ((C1576u) this.f51b).m4542c((RunnableC1543i) this.f52c);
                return;
            case 24:
                ((C1474D) this.f51b).m3583y((TextView) this.f52c);
                return;
            case 25:
                ImageView imageView2 = (ImageView) this.f51b;
                if (imageView2.getWidth() <= 0) {
                    return;
                }
                imageView2.setPivotY(AbstractC0062j.m153g(imageView2.getWidth(), 0.5f, imageView2) * 0.5f);
                ((C1472C) this.f52c).m3499a(imageView2);
                return;
            case 26:
                C1474D c1474d = (C1474D) this.f51b;
                c1474d.getClass();
                ImageView imageView3 = (ImageView) this.f52c;
                if (imageView3.getWidth() <= 0 || imageView3.getHeight() <= 0) {
                    imageView3.post(new RunnableC1578v(c1474d, 11));
                    return;
                }
                c1474d.f7212M0 = (imageView3.getWidth() * 0.5f) + imageView3.getLeft();
                c1474d.f7214N0 = (imageView3.getHeight() * 0.5f) + imageView3.getTop();
                c1474d.f7216O0 = true;
                return;
            case 27:
                ((C1568q0) this.f51b).m4351G((TextView) this.f52c);
                return;
            case 28:
                C1568q0 c1568q0 = (C1568q0) this.f51b;
                c1568q0.getClass();
                ImageView imageView4 = (ImageView) this.f52c;
                if (imageView4.getWidth() <= 0 || imageView4.getHeight() <= 0) {
                    imageView4.post(new RunnableC1544i0(c1568q0, 21));
                    return;
                }
                c1568q0.f8587W0 = (imageView4.getWidth() * 0.5f) + imageView4.getLeft();
                c1568q0.f8589X0 = (imageView4.getHeight() * 0.5f) + imageView4.getTop();
                c1568q0.f8591Y0 = true;
                return;
            default:
                ((C1568q0) this.f51b).m4383c((RunnableC1544i0) this.f52c);
                return;
        }
    }
}
