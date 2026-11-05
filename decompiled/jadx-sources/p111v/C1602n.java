package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p006C.AbstractC0062j;
import p097q.AbstractC1241e;
import p100r.AbstractC1378a;
import p108u.AbstractC1467a;
import p109u0.AbstractC1561o;

/* renamed from: v.n */
/* loaded from: classes.dex */
public final class C1602n {

    /* renamed from: d */
    public static final int[] f9202d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f9203e;

    /* renamed from: f */
    public static final SparseIntArray f9204f;

    /* renamed from: a */
    public final HashMap f9205a = new HashMap();

    /* renamed from: b */
    public final boolean f9206b = true;

    /* renamed from: c */
    public final HashMap f9207c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9203e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f9204f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: c */
    public static int[] m4761c(Barrier barrier, String str) {
        int i;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = AbstractC1604p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1869r;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1869r.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0600. Please report as an issue. */
    /* renamed from: d */
    public static C1597i m4762d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C1597i c1597i = new C1597i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC1605q.f9210c : AbstractC1605q.f9208a);
        int[] iArr = f9202d;
        SparseIntArray sparseIntArray = f9203e;
        C1600l c1600l = c1597i.f9101b;
        String[] strArr = AbstractC1378a.f6463a;
        C1601m c1601m = c1597i.f9104e;
        C1599k c1599k = c1597i.f9102c;
        C1598j c1598j = c1597i.f9103d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C1596h c1596h = new C1596h();
            c1596h.f9088a = new int[10];
            c1596h.f9089b = new int[10];
            c1596h.f9090c = 0;
            c1596h.f9091d = new int[10];
            c1596h.f9092e = new float[10];
            c1596h.f9093f = 0;
            c1596h.f9094g = new int[5];
            c1596h.f9095h = new String[5];
            c1596h.f9096i = 0;
            c1596h.f9097j = new int[4];
            c1596h.f9098k = new boolean[4];
            c1596h.f9099l = 0;
            c1599k.getClass();
            c1598j.getClass();
            c1601m.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f9204f.get(index)) {
                    case 2:
                        str4 = str5;
                        c1596h.m4753b(2, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9115I));
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                    case Platform.GNU /* 9 */:
                    case Platform.KFREEBSD /* 10 */:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        c1596h.m4754c(5, obtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c1596h.m4753b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c1598j.f9109C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c1596h.m4753b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c1598j.f9110D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c1596h.m4753b(8, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9116J));
                        i3 = 1;
                        break;
                    case Platform.NETBSD /* 11 */:
                        str4 = str5;
                        c1596h.m4753b(11, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9122P));
                        i3 = 1;
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        str4 = str5;
                        c1596h.m4753b(12, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9123Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c1596h.m4753b(13, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9119M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c1596h.m4753b(14, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9121O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c1596h.m4753b(15, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9124R));
                        i3 = 1;
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        str4 = str5;
                        c1596h.m4753b(16, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9120N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c1596h.m4753b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c1598j.f9139d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c1596h.m4753b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c1598j.f9141e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c1596h.m4752a(19, obtainStyledAttributes.getFloat(index, c1598j.f9143f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c1596h.m4752a(20, obtainStyledAttributes.getFloat(index, c1598j.f9170w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c1596h.m4753b(21, obtainStyledAttributes.getLayoutDimension(index, c1598j.f9137c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c1596h.m4753b(22, iArr[obtainStyledAttributes.getInt(index, c1600l.f9184a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c1596h.m4753b(23, obtainStyledAttributes.getLayoutDimension(index, c1598j.f9135b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c1596h.m4753b(24, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9112F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c1596h.m4753b(27, obtainStyledAttributes.getInt(index, c1598j.f9111E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c1596h.m4753b(28, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9113G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c1596h.m4753b(31, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9117K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c1596h.m4753b(34, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9114H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c1596h.m4752a(37, obtainStyledAttributes.getFloat(index, c1598j.f9171x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c1597i.f9100a);
                        c1597i.f9100a = resourceId;
                        c1596h.m4753b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c1596h.m4752a(39, obtainStyledAttributes.getFloat(index, c1598j.f9127U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c1596h.m4752a(40, obtainStyledAttributes.getFloat(index, c1598j.f9126T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c1596h.m4753b(41, obtainStyledAttributes.getInt(index, c1598j.f9128V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c1596h.m4753b(42, obtainStyledAttributes.getInt(index, c1598j.f9129W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c1596h.m4752a(43, obtainStyledAttributes.getFloat(index, c1600l.f9186c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c1596h.m4755d(44, true);
                        c1596h.m4752a(44, obtainStyledAttributes.getDimension(index, c1601m.f9201m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c1596h.m4752a(45, obtainStyledAttributes.getFloat(index, c1601m.f9190b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c1596h.m4752a(46, obtainStyledAttributes.getFloat(index, c1601m.f9191c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c1596h.m4752a(47, obtainStyledAttributes.getFloat(index, c1601m.f9192d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c1596h.m4752a(48, obtainStyledAttributes.getFloat(index, c1601m.f9193e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c1596h.m4752a(49, obtainStyledAttributes.getDimension(index, c1601m.f9194f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c1596h.m4752a(50, obtainStyledAttributes.getDimension(index, c1601m.f9195g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c1596h.m4752a(51, obtainStyledAttributes.getDimension(index, c1601m.f9197i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c1596h.m4752a(52, obtainStyledAttributes.getDimension(index, c1601m.f9198j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c1596h.m4752a(53, obtainStyledAttributes.getDimension(index, c1601m.f9199k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c1596h.m4753b(54, obtainStyledAttributes.getInt(index, c1598j.f9130X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c1596h.m4753b(55, obtainStyledAttributes.getInt(index, c1598j.f9131Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c1596h.m4753b(56, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9132Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c1596h.m4753b(57, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9134a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c1596h.m4753b(58, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9136b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c1596h.m4753b(59, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9138c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c1596h.m4752a(60, obtainStyledAttributes.getFloat(index, c1601m.f9189a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c1596h.m4753b(62, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9107A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c1596h.m4752a(63, obtainStyledAttributes.getFloat(index, c1598j.f9108B));
                        i3 = 1;
                        break;
                    case Function.THROW_LAST_ERROR /* 64 */:
                        str4 = str5;
                        c1596h.m4753b(64, m4763f(obtainStyledAttributes, index, c1599k.f9175a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c1596h.m4754c(65, obtainStyledAttributes.getString(index));
                        } else {
                            c1596h.m4754c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c1596h.m4753b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c1596h.m4752a(67, obtainStyledAttributes.getFloat(index, c1599k.f9179e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c1596h.m4752a(68, obtainStyledAttributes.getFloat(index, c1600l.f9187d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c1596h.m4752a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c1596h.m4752a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c1596h.m4753b(72, obtainStyledAttributes.getInt(index, c1598j.f9144f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c1596h.m4753b(73, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9146g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c1596h.m4754c(74, obtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c1596h.m4755d(75, obtainStyledAttributes.getBoolean(index, c1598j.f9160n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c1596h.m4753b(76, obtainStyledAttributes.getInt(index, c1599k.f9177c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c1596h.m4754c(77, obtainStyledAttributes.getString(index));
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c1596h.m4753b(78, obtainStyledAttributes.getInt(index, c1600l.f9185b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c1596h.m4752a(79, obtainStyledAttributes.getFloat(index, c1599k.f9178d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c1596h.m4755d(80, obtainStyledAttributes.getBoolean(index, c1598j.f9156l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c1596h.m4755d(81, obtainStyledAttributes.getBoolean(index, c1598j.f9158m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c1596h.m4753b(82, obtainStyledAttributes.getInteger(index, c1599k.f9176b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c1596h.m4753b(83, m4763f(obtainStyledAttributes, index, c1601m.f9196h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c1596h.m4753b(84, obtainStyledAttributes.getInteger(index, c1599k.f9181g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c1596h.m4752a(85, obtainStyledAttributes.getFloat(index, c1599k.f9180f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            c1599k.f9183i = resourceId2;
                            c1596h.m4753b(89, resourceId2);
                            if (c1599k.f9183i != -1) {
                                c1596h.m4753b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            c1599k.f9182h = string;
                            c1596h.m4754c(90, string);
                            if (c1599k.f9182h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                c1599k.f9183i = resourceId3;
                                c1596h.m4753b(89, resourceId3);
                                c1596h.m4753b(88, -2);
                            } else {
                                c1596h.m4753b(88, -1);
                            }
                        } else {
                            c1596h.m4753b(88, obtainStyledAttributes.getInteger(index, c1599k.f9183i));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i3 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        c1596h.m4753b(93, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9118L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c1596h.m4753b(94, obtainStyledAttributes.getDimensionPixelSize(index, c1598j.f9125S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        m4764g(c1596h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        m4764g(c1596h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c1596h.m4753b(97, obtainStyledAttributes.getInt(index, c1598j.f9162o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC1467a.f7164x;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c1597i.f9100a = obtainStyledAttributes.getResourceId(index, c1597i.f9100a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c1596h.m4755d(99, obtainStyledAttributes.getBoolean(index, c1598j.f9145g));
                        i3 = 1;
                        break;
                }
                i4 += i3;
                indexCount = i5;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i8 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    c1599k.getClass();
                    c1598j.getClass();
                    c1601m.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9163p = m4763f(obtainStyledAttributes, index2, c1598j.f9163p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9115I = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9115I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9161o = m4763f(obtainStyledAttributes, index2, c1598j.f9161o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9159n = m4763f(obtainStyledAttributes, index2, c1598j.f9159n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9172y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9109C = obtainStyledAttributes.getDimensionPixelOffset(index2, c1598j.f9109C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9110D = obtainStyledAttributes.getDimensionPixelOffset(index2, c1598j.f9110D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9116J = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9116J);
                        i2 = 1;
                        break;
                    case Platform.GNU /* 9 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9169v = m4763f(obtainStyledAttributes, index2, c1598j.f9169v);
                        i2 = 1;
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9168u = m4763f(obtainStyledAttributes, index2, c1598j.f9168u);
                        i2 = 1;
                        break;
                    case Platform.NETBSD /* 11 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9122P = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9122P);
                        i2 = 1;
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9123Q = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9123Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9119M = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9119M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9121O = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9121O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9124R = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9124R);
                        i2 = 1;
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9120N = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9120N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9139d = obtainStyledAttributes.getDimensionPixelOffset(index2, c1598j.f9139d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9141e = obtainStyledAttributes.getDimensionPixelOffset(index2, c1598j.f9141e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9143f = obtainStyledAttributes.getFloat(index2, c1598j.f9143f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9170w = obtainStyledAttributes.getFloat(index2, c1598j.f9170w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9137c = obtainStyledAttributes.getLayoutDimension(index2, c1598j.f9137c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, c1600l.f9184a);
                        c1600l.f9184a = i10;
                        c1600l.f9184a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9135b = obtainStyledAttributes.getLayoutDimension(index2, c1598j.f9135b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9112F = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9112F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9147h = m4763f(obtainStyledAttributes, index2, c1598j.f9147h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9149i = m4763f(obtainStyledAttributes, index2, c1598j.f9149i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9111E = obtainStyledAttributes.getInt(index2, c1598j.f9111E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9113G = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9113G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9151j = m4763f(obtainStyledAttributes, index2, c1598j.f9151j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9153k = m4763f(obtainStyledAttributes, index2, c1598j.f9153k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9117K = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9117K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9166s = m4763f(obtainStyledAttributes, index2, c1598j.f9166s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9167t = m4763f(obtainStyledAttributes, index2, c1598j.f9167t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9114H = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9114H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9157m = m4763f(obtainStyledAttributes, index2, c1598j.f9157m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9155l = m4763f(obtainStyledAttributes, index2, c1598j.f9155l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9171x = obtainStyledAttributes.getFloat(index2, c1598j.f9171x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1597i.f9100a = obtainStyledAttributes.getResourceId(index2, c1597i.f9100a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9127U = obtainStyledAttributes.getFloat(index2, c1598j.f9127U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9126T = obtainStyledAttributes.getFloat(index2, c1598j.f9126T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9128V = obtainStyledAttributes.getInt(index2, c1598j.f9128V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9129W = obtainStyledAttributes.getInt(index2, c1598j.f9129W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1600l.f9186c = obtainStyledAttributes.getFloat(index2, c1600l.f9186c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9200l = true;
                        c1601m.f9201m = obtainStyledAttributes.getDimension(index2, c1601m.f9201m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9190b = obtainStyledAttributes.getFloat(index2, c1601m.f9190b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9191c = obtainStyledAttributes.getFloat(index2, c1601m.f9191c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9192d = obtainStyledAttributes.getFloat(index2, c1601m.f9192d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9193e = obtainStyledAttributes.getFloat(index2, c1601m.f9193e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9194f = obtainStyledAttributes.getDimension(index2, c1601m.f9194f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9195g = obtainStyledAttributes.getDimension(index2, c1601m.f9195g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9197i = obtainStyledAttributes.getDimension(index2, c1601m.f9197i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9198j = obtainStyledAttributes.getDimension(index2, c1601m.f9198j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9199k = obtainStyledAttributes.getDimension(index2, c1601m.f9199k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9130X = obtainStyledAttributes.getInt(index2, c1598j.f9130X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9131Y = obtainStyledAttributes.getInt(index2, c1598j.f9131Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9132Z = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9132Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9134a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9134a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9136b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9136b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9138c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9138c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1601m.f9189a = obtainStyledAttributes.getFloat(index2, c1601m.f9189a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9173z = m4763f(obtainStyledAttributes, index2, c1598j.f9173z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9107A = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9107A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1598j.f9108B = obtainStyledAttributes.getFloat(index2, c1598j.f9108B);
                        i2 = 1;
                        break;
                    case Function.THROW_LAST_ERROR /* 64 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c1599k.f9175a = m4763f(obtainStyledAttributes, index2, c1599k.f9175a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            c1599k.getClass();
                            i2 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            c1599k.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        c1599k.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1599k.f9179e = obtainStyledAttributes.getFloat(index2, c1599k.f9179e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1600l.f9187d = obtainStyledAttributes.getFloat(index2, c1600l.f9187d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1598j.f9140d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c1598j.f9142e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9144f0 = obtainStyledAttributes.getInt(index2, c1598j.f9144f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9146g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9146g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9152j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9160n0 = obtainStyledAttributes.getBoolean(index2, c1598j.f9160n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        c1599k.f9177c = obtainStyledAttributes.getInt(index2, c1599k.f9177c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9154k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        c1600l.f9185b = obtainStyledAttributes.getInt(index2, c1600l.f9185b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        c1599k.f9178d = obtainStyledAttributes.getFloat(index2, c1599k.f9178d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9156l0 = obtainStyledAttributes.getBoolean(index2, c1598j.f9156l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9158m0 = obtainStyledAttributes.getBoolean(index2, c1598j.f9158m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        c1599k.f9176b = obtainStyledAttributes.getInteger(index2, c1599k.f9176b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        c1601m.f9196h = m4763f(obtainStyledAttributes, index2, c1601m.f9196h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        c1599k.f9181g = obtainStyledAttributes.getInteger(index2, c1599k.f9181g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        c1599k.f9180f = obtainStyledAttributes.getFloat(index2, c1599k.f9180f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            c1599k.f9183i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            c1599k.f9182h = string2;
                            if (string2.indexOf("/") > 0) {
                                c1599k.f9183i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, c1599k.f9183i);
                        }
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9164q = m4763f(obtainStyledAttributes, index2, c1598j.f9164q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9165r = m4763f(obtainStyledAttributes, index2, c1598j.f9165r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9118L = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9118L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9125S = obtainStyledAttributes.getDimensionPixelSize(index2, c1598j.f9125S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        m4764g(c1598j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        m4764g(c1598j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c1598j.f9162o0 = obtainStyledAttributes.getInt(index2, c1598j.f9162o0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                }
                i9 += i2;
                indexCount2 = i;
                str8 = str2;
                String str10 = str;
                i8 = i2;
                str6 = str3;
                str7 = str10;
            }
            if (c1598j.f9152j0 != null) {
                c1598j.f9150i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c1597i;
    }

    /* renamed from: f */
    public static int m4763f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4764g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z2 = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof C1592d) {
                        C1592d c1592d = (C1592d) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1592d).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1592d).height = 0;
                        }
                        m4765h(c1592d, trim2);
                        return;
                    }
                    if (obj instanceof C1598j) {
                        ((C1598j) obj).f9172y = trim2;
                        return;
                    } else {
                        if (obj instanceof C1596h) {
                            ((C1596h) obj).m4754c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C1592d) {
                            C1592d c1592d2 = (C1592d) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1592d2).width = 0;
                                c1592d2.f9011H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1592d2).height = 0;
                                c1592d2.f9012I = parseFloat;
                            }
                        } else if (obj instanceof C1598j) {
                            C1598j c1598j = (C1598j) obj;
                            if (i2 == 0) {
                                c1598j.f9135b = 0;
                                c1598j.f9127U = parseFloat;
                            } else {
                                c1598j.f9137c = 0;
                                c1598j.f9126T = parseFloat;
                            }
                        } else if (obj instanceof C1596h) {
                            C1596h c1596h = (C1596h) obj;
                            if (i2 == 0) {
                                c1596h.m4753b(23, 0);
                                c1596h.m4752a(39, parseFloat);
                            } else {
                                c1596h.m4753b(21, 0);
                                c1596h.m4752a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C1592d) {
                            C1592d c1592d3 = (C1592d) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c1592d3).width = 0;
                                c1592d3.f9021R = max;
                                c1592d3.f9015L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c1592d3).height = 0;
                                c1592d3.f9022S = max;
                                c1592d3.f9016M = 2;
                            }
                        } else if (obj instanceof C1598j) {
                            C1598j c1598j2 = (C1598j) obj;
                            if (i2 == 0) {
                                c1598j2.f9135b = 0;
                                c1598j2.f9140d0 = max;
                                c1598j2.f9130X = 2;
                            } else {
                                c1598j2.f9137c = 0;
                                c1598j2.f9142e0 = max;
                                c1598j2.f9131Y = 2;
                            }
                        } else if (obj instanceof C1596h) {
                            C1596h c1596h2 = (C1596h) obj;
                            if (i2 == 0) {
                                c1596h2.m4753b(23, 0);
                                c1596h2.m4753b(54, 2);
                            } else {
                                c1596h2.m4753b(21, 0);
                                c1596h2.m4753b(55, 2);
                            }
                        }
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z2 = false;
            }
            if (!(obj instanceof C1592d)) {
                C1592d c1592d4 = (C1592d) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c1592d4).width = i4;
                    c1592d4.f9026W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c1592d4).height = i4;
                    c1592d4.f9027X = z2;
                    return;
                }
            }
            if (obj instanceof C1598j) {
                C1598j c1598j3 = (C1598j) obj;
                if (i2 == 0) {
                    c1598j3.f9135b = i4;
                    c1598j3.f9156l0 = z2;
                    return;
                } else {
                    c1598j3.f9137c = i4;
                    c1598j3.f9158m0 = z2;
                    return;
                }
            }
            if (obj instanceof C1596h) {
                C1596h c1596h3 = (C1596h) obj;
                if (i2 == 0) {
                    c1596h3.m4753b(23, i4);
                    c1596h3.m4755d(80, z2);
                    return;
                } else {
                    c1596h3.m4753b(21, i4);
                    c1596h3.m4755d(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C1592d)) {
        }
    }

    /* renamed from: h */
    public static void m4765h(C1592d c1592d, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c2 = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c2 = 1;
                }
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1592d.f9010G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void m4766a(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        int i3;
        String str;
        C1602n c1602n = this;
        int i4 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c1602n.f9207c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c1602n.f9206b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C1597i c1597i = (C1597i) hashMap.get(Integer.valueOf(id));
                        if (c1597i != null) {
                            if (childAt instanceof Barrier) {
                                C1598j c1598j = c1597i.f9103d;
                                c1598j.f9148h0 = i4;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c1598j.f9144f0);
                                barrier.setMargin(c1598j.f9146g0);
                                barrier.setAllowsGoneWidget(c1598j.f9160n0);
                                int[] iArr = c1598j.f9150i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str2 = c1598j.f9152j0;
                                    if (str2 != null) {
                                        int[] m4761c = m4761c(barrier, str2);
                                        c1598j.f9150i0 = m4761c;
                                        barrier.setReferencedIds(m4761c);
                                    }
                                }
                            }
                            C1592d c1592d = (C1592d) childAt.getLayoutParams();
                            c1592d.m4748a();
                            c1597i.m4756a(c1592d);
                            HashMap hashMap2 = c1597i.f9105f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap2.keySet()) {
                                C1589a c1589a = (C1589a) hashMap2.get(str3);
                                String m4299c = !c1589a.f8989a ? AbstractC1561o.m4299c("set", str3) : str3;
                                HashMap hashMap3 = hashMap2;
                                try {
                                    switch (AbstractC1241e.m2943b(c1589a.f8990b)) {
                                        case 0:
                                            i3 = childCount;
                                            cls.getMethod(m4299c, Integer.TYPE).invoke(childAt, Integer.valueOf(c1589a.f8991c));
                                            break;
                                        case 1:
                                            i3 = childCount;
                                            cls.getMethod(m4299c, Float.TYPE).invoke(childAt, Float.valueOf(c1589a.f8992d));
                                            break;
                                        case 2:
                                            i3 = childCount;
                                            cls.getMethod(m4299c, Integer.TYPE).invoke(childAt, Integer.valueOf(c1589a.f8995g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(m4299c, Drawable.class);
                                            i3 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c1589a.f8995g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder m163q = AbstractC0062j.m163q(" Custom Attribute \"", str3, "\" not found on ");
                                                m163q.append(cls.getName());
                                                Log.e("TransitionLayout", m163q.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                childCount = i3;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + m4299c);
                                                hashMap2 = hashMap3;
                                                childCount = i3;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder m163q2 = AbstractC0062j.m163q(" Custom Attribute \"", str3, "\" not found on ");
                                                m163q2.append(cls.getName());
                                                Log.e("TransitionLayout", m163q2.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                childCount = i3;
                                            }
                                        case 4:
                                            cls.getMethod(m4299c, CharSequence.class).invoke(childAt, c1589a.f8993e);
                                            i3 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(m4299c, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1589a.f8994f));
                                            i3 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(m4299c, Float.TYPE).invoke(childAt, Float.valueOf(c1589a.f8992d));
                                            i3 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(m4299c, Integer.TYPE).invoke(childAt, Integer.valueOf(c1589a.f8991c));
                                            i3 = childCount;
                                            break;
                                        default:
                                            i3 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i3 = childCount;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i3 = childCount;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i3 = childCount;
                                }
                                hashMap2 = hashMap3;
                                childCount = i3;
                            }
                            i = childCount;
                            childAt.setLayoutParams(c1592d);
                            C1600l c1600l = c1597i.f9101b;
                            if (c1600l.f9185b == 0) {
                                childAt.setVisibility(c1600l.f9184a);
                            }
                            childAt.setAlpha(c1600l.f9186c);
                            C1601m c1601m = c1597i.f9104e;
                            childAt.setRotation(c1601m.f9189a);
                            childAt.setRotationX(c1601m.f9190b);
                            childAt.setRotationY(c1601m.f9191c);
                            childAt.setScaleX(c1601m.f9192d);
                            childAt.setScaleY(c1601m.f9193e);
                            if (c1601m.f9196h != -1) {
                                if (((View) childAt.getParent()).findViewById(c1601m.f9196h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c1601m.f9194f)) {
                                    childAt.setPivotX(c1601m.f9194f);
                                }
                                if (!Float.isNaN(c1601m.f9195g)) {
                                    childAt.setPivotY(c1601m.f9195g);
                                }
                            }
                            childAt.setTranslationX(c1601m.f9197i);
                            childAt.setTranslationY(c1601m.f9198j);
                            childAt.setTranslationZ(c1601m.f9199k);
                            if (c1601m.f9200l) {
                                childAt.setElevation(c1601m.f9201m);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i2 = 1;
                    i5 += i2;
                    i4 = i2;
                    childCount = i;
                    c1602n = this;
                }
            }
            i2 = i4;
            i = childCount;
            i5 += i2;
            i4 = i2;
            childCount = i;
            c1602n = this;
        }
        int i6 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1597i c1597i2 = (C1597i) hashMap.get(num);
            if (c1597i2 != null) {
                C1598j c1598j2 = c1597i2.f9103d;
                if (c1598j2.f9148h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c1598j2.f9150i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str4 = c1598j2.f9152j0;
                        if (str4 != null) {
                            int[] m4761c2 = m4761c(barrier2, str4);
                            c1598j2.f9150i0 = m4761c2;
                            barrier2.setReferencedIds(m4761c2);
                        }
                    }
                    barrier2.setType(c1598j2.f9144f0);
                    barrier2.setMargin(c1598j2.f9146g0);
                    C1606r c1606r = ConstraintLayout.f1856w;
                    C1592d c1592d2 = new C1592d(-2, -2);
                    barrier2.m4747i();
                    c1597i2.m4756a(c1592d2);
                    constraintLayout.addView(barrier2, c1592d2);
                }
                if (c1598j2.f9133a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C1606r c1606r2 = ConstraintLayout.f1856w;
                    C1592d c1592d3 = new C1592d(-2, -2);
                    c1597i2.m4756a(c1592d3);
                    constraintLayout.addView(guideline, c1592d3);
                }
            }
        }
        for (int i7 = 0; i7 < i6; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof AbstractC1590b) {
                ((AbstractC1590b) childAt2).mo4745e(constraintLayout);
            }
        }
    }

    /* renamed from: b */
    public final void m4767b(ConstraintLayout constraintLayout) {
        C1602n c1602n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c1602n.f9207c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C1592d c1592d = (C1592d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1602n.f9206b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C1597i());
            }
            C1597i c1597i = (C1597i) hashMap.get(Integer.valueOf(id));
            if (c1597i != null) {
                HashMap hashMap2 = c1602n.f9205a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C1589a c1589a = (C1589a) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C1589a(c1589a, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C1589a(c1589a, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c1597i.f9105f = hashMap3;
                c1597i.f9100a = id;
                int i2 = c1592d.f9038e;
                C1598j c1598j = c1597i.f9103d;
                c1598j.f9147h = i2;
                c1598j.f9149i = c1592d.f9040f;
                c1598j.f9151j = c1592d.f9042g;
                c1598j.f9153k = c1592d.f9044h;
                c1598j.f9155l = c1592d.f9046i;
                c1598j.f9157m = c1592d.f9048j;
                c1598j.f9159n = c1592d.f9050k;
                c1598j.f9161o = c1592d.f9052l;
                c1598j.f9163p = c1592d.f9054m;
                c1598j.f9164q = c1592d.f9056n;
                c1598j.f9165r = c1592d.f9058o;
                c1598j.f9166s = c1592d.f9064s;
                c1598j.f9167t = c1592d.f9065t;
                c1598j.f9168u = c1592d.f9066u;
                c1598j.f9169v = c1592d.f9067v;
                c1598j.f9170w = c1592d.f9008E;
                c1598j.f9171x = c1592d.f9009F;
                c1598j.f9172y = c1592d.f9010G;
                c1598j.f9173z = c1592d.f9060p;
                c1598j.f9107A = c1592d.f9062q;
                c1598j.f9108B = c1592d.f9063r;
                c1598j.f9109C = c1592d.f9023T;
                c1598j.f9110D = c1592d.f9024U;
                c1598j.f9111E = c1592d.f9025V;
                c1598j.f9143f = c1592d.f9034c;
                c1598j.f9139d = c1592d.f9030a;
                c1598j.f9141e = c1592d.f9032b;
                c1598j.f9135b = ((ViewGroup.MarginLayoutParams) c1592d).width;
                c1598j.f9137c = ((ViewGroup.MarginLayoutParams) c1592d).height;
                c1598j.f9112F = ((ViewGroup.MarginLayoutParams) c1592d).leftMargin;
                c1598j.f9113G = ((ViewGroup.MarginLayoutParams) c1592d).rightMargin;
                c1598j.f9114H = ((ViewGroup.MarginLayoutParams) c1592d).topMargin;
                c1598j.f9115I = ((ViewGroup.MarginLayoutParams) c1592d).bottomMargin;
                c1598j.f9118L = c1592d.f9007D;
                c1598j.f9126T = c1592d.f9012I;
                c1598j.f9127U = c1592d.f9011H;
                c1598j.f9129W = c1592d.f9014K;
                c1598j.f9128V = c1592d.f9013J;
                c1598j.f9156l0 = c1592d.f9026W;
                c1598j.f9158m0 = c1592d.f9027X;
                c1598j.f9130X = c1592d.f9015L;
                c1598j.f9131Y = c1592d.f9016M;
                c1598j.f9132Z = c1592d.f9019P;
                c1598j.f9134a0 = c1592d.f9020Q;
                c1598j.f9136b0 = c1592d.f9017N;
                c1598j.f9138c0 = c1592d.f9018O;
                c1598j.f9140d0 = c1592d.f9021R;
                c1598j.f9142e0 = c1592d.f9022S;
                c1598j.f9154k0 = c1592d.f9028Y;
                c1598j.f9120N = c1592d.f9069x;
                c1598j.f9122P = c1592d.f9071z;
                c1598j.f9119M = c1592d.f9068w;
                c1598j.f9121O = c1592d.f9070y;
                c1598j.f9124R = c1592d.f9004A;
                c1598j.f9123Q = c1592d.f9005B;
                c1598j.f9125S = c1592d.f9006C;
                c1598j.f9162o0 = c1592d.f9029Z;
                c1598j.f9116J = c1592d.getMarginEnd();
                c1598j.f9117K = c1592d.getMarginStart();
                int visibility = childAt.getVisibility();
                C1600l c1600l = c1597i.f9101b;
                c1600l.f9184a = visibility;
                c1600l.f9186c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C1601m c1601m = c1597i.f9104e;
                c1601m.f9189a = rotation;
                c1601m.f9190b = childAt.getRotationX();
                c1601m.f9191c = childAt.getRotationY();
                c1601m.f9192d = childAt.getScaleX();
                c1601m.f9193e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1601m.f9194f = pivotX;
                    c1601m.f9195g = pivotY;
                }
                c1601m.f9197i = childAt.getTranslationX();
                c1601m.f9198j = childAt.getTranslationY();
                c1601m.f9199k = childAt.getTranslationZ();
                if (c1601m.f9200l) {
                    c1601m.f9201m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c1598j.f9160n0 = barrier.getAllowsGoneWidget();
                    c1598j.f9150i0 = barrier.getReferencedIds();
                    c1598j.f9144f0 = barrier.getType();
                    c1598j.f9146g0 = barrier.getMargin();
                }
            }
            i++;
            c1602n = this;
        }
    }

    /* renamed from: e */
    public final void m4768e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1597i m4762d = m4762d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m4762d.f9103d.f9133a = true;
                    }
                    this.f9207c.put(Integer.valueOf(m4762d.f9100a), m4762d);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
