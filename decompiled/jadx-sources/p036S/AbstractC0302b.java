package p036S;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.chip.Chip;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p022K.C0180b;
import p024L.C0240j;
import p025L0.C0253d;
import p045W0.C0355e;
import p091o.C1202l;
import p121y0.AbstractC1687o;

/* renamed from: S.b */
/* loaded from: classes.dex */
public abstract class AbstractC0302b extends C0180b {

    /* renamed from: n */
    public static final Rect f835n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);

    /* renamed from: o */
    public static final C0355e f836o = new C0355e(6);

    /* renamed from: p */
    public static final C0355e f837p = new C0355e(7);

    /* renamed from: h */
    public final AccessibilityManager f842h;

    /* renamed from: i */
    public final Chip f843i;

    /* renamed from: j */
    public C0301a f844j;

    /* renamed from: d */
    public final Rect f838d = new Rect();

    /* renamed from: e */
    public final Rect f839e = new Rect();

    /* renamed from: f */
    public final Rect f840f = new Rect();

    /* renamed from: g */
    public final int[] f841g = new int[2];

    /* renamed from: k */
    public int f845k = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: l */
    public int f846l = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: m */
    public int f847m = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    public AbstractC0302b(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f843i = chip;
        this.f842h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p022K.C0180b
    /* renamed from: b */
    public final C0639g mo528b(View view) {
        if (this.f844j == null) {
            this.f844j = new C0301a(this);
        }
        return this.f844j;
    }

    @Override // p022K.C0180b
    /* renamed from: d */
    public final void mo400d(View view, C0240j c0240j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f491a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C0253d) this).f635q;
        accessibilityNodeInfo.setCheckable(chip.m2068d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* renamed from: j */
    public final boolean m851j(int i) {
        if (this.f846l != i) {
            return false;
        }
        this.f846l = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        C0253d c0253d = (C0253d) this;
        if (i == 1) {
            Chip chip = c0253d.f635q;
            chip.f3462r = false;
            chip.refreshDrawableState();
        }
        m856q(i, 8);
        return true;
    }

    /* renamed from: k */
    public final C0240j m852k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C0240j c0240j = new C0240j(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f835n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f843i;
        obtain.setParent(chip);
        mo740o(i, c0240j);
        if (c0240j.m734g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f839e;
        c0240j.m733f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        c0240j.f628b = i;
        obtain.setSource(chip, i);
        if (this.f845k == i) {
            obtain.setAccessibilityFocused(true);
            c0240j.m729a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            c0240j.m729a(64);
        }
        boolean z2 = this.f846l == i;
        if (z2) {
            c0240j.m729a(2);
        } else if (obtain.isFocusable()) {
            c0240j.m729a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f841g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f838d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0240j.m733f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f840f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0240j;
    }

    /* renamed from: l */
    public abstract void mo739l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m853m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        C0240j c0240j;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        mo739l(arrayList);
        C1202l c1202l = new C1202l();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            c1202l.m2876c(((Integer) arrayList.get(i7)).intValue(), m852k(((Integer) arrayList.get(i7)).intValue()));
        }
        int i8 = this.f846l;
        int i9 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        C0240j c0240j2 = i8 == Integer.MIN_VALUE ? null : (C0240j) c1202l.m2875b(i8, null);
        C0355e c0355e = f836o;
        C0355e c0355e2 = f837p;
        Chip chip = this.f843i;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            boolean z2 = chip.getLayoutDirection() == 1;
            c0355e2.getClass();
            int i10 = c1202l.f5422c;
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList2.add((C0240j) c1202l.f5421b[i11]);
            }
            Collections.sort(arrayList2, new C0303c(z2, c0355e));
            if (i == 1) {
                int size = arrayList2.size();
                if (c0240j2 != null) {
                    size = arrayList2.indexOf(c0240j2);
                }
                int i12 = size - 1;
                if (i12 >= 0) {
                    obj = arrayList2.get(i12);
                    c0240j = (C0240j) obj;
                }
                obj = null;
                c0240j = (C0240j) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (c0240j2 == null ? -1 : arrayList2.lastIndexOf(c0240j2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    c0240j = (C0240j) obj;
                }
                obj = null;
                c0240j = (C0240j) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f846l;
            if (i13 != Integer.MIN_VALUE) {
                m854n(i13).m733f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i3 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i3 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                    i3 = -1;
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i3 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i2 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i2 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i2 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                c0355e2.getClass();
                i5 = c1202l.f5422c;
                Rect rect4 = new Rect();
                c0240j = null;
                for (i6 = i2; i6 < i5; i6++) {
                    C0240j c0240j3 = (C0240j) c1202l.f5421b[i6];
                    if (c0240j3 != c0240j2) {
                        c0355e.getClass();
                        c0240j3.m733f(rect4);
                        if (AbstractC1687o.m4951x(i, rect2, rect4)) {
                            if (AbstractC1687o.m4951x(i, rect2, rect3) && !AbstractC1687o.m4935d(i, rect2, rect4, rect3)) {
                                if (!AbstractC1687o.m4935d(i, rect2, rect3, rect4)) {
                                    int m4912E = AbstractC1687o.m4912E(i, rect2, rect4);
                                    int m4914G = AbstractC1687o.m4914G(i, rect2, rect4);
                                    int i14 = (m4914G * m4914G) + (m4912E * 13 * m4912E);
                                    int m4912E2 = AbstractC1687o.m4912E(i, rect2, rect3);
                                    int m4914G2 = AbstractC1687o.m4914G(i, rect2, rect3);
                                    if (i14 >= (m4914G2 * m4914G2) + (m4912E2 * 13 * m4912E2)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            c0240j = c0240j3;
                        }
                    }
                }
            }
            i3 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            c0355e2.getClass();
            i5 = c1202l.f5422c;
            Rect rect42 = new Rect();
            c0240j = null;
            while (i6 < i5) {
            }
        }
        C0240j c0240j4 = c0240j;
        if (c0240j4 != null) {
            int i15 = i2;
            while (true) {
                if (i15 >= c1202l.f5422c) {
                    i4 = i3;
                    break;
                }
                if (c1202l.f5421b[i15] == c0240j4) {
                    i4 = i15;
                    break;
                }
                i15++;
            }
            i9 = c1202l.f5420a[i4];
        }
        return m855p(i9);
    }

    /* renamed from: n */
    public final C0240j m854n(int i) {
        if (i != -1) {
            return m852k(i);
        }
        Chip chip = this.f843i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        C0240j c0240j = new C0240j(obtain);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo739l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0240j.f627a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0240j;
    }

    /* renamed from: o */
    public abstract void mo740o(int i, C0240j c0240j);

    /* renamed from: p */
    public final boolean m855p(int i) {
        int i2;
        Chip chip = this.f843i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f846l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m851j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f846l = i;
        C0253d c0253d = (C0253d) this;
        if (i == 1) {
            Chip chip2 = c0253d.f635q;
            chip2.f3462r = true;
            chip2.refreshDrawableState();
        }
        m856q(i, 8);
        return true;
    }

    /* renamed from: q */
    public final void m856q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f842h.isEnabled() || (parent = (view = this.f843i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            C0240j m854n = m854n(i);
            obtain.getText().add(m854n.m734g());
            AccessibilityNodeInfo accessibilityNodeInfo = m854n.f627a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
