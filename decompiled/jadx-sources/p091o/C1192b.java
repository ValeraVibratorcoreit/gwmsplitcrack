package p091o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b */
/* loaded from: classes.dex */
public final class C1192b extends C1201k implements Map {

    /* renamed from: h */
    public C1191a f5376h;

    public C1192b(C1201k c1201k) {
        int i = c1201k.f5418c;
        m2866b(i);
        if (this.f5418c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c1201k.m2871h(i2), c1201k.m2873j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c1201k.f5416a, 0, this.f5416a, 0, i);
            System.arraycopy(c1201k.f5417b, 0, this.f5417b, 0, i << 1);
            this.f5418c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f5376h == null) {
            this.f5376h = new C1191a(0, this);
        }
        C1191a c1191a = this.f5376h;
        if (c1191a.f5371a == null) {
            c1191a.f5371a = new C1198h(c1191a, 0);
        }
        return c1191a.f5371a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f5376h == null) {
            this.f5376h = new C1191a(0, this);
        }
        C1191a c1191a = this.f5376h;
        if (c1191a.f5372b == null) {
            c1191a.f5372b = new C1198h(c1191a, 1);
        }
        return c1191a.f5372b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2866b(map.size() + this.f5418c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f5376h == null) {
            this.f5376h = new C1191a(0, this);
        }
        C1191a c1191a = this.f5376h;
        if (c1191a.f5373c == null) {
            c1191a.f5373c = new C1200j(c1191a);
        }
        return c1191a.f5373c;
    }
}
