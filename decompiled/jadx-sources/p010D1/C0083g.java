package p010D1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;

/* renamed from: D1.g */
/* loaded from: classes.dex */
public final class C0083g extends AbstractList implements RandomAccess {

    /* renamed from: a */
    public final C0080d[] f248a;

    /* renamed from: b */
    public final int[] f249b;

    public C0083g(C0080d[] c0080dArr, int[] iArr) {
        this.f248a = c0080dArr;
        this.f249b = iArr;
    }

    /* renamed from: a */
    public static void m248a(long j2, C0077a c0077a, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C0077a c0077a2;
        if (i2 >= i3) {
            throw new AssertionError();
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((C0080d) arrayList.get(i9)).mo244g() < i) {
                throw new AssertionError();
            }
        }
        C0080d c0080d = (C0080d) arrayList.get(i2);
        C0080d c0080d2 = (C0080d) arrayList.get(i3 - 1);
        if (i == c0080d.mo244g()) {
            int i10 = i2 + 1;
            i5 = i10;
            i4 = ((Integer) arrayList2.get(i2)).intValue();
            c0080d = (C0080d) arrayList.get(i10);
        } else {
            i4 = -1;
            i5 = i2;
        }
        long j3 = -1;
        if (c0080d.mo239b(i) == c0080d2.mo239b(i)) {
            int min = Math.min(c0080d.mo244g(), c0080d2.mo244g());
            int i11 = 0;
            for (int i12 = i; i12 < min && c0080d.mo239b(i12) == c0080d2.mo239b(i12); i12++) {
                i11++;
            }
            long j4 = j2 + ((int) (c0077a.f240b / 4)) + 2 + i11 + 1;
            c0077a.m236t(-i11);
            c0077a.m236t(i4);
            int i13 = i;
            while (true) {
                i6 = i + i11;
                if (i13 >= i6) {
                    break;
                }
                c0077a.m236t(c0080d.mo239b(i13) & 255);
                i13++;
            }
            if (i5 + 1 == i3) {
                if (i6 != ((C0080d) arrayList.get(i5)).mo244g()) {
                    throw new AssertionError();
                }
                c0077a.m236t(((Integer) arrayList2.get(i5)).intValue());
                return;
            } else {
                C0077a c0077a3 = new C0077a();
                c0077a.m236t((int) ((((int) (c0077a3.f240b / 4)) + j4) * (-1)));
                m248a(j4, c0077a3, i6, arrayList, i5, i3, arrayList2);
                c0077a.m234r(c0077a3, c0077a3.f240b);
                return;
            }
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i3; i15++) {
            if (((C0080d) arrayList.get(i15 - 1)).mo239b(i) != ((C0080d) arrayList.get(i15)).mo239b(i)) {
                i14++;
            }
        }
        long j5 = (i14 * 2) + j2 + ((int) (c0077a.f240b / 4)) + 2;
        c0077a.m236t(i14);
        c0077a.m236t(i4);
        for (int i16 = i5; i16 < i3; i16++) {
            byte mo239b = ((C0080d) arrayList.get(i16)).mo239b(i);
            if (i16 == i5 || mo239b != ((C0080d) arrayList.get(i16 - 1)).mo239b(i)) {
                c0077a.m236t(mo239b & 255);
            }
        }
        C0077a c0077a4 = new C0077a();
        int i17 = i5;
        while (i17 < i3) {
            byte mo239b2 = ((C0080d) arrayList.get(i17)).mo239b(i);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i7 = i3;
                    break;
                } else {
                    if (mo239b2 != ((C0080d) arrayList.get(i19)).mo239b(i)) {
                        i7 = i19;
                        break;
                    }
                    i19++;
                }
            }
            if (i18 == i7 && i + 1 == ((C0080d) arrayList.get(i17)).mo244g()) {
                c0077a.m236t(((Integer) arrayList2.get(i17)).intValue());
                i8 = i7;
                c0077a2 = c0077a4;
            } else {
                c0077a.m236t((int) ((((int) (c0077a4.f240b / 4)) + j5) * j3));
                i8 = i7;
                c0077a2 = c0077a4;
                m248a(j5, c0077a4, i + 1, arrayList, i17, i7, arrayList2);
            }
            c0077a4 = c0077a2;
            i17 = i8;
            j3 = -1;
        }
        C0077a c0077a5 = c0077a4;
        c0077a.m234r(c0077a5, c0077a5.f240b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0083g m249b(C0080d... c0080dArr) {
        int i;
        if (c0080dArr.length == 0) {
            return new C0083g(new C0080d[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(c0080dArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(-1);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.set(Collections.binarySearch(arrayList, c0080dArr[i3]), Integer.valueOf(i3));
        }
        if (((C0080d) arrayList.get(0)).mo244g() == 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            C0080d c0080d = (C0080d) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                C0080d c0080d2 = (C0080d) arrayList.get(i6);
                c0080d2.getClass();
                if (!c0080d2.mo243f(c0080d, c0080d.mo244g())) {
                    break;
                }
                if (c0080d2.mo244g() == c0080d.mo244g()) {
                    throw new IllegalArgumentException("duplicate option: " + c0080d2);
                }
                if (((Integer) arrayList2.get(i6)).intValue() > ((Integer) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    arrayList2.remove(i6);
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        C0077a c0077a = new C0077a();
        m248a(0L, c0077a, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (c0077a.f240b / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            long j2 = c0077a.f240b;
            if (j2 < 4) {
                throw new IllegalStateException("size < 4: " + c0077a.f240b);
            }
            C0087k c0087k = c0077a.f239a;
            int i9 = c0087k.f261b;
            int i10 = c0087k.f262c;
            if (i10 - i9 < 4) {
                i = ((c0077a.m228l() & 255) << 24) | ((c0077a.m228l() & 255) << 16) | ((c0077a.m228l() & 255) << 8) | (c0077a.m228l() & 255);
            } else {
                byte[] bArr = c0087k.f260a;
                int i11 = i9 + 3;
                int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
                int i13 = i9 + 4;
                int i14 = i12 | (bArr[i11] & 255);
                c0077a.f240b = j2 - 4;
                if (i13 == i10) {
                    c0077a.f239a = c0087k.m250a();
                    AbstractC0088l.m271h0(c0087k);
                } else {
                    c0087k.f261b = i13;
                }
                i = i14;
            }
            iArr[i8] = i;
        }
        if (c0077a.f240b == 0) {
            return new C0083g((C0080d[]) c0080dArr.clone(), iArr);
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f248a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f248a.length;
    }
}
