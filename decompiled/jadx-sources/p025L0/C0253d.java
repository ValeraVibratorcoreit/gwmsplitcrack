package p025L0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.altaysoft.t500_split.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p024L.C0235e;
import p024L.C0240j;
import p036S.AbstractC0302b;

/* renamed from: L0.d */
/* loaded from: classes.dex */
public final class C0253d extends AbstractC0302b {

    /* renamed from: q */
    public final /* synthetic */ Chip f635q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253d(Chip chip, Chip chip2) {
        super(chip2);
        this.f635q = chip;
    }

    @Override // p036S.AbstractC0302b
    /* renamed from: l */
    public final void mo739l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f3450B;
        Chip chip = this.f635q;
        if (chip.m2067c()) {
            C0255f c0255f = chip.f3454j;
            if (c0255f != null && c0255f.f661P) {
                z2 = true;
            }
            if (!z2 || chip.f3457m == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p036S.AbstractC0302b
    /* renamed from: o */
    public final void mo740o(int i, C0240j c0240j) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f3450B);
            return;
        }
        Chip chip = this.f635q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        c0240j.m730b(C0235e.f614e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
