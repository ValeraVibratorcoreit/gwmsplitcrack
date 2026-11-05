package p019I0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.altaysoft.t500_split.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.C0670k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p022K.C0180b;
import p024L.C0239i;
import p024L.C0240j;

/* renamed from: I0.e */
/* loaded from: classes.dex */
public final class C0141e extends C0180b {

    /* renamed from: d */
    public final /* synthetic */ int f442d;

    /* renamed from: e */
    public final /* synthetic */ Object f443e;

    public /* synthetic */ C0141e(int i, Object obj) {
        this.f442d = i;
        this.f443e = obj;
    }

    @Override // p022K.C0180b
    /* renamed from: c */
    public void mo399c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f442d) {
            case 1:
                super.mo399c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f443e).f3560i);
                break;
            default:
                super.mo399c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p022K.C0180b
    /* renamed from: d */
    public final void mo400d(View view, C0240j c0240j) {
        Object obj = this.f443e;
        View.AccessibilityDelegate accessibilityDelegate = this.f491a;
        switch (this.f442d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0240j.f627a);
                int i = MaterialButtonToggleGroup.f3436p;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int i2 = -1;
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i3) == view) {
                                i2 = i4;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.m2056c(i3)) {
                                    i4++;
                                }
                                i3++;
                            }
                        }
                    }
                }
                c0240j.m735h(C0239i.m727a(((MaterialButton) view).f3433t, 0, 1, i2, 1));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f3561j);
                accessibilityNodeInfo.setChecked(checkableImageButton.f3560i);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0240j.f627a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f3566C);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0240j.f627a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                C0670k c0670k = (C0670k) obj;
                accessibilityNodeInfo3.setHintText(c0670k.f3508k0.getVisibility() == 0 ? c0670k.m1130m(R.string.mtrl_picker_toggle_to_year_selection) : c0670k.m1130m(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }
}
