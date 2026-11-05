package com.altaysoft.t500_split;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.WeakHashMap;
import p001A0.C0009c;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1368x0;

/* loaded from: classes.dex */
public class LauncherBackGround extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f2305E = 0;

    static {
        cfgData.m1784i();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_launcher_back_ground);
        View findViewById = findViewById(R.id.main);
        C0009c c0009c = new C0009c(25);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c0009c);
        AbstractC1368x0.m3268b(this);
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        AbstractC1368x0.m3269c(this);
        super.onDestroy();
    }

    public void onStartButtonClick(View view) {
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(402722816);
            Rect rect = new Rect(0, 0, 1920, 1080);
            intent.putExtra("caller", "ip_start_wins");
            startActivity(intent, makeBasic.setLaunchBounds(rect).toBundle());
        } catch (Exception e2) {
            Toast.makeText(this, "ERROR3" + e2, 1).show();
        }
        finish();
    }
}
