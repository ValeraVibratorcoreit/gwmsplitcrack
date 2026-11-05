package p036S;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.chip.Chip;
import com.jcraft.jsch.SftpATTRS;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p024L.C0240j;
import p025L0.C0253d;

/* renamed from: S.a */
/* loaded from: classes.dex */
public final class C0301a extends C0639g {

    /* renamed from: i */
    public final /* synthetic */ AbstractC0302b f834i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301a(AbstractC0302b abstractC0302b) {
        super(7);
        this.f834i = abstractC0302b;
    }

    @Override // com.altaysoft.t500_split.media.C0639g
    /* renamed from: A */
    public final boolean mo848A(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC0302b abstractC0302b = this.f834i;
        Chip chip = abstractC0302b.f843i;
        if (i == -1) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        boolean z2 = true;
        if (i2 == 1) {
            return abstractC0302b.m855p(i);
        }
        if (i2 == 2) {
            return abstractC0302b.m851j(i);
        }
        boolean z3 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = abstractC0302b.f842h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = abstractC0302b.f845k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    abstractC0302b.f845k = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                    abstractC0302b.f843i.invalidate();
                    abstractC0302b.m856q(i3, 65536);
                }
                abstractC0302b.f845k = i;
                chip.invalidate();
                abstractC0302b.m856q(i, 32768);
            }
            z2 = false;
        } else {
            if (i2 != 128) {
                C0253d c0253d = (C0253d) abstractC0302b;
                if (i2 != 16) {
                    return false;
                }
                Chip chip2 = c0253d.f635q;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f3457m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f3468x) {
                    return z3;
                }
                chip2.f3467w.m856q(1, 1);
                return z3;
            }
            if (abstractC0302b.f845k == i) {
                abstractC0302b.f845k = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                chip.invalidate();
                abstractC0302b.m856q(i, 65536);
            }
            z2 = false;
        }
        return z2;
    }

    @Override // com.altaysoft.t500_split.media.C0639g
    /* renamed from: t */
    public final C0240j mo849t(int i) {
        return new C0240j(AccessibilityNodeInfo.obtain(this.f834i.m854n(i).f627a));
    }

    @Override // com.altaysoft.t500_split.media.C0639g
    /* renamed from: v */
    public final C0240j mo850v(int i) {
        AbstractC0302b abstractC0302b = this.f834i;
        int i2 = i == 2 ? abstractC0302b.f845k : abstractC0302b.f846l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo849t(i2);
    }
}
