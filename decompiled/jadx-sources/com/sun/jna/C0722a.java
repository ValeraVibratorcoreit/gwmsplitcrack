package com.sun.jna;

import java.util.List;

/* renamed from: com.sun.jna.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0722a implements java.util.function.Function {

    /* renamed from: a */
    public final /* synthetic */ int f3827a;

    /* renamed from: b */
    public final /* synthetic */ Object f3828b;

    public /* synthetic */ C0722a(int i, Object obj) {
        this.f3827a = i;
        this.f3828b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        List lambda$fieldOrder$1;
        Boolean lambda$validateFields$2;
        List lambda$getFieldList$0;
        switch (this.f3827a) {
            case 0:
                lambda$fieldOrder$1 = ((Structure) this.f3828b).lambda$fieldOrder$1((Class) obj);
                return lambda$fieldOrder$1;
            case 1:
                lambda$validateFields$2 = ((Structure) this.f3828b).lambda$validateFields$2((Class) obj);
                return lambda$validateFields$2;
            default:
                lambda$getFieldList$0 = Structure.lambda$getFieldList$0((Class) this.f3828b, (Class) obj);
                return lambda$getFieldList$0;
        }
    }
}
