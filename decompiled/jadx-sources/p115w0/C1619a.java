package p115w0;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public final class C1619a {

    /* renamed from: e */
    public int f9255e;

    /* renamed from: f */
    public long f9256f;

    /* renamed from: b */
    public EnumC1620b f9252b = EnumC1620b.STAR;

    /* renamed from: c */
    public String f9253c = "";

    /* renamed from: d */
    public int f9254d = 0;

    /* renamed from: a */
    public String f9251a = UUID.randomUUID().toString();

    /* renamed from: a */
    public final JSONObject m4775a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f9251a);
        jSONObject.put("icon", this.f9252b.f9259a);
        String str = this.f9253c;
        if (str == null) {
            str = "";
        }
        jSONObject.put("text", str);
        jSONObject.put("type", this.f9254d == 1 ? "date" : "odo");
        if (this.f9254d == 1) {
            jSONObject.put("targetEpochDay", this.f9256f);
        } else {
            jSONObject.put("targetOdo", this.f9255e);
        }
        return jSONObject;
    }
}
