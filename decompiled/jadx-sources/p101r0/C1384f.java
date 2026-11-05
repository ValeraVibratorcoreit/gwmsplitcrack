package p101r0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.ClimateTestActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p001A0.ViewOnClickListenerC0027u;
import p016H.C0117i;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0396Y;
import p046X.C0427z;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p097q.AbstractC1241e;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.C1337n;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p121y0.C1683k;

/* renamed from: r0.f */
/* loaded from: classes.dex */
public class C1384f extends AbstractComponentCallbacksC0423v {

    /* renamed from: Z */
    public final carData f6478Z = carData.getInstance();

    /* renamed from: a0 */
    public TextView f6479a0;

    /* renamed from: b0 */
    public TextView f6480b0;

    /* renamed from: c0 */
    public TextView f6481c0;

    /* renamed from: d0 */
    public TextView f6482d0;

    /* renamed from: e0 */
    public TextView f6483e0;

    /* renamed from: f0 */
    public TextView f6484f0;

    /* renamed from: g0 */
    public TextView f6485g0;

    /* renamed from: h0 */
    public TextView f6486h0;

    /* renamed from: i0 */
    public TextView f6487i0;

    /* renamed from: j0 */
    public EditText f6488j0;

    /* renamed from: k0 */
    public EditText f6489k0;

    /* renamed from: l0 */
    public Button f6490l0;

    /* renamed from: m0 */
    public Button f6491m0;

    /* renamed from: n0 */
    public Button f6492n0;

    /* renamed from: o0 */
    public Button f6493o0;

    /* renamed from: p0 */
    public TextView f6494p0;

    /* renamed from: q0 */
    public View f6495q0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: O */
    public final void m3327O() {
        String str;
        try {
            PackageInfo packageInfo = m1124g().getPackageManager().getPackageInfo(m1124g().getPackageName(), 0);
            cfgData cfgdata = CFG4.f2728F;
            String m1130m = cfgdata.f2513E3 == 2 ? m1130m(R.string.freeVersion) : "";
            if (cfgdata.f2513E3 == 3) {
                m1130m = m1130m(R.string.fullVersion);
            }
            if (cfgdata.f2513E3 == 1) {
                m1130m = m1130m(R.string.demoVersion) + " " + m1130m(R.string.daysRemain) + cfgdata.f2640i1;
            }
            String str2 = packageInfo.versionName;
            String trim = str2 != null ? str2.trim() : "";
            long longVersionCode = packageInfo.getLongVersionCode();
            this.f6479a0.setText(" Ver. " + longVersionCode + " (name: " + trim + ", " + m1130m + ")");
            String str3 = cfgdata.f2650k1;
            if (this.f6480b0 != null) {
                if (str3 == null || str3.isEmpty()) {
                    this.f6480b0.setVisibility(8);
                } else {
                    this.f6480b0.setVisibility(0);
                    this.f6480b0.setText(m1129l().getString(R.string.hut_firmware_version, str3));
                }
            }
            StringBuilder sb = new StringBuilder("Model: ");
            sb.append(cfgdata.f2543M0.f7146e);
            sb.append(" Car ID: ");
            try {
                str = AbstractC1372y1.m3312r("persist.gwm.vehicle.vin");
            } catch (Throwable unused) {
                str = "UNKNOWN";
            }
            sb.append(AbstractC1372y1.m3279J(str));
            String sb2 = sb.toString();
            if (cfgdata.f2508D3 != 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" Partner: ");
                String str4 = "@Reldus";
                switch (cfgdata.f2508D3) {
                    case 1:
                        str4 = "NOT_SET";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 2:
                        str4 = "DMPTools";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 3:
                        str4 = "AsiaForce";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 4:
                        str4 = "@azinovin";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 5:
                        str4 = "@al_efimov";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 6:
                    case 36:
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 7:
                        str4 = "@zx300rts";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 8:
                        str4 = "@NIKROMANG";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case Platform.GNU /* 9 */:
                        str4 = "@ORO1986";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        str4 = "@forevapro";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case Platform.NETBSD /* 11 */:
                        str4 = "@Deni2022";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        str4 = "@khalid1313";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 13:
                        str4 = "secret";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 14:
                        str4 = "@rb_developer";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 15:
                        str4 = "@magmir_com";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        str4 = "@Koiv1981";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 17:
                        str4 = "@TEST";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 18:
                        str4 = "@ProChip51";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 19:
                        str4 = "@Mohammad1";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 20:
                        str4 = "@Mohammad2";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 21:
                        str4 = "@Appas";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 22:
                        str4 = "@Vladimir_0I";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 23:
                        str4 = "@bo3liwe";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 24:
                        str4 = "@Abdulaziz";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 25:
                        str4 = "@LRA_P";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 26:
                        str4 = "@Abdullah";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 27:
                        str4 = "@Aumar";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 28:
                        str4 = "@BuMaktoum";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 29:
                        str4 = "@Kasyanich";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 30:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        str4 = "@rez";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 31:
                        str4 = "ArcticTrucks";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 37:
                        str4 = "@prostoierei";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 38:
                        str4 = "@knrea1";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 39:
                        str4 = "@Waleed";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 40:
                        str4 = "@Salamah";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 41:
                        str4 = "@Mansour";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 42:
                        str4 = "@Faisal";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 43:
                        str4 = "@Ali";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 44:
                        str4 = "@Amgad";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 45:
                        str4 = "@Aaalgaaed";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 46:
                        str4 = "@Atif";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    case 47:
                        str4 = "@Adel";
                        sb3.append(str4);
                        sb3.append("(");
                        sb3.append(cfgdata.f2605b1);
                        sb3.append(")");
                        sb2 = sb3.toString();
                        break;
                    default:
                        throw null;
                }
            }
            this.f6481c0.setText(sb2);
            this.f6486h0 = (TextView) this.f6495q0.findViewById(R.id.partner_txt_id_id);
            this.f6487i0 = (TextView) this.f6495q0.findViewById(R.id.partner_txt_psw_id);
            this.f6488j0 = (EditText) this.f6495q0.findViewById(R.id.partner_edit_id_id);
            this.f6489k0 = (EditText) this.f6495q0.findViewById(R.id.partner_edit_psw_id);
            this.f6490l0 = (Button) this.f6495q0.findViewById(R.id.partner_btn_id);
            this.f6491m0 = (Button) this.f6495q0.findViewById(R.id.payment_btn);
            this.f6494p0 = (TextView) this.f6495q0.findViewById(R.id.textViewGWM);
            this.f6486h0.setVisibility(4);
            this.f6487i0.setVisibility(4);
            this.f6488j0.setVisibility(4);
            this.f6489k0.setVisibility(4);
            this.f6490l0.setVisibility(4);
            if (cfgdata.f2508D3 == 3 || cfgdata.f2610c1 > 1) {
                this.f6491m0.setVisibility(4);
            }
            if (cfgdata.f2508D3 == 36 || cfgdata.f2610c1 > 1) {
                this.f6491m0.setVisibility(4);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: P */
    public final void m3328P(int i, boolean z2) {
        String m1130m = m1130m(R.string.Message);
        int m2943b = AbstractC1241e.m2943b(i);
        AbstractC1372y1.m3288S(m1124g(), m1130m, m2943b != 0 ? m2943b != 1 ? m2943b != 3 ? m2943b != 4 ? z2 ? m1130m(R.string.settings_load_failed) : m1130m(R.string.settings_save_failed) : m1130m(R.string.settings_load_invalid) : m1129l().getString(R.string.settings_file_not_found, "Download/gwm_split_settings.json") : m1130m(R.string.noWriteStoragePermission) : z2 ? m1130m(R.string.settings_load_ok) : m1129l().getString(R.string.settings_save_ok, "Download/gwm_split_settings.json"), null);
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: w */
    public final void mo1114w(Bundle bundle) {
        super.mo1114w(bundle);
        Bundle bundle2 = this.f1362k;
        if (bundle2 != null) {
            bundle2.getString("param1");
            this.f1362k.getString("param2");
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: x */
    public final View mo1138x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_settings_about, viewGroup, false);
        this.f6495q0 = inflate;
        this.f6479a0 = (TextView) inflate.findViewById(R.id.textView_version);
        this.f6480b0 = (TextView) this.f6495q0.findViewById(R.id.textView_hut_firmware);
        this.f6481c0 = (TextView) this.f6495q0.findViewById(R.id.textView_carId);
        this.f6482d0 = (TextView) this.f6495q0.findViewById(R.id.textView_debug_trace_1);
        this.f6483e0 = (TextView) this.f6495q0.findViewById(R.id.textView_debug_trace_2);
        this.f6484f0 = (TextView) this.f6495q0.findViewById(R.id.textView_debug_trace_3);
        this.f6485g0 = (TextView) this.f6495q0.findViewById(R.id.textView_debug_trace_4);
        Drawable drawable = ((ImageView) this.f6495q0.findViewById(R.id.imageViewCube)).getDrawable();
        if (drawable instanceof AnimatedImageDrawable) {
            ((AnimatedImageDrawable) drawable).start();
        }
        m3327O();
        this.f6494p0.setOnClickListener(new ViewOnClickListenerC1383e(this, 0));
        this.f6490l0.setOnClickListener(new ViewOnClickListenerC1383e(this, 1));
        this.f6492n0 = (Button) this.f6495q0.findViewById(R.id.btn_save_settings);
        this.f6493o0 = (Button) this.f6495q0.findViewById(R.id.btn_load_settings);
        final int i = 0;
        this.f6492n0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.b

            /* renamed from: g */
            public final /* synthetic */ C1384f f6468g;

            {
                this.f6468g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        final C1384f c1384f = this.f6468g;
                        final View inflate2 = LayoutInflater.from(c1384f.m1119K()).inflate(R.layout.dialog_settings_save_confirm, (ViewGroup) null);
                        ((TextView) inflate2.findViewById(R.id.txt_save_confirm_msg)).setText(c1384f.m1129l().getString(R.string.settings_save_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i = new C0117i(c1384f.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i.f369g).f4328i = inflate2;
                        final DialogInterfaceC0867f m365a = c0117i.m365a();
                        m365a.setCancelable(true);
                        m365a.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a);
                        inflate2.findViewById(R.id.btn_save_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate2, 3));
                        final int i2 = 1;
                        inflate2.findViewById(R.id.btn_save_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i3;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i4 = 3;
                                switch (i2) {
                                    case 0:
                                        C1384f c1384f2 = c1384f;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a;
                                        View view3 = inflate2;
                                        c1384f2.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f2.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i3 = 1;
                                                        } else {
                                                            i3 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i3 = 5;
                                            } else {
                                                i3 = 4;
                                            }
                                        } else {
                                            i3 = 2;
                                        }
                                        if (i3 == 1) {
                                            c1384f2.m3327O();
                                        }
                                        c1384f2.m3328P(i3, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a, inflate2, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file5.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5), StandardCharsets.UTF_8));
                                                                bufferedWriter.write(jSONObject2.toString(2));
                                                                bufferedWriter.close();
                                                                i4 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file52 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file52.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52), StandardCharsets.UTF_8));
                                                        bufferedWriter2.write(jSONObject2.toString(2));
                                                        bufferedWriter2.close();
                                                        i4 = 1;
                                                    }
                                                    bufferedWriter2.write(jSONObject2.toString(2));
                                                    bufferedWriter2.close();
                                                    i4 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file522 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file522.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter22 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i4 = 2;
                                        }
                                        c1384f3.m3328P(i4, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a, inflate2);
                        return;
                    case 1:
                        final C1384f c1384f2 = this.f6468g;
                        final View inflate3 = LayoutInflater.from(c1384f2.m1119K()).inflate(R.layout.dialog_settings_load_confirm, (ViewGroup) null);
                        ((TextView) inflate3.findViewById(R.id.txt_load_confirm_msg)).setText(c1384f2.m1129l().getString(R.string.settings_load_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i2 = new C0117i(c1384f2.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i2.f369g).f4328i = inflate3;
                        final DialogInterfaceC0867f m365a2 = c0117i2.m365a();
                        m365a2.setCancelable(true);
                        m365a2.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a2);
                        inflate3.findViewById(R.id.btn_load_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a2, inflate3, 2));
                        final int i3 = 0;
                        inflate3.findViewById(R.id.btn_load_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i32;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i4 = 3;
                                switch (i3) {
                                    case 0:
                                        C1384f c1384f22 = c1384f2;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a2;
                                        View view3 = inflate3;
                                        c1384f22.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f22.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i32 = 1;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i32 = 5;
                                            } else {
                                                i32 = 4;
                                            }
                                        } else {
                                            i32 = 2;
                                        }
                                        if (i32 == 1) {
                                            c1384f22.m3327O();
                                        }
                                        c1384f22.m3328P(i32, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f2;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a2, inflate3, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file522 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file522.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter22 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522), StandardCharsets.UTF_8));
                                                                bufferedWriter22.write(jSONObject2.toString(2));
                                                                bufferedWriter22.close();
                                                                i4 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file5222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file5222.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5222), StandardCharsets.UTF_8));
                                                        bufferedWriter222.write(jSONObject2.toString(2));
                                                        bufferedWriter222.close();
                                                        i4 = 1;
                                                    }
                                                    bufferedWriter222.write(jSONObject2.toString(2));
                                                    bufferedWriter222.close();
                                                    i4 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file52222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file52222.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter2222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52222), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i4 = 2;
                                        }
                                        c1384f3.m3328P(i4, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a2, inflate3);
                        return;
                    case 2:
                        C1384f c1384f3 = this.f6468g;
                        c1384f3.getClass();
                        Intent intent = new Intent(c1384f3.m1119K(), (Class<?>) ClimateTestActivity.class);
                        C0427z c0427z = c1384f3.f1375x;
                        if (c0427z != null) {
                            c0427z.f1385l.startActivity(intent, null);
                            return;
                        }
                        throw new IllegalStateException("Fragment " + c1384f3 + " not attached to Activity");
                    default:
                        Boolean bool = Boolean.TRUE;
                        carData cardata = this.f6468g.f6478Z;
                        if (bool.equals(Boolean.valueOf(cardata.getDebugTraceEnabled()))) {
                            return;
                        }
                        cardata.setDebugTraceEnabled(true);
                        return;
                }
            }
        });
        final int i2 = 1;
        this.f6493o0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.b

            /* renamed from: g */
            public final /* synthetic */ C1384f f6468g;

            {
                this.f6468g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        final C1384f c1384f = this.f6468g;
                        final View inflate2 = LayoutInflater.from(c1384f.m1119K()).inflate(R.layout.dialog_settings_save_confirm, (ViewGroup) null);
                        ((TextView) inflate2.findViewById(R.id.txt_save_confirm_msg)).setText(c1384f.m1129l().getString(R.string.settings_save_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i = new C0117i(c1384f.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i.f369g).f4328i = inflate2;
                        final DialogInterfaceC0867f m365a = c0117i.m365a();
                        m365a.setCancelable(true);
                        m365a.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a);
                        inflate2.findViewById(R.id.btn_save_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate2, 3));
                        final int i22 = 1;
                        inflate2.findViewById(R.id.btn_save_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i32;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i4 = 3;
                                switch (i22) {
                                    case 0:
                                        C1384f c1384f22 = c1384f;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a;
                                        View view3 = inflate2;
                                        c1384f22.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f22.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i32 = 1;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i32 = 5;
                                            } else {
                                                i32 = 4;
                                            }
                                        } else {
                                            i32 = 2;
                                        }
                                        if (i32 == 1) {
                                            c1384f22.m3327O();
                                        }
                                        c1384f22.m3328P(i32, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a, inflate2, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file52222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file52222.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter2222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52222), StandardCharsets.UTF_8));
                                                                bufferedWriter2222.write(jSONObject2.toString(2));
                                                                bufferedWriter2222.close();
                                                                i4 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file522222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file522222.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter22222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522222), StandardCharsets.UTF_8));
                                                        bufferedWriter22222.write(jSONObject2.toString(2));
                                                        bufferedWriter22222.close();
                                                        i4 = 1;
                                                    }
                                                    bufferedWriter22222.write(jSONObject2.toString(2));
                                                    bufferedWriter22222.close();
                                                    i4 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file5222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file5222222.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5222222), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i4 = 2;
                                        }
                                        c1384f3.m3328P(i4, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a, inflate2);
                        return;
                    case 1:
                        final C1384f c1384f2 = this.f6468g;
                        final View inflate3 = LayoutInflater.from(c1384f2.m1119K()).inflate(R.layout.dialog_settings_load_confirm, (ViewGroup) null);
                        ((TextView) inflate3.findViewById(R.id.txt_load_confirm_msg)).setText(c1384f2.m1129l().getString(R.string.settings_load_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i2 = new C0117i(c1384f2.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i2.f369g).f4328i = inflate3;
                        final DialogInterfaceC0867f m365a2 = c0117i2.m365a();
                        m365a2.setCancelable(true);
                        m365a2.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a2);
                        inflate3.findViewById(R.id.btn_load_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a2, inflate3, 2));
                        final int i3 = 0;
                        inflate3.findViewById(R.id.btn_load_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i32;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i4 = 3;
                                switch (i3) {
                                    case 0:
                                        C1384f c1384f22 = c1384f2;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a2;
                                        View view3 = inflate3;
                                        c1384f22.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f22.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i32 = 1;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i32 = 5;
                                            } else {
                                                i32 = 4;
                                            }
                                        } else {
                                            i32 = 2;
                                        }
                                        if (i32 == 1) {
                                            c1384f22.m3327O();
                                        }
                                        c1384f22.m3328P(i32, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f2;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a2, inflate3, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file5222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file5222222.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5222222), StandardCharsets.UTF_8));
                                                                bufferedWriter222222.write(jSONObject2.toString(2));
                                                                bufferedWriter222222.close();
                                                                i4 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file52222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file52222222.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter2222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52222222), StandardCharsets.UTF_8));
                                                        bufferedWriter2222222.write(jSONObject2.toString(2));
                                                        bufferedWriter2222222.close();
                                                        i4 = 1;
                                                    }
                                                    bufferedWriter2222222.write(jSONObject2.toString(2));
                                                    bufferedWriter2222222.close();
                                                    i4 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file522222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file522222222.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter22222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522222222), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i4 = 2;
                                        }
                                        c1384f3.m3328P(i4, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a2, inflate3);
                        return;
                    case 2:
                        C1384f c1384f3 = this.f6468g;
                        c1384f3.getClass();
                        Intent intent = new Intent(c1384f3.m1119K(), (Class<?>) ClimateTestActivity.class);
                        C0427z c0427z = c1384f3.f1375x;
                        if (c0427z != null) {
                            c0427z.f1385l.startActivity(intent, null);
                            return;
                        }
                        throw new IllegalStateException("Fragment " + c1384f3 + " not attached to Activity");
                    default:
                        Boolean bool = Boolean.TRUE;
                        carData cardata = this.f6468g.f6478Z;
                        if (bool.equals(Boolean.valueOf(cardata.getDebugTraceEnabled()))) {
                            return;
                        }
                        cardata.setDebugTraceEnabled(true);
                        return;
                }
            }
        });
        final int i3 = 2;
        this.f6495q0.findViewById(R.id.btn_climate_test).setOnClickListener(new View.OnClickListener(this) { // from class: r0.b

            /* renamed from: g */
            public final /* synthetic */ C1384f f6468g;

            {
                this.f6468g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        final C1384f c1384f = this.f6468g;
                        final View inflate2 = LayoutInflater.from(c1384f.m1119K()).inflate(R.layout.dialog_settings_save_confirm, (ViewGroup) null);
                        ((TextView) inflate2.findViewById(R.id.txt_save_confirm_msg)).setText(c1384f.m1129l().getString(R.string.settings_save_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i = new C0117i(c1384f.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i.f369g).f4328i = inflate2;
                        final DialogInterfaceC0867f m365a = c0117i.m365a();
                        m365a.setCancelable(true);
                        m365a.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a);
                        inflate2.findViewById(R.id.btn_save_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate2, 3));
                        final int i22 = 1;
                        inflate2.findViewById(R.id.btn_save_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i32;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i4 = 3;
                                switch (i22) {
                                    case 0:
                                        C1384f c1384f22 = c1384f;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a;
                                        View view3 = inflate2;
                                        c1384f22.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f22.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i32 = 1;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i32 = 5;
                                            } else {
                                                i32 = 4;
                                            }
                                        } else {
                                            i32 = 2;
                                        }
                                        if (i32 == 1) {
                                            c1384f22.m3327O();
                                        }
                                        c1384f22.m3328P(i32, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a, inflate2, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file522222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file522222222.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter22222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522222222), StandardCharsets.UTF_8));
                                                                bufferedWriter22222222.write(jSONObject2.toString(2));
                                                                bufferedWriter22222222.close();
                                                                i4 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file5222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file5222222222.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5222222222), StandardCharsets.UTF_8));
                                                        bufferedWriter222222222.write(jSONObject2.toString(2));
                                                        bufferedWriter222222222.close();
                                                        i4 = 1;
                                                    }
                                                    bufferedWriter222222222.write(jSONObject2.toString(2));
                                                    bufferedWriter222222222.close();
                                                    i4 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file52222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file52222222222.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter2222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52222222222), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i4 = 2;
                                        }
                                        c1384f3.m3328P(i4, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a, inflate2);
                        return;
                    case 1:
                        final C1384f c1384f2 = this.f6468g;
                        final View inflate3 = LayoutInflater.from(c1384f2.m1119K()).inflate(R.layout.dialog_settings_load_confirm, (ViewGroup) null);
                        ((TextView) inflate3.findViewById(R.id.txt_load_confirm_msg)).setText(c1384f2.m1129l().getString(R.string.settings_load_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i2 = new C0117i(c1384f2.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i2.f369g).f4328i = inflate3;
                        final DialogInterfaceC0867f m365a2 = c0117i2.m365a();
                        m365a2.setCancelable(true);
                        m365a2.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a2);
                        inflate3.findViewById(R.id.btn_load_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a2, inflate3, 2));
                        final int i32 = 0;
                        inflate3.findViewById(R.id.btn_load_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i322;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i4 = 3;
                                switch (i32) {
                                    case 0:
                                        C1384f c1384f22 = c1384f2;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a2;
                                        View view3 = inflate3;
                                        c1384f22.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f22.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i322 = 1;
                                                        } else {
                                                            i322 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i322 = 5;
                                            } else {
                                                i322 = 4;
                                            }
                                        } else {
                                            i322 = 2;
                                        }
                                        if (i322 == 1) {
                                            c1384f22.m3327O();
                                        }
                                        c1384f22.m3328P(i322, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f2;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a2, inflate3, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file52222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file52222222222.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter2222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52222222222), StandardCharsets.UTF_8));
                                                                bufferedWriter2222222222.write(jSONObject2.toString(2));
                                                                bufferedWriter2222222222.close();
                                                                i4 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file522222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file522222222222.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter22222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522222222222), StandardCharsets.UTF_8));
                                                        bufferedWriter22222222222.write(jSONObject2.toString(2));
                                                        bufferedWriter22222222222.close();
                                                        i4 = 1;
                                                    }
                                                    bufferedWriter22222222222.write(jSONObject2.toString(2));
                                                    bufferedWriter22222222222.close();
                                                    i4 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file5222222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file5222222222222.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter222222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5222222222222), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i4 = 2;
                                        }
                                        c1384f3.m3328P(i4, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a2, inflate3);
                        return;
                    case 2:
                        C1384f c1384f3 = this.f6468g;
                        c1384f3.getClass();
                        Intent intent = new Intent(c1384f3.m1119K(), (Class<?>) ClimateTestActivity.class);
                        C0427z c0427z = c1384f3.f1375x;
                        if (c0427z != null) {
                            c0427z.f1385l.startActivity(intent, null);
                            return;
                        }
                        throw new IllegalStateException("Fragment " + c1384f3 + " not attached to Activity");
                    default:
                        Boolean bool = Boolean.TRUE;
                        carData cardata = this.f6468g.f6478Z;
                        if (bool.equals(Boolean.valueOf(cardata.getDebugTraceEnabled()))) {
                            return;
                        }
                        cardata.setDebugTraceEnabled(true);
                        return;
                }
            }
        });
        final int i4 = 3;
        this.f6479a0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.b

            /* renamed from: g */
            public final /* synthetic */ C1384f f6468g;

            {
                this.f6468g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        final C1384f c1384f = this.f6468g;
                        final View inflate2 = LayoutInflater.from(c1384f.m1119K()).inflate(R.layout.dialog_settings_save_confirm, (ViewGroup) null);
                        ((TextView) inflate2.findViewById(R.id.txt_save_confirm_msg)).setText(c1384f.m1129l().getString(R.string.settings_save_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i = new C0117i(c1384f.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i.f369g).f4328i = inflate2;
                        final DialogInterfaceC0867f m365a = c0117i.m365a();
                        m365a.setCancelable(true);
                        m365a.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a);
                        inflate2.findViewById(R.id.btn_save_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate2, 3));
                        final int i22 = 1;
                        inflate2.findViewById(R.id.btn_save_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i322;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i42 = 3;
                                switch (i22) {
                                    case 0:
                                        C1384f c1384f22 = c1384f;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a;
                                        View view3 = inflate2;
                                        c1384f22.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f22.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i322 = 1;
                                                        } else {
                                                            i322 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i322 = 5;
                                            } else {
                                                i322 = 4;
                                            }
                                        } else {
                                            i322 = 2;
                                        }
                                        if (i322 == 1) {
                                            c1384f22.m3327O();
                                        }
                                        c1384f22.m3328P(i322, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a, inflate2, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file5222222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file5222222222222.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter222222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5222222222222), StandardCharsets.UTF_8));
                                                                bufferedWriter222222222222.write(jSONObject2.toString(2));
                                                                bufferedWriter222222222222.close();
                                                                i42 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file52222222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file52222222222222.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter2222222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52222222222222), StandardCharsets.UTF_8));
                                                        bufferedWriter2222222222222.write(jSONObject2.toString(2));
                                                        bufferedWriter2222222222222.close();
                                                        i42 = 1;
                                                    }
                                                    bufferedWriter2222222222222.write(jSONObject2.toString(2));
                                                    bufferedWriter2222222222222.close();
                                                    i42 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file522222222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file522222222222222.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter22222222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522222222222222), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i42 = 2;
                                        }
                                        c1384f3.m3328P(i42, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a, inflate2);
                        return;
                    case 1:
                        final C1384f c1384f2 = this.f6468g;
                        final View inflate3 = LayoutInflater.from(c1384f2.m1119K()).inflate(R.layout.dialog_settings_load_confirm, (ViewGroup) null);
                        ((TextView) inflate3.findViewById(R.id.txt_load_confirm_msg)).setText(c1384f2.m1129l().getString(R.string.settings_load_confirm_message, "Download/gwm_split_settings.json"));
                        C0117i c0117i2 = new C0117i(c1384f2.m1119K(), R.style.T500Split_Dialog);
                        ((C0863b) c0117i2.f369g).f4328i = inflate3;
                        final DialogInterfaceC0867f m365a2 = c0117i2.m365a();
                        m365a2.setCancelable(true);
                        m365a2.setCanceledOnTouchOutside(false);
                        AbstractC1256E0.m3022o(m365a2);
                        inflate3.findViewById(R.id.btn_load_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a2, inflate3, 2));
                        final int i32 = 0;
                        inflate3.findViewById(R.id.btn_load_confirm_go).setOnClickListener(new View.OnClickListener() { // from class: r0.c
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x0146, TryCatch #7 {Exception -> 0x0146, blocks: (B:15:0x0044, B:19:0x00a3, B:20:0x00a8, B:25:0x00d0, B:26:0x00d3, B:30:0x00fa, B:31:0x00fd, B:33:0x0110, B:35:0x0116, B:38:0x011d, B:41:0x0135, B:53:0x0145, B:52:0x0142, B:47:0x013c, B:40:0x012e), top: B:14:0x0044, inners: #1, #6 }] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onClick(View view2) {
                                int i322;
                                char c2;
                                char c3;
                                char c4;
                                char c5;
                                JSONArray optJSONArray;
                                File file;
                                JSONArray optJSONArray2;
                                File file2;
                                File parentFile;
                                JSONArray jSONArray = null;
                                int i42 = 3;
                                switch (i32) {
                                    case 0:
                                        C1384f c1384f22 = c1384f2;
                                        DialogInterfaceC0867f dialogInterfaceC0867f = m365a2;
                                        View view3 = inflate3;
                                        c1384f22.getClass();
                                        AbstractC1256E0.m3027t(dialogInterfaceC0867f, view3, null);
                                        Context m1119K = c1384f22.m1119K();
                                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                            if (file3.isFile()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(AbstractC1256E0.m2996K(file3));
                                                    if (jSONObject.optInt("v", 0) == 1) {
                                                        SharedPreferences.Editor edit = m1119K.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                                        JSONObject optJSONObject = jSONObject.optJSONObject("b");
                                                        if (optJSONObject != null) {
                                                            Iterator<String> keys = optJSONObject.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (next != null) {
                                                                    switch (next.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next.equals("laststattimeR")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next.equals("trialdays")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next.equals("laststattime")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next.equals("partner_id")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next.equals("paylevelid")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putBoolean(next, optJSONObject.optBoolean(next, false));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("i");
                                                        if (optJSONObject2 != null) {
                                                            Iterator<String> keys2 = optJSONObject2.keys();
                                                            while (keys2.hasNext()) {
                                                                String next2 = keys2.next();
                                                                if (next2 != null) {
                                                                    switch (next2.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next2.equals("laststattimeR")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next2.equals("trialdays")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next2.equals("laststattime")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next2.equals("partner_id")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next2.equals("paylevelid")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putInt(next2, optJSONObject2.optInt(next2, 0));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("f");
                                                        if (optJSONObject3 != null) {
                                                            Iterator<String> keys3 = optJSONObject3.keys();
                                                            while (keys3.hasNext()) {
                                                                String next3 = keys3.next();
                                                                if (next3 != null) {
                                                                    switch (next3.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next3.equals("laststattimeR")) {
                                                                                c4 = 0;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next3.equals("trialdays")) {
                                                                                c4 = 1;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next3.equals("laststattime")) {
                                                                                c4 = 2;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next3.equals("partner_id")) {
                                                                                c4 = 3;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next3.equals("paylevelid")) {
                                                                                c4 = 4;
                                                                                break;
                                                                            }
                                                                            c4 = 65535;
                                                                            break;
                                                                        default:
                                                                            c4 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c4) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putFloat(next3, (float) optJSONObject3.optDouble(next3, 0.0d));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        JSONObject optJSONObject4 = jSONObject.optJSONObject("s");
                                                        if (optJSONObject4 != null) {
                                                            Iterator<String> keys4 = optJSONObject4.keys();
                                                            while (keys4.hasNext()) {
                                                                String next4 = keys4.next();
                                                                if (next4 != null) {
                                                                    switch (next4.hashCode()) {
                                                                        case -1574777989:
                                                                            if (next4.equals("laststattimeR")) {
                                                                                c5 = 0;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -815954835:
                                                                            if (next4.equals("trialdays")) {
                                                                                c5 = 1;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case -466441289:
                                                                            if (next4.equals("laststattime")) {
                                                                                c5 = 2;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 170000370:
                                                                            if (next4.equals("partner_id")) {
                                                                                c5 = 3;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        case 732338679:
                                                                            if (next4.equals("paylevelid")) {
                                                                                c5 = 4;
                                                                                break;
                                                                            }
                                                                            c5 = 65535;
                                                                            break;
                                                                        default:
                                                                            c5 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c5) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            break;
                                                                        default:
                                                                            edit.putString(next4, optJSONObject4.optString(next4, ""));
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (edit.commit()) {
                                                            JSONArray optJSONArray3 = jSONObject.optJSONArray("reminders");
                                                            if (optJSONArray3 != null) {
                                                                AbstractC1687o.m4926U(m1119K, AbstractC1687o.m4917L(optJSONArray3));
                                                            }
                                                            JSONArray optJSONArray4 = jSONObject.optJSONArray("trips");
                                                            if (optJSONArray4 != null) {
                                                                AbstractC1687o.m4927V(m1119K, AbstractC1687o.m4916K(optJSONArray4));
                                                            }
                                                            JSONArray optJSONArray5 = jSONObject.optJSONArray("refuels");
                                                            if (optJSONArray5 != null) {
                                                                AbstractC1680h.m4853O(m1119K, AbstractC1680h.m4848J(optJSONArray5));
                                                            }
                                                            cfgData.m1784i().m1791k(m1119K, false);
                                                            C1683k c1683k = C1683k.f9580s;
                                                            if (c1683k != null) {
                                                                synchronized (c1683k) {
                                                                    c1683k.m4897f();
                                                                }
                                                            }
                                                            i322 = 1;
                                                        } else {
                                                            i322 = 3;
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                i322 = 5;
                                            } else {
                                                i322 = 4;
                                            }
                                        } else {
                                            i322 = 2;
                                        }
                                        if (i322 == 1) {
                                            c1384f22.m3327O();
                                        }
                                        c1384f22.m3328P(i322, true);
                                        return;
                                    default:
                                        C1384f c1384f3 = c1384f2;
                                        c1384f3.getClass();
                                        AbstractC1256E0.m3027t(m365a2, inflate3, null);
                                        Context m1119K2 = c1384f3.m1119K();
                                        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                        if (externalStoragePublicDirectory2.exists() || externalStoragePublicDirectory2.mkdirs()) {
                                            cfgData.m1784i().m1795o(m1119K2);
                                            SharedPreferences sharedPreferences = m1119K2.getSharedPreferences("T500_SPLIT_AS", 0);
                                            try {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("v", 1);
                                                jSONObject2.put("t", System.currentTimeMillis());
                                                jSONObject2.put("b", AbstractC1256E0.m3030w(sharedPreferences));
                                                jSONObject2.put("i", AbstractC1256E0.m3032y(sharedPreferences));
                                                jSONObject2.put("f", AbstractC1256E0.m3031x(sharedPreferences));
                                                jSONObject2.put("s", AbstractC1256E0.m3033z(sharedPreferences));
                                                File file4 = new File(m1119K2.getApplicationContext().getFilesDir(), "reminders.json");
                                                try {
                                                    if (file4.isFile()) {
                                                        try {
                                                            optJSONArray = new JSONObject(AbstractC1687o.m4920O(file4)).optJSONArray("items");
                                                        } catch (Exception unused2) {
                                                        }
                                                        if (optJSONArray != null) {
                                                            jSONObject2.put("reminders", optJSONArray);
                                                        }
                                                        file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                        if (file.isFile()) {
                                                            try {
                                                                optJSONArray2 = new JSONObject(AbstractC1687o.m4919N(file)).optJSONArray("trips");
                                                            } catch (Exception unused3) {
                                                            }
                                                            if (optJSONArray2 != null) {
                                                                jSONObject2.put("trips", optJSONArray2);
                                                            }
                                                            file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                            if (file2.isFile()) {
                                                                try {
                                                                    jSONArray = new JSONObject(AbstractC1680h.m4850L(file2)).optJSONArray("refuels");
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONArray != null) {
                                                                jSONObject2.put("refuels", jSONArray);
                                                            }
                                                            File file522222222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                            parentFile = file522222222222222.getParentFile();
                                                            if (parentFile != null || parentFile.exists() || parentFile.mkdirs()) {
                                                                BufferedWriter bufferedWriter22222222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file522222222222222), StandardCharsets.UTF_8));
                                                                bufferedWriter22222222222222.write(jSONObject2.toString(2));
                                                                bufferedWriter22222222222222.close();
                                                                i42 = 1;
                                                            }
                                                        }
                                                        optJSONArray2 = null;
                                                        if (optJSONArray2 != null) {
                                                        }
                                                        file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                        if (file2.isFile()) {
                                                        }
                                                        if (jSONArray != null) {
                                                        }
                                                        File file5222222222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                        parentFile = file5222222222222222.getParentFile();
                                                        if (parentFile != null) {
                                                        }
                                                        BufferedWriter bufferedWriter222222222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5222222222222222), StandardCharsets.UTF_8));
                                                        bufferedWriter222222222222222.write(jSONObject2.toString(2));
                                                        bufferedWriter222222222222222.close();
                                                        i42 = 1;
                                                    }
                                                    bufferedWriter222222222222222.write(jSONObject2.toString(2));
                                                    bufferedWriter222222222222222.close();
                                                    i42 = 1;
                                                } finally {
                                                }
                                                optJSONArray = null;
                                                if (optJSONArray != null) {
                                                }
                                                file = new File(m1119K2.getApplicationContext().getFilesDir(), "trips.json");
                                                if (file.isFile()) {
                                                }
                                                optJSONArray2 = null;
                                                if (optJSONArray2 != null) {
                                                }
                                                file2 = new File(m1119K2.getApplicationContext().getFilesDir(), "refuels.json");
                                                if (file2.isFile()) {
                                                }
                                                if (jSONArray != null) {
                                                }
                                                File file52222222222222222 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "gwm_split_settings.json");
                                                parentFile = file52222222222222222.getParentFile();
                                                if (parentFile != null) {
                                                }
                                                BufferedWriter bufferedWriter2222222222222222 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file52222222222222222), StandardCharsets.UTF_8));
                                            } catch (Exception unused5) {
                                            }
                                        } else {
                                            i42 = 2;
                                        }
                                        c1384f3.m3328P(i42, false);
                                        return;
                                }
                            }
                        });
                        AbstractC1256E0.m3002Q(m365a2, inflate3);
                        return;
                    case 2:
                        C1384f c1384f3 = this.f6468g;
                        c1384f3.getClass();
                        Intent intent = new Intent(c1384f3.m1119K(), (Class<?>) ClimateTestActivity.class);
                        C0427z c0427z = c1384f3.f1375x;
                        if (c0427z != null) {
                            c0427z.f1385l.startActivity(intent, null);
                            return;
                        }
                        throw new IllegalStateException("Fragment " + c1384f3 + " not attached to Activity");
                    default:
                        Boolean bool = Boolean.TRUE;
                        carData cardata = this.f6468g.f6478Z;
                        if (bool.equals(Boolean.valueOf(cardata.getDebugTraceEnabled()))) {
                            return;
                        }
                        cardata.setDebugTraceEnabled(true);
                        return;
                }
            }
        });
        C0396Y m1131n = m1131n();
        C1337n c1337n = new C1337n(2, this);
        carData cardata = this.f6478Z;
        carData.m1712X(cardata.f2377A, m1131n, c1337n);
        C0396Y m1131n2 = m1131n();
        TextView textView = this.f6482d0;
        Objects.requireNonNull(textView);
        carData.m1712X(cardata.f2379B, m1131n2, new C1337n(3, textView));
        C0396Y m1131n3 = m1131n();
        TextView textView2 = this.f6483e0;
        Objects.requireNonNull(textView2);
        carData.m1712X(cardata.f2381C, m1131n3, new C1337n(3, textView2));
        C0396Y m1131n4 = m1131n();
        TextView textView3 = this.f6484f0;
        Objects.requireNonNull(textView3);
        carData.m1712X(cardata.f2383D, m1131n4, new C1337n(3, textView3));
        C0396Y m1131n5 = m1131n();
        TextView textView4 = this.f6485g0;
        Objects.requireNonNull(textView4);
        carData.m1712X(cardata.f2385E, m1131n5, new C1337n(3, textView4));
        return this.f6495q0;
    }
}
