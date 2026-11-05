package p109u0;

import org.json.JSONObject;

/* renamed from: u0.m1 */
/* loaded from: classes.dex */
public final class C1557m1 {

    /* renamed from: a */
    public boolean f8397a = false;

    /* renamed from: b */
    public float f8398b = 180.0f;

    /* renamed from: c */
    public float f8399c = 16.0f;

    /* renamed from: d */
    public boolean f8400d = true;

    /* renamed from: e */
    public float f8401e = 40.0f;

    /* renamed from: f */
    public boolean f8402f = false;

    /* renamed from: g */
    public String f8403g = "#FFFF9800";

    /* renamed from: h */
    public String f8404h = "#FFFFFFFF";

    /* renamed from: i */
    public boolean f8405i = false;

    /* renamed from: j */
    public int f8406j = 100;

    /* renamed from: b */
    public static C1557m1 m4292b(JSONObject jSONObject) {
        C1557m1 c1557m1 = new C1557m1();
        if (jSONObject == null) {
            return c1557m1;
        }
        c1557m1.f8397a = jSONObject.optBoolean("enabled", false);
        c1557m1.f8398b = (float) jSONObject.optDouble("distancePx", 180.0d);
        c1557m1.f8399c = (float) jSONObject.optDouble("widthPx", 16.0d);
        c1557m1.f8400d = jSONObject.optBoolean("fullLength", true);
        c1557m1.f8401e = (float) jSONObject.optDouble("lengthDeg", 40.0d);
        c1557m1.f8402f = jSONObject.optBoolean("gradient", false);
        c1557m1.f8403g = jSONObject.optString("color", "#FFFF9800");
        c1557m1.f8404h = jSONObject.optString("color2", "#FFFFFFFF");
        c1557m1.f8405i = jSONObject.optBoolean("fade", false);
        c1557m1.f8406j = (int) Math.round(jSONObject.optDouble("opacity", 100.0d));
        c1557m1.m4293a();
        return c1557m1;
    }

    /* renamed from: a */
    public final void m4293a() {
        if (this.f8398b < 1.0f) {
            this.f8398b = 1.0f;
        }
        if (this.f8398b > 2000.0f) {
            this.f8398b = 2000.0f;
        }
        if (this.f8399c < 1.0f) {
            this.f8399c = 1.0f;
        }
        if (this.f8399c > 400.0f) {
            this.f8399c = 400.0f;
        }
        if (this.f8401e < 1.0f) {
            this.f8401e = 1.0f;
        }
        if (this.f8401e > 360.0f) {
            this.f8401e = 360.0f;
        }
        if (this.f8406j < 0) {
            this.f8406j = 0;
        }
        if (this.f8406j > 100) {
            this.f8406j = 100;
        }
        String str = this.f8403g;
        if (str == null || str.isEmpty()) {
            this.f8403g = "#FFFF9800";
        }
        String str2 = this.f8404h;
        if (str2 == null || str2.isEmpty()) {
            this.f8404h = "#FFFFFFFF";
        }
    }
}
