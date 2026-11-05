package p012E0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.altaysoft.t500_split.R;
import com.sun.jna.Function;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p004B0.AbstractC0051a;
import p010D1.AbstractC0088l;
import p034Q0.AbstractC0294k;

/* renamed from: E0.d */
/* loaded from: classes.dex */
public final class C0096d {

    /* renamed from: a */
    public final C0095c f316a;

    /* renamed from: b */
    public final C0095c f317b = new C0095c();

    /* renamed from: c */
    public final float f318c;

    /* renamed from: d */
    public final float f319d;

    /* renamed from: e */
    public final float f320e;

    /* renamed from: f */
    public final float f321f;

    /* renamed from: g */
    public final float f322g;

    /* renamed from: h */
    public final float f323h;

    /* renamed from: i */
    public final int f324i;

    /* renamed from: j */
    public final int f325j;

    /* renamed from: k */
    public final int f326k;

    public C0096d(Context context) {
        AttributeSet attributeSet;
        int i;
        int next;
        C0095c c0095c = new C0095c();
        int i2 = c0095c.f290a;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                i = asAttributeSet.getStyleAttribute();
                attributeSet = asAttributeSet;
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray m846g = AbstractC0294k.m846g(context, attributeSet, AbstractC0051a.f166a, R.attr.badgeStyle, i == 0 ? 2132018169 : i, new int[0]);
        Resources resources = context.getResources();
        this.f318c = m846g.getDimensionPixelSize(4, -1);
        this.f324i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f325j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f319d = m846g.getDimensionPixelSize(14, -1);
        this.f320e = m846g.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f322g = m846g.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f321f = m846g.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f323h = m846g.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f326k = m846g.getInt(24, 1);
        C0095c c0095c2 = this.f317b;
        int i3 = c0095c.f298i;
        c0095c2.f298i = i3 == -2 ? Function.USE_VARARGS : i3;
        int i4 = c0095c.f300k;
        if (i4 != -2) {
            c0095c2.f300k = i4;
        } else if (m846g.hasValue(23)) {
            this.f317b.f300k = m846g.getInt(23, 0);
        } else {
            this.f317b.f300k = -1;
        }
        String str = c0095c.f299j;
        if (str != null) {
            this.f317b.f299j = str;
        } else if (m846g.hasValue(7)) {
            this.f317b.f299j = m846g.getString(7);
        }
        C0095c c0095c3 = this.f317b;
        c0095c3.f304o = c0095c.f304o;
        CharSequence charSequence = c0095c.f305p;
        c0095c3.f305p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C0095c c0095c4 = this.f317b;
        int i5 = c0095c.f306q;
        c0095c4.f306q = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = c0095c.f307r;
        c0095c4.f307r = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = c0095c.f309t;
        c0095c4.f309t = Boolean.valueOf(bool == null || bool.booleanValue());
        C0095c c0095c5 = this.f317b;
        int i7 = c0095c.f301l;
        c0095c5.f301l = i7 == -2 ? m846g.getInt(21, -2) : i7;
        C0095c c0095c6 = this.f317b;
        int i8 = c0095c.f302m;
        c0095c6.f302m = i8 == -2 ? m846g.getInt(22, -2) : i8;
        C0095c c0095c7 = this.f317b;
        Integer num = c0095c.f294e;
        c0095c7.f294e = Integer.valueOf(num == null ? m846g.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C0095c c0095c8 = this.f317b;
        Integer num2 = c0095c.f295f;
        c0095c8.f295f = Integer.valueOf(num2 == null ? m846g.getResourceId(6, 0) : num2.intValue());
        C0095c c0095c9 = this.f317b;
        Integer num3 = c0095c.f296g;
        c0095c9.f296g = Integer.valueOf(num3 == null ? m846g.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C0095c c0095c10 = this.f317b;
        Integer num4 = c0095c.f297h;
        c0095c10.f297h = Integer.valueOf(num4 == null ? m846g.getResourceId(16, 0) : num4.intValue());
        C0095c c0095c11 = this.f317b;
        Integer num5 = c0095c.f291b;
        c0095c11.f291b = Integer.valueOf(num5 == null ? AbstractC0088l.m255B(context, m846g, 1).getDefaultColor() : num5.intValue());
        C0095c c0095c12 = this.f317b;
        Integer num6 = c0095c.f293d;
        c0095c12.f293d = Integer.valueOf(num6 == null ? m846g.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c0095c.f292c;
        if (num7 != null) {
            this.f317b.f292c = num7;
        } else if (m846g.hasValue(9)) {
            this.f317b.f292c = Integer.valueOf(AbstractC0088l.m255B(context, m846g, 9).getDefaultColor());
        } else {
            int intValue = this.f317b.f293d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, AbstractC0051a.f162A);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList m255B = AbstractC0088l.m255B(context, obtainStyledAttributes, 3);
            AbstractC0088l.m255B(context, obtainStyledAttributes, 4);
            AbstractC0088l.m255B(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i9, 0);
            obtainStyledAttributes.getString(i9);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC0088l.m255B(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, AbstractC0051a.f183r);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f317b.f292c = Integer.valueOf(m255B.getDefaultColor());
        }
        C0095c c0095c13 = this.f317b;
        Integer num8 = c0095c.f308s;
        c0095c13.f308s = Integer.valueOf(num8 == null ? m846g.getInt(2, 8388661) : num8.intValue());
        C0095c c0095c14 = this.f317b;
        Integer num9 = c0095c.f310u;
        c0095c14.f310u = Integer.valueOf(num9 == null ? m846g.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C0095c c0095c15 = this.f317b;
        Integer num10 = c0095c.f311v;
        c0095c15.f311v = Integer.valueOf(num10 == null ? m846g.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C0095c c0095c16 = this.f317b;
        Integer num11 = c0095c.f312w;
        c0095c16.f312w = Integer.valueOf(num11 == null ? m846g.getDimensionPixelOffset(18, 0) : num11.intValue());
        C0095c c0095c17 = this.f317b;
        Integer num12 = c0095c.f313x;
        c0095c17.f313x = Integer.valueOf(num12 == null ? m846g.getDimensionPixelOffset(25, 0) : num12.intValue());
        C0095c c0095c18 = this.f317b;
        Integer num13 = c0095c.f314y;
        c0095c18.f314y = Integer.valueOf(num13 == null ? m846g.getDimensionPixelOffset(19, c0095c18.f312w.intValue()) : num13.intValue());
        C0095c c0095c19 = this.f317b;
        Integer num14 = c0095c.f315z;
        c0095c19.f315z = Integer.valueOf(num14 == null ? m846g.getDimensionPixelOffset(26, c0095c19.f313x.intValue()) : num14.intValue());
        C0095c c0095c20 = this.f317b;
        Integer num15 = c0095c.f288C;
        c0095c20.f288C = Integer.valueOf(num15 == null ? m846g.getDimensionPixelOffset(20, 0) : num15.intValue());
        C0095c c0095c21 = this.f317b;
        Integer num16 = c0095c.f286A;
        c0095c21.f286A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C0095c c0095c22 = this.f317b;
        Integer num17 = c0095c.f287B;
        c0095c22.f287B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C0095c c0095c23 = this.f317b;
        Boolean bool2 = c0095c.f289D;
        c0095c23.f289D = Boolean.valueOf(bool2 == null ? m846g.getBoolean(0, false) : bool2.booleanValue());
        m846g.recycle();
        Locale locale = c0095c.f303n;
        if (locale == null) {
            this.f317b.f303n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f317b.f303n = locale;
        }
        this.f316a = c0095c;
    }
}
