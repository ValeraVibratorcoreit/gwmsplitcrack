package p076j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p067f.AbstractC0770a;
import p079k.ActionProviderVisibilityListenerC1021p;
import p079k.MenuC1018m;
import p082l.AbstractC1118h0;
import p123z.AbstractC1695c;

/* renamed from: j.h */
/* loaded from: classes.dex */
public final class C0959h extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f4617e;

    /* renamed from: f */
    public static final Class[] f4618f;

    /* renamed from: a */
    public final Object[] f4619a;

    /* renamed from: b */
    public final Object[] f4620b;

    /* renamed from: c */
    public final Context f4621c;

    /* renamed from: d */
    public Object f4622d;

    static {
        Class[] clsArr = {Context.class};
        f4617e = clsArr;
        f4618f = clsArr;
    }

    public C0959h(Context context) {
        super(context);
        this.f4621c = context;
        Object[] objArr = {context};
        this.f4619a = objArr;
        this.f4620b = objArr;
    }

    /* renamed from: a */
    public static Object m2500a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2500a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* renamed from: b */
    public final void m2501b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C0958g c0958g = new C0958g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0958g.f4592b = 0;
                        c0958g.f4593c = 0;
                        c0958g.f4594d = 0;
                        c0958g.f4595e = 0;
                        c0958g.f4596f = r4;
                        c0958g.f4597g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0958g.f4598h) {
                            ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p = c0958g.f4616z;
                            if (actionProviderVisibilityListenerC1021p == null || !actionProviderVisibilityListenerC1021p.f4886b.hasSubMenu()) {
                                c0958g.f4598h = r4;
                                c0958g.m2499b(c0958g.f4591a.add(c0958g.f4592b, c0958g.f4599i, c0958g.f4600j, c0958g.f4601k));
                            } else {
                                c0958g.f4598h = r4;
                                c0958g.m2499b(c0958g.f4591a.addSubMenu(c0958g.f4592b, c0958g.f4599i, c0958g.f4600j, c0958g.f4601k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r4;
                        z3 = z2;
                    }
                }
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0959h c0959h = c0958g.f4590E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0959h.f4621c.obtainStyledAttributes(attributeSet, AbstractC0770a.f3909p);
                        c0958g.f4592b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0958g.f4593c = obtainStyledAttributes.getInt(3, 0);
                        c0958g.f4594d = obtainStyledAttributes.getInt(4, 0);
                        c0958g.f4595e = obtainStyledAttributes.getInt(5, 0);
                        c0958g.f4596f = obtainStyledAttributes.getBoolean(2, r4);
                        c0958g.f4597g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0959h.f4621c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3910q);
                            c0958g.f4599i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0958g.f4600j = (obtainStyledAttributes2.getInt(5, c0958g.f4593c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0958g.f4594d) & 65535);
                            c0958g.f4601k = obtainStyledAttributes2.getText(7);
                            c0958g.f4602l = obtainStyledAttributes2.getText(8);
                            c0958g.f4603m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0958g.f4604n = string == null ? (char) 0 : string.charAt(0);
                            c0958g.f4605o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0958g.f4606p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0958g.f4607q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0958g.f4608r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0958g.f4608r = c0958g.f4595e;
                            }
                            c0958g.f4609s = obtainStyledAttributes2.getBoolean(3, false);
                            c0958g.f4610t = obtainStyledAttributes2.getBoolean(4, c0958g.f4596f);
                            c0958g.f4611u = obtainStyledAttributes2.getBoolean(1, c0958g.f4597g);
                            c0958g.f4612v = obtainStyledAttributes2.getInt(21, -1);
                            c0958g.f4615y = obtainStyledAttributes2.getString(12);
                            c0958g.f4613w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0958g.f4614x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0958g.f4613w == 0 && c0958g.f4614x == null) {
                                c0958g.f4616z = (ActionProviderVisibilityListenerC1021p) c0958g.m2498a(string3, f4618f, c0959h.f4620b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0958g.f4616z = null;
                            }
                            c0958g.f4586A = obtainStyledAttributes2.getText(17);
                            c0958g.f4587B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0958g.f4589D = AbstractC1118h0.m2730b(obtainStyledAttributes2.getInt(19, -1), c0958g.f4589D);
                            } else {
                                c0958g.f4589D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1695c.m4959b(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0958g.f4588C = colorStateList;
                            } else {
                                c0958g.f4588C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0958g.f4598h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0958g.f4598h = true;
                            SubMenu addSubMenu = c0958g.f4591a.addSubMenu(c0958g.f4592b, c0958g.f4599i, c0958g.f4600j, c0958g.f4601k);
                            c0958g.m2499b(addSubMenu.getItem());
                            m2501b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    }
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            i = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC1018m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f4621c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC1018m) {
                    MenuC1018m menuC1018m = (MenuC1018m) menu;
                    if (!menuC1018m.f4844p) {
                        menuC1018m.m2627w();
                        z2 = true;
                    }
                }
                m2501b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC1018m) menu).m2626v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC1018m) menu).m2626v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
