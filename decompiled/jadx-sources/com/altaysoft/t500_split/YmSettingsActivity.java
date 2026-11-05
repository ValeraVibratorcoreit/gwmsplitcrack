package com.altaysoft.t500_split;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.InterfaceC0551p;
import androidx.lifecycle.InterfaceC0553r;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0645m;
import com.altaysoft.t500_split.media.AbstractC0648p;
import com.altaysoft.t500_split.media.AbstractC0650r;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0009c;
import p001A0.RunnableC0018l;
import p001A0.RunnableC0024r;
import p016H.C0112d;
import p016H.C0117i;
import p031P.C0264b;
import p046X.C0383K;
import p052a.C0470j;
import p054a1.ViewOnClickListenerC0492a;
import p058c.C0571e;
import p058c.C0573g;
import p070g.AbstractActivityC0870i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p098q0.C1325j;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1680h;

/* loaded from: classes.dex */
public class YmSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: J */
    public static final /* synthetic */ int f2370J = 0;

    /* renamed from: E */
    public AppCompatButton f2371E;

    /* renamed from: F */
    public TextView f2372F;

    /* renamed from: G */
    public DialogInterfaceC0867f f2373G;

    /* renamed from: H */
    public View f2374H;

    /* renamed from: I */
    public final C0573g f2375I;

    public YmSettingsActivity() {
        final C0383K c0383k = new C0383K(2);
        final C0264b c0264b = new C0264b(this);
        final C0470j c0470j = this.f1509n;
        AbstractC1461d.m3494e("registry", c0470j);
        final String str = "activity_rq#" + this.f1508m.getAndIncrement();
        AbstractC1461d.m3494e("key", str);
        C0555t c0555t = this.f1501f;
        if (c0555t.f2001c.compareTo(EnumC0548m.f1993d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0555t.f2001c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        c0470j.m1182d(str);
        LinkedHashMap linkedHashMap = c0470j.f1492c;
        C0571e c0571e = (C0571e) linkedHashMap.get(str);
        c0571e = c0571e == null ? new C0571e(c0555t) : c0571e;
        InterfaceC0551p interfaceC0551p = new InterfaceC0551p() { // from class: c.c
            @Override // androidx.lifecycle.InterfaceC0551p
            /* renamed from: d */
            public final void mo1177d(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
                Intent intent;
                String stringExtra;
                C0470j c0470j2 = C0470j.this;
                AbstractC1461d.m3494e("this$0", c0470j2);
                String str2 = str;
                C0264b c0264b2 = c0264b;
                C0383K c0383k2 = c0383k;
                EnumC0547l enumC0547l2 = EnumC0547l.ON_START;
                LinkedHashMap linkedHashMap2 = c0470j2.f1494e;
                if (enumC0547l2 != enumC0547l) {
                    if (EnumC0547l.ON_STOP == enumC0547l) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0547l.ON_DESTROY == enumC0547l) {
                            c0470j2.m1183e(str2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(str2, new C0570d(c0264b2, c0383k2));
                LinkedHashMap linkedHashMap3 = c0470j2.f1495f;
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    c0264b2.mo784b(obj);
                }
                Bundle bundle = c0470j2.f1496g;
                C0567a c0567a = (C0567a) AbstractC1680h.m4877s(bundle, str2);
                if (c0567a != null) {
                    bundle.remove(str2);
                    int i = YmSettingsActivity.f2370J;
                    YmSettingsActivity ymSettingsActivity = (YmSettingsActivity) c0264b2.f701f;
                    ymSettingsActivity.getClass();
                    if (c0567a.f2171a != -1 || (intent = c0567a.f2172b) == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
                        return;
                    }
                    String trim = stringExtra.trim();
                    if (trim.isEmpty()) {
                        return;
                    }
                    cfgData m1784i = cfgData.m1784i();
                    m1784i.f2656l2 = trim;
                    m1784i.m1795o(ymSettingsActivity);
                    if (ymSettingsActivity.f2371E == null) {
                        return;
                    }
                    if (trim.isEmpty()) {
                        ymSettingsActivity.f2371E.setText(R.string.ym_pick_account);
                    } else {
                        ymSettingsActivity.f2371E.setText(trim);
                    }
                }
            }
        };
        c0571e.f2179a.m1377a(interfaceC0551p);
        c0571e.f2180b.add(interfaceC0551p);
        linkedHashMap.put(str, c0571e);
        this.f2375I = new C0573g(c0470j, str, c0383k);
    }

    /* renamed from: v */
    public static void m1708v(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1708v(viewGroup.getChildAt(i), z2);
            }
        }
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_ym_settings);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.btn_ym_settings);
        final cfgData m1784i = cfgData.m1784i();
        Switch r1 = (Switch) findViewById(R.id.swYmExtended);
        View findViewById = findViewById(R.id.box_ym_settings);
        this.f2371E = (AppCompatButton) findViewById(R.id.btnYmPickAccount);
        this.f2372F = (TextView) findViewById(R.id.tvYmTokenStatus);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rgYmStartMode);
        m1709t();
        findViewById(R.id.btnYmTokenGet).setOnClickListener(new View.OnClickListener(this) { // from class: q0.B1

            /* renamed from: g */
            public final /* synthetic */ YmSettingsActivity f5580g;

            {
                this.f5580g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final YmSettingsActivity ymSettingsActivity = this.f5580g;
                        DialogInterfaceC0867f dialogInterfaceC0867f = ymSettingsActivity.f2373G;
                        if (dialogInterfaceC0867f == null || !dialogInterfaceC0867f.isShowing()) {
                            View inflate = LayoutInflater.from(ymSettingsActivity).inflate(R.layout.dialog_ym_token, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(R.id.txtYmTokenDialogLink);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogCode);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogHint);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView2.setText(R.string.ym_token_wait);
                            C0117i c0117i = new C0117i(ymSettingsActivity, R.style.T500Split_Dialog);
                            ((C0863b) c0117i.f369g).f4328i = inflate;
                            DialogInterfaceC0867f m365a = c0117i.m365a();
                            m365a.setCancelable(true);
                            m365a.setCanceledOnTouchOutside(false);
                            AbstractC1256E0.m3022o(m365a);
                            ymSettingsActivity.f2373G = m365a;
                            ymSettingsActivity.f2374H = inflate;
                            inflate.findViewById(R.id.btnYmTokenDialogCancel).setOnClickListener(new ViewOnClickListenerC0492a(12, new RunnableC0024r(24, ymSettingsActivity)));
                            m365a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: q0.D1
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    YmSettingsActivity ymSettingsActivity2 = YmSettingsActivity.this;
                                    int i2 = YmSettingsActivity.f2370J;
                                    ymSettingsActivity2.getClass();
                                    AbstractC0650r.f3069c = false;
                                    ymSettingsActivity2.f2373G = null;
                                    ymSettingsActivity2.f2374H = null;
                                }
                            });
                            AbstractC1256E0.m3002Q(m365a, inflate);
                            C0112d c0112d = new C0112d(ymSettingsActivity, m365a, textView, textView2, textView3);
                            Handler handler = AbstractC0650r.f3067a;
                            Context applicationContext = ymSettingsActivity.getApplicationContext();
                            if (!AbstractC0650r.f3069c) {
                                AbstractC0650r.f3069c = true;
                                AbstractC0650r.f3068b.execute(new RunnableC0018l(applicationContext, 6, c0112d));
                                break;
                            } else {
                                AbstractC0650r.m1925e(c0112d, new C0009c(5));
                                break;
                            }
                        }
                        break;
                    case 1:
                        YmSettingsActivity ymSettingsActivity2 = this.f5580g;
                        int i2 = YmSettingsActivity.f2370J;
                        ymSettingsActivity2.getClass();
                        AbstractC0650r.f3069c = false;
                        ymSettingsActivity2.getApplicationContext().getSharedPreferences("ym_oauth", 0).edit().remove("token").remove("refresh").remove("uid").apply();
                        AbstractC0645m.f3041e.clear();
                        ymSettingsActivity2.m1709t();
                        break;
                    case 2:
                        int i3 = YmSettingsActivity.f2370J;
                        YmSettingsActivity ymSettingsActivity3 = this.f5580g;
                        ymSettingsActivity3.getClass();
                        try {
                            ymSettingsActivity3.f2375I.m1576Z(AbstractC0648p.m1914g(ymSettingsActivity3));
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        int i4 = YmSettingsActivity.f2370J;
                        this.f5580g.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        findViewById(R.id.btnYmTokenClear).setOnClickListener(new View.OnClickListener(this) { // from class: q0.B1

            /* renamed from: g */
            public final /* synthetic */ YmSettingsActivity f5580g;

            {
                this.f5580g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        final YmSettingsActivity ymSettingsActivity = this.f5580g;
                        DialogInterfaceC0867f dialogInterfaceC0867f = ymSettingsActivity.f2373G;
                        if (dialogInterfaceC0867f == null || !dialogInterfaceC0867f.isShowing()) {
                            View inflate = LayoutInflater.from(ymSettingsActivity).inflate(R.layout.dialog_ym_token, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(R.id.txtYmTokenDialogLink);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogCode);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogHint);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView2.setText(R.string.ym_token_wait);
                            C0117i c0117i = new C0117i(ymSettingsActivity, R.style.T500Split_Dialog);
                            ((C0863b) c0117i.f369g).f4328i = inflate;
                            DialogInterfaceC0867f m365a = c0117i.m365a();
                            m365a.setCancelable(true);
                            m365a.setCanceledOnTouchOutside(false);
                            AbstractC1256E0.m3022o(m365a);
                            ymSettingsActivity.f2373G = m365a;
                            ymSettingsActivity.f2374H = inflate;
                            inflate.findViewById(R.id.btnYmTokenDialogCancel).setOnClickListener(new ViewOnClickListenerC0492a(12, new RunnableC0024r(24, ymSettingsActivity)));
                            m365a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: q0.D1
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    YmSettingsActivity ymSettingsActivity2 = YmSettingsActivity.this;
                                    int i22 = YmSettingsActivity.f2370J;
                                    ymSettingsActivity2.getClass();
                                    AbstractC0650r.f3069c = false;
                                    ymSettingsActivity2.f2373G = null;
                                    ymSettingsActivity2.f2374H = null;
                                }
                            });
                            AbstractC1256E0.m3002Q(m365a, inflate);
                            C0112d c0112d = new C0112d(ymSettingsActivity, m365a, textView, textView2, textView3);
                            Handler handler = AbstractC0650r.f3067a;
                            Context applicationContext = ymSettingsActivity.getApplicationContext();
                            if (!AbstractC0650r.f3069c) {
                                AbstractC0650r.f3069c = true;
                                AbstractC0650r.f3068b.execute(new RunnableC0018l(applicationContext, 6, c0112d));
                                break;
                            } else {
                                AbstractC0650r.m1925e(c0112d, new C0009c(5));
                                break;
                            }
                        }
                        break;
                    case 1:
                        YmSettingsActivity ymSettingsActivity2 = this.f5580g;
                        int i22 = YmSettingsActivity.f2370J;
                        ymSettingsActivity2.getClass();
                        AbstractC0650r.f3069c = false;
                        ymSettingsActivity2.getApplicationContext().getSharedPreferences("ym_oauth", 0).edit().remove("token").remove("refresh").remove("uid").apply();
                        AbstractC0645m.f3041e.clear();
                        ymSettingsActivity2.m1709t();
                        break;
                    case 2:
                        int i3 = YmSettingsActivity.f2370J;
                        YmSettingsActivity ymSettingsActivity3 = this.f5580g;
                        ymSettingsActivity3.getClass();
                        try {
                            ymSettingsActivity3.f2375I.m1576Z(AbstractC0648p.m1914g(ymSettingsActivity3));
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        int i4 = YmSettingsActivity.f2370J;
                        this.f5580g.finish();
                        break;
                }
            }
        });
        r1.setChecked(m1784i.f2666n2);
        boolean z2 = m1784i.f2666n2;
        if (findViewById != null) {
            findViewById.setAlpha(z2 ? 1.0f : 0.4f);
            m1708v(findViewById, z2);
        }
        String[] strArr = AbstractC0648p.f3051a;
        String str = m1784i.f2656l2;
        String trim = str == null ? "" : str.trim();
        if (this.f2371E != null) {
            if (trim == null || trim.isEmpty()) {
                this.f2371E.setText(R.string.ym_pick_account);
            } else {
                this.f2371E.setText(trim);
            }
        }
        int i3 = m1784i.f2661m2;
        r6 = (i3 == 1 || i3 == 2) ? i3 : 0;
        if (r6 == 1) {
            radioGroup.check(R.id.rbYmStartWave);
        } else if (r6 == 2) {
            radioGroup.check(R.id.rbYmStartLikes);
        } else {
            radioGroup.check(R.id.rbYmStartPlay);
        }
        r1.setOnCheckedChangeListener(new C1325j(this, m1784i, findViewById, i));
        this.f2371E.setOnClickListener(new View.OnClickListener(this) { // from class: q0.B1

            /* renamed from: g */
            public final /* synthetic */ YmSettingsActivity f5580g;

            {
                this.f5580g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        final YmSettingsActivity ymSettingsActivity = this.f5580g;
                        DialogInterfaceC0867f dialogInterfaceC0867f = ymSettingsActivity.f2373G;
                        if (dialogInterfaceC0867f == null || !dialogInterfaceC0867f.isShowing()) {
                            View inflate = LayoutInflater.from(ymSettingsActivity).inflate(R.layout.dialog_ym_token, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(R.id.txtYmTokenDialogLink);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogCode);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogHint);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView2.setText(R.string.ym_token_wait);
                            C0117i c0117i = new C0117i(ymSettingsActivity, R.style.T500Split_Dialog);
                            ((C0863b) c0117i.f369g).f4328i = inflate;
                            DialogInterfaceC0867f m365a = c0117i.m365a();
                            m365a.setCancelable(true);
                            m365a.setCanceledOnTouchOutside(false);
                            AbstractC1256E0.m3022o(m365a);
                            ymSettingsActivity.f2373G = m365a;
                            ymSettingsActivity.f2374H = inflate;
                            inflate.findViewById(R.id.btnYmTokenDialogCancel).setOnClickListener(new ViewOnClickListenerC0492a(12, new RunnableC0024r(24, ymSettingsActivity)));
                            m365a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: q0.D1
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    YmSettingsActivity ymSettingsActivity2 = YmSettingsActivity.this;
                                    int i22 = YmSettingsActivity.f2370J;
                                    ymSettingsActivity2.getClass();
                                    AbstractC0650r.f3069c = false;
                                    ymSettingsActivity2.f2373G = null;
                                    ymSettingsActivity2.f2374H = null;
                                }
                            });
                            AbstractC1256E0.m3002Q(m365a, inflate);
                            C0112d c0112d = new C0112d(ymSettingsActivity, m365a, textView, textView2, textView3);
                            Handler handler = AbstractC0650r.f3067a;
                            Context applicationContext = ymSettingsActivity.getApplicationContext();
                            if (!AbstractC0650r.f3069c) {
                                AbstractC0650r.f3069c = true;
                                AbstractC0650r.f3068b.execute(new RunnableC0018l(applicationContext, 6, c0112d));
                                break;
                            } else {
                                AbstractC0650r.m1925e(c0112d, new C0009c(5));
                                break;
                            }
                        }
                        break;
                    case 1:
                        YmSettingsActivity ymSettingsActivity2 = this.f5580g;
                        int i22 = YmSettingsActivity.f2370J;
                        ymSettingsActivity2.getClass();
                        AbstractC0650r.f3069c = false;
                        ymSettingsActivity2.getApplicationContext().getSharedPreferences("ym_oauth", 0).edit().remove("token").remove("refresh").remove("uid").apply();
                        AbstractC0645m.f3041e.clear();
                        ymSettingsActivity2.m1709t();
                        break;
                    case 2:
                        int i32 = YmSettingsActivity.f2370J;
                        YmSettingsActivity ymSettingsActivity3 = this.f5580g;
                        ymSettingsActivity3.getClass();
                        try {
                            ymSettingsActivity3.f2375I.m1576Z(AbstractC0648p.m1914g(ymSettingsActivity3));
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        int i4 = YmSettingsActivity.f2370J;
                        this.f5580g.finish();
                        break;
                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: q0.C1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                int i5 = YmSettingsActivity.f2370J;
                YmSettingsActivity ymSettingsActivity = YmSettingsActivity.this;
                ymSettingsActivity.getClass();
                cfgData cfgdata = m1784i;
                if (i4 == R.id.rbYmStartWave) {
                    cfgdata.f2661m2 = 1;
                } else if (i4 == R.id.rbYmStartLikes) {
                    cfgdata.f2661m2 = 2;
                } else {
                    cfgdata.f2661m2 = 0;
                }
                cfgdata.m1795o(ymSettingsActivity);
            }
        });
        ((TextView) findViewById(R.id.tvYmSettingsHelp)).setText(getString(R.string.help_ym_settings_text));
        final int i4 = 3;
        findViewById(R.id.btnYmSettingsBack).setOnClickListener(new View.OnClickListener(this) { // from class: q0.B1

            /* renamed from: g */
            public final /* synthetic */ YmSettingsActivity f5580g;

            {
                this.f5580g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        final YmSettingsActivity ymSettingsActivity = this.f5580g;
                        DialogInterfaceC0867f dialogInterfaceC0867f = ymSettingsActivity.f2373G;
                        if (dialogInterfaceC0867f == null || !dialogInterfaceC0867f.isShowing()) {
                            View inflate = LayoutInflater.from(ymSettingsActivity).inflate(R.layout.dialog_ym_token, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(R.id.txtYmTokenDialogLink);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogCode);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.txtYmTokenDialogHint);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView2.setText(R.string.ym_token_wait);
                            C0117i c0117i = new C0117i(ymSettingsActivity, R.style.T500Split_Dialog);
                            ((C0863b) c0117i.f369g).f4328i = inflate;
                            DialogInterfaceC0867f m365a = c0117i.m365a();
                            m365a.setCancelable(true);
                            m365a.setCanceledOnTouchOutside(false);
                            AbstractC1256E0.m3022o(m365a);
                            ymSettingsActivity.f2373G = m365a;
                            ymSettingsActivity.f2374H = inflate;
                            inflate.findViewById(R.id.btnYmTokenDialogCancel).setOnClickListener(new ViewOnClickListenerC0492a(12, new RunnableC0024r(24, ymSettingsActivity)));
                            m365a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: q0.D1
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    YmSettingsActivity ymSettingsActivity2 = YmSettingsActivity.this;
                                    int i22 = YmSettingsActivity.f2370J;
                                    ymSettingsActivity2.getClass();
                                    AbstractC0650r.f3069c = false;
                                    ymSettingsActivity2.f2373G = null;
                                    ymSettingsActivity2.f2374H = null;
                                }
                            });
                            AbstractC1256E0.m3002Q(m365a, inflate);
                            C0112d c0112d = new C0112d(ymSettingsActivity, m365a, textView, textView2, textView3);
                            Handler handler = AbstractC0650r.f3067a;
                            Context applicationContext = ymSettingsActivity.getApplicationContext();
                            if (!AbstractC0650r.f3069c) {
                                AbstractC0650r.f3069c = true;
                                AbstractC0650r.f3068b.execute(new RunnableC0018l(applicationContext, 6, c0112d));
                                break;
                            } else {
                                AbstractC0650r.m1925e(c0112d, new C0009c(5));
                                break;
                            }
                        }
                        break;
                    case 1:
                        YmSettingsActivity ymSettingsActivity2 = this.f5580g;
                        int i22 = YmSettingsActivity.f2370J;
                        ymSettingsActivity2.getClass();
                        AbstractC0650r.f3069c = false;
                        ymSettingsActivity2.getApplicationContext().getSharedPreferences("ym_oauth", 0).edit().remove("token").remove("refresh").remove("uid").apply();
                        AbstractC0645m.f3041e.clear();
                        ymSettingsActivity2.m1709t();
                        break;
                    case 2:
                        int i32 = YmSettingsActivity.f2370J;
                        YmSettingsActivity ymSettingsActivity3 = this.f5580g;
                        ymSettingsActivity3.getClass();
                        try {
                            ymSettingsActivity3.f2375I.m1576Z(AbstractC0648p.m1914g(ymSettingsActivity3));
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        int i42 = YmSettingsActivity.f2370J;
                        this.f5580g.finish();
                        break;
                }
            }
        });
        AbstractC1256E0.m3021n(findViewById(android.R.id.content));
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        AbstractC0650r.f3069c = false;
        m1710u(false);
        super.onDestroy();
    }

    /* renamed from: t */
    public final void m1709t() {
        if (this.f2372F == null) {
            return;
        }
        Handler handler = AbstractC0650r.f3067a;
        String string = getApplicationContext().getSharedPreferences("ym_oauth", 0).getString("token", "");
        if (string == null || string.isEmpty()) {
            this.f2372F.setText(R.string.ym_token_none);
        } else {
            String string2 = getApplicationContext().getSharedPreferences("ym_oauth", 0).getString("uid", "");
            this.f2372F.setText(string2.isEmpty() ? getString(R.string.ym_token_ok) : getString(R.string.ym_token_ok_uid, string2));
        }
    }

    /* renamed from: u */
    public final void m1710u(boolean z2) {
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f2373G;
        View view = this.f2374H;
        this.f2373G = null;
        this.f2374H = null;
        if (dialogInterfaceC0867f == null) {
            return;
        }
        if (z2) {
            AbstractC1256E0.m3027t(dialogInterfaceC0867f, view, null);
            return;
        }
        try {
            if (dialogInterfaceC0867f.isShowing()) {
                dialogInterfaceC0867f.dismiss();
            }
        } catch (RuntimeException unused) {
        }
    }
}
