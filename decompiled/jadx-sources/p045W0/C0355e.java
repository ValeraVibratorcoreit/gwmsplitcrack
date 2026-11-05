package p045W0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.sun.jna.Platform;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import p004B0.AbstractC0051a;
import p007C0.AbstractC0067a;
import p010D1.AbstractC0088l;
import p022K.C0220v;
import p034Q0.AbstractC0294k;
import p038T.C0330x;
import p042V.C0340b;
import p051Z0.C0450h;
import p062d0.InterfaceC0731d;
import p069f1.InterfaceC0843o;
import p121y0.AbstractC1687o;

/* renamed from: W0.e */
/* loaded from: classes.dex */
public class C0355e implements InterfaceC0731d, InterfaceC0843o {

    /* renamed from: g */
    public static C0355e f1006g;

    /* renamed from: f */
    public final /* synthetic */ int f1007f;

    public /* synthetic */ C0355e(int i) {
        this.f1007f = i;
    }

    /* renamed from: a */
    public static RectF m941a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f3611I || !(view instanceof C0450h)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        C0450h c0450h = (C0450h) view;
        int contentWidth = c0450h.getContentWidth();
        int contentHeight = c0450h.getContentHeight();
        int m843d = (int) AbstractC0294k.m843d(c0450h.getContext(), 24);
        if (contentWidth < m843d) {
            contentWidth = m843d;
        }
        int right = (c0450h.getRight() + c0450h.getLeft()) / 2;
        int bottom = (c0450h.getBottom() + c0450h.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    /* renamed from: b */
    public static C0355e m942b(Context context, int i) {
        AbstractC1687o.m4937f("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0051a.f179n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0088l.m255B(context, obtainStyledAttributes, 4);
        AbstractC0088l.m255B(context, obtainStyledAttributes, 9);
        AbstractC0088l.m255B(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0361k.m964a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0351a(0)).m963a();
        obtainStyledAttributes.recycle();
        C0355e c0355e = new C0355e(21);
        AbstractC1687o.m4938g(rect.left);
        AbstractC1687o.m4938g(rect.top);
        AbstractC1687o.m4938g(rect.right);
        AbstractC1687o.m4938g(rect.bottom);
        return c0355e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m943c(C0340b c0340b, Editable editable, int i, int i2, boolean z2) {
        int min;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z2) {
            int max = Math.max(i, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                loop0: while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (max == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char charAt = editable.charAt(selectionStart);
                            if (z3) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt)) {
                                max--;
                            } else {
                                if (Character.isHighSurrogate(charAt)) {
                                    break loop0;
                                }
                                z3 = true;
                            }
                        } else if (!z3) {
                            selectionStart = 0;
                        }
                    }
                    max--;
                }
            }
            selectionStart = -1;
            int max2 = Math.max(i2, 0);
            min = editable.length();
            if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                loop2: while (true) {
                    boolean z4 = false;
                    while (true) {
                        if (max2 == 0) {
                            min = selectionEnd;
                            break loop2;
                        }
                        if (selectionEnd < min) {
                            char charAt2 = editable.charAt(selectionEnd);
                            if (z4) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt2)) {
                                max2--;
                                selectionEnd++;
                            } else {
                                if (Character.isLowSurrogate(charAt2)) {
                                    break loop2;
                                }
                                selectionEnd++;
                                z4 = true;
                            }
                        }
                    }
                    max2--;
                    selectionEnd++;
                }
            }
            min = -1;
            if (selectionStart == -1 || min == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i, 0);
            min = Math.min(selectionEnd + i2, editable.length());
        }
        C0330x[] c0330xArr = (C0330x[]) editable.getSpans(selectionStart, min, C0330x.class);
        if (c0330xArr == null || c0330xArr.length <= 0) {
            return false;
        }
        for (C0330x c0330x : c0330xArr) {
            int spanStart = editable.getSpanStart(c0330x);
            int spanEnd = editable.getSpanEnd(c0330x);
            selectionStart = Math.min(spanStart, selectionStart);
            min = Math.max(spanEnd, min);
        }
        int max3 = Math.max(selectionStart, 0);
        int min2 = Math.min(min, editable.length());
        c0340b.beginBatchEdit();
        editable.delete(max3, min2);
        c0340b.endBatchEdit();
        return true;
    }

    /* renamed from: d */
    private final void m944d() {
    }

    /* renamed from: e */
    private final void m945e(int i, Serializable serializable) {
    }

    /* renamed from: f */
    public void mo946f(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF m941a = m941a(tabLayout, view);
        RectF m941a2 = m941a(tabLayout, view2);
        drawable.setBounds(AbstractC0067a.m195c((int) m941a.left, (int) m941a2.left, f2), drawable.getBounds().top, AbstractC0067a.m195c((int) m941a.right, (int) m941a2.right, f2), drawable.getBounds().bottom);
    }

    @Override // p062d0.InterfaceC0731d
    /* renamed from: g */
    public void mo947g(int i, Serializable serializable) {
        String str;
        switch (this.f1007f) {
            case 22:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case Platform.GNU /* 9 */:
                    default:
                        str = "";
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case Platform.NETBSD /* 11 */:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // p062d0.InterfaceC0731d
    /* renamed from: i */
    public void mo948i() {
        switch (this.f1007f) {
            case 22:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p069f1.InterfaceC0843o
    /* renamed from: o */
    public Object mo902o() {
        switch (this.f1007f) {
            case 26:
                return new TreeSet();
            case 27:
                return new LinkedHashSet();
            case 28:
                return new ArrayDeque();
            default:
                return new ArrayList();
        }
    }

    public String toString() {
        switch (this.f1007f) {
            case 2:
                return "<NULL>";
            default:
                return super.toString();
        }
    }

    public C0355e(View view, int i) {
        this.f1007f = i;
        switch (i) {
            case 5:
                if (Build.VERSION.SDK_INT < 30) {
                    new C0355e(view, 4);
                    break;
                } else {
                    new C0220v(view, 4);
                    break;
                }
        }
    }
}
