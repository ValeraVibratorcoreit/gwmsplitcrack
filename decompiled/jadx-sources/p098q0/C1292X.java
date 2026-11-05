package p098q0;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.FloatingWindowService_BackBtn;
import com.altaysoft.t500_split.FloatingWindowService_NaviBtn;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;

/* renamed from: q0.X */
/* loaded from: classes.dex */
public final /* synthetic */ class C1292X implements InterfaceC0561z {

    /* renamed from: a */
    public final /* synthetic */ int f6035a;

    /* renamed from: b */
    public final /* synthetic */ Context f6036b;

    public /* synthetic */ C1292X(Context context, int i) {
        this.f6035a = i;
        this.f6036b = context;
    }

    @Override // androidx.lifecycle.InterfaceC0561z
    /* renamed from: a */
    public final void mo1100a(Object obj) {
        int i;
        switch (this.f6035a) {
            case 0:
                Context context = this.f6036b;
                Integer num = (Integer) obj;
                if (context != null) {
                    cfgData m1784i = cfgData.m1784i();
                    if (m1784i.f2537K2) {
                        if (!AbstractC1372y1.m3299e("ip_message")) {
                            if (num != null && num.intValue() != 0) {
                                if (num.intValue() != 16745076 && num.intValue() != -16745076) {
                                    if (num.intValue() >= 0) {
                                        if (!m1784i.f2502C2) {
                                            carData.getInstance().setIpMessage(0);
                                            break;
                                        } else if (!AbstractC1294Y.m3154f()) {
                                            if (AbstractC1294Y.f6041c == null) {
                                                AbstractC1294Y.f6041c = C1302b0.m3159c(context);
                                            }
                                            int m3158b = C1302b0.m3158b(context);
                                            C1296Z c1296z = (C1296Z) AbstractC1294Y.f6041c.f6062a.get(num);
                                            String m3157a = C1302b0.m3157a(c1296z != null ? c1296z.m3155a(m3158b) : "", carData.getInstance().f2452i, m3158b);
                                            if (m3157a != null && !m3157a.isEmpty()) {
                                                String str = c1296z != null ? c1296z.f6045b : "";
                                                int i2 = c1296z != null ? c1296z.f6044a : 1;
                                                C1288V m3126i = C1288V.m3126i(context);
                                                int intValue = num.intValue();
                                                String concat = (str == null || str.isEmpty()) ? "" : "ip_msg/".concat(str);
                                                boolean z2 = m3158b == 3;
                                                m3126i.getClass();
                                                if (!m3157a.isEmpty()) {
                                                    if (AbstractC1372y1.m3299e("ip_message")) {
                                                        m3126i.m3142o(true);
                                                    } else {
                                                        m3126i.f6030z = intValue;
                                                        if (i2 == 0) {
                                                            i2 = 1;
                                                        }
                                                        m3126i.f6004C = i2;
                                                        m3126i.f6002A = m3157a;
                                                        m3126i.f6003B = concat != null ? concat : "";
                                                        m3126i.f6022r = true;
                                                        m3126i.f6021q = z2;
                                                        m3126i.f6024t = 2;
                                                        m3126i.m3148y();
                                                        if (cfgData.m1784i().f2502C2) {
                                                            m3126i.m3138g(context);
                                                            m3126i.m3144u();
                                                            m3126i.m3133a();
                                                        } else {
                                                            m3126i.m3133a();
                                                        }
                                                    }
                                                }
                                                carData.getInstance().setIpMessage(0);
                                                AbstractC1294Y.m3150b();
                                                break;
                                            }
                                        } else {
                                            carData.getInstance().setIpMessage(0);
                                            break;
                                        }
                                    } else {
                                        int i3 = -num.intValue();
                                        C1288V c1288v = C1288V.f5996D;
                                        if (c1288v != null && c1288v.f6022r && ((i = c1288v.f6030z) == 0 || i == i3)) {
                                            C1288V.m3129p(true);
                                        }
                                        carData.getInstance().setIpMessage(0);
                                        break;
                                    }
                                } else {
                                    AbstractC1294Y.m3152d();
                                    C1288V.m3128n();
                                    carData.getInstance().setIpMessage(0);
                                    break;
                                }
                            }
                        } else {
                            carData.getInstance().setIpMessage(0);
                            C1288V.m3128n();
                            break;
                        }
                    }
                }
                break;
            case 1:
                Context context2 = this.f6036b;
                Integer num2 = (Integer) obj;
                if (context2 != null) {
                    cfgData m1784i2 = cfgData.m1784i();
                    if (m1784i2.f2537K2) {
                        if (!AbstractC1372y1.m3299e("ip_message") && m1784i2.f2507D2) {
                            if (num2 != null && num2.intValue() != 0) {
                                if (num2.intValue() >= 0 && num2.intValue() != 16745076 && num2.intValue() != -16745076) {
                                    if (!AbstractC1294Y.m3154f()) {
                                        if (AbstractC1294Y.f6041c == null) {
                                            AbstractC1294Y.f6041c = C1302b0.m3159c(context2);
                                        }
                                        int m3158b2 = C1302b0.m3158b(context2);
                                        C1296Z c1296z2 = (C1296Z) AbstractC1294Y.f6041c.f6062a.get(num2);
                                        String m3155a = c1296z2 != null ? c1296z2.m3155a(m3158b2) : "";
                                        if (!m3155a.isEmpty()) {
                                            C1311e0.m3165d(context2).m3176l(context2, C1302b0.m3157a(m3155a, carData.getInstance().f2452i, m3158b2), m3158b2 == 3, c1296z2 != null ? c1296z2.f6044a : 1);
                                            carData.getInstance().setIpNotice(0);
                                            break;
                                        } else {
                                            carData.getInstance().setIpNotice(0);
                                            break;
                                        }
                                    } else {
                                        carData.getInstance().setIpNotice(0);
                                        break;
                                    }
                                } else {
                                    C1311e0.m3165d(context2).m3171e();
                                    carData.getInstance().setIpNotice(0);
                                    break;
                                }
                            }
                        } else {
                            carData.getInstance().setIpNotice(0);
                            C1311e0.m3165d(context2).m3171e();
                            break;
                        }
                    }
                }
                break;
            case 2:
                Integer num3 = (Integer) obj;
                Context context3 = this.f6036b;
                if (context3 != null) {
                    cfgData m1784i3 = cfgData.m1784i();
                    int intValue2 = num3 == null ? 0 : num3.intValue();
                    if (m1784i3.f2537K2 && !AbstractC1372y1.m3299e("ip_message") && m1784i3.f2497B2 && !AbstractC1294Y.m3154f()) {
                        C1288V.m3126i(context3).m3146w(intValue2);
                        break;
                    } else {
                        C1288V.m3126i(context3).m3146w(0);
                        break;
                    }
                }
                break;
            case 3:
                boolean equals = Boolean.TRUE.equals((Boolean) obj);
                Context context4 = this.f6036b;
                Intent intent = new Intent(context4, (Class<?>) FloatingWindowService_BackBtn.class);
                if (!equals) {
                    context4.stopService(intent);
                    break;
                } else {
                    context4.startService(intent);
                    break;
                }
            default:
                boolean equals2 = Boolean.TRUE.equals((Boolean) obj);
                Context context5 = this.f6036b;
                Intent intent2 = new Intent(context5, (Class<?>) FloatingWindowService_NaviBtn.class);
                if (!equals2) {
                    context5.stopService(intent2);
                    break;
                } else {
                    context5.startService(intent2);
                    break;
                }
        }
    }
}
