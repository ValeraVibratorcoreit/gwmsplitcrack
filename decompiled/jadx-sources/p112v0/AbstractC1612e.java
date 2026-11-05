package p112v0;

import android.app.Dialog;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import p010D1.AbstractC0088l;
import p098q0.RunnableC1290W;
import p098q0.RunnableC1320h0;

/* renamed from: v0.e */
/* loaded from: classes.dex */
public abstract class AbstractC1612e {

    /* renamed from: a */
    public static Dialog f9237a;

    /* renamed from: b */
    public static MainActivity f9238b;

    /* renamed from: c */
    public static RunnableC1320h0 f9239c;

    /* renamed from: d */
    public static View f9240d;

    /* renamed from: e */
    public static boolean f9241e;

    /* renamed from: f */
    public static EnumC1609b f9242f;

    /* renamed from: g */
    public static int f9243g;

    /* renamed from: h */
    public static final Handler f9244h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public static final RunnableC1290W f9245i = new RunnableC1290W(3);

    /* renamed from: a */
    public static void m4769a() {
        Dialog dialog = f9237a;
        if (dialog != null) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
            }
        }
        f9237a = null;
        f9240d = null;
    }

    /* renamed from: b */
    public static void m4770b(MainActivity mainActivity, EnumC1609b enumC1609b) {
        f9238b = mainActivity;
        f9241e = true;
        f9242f = enumC1609b;
        f9243g = 0;
        m4769a();
        AbstractC0088l.m264Y(mainActivity, enumC1609b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* renamed from: c */
    public static void m4771c(MainActivity mainActivity) {
        View view = f9240d;
        if (view == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.perm_list_container);
        linearLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(mainActivity);
        ArrayList arrayList = new ArrayList(EnumC1609b.values().length);
        ?? r6 = 0;
        for (EnumC1609b enumC1609b : EnumC1609b.values()) {
            if (AbstractC0088l.m262U(enumC1609b)) {
                arrayList.add(new C1608a(enumC1609b, AbstractC0088l.m261T(mainActivity, enumC1609b)));
            }
        }
        int round = Math.round(8 * mainActivity.getResources().getDisplayMetrics().density);
        ViewGroup viewGroup = null;
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i % 5;
            ViewGroup viewGroup2 = viewGroup;
            if (i2 == 0) {
                LinearLayout linearLayout2 = new LinearLayout(mainActivity);
                linearLayout2.setOrientation(r6);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = round;
                linearLayout2.setLayoutParams(layoutParams);
                linearLayout.addView(linearLayout2);
                viewGroup2 = linearLayout2;
            }
            C1608a c1608a = (C1608a) arrayList.get(i);
            View inflate = from.inflate(R.layout.item_permission_setup_cell, viewGroup2, (boolean) r6);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(r6, -2, 1.0f);
            if (i2 > 0) {
                layoutParams2.setMarginStart(round / 2);
            }
            if (i2 < 4) {
                layoutParams2.setMarginEnd(round / 2);
            }
            inflate.setLayoutParams(layoutParams2);
            TextView textView = (TextView) inflate.findViewById(R.id.perm_status);
            TextView textView2 = (TextView) inflate.findViewById(R.id.perm_title);
            TextView textView3 = (TextView) inflate.findViewById(R.id.perm_desc);
            AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(R.id.btn_perm_settings);
            textView.setText(c1608a.f9221b ? "✓" : "✗");
            boolean z2 = c1608a.f9221b;
            textView.setTextColor(mainActivity.getColor(z2 ? R.color.perm_granted : R.color.perm_missing));
            EnumC1609b enumC1609b2 = c1608a.f9220a;
            boolean z3 = enumC1609b2.f9230c;
            int i3 = enumC1609b2.f9228a;
            if (z3) {
                textView2.setText(i3);
            } else {
                textView2.setText(mainActivity.getString(i3) + " " + mainActivity.getString(R.string.perm_optional_tag));
            }
            textView3.setText(enumC1609b2.f9229b);
            textView3.setEllipsize(null);
            Paint.FontMetricsInt fontMetricsInt = textView3.getPaint().getFontMetricsInt();
            textView3.setLineHeight(fontMetricsInt.bottom - fontMetricsInt.top);
            appCompatButton.setEnabled(!z2);
            appCompatButton.setAlpha(z2 ? 0.45f : 1.0f);
            appCompatButton.setTag(enumC1609b2);
            appCompatButton.setOnClickListener(new ViewOnClickListenerC1610c(mainActivity, 1));
            viewGroup2.addView(inflate);
            i++;
            r6 = 0;
            viewGroup = viewGroup2;
        }
        int size = arrayList.size() % 5;
        if (size != 0 && viewGroup != null) {
            while (size < 5) {
                View view2 = new View(mainActivity);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0, 1.0f);
                if (size > 0) {
                    layoutParams3.setMarginStart(round / 2);
                }
                viewGroup.addView(view2, layoutParams3);
                size++;
            }
        }
        AppCompatButton appCompatButton2 = (AppCompatButton) f9240d.findViewById(R.id.btn_perm_continue);
        boolean m266d = AbstractC0088l.m266d(mainActivity);
        appCompatButton2.setEnabled(m266d);
        appCompatButton2.setAlpha(m266d ? 1.0f : 0.45f);
    }

    /* renamed from: d */
    public static void m4772d(MainActivity mainActivity) {
        if (f9239c == null) {
            return;
        }
        m4769a();
        f9240d = LayoutInflater.from(mainActivity).inflate(R.layout.dialog_permissions_setup, (ViewGroup) null);
        Dialog dialog = new Dialog(mainActivity, R.style.T500Split_Dialog);
        dialog.setContentView(f9240d);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        ((AppCompatButton) f9240d.findViewById(R.id.btn_perm_continue)).setOnClickListener(new ViewOnClickListenerC1610c(mainActivity, 0));
        f9237a = dialog;
        m4771c(mainActivity);
        try {
            dialog.show();
            Window window = dialog.getWindow();
            if (window == null) {
                return;
            }
            window.setBackgroundDrawableResource(android.R.color.transparent);
            int round = Math.round(mainActivity.getResources().getDisplayMetrics().widthPixels * 0.92f);
            window.setLayout(round, -2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = round;
            window.setAttributes(attributes);
        } catch (Exception unused) {
        }
    }
}
