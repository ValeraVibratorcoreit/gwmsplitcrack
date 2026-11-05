package com.altaysoft.t500_split.userthemes;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.IPOverlayService;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p010D1.AbstractC0088l;
import p034Q0.C0295l;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1372y1;
import p098q0.C1315f1;
import p109u0.AbstractC1569q1;
import p109u0.RunnableC1559n0;
import p112v0.EnumC1609b;
import p115w0.C1629k;
import p115w0.C1632n;
import p121y0.AbstractC1680h;
import p124z0.C1708g;
import p124z0.RunnableC1704c;

/* loaded from: classes.dex */
public class UserThemeImportActivity extends AbstractActivityC0870i {

    /* renamed from: V */
    public static final /* synthetic */ int f3298V = 0;

    /* renamed from: G */
    public C1632n f3301G;

    /* renamed from: K */
    public int f3305K;

    /* renamed from: L */
    public boolean f3306L;

    /* renamed from: M */
    public AppCompatButton f3307M;

    /* renamed from: N */
    public AppCompatButton f3308N;

    /* renamed from: O */
    public AppCompatButton f3309O;

    /* renamed from: P */
    public AppCompatButton f3310P;

    /* renamed from: Q */
    public TextView f3311Q;

    /* renamed from: R */
    public TextView f3312R;

    /* renamed from: S */
    public ScrollView f3313S;

    /* renamed from: U */
    public boolean f3315U;

    /* renamed from: E */
    public final ArrayList f3299E = new ArrayList();

    /* renamed from: F */
    public final HashMap f3300F = new HashMap();

    /* renamed from: H */
    public int f3302H = -1;

    /* renamed from: I */
    public int f3303I = 1;

    /* renamed from: J */
    public int f3304J = 0;

    /* renamed from: T */
    public final StringBuilder f3314T = new StringBuilder();

    /* renamed from: t */
    public static String m1997t(UserThemeImportActivity userThemeImportActivity, String str) {
        userThemeImportActivity.getClass();
        return str == null ? "" : "catalog".equals(str) ? userThemeImportActivity.getString(R.string.ut_log_catalog) : "themes.json".equals(str) ? userThemeImportActivity.getString(R.string.ut_log_json) : "themes.list".equals(str) ? userThemeImportActivity.getString(R.string.ut_log_listfile) : "index".equals(str) ? userThemeImportActivity.getString(R.string.ut_log_index) : str.startsWith("folders:") ? userThemeImportActivity.getString(R.string.ut_log_folders, str.substring(8)) : str.startsWith("done:") ? userThemeImportActivity.getString(R.string.ut_log_done_n, str.substring(5)) : str.startsWith("info:") ? userThemeImportActivity.getString(R.string.ut_log_info, str.substring(5)) : str.startsWith("preview:") ? userThemeImportActivity.getString(R.string.ut_log_preview, str.substring(8)) : str.startsWith("zip:") ? userThemeImportActivity.getString(R.string.ut_log_zip, str.substring(4)) : str;
    }

    /* renamed from: A */
    public final void m1998A() {
        int i;
        AppCompatButton appCompatButton = this.f3307M;
        if (appCompatButton != null) {
            appCompatButton.setEnabled(!this.f3306L && (i = this.f3302H) >= 0 && i < this.f3299E.size());
        }
    }

    /* renamed from: B */
    public final void m1999B(boolean z2) {
        ScrollView scrollView = this.f3313S;
        if (scrollView != null) {
            scrollView.setVisibility(z2 ? 0 : 4);
        }
    }

    /* renamed from: C */
    public final void m2000C() {
        m2006z(this.f3308N, this.f3304J == 0);
        m2006z(this.f3309O, this.f3304J == 1);
        m2006z(this.f3310P, this.f3304J == 2);
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 3;
        super.onCreate(bundle);
        final int i2 = 1;
        int intExtra = getIntent().getIntExtra("slot", 1);
        this.f3303I = intExtra;
        if (intExtra < 1 || intExtra > 9 || !AbstractC1569q1.m4454f(intExtra - 1)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_user_theme_import);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        ((TextView) findViewById(R.id.ut_import_title)).setText(getString(R.string.ut_import_title_slot, Integer.valueOf(this.f3303I)));
        this.f3311Q = (TextView) findViewById(R.id.ut_import_empty);
        this.f3312R = (TextView) findViewById(R.id.ut_import_log);
        this.f3313S = (ScrollView) findViewById(R.id.ut_import_log_scroll);
        ListView listView = (ListView) findViewById(R.id.ut_import_list);
        C1632n c1632n = new C1632n(this, i);
        this.f3301G = c1632n;
        listView.setAdapter((ListAdapter) c1632n);
        listView.setOnItemClickListener(new C1629k(this, i2));
        this.f3308N = (AppCompatButton) findViewById(R.id.ut_src_disk);
        this.f3309O = (AppCompatButton) findViewById(R.id.ut_src_usb);
        this.f3310P = (AppCompatButton) findViewById(R.id.ut_src_shop);
        final int i3 = 0;
        this.f3308N.setOnClickListener(new View.OnClickListener(this) { // from class: z0.e

            /* renamed from: g */
            public final /* synthetic */ UserThemeImportActivity f9648g;

            {
                this.f9648g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4;
                UserThemeImportActivity userThemeImportActivity = this.f9648g;
                switch (i3) {
                    case 0:
                        int i5 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(0);
                        break;
                    case 1:
                        int i6 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(1);
                        break;
                    case 2:
                        int i7 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(2);
                        break;
                    case 3:
                        int i8 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2004x();
                        break;
                    case 4:
                        int i9 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.finish();
                        break;
                    default:
                        if (!userThemeImportActivity.f3306L && (i4 = userThemeImportActivity.f3302H) >= 0 && i4 < userThemeImportActivity.f3299E.size()) {
                            if (!AbstractC0088l.m261T(userThemeImportActivity, EnumC1609b.STORAGE)) {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.Message, userThemeImportActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new RunnableC1704c(userThemeImportActivity, 3));
                                break;
                            } else if (!AbstractC1569q1.m4452d(userThemeImportActivity.f3303I)) {
                                userThemeImportActivity.m2003w();
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.ut_overwrite_title, userThemeImportActivity.getString(R.string.ut_overwrite_message, Integer.valueOf(userThemeImportActivity.f3303I)), R.string.ut_import_go, new RunnableC1704c(userThemeImportActivity, 4));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.f3309O.setOnClickListener(new View.OnClickListener(this) { // from class: z0.e

            /* renamed from: g */
            public final /* synthetic */ UserThemeImportActivity f9648g;

            {
                this.f9648g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4;
                UserThemeImportActivity userThemeImportActivity = this.f9648g;
                switch (i2) {
                    case 0:
                        int i5 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(0);
                        break;
                    case 1:
                        int i6 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(1);
                        break;
                    case 2:
                        int i7 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(2);
                        break;
                    case 3:
                        int i8 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2004x();
                        break;
                    case 4:
                        int i9 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.finish();
                        break;
                    default:
                        if (!userThemeImportActivity.f3306L && (i4 = userThemeImportActivity.f3302H) >= 0 && i4 < userThemeImportActivity.f3299E.size()) {
                            if (!AbstractC0088l.m261T(userThemeImportActivity, EnumC1609b.STORAGE)) {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.Message, userThemeImportActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new RunnableC1704c(userThemeImportActivity, 3));
                                break;
                            } else if (!AbstractC1569q1.m4452d(userThemeImportActivity.f3303I)) {
                                userThemeImportActivity.m2003w();
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.ut_overwrite_title, userThemeImportActivity.getString(R.string.ut_overwrite_message, Integer.valueOf(userThemeImportActivity.f3303I)), R.string.ut_import_go, new RunnableC1704c(userThemeImportActivity, 4));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i4 = 2;
        this.f3310P.setOnClickListener(new View.OnClickListener(this) { // from class: z0.e

            /* renamed from: g */
            public final /* synthetic */ UserThemeImportActivity f9648g;

            {
                this.f9648g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                UserThemeImportActivity userThemeImportActivity = this.f9648g;
                switch (i4) {
                    case 0:
                        int i5 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(0);
                        break;
                    case 1:
                        int i6 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(1);
                        break;
                    case 2:
                        int i7 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(2);
                        break;
                    case 3:
                        int i8 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2004x();
                        break;
                    case 4:
                        int i9 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.finish();
                        break;
                    default:
                        if (!userThemeImportActivity.f3306L && (i42 = userThemeImportActivity.f3302H) >= 0 && i42 < userThemeImportActivity.f3299E.size()) {
                            if (!AbstractC0088l.m261T(userThemeImportActivity, EnumC1609b.STORAGE)) {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.Message, userThemeImportActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new RunnableC1704c(userThemeImportActivity, 3));
                                break;
                            } else if (!AbstractC1569q1.m4452d(userThemeImportActivity.f3303I)) {
                                userThemeImportActivity.m2003w();
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.ut_overwrite_title, userThemeImportActivity.getString(R.string.ut_overwrite_message, Integer.valueOf(userThemeImportActivity.f3303I)), R.string.ut_import_go, new RunnableC1704c(userThemeImportActivity, 4));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        findViewById(R.id.ut_import_reread).setOnClickListener(new View.OnClickListener(this) { // from class: z0.e

            /* renamed from: g */
            public final /* synthetic */ UserThemeImportActivity f9648g;

            {
                this.f9648g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                UserThemeImportActivity userThemeImportActivity = this.f9648g;
                switch (i) {
                    case 0:
                        int i5 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(0);
                        break;
                    case 1:
                        int i6 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(1);
                        break;
                    case 2:
                        int i7 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(2);
                        break;
                    case 3:
                        int i8 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2004x();
                        break;
                    case 4:
                        int i9 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.finish();
                        break;
                    default:
                        if (!userThemeImportActivity.f3306L && (i42 = userThemeImportActivity.f3302H) >= 0 && i42 < userThemeImportActivity.f3299E.size()) {
                            if (!AbstractC0088l.m261T(userThemeImportActivity, EnumC1609b.STORAGE)) {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.Message, userThemeImportActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new RunnableC1704c(userThemeImportActivity, 3));
                                break;
                            } else if (!AbstractC1569q1.m4452d(userThemeImportActivity.f3303I)) {
                                userThemeImportActivity.m2003w();
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.ut_overwrite_title, userThemeImportActivity.getString(R.string.ut_overwrite_message, Integer.valueOf(userThemeImportActivity.f3303I)), R.string.ut_import_go, new RunnableC1704c(userThemeImportActivity, 4));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.f3307M = (AppCompatButton) findViewById(R.id.ut_import_go);
        final int i5 = 4;
        findViewById(R.id.ut_import_close).setOnClickListener(new View.OnClickListener(this) { // from class: z0.e

            /* renamed from: g */
            public final /* synthetic */ UserThemeImportActivity f9648g;

            {
                this.f9648g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                UserThemeImportActivity userThemeImportActivity = this.f9648g;
                switch (i5) {
                    case 0:
                        int i52 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(0);
                        break;
                    case 1:
                        int i6 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(1);
                        break;
                    case 2:
                        int i7 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(2);
                        break;
                    case 3:
                        int i8 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2004x();
                        break;
                    case 4:
                        int i9 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.finish();
                        break;
                    default:
                        if (!userThemeImportActivity.f3306L && (i42 = userThemeImportActivity.f3302H) >= 0 && i42 < userThemeImportActivity.f3299E.size()) {
                            if (!AbstractC0088l.m261T(userThemeImportActivity, EnumC1609b.STORAGE)) {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.Message, userThemeImportActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new RunnableC1704c(userThemeImportActivity, 3));
                                break;
                            } else if (!AbstractC1569q1.m4452d(userThemeImportActivity.f3303I)) {
                                userThemeImportActivity.m2003w();
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.ut_overwrite_title, userThemeImportActivity.getString(R.string.ut_overwrite_message, Integer.valueOf(userThemeImportActivity.f3303I)), R.string.ut_import_go, new RunnableC1704c(userThemeImportActivity, 4));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i6 = 5;
        this.f3307M.setOnClickListener(new View.OnClickListener(this) { // from class: z0.e

            /* renamed from: g */
            public final /* synthetic */ UserThemeImportActivity f9648g;

            {
                this.f9648g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                UserThemeImportActivity userThemeImportActivity = this.f9648g;
                switch (i6) {
                    case 0:
                        int i52 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(0);
                        break;
                    case 1:
                        int i62 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(1);
                        break;
                    case 2:
                        int i7 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2005y(2);
                        break;
                    case 3:
                        int i8 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.m2004x();
                        break;
                    case 4:
                        int i9 = UserThemeImportActivity.f3298V;
                        userThemeImportActivity.finish();
                        break;
                    default:
                        if (!userThemeImportActivity.f3306L && (i42 = userThemeImportActivity.f3302H) >= 0 && i42 < userThemeImportActivity.f3299E.size()) {
                            if (!AbstractC0088l.m261T(userThemeImportActivity, EnumC1609b.STORAGE)) {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.Message, userThemeImportActivity.getString(R.string.ut_storage_need), R.string.btnOpenAndroidSettings, new RunnableC1704c(userThemeImportActivity, 3));
                                break;
                            } else if (!AbstractC1569q1.m4452d(userThemeImportActivity.f3303I)) {
                                userThemeImportActivity.m2003w();
                                break;
                            } else {
                                AbstractC1680h.m4857S(userThemeImportActivity, R.string.ut_overwrite_title, userThemeImportActivity.getString(R.string.ut_overwrite_message, Integer.valueOf(userThemeImportActivity.f3303I)), R.string.ut_import_go, new RunnableC1704c(userThemeImportActivity, 4));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        m2000C();
        m2004x();
    }

    /* renamed from: u */
    public final boolean m2001u() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    /* renamed from: v */
    public final void m2002v(String str) {
        if (this.f3312R == null || str == null || str.isEmpty()) {
            return;
        }
        m1999B(true);
        StringBuilder sb = this.f3314T;
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
        this.f3315U = false;
        this.f3312R.setText(sb.toString());
        ScrollView scrollView = this.f3313S;
        if (scrollView == null) {
            return;
        }
        scrollView.post(new RunnableC1704c(this, 2));
    }

    /* renamed from: w */
    public final void m2003w() {
        int i;
        final boolean z2;
        if (this.f3306L || (i = this.f3302H) < 0) {
            return;
        }
        ArrayList arrayList = this.f3299E;
        if (i >= arrayList.size()) {
            return;
        }
        final C1708g c1708g = (C1708g) arrayList.get(this.f3302H);
        this.f3306L = true;
        m1998A();
        final boolean z3 = c1708g.f9660h != null;
        if (z3) {
            this.f3314T.setLength(0);
            this.f3315U = false;
            TextView textView = this.f3312R;
            if (textView != null) {
                textView.setText("");
            }
            m1999B(true);
        }
        final C1315f1 c1315f1 = z3 ? new C1315f1(this) : null;
        int i2 = this.f3303I;
        int i3 = AbstractC1569q1.f8666a;
        cfgData m1784i = cfgData.m1784i();
        if (m1784i == null || i2 < 1) {
            z2 = false;
        } else {
            z2 = AbstractC1569q1.m4455g(m1784i.f2620e1) && AbstractC1569q1.m4466r(m1784i.f2620e1) == i2;
        }
        new Thread(new Runnable() { // from class: z0.b
            @Override // java.lang.Runnable
            public final void run() {
                C1708g m4987m;
                C1315f1 c1315f12 = c1315f1;
                final boolean z4 = z2;
                int i4 = UserThemeImportActivity.f3298V;
                final UserThemeImportActivity userThemeImportActivity = UserThemeImportActivity.this;
                userThemeImportActivity.getClass();
                final C1708g c1708g2 = c1708g;
                final boolean z5 = z3;
                if (z5) {
                    try {
                        m4987m = AbstractC1709h.m4987m(userThemeImportActivity, c1708g2, c1315f12);
                        userThemeImportActivity.runOnUiThread(new RunnableC1704c(userThemeImportActivity, 0));
                    } catch (Exception e2) {
                        String message = e2.getMessage();
                        if (message == null || message.isEmpty()) {
                            message = e2.getClass().getSimpleName();
                        }
                        userThemeImportActivity.runOnUiThread(new RunnableC1559n0(userThemeImportActivity, 21, message));
                        return;
                    }
                } else {
                    m4987m = c1708g2;
                }
                AbstractC1709h.m4983i(userThemeImportActivity, m4987m, userThemeImportActivity.f3303I);
                userThemeImportActivity.runOnUiThread(new Runnable() { // from class: z0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = UserThemeImportActivity.f3298V;
                        boolean z6 = z4;
                        UserThemeImportActivity userThemeImportActivity2 = UserThemeImportActivity.this;
                        if (z6) {
                            IPOverlayService.m1668b(userThemeImportActivity2.getApplicationContext());
                        }
                        if (userThemeImportActivity2.m2001u()) {
                            if (z5) {
                                userThemeImportActivity2.m2002v(userThemeImportActivity2.getString(R.string.ut_log_ready));
                            }
                            userThemeImportActivity2.f3306L = false;
                            AbstractC1372y1.m3288S(userThemeImportActivity2, userThemeImportActivity2.getString(R.string.Message), userThemeImportActivity2.getString(R.string.ut_import_ok, c1708g2.f9654b, Integer.valueOf(userThemeImportActivity2.f3303I)), new RunnableC1704c(userThemeImportActivity2, 1));
                        }
                    }
                });
            }
        }, "ut-import-go").start();
    }

    /* renamed from: x */
    public final void m2004x() {
        final int i = this.f3305K + 1;
        this.f3305K = i;
        this.f3302H = -1;
        this.f3299E.clear();
        this.f3301G.notifyDataSetChanged();
        this.f3311Q.setText(R.string.ut_import_loading);
        this.f3311Q.setVisibility(0);
        this.f3314T.setLength(0);
        this.f3315U = false;
        TextView textView = this.f3312R;
        if (textView != null) {
            textView.setText("");
        }
        m1999B(this.f3304J == 2);
        m1998A();
        final int i2 = this.f3304J;
        final C1315f1 c1315f1 = i2 == 2 ? new C1315f1(this) : null;
        new Thread(new Runnable() { // from class: z0.f
            @Override // java.lang.Runnable
            public final void run() {
                String simpleName;
                final boolean z2;
                final String str;
                C1315f1 c1315f12 = c1315f1;
                int i3 = UserThemeImportActivity.f3298V;
                final UserThemeImportActivity userThemeImportActivity = UserThemeImportActivity.this;
                userThemeImportActivity.getClass();
                final ArrayList arrayList = new ArrayList();
                final int i4 = i2;
                boolean z3 = false;
                try {
                    if (i4 == 0) {
                        Pattern pattern = AbstractC1709h.f9661a;
                        int i5 = AbstractC1569q1.f8666a;
                        File externalStorageDirectory = Environment.getExternalStorageDirectory();
                        if (externalStorageDirectory == null) {
                            externalStorageDirectory = new File("/storage/emulated/0");
                        }
                        File file = new File(new File(externalStorageDirectory, "gwm_split_user_themes"), "exchange");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        arrayList.addAll(AbstractC1709h.m4984j(file));
                    } else if (i4 == 1) {
                        z3 = AbstractC1709h.m4992r(userThemeImportActivity).isEmpty();
                        if (!z3) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = AbstractC1709h.m4992r(userThemeImportActivity).iterator();
                            while (it.hasNext()) {
                                arrayList2.addAll(AbstractC1709h.m4984j((File) it.next()));
                            }
                            Collections.sort(arrayList2, new C0295l(7));
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList.addAll(AbstractC1709h.m4985k(userThemeImportActivity, c1315f12));
                    }
                    simpleName = null;
                } catch (Exception e2) {
                    String message = e2.getMessage();
                    if (message == null || message.isEmpty()) {
                        simpleName = e2.getClass().getSimpleName();
                    } else {
                        z2 = false;
                        str = message;
                    }
                }
                str = simpleName;
                z2 = z3;
                final int i6 = i;
                userThemeImportActivity.runOnUiThread(new Runnable() { // from class: z0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = UserThemeImportActivity.f3298V;
                        UserThemeImportActivity userThemeImportActivity2 = UserThemeImportActivity.this;
                        if (userThemeImportActivity2.isFinishing()) {
                            return;
                        }
                        if (i6 != userThemeImportActivity2.f3305K) {
                            return;
                        }
                        ArrayList arrayList3 = userThemeImportActivity2.f3299E;
                        arrayList3.clear();
                        ArrayList arrayList4 = arrayList;
                        arrayList3.addAll(arrayList4);
                        userThemeImportActivity2.f3301G.notifyDataSetChanged();
                        String str2 = str;
                        int i8 = i4;
                        if (str2 != null) {
                            TextView textView2 = userThemeImportActivity2.f3311Q;
                            if (i8 == 2) {
                                str2 = userThemeImportActivity2.getString(R.string.ut_import_shop_fail, str2);
                            }
                            textView2.setText(str2);
                            userThemeImportActivity2.f3311Q.setVisibility(0);
                        } else if (arrayList4.isEmpty()) {
                            if (i8 == 1 && z2) {
                                userThemeImportActivity2.f3311Q.setText(R.string.ut_import_usb_none);
                            } else if (i8 == 1) {
                                userThemeImportActivity2.f3311Q.setText(R.string.ut_import_empty_usb);
                            } else if (i8 == 2) {
                                userThemeImportActivity2.f3311Q.setText(R.string.ut_import_empty_shop);
                            } else {
                                userThemeImportActivity2.f3311Q.setText(R.string.ut_import_empty_disk);
                            }
                            userThemeImportActivity2.f3311Q.setVisibility(0);
                        } else {
                            userThemeImportActivity2.f3311Q.setVisibility(4);
                        }
                        userThemeImportActivity2.m1999B(i8 == 2);
                        userThemeImportActivity2.m1998A();
                    }
                });
            }
        }, "ut-import-list").start();
    }

    /* renamed from: y */
    public final void m2005y(int i) {
        if (this.f3304J == i || this.f3306L) {
            return;
        }
        this.f3304J = i;
        m2000C();
        m2004x();
    }

    /* renamed from: z */
    public final void m2006z(AppCompatButton appCompatButton, boolean z2) {
        if (appCompatButton == null) {
            return;
        }
        appCompatButton.setSelected(z2);
        appCompatButton.setTextColor(getColor(z2 ? R.color.switch_track_on : R.color.btn_write_text));
    }
}
