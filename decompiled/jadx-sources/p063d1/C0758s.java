package p063d1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p069f1.AbstractC0832d;
import p069f1.C0838j;

/* renamed from: d1.s */
/* loaded from: classes.dex */
public final class C0758s extends AbstractC0754o {

    /* renamed from: a */
    public final Serializable f3889a;

    public C0758s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f3889a = bool;
    }

    /* renamed from: d */
    public static boolean m2199d(C0758s c0758s) {
        Serializable serializable = c0758s.f3889a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: a */
    public final BigInteger m2200a() {
        Serializable serializable = this.f3889a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m2199d(this)) {
            return BigInteger.valueOf(m2201b().longValue());
        }
        String m2202c = m2202c();
        AbstractC0832d.m2353d(m2202c);
        return new BigInteger(m2202c);
    }

    /* renamed from: b */
    public final Number m2201b() {
        Serializable serializable = this.f3889a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C0838j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: c */
    public final String m2202c() {
        Serializable serializable = this.f3889a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m2201b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0758s.class != obj.getClass()) {
            return false;
        }
        C0758s c0758s = (C0758s) obj;
        Serializable serializable = this.f3889a;
        Serializable serializable2 = c0758s.f3889a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m2199d(this) && m2199d(c0758s)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? m2200a().equals(c0758s.m2200a()) : m2201b().longValue() == c0758s.m2201b().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC0832d.m2358i(m2202c())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC0832d.m2358i(c0758s.m2202c())) == 0;
        }
        double doubleValue = serializable instanceof Number ? m2201b().doubleValue() : Double.parseDouble(m2202c());
        double doubleValue2 = serializable2 instanceof Number ? c0758s.m2201b().doubleValue() : Double.parseDouble(c0758s.m2202c());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f3889a;
        if (serializable == null) {
            return 31;
        }
        if (m2199d(this)) {
            doubleToLongBits = m2201b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m2201b().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public C0758s(Number number) {
        Objects.requireNonNull(number);
        this.f3889a = number;
    }

    public C0758s(String str) {
        Objects.requireNonNull(str);
        this.f3889a = str;
    }
}
