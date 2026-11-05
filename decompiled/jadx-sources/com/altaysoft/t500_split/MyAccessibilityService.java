package com.altaysoft.t500_split;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import java.util.Iterator;
import java.util.List;
import p001A0.RunnableC0018l;
import p098q0.AbstractC1372y1;
import p098q0.RunnableC1363v1;

/* loaded from: classes.dex */
public class MyAccessibilityService extends AccessibilityService {

    /* renamed from: m */
    public static MyAccessibilityService f2328m;

    /* renamed from: f */
    public final cfgData f2329f = cfgData.m1784i();

    /* renamed from: g */
    public String f2330g = null;

    /* renamed from: h */
    public Rect f2331h = null;

    /* renamed from: i */
    public final Handler f2332i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public boolean f2333j = false;

    /* renamed from: k */
    public boolean f2334k = false;

    /* renamed from: l */
    public boolean f2335l = false;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001f, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0029, code lost:
    
        if (r0 != null) goto L43;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1695a(AccessibilityWindowInfo accessibilityWindowInfo) {
        CharSequence packageName;
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        try {
            accessibilityNodeInfo = accessibilityWindowInfo.getRoot();
            if (accessibilityNodeInfo != null && (packageName = accessibilityNodeInfo.getPackageName()) != null && packageName.length() > 0) {
                String charSequence = packageName.toString();
                try {
                    accessibilityNodeInfo.recycle();
                } catch (Exception unused) {
                }
                return charSequence;
            }
        } catch (Exception unused2) {
        } catch (Throwable th) {
            if (accessibilityNodeInfo != null) {
                try {
                    accessibilityNodeInfo.recycle();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
        try {
            CharSequence title = accessibilityWindowInfo.getTitle();
            if (title == null || title.length() <= 0) {
                return "unknown";
            }
            String trim = title.toString().trim();
            if (!AbstractC1372y1.m3274E(trim) && !AbstractC1372y1.m3320z(trim)) {
                if (trim.indexOf("HVAC") < 0) {
                    if (trim.toLowerCase().indexOf("hvac") < 0) {
                        return "unknown";
                    }
                }
                return "com.gwm.app.hvac";
            }
            return trim;
        } catch (Exception unused4) {
            return "unknown";
        }
    }

    /* renamed from: b */
    public static boolean m1696b(AccessibilityWindowInfo accessibilityWindowInfo, String str) {
        CharSequence charSequence;
        boolean z2 = AbstractC1372y1.m3320z(str) || AbstractC1372y1.m3274E(str);
        if (!z2) {
            try {
                charSequence = accessibilityWindowInfo.getTitle();
            } catch (Exception unused) {
                charSequence = null;
            }
            if (charSequence == null || charSequence.length() == 0) {
                return false;
            }
            String trim = charSequence.toString().trim();
            z2 = AbstractC1372y1.m3320z(trim) || AbstractC1372y1.m3274E(trim) || trim.indexOf("HVAC") >= 0 || trim.toLowerCase().indexOf("hvac") >= 0;
        }
        if (!z2) {
            return false;
        }
        Rect rect = new Rect();
        try {
            accessibilityWindowInfo.getBoundsInScreen(rect);
            return rect.width() >= 200 && rect.height() >= 200;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m1697d(String str) {
        if (str == null || str.isEmpty() || "unknown".equals(str)) {
            return false;
        }
        return str.startsWith("com.android.inputmethod") || str.contains("inputmethod") || str.contains("keyboard");
    }

    /* renamed from: e */
    public static boolean m1698e(String str) {
        return str == null || str.isEmpty() || "unknown".equals(str) || "com.android.systemui".equals(str) || m1697d(str) || "com.gwm.systemui".equals(str);
    }

    /* renamed from: c */
    public final boolean m1699c(AccessibilityWindowInfo accessibilityWindowInfo) {
        if (accessibilityWindowInfo.getType() == 2) {
            accessibilityWindowInfo.getBoundsInScreen(new Rect());
            return !r0.isEmpty();
        }
        if (!m1697d(m1695a(accessibilityWindowInfo))) {
            return false;
        }
        Rect rect = new Rect();
        accessibilityWindowInfo.getBoundsInScreen(rect);
        if (rect.isEmpty() || rect.height() < 80) {
            return false;
        }
        cfgData cfgdata = this.f2329f;
        int i = cfgdata.f2495B0;
        if (i <= 0) {
            i = rect.bottom;
        }
        return rect.bottom >= i - cfgdata.m1792l();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z2;
        String str;
        Rect rect;
        boolean z3;
        if (accessibilityEvent == null) {
            return;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 4194304 || eventType == 32) {
            TopOverlayService topOverlayService = TopOverlayService.f2357r;
            if (topOverlayService != null && topOverlayService.f2360h) {
                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 0));
            }
            if (this.f2329f.f2699u0) {
                try {
                    List<AccessibilityWindowInfo> windows = getWindows();
                    if (windows != null && !windows.isEmpty()) {
                        Iterator<AccessibilityWindowInfo> it = windows.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                str = null;
                                rect = null;
                                break;
                            }
                            AccessibilityWindowInfo next = it.next();
                            if (next != null) {
                                try {
                                    z3 = next.isInPictureInPictureMode();
                                } catch (Exception unused) {
                                    z3 = false;
                                }
                                if (z3) {
                                    str = m1695a(next);
                                    rect = new Rect();
                                    next.getBoundsInScreen(rect);
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        if (z2) {
                            this.f2330g = str;
                            this.f2331h = rect;
                            this.f2334k = true;
                            if (!this.f2335l) {
                                this.f2332i.postDelayed(new RunnableC0018l(this, 15, new Intent(this, (Class<?>) FloatingWindowService_PIPBtn.class)), 1000L);
                            }
                            this.f2335l = this.f2334k;
                        } else {
                            this.f2334k = false;
                            if (this.f2335l) {
                                stopService(new Intent(this, (Class<?>) FloatingWindowService_PIPBtn.class));
                            }
                            this.f2335l = this.f2334k;
                            if (this.f2330g != null) {
                                this.f2330g = null;
                                this.f2331h = null;
                            }
                        }
                        for (AccessibilityWindowInfo accessibilityWindowInfo : windows) {
                            if (accessibilityWindowInfo != null) {
                                try {
                                    accessibilityWindowInfo.recycle();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
            }
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        super.onServiceConnected();
        f2328m = this;
        this.f2333j = true;
        AccessibilityServiceInfo serviceInfo = getServiceInfo();
        if (serviceInfo != null) {
            serviceInfo.flags |= 64;
            serviceInfo.eventTypes = -1;
            serviceInfo.notificationTimeout = 100L;
            setServiceInfo(serviceInfo);
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        f2328m = null;
        return super.onUnbind(intent);
    }
}
