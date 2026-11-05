package com.altaysoft.t500_split.userthemes;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.IPOverlayService;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.RunnableC0646n;
import com.altaysoft.t500_split.userthemes.UserThemeHelpActivity;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import com.altaysoft.t500_split.userthemes.UserThemeSlotsActivity;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.RunnableC0017k;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.ViewOnClickListenerC1280Q0;
import p101r0.C1392n;
import p109u0.AbstractC1569q1;
import p112v0.EnumC1609b;
import p121y0.AbstractC1680h;

/* loaded from: classes.dex */
public class UserThemeSlotsActivity extends AbstractActivityC0870i {

    /* renamed from: L */
    public static final /* synthetic */ int f3316L = 0;

    /* renamed from: F */
    public ImageView f3318F;

    /* renamed from: G */
    public TextView f3319G;

    /* renamed from: H */
    public AppCompatButton f3320H;

    /* renamed from: J */
    public int f3322J;

    /* renamed from: K */
    public Bitmap f3323K;

    /* renamed from: E */
    public final AppCompatButton[] f3317E = new AppCompatButton[9];

    /* renamed from: I */
    public int f3321I = 1;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_user_theme_slots);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C1392n c1392n = new C1392n(19);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c1392n);
        this.f3318F = (ImageView) findViewById(R.id.ut_preview);
        this.f3319G = (TextView) findViewById(R.id.ut_empty);
        this.f3320H = (AppCompatButton) findViewById(R.id.ut_delete);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ut_slots);
        linearLayout.removeAllViews();
        int round = Math.round(getResources().getDisplayMetrics().density * 4.0f);
        for (int i4 = 1; i4 <= 9; i4++) {
            AppCompatButton appCompatButton = new AppCompatButton(this, null);
            appCompatButton.setAllCaps(false);
            appCompatButton.setText(getString(R.string.ut_slot, Integer.valueOf(i4)));
            appCompatButton.setTextSize(14.0f);
            appCompatButton.setMinHeight(0);
            appCompatButton.setMinimumHeight(0);
            appCompatButton.setMinWidth(0);
            appCompatButton.setMinimumWidth(0);
            appCompatButton.setPadding(8, 0, 8, 0);
            appCompatButton.setBackgroundResource(R.drawable.ut_slot_btn_bg);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            if (i4 > 1) {
                layoutParams.topMargin = round;
            }
            linearLayout.addView(appCompatButton, layoutParams);
            appCompatButton.setOnClickListener(new ViewOnClickListenerC1280Q0(this, i4, 2));
            this.f3317E[i4 - 1] = appCompatButton;
        }
        this.f3320H.setOnClickListener(new View.OnClickListener(this) { // from class: z0.i

            /* renamed from: g */
            public final /* synthetic */ UserThemeSlotsActivity f9665g;

            {
                this.f9665g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i5 = 0;
                EnumC1609b enumC1609b = EnumC1609b.STORAGE;
                final int i6 = 1;
                final UserThemeSlotsActivity userThemeSlotsActivity = this.f9665g;
                switch (i2) {
                    case 0:
                        if (AbstractC1569q1.m4452d(userThemeSlotsActivity.f3321I)) {
                            if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.ut_delete_title, userThemeSlotsActivity.getString(R.string.ut_delete_message, Integer.valueOf(userThemeSlotsActivity.f3321I)), R.string.ut_delete, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (!AbstractC1569q1.m4454f(userThemeSlotsActivity.f3321I - 1)) {
                            AbstractC1256E0.m3003R(userThemeSlotsActivity);
                            break;
                        } else if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                            AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            int i7 = UserThemeSlotsActivity.f3316L;
                                            UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                            userThemeSlotsActivity2.getClass();
                                            AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                            break;
                                        default:
                                            UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                            int i8 = userThemeSlotsActivity3.f3321I;
                                            int i9 = AbstractC1569q1.f8666a;
                                            cfgData m1784i = cfgData.m1784i();
                                            boolean z2 = false;
                                            if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                z2 = true;
                                            }
                                            if (i8 >= 1 && i8 <= 9) {
                                                File m4465q = AbstractC1569q1.m4465q(i8);
                                                AbstractC1569q1.m4449a(m4465q);
                                                if (i8 >= 1 && i8 <= 9) {
                                                    AbstractC1569q1.f8670e[i8 - 1] = null;
                                                }
                                                m4465q.exists();
                                            }
                                            if (z2) {
                                                AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                IPOverlayService.m1668b(userThemeSlotsActivity3);
                                            }
                                            userThemeSlotsActivity3.m2009v(i8);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            Intent intent = new Intent(userThemeSlotsActivity, (Class<?>) UserThemeImportActivity.class);
                            intent.putExtra("slot", userThemeSlotsActivity.f3321I);
                            userThemeSlotsActivity.startActivity(intent);
                            break;
                        }
                    case 2:
                        int i7 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        AbstractC1256E0.m3024q(userThemeSlotsActivity);
                        break;
                    default:
                        int i8 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        userThemeSlotsActivity.startActivity(new Intent(userThemeSlotsActivity, (Class<?>) UserThemeHelpActivity.class));
                        break;
                }
            }
        });
        findViewById(R.id.ut_import).setOnClickListener(new View.OnClickListener(this) { // from class: z0.i

            /* renamed from: g */
            public final /* synthetic */ UserThemeSlotsActivity f9665g;

            {
                this.f9665g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i5 = 0;
                EnumC1609b enumC1609b = EnumC1609b.STORAGE;
                final int i6 = 1;
                final UserThemeSlotsActivity userThemeSlotsActivity = this.f9665g;
                switch (i3) {
                    case 0:
                        if (AbstractC1569q1.m4452d(userThemeSlotsActivity.f3321I)) {
                            if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.ut_delete_title, userThemeSlotsActivity.getString(R.string.ut_delete_message, Integer.valueOf(userThemeSlotsActivity.f3321I)), R.string.ut_delete, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (!AbstractC1569q1.m4454f(userThemeSlotsActivity.f3321I - 1)) {
                            AbstractC1256E0.m3003R(userThemeSlotsActivity);
                            break;
                        } else if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                            AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            int i7 = UserThemeSlotsActivity.f3316L;
                                            UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                            userThemeSlotsActivity2.getClass();
                                            AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                            break;
                                        default:
                                            UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                            int i8 = userThemeSlotsActivity3.f3321I;
                                            int i9 = AbstractC1569q1.f8666a;
                                            cfgData m1784i = cfgData.m1784i();
                                            boolean z2 = false;
                                            if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                z2 = true;
                                            }
                                            if (i8 >= 1 && i8 <= 9) {
                                                File m4465q = AbstractC1569q1.m4465q(i8);
                                                AbstractC1569q1.m4449a(m4465q);
                                                if (i8 >= 1 && i8 <= 9) {
                                                    AbstractC1569q1.f8670e[i8 - 1] = null;
                                                }
                                                m4465q.exists();
                                            }
                                            if (z2) {
                                                AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                IPOverlayService.m1668b(userThemeSlotsActivity3);
                                            }
                                            userThemeSlotsActivity3.m2009v(i8);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            Intent intent = new Intent(userThemeSlotsActivity, (Class<?>) UserThemeImportActivity.class);
                            intent.putExtra("slot", userThemeSlotsActivity.f3321I);
                            userThemeSlotsActivity.startActivity(intent);
                            break;
                        }
                    case 2:
                        int i7 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        AbstractC1256E0.m3024q(userThemeSlotsActivity);
                        break;
                    default:
                        int i8 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        userThemeSlotsActivity.startActivity(new Intent(userThemeSlotsActivity, (Class<?>) UserThemeHelpActivity.class));
                        break;
                }
            }
        });
        findViewById(R.id.ut_close).setOnClickListener(new View.OnClickListener(this) { // from class: z0.i

            /* renamed from: g */
            public final /* synthetic */ UserThemeSlotsActivity f9665g;

            {
                this.f9665g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i5 = 0;
                EnumC1609b enumC1609b = EnumC1609b.STORAGE;
                final int i6 = 1;
                final UserThemeSlotsActivity userThemeSlotsActivity = this.f9665g;
                switch (i) {
                    case 0:
                        if (AbstractC1569q1.m4452d(userThemeSlotsActivity.f3321I)) {
                            if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.ut_delete_title, userThemeSlotsActivity.getString(R.string.ut_delete_message, Integer.valueOf(userThemeSlotsActivity.f3321I)), R.string.ut_delete, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (!AbstractC1569q1.m4454f(userThemeSlotsActivity.f3321I - 1)) {
                            AbstractC1256E0.m3003R(userThemeSlotsActivity);
                            break;
                        } else if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                            AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            int i7 = UserThemeSlotsActivity.f3316L;
                                            UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                            userThemeSlotsActivity2.getClass();
                                            AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                            break;
                                        default:
                                            UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                            int i8 = userThemeSlotsActivity3.f3321I;
                                            int i9 = AbstractC1569q1.f8666a;
                                            cfgData m1784i = cfgData.m1784i();
                                            boolean z2 = false;
                                            if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                z2 = true;
                                            }
                                            if (i8 >= 1 && i8 <= 9) {
                                                File m4465q = AbstractC1569q1.m4465q(i8);
                                                AbstractC1569q1.m4449a(m4465q);
                                                if (i8 >= 1 && i8 <= 9) {
                                                    AbstractC1569q1.f8670e[i8 - 1] = null;
                                                }
                                                m4465q.exists();
                                            }
                                            if (z2) {
                                                AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                IPOverlayService.m1668b(userThemeSlotsActivity3);
                                            }
                                            userThemeSlotsActivity3.m2009v(i8);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            Intent intent = new Intent(userThemeSlotsActivity, (Class<?>) UserThemeImportActivity.class);
                            intent.putExtra("slot", userThemeSlotsActivity.f3321I);
                            userThemeSlotsActivity.startActivity(intent);
                            break;
                        }
                    case 2:
                        int i7 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        AbstractC1256E0.m3024q(userThemeSlotsActivity);
                        break;
                    default:
                        int i8 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        userThemeSlotsActivity.startActivity(new Intent(userThemeSlotsActivity, (Class<?>) UserThemeHelpActivity.class));
                        break;
                }
            }
        });
        final int i5 = 3;
        findViewById(R.id.ut_help).setOnClickListener(new View.OnClickListener(this) { // from class: z0.i

            /* renamed from: g */
            public final /* synthetic */ UserThemeSlotsActivity f9665g;

            {
                this.f9665g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i52 = 0;
                EnumC1609b enumC1609b = EnumC1609b.STORAGE;
                final int i6 = 1;
                final UserThemeSlotsActivity userThemeSlotsActivity = this.f9665g;
                switch (i5) {
                    case 0:
                        if (AbstractC1569q1.m4452d(userThemeSlotsActivity.f3321I)) {
                            if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i52) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.ut_delete_title, userThemeSlotsActivity.getString(R.string.ut_delete_message, Integer.valueOf(userThemeSlotsActivity.f3321I)), R.string.ut_delete, new Runnable() { // from class: z0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                int i7 = UserThemeSlotsActivity.f3316L;
                                                UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                                userThemeSlotsActivity2.getClass();
                                                AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                                break;
                                            default:
                                                UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                                int i8 = userThemeSlotsActivity3.f3321I;
                                                int i9 = AbstractC1569q1.f8666a;
                                                cfgData m1784i = cfgData.m1784i();
                                                boolean z2 = false;
                                                if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                    z2 = true;
                                                }
                                                if (i8 >= 1 && i8 <= 9) {
                                                    File m4465q = AbstractC1569q1.m4465q(i8);
                                                    AbstractC1569q1.m4449a(m4465q);
                                                    if (i8 >= 1 && i8 <= 9) {
                                                        AbstractC1569q1.f8670e[i8 - 1] = null;
                                                    }
                                                    m4465q.exists();
                                                }
                                                if (z2) {
                                                    AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                    IPOverlayService.m1668b(userThemeSlotsActivity3);
                                                }
                                                userThemeSlotsActivity3.m2009v(i8);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (!AbstractC1569q1.m4454f(userThemeSlotsActivity.f3321I - 1)) {
                            AbstractC1256E0.m3003R(userThemeSlotsActivity);
                            break;
                        } else if (!AbstractC0088l.m261T(userThemeSlotsActivity, enumC1609b)) {
                            AbstractC1680h.m4857S(userThemeSlotsActivity, R.string.Message, userThemeSlotsActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new Runnable() { // from class: z0.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i52) {
                                        case 0:
                                            int i7 = UserThemeSlotsActivity.f3316L;
                                            UserThemeSlotsActivity userThemeSlotsActivity2 = userThemeSlotsActivity;
                                            userThemeSlotsActivity2.getClass();
                                            AbstractC0088l.m264Y(userThemeSlotsActivity2, EnumC1609b.STORAGE);
                                            break;
                                        default:
                                            UserThemeSlotsActivity userThemeSlotsActivity3 = userThemeSlotsActivity;
                                            int i8 = userThemeSlotsActivity3.f3321I;
                                            int i9 = AbstractC1569q1.f8666a;
                                            cfgData m1784i = cfgData.m1784i();
                                            boolean z2 = false;
                                            if (m1784i != null && i8 >= 1 && AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i8) {
                                                z2 = true;
                                            }
                                            if (i8 >= 1 && i8 <= 9) {
                                                File m4465q = AbstractC1569q1.m4465q(i8);
                                                AbstractC1569q1.m4449a(m4465q);
                                                if (i8 >= 1 && i8 <= 9) {
                                                    AbstractC1569q1.f8670e[i8 - 1] = null;
                                                }
                                                m4465q.exists();
                                            }
                                            if (z2) {
                                                AbstractC1569q1.m4450b(userThemeSlotsActivity3, cfgData.m1784i());
                                                IPOverlayService.m1668b(userThemeSlotsActivity3);
                                            }
                                            userThemeSlotsActivity3.m2009v(i8);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            Intent intent = new Intent(userThemeSlotsActivity, (Class<?>) UserThemeImportActivity.class);
                            intent.putExtra("slot", userThemeSlotsActivity.f3321I);
                            userThemeSlotsActivity.startActivity(intent);
                            break;
                        }
                    case 2:
                        int i7 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        AbstractC1256E0.m3024q(userThemeSlotsActivity);
                        break;
                    default:
                        int i8 = UserThemeSlotsActivity.f3316L;
                        userThemeSlotsActivity.getClass();
                        userThemeSlotsActivity.startActivity(new Intent(userThemeSlotsActivity, (Class<?>) UserThemeHelpActivity.class));
                        break;
                }
            }
        });
        m2009v(1);
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        m2007t();
        super.onDestroy();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        m2009v(this.f3321I);
    }

    /* renamed from: t */
    public final void m2007t() {
        this.f3318F.setImageBitmap(null);
        Bitmap bitmap = this.f3323K;
        if (bitmap != null) {
            bitmap.recycle();
            this.f3323K = null;
        }
    }

    /* renamed from: u */
    public final void m2008u(Bitmap bitmap, int i) {
        View findViewById = findViewById(R.id.ut_preview_host);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if ((width <= 0 || height <= 0) && i < 8) {
            findViewById.post(new RunnableC0017k(this, bitmap, i, 9));
            return;
        }
        if (width <= 0) {
            width = 1;
        }
        if (height <= 0) {
            height = 1;
        }
        float min = Math.min(Math.min(0.5f, width / 1920.0f), height / 720.0f);
        if (min < 0.05f) {
            min = 0.05f;
        }
        ViewGroup.LayoutParams layoutParams = this.f3318F.getLayoutParams();
        layoutParams.width = AbstractC0062j.m152f(min, 1920.0f, 1);
        layoutParams.height = AbstractC0062j.m152f(min, 720.0f, 1);
        this.f3318F.setLayoutParams(layoutParams);
        this.f3318F.setImageBitmap(bitmap);
    }

    /* renamed from: v */
    public final void m2009v(int i) {
        if (!AbstractC1569q1.m4454f(i - 1)) {
            i = 1;
        }
        this.f3321I = i;
        int color = getColor(R.color.btn_write_text);
        int color2 = getColor(R.color.switch_track_on);
        int color3 = getColor(R.color.config_text_paywall_locked);
        int i2 = 0;
        while (true) {
            AppCompatButton[] appCompatButtonArr = this.f3317E;
            if (i2 >= appCompatButtonArr.length) {
                break;
            }
            AppCompatButton appCompatButton = appCompatButtonArr[i2];
            if (appCompatButton != null) {
                boolean m4454f = AbstractC1569q1.m4454f(i2);
                boolean z2 = m4454f && i2 + 1 == this.f3321I;
                appCompatButton.setSelected(z2);
                appCompatButton.setTextColor(m4454f ? z2 ? color2 : color : color3);
            }
            i2++;
        }
        boolean m4452d = AbstractC1569q1.m4452d(this.f3321I);
        this.f3320H.setVisibility(m4452d ? 0 : 4);
        if (!m4452d) {
            m2007t();
            this.f3318F.setVisibility(4);
            this.f3319G.setText(R.string.ut_slot_empty);
            this.f3319G.setVisibility(0);
            return;
        }
        this.f3319G.setText(R.string.ut_preview_loading);
        this.f3319G.setVisibility(0);
        this.f3318F.setVisibility(4);
        int i3 = this.f3322J + 1;
        this.f3322J = i3;
        this.f3318F.post(new RunnableC0646n(this, i3, this.f3321I, 2));
    }
}
