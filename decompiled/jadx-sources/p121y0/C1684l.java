package p121y0;

import org.json.JSONObject;

/* renamed from: y0.l */
/* loaded from: classes.dex */
public final class C1684l {

    /* renamed from: a */
    public final float f9599a;

    /* renamed from: b */
    public final float f9600b;

    /* renamed from: c */
    public float f9601c;

    /* renamed from: d */
    public int f9602d;

    /* renamed from: e */
    public long f9603e;

    public C1684l(float f2, float f3, float f4, int i, long j2) {
        this.f9599a = f2;
        this.f9600b = f3;
        this.f9601c = f4;
        this.f9602d = i;
        this.f9603e = j2;
    }

    /* renamed from: a */
    public final JSONObject m4906a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("odo", this.f9599a);
            jSONObject.put("from", this.f9600b);
            jSONObject.put("to", this.f9601c);
            int i = this.f9602d;
            if (i != 0) {
                jSONObject.put("tank", i);
            }
            long j2 = this.f9603e;
            if (j2 > 0) {
                jSONObject.put("t", j2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
