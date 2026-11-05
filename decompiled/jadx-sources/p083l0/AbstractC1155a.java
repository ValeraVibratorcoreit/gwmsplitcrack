package p083l0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p091o.C1192b;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1155a {

    /* renamed from: a */
    public final C1192b f5296a;

    /* renamed from: b */
    public final C1192b f5297b;

    /* renamed from: c */
    public final C1192b f5298c;

    public AbstractC1155a(C1192b c1192b, C1192b c1192b2, C1192b c1192b3) {
        this.f5296a = c1192b;
        this.f5297b = c1192b2;
        this.f5298c = c1192b3;
    }

    /* renamed from: a */
    public abstract C1156b mo2777a();

    /* renamed from: b */
    public final Class m2778b(Class cls) {
        String name = cls.getName();
        C1192b c1192b = this.f5298c;
        Class cls2 = (Class) c1192b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1192b.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m2779c(String str) {
        C1192b c1192b = this.f5296a;
        Method method = (Method) c1192b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1155a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1155a.class);
        c1192b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final Method m2780d(Class cls) {
        String name = cls.getName();
        C1192b c1192b = this.f5297b;
        Method method = (Method) c1192b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class m2778b = m2778b(cls);
        System.currentTimeMillis();
        Method declaredMethod = m2778b.getDeclaredMethod("write", cls, AbstractC1155a.class);
        c1192b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo2781e(int i);

    /* renamed from: f */
    public final Parcelable m2782f(Parcelable parcelable, int i) {
        if (!mo2781e(i)) {
            return parcelable;
        }
        return ((C1156b) this).f5300e.readParcelable(C1156b.class.getClassLoader());
    }

    /* renamed from: g */
    public final InterfaceC1157c m2783g() {
        String readString = ((C1156b) this).f5300e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1157c) m2779c(readString).invoke(null, mo2777a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* renamed from: h */
    public abstract void mo2784h(int i);

    /* renamed from: i */
    public final void m2785i(InterfaceC1157c interfaceC1157c) {
        if (interfaceC1157c == null) {
            ((C1156b) this).f5300e.writeString(null);
            return;
        }
        try {
            ((C1156b) this).f5300e.writeString(m2778b(interfaceC1157c.getClass()).getName());
            C1156b mo2777a = mo2777a();
            try {
                m2780d(interfaceC1157c.getClass()).invoke(null, interfaceC1157c, mo2777a);
                int i = mo2777a.f5304i;
                if (i >= 0) {
                    int i2 = mo2777a.f5299d.get(i);
                    Parcel parcel = mo2777a.f5300e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(interfaceC1157c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
