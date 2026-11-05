package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p034Q0.AbstractC0293j;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C0685a extends AbstractC0293j {

    /* renamed from: f */
    public final /* synthetic */ ChipTextInputComboView f3755f;

    public C0685a(ChipTextInputComboView chipTextInputComboView) {
        this.f3755f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f3755f;
        if (isEmpty) {
            chipTextInputComboView.f3723f.setText(ChipTextInputComboView.m2141a(chipTextInputComboView, "00"));
            return;
        }
        String m2141a = ChipTextInputComboView.m2141a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f3723f;
        if (TextUtils.isEmpty(m2141a)) {
            m2141a = ChipTextInputComboView.m2141a(chipTextInputComboView, "00");
        }
        chip.setText(m2141a);
    }
}
