package com.altaysoft.t500_split;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0009c;
import p006C.AbstractC0062j;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p098q0.C1347q0;

/* loaded from: classes.dex */
public class OssLicensesActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final C1347q0[] f2336E = {new C1347q0("FDBus", "Apache License 2.0", R.string.oss_note_fdbus, "https://github.com/jeremyczhen/fdbus"), new C1347q0("OpenWeather", "ODbL", R.string.oss_note_openweather, "https://openweathermap.org/"), new C1347q0("Meteocons", "MIT", R.string.oss_note_meteocons, "https://meteocons.com/"), new C1347q0("Lottie", "Apache License 2.0", R.string.oss_note_lottie, "https://airbnb.io/lottie"), new C1347q0("Android Geocoder", "Android platform", R.string.oss_note_geocoder, "https://developer.android.com/reference/android/location/Geocoder"), new C1347q0("Vosk", "Apache License 2.0", R.string.oss_note_vosk, "https://alphacephei.com/vosk"), new C1347q0("AndroidX / Material Components", "Apache License 2.0", R.string.oss_note_androidx, "https://developer.android.com/jetpack/androidx"), new C1347q0("Gson", "Apache License 2.0", R.string.oss_note_gson, "https://github.com/google/gson"), new C1347q0("JSch", "Revised BSD", R.string.oss_note_jsch, "https://www.jcraft.com/jsch/"), new C1347q0("OpenSSL", "OpenSSL + SSLeay", R.string.oss_note_openssl, "https://www.openssl.org/"), new C1347q0("curl", "curl license", R.string.oss_note_curl, "https://curl.se/"), new C1347q0("RapidJSON", "MIT", R.string.oss_note_rapidjson, "https://rapidjson.org/"), new C1347q0("zlib", "zlib", R.string.oss_note_zlib, "https://zlib.net/"), new C1347q0("libc++", "Apache License 2.0 + LLVM exception", R.string.oss_note_libcxx, "https://libcxx.llvm.org/"), new C1347q0("Material Icons", "Apache License 2.0", R.string.oss_note_material_icons, "https://fonts.google.com/icons")};

    public void onCloseBtn(View view) {
        finish();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_oss_licenses);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C0009c c0009c = new C0009c(26);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c0009c);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.oss_list);
        LayoutInflater layoutInflater = getLayoutInflater();
        C1347q0[] c1347q0Arr = f2336E;
        for (int i = 0; i < 15; i++) {
            C1347q0 c1347q0 = c1347q0Arr[i];
            View inflate = layoutInflater.inflate(R.layout.item_oss_notice, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) inflate.findViewById(R.id.oss_name);
            TextView textView2 = (TextView) inflate.findViewById(R.id.oss_meta);
            TextView textView3 = (TextView) inflate.findViewById(R.id.oss_url);
            textView.setText(c1347q0.f6335a);
            String string = getString(c1347q0.f6338d);
            String str = c1347q0.f6336b;
            if (!str.isEmpty()) {
                string = AbstractC0062j.m169w(str, " — ", string);
            }
            textView2.setText(string);
            String str2 = c1347q0.f6337c;
            if (str2.isEmpty()) {
                textView3.setVisibility(4);
                textView3.setPadding(0, 0, 0, 0);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView3.getLayoutParams();
                layoutParams.height = 0;
                textView3.setLayoutParams(layoutParams);
            } else {
                textView3.setText(str2);
                Linkify.addLinks(textView3, 1);
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
            linearLayout.addView(inflate);
        }
    }
}
