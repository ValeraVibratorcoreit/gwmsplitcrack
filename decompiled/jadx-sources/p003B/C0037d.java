package p003B;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.altaysoft.t500_split.splitinfo.SkinAnalogClockView;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.xmlpull.v1.XmlPullParserException;
import p098q0.InterfaceC1351r1;
import p120y.AbstractC1672a;

/* renamed from: B.d */
/* loaded from: classes.dex */
public final class C0037d implements InterfaceC1351r1 {

    /* renamed from: f */
    public int f126f;

    /* renamed from: g */
    public final Object f127g;

    /* renamed from: h */
    public final Object f128h;

    public C0037d(Shader shader, ColorStateList colorStateList, int i) {
        this.f127g = shader;
        this.f128h = colorStateList;
        this.f126f = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0037d m56a(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList m55b = AbstractC0036c.m55b(resources, xml, asAttributeSet, theme);
                return new C0037d((Shader) null, m55b, m55b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray m46f = AbstractC0035b.m46f(resources, theme, asAttributeSet, AbstractC1672a.f9543d);
        float f7 = !AbstractC0035b.m43c(xml, "startX") ? 0.0f : m46f.getFloat(8, 0.0f);
        float f8 = !AbstractC0035b.m43c(xml, "startY") ? 0.0f : m46f.getFloat(9, 0.0f);
        float f9 = !AbstractC0035b.m43c(xml, "endX") ? 0.0f : m46f.getFloat(10, 0.0f);
        float f10 = !AbstractC0035b.m43c(xml, "endY") ? 0.0f : m46f.getFloat(11, 0.0f);
        float f11 = !AbstractC0035b.m43c(xml, "centerX") ? 0.0f : m46f.getFloat(3, 0.0f);
        float f12 = !AbstractC0035b.m43c(xml, "centerY") ? 0.0f : m46f.getFloat(4, 0.0f);
        int i4 = !AbstractC0035b.m43c(xml, "type") ? 0 : m46f.getInt(2, 0);
        int color = !AbstractC0035b.m43c(xml, "startColor") ? 0 : m46f.getColor(0, 0);
        boolean m43c = AbstractC0035b.m43c(xml, "centerColor");
        int color2 = !AbstractC0035b.m43c(xml, "centerColor") ? 0 : m46f.getColor(7, 0);
        int color3 = !AbstractC0035b.m43c(xml, "endColor") ? 0 : m46f.getColor(1, 0);
        if (AbstractC0035b.m43c(xml, "tileMode")) {
            f2 = f11;
            i2 = m46f.getInt(6, 0);
        } else {
            f2 = f11;
            i2 = 0;
        }
        if (AbstractC0035b.m43c(xml, "gradientRadius")) {
            f3 = f12;
            f4 = m46f.getFloat(5, 0.0f);
        } else {
            f3 = f12;
            f4 = 0.0f;
        }
        m46f.recycle();
        int depth = xml.getDepth() + 1;
        float f13 = f4;
        ArrayList arrayList = new ArrayList(20);
        float f14 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f9;
            if (next2 == 1) {
                f6 = f8;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f8;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray m46f2 = AbstractC0035b.m46f(resources, theme, asAttributeSet, AbstractC1672a.f9544e);
                boolean hasValue = m46f2.hasValue(0);
                boolean hasValue2 = m46f2.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = m46f2.getColor(0, 0);
                float f15 = m46f2.getFloat(1, 0.0f);
                m46f2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f15));
            }
            f9 = f5;
            f8 = f6;
        }
        C0043j c0043j = arrayList2.size() > 0 ? new C0043j(arrayList2, arrayList) : null;
        if (c0043j == null) {
            c0043j = m43c ? new C0043j(color, color2, color3) : new C0043j(color, color3);
        }
        if (i4 == 1) {
            float f16 = f2;
            float f17 = f3;
            i3 = 0;
            if (f13 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f16, f17, f13, (int[]) c0043j.f141g, (float[]) c0043j.f142h, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i4 != 2) {
            i3 = 0;
            radialGradient = new LinearGradient(f7, f6, f5, f14, (int[]) c0043j.f141g, (float[]) c0043j.f142h, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i3 = 0;
            radialGradient = new SweepGradient(f2, f3, (int[]) c0043j.f141g, (float[]) c0043j.f142h);
        }
        return new C0037d(radialGradient, (ColorStateList) null, i3);
    }

    @Override // p098q0.InterfaceC1351r1
    /* renamed from: b */
    public void mo57b(Bitmap bitmap) {
        if (this.f126f != ((SkinAnalogClockView) this.f128h).f3228l) {
            return;
        }
        ((Consumer) this.f127g).accept(bitmap);
    }

    /* renamed from: c */
    public boolean m58c() {
        ColorStateList colorStateList;
        return ((Shader) this.f127g) == null && (colorStateList = (ColorStateList) this.f128h) != null && colorStateList.isStateful();
    }

    public C0037d(SkinAnalogClockView skinAnalogClockView, int i, Consumer consumer) {
        this.f128h = skinAnalogClockView;
        this.f126f = i;
        this.f127g = consumer;
    }
}
