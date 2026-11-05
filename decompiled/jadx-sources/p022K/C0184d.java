package p022K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p006C.AbstractC0062j;
import p007C0.AbstractC0067a;

/* renamed from: K.d */
/* loaded from: classes.dex */
public final class C0184d implements InterfaceC0182c, InterfaceC0186e {

    /* renamed from: f */
    public final /* synthetic */ int f498f;

    /* renamed from: g */
    public Object f499g;

    /* renamed from: h */
    public int f500h;

    /* renamed from: i */
    public int f501i;

    /* renamed from: j */
    public Object f502j;

    /* renamed from: k */
    public Cloneable f503k;

    public /* synthetic */ C0184d() {
        this.f498f = 0;
    }

    /* renamed from: a */
    public void m538a(C0221v0 c0221v0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C0195i0) it.next()).f526a.mo582c() & 8) != 0) {
                ((View) this.f502j).setTranslationY(AbstractC0067a.m195c(this.f501i, 0, r3.f526a.mo581b()));
                return;
            }
        }
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: d */
    public ClipData mo539d() {
        return (ClipData) this.f499g;
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: f */
    public C0188f mo534f() {
        return new C0188f(new C0184d(this));
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: h */
    public int mo540h() {
        return this.f501i;
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: k */
    public ContentInfo mo541k() {
        return null;
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: l */
    public void mo535l(Bundle bundle) {
        this.f503k = bundle;
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: m */
    public void mo536m(Uri uri) {
        this.f502j = uri;
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: n */
    public int mo542n() {
        return this.f500h;
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: s */
    public void mo537s(int i) {
        this.f501i = i;
    }

    public String toString() {
        String str;
        switch (this.f498f) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f499g).getDescription());
                sb.append(", source=");
                int i = this.f500h;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f501i;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f502j;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0062j.m162p(sb, ((Bundle) this.f503k) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0184d(View view) {
        this.f498f = 2;
        this.f503k = new int[2];
        this.f502j = view;
    }

    public C0184d(C0184d c0184d) {
        this.f498f = 1;
        ClipData clipData = (ClipData) c0184d.f499g;
        clipData.getClass();
        this.f499g = clipData;
        int i = c0184d.f500h;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f500h = i;
            int i2 = c0184d.f501i;
            if ((i2 & 1) == i2) {
                this.f501i = i2;
                this.f502j = (Uri) c0184d.f502j;
                this.f503k = (Bundle) c0184d.f503k;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
