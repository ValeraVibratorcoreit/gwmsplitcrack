package p121y0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: y0.m */
/* loaded from: classes.dex */
public final class C1685m {

    /* renamed from: b */
    public long f9605b;

    /* renamed from: c */
    public long f9606c;

    /* renamed from: d */
    public long f9607d;

    /* renamed from: e */
    public float f9608e;

    /* renamed from: f */
    public float f9609f;

    /* renamed from: g */
    public float f9610g;

    /* renamed from: h */
    public long f9611h;

    /* renamed from: i */
    public float f9612i;

    /* renamed from: j */
    public float f9613j;

    /* renamed from: k */
    public boolean f9614k;

    /* renamed from: a */
    public String f9604a = UUID.randomUUID().toString();

    /* renamed from: l */
    public final ArrayList f9615l = new ArrayList();

    /* renamed from: a */
    public final void m4907a() {
        this.f9610g = Math.max(0.0f, this.f9609f - this.f9608e);
        long j2 = this.f9606c;
        if (j2 <= 0) {
            j2 = System.currentTimeMillis();
        }
        long max = Math.max(0L, j2 - this.f9605b);
        this.f9611h = max;
        if (max > 0) {
            this.f9612i = this.f9610g / (max / 3600000.0f);
        } else {
            this.f9612i = 0.0f;
        }
    }

    /* renamed from: b */
    public final JSONObject m4908b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f9604a);
            jSONObject.put("start", this.f9605b);
            jSONObject.put("end", this.f9606c);
            jSONObject.put("lastMove", this.f9607d);
            jSONObject.put("odoStart", this.f9608e);
            jSONObject.put("odoEnd", this.f9609f);
            jSONObject.put("km", this.f9610g);
            jSONObject.put("durationMs", this.f9611h);
            jSONObject.put("avgSpeed", this.f9612i);
            jSONObject.put("fuelL", this.f9613j);
            jSONObject.put("completed", this.f9614k);
            ArrayList arrayList = this.f9615l;
            if (!arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1684l c1684l = (C1684l) it.next();
                    if (c1684l != null) {
                        jSONArray.put(c1684l.m4906a());
                    }
                }
                jSONObject.put("refuels", jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
