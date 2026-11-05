package com.altaysoft.t500_split;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.ClimateTestActivity;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0009c;
import p001A0.RunnableC0010d;
import p001A0.RunnableC0018l;
import p001A0.RunnableC0022p;
import p001A0.RunnableC0024r;
import p070g.AbstractActivityC0870i;
import p098q0.C1352s;
import p098q0.C1355t;
import p098q0.RunnableC1349r;
import p098q0.ViewOnClickListenerC1346q;

/* loaded from: classes.dex */
public class ClimateTestActivity extends AbstractActivityC0870i {

    /* renamed from: I */
    public static final /* synthetic */ int f2265I = 0;

    /* renamed from: E */
    public final carData f2266E = carData.getInstance();

    /* renamed from: F */
    public final ArrayList f2267F = new ArrayList();

    /* renamed from: G */
    public LinearLayout f2268G;

    /* renamed from: H */
    public volatile boolean f2269H;

    /* renamed from: B */
    public static void m1649B(Button button, boolean z2) {
        int i = z2 ? -13312 : -14013878;
        button.setBackgroundTintList(ColorStateList.valueOf(i));
        button.setBackgroundColor(i);
        button.setTextColor(z2 ? -15658735 : -1118482);
    }

    /* renamed from: x */
    public static C1355t m1650x(String str, int i, int i2, Runnable runnable) {
        return new C1355t(str, i, i2, 0.0f, false, runnable);
    }

    /* renamed from: y */
    public static C1355t m1651y(String str, float f2) {
        return new C1355t(str, 4, 0, f2, true, new RunnableC1349r(0, f2));
    }

    /* renamed from: A */
    public final LinearLayout m1652A() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (java.lang.Math.abs(r5.f6356d - r7) < 0.26f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0187, code lost:
    
        if (r5.f6355c == r7) goto L27;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1653C() {
        int intValue;
        carData cardata = this.f2266E;
        Integer num = (Integer) cardata.f2412R0.m1395d();
        boolean z2 = (num != null ? num.intValue() : 0) == 2;
        Iterator it = this.f2267F.iterator();
        while (it.hasNext()) {
            C1352s c1352s = (C1352s) it.next();
            Button button = c1352s.f6353a;
            int i = c1352s.f6354b;
            if (i != 6 || !z2) {
                if (!c1352s.f6357e) {
                    switch (i) {
                        case 0:
                            Integer num2 = (Integer) cardata.f2398K0.m1395d();
                            if (num2 != null) {
                                intValue = num2.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 1:
                            Integer num3 = (Integer) cardata.f2400L0.m1395d();
                            if (num3 != null) {
                                intValue = num3.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 2:
                            Integer num4 = (Integer) cardata.f2402M0.m1395d();
                            if (num4 != null) {
                                intValue = num4.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 3:
                            Integer num5 = (Integer) cardata.f2404N0.m1395d();
                            if (num5 != null) {
                                intValue = num5.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 4:
                        default:
                            intValue = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                            break;
                        case 5:
                            Integer num6 = (Integer) cardata.f2408P0.m1395d();
                            if (num6 != null) {
                                intValue = num6.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 6:
                            Integer num7 = (Integer) cardata.f2410Q0.m1395d();
                            if (num7 != null) {
                                intValue = num7.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 7:
                            Integer num8 = (Integer) cardata.f2412R0.m1395d();
                            if (num8 != null) {
                                intValue = num8.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 8:
                            Integer num9 = (Integer) cardata.f2418U0.m1395d();
                            if (num9 != null) {
                                intValue = num9.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case Platform.GNU /* 9 */:
                            Integer num10 = (Integer) cardata.f2420V0.m1395d();
                            if (num10 != null) {
                                intValue = num10.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case Platform.KFREEBSD /* 10 */:
                            Integer num11 = (Integer) cardata.f2422W0.m1395d();
                            if (num11 != null) {
                                intValue = num11.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case Platform.NETBSD /* 11 */:
                            Integer num12 = (Integer) cardata.f2424X0.m1395d();
                            if (num12 != null) {
                                intValue = num12.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case Platform.DRAGONFLYBSD /* 12 */:
                            Integer num13 = (Integer) cardata.f2426Y0.m1395d();
                            if (num13 != null) {
                                intValue = num13.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 13:
                            Integer num14 = (Integer) cardata.f2428Z0.m1395d();
                            if (num14 != null) {
                                intValue = num14.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 14:
                            Integer num15 = (Integer) cardata.f2431a1.m1395d();
                            if (num15 != null) {
                                intValue = num15.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 15:
                            Integer num16 = (Integer) cardata.f2434b1.m1395d();
                            if (num16 != null) {
                                intValue = num16.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case DLLCallback.DLL_FPTRS /* 16 */:
                            Integer num17 = (Integer) cardata.f2437c1.m1395d();
                            if (num17 != null) {
                                intValue = num17.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 17:
                            Integer num18 = (Integer) cardata.f2414S0.m1395d();
                            if (num18 != null) {
                                intValue = num18.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                        case 18:
                            Integer num19 = (Integer) cardata.f2416T0.m1395d();
                            if (num19 != null) {
                                intValue = num19.intValue();
                                break;
                            }
                            intValue = 0;
                            break;
                    }
                } else {
                    Float f2 = (Float) cardata.f2406O0.m1395d();
                    float floatValue = f2 != null ? f2.floatValue() : -99.0f;
                    if (!Float.isNaN(floatValue)) {
                    }
                }
                m1649B(button, r5);
            }
            boolean z3 = false;
            m1649B(button, z3);
        }
    }

    /* renamed from: D */
    public final void m1654D(float f2) {
        Float f3 = (Float) this.f2266E.f2406O0.m1395d();
        float floatValue = f3 != null ? f3.floatValue() : -99.0f;
        if (floatValue < 17.0f || floatValue > 32.5f) {
            floatValue = 22.0f;
        }
        float round = Math.round((floatValue + f2) * 2.0f) / 2.0f;
        float f4 = round >= 17.0f ? round : 17.0f;
        RunnableC1349r runnableC1349r = new RunnableC1349r(1, f4 <= 32.5f ? f4 : 32.5f);
        if (this.f2269H) {
            return;
        }
        this.f2269H = true;
        new Thread(new RunnableC0018l(this, 11, runnableC1349r), "clima-set").start();
    }

    /* renamed from: E */
    public final void m1655E(Button button, String str) {
        int m1660z = m1660z(48);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, m1660z, 1.0f);
        int m1660z2 = m1660z(2);
        layoutParams.setMargins(m1660z2, m1660z2, m1660z2, m1660z2);
        button.setLayoutParams(layoutParams);
        button.setMinHeight(m1660z);
        button.setMinimumHeight(m1660z);
        button.setMaxHeight(m1660z);
        button.setPadding(m1660z(4), 0, m1660z(4), 0);
        button.setIncludeFontPadding(false);
        button.setGravity(17);
        button.setMaxLines(1);
        button.setText(str);
        button.setAllCaps(false);
        button.setTextSize(2, 18.0f);
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 3;
        final int i2 = 8;
        final int i3 = 7;
        final int i4 = 6;
        final int i5 = 5;
        final int i6 = 1;
        final int i7 = 2;
        final int i8 = 4;
        super.onCreate(bundle);
        setContentView(R.layout.activity_climate_test);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.btn_climate_test);
        this.f2268G = (LinearLayout) findViewById(R.id.climaButtonHost);
        final int i9 = 0;
        findViewById(R.id.btnClimaBack).setOnClickListener(new View.OnClickListener(this) { // from class: q0.o

            /* renamed from: g */
            public final /* synthetic */ ClimateTestActivity f6301g;

            {
                this.f6301g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClimateTestActivity climateTestActivity = this.f6301g;
                switch (i9) {
                    case 0:
                        int i10 = ClimateTestActivity.f2265I;
                        climateTestActivity.finish();
                        break;
                    case 1:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1654D(-0.5f);
                        break;
                    default:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1654D(0.5f);
                        break;
                }
            }
        });
        m1659w("Кондиционер / климат");
        m1657u(m1650x("климат ON", 0, 2, new RunnableC0022p(4)), m1650x("климат OFF", 0, 1, new RunnableC0022p(15)), m1650x("AC ON", 1, 2, new RunnableC0022p(20)), m1650x("AC OFF", 1, 1, new RunnableC0022p(25)), m1650x("AUTO ON", 2, 2, new RunnableC0022p(26)));
        m1659w("Забор воздуха");
        m1657u(m1650x("улица", 3, 1, new RunnableC0022p(27)), m1650x("салон", 3, 2, new RunnableC0022p(28)));
        m1659w("Температура водителя");
        LinearLayout m1652A = m1652A();
        Button button = new Button(this);
        m1655E(button, "TEMP −");
        m1649B(button, false);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: q0.o

            /* renamed from: g */
            public final /* synthetic */ ClimateTestActivity f6301g;

            {
                this.f6301g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClimateTestActivity climateTestActivity = this.f6301g;
                switch (i6) {
                    case 0:
                        int i10 = ClimateTestActivity.f2265I;
                        climateTestActivity.finish();
                        break;
                    case 1:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1654D(-0.5f);
                        break;
                    default:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1654D(0.5f);
                        break;
                }
            }
        });
        m1652A.addView(button);
        m1656t(m1652A, m1651y("18", 18.0f), m1651y("20", 20.0f), m1651y("22", 22.0f), m1651y("24", 24.0f), m1651y("26", 26.0f), m1651y("28", 28.0f), m1651y("32", 32.0f));
        Button button2 = new Button(this);
        m1655E(button2, "TEMP +");
        m1649B(button2, false);
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: q0.o

            /* renamed from: g */
            public final /* synthetic */ ClimateTestActivity f6301g;

            {
                this.f6301g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClimateTestActivity climateTestActivity = this.f6301g;
                switch (i7) {
                    case 0:
                        int i10 = ClimateTestActivity.f2265I;
                        climateTestActivity.finish();
                        break;
                    case 1:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1654D(-0.5f);
                        break;
                    default:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1654D(0.5f);
                        break;
                }
            }
        });
        m1652A.addView(button2);
        this.f2268G.addView(m1652A);
        m1659w("Вентилятор");
        m1657u(m1650x("FAN 1", 5, 1, new RunnableC0022p(29)), m1650x("2", 5, 2, new RunnableC0022p(5)), m1650x("3", 5, 3, new RunnableC0022p(6)), m1650x("4", 5, 4, new RunnableC0022p(7)), m1650x("5", 5, 5, new RunnableC0022p(8)), m1650x("6", 5, 6, new RunnableC0022p(9)), m1650x("7", 5, 7, new RunnableC0022p(10)));
        m1659w("Обдув");
        LinearLayout m1652A2 = m1652A();
        m1656t(m1652A2, m1650x("лицо", 6, 1, new RunnableC0022p(11)), m1650x("лицо+ноги", 6, 2, new RunnableC0022p(12)), m1650x("ноги", 6, 3, new RunnableC0022p(13)), m1650x("ноги+стекло", 6, 4, new RunnableC0022p(14)), m1650x("стекло DEF ON", 7, 2, new RunnableC0022p(16)), m1650x("стекло DEF OFF", 7, 1, new RunnableC0022p(17)));
        this.f2268G.addView(m1652A2);
        m1659w("Обогрев руля");
        m1657u(m1650x("руль выкл", 8, 2, new RunnableC0022p(18)), m1650x("руль вкл", 8, 1, new RunnableC0022p(19)));
        m1659w("Обогрев сидений");
        m1658v("HEAT FL", 9, new C0009c(14));
        m1658v("HEAT FR", 10, new C0009c(15));
        m1658v("HEAT RL", 11, new C0009c(16));
        m1658v("HEAT RR", 12, new C0009c(17));
        m1659w("Охлаждение сидений");
        m1658v("VENT FL", 13, new C0009c(18));
        m1658v("VENT FR", 14, new C0009c(19));
        m1658v("VENT RL", 15, new C0009c(20));
        m1658v("VENT RR", 16, new C0009c(21));
        m1659w("Лобовое электро");
        m1657u(m1650x("лобовое выкл", 17, 0, new RunnableC0022p(21)), m1650x("лобовое вкл", 17, 1, new RunnableC0022p(22)));
        m1659w("Заднее стекло + зеркала");
        m1657u(m1650x("задн DEF OFF", 18, 1, new RunnableC0022p(23)), m1650x("задн DEF ON", 18, 2, new RunnableC0022p(24)));
        final int i10 = 10;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i10) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        };
        carData cardata = this.f2266E;
        carData.m1712X(cardata.f2398K0, this, interfaceC0561z);
        carData.m1712X(cardata.f2400L0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i6) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2402M0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i7) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2404N0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2406O0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i8) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2408P0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i5) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2410Q0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i4) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2412R0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i3) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2414S0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i2) {
                    case 0:
                        int i11 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i11 = 9;
        carData.m1712X(cardata.f2416T0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i11) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i12 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i12 = 11;
        carData.m1712X(cardata.f2418U0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i12) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i13 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i13 = 12;
        carData.m1712X(cardata.f2420V0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i13) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i14 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i14 = 13;
        carData.m1712X(cardata.f2422W0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i14) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i142 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i15 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i15 = 14;
        carData.m1712X(cardata.f2424X0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i15) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i142 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i152 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i16 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i16 = 15;
        carData.m1712X(cardata.f2426Y0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i16) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i142 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i152 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i162 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i17 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i17 = 16;
        carData.m1712X(cardata.f2428Z0, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i17) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i142 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i152 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i162 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i172 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i18 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i18 = 17;
        carData.m1712X(cardata.f2431a1, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i18) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i142 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i152 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i162 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i172 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i182 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i19 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        final int i19 = 18;
        carData.m1712X(cardata.f2434b1, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i19) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i142 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i152 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i162 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i172 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i182 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i192 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        carData.m1712X(cardata.f2437c1, this, new InterfaceC0561z(this) { // from class: q0.p

            /* renamed from: b */
            public final /* synthetic */ ClimateTestActivity f6317b;

            {
                this.f6317b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                ClimateTestActivity climateTestActivity = this.f6317b;
                switch (i9) {
                    case 0:
                        int i112 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 1:
                        int i122 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 2:
                        int i132 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 3:
                        int i142 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 4:
                        int i152 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 5:
                        int i162 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 6:
                        int i172 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 7:
                        int i182 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 8:
                        int i192 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.GNU /* 9 */:
                        int i20 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        int i21 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.NETBSD /* 11 */:
                        int i22 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        int i23 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 13:
                        int i24 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 14:
                        int i25 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 15:
                        int i26 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        int i27 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    case 17:
                        int i28 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                    default:
                        int i29 = ClimateTestActivity.f2265I;
                        climateTestActivity.m1653C();
                        break;
                }
            }
        });
        m1653C();
    }

    /* renamed from: t */
    public final void m1656t(LinearLayout linearLayout, C1355t... c1355tArr) {
        for (C1355t c1355t : c1355tArr) {
            Button button = new Button(this);
            m1655E(button, c1355t.f6360a);
            button.setOnClickListener(new ViewOnClickListenerC1346q(this, 0, c1355t));
            m1649B(button, false);
            this.f2267F.add(new C1352s(button, c1355t.f6361b, c1355t.f6362c, c1355t.f6363d, c1355t.f6364e));
            linearLayout.addView(button);
        }
    }

    /* renamed from: u */
    public final void m1657u(C1355t... c1355tArr) {
        LinearLayout m1652A = m1652A();
        m1656t(m1652A, c1355tArr);
        this.f2268G.addView(m1652A);
    }

    /* renamed from: v */
    public final void m1658v(String str, int i, C0009c c0009c) {
        C1355t[] c1355tArr = new C1355t[10];
        int i2 = 1;
        c1355tArr[0] = m1650x(str.concat(" выкл"), i, 1, new RunnableC0024r(16, c0009c));
        while (i2 <= 9) {
            int i3 = i2 + 1;
            c1355tArr[i2] = m1650x(String.valueOf(i2), i, i3, new RunnableC0010d(c0009c, i3, 4));
            i2 = i3;
        }
        m1657u(c1355tArr);
    }

    /* renamed from: w */
    public final void m1659w(String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(-7820545);
        textView.setTextSize(2, 18.0f);
        textView.setPadding(m1660z(6), m1660z(8), m1660z(6), m1660z(2));
        this.f2268G.addView(textView);
    }

    /* renamed from: z */
    public final int m1660z(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }
}
