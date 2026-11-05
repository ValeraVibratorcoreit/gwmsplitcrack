package p111v;

import android.view.ViewGroup;
import com.jcraft.jsch.SftpATTRS;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i */
/* loaded from: classes.dex */
public final class C1597i {

    /* renamed from: a */
    public int f9100a;

    /* renamed from: b */
    public final C1600l f9101b;

    /* renamed from: c */
    public final C1599k f9102c;

    /* renamed from: d */
    public final C1598j f9103d;

    /* renamed from: e */
    public final C1601m f9104e;

    /* renamed from: f */
    public HashMap f9105f;

    public C1597i() {
        C1600l c1600l = new C1600l();
        c1600l.f9184a = 0;
        c1600l.f9185b = 0;
        c1600l.f9186c = 1.0f;
        c1600l.f9187d = Float.NaN;
        this.f9101b = c1600l;
        C1599k c1599k = new C1599k();
        c1599k.f9175a = -1;
        c1599k.f9176b = 0;
        c1599k.f9177c = -1;
        c1599k.f9178d = Float.NaN;
        c1599k.f9179e = Float.NaN;
        c1599k.f9180f = Float.NaN;
        c1599k.f9181g = -1;
        c1599k.f9182h = null;
        c1599k.f9183i = -1;
        this.f9102c = c1599k;
        C1598j c1598j = new C1598j();
        c1598j.f9133a = false;
        c1598j.f9139d = -1;
        c1598j.f9141e = -1;
        c1598j.f9143f = -1.0f;
        c1598j.f9145g = true;
        c1598j.f9147h = -1;
        c1598j.f9149i = -1;
        c1598j.f9151j = -1;
        c1598j.f9153k = -1;
        c1598j.f9155l = -1;
        c1598j.f9157m = -1;
        c1598j.f9159n = -1;
        c1598j.f9161o = -1;
        c1598j.f9163p = -1;
        c1598j.f9164q = -1;
        c1598j.f9165r = -1;
        c1598j.f9166s = -1;
        c1598j.f9167t = -1;
        c1598j.f9168u = -1;
        c1598j.f9169v = -1;
        c1598j.f9170w = 0.5f;
        c1598j.f9171x = 0.5f;
        c1598j.f9172y = null;
        c1598j.f9173z = -1;
        c1598j.f9107A = 0;
        c1598j.f9108B = 0.0f;
        c1598j.f9109C = -1;
        c1598j.f9110D = -1;
        c1598j.f9111E = -1;
        c1598j.f9112F = 0;
        c1598j.f9113G = 0;
        c1598j.f9114H = 0;
        c1598j.f9115I = 0;
        c1598j.f9116J = 0;
        c1598j.f9117K = 0;
        c1598j.f9118L = 0;
        c1598j.f9119M = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1598j.f9120N = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1598j.f9121O = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1598j.f9122P = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1598j.f9123Q = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1598j.f9124R = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1598j.f9125S = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1598j.f9126T = -1.0f;
        c1598j.f9127U = -1.0f;
        c1598j.f9128V = 0;
        c1598j.f9129W = 0;
        c1598j.f9130X = 0;
        c1598j.f9131Y = 0;
        c1598j.f9132Z = 0;
        c1598j.f9134a0 = 0;
        c1598j.f9136b0 = 0;
        c1598j.f9138c0 = 0;
        c1598j.f9140d0 = 1.0f;
        c1598j.f9142e0 = 1.0f;
        c1598j.f9144f0 = -1;
        c1598j.f9146g0 = 0;
        c1598j.f9148h0 = -1;
        c1598j.f9156l0 = false;
        c1598j.f9158m0 = false;
        c1598j.f9160n0 = true;
        c1598j.f9162o0 = 0;
        this.f9103d = c1598j;
        C1601m c1601m = new C1601m();
        c1601m.f9189a = 0.0f;
        c1601m.f9190b = 0.0f;
        c1601m.f9191c = 0.0f;
        c1601m.f9192d = 1.0f;
        c1601m.f9193e = 1.0f;
        c1601m.f9194f = Float.NaN;
        c1601m.f9195g = Float.NaN;
        c1601m.f9196h = -1;
        c1601m.f9197i = 0.0f;
        c1601m.f9198j = 0.0f;
        c1601m.f9199k = 0.0f;
        c1601m.f9200l = false;
        c1601m.f9201m = 0.0f;
        this.f9104e = c1601m;
        this.f9105f = new HashMap();
    }

    /* renamed from: a */
    public final void m4756a(C1592d c1592d) {
        C1598j c1598j = this.f9103d;
        c1592d.f9038e = c1598j.f9147h;
        c1592d.f9040f = c1598j.f9149i;
        c1592d.f9042g = c1598j.f9151j;
        c1592d.f9044h = c1598j.f9153k;
        c1592d.f9046i = c1598j.f9155l;
        c1592d.f9048j = c1598j.f9157m;
        c1592d.f9050k = c1598j.f9159n;
        c1592d.f9052l = c1598j.f9161o;
        c1592d.f9054m = c1598j.f9163p;
        c1592d.f9056n = c1598j.f9164q;
        c1592d.f9058o = c1598j.f9165r;
        c1592d.f9064s = c1598j.f9166s;
        c1592d.f9065t = c1598j.f9167t;
        c1592d.f9066u = c1598j.f9168u;
        c1592d.f9067v = c1598j.f9169v;
        ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = c1598j.f9112F;
        ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = c1598j.f9113G;
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = c1598j.f9114H;
        ((ViewGroup.MarginLayoutParams) c1592d).bottomMargin = c1598j.f9115I;
        c1592d.f9004A = c1598j.f9124R;
        c1592d.f9005B = c1598j.f9123Q;
        c1592d.f9069x = c1598j.f9120N;
        c1592d.f9071z = c1598j.f9122P;
        c1592d.f9008E = c1598j.f9170w;
        c1592d.f9009F = c1598j.f9171x;
        c1592d.f9060p = c1598j.f9173z;
        c1592d.f9062q = c1598j.f9107A;
        c1592d.f9063r = c1598j.f9108B;
        c1592d.f9010G = c1598j.f9172y;
        c1592d.f9023T = c1598j.f9109C;
        c1592d.f9024U = c1598j.f9110D;
        c1592d.f9012I = c1598j.f9126T;
        c1592d.f9011H = c1598j.f9127U;
        c1592d.f9014K = c1598j.f9129W;
        c1592d.f9013J = c1598j.f9128V;
        c1592d.f9026W = c1598j.f9156l0;
        c1592d.f9027X = c1598j.f9158m0;
        c1592d.f9015L = c1598j.f9130X;
        c1592d.f9016M = c1598j.f9131Y;
        c1592d.f9019P = c1598j.f9132Z;
        c1592d.f9020Q = c1598j.f9134a0;
        c1592d.f9017N = c1598j.f9136b0;
        c1592d.f9018O = c1598j.f9138c0;
        c1592d.f9021R = c1598j.f9140d0;
        c1592d.f9022S = c1598j.f9142e0;
        c1592d.f9025V = c1598j.f9111E;
        c1592d.f9034c = c1598j.f9143f;
        c1592d.f9030a = c1598j.f9139d;
        c1592d.f9032b = c1598j.f9141e;
        ((ViewGroup.MarginLayoutParams) c1592d).width = c1598j.f9135b;
        ((ViewGroup.MarginLayoutParams) c1592d).height = c1598j.f9137c;
        String str = c1598j.f9154k0;
        if (str != null) {
            c1592d.f9028Y = str;
        }
        c1592d.f9029Z = c1598j.f9162o0;
        c1592d.setMarginStart(c1598j.f9117K);
        c1592d.setMarginEnd(c1598j.f9116J);
        c1592d.m4748a();
    }

    public final Object clone() {
        C1597i c1597i = new C1597i();
        C1598j c1598j = c1597i.f9103d;
        c1598j.getClass();
        C1598j c1598j2 = this.f9103d;
        c1598j.f9133a = c1598j2.f9133a;
        c1598j.f9135b = c1598j2.f9135b;
        c1598j.f9137c = c1598j2.f9137c;
        c1598j.f9139d = c1598j2.f9139d;
        c1598j.f9141e = c1598j2.f9141e;
        c1598j.f9143f = c1598j2.f9143f;
        c1598j.f9145g = c1598j2.f9145g;
        c1598j.f9147h = c1598j2.f9147h;
        c1598j.f9149i = c1598j2.f9149i;
        c1598j.f9151j = c1598j2.f9151j;
        c1598j.f9153k = c1598j2.f9153k;
        c1598j.f9155l = c1598j2.f9155l;
        c1598j.f9157m = c1598j2.f9157m;
        c1598j.f9159n = c1598j2.f9159n;
        c1598j.f9161o = c1598j2.f9161o;
        c1598j.f9163p = c1598j2.f9163p;
        c1598j.f9164q = c1598j2.f9164q;
        c1598j.f9165r = c1598j2.f9165r;
        c1598j.f9166s = c1598j2.f9166s;
        c1598j.f9167t = c1598j2.f9167t;
        c1598j.f9168u = c1598j2.f9168u;
        c1598j.f9169v = c1598j2.f9169v;
        c1598j.f9170w = c1598j2.f9170w;
        c1598j.f9171x = c1598j2.f9171x;
        c1598j.f9172y = c1598j2.f9172y;
        c1598j.f9173z = c1598j2.f9173z;
        c1598j.f9107A = c1598j2.f9107A;
        c1598j.f9108B = c1598j2.f9108B;
        c1598j.f9109C = c1598j2.f9109C;
        c1598j.f9110D = c1598j2.f9110D;
        c1598j.f9111E = c1598j2.f9111E;
        c1598j.f9112F = c1598j2.f9112F;
        c1598j.f9113G = c1598j2.f9113G;
        c1598j.f9114H = c1598j2.f9114H;
        c1598j.f9115I = c1598j2.f9115I;
        c1598j.f9116J = c1598j2.f9116J;
        c1598j.f9117K = c1598j2.f9117K;
        c1598j.f9118L = c1598j2.f9118L;
        c1598j.f9119M = c1598j2.f9119M;
        c1598j.f9120N = c1598j2.f9120N;
        c1598j.f9121O = c1598j2.f9121O;
        c1598j.f9122P = c1598j2.f9122P;
        c1598j.f9123Q = c1598j2.f9123Q;
        c1598j.f9124R = c1598j2.f9124R;
        c1598j.f9125S = c1598j2.f9125S;
        c1598j.f9126T = c1598j2.f9126T;
        c1598j.f9127U = c1598j2.f9127U;
        c1598j.f9128V = c1598j2.f9128V;
        c1598j.f9129W = c1598j2.f9129W;
        c1598j.f9130X = c1598j2.f9130X;
        c1598j.f9131Y = c1598j2.f9131Y;
        c1598j.f9132Z = c1598j2.f9132Z;
        c1598j.f9134a0 = c1598j2.f9134a0;
        c1598j.f9136b0 = c1598j2.f9136b0;
        c1598j.f9138c0 = c1598j2.f9138c0;
        c1598j.f9140d0 = c1598j2.f9140d0;
        c1598j.f9142e0 = c1598j2.f9142e0;
        c1598j.f9144f0 = c1598j2.f9144f0;
        c1598j.f9146g0 = c1598j2.f9146g0;
        c1598j.f9148h0 = c1598j2.f9148h0;
        c1598j.f9154k0 = c1598j2.f9154k0;
        int[] iArr = c1598j2.f9150i0;
        if (iArr == null || c1598j2.f9152j0 != null) {
            c1598j.f9150i0 = null;
        } else {
            c1598j.f9150i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c1598j.f9152j0 = c1598j2.f9152j0;
        c1598j.f9156l0 = c1598j2.f9156l0;
        c1598j.f9158m0 = c1598j2.f9158m0;
        c1598j.f9160n0 = c1598j2.f9160n0;
        c1598j.f9162o0 = c1598j2.f9162o0;
        C1599k c1599k = c1597i.f9102c;
        c1599k.getClass();
        C1599k c1599k2 = this.f9102c;
        c1599k2.getClass();
        c1599k.f9175a = c1599k2.f9175a;
        c1599k.f9177c = c1599k2.f9177c;
        c1599k.f9179e = c1599k2.f9179e;
        c1599k.f9178d = c1599k2.f9178d;
        C1600l c1600l = c1597i.f9101b;
        C1600l c1600l2 = this.f9101b;
        c1600l.f9184a = c1600l2.f9184a;
        c1600l.f9186c = c1600l2.f9186c;
        c1600l.f9187d = c1600l2.f9187d;
        c1600l.f9185b = c1600l2.f9185b;
        C1601m c1601m = c1597i.f9104e;
        c1601m.getClass();
        C1601m c1601m2 = this.f9104e;
        c1601m2.getClass();
        c1601m.f9189a = c1601m2.f9189a;
        c1601m.f9190b = c1601m2.f9190b;
        c1601m.f9191c = c1601m2.f9191c;
        c1601m.f9192d = c1601m2.f9192d;
        c1601m.f9193e = c1601m2.f9193e;
        c1601m.f9194f = c1601m2.f9194f;
        c1601m.f9195g = c1601m2.f9195g;
        c1601m.f9196h = c1601m2.f9196h;
        c1601m.f9197i = c1601m2.f9197i;
        c1601m.f9198j = c1601m2.f9198j;
        c1601m.f9199k = c1601m2.f9199k;
        c1601m.f9200l = c1601m2.f9200l;
        c1601m.f9201m = c1601m2.f9201m;
        c1597i.f9100a = this.f9100a;
        return c1597i;
    }
}
