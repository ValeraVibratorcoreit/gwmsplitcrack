package p024L;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.sun.jna.Function;

/* renamed from: L.e */
/* loaded from: classes.dex */
public final class C0235e {

    /* renamed from: e */
    public static final C0235e f614e;

    /* renamed from: f */
    public static final C0235e f615f;

    /* renamed from: g */
    public static final C0235e f616g;

    /* renamed from: h */
    public static final C0235e f617h;

    /* renamed from: i */
    public static final C0235e f618i;

    /* renamed from: j */
    public static final C0235e f619j;

    /* renamed from: k */
    public static final C0235e f620k;

    /* renamed from: l */
    public static final C0235e f621l;

    /* renamed from: a */
    public final Object f622a;

    /* renamed from: b */
    public final int f623b;

    /* renamed from: c */
    public final Class f624c;

    /* renamed from: d */
    public final InterfaceC0249s f625d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        new C0235e(1);
        new C0235e(2);
        new C0235e(4);
        new C0235e(8);
        f614e = new C0235e(16);
        new C0235e(32);
        new C0235e(64);
        new C0235e(128);
        new C0235e(AbstractC0242l.class, Function.MAX_NARGS);
        new C0235e(AbstractC0242l.class, 512);
        new C0235e(AbstractC0243m.class, 1024);
        new C0235e(AbstractC0243m.class, 2048);
        f615f = new C0235e(4096);
        f616g = new C0235e(8192);
        new C0235e(16384);
        new C0235e(32768);
        new C0235e(65536);
        new C0235e(AbstractC0247q.class, 131072);
        f617h = new C0235e(262144);
        f618i = new C0235e(524288);
        f619j = new C0235e(1048576);
        new C0235e(AbstractC0248r.class, 2097152);
        int i = Build.VERSION.SDK_INT;
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0245o.class);
        f620k = new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f621l = new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0235e(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (i >= 29) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction14;
        } else {
            accessibilityAction = null;
        }
        new C0235e(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new C0235e(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i >= 29) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction13;
        } else {
            accessibilityAction2 = null;
        }
        new C0235e(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0246p.class);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC0244n.class);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0235e(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i >= 30) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction3 = accessibilityAction12;
        } else {
            accessibilityAction3 = null;
        }
        new C0235e(accessibilityAction3, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i >= 30) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction4 = accessibilityAction11;
        } else {
            accessibilityAction4 = null;
        }
        new C0235e(accessibilityAction4, R.id.accessibilityActionImeEnter, null, null, null);
        new C0235e(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction5 = accessibilityAction10;
        } else {
            accessibilityAction5 = null;
        }
        new C0235e(accessibilityAction5, R.id.accessibilityActionDragDrop, null, null, null);
        if (i >= 32) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction6 = accessibilityAction9;
        } else {
            accessibilityAction6 = null;
        }
        new C0235e(accessibilityAction6, R.id.accessibilityActionDragCancel, null, null, null);
        if (i >= 33) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction7 = accessibilityAction8;
        } else {
            accessibilityAction7 = null;
        }
        new C0235e(accessibilityAction7, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0235e(i >= 34 ? AbstractC0238h.m715a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0235e(int i) {
        this(null, i, null, null, null);
    }

    /* renamed from: a */
    public final int m701a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f622a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0235e)) {
            return false;
        }
        Object obj2 = ((C0235e) obj).f622a;
        Object obj3 = this.f622a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f622a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String m728d = C0240j.m728d(this.f623b);
        if (m728d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f622a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                m728d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(m728d);
        return sb.toString();
    }

    public C0235e(Class cls, int i) {
        this(null, i, null, null, cls);
    }

    public C0235e(Object obj, int i, String str, InterfaceC0249s interfaceC0249s, Class cls) {
        this.f623b = i;
        this.f625d = interfaceC0249s;
        if (obj == null) {
            this.f622a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f622a = obj;
        }
        this.f624c = cls;
    }
}
