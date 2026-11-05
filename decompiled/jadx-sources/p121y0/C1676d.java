package p121y0;

import org.json.JSONObject;

/* renamed from: y0.d */
/* loaded from: classes.dex */
public final class C1676d {

    /* renamed from: a */
    public String f9557a;

    /* renamed from: b */
    public long f9558b;

    /* renamed from: c */
    public float f9559c;

    /* renamed from: d */
    public float f9560d;

    /* renamed from: e */
    public float f9561e;

    /* renamed from: f */
    public float f9562f;

    /* renamed from: g */
    public int f9563g;

    /* renamed from: a */
    public final JSONObject m4842a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f9557a);
            jSONObject.put("t", this.f9558b);
            jSONObject.put("from", this.f9559c);
            jSONObject.put("to", this.f9560d);
            jSONObject.put("l", this.f9561e);
            jSONObject.put("odo", this.f9562f);
            int i = this.f9563g;
            if (i != 0) {
                jSONObject.put("tank", i);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
