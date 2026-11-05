package com.altaysoft.t500_split.splitinfo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.ToggleButton;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.splitinfo.ChartsFullscreenActivity;
import com.altaysoft.t500_split.splitinfo.FullscreenChartsView;
import p001A0.RunnableC0020n;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p082l.C1142t0;
import p098q0.AbstractC1256E0;
import p118x0.C1660p;

/* loaded from: classes.dex */
public final class ChartsFullscreenActivity extends AbstractActivityC0870i {

    /* renamed from: M */
    public static final int[] f3123M = {5, 10, 30, 60};

    /* renamed from: F */
    public FullscreenChartsView f3125F;

    /* renamed from: G */
    public LinearLayout f3126G;

    /* renamed from: H */
    public ToggleButton f3127H;

    /* renamed from: I */
    public ToggleButton f3128I;

    /* renamed from: J */
    public boolean f3129J;

    /* renamed from: K */
    public boolean f3130K;

    /* renamed from: E */
    public final Handler f3124E = new Handler(Looper.getMainLooper());

    /* renamed from: L */
    public final RunnableC0020n f3131L = new RunnableC0020n(26, this);

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_charts_fullscreen);
        this.f3125F = (FullscreenChartsView) findViewById(R.id.charts_fs_view);
        this.f3126G = (LinearLayout) findViewById(R.id.charts_fs_series_row);
        this.f3127H = (ToggleButton) findViewById(R.id.charts_fs_tog1);
        this.f3128I = (ToggleButton) findViewById(R.id.charts_fs_tog2);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.charts_fs_spd);
        ToggleButton toggleButton2 = (ToggleButton) findViewById(R.id.charts_fs_rpm);
        ToggleButton toggleButton3 = (ToggleButton) findViewById(R.id.charts_fs_gear);
        Spinner spinner = (Spinner) findViewById(R.id.charts_fs_window);
        ImageButton imageButton = (ImageButton) findViewById(R.id.charts_fs_close);
        Intent intent = getIntent();
        boolean z2 = intent == null || intent.getBooleanExtra("show_spd", true);
        boolean z3 = intent == null || intent.getBooleanExtra("show_rpm", true);
        boolean z4 = intent == null || intent.getBooleanExtra("show_gear", true);
        int intExtra = intent != null ? intent.getIntExtra("window_min", 10) : 10;
        int intExtra2 = intent != null ? intent.getIntExtra("chart", 1) : 1;
        if (toggleButton != null) {
            toggleButton.setChecked(z2);
            toggleButton.setAlpha(z2 ? 1.0f : 0.35f);
            final int i = 0;
            toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.a

                /* renamed from: b */
                public final /* synthetic */ ChartsFullscreenActivity f9328b;

                {
                    this.f9328b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                    ChartsFullscreenActivity chartsFullscreenActivity = this.f9328b;
                    switch (i) {
                        case 0:
                            int[] iArr = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView != null) {
                                fullscreenChartsView.setShowSpd(z5);
                                break;
                            }
                            break;
                        case 1:
                            int[] iArr2 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView2 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView2 != null) {
                                fullscreenChartsView2.setShowRpm(z5);
                                break;
                            }
                            break;
                        case 2:
                            int[] iArr3 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView3 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView3 != null) {
                                fullscreenChartsView3.setShowGear(z5);
                                break;
                            }
                            break;
                        case 3:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton4 = chartsFullscreenActivity.f3128I;
                                    if (toggleButton4 != null && !toggleButton4.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(1);
                                    break;
                                }
                            }
                            break;
                        default:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton5 = chartsFullscreenActivity.f3127H;
                                    if (toggleButton5 != null && !toggleButton5.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (toggleButton2 != null) {
            toggleButton2.setChecked(z3);
            toggleButton2.setAlpha(z3 ? 1.0f : 0.35f);
            final int i2 = 1;
            toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.a

                /* renamed from: b */
                public final /* synthetic */ ChartsFullscreenActivity f9328b;

                {
                    this.f9328b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                    ChartsFullscreenActivity chartsFullscreenActivity = this.f9328b;
                    switch (i2) {
                        case 0:
                            int[] iArr = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView != null) {
                                fullscreenChartsView.setShowSpd(z5);
                                break;
                            }
                            break;
                        case 1:
                            int[] iArr2 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView2 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView2 != null) {
                                fullscreenChartsView2.setShowRpm(z5);
                                break;
                            }
                            break;
                        case 2:
                            int[] iArr3 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView3 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView3 != null) {
                                fullscreenChartsView3.setShowGear(z5);
                                break;
                            }
                            break;
                        case 3:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton4 = chartsFullscreenActivity.f3128I;
                                    if (toggleButton4 != null && !toggleButton4.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(1);
                                    break;
                                }
                            }
                            break;
                        default:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton5 = chartsFullscreenActivity.f3127H;
                                    if (toggleButton5 != null && !toggleButton5.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (toggleButton3 != null) {
            toggleButton3.setChecked(z4);
            toggleButton3.setAlpha(z4 ? 1.0f : 0.35f);
            final int i3 = 2;
            toggleButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.a

                /* renamed from: b */
                public final /* synthetic */ ChartsFullscreenActivity f9328b;

                {
                    this.f9328b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                    ChartsFullscreenActivity chartsFullscreenActivity = this.f9328b;
                    switch (i3) {
                        case 0:
                            int[] iArr = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView != null) {
                                fullscreenChartsView.setShowSpd(z5);
                                break;
                            }
                            break;
                        case 1:
                            int[] iArr2 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView2 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView2 != null) {
                                fullscreenChartsView2.setShowRpm(z5);
                                break;
                            }
                            break;
                        case 2:
                            int[] iArr3 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView3 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView3 != null) {
                                fullscreenChartsView3.setShowGear(z5);
                                break;
                            }
                            break;
                        case 3:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton4 = chartsFullscreenActivity.f3128I;
                                    if (toggleButton4 != null && !toggleButton4.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(1);
                                    break;
                                }
                            }
                            break;
                        default:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton5 = chartsFullscreenActivity.f3127H;
                                    if (toggleButton5 != null && !toggleButton5.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        FullscreenChartsView fullscreenChartsView = this.f3125F;
        if (fullscreenChartsView != null) {
            fullscreenChartsView.setShowSpd(z2);
            this.f3125F.setShowRpm(z3);
            this.f3125F.setShowGear(z4);
            this.f3125F.setWindowMinutes(intExtra);
            this.f3125F.setChartMode(intExtra2);
            this.f3125F.setSamples(C1660p.m4812a().f9467a.m4751a());
        }
        m1953t(intExtra2 != 2 ? 1 : 2);
        ToggleButton toggleButton4 = this.f3127H;
        if (toggleButton4 != null) {
            final int i4 = 3;
            toggleButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.a

                /* renamed from: b */
                public final /* synthetic */ ChartsFullscreenActivity f9328b;

                {
                    this.f9328b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                    ChartsFullscreenActivity chartsFullscreenActivity = this.f9328b;
                    switch (i4) {
                        case 0:
                            int[] iArr = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView2 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView2 != null) {
                                fullscreenChartsView2.setShowSpd(z5);
                                break;
                            }
                            break;
                        case 1:
                            int[] iArr2 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView22 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView22 != null) {
                                fullscreenChartsView22.setShowRpm(z5);
                                break;
                            }
                            break;
                        case 2:
                            int[] iArr3 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView3 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView3 != null) {
                                fullscreenChartsView3.setShowGear(z5);
                                break;
                            }
                            break;
                        case 3:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton42 = chartsFullscreenActivity.f3128I;
                                    if (toggleButton42 != null && !toggleButton42.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(1);
                                    break;
                                }
                            }
                            break;
                        default:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton5 = chartsFullscreenActivity.f3127H;
                                    if (toggleButton5 != null && !toggleButton5.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        ToggleButton toggleButton5 = this.f3128I;
        if (toggleButton5 != null) {
            final int i5 = 4;
            toggleButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.a

                /* renamed from: b */
                public final /* synthetic */ ChartsFullscreenActivity f9328b;

                {
                    this.f9328b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                    ChartsFullscreenActivity chartsFullscreenActivity = this.f9328b;
                    switch (i5) {
                        case 0:
                            int[] iArr = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView2 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView2 != null) {
                                fullscreenChartsView2.setShowSpd(z5);
                                break;
                            }
                            break;
                        case 1:
                            int[] iArr2 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView22 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView22 != null) {
                                fullscreenChartsView22.setShowRpm(z5);
                                break;
                            }
                            break;
                        case 2:
                            int[] iArr3 = ChartsFullscreenActivity.f3123M;
                            chartsFullscreenActivity.getClass();
                            compoundButton.setAlpha(z5 ? 1.0f : 0.35f);
                            FullscreenChartsView fullscreenChartsView3 = chartsFullscreenActivity.f3125F;
                            if (fullscreenChartsView3 != null) {
                                fullscreenChartsView3.setShowGear(z5);
                                break;
                            }
                            break;
                        case 3:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton42 = chartsFullscreenActivity.f3128I;
                                    if (toggleButton42 != null && !toggleButton42.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(1);
                                    break;
                                }
                            }
                            break;
                        default:
                            if (!chartsFullscreenActivity.f3130K) {
                                if (!z5) {
                                    ToggleButton toggleButton52 = chartsFullscreenActivity.f3127H;
                                    if (toggleButton52 != null && !toggleButton52.isChecked()) {
                                        chartsFullscreenActivity.f3130K = true;
                                        compoundButton.setChecked(true);
                                        chartsFullscreenActivity.f3130K = false;
                                        break;
                                    }
                                } else {
                                    chartsFullscreenActivity.m1953t(2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (spinner != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= 4) {
                    i6 = 1;
                    break;
                } else if (f3123M[i6] == intExtra) {
                    break;
                } else {
                    i6++;
                }
            }
            spinner.setSelection(i6, false);
            spinner.setOnItemSelectedListener(new C1142t0(1, this));
            this.f3129J = true;
        }
        if (imageButton != null) {
            imageButton.setOnClickListener(new ViewOnClickListenerC0492a(13, this));
        }
        C1660p.m4812a().m4814c();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        this.f3124E.removeCallbacks(this.f3131L);
        AbstractC1256E0.m2989D(this, false);
        super.onDestroy();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onPause() {
        this.f3124E.removeCallbacks(this.f3131L);
        super.onPause();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        Handler handler = this.f3124E;
        RunnableC0020n runnableC0020n = this.f3131L;
        handler.removeCallbacks(runnableC0020n);
        handler.post(runnableC0020n);
    }

    /* renamed from: t */
    public final void m1953t(int i) {
        this.f3130K = true;
        ToggleButton toggleButton = this.f3127H;
        if (toggleButton != null) {
            toggleButton.setChecked(i == 1);
        }
        ToggleButton toggleButton2 = this.f3128I;
        if (toggleButton2 != null) {
            toggleButton2.setChecked(i == 2);
        }
        ToggleButton toggleButton3 = this.f3127H;
        if (toggleButton3 != null) {
            toggleButton3.setAlpha(i == 1 ? 1.0f : 0.4f);
        }
        ToggleButton toggleButton4 = this.f3128I;
        if (toggleButton4 != null) {
            toggleButton4.setAlpha(i == 2 ? 1.0f : 0.4f);
        }
        LinearLayout linearLayout = this.f3126G;
        if (linearLayout != null) {
            linearLayout.setVisibility(i == 1 ? 0 : 8);
        }
        FullscreenChartsView fullscreenChartsView = this.f3125F;
        if (fullscreenChartsView != null) {
            fullscreenChartsView.setChartMode(i);
            FullscreenChartsView fullscreenChartsView2 = this.f3125F;
            if (!Float.isNaN(fullscreenChartsView2.f3192z)) {
                fullscreenChartsView2.f3192z = Float.NaN;
                fullscreenChartsView2.invalidate();
            }
        }
        this.f3130K = false;
    }
}
