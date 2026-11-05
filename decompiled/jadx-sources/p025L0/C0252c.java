package p025L0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: L0.c */
/* loaded from: classes.dex */
public final class C0252c extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f634a;

    public C0252c(Chip chip) {
        this.f634a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0255f c0255f = this.f634a.f3454j;
        if (c0255f != null) {
            c0255f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
