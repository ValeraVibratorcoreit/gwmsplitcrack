package com.altaysoft.t500_split;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0009c;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p106t0.EnumC1457c;

/* loaded from: classes.dex */
public class Help extends AbstractActivityC0870i {

    /* renamed from: K */
    public static final /* synthetic */ int f2283K = 0;

    /* renamed from: E */
    public TextView f2284E;

    /* renamed from: F */
    public TextView f2285F;

    /* renamed from: G */
    public ImageView f2286G;

    /* renamed from: H */
    public int f2287H = 0;

    /* renamed from: I */
    public final int f2288I = 6;

    /* renamed from: J */
    public final cfgData f2289J = cfgData.m1784i();

    public void onCloseBtn(View view) {
        finish();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_help);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C0009c c0009c = new C0009c(22);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c0009c);
        this.f2284E = (TextView) findViewById(R.id.textView_Topic);
        this.f2285F = (TextView) findViewById(R.id.textView_HelpText);
        this.f2286G = (ImageView) findViewById(R.id.imageView_help);
        int i = this.f2289J.f2724z0;
        this.f2287H = i;
        if (i == 1) {
            this.f2287H = 0;
        }
        m1663t(this.f2287H);
    }

    public void onNextBtn(View view) {
        int i = this.f2287H + 1;
        this.f2287H = i;
        if (i == 1) {
            this.f2287H = 2;
        }
        if (this.f2287H > this.f2288I) {
            this.f2287H = 0;
        }
        m1663t(this.f2287H);
    }

    public void onPrevBtn(View view) {
        int i = this.f2287H - 1;
        this.f2287H = i;
        if (i == 1) {
            this.f2287H = 0;
        }
        if (this.f2287H < 0) {
            this.f2287H = this.f2288I;
        }
        m1663t(this.f2287H);
    }

    /* renamed from: t */
    public final void m1663t(int i) {
        int i2;
        int i3 = 0;
        this.f2286G.setVisibility(i >= 2 ? 8 : 0);
        if (i == 0) {
            EnumC1457c enumC1457c = this.f2289J.f2543M0;
            int i4 = enumC1457c.f7156o;
            int i5 = enumC1457c.f7157p;
            this.f2284E.setText(getString(R.string.help_scr_name_0));
            if (i4 == 0) {
                this.f2286G.setImageResource(R.drawable.icon_split);
            } else {
                this.f2286G.setImageResource(i4);
            }
            AbstractC1256E0.m2999N(this.f2285F, i5 != 0 ? getString(i5) : "@cr<not found>");
            this.f2285F.setMovementMethod(ScrollingMovementMethod.getInstance());
            return;
        }
        if (i == 2) {
            i3 = R.string.help_cfg_general_caption;
            i2 = R.string.help_cfg_general_text;
        } else {
            i2 = 0;
        }
        if (i == 3) {
            i3 = R.string.help_cfg_data_caption;
            i2 = R.string.help_cfg_data_text;
        }
        if (i == 4) {
            i3 = R.string.help_cfg_advanced1_caption;
            i2 = R.string.help_cfg_advanced1_text;
        }
        if (i == 5) {
            i3 = R.string.help_cfg_advanced2_caption;
            i2 = R.string.help_cfg_advanced2_text;
        }
        if (i == 6) {
            i3 = R.string.help_cfg_about_caption;
            i2 = R.string.help_cfg_about_text;
        }
        this.f2284E.setText(getString(i3));
        AbstractC1256E0.m2999N(this.f2285F, getString(i2));
        this.f2285F.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
