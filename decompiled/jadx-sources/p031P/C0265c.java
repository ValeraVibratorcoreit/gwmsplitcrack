package p031P;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.altaysoft.t500_split.media.C0639g;
import p022K.AbstractC0169Q;
import p022K.C0184d;
import p022K.InterfaceC0182c;
import p082l.C1145v;

/* renamed from: P.c */
/* loaded from: classes.dex */
public final class C0265c extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0264b f702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0265c(InputConnection inputConnection, C0264b c0264b) {
        super(inputConnection, false);
        this.f702a = c0264b;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0182c interfaceC0182c;
        C0639g c0639g = inputContentInfo == null ? null : new C0639g(9, new C0639g(8, inputContentInfo));
        C0264b c0264b = this.f702a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C0639g) c0639g.f3011g).f3011g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0639g) c0639g.f3011g).f3011g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((C0639g) c0639g.f3011g).f3011g).getDescription();
        C0639g c0639g2 = (C0639g) c0639g.f3011g;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) c0639g2.f3011g).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0182c = new C0639g(clipData, 2);
        } else {
            C0184d c0184d = new C0184d();
            c0184d.f499g = clipData;
            c0184d.f500h = 2;
            interfaceC0182c = c0184d;
        }
        interfaceC0182c.mo536m(((InputContentInfo) c0639g2.f3011g).getLinkUri());
        interfaceC0182c.mo535l(bundle2);
        if (AbstractC0169Q.m501f((C1145v) c0264b.f701f, interfaceC0182c.mo534f()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
