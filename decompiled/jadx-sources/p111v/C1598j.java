package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;

/* renamed from: v.j */
/* loaded from: classes.dex */
public final class C1598j {

    /* renamed from: p0 */
    public static final SparseIntArray f9106p0;

    /* renamed from: A */
    public int f9107A;

    /* renamed from: B */
    public float f9108B;

    /* renamed from: C */
    public int f9109C;

    /* renamed from: D */
    public int f9110D;

    /* renamed from: E */
    public int f9111E;

    /* renamed from: F */
    public int f9112F;

    /* renamed from: G */
    public int f9113G;

    /* renamed from: H */
    public int f9114H;

    /* renamed from: I */
    public int f9115I;

    /* renamed from: J */
    public int f9116J;

    /* renamed from: K */
    public int f9117K;

    /* renamed from: L */
    public int f9118L;

    /* renamed from: M */
    public int f9119M;

    /* renamed from: N */
    public int f9120N;

    /* renamed from: O */
    public int f9121O;

    /* renamed from: P */
    public int f9122P;

    /* renamed from: Q */
    public int f9123Q;

    /* renamed from: R */
    public int f9124R;

    /* renamed from: S */
    public int f9125S;

    /* renamed from: T */
    public float f9126T;

    /* renamed from: U */
    public float f9127U;

    /* renamed from: V */
    public int f9128V;

    /* renamed from: W */
    public int f9129W;

    /* renamed from: X */
    public int f9130X;

    /* renamed from: Y */
    public int f9131Y;

    /* renamed from: Z */
    public int f9132Z;

    /* renamed from: a */
    public boolean f9133a;

    /* renamed from: a0 */
    public int f9134a0;

    /* renamed from: b */
    public int f9135b;

    /* renamed from: b0 */
    public int f9136b0;

    /* renamed from: c */
    public int f9137c;

    /* renamed from: c0 */
    public int f9138c0;

    /* renamed from: d */
    public int f9139d;

    /* renamed from: d0 */
    public float f9140d0;

    /* renamed from: e */
    public int f9141e;

    /* renamed from: e0 */
    public float f9142e0;

    /* renamed from: f */
    public float f9143f;

    /* renamed from: f0 */
    public int f9144f0;

    /* renamed from: g */
    public boolean f9145g;

    /* renamed from: g0 */
    public int f9146g0;

    /* renamed from: h */
    public int f9147h;

    /* renamed from: h0 */
    public int f9148h0;

    /* renamed from: i */
    public int f9149i;

    /* renamed from: i0 */
    public int[] f9150i0;

    /* renamed from: j */
    public int f9151j;

    /* renamed from: j0 */
    public String f9152j0;

    /* renamed from: k */
    public int f9153k;

    /* renamed from: k0 */
    public String f9154k0;

    /* renamed from: l */
    public int f9155l;

    /* renamed from: l0 */
    public boolean f9156l0;

    /* renamed from: m */
    public int f9157m;

    /* renamed from: m0 */
    public boolean f9158m0;

    /* renamed from: n */
    public int f9159n;

    /* renamed from: n0 */
    public boolean f9160n0;

    /* renamed from: o */
    public int f9161o;

    /* renamed from: o0 */
    public int f9162o0;

    /* renamed from: p */
    public int f9163p;

    /* renamed from: q */
    public int f9164q;

    /* renamed from: r */
    public int f9165r;

    /* renamed from: s */
    public int f9166s;

    /* renamed from: t */
    public int f9167t;

    /* renamed from: u */
    public int f9168u;

    /* renamed from: v */
    public int f9169v;

    /* renamed from: w */
    public float f9170w;

    /* renamed from: x */
    public float f9171x;

    /* renamed from: y */
    public String f9172y;

    /* renamed from: z */
    public int f9173z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9106p0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 41);
        sparseIntArray.append(16, 42);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    /* renamed from: a */
    public final void m4757a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1605q.f9212e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = f9106p0;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.f9163p = C1602n.m4763f(obtainStyledAttributes, index, this.f9163p);
                    break;
                case 2:
                    this.f9115I = obtainStyledAttributes.getDimensionPixelSize(index, this.f9115I);
                    break;
                case 3:
                    this.f9161o = C1602n.m4763f(obtainStyledAttributes, index, this.f9161o);
                    break;
                case 4:
                    this.f9159n = C1602n.m4763f(obtainStyledAttributes, index, this.f9159n);
                    break;
                case 5:
                    this.f9172y = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.f9109C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9109C);
                    break;
                case 7:
                    this.f9110D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9110D);
                    break;
                case 8:
                    this.f9116J = obtainStyledAttributes.getDimensionPixelSize(index, this.f9116J);
                    break;
                case Platform.GNU /* 9 */:
                    this.f9169v = C1602n.m4763f(obtainStyledAttributes, index, this.f9169v);
                    break;
                case Platform.KFREEBSD /* 10 */:
                    this.f9168u = C1602n.m4763f(obtainStyledAttributes, index, this.f9168u);
                    break;
                case Platform.NETBSD /* 11 */:
                    this.f9122P = obtainStyledAttributes.getDimensionPixelSize(index, this.f9122P);
                    break;
                case Platform.DRAGONFLYBSD /* 12 */:
                    this.f9123Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f9123Q);
                    break;
                case 13:
                    this.f9119M = obtainStyledAttributes.getDimensionPixelSize(index, this.f9119M);
                    break;
                case 14:
                    this.f9121O = obtainStyledAttributes.getDimensionPixelSize(index, this.f9121O);
                    break;
                case 15:
                    this.f9124R = obtainStyledAttributes.getDimensionPixelSize(index, this.f9124R);
                    break;
                case DLLCallback.DLL_FPTRS /* 16 */:
                    this.f9120N = obtainStyledAttributes.getDimensionPixelSize(index, this.f9120N);
                    break;
                case 17:
                    this.f9139d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9139d);
                    break;
                case 18:
                    this.f9141e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9141e);
                    break;
                case 19:
                    this.f9143f = obtainStyledAttributes.getFloat(index, this.f9143f);
                    break;
                case 20:
                    this.f9170w = obtainStyledAttributes.getFloat(index, this.f9170w);
                    break;
                case 21:
                    this.f9137c = obtainStyledAttributes.getLayoutDimension(index, this.f9137c);
                    break;
                case 22:
                    this.f9135b = obtainStyledAttributes.getLayoutDimension(index, this.f9135b);
                    break;
                case 23:
                    this.f9112F = obtainStyledAttributes.getDimensionPixelSize(index, this.f9112F);
                    break;
                case 24:
                    this.f9147h = C1602n.m4763f(obtainStyledAttributes, index, this.f9147h);
                    break;
                case 25:
                    this.f9149i = C1602n.m4763f(obtainStyledAttributes, index, this.f9149i);
                    break;
                case 26:
                    this.f9111E = obtainStyledAttributes.getInt(index, this.f9111E);
                    break;
                case 27:
                    this.f9113G = obtainStyledAttributes.getDimensionPixelSize(index, this.f9113G);
                    break;
                case 28:
                    this.f9151j = C1602n.m4763f(obtainStyledAttributes, index, this.f9151j);
                    break;
                case 29:
                    this.f9153k = C1602n.m4763f(obtainStyledAttributes, index, this.f9153k);
                    break;
                case 30:
                    this.f9117K = obtainStyledAttributes.getDimensionPixelSize(index, this.f9117K);
                    break;
                case 31:
                    this.f9166s = C1602n.m4763f(obtainStyledAttributes, index, this.f9166s);
                    break;
                case 32:
                    this.f9167t = C1602n.m4763f(obtainStyledAttributes, index, this.f9167t);
                    break;
                case 33:
                    this.f9114H = obtainStyledAttributes.getDimensionPixelSize(index, this.f9114H);
                    break;
                case 34:
                    this.f9157m = C1602n.m4763f(obtainStyledAttributes, index, this.f9157m);
                    break;
                case 35:
                    this.f9155l = C1602n.m4763f(obtainStyledAttributes, index, this.f9155l);
                    break;
                case 36:
                    this.f9171x = obtainStyledAttributes.getFloat(index, this.f9171x);
                    break;
                case 37:
                    this.f9127U = obtainStyledAttributes.getFloat(index, this.f9127U);
                    break;
                case 38:
                    this.f9126T = obtainStyledAttributes.getFloat(index, this.f9126T);
                    break;
                case 39:
                    this.f9128V = obtainStyledAttributes.getInt(index, this.f9128V);
                    break;
                case 40:
                    this.f9129W = obtainStyledAttributes.getInt(index, this.f9129W);
                    break;
                case 41:
                    C1602n.m4764g(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    C1602n.m4764g(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case 61:
                            this.f9173z = C1602n.m4763f(obtainStyledAttributes, index, this.f9173z);
                            break;
                        case 62:
                            this.f9107A = obtainStyledAttributes.getDimensionPixelSize(index, this.f9107A);
                            break;
                        case 63:
                            this.f9108B = obtainStyledAttributes.getFloat(index, this.f9108B);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.f9140d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f9142e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f9144f0 = obtainStyledAttributes.getInt(index, this.f9144f0);
                                    break;
                                case 73:
                                    this.f9146g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9146g0);
                                    break;
                                case 74:
                                    this.f9152j0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f9160n0 = obtainStyledAttributes.getBoolean(index, this.f9160n0);
                                    break;
                                case 76:
                                    this.f9162o0 = obtainStyledAttributes.getInt(index, this.f9162o0);
                                    break;
                                case 77:
                                    this.f9164q = C1602n.m4763f(obtainStyledAttributes, index, this.f9164q);
                                    break;
                                case 78:
                                    this.f9165r = C1602n.m4763f(obtainStyledAttributes, index, this.f9165r);
                                    break;
                                case 79:
                                    this.f9125S = obtainStyledAttributes.getDimensionPixelSize(index, this.f9125S);
                                    break;
                                case 80:
                                    this.f9118L = obtainStyledAttributes.getDimensionPixelSize(index, this.f9118L);
                                    break;
                                case 81:
                                    this.f9130X = obtainStyledAttributes.getInt(index, this.f9130X);
                                    break;
                                case 82:
                                    this.f9131Y = obtainStyledAttributes.getInt(index, this.f9131Y);
                                    break;
                                case 83:
                                    this.f9134a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9134a0);
                                    break;
                                case 84:
                                    this.f9132Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f9132Z);
                                    break;
                                case 85:
                                    this.f9138c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9138c0);
                                    break;
                                case 86:
                                    this.f9136b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9136b0);
                                    break;
                                case 87:
                                    this.f9156l0 = obtainStyledAttributes.getBoolean(index, this.f9156l0);
                                    break;
                                case 88:
                                    this.f9158m0 = obtainStyledAttributes.getBoolean(index, this.f9158m0);
                                    break;
                                case 89:
                                    this.f9154k0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f9145g = obtainStyledAttributes.getBoolean(index, this.f9145g);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
