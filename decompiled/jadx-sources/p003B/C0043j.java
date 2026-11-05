package p003B;

import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0553r;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sun.jna.Platform;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p006C.C0058f;
import p013F0.RunnableC0099c;
import p016H.C0115g;
import p016H.RunnableC0109a;
import p017H0.C0125d;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;
import p022K.C0175X;
import p022K.C0198k;
import p022K.C0208p;
import p022K.C0217t0;
import p022K.C0221v0;
import p022K.InterfaceC0210q;
import p034Q0.AbstractC0294k;
import p034Q0.C0298o;
import p038T.C0321o;
import p038T.C0326t;
import p038T.C0329w;
import p038T.C0330x;
import p038T.C0331y;
import p038T.InterfaceC0320n;
import p042V.C0339a;
import p042V.C0347i;
import p045W0.C0355e;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0376D;
import p046X.C0387O;
import p068f0.AbstractC0792W;
import p068f0.C0776F;
import p068f0.C0801c0;
import p068f0.C0807f0;
import p068f0.C0809g0;
import p069f1.AbstractC0832d;
import p069f1.C0833e;
import p069f1.C0834f;
import p069f1.InterfaceC0843o;
import p070g.AbstractActivityC0870i;
import p070g.C0879r;
import p070g.LayoutInflaterFactory2C0887z;
import p075i1.AbstractC0951c;
import p076j.AbstractC0952a;
import p076j.C0956e;
import p079k.MenuC1002B;
import p079k.MenuC1018m;
import p081k1.C1048a;
import p091o.C1195e;
import p091o.C1201k;
import p097q.AbstractC1241e;
import p097q.C1240d;
import p097q.C1242f;
import p098q0.C1337n;
import p098q0.C1375z1;
import p098q0.InterfaceC1351r1;
import p111v.C1589a;
import p111v.C1597i;
import p111v.C1602n;
import p118x0.C1653i;
import p118x0.C1656l;
import p121y0.AbstractC1687o;

/* renamed from: B.j */
/* loaded from: classes.dex */
public final class C0043j implements InterfaceC0210q, InterfaceC0320n, InterfaceC1351r1 {

    /* renamed from: f */
    public final /* synthetic */ int f140f;

    /* renamed from: g */
    public Object f141g;

    /* renamed from: h */
    public Object f142h;

    public /* synthetic */ C0043j(int i, boolean z2) {
        this.f140f = i;
    }

    /* renamed from: A */
    public static int m60A(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* renamed from: g */
    public static C0043j m61g(View view, int i) {
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(i);
        if (findViewById instanceof ImageView) {
            return new C0043j((ImageView) findViewById);
        }
        return null;
    }

    /* renamed from: h */
    public static String m62h(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* renamed from: x */
    public static C0043j m63x(String str) {
        return new C0043j((Object) null, 17, str);
    }

    /* renamed from: B */
    public void m64B() {
        ((SparseIntArray) this.f141g).clear();
    }

    /* renamed from: C */
    public boolean m65C(View view) {
        C0776F c0776f = (C0776F) this.f141g;
        int m2216d = c0776f.m2216d();
        int m2215c = c0776f.m2215c();
        int m2214b = c0776f.m2214b(view);
        int m2213a = c0776f.m2213a(view);
        C0807f0 c0807f0 = (C0807f0) this.f142h;
        c0807f0.f4072b = m2216d;
        c0807f0.f4073c = m2215c;
        c0807f0.f4074d = m2214b;
        c0807f0.f4075e = m2213a;
        c0807f0.f4071a = 24579;
        return c0807f0.m2302a();
    }

    /* renamed from: D */
    public void m66D(int i, int i2) {
        int[] iArr = (int[]) this.f141g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m93w(i3);
        int[] iArr2 = (int[]) this.f141g;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f141g, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f142h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0801c0 c0801c0 = (C0801c0) ((ArrayList) this.f142h).get(size);
            int i4 = c0801c0.f4035a;
            if (i4 >= i) {
                c0801c0.f4035a = i4 + i2;
            }
        }
    }

    /* renamed from: E */
    public void m67E(int i, int i2) {
        int[] iArr = (int[]) this.f141g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m93w(i3);
        int[] iArr2 = (int[]) this.f141g;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f141g;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f142h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0801c0 c0801c0 = (C0801c0) ((ArrayList) this.f142h).get(size);
            int i4 = c0801c0.f4035a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f142h).remove(size);
                } else {
                    c0801c0.f4035a = i4 - i2;
                }
            }
        }
    }

    /* renamed from: F */
    public void m68F(AbstractC0952a abstractC0952a) {
        C0326t c0326t = (C0326t) this.f141g;
        ((ActionMode.Callback) c0326t.f923a).onDestroyActionMode(c0326t.m912e(abstractC0952a));
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) this.f142h;
        if (layoutInflaterFactory2C0887z.f4417B != null) {
            layoutInflaterFactory2C0887z.f4456q.getDecorView().removeCallbacks(layoutInflaterFactory2C0887z.f4418C);
        }
        if (layoutInflaterFactory2C0887z.f4416A != null) {
            C0175X c0175x = layoutInflaterFactory2C0887z.f4419D;
            if (c0175x != null) {
                c0175x.m521b();
            }
            C0175X m496a = AbstractC0169Q.m496a(layoutInflaterFactory2C0887z.f4416A);
            m496a.m520a(0.0f);
            layoutInflaterFactory2C0887z.f4419D = m496a;
            m496a.m523d(new C0879r(2, this));
        }
        layoutInflaterFactory2C0887z.f4465z = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0887z.f4421F;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0156D.m419c(viewGroup);
        layoutInflaterFactory2C0887z.m2448H();
    }

    /* renamed from: G */
    public boolean m69G(AbstractC0952a abstractC0952a, MenuC1018m menuC1018m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0887z) this.f142h).f4421F;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0156D.m419c(viewGroup);
        C0326t c0326t = (C0326t) this.f141g;
        C0956e m912e = c0326t.m912e(abstractC0952a);
        C1201k c1201k = (C1201k) c0326t.f926d;
        Menu menu = (Menu) c1201k.getOrDefault(menuC1018m, null);
        if (menu == null) {
            menu = new MenuC1002B((Context) c0326t.f924b, menuC1018m);
            c1201k.put(menuC1018m, menu);
        }
        return ((ActionMode.Callback) c0326t.f923a).onPrepareActionMode(m912e, menu);
    }

    /* renamed from: H */
    public void m70H(C0115g c0115g) {
        int i = c0115g.f363b;
        Handler handler = (Handler) this.f142h;
        C0639g c0639g = (C0639g) this.f141g;
        if (i != 0) {
            handler.post(new RunnableC0109a(c0639g, i, 0));
        } else {
            handler.post(new RunnableC0099c(c0639g, 1, c0115g.f362a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m71I(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C1597i c1597i;
        char c2;
        C1602n c1602n = new C1602n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c1597i = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (XmlPullParserException e3) {
                    e3.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    c1597i = C1602n.m4762d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c1597i = C1602n.m4762d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c1597i = C1602n.m4762d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c1597i.f9103d.f9133a = true;
                                    break;
                                case 3:
                                    c1597i = C1602n.m4762d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c1597i.f9103d.f9148h0 = 1;
                                    break;
                                case 4:
                                    if (c1597i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1597i.f9101b.m4759a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c1597i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1597i.f9104e.m4760a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c1597i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1597i.f9103d.m4757a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c1597i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1597i.f9102c.m4758a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case Platform.GNU /* 9 */:
                                    if (c1597i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C1589a.m4739a(context, xmlResourceParser, c1597i.f9105f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f142h).put(identifier, c1602n);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                c1602n.f9207c.put(Integer.valueOf(c1597i.f9100a), c1597i);
                                c1597i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f142h).put(identifier, c1602n);
                return;
            }
        }
    }

    /* renamed from: J */
    public C0208p m72J(AbstractC0792W abstractC0792W, int i) {
        C0809g0 c0809g0;
        C0208p c0208p;
        C1201k c1201k = (C1201k) this.f141g;
        int m2868e = c1201k.m2868e(abstractC0792W);
        if (m2868e >= 0 && (c0809g0 = (C0809g0) c1201k.m2873j(m2868e)) != null) {
            int i2 = c0809g0.f4083a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c0809g0.f4083a = i3;
                if (i == 4) {
                    c0208p = c0809g0.f4084b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0208p = c0809g0.f4085c;
                }
                if ((i3 & 12) == 0) {
                    c1201k.m2872i(m2868e);
                    c0809g0.f4083a = 0;
                    c0809g0.f4084b = null;
                    c0809g0.f4085c = null;
                    C0809g0.f4082d.mo403c(c0809g0);
                }
                return c0208p;
            }
        }
        return null;
    }

    /* renamed from: K */
    public void m73K(AbstractC0792W abstractC0792W) {
        C0809g0 c0809g0 = (C0809g0) ((C1201k) this.f141g).getOrDefault(abstractC0792W, null);
        if (c0809g0 == null) {
            return;
        }
        c0809g0.f4083a &= -2;
    }

    /* renamed from: L */
    public void m74L(AbstractC0792W abstractC0792W) {
        C1195e c1195e = (C1195e) this.f142h;
        int m2859g = c1195e.m2859g() - 1;
        while (true) {
            if (m2859g < 0) {
                break;
            }
            if (abstractC0792W == c1195e.m2860h(m2859g)) {
                Object[] objArr = c1195e.f5393c;
                Object obj = objArr[m2859g];
                Object obj2 = C1195e.f5390e;
                if (obj != obj2) {
                    objArr[m2859g] = obj2;
                    c1195e.f5391a = true;
                }
            } else {
                m2859g--;
            }
        }
        C0809g0 c0809g0 = (C0809g0) ((C1201k) this.f141g).remove(abstractC0792W);
        if (c0809g0 != null) {
            c0809g0.f4083a = 0;
            c0809g0.f4084b = null;
            c0809g0.f4085c = null;
            C0809g0.f4082d.mo403c(c0809g0);
        }
    }

    @Override // p038T.InterfaceC0320n
    /* renamed from: a */
    public Object mo75a() {
        return (C0331y) this.f141g;
    }

    @Override // p098q0.InterfaceC1351r1
    /* renamed from: b */
    public void mo57b(final Bitmap bitmap) {
        switch (this.f140f) {
            case 19:
                Handler handler = ((C1653i) this.f142h).f9409b;
                final InterfaceC1351r1 interfaceC1351r1 = (InterfaceC1351r1) this.f141g;
                final int i = 0;
                handler.post(new Runnable() { // from class: x0.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                interfaceC1351r1.mo57b(bitmap);
                                break;
                            default:
                                interfaceC1351r1.mo57b(bitmap);
                                break;
                        }
                    }
                });
                break;
            default:
                Handler handler2 = ((C1656l) this.f142h).f9439b;
                final InterfaceC1351r1 interfaceC1351r12 = (InterfaceC1351r1) this.f141g;
                final int i2 = 1;
                handler2.post(new Runnable() { // from class: x0.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                interfaceC1351r12.mo57b(bitmap);
                                break;
                            default:
                                interfaceC1351r12.mo57b(bitmap);
                                break;
                        }
                    }
                });
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // p022K.InterfaceC0210q
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0221v0 mo18c(View view, C0221v0 c0221v0) {
        boolean z2;
        boolean z3;
        C0298o c0298o = (C0298o) this.f142h;
        int i = c0298o.f829a;
        C0125d c0125d = (C0125d) this.f141g;
        C0217t0 c0217t0 = c0221v0.f573a;
        C0058f mo654f = c0217t0.mo654f(7);
        C0058f mo654f2 = c0217t0.mo654f(32);
        int i2 = mo654f.f204b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0125d.f387b;
        bottomSheetBehavior.f3416w = i2;
        boolean m845f = AbstractC0294k.m845f(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f3408o;
        if (z4) {
            int m681a = c0221v0.m681a();
            bottomSheetBehavior.f3415v = m681a;
            paddingBottom = m681a + c0298o.f831c;
        }
        int i3 = c0298o.f830b;
        boolean z5 = bottomSheetBehavior.f3409p;
        int i4 = mo654f.f203a;
        if (z5) {
            paddingLeft = (m845f ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f3410q;
        int i5 = mo654f.f205c;
        if (z6) {
            if (!m845f) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f3412s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f3413t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f3414u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = mo654f.f204b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = c0125d.f386a;
                if (z3) {
                    bottomSheetBehavior.f3406m = mo654f2.f206d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.m2038I();
                }
                return c0221v0;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = c0125d.f386a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.m2038I();
        return c0221v0;
    }

    @Override // p038T.InterfaceC0320n
    /* renamed from: d */
    public boolean mo76d(CharSequence charSequence, int i, int i2, C0329w c0329w) {
        if ((c0329w.f934c & 4) > 0) {
            return true;
        }
        if (((C0331y) this.f141g) == null) {
            this.f141g = new C0331y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0355e) this.f142h).getClass();
        ((C0331y) this.f141g).setSpan(new C0330x(c0329w), i, i2, 33);
        return true;
    }

    /* renamed from: e */
    public void m77e(AbstractC0792W abstractC0792W, C0208p c0208p) {
        C1201k c1201k = (C1201k) this.f141g;
        C0809g0 c0809g0 = (C0809g0) c1201k.getOrDefault(abstractC0792W, null);
        if (c0809g0 == null) {
            c0809g0 = C0809g0.m2303a();
            c1201k.put(abstractC0792W, c0809g0);
        }
        c0809g0.f4085c = c0208p;
        c0809g0.f4083a |= 8;
    }

    /* renamed from: f */
    public void m78f(InterfaceC0553r interfaceC0553r) {
        ImageView imageView = (ImageView) this.f141g;
        if (imageView == null || interfaceC0553r == null) {
            return;
        }
        C1337n c1337n = new C1337n(5, this);
        carData cardata = (carData) this.f142h;
        carData.m1712X(cardata.f2468q, interfaceC0553r, c1337n);
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (Boolean) cardata.f2468q.m1395d();
        bool2.getClass();
        imageView.setVisibility(bool.equals(bool2) ? 0 : 4);
    }

    /* renamed from: i */
    public void m79i(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m79i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: j */
    public void m80j(boolean z2) {
        C0387O c0387o = (C0387O) this.f142h;
        AbstractActivityC0870i abstractActivityC0870i = c0387o.f1168t.f1385l;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0387o.f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m80j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: k */
    public void m81k(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m81k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: l */
    public void m82l(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m82l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: m */
    public void m83m(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m83m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: n */
    public void m84n(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m84n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: o */
    public void m85o(boolean z2) {
        C0387O c0387o = (C0387O) this.f142h;
        AbstractActivityC0870i abstractActivityC0870i = c0387o.f1168t.f1385l;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0387o.f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m85o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: p */
    public void m86p(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m86p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: q */
    public void m87q(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m87q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: r */
    public void m88r(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m88r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: s */
    public void m89s(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m89s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: t */
    public void m90t(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m90t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    public String toString() {
        switch (this.f140f) {
            case 2:
                return "Bounds{lower=" + ((C0058f) this.f141g) + " upper=" + ((C0058f) this.f142h) + "}";
            case 13:
                return ((Map) this.f141g).toString();
            case 15:
                String str = "[ ";
                if (((C1242f) this.f141g) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder m2942a = AbstractC1241e.m2942a(str);
                        m2942a.append(((C1242f) this.f141g).f5537h[i]);
                        m2942a.append(" ");
                        str = m2942a.toString();
                    }
                }
                return str + "] " + ((C1242f) this.f141g);
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m91u(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, View view, boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v2 != null) {
            abstractComponentCallbacksC0423v2.m1128k().f1160l.m91u(abstractComponentCallbacksC0423v, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
                C0387O c0387o = (C0387O) this.f142h;
                if (abstractComponentCallbacksC0423v == ((AbstractComponentCallbacksC0423v) c0198k.f533b)) {
                    C0043j c0043j = c0387o.f1160l;
                    synchronized (((CopyOnWriteArrayList) c0043j.f141g)) {
                        try {
                            int size = ((CopyOnWriteArrayList) c0043j.f141g).size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (((C0376D) ((CopyOnWriteArrayList) c0043j.f141g).get(i)).f1118a == c0198k) {
                                    ((CopyOnWriteArrayList) c0043j.f141g).remove(i);
                                    break;
                                }
                                i++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    C1375z1 c1375z1 = (C1375z1) c0198k.f535d;
                    FrameLayout frameLayout = (FrameLayout) c0198k.f534c;
                    c1375z1.getClass();
                    C1375z1.m3321j(view, frameLayout);
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: v */
    public void m92v(boolean z2) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0387O) this.f142h).f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            abstractComponentCallbacksC0423v.m1128k().f1160l.m92v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f141g).iterator();
        while (it.hasNext()) {
            C0376D c0376d = (C0376D) it.next();
            if (z2) {
                c0376d.getClass();
            } else {
                C0198k c0198k = c0376d.f1118a;
            }
        }
    }

    /* renamed from: w */
    public void m93w(int i) {
        int[] iArr = (int[]) this.f141g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f141g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f141g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f141g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: y */
    public View m94y(int i, int i2, int i3, int i4) {
        View m2245u;
        C0776F c0776f = (C0776F) this.f141g;
        int m2216d = c0776f.m2216d();
        int m2215c = c0776f.m2215c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0776f.f3926a) {
                case 0:
                    m2245u = c0776f.f3927b.m2245u(i);
                    break;
                default:
                    m2245u = c0776f.f3927b.m2245u(i);
                    break;
            }
            int m2214b = c0776f.m2214b(m2245u);
            int m2213a = c0776f.m2213a(m2245u);
            C0807f0 c0807f0 = (C0807f0) this.f142h;
            c0807f0.f4072b = m2216d;
            c0807f0.f4073c = m2215c;
            c0807f0.f4074d = m2214b;
            c0807f0.f4075e = m2213a;
            if (i3 != 0) {
                c0807f0.f4071a = i3;
                if (c0807f0.m2302a()) {
                    return m2245u;
                }
            }
            if (i4 != 0) {
                c0807f0.f4071a = i4;
                if (c0807f0.m2302a()) {
                    view = m2245u;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC0843o m95z(C1048a c1048a) {
        String str;
        InterfaceC0843o c0321o;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        Map map = (Map) this.f141g;
        Type type = c1048a.f4991b;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = c1048a.f4990a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        InterfaceC0843o interfaceC0843o = null;
        C0834f c0834f = EnumSet.class.isAssignableFrom(cls) ? new C0834f(type, 0) : cls == EnumMap.class ? new C0834f(type, 1) : null;
        if (c0834f != null) {
            return c0834f;
        }
        AbstractC0832d.m2355f((List) this.f142h);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                AbstractC1687o abstractC1687o = AbstractC0951c.f4566a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e2) {
                    str = "Failed making constructor '" + AbstractC0951c.m2491b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage() + AbstractC0951c.m2494e(e2);
                }
                c0321o = str != null ? new C0321o(str, 2) : new C0639g(23, declaredConstructor);
            } catch (NoSuchMethodException unused) {
            }
            if (c0321o == null) {
                return c0321o;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                interfaceC0843o = SortedSet.class.isAssignableFrom(cls) ? new C0355e(26) : Set.class.isAssignableFrom(cls) ? new C0355e(27) : Queue.class.isAssignableFrom(cls) ? new C0355e(28) : new C0355e(29);
            } else if (Map.class.isAssignableFrom(cls)) {
                interfaceC0843o = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C0833e(i2) : ConcurrentMap.class.isAssignableFrom(cls) ? new C0833e(i3) : SortedMap.class.isAssignableFrom(cls) ? new C0833e(i) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new C1048a(((ParameterizedType) type).getActualTypeArguments()[0]).f4990a)) ? new C0833e(4) : new C0833e(3);
            }
            if (interfaceC0843o != null) {
                return interfaceC0843o;
            }
            String m62h = m62h(cls);
            return m62h != null ? new C0321o(m62h, 1) : new C0639g(22, cls);
        }
        c0321o = null;
        if (c0321o == null) {
        }
    }

    public /* synthetic */ C0043j(Object obj, int i, Object obj2) {
        this.f140f = i;
        this.f141g = obj;
        this.f142h = obj2;
    }

    public /* synthetic */ C0043j(Object obj, Object obj2, int i, boolean z2) {
        this.f140f = i;
        this.f142h = obj;
        this.f141g = obj2;
    }

    public C0043j(ImageView imageView) {
        this.f140f = 16;
        this.f142h = carData.getInstance();
        this.f141g = imageView;
    }

    public C0043j(C1240d c1240d) {
        this.f140f = 15;
        this.f142h = c1240d;
    }

    public C0043j(C0387O c0387o) {
        this.f140f = 7;
        this.f141g = new CopyOnWriteArrayList();
        this.f142h = c0387o;
    }

    public C0043j(C0776F c0776f) {
        this.f140f = 11;
        this.f141g = c0776f;
        C0807f0 c0807f0 = new C0807f0();
        c0807f0.f4071a = 0;
        this.f142h = c0807f0;
    }

    public C0043j(Animation animation) {
        this.f140f = 6;
        this.f141g = animation;
        this.f142h = null;
    }

    public C0043j(Animator animator) {
        this.f140f = 6;
        this.f141g = null;
        this.f142h = animator;
    }

    public C0043j(ArrayList arrayList, ArrayList arrayList2) {
        this.f140f = 0;
        int size = arrayList.size();
        this.f141g = new int[size];
        this.f142h = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f141g)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f142h)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0043j(int i, int i2) {
        this.f140f = 0;
        this.f141g = new int[]{i, i2};
        this.f142h = new float[]{0.0f, 1.0f};
    }

    public C0043j(int i, int i2, int i3) {
        this.f140f = 0;
        this.f141g = new int[]{i, i2, i3};
        this.f142h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0043j(EditText editText) {
        this.f140f = 5;
        this.f141g = editText;
        C0347i c0347i = new C0347i(editText);
        this.f142h = c0347i;
        editText.addTextChangedListener(c0347i);
        if (C0339a.f970b == null) {
            synchronized (C0339a.f969a) {
                try {
                    if (C0339a.f970b == null) {
                        C0339a c0339a = new C0339a();
                        try {
                            C0339a.f971c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0339a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0339a.f970b = c0339a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0339a.f970b);
    }

    public C0043j(String str, String str2) {
        this.f140f = 8;
        this.f141g = str;
        this.f142h = str2 == null ? "" : str2;
    }

    public C0043j(int i) {
        this.f140f = i;
        switch (i) {
            case Platform.DRAGONFLYBSD /* 12 */:
                this.f141g = new C1201k();
                this.f142h = new C1195e();
                break;
            default:
                this.f141g = new SparseIntArray();
                this.f142h = new SparseIntArray();
                break;
        }
    }
}
