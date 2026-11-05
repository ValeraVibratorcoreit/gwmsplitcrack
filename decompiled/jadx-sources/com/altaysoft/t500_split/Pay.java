package com.altaysoft.t500_split;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.network.ApiResponse;
import com.altaysoft.t500_split.network.C0654a;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0009c;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p063d1.C0752m;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1372y1;
import p098q0.C1341o0;
import p098q0.C1344p0;
import p098q0.RunnableC1362v0;

/* loaded from: classes.dex */
public class Pay extends AbstractActivityC0870i {

    /* renamed from: H */
    public static final /* synthetic */ int f2337H = 0;

    /* renamed from: E */
    public final carData f2338E = carData.getInstance();

    /* renamed from: F */
    public final cfgData f2339F = cfgData.m1784i();

    /* renamed from: G */
    public EditText f2340G;

    public void onCloseButtonClick(View view) {
        finish();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_pay);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C0009c c0009c = new C0009c(27);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c0009c);
        ImageView imageView = (ImageView) findViewById(R.id.img_qr);
        TextView textView = (TextView) findViewById(R.id.txt_descr);
        this.f2340G = (EditText) findViewById(R.id.id_code);
        if (this.f2339F.f2508D3 == 1) {
            textView.setText(getString(R.string.helpPayment_4000));
            imageView.setImageDrawable(getDrawable(R.drawable.qr4000));
        } else {
            textView.setText(getString(R.string.helpPayment_3000));
            imageView.setImageDrawable(getDrawable(R.drawable.qr3000));
        }
    }

    public void onSendCodeBtn(View view) {
        if (!this.f2338E.m1763n()) {
            AbstractC1372y1.m3288S(this, getString(R.string.Message), getString(R.string.no_internet_connection), null);
            return;
        }
        String obj = this.f2340G.getText().toString();
        int i = 6;
        if (obj.length() != 6) {
            AbstractC1372y1.m3288S(this, getString(R.string.error_message_title), getString(R.string.activation_wrong_code_format), null);
            return;
        }
        C0654a c0654a = C0654a.f3077h;
        C1341o0 c1341o0 = C1344p0.f6318h;
        c0654a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cfgData cfgdata = c0654a.f3078a;
        linkedHashMap.put(cfgdata.f2518G, cfgdata.f2530J);
        linkedHashMap.put(cfgdata.f2514F, c1341o0.f6302a);
        linkedHashMap.put(cfgdata.f2522H, obj);
        linkedHashMap.put(cfgdata.f2526I, c0654a.f3080c);
        String m1930c = c0654a.m1930c(linkedHashMap);
        c0654a.f3081d = m1930c;
        if (m1930c != null) {
            C0752m c0752m = c0654a.f3084g;
            if (!((ApiResponse) c0752m.m2197a(m1930c)).successMessage.contains(cfgdata.f2534K)) {
                if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2538L)) {
                    i = 1;
                } else if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2542M)) {
                    i = 2;
                } else if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2546N)) {
                    i = 3;
                } else if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2550O)) {
                    i = 4;
                } else if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2554P)) {
                    i = 5;
                }
            }
            new Handler().postDelayed(new RunnableC1362v0(this, i, this, this), 250L);
        }
        i = 99;
        new Handler().postDelayed(new RunnableC1362v0(this, i, this, this), 250L);
    }
}
