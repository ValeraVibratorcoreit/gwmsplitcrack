package com.airbnb.lottie.model;

import p020J.C0144b;

/* loaded from: classes.dex */
public class MutablePair<T> {
    T first;
    T second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0144b)) {
            return false;
        }
        C0144b c0144b = (C0144b) obj;
        return objectsEqual(c0144b.f449a, this.first) && objectsEqual(c0144b.f450b, this.second);
    }

    public int hashCode() {
        T t2 = this.first;
        int hashCode = t2 == null ? 0 : t2.hashCode();
        T t3 = this.second;
        return hashCode ^ (t3 != null ? t3.hashCode() : 0);
    }

    public void set(T t2, T t3) {
        this.first = t2;
        this.second = t3;
    }

    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }
}
