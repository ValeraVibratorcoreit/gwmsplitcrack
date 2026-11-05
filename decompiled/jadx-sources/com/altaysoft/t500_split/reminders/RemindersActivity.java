package com.altaysoft.t500_split.reminders;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import com.sun.jna.Function;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.RunnableC0005B;
import p001A0.ViewOnClickListenerC0027u;
import p016H.C0117i;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.ViewOnClickListenerC1326j0;
import p101r0.C1392n;
import p115w0.C1619a;
import p115w0.C1629k;
import p115w0.C1632n;
import p115w0.C1633o;
import p115w0.EnumC1620b;
import p115w0.RunnableC1624f;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* loaded from: classes.dex */
public class RemindersActivity extends AbstractActivityC0870i {

    /* renamed from: I */
    public static final /* synthetic */ int f3106I = 0;

    /* renamed from: F */
    public C1632n f3108F;

    /* renamed from: G */
    public ListView f3109G;

    /* renamed from: E */
    public final ArrayList f3107E = new ArrayList();

    /* renamed from: H */
    public int f3110H = -1;

    /* renamed from: u */
    public static void m1948u(AppCompatButton appCompatButton, long j2) {
        appCompatButton.setText(LocalDate.ofEpochDay(j2).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault())));
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 0;
        super.onCreate(bundle);
        final int i2 = 2;
        if (cfgData.m1784i().f2513E3 == 2 || AbstractC1372y1.m3299e("allapps")) {
            finish();
            return;
        }
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_reminders);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C1392n c1392n = new C1392n(7);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c1392n);
        ArrayList arrayList = this.f3107E;
        arrayList.addAll(AbstractC1687o.m4911D(this));
        AbstractC1680h.m4858T(arrayList, carData.getInstance().m1771r());
        this.f3109G = (ListView) findViewById(R.id.reminders_list);
        C1632n c1632n = new C1632n(this, 0);
        this.f3108F = c1632n;
        this.f3109G.setAdapter((ListAdapter) c1632n);
        this.f3109G.setOnItemClickListener(new C1629k(this, 0));
        findViewById(R.id.btn_reminder_close).setOnClickListener(new View.OnClickListener(this) { // from class: w0.l

            /* renamed from: g */
            public final /* synthetic */ RemindersActivity f9296g;

            {
                this.f9296g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1619a c1619a = null;
                RemindersActivity remindersActivity = this.f9296g;
                switch (i) {
                    case 0:
                        int i3 = RemindersActivity.f3106I;
                        remindersActivity.getClass();
                        AbstractC1256E0.m3024q(remindersActivity);
                        break;
                    case 1:
                        int i4 = RemindersActivity.f3106I;
                        remindersActivity.m1949t(null);
                        break;
                    case 2:
                        int i5 = RemindersActivity.f3106I;
                        int i6 = remindersActivity.f3110H;
                        if (i6 >= 0) {
                            ArrayList arrayList2 = remindersActivity.f3107E;
                            if (i6 < arrayList2.size()) {
                                c1619a = (C1619a) arrayList2.get(remindersActivity.f3110H);
                            }
                        }
                        if (c1619a != null) {
                            remindersActivity.m1949t(c1619a);
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                    default:
                        int i7 = RemindersActivity.f3106I;
                        int i8 = remindersActivity.f3110H;
                        ArrayList arrayList3 = remindersActivity.f3107E;
                        if (i8 >= 0 && i8 < arrayList3.size()) {
                            c1619a = (C1619a) arrayList3.get(remindersActivity.f3110H);
                        }
                        if (c1619a != null) {
                            arrayList3.remove(c1619a);
                            remindersActivity.f3110H = -1;
                            AbstractC1680h.m4858T(arrayList3, carData.getInstance().m1771r());
                            AbstractC1687o.m4926U(remindersActivity, arrayList3);
                            remindersActivity.f3108F.notifyDataSetChanged();
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        findViewById(R.id.btn_reminder_add).setOnClickListener(new View.OnClickListener(this) { // from class: w0.l

            /* renamed from: g */
            public final /* synthetic */ RemindersActivity f9296g;

            {
                this.f9296g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1619a c1619a = null;
                RemindersActivity remindersActivity = this.f9296g;
                switch (i3) {
                    case 0:
                        int i32 = RemindersActivity.f3106I;
                        remindersActivity.getClass();
                        AbstractC1256E0.m3024q(remindersActivity);
                        break;
                    case 1:
                        int i4 = RemindersActivity.f3106I;
                        remindersActivity.m1949t(null);
                        break;
                    case 2:
                        int i5 = RemindersActivity.f3106I;
                        int i6 = remindersActivity.f3110H;
                        if (i6 >= 0) {
                            ArrayList arrayList2 = remindersActivity.f3107E;
                            if (i6 < arrayList2.size()) {
                                c1619a = (C1619a) arrayList2.get(remindersActivity.f3110H);
                            }
                        }
                        if (c1619a != null) {
                            remindersActivity.m1949t(c1619a);
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                    default:
                        int i7 = RemindersActivity.f3106I;
                        int i8 = remindersActivity.f3110H;
                        ArrayList arrayList3 = remindersActivity.f3107E;
                        if (i8 >= 0 && i8 < arrayList3.size()) {
                            c1619a = (C1619a) arrayList3.get(remindersActivity.f3110H);
                        }
                        if (c1619a != null) {
                            arrayList3.remove(c1619a);
                            remindersActivity.f3110H = -1;
                            AbstractC1680h.m4858T(arrayList3, carData.getInstance().m1771r());
                            AbstractC1687o.m4926U(remindersActivity, arrayList3);
                            remindersActivity.f3108F.notifyDataSetChanged();
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        findViewById(R.id.btn_reminder_edit).setOnClickListener(new View.OnClickListener(this) { // from class: w0.l

            /* renamed from: g */
            public final /* synthetic */ RemindersActivity f9296g;

            {
                this.f9296g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1619a c1619a = null;
                RemindersActivity remindersActivity = this.f9296g;
                switch (i2) {
                    case 0:
                        int i32 = RemindersActivity.f3106I;
                        remindersActivity.getClass();
                        AbstractC1256E0.m3024q(remindersActivity);
                        break;
                    case 1:
                        int i4 = RemindersActivity.f3106I;
                        remindersActivity.m1949t(null);
                        break;
                    case 2:
                        int i5 = RemindersActivity.f3106I;
                        int i6 = remindersActivity.f3110H;
                        if (i6 >= 0) {
                            ArrayList arrayList2 = remindersActivity.f3107E;
                            if (i6 < arrayList2.size()) {
                                c1619a = (C1619a) arrayList2.get(remindersActivity.f3110H);
                            }
                        }
                        if (c1619a != null) {
                            remindersActivity.m1949t(c1619a);
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                    default:
                        int i7 = RemindersActivity.f3106I;
                        int i8 = remindersActivity.f3110H;
                        ArrayList arrayList3 = remindersActivity.f3107E;
                        if (i8 >= 0 && i8 < arrayList3.size()) {
                            c1619a = (C1619a) arrayList3.get(remindersActivity.f3110H);
                        }
                        if (c1619a != null) {
                            arrayList3.remove(c1619a);
                            remindersActivity.f3110H = -1;
                            AbstractC1680h.m4858T(arrayList3, carData.getInstance().m1771r());
                            AbstractC1687o.m4926U(remindersActivity, arrayList3);
                            remindersActivity.f3108F.notifyDataSetChanged();
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        findViewById(R.id.btn_reminder_delete).setOnClickListener(new View.OnClickListener(this) { // from class: w0.l

            /* renamed from: g */
            public final /* synthetic */ RemindersActivity f9296g;

            {
                this.f9296g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1619a c1619a = null;
                RemindersActivity remindersActivity = this.f9296g;
                switch (i4) {
                    case 0:
                        int i32 = RemindersActivity.f3106I;
                        remindersActivity.getClass();
                        AbstractC1256E0.m3024q(remindersActivity);
                        break;
                    case 1:
                        int i42 = RemindersActivity.f3106I;
                        remindersActivity.m1949t(null);
                        break;
                    case 2:
                        int i5 = RemindersActivity.f3106I;
                        int i6 = remindersActivity.f3110H;
                        if (i6 >= 0) {
                            ArrayList arrayList2 = remindersActivity.f3107E;
                            if (i6 < arrayList2.size()) {
                                c1619a = (C1619a) arrayList2.get(remindersActivity.f3110H);
                            }
                        }
                        if (c1619a != null) {
                            remindersActivity.m1949t(c1619a);
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                    default:
                        int i7 = RemindersActivity.f3106I;
                        int i8 = remindersActivity.f3110H;
                        ArrayList arrayList3 = remindersActivity.f3107E;
                        if (i8 >= 0 && i8 < arrayList3.size()) {
                            c1619a = (C1619a) arrayList3.get(remindersActivity.f3110H);
                        }
                        if (c1619a != null) {
                            arrayList3.remove(c1619a);
                            remindersActivity.f3110H = -1;
                            AbstractC1680h.m4858T(arrayList3, carData.getInstance().m1771r());
                            AbstractC1687o.m4926U(remindersActivity, arrayList3);
                            remindersActivity.f3108F.notifyDataSetChanged();
                            break;
                        } else {
                            Toast.makeText(remindersActivity, R.string.reminder_select_first, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
    }

    /* renamed from: t */
    public final void m1949t(final C1619a c1619a) {
        final int i;
        final EditText editText;
        char c2;
        if (c1619a == null && this.f3107E.size() >= 20) {
            Toast.makeText(this, R.string.reminder_max_reached, 0).show();
            return;
        }
        final View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_reminder_edit, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.reminder_edit_title)).setText(c1619a == null ? R.string.reminder_add_title : R.string.reminder_edit_title);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.reminder_icon_row);
        final EnumC1620b[] enumC1620bArr = {c1619a != null ? c1619a.f9252b : EnumC1620b.STAR};
        EnumC1620b[] values = EnumC1620b.values();
        int length = values.length;
        for (int i2 = 0; i2 < length; i2++) {
            EnumC1620b enumC1620b = values[i2];
            ImageView imageView = new ImageView(this);
            int i3 = (int) (getResources().getDisplayMetrics().density * 80.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            layoutParams.setMarginEnd((int) (getResources().getDisplayMetrics().density * 10.0f));
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(enumC1620b.f9260b);
            imageView.setPadding(10, 10, 10, 10);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setBackgroundResource(enumC1620b == enumC1620bArr[0] ? R.drawable.dialog_input_bg : android.R.color.transparent);
            imageView.setOnClickListener(new ViewOnClickListenerC1326j0(enumC1620bArr, enumC1620b, linearLayout, 3));
            imageView.setTag(enumC1620b);
            linearLayout.addView(imageView);
        }
        final EditText editText2 = (EditText) inflate.findViewById(R.id.reminder_edit_text);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.reminder_type_group);
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.reminder_type_odo);
        final RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.reminder_type_date);
        View findViewById = inflate.findViewById(R.id.reminder_odo_block);
        View findViewById2 = inflate.findViewById(R.id.reminder_date_block);
        EditText editText3 = (EditText) inflate.findViewById(R.id.reminder_odo_abs);
        EditText editText4 = (EditText) inflate.findViewById(R.id.reminder_odo_plus);
        final AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(R.id.reminder_date_pick);
        final EditText editText5 = (EditText) inflate.findViewById(R.id.reminder_date_plus);
        int max = Math.max(0, Math.round(carData.getInstance().m1771r()));
        final long[] jArr = {AbstractC1680h.m4862X() + 7};
        final boolean[] zArr = {false};
        if (c1619a != null) {
            editText2.setText(c1619a.f9253c);
            if (c1619a.f9254d == 1) {
                radioButton2.setChecked(true);
                c2 = 0;
                jArr[0] = c1619a.f9256f;
                editText = editText3;
                i = max;
                m1948u(appCompatButton, jArr[c2]);
                editText5.setText(String.valueOf(Math.max(0L, jArr[c2] - AbstractC1680h.m4862X())));
                final RunnableC0005B runnableC0005B = new RunnableC0005B(radioButton2, findViewById, findViewById2, 9);
                runnableC0005B.run();
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: w0.m
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                        int i5 = RemindersActivity.f3106I;
                        RunnableC0005B.this.run();
                    }
                });
                C1633o c1633o = new C1633o(new RunnableC1624f(zArr, editText, i, editText4));
                C1633o c1633o2 = new C1633o(new RunnableC1624f(zArr, editText4, editText, i));
                editText.addTextChangedListener(c1633o);
                editText4.addTextChangedListener(c1633o2);
                editText5.addTextChangedListener(new C1633o(new Runnable() { // from class: w0.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4;
                        int i5 = RemindersActivity.f3106I;
                        this.getClass();
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        try {
                            i4 = Integer.parseInt(editText5.getText().toString().trim());
                        } catch (Exception unused) {
                            i4 = 0;
                        }
                        long m4862X = AbstractC1680h.m4862X() + Math.max(0, i4);
                        jArr[0] = m4862X;
                        RemindersActivity.m1948u(appCompatButton, m4862X);
                        zArr2[0] = false;
                    }
                }));
                appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: w0.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = RemindersActivity.f3106I;
                        final RemindersActivity remindersActivity = this;
                        remindersActivity.getClass();
                        final long[] jArr2 = jArr;
                        LocalDate ofEpochDay = LocalDate.ofEpochDay(jArr2[0]);
                        final boolean[] zArr2 = zArr;
                        final AppCompatButton appCompatButton2 = appCompatButton;
                        final EditText editText6 = editText5;
                        new DatePickerDialog(remindersActivity, new DatePickerDialog.OnDateSetListener() { // from class: w0.j
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i5, int i6, int i7) {
                                int i8 = RemindersActivity.f3106I;
                                remindersActivity.getClass();
                                long epochDay = LocalDate.of(i5, i6 + 1, i7).toEpochDay();
                                long[] jArr3 = jArr2;
                                jArr3[0] = epochDay;
                                boolean[] zArr3 = zArr2;
                                zArr3[0] = true;
                                RemindersActivity.m1948u(appCompatButton2, epochDay);
                                editText6.setText(String.valueOf(Math.max(0L, jArr3[0] - AbstractC1680h.m4862X())));
                                zArr3[0] = false;
                            }
                        }, ofEpochDay.getYear(), ofEpochDay.getMonthValue() - 1, ofEpochDay.getDayOfMonth()).show();
                    }
                });
                C0117i c0117i = new C0117i(this, R.style.T500Split_Dialog);
                ((C0863b) c0117i.f369g).f4328i = inflate;
                final DialogInterfaceC0867f m365a = c0117i.m365a();
                m365a.setCancelable(true);
                AbstractC1256E0.m3022o(m365a);
                inflate.findViewById(R.id.reminder_edit_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate, 4));
                inflate.findViewById(R.id.reminder_edit_save).setOnClickListener(new View.OnClickListener() { // from class: w0.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4;
                        int i5 = RemindersActivity.f3106I;
                        RemindersActivity remindersActivity = RemindersActivity.this;
                        remindersActivity.getClass();
                        EditText editText6 = editText2;
                        String trim = editText6.getText() != null ? editText6.getText().toString().trim() : "";
                        if (trim.isEmpty()) {
                            Toast.makeText(remindersActivity, R.string.reminder_text_required, 0).show();
                            return;
                        }
                        if (trim.length() > 256) {
                            trim = trim.substring(0, Function.MAX_NARGS);
                        }
                        C1619a c1619a2 = c1619a;
                        C1619a c1619a3 = c1619a2 != null ? c1619a2 : new C1619a();
                        c1619a3.f9252b = enumC1620bArr[0];
                        c1619a3.f9253c = trim;
                        if (radioButton2.isChecked()) {
                            c1619a3.f9254d = 1;
                            c1619a3.f9256f = jArr[0];
                        } else {
                            c1619a3.f9254d = 0;
                            try {
                                i4 = Integer.parseInt(editText.getText().toString().trim());
                            } catch (Exception unused) {
                                i4 = i;
                            }
                            c1619a3.f9255e = i4;
                        }
                        ArrayList arrayList = remindersActivity.f3107E;
                        if (c1619a2 == null) {
                            arrayList.add(c1619a3);
                        }
                        AbstractC1680h.m4858T(arrayList, carData.getInstance().m1771r());
                        AbstractC1687o.m4926U(remindersActivity, arrayList);
                        remindersActivity.f3108F.notifyDataSetChanged();
                        int indexOf = arrayList.indexOf(c1619a3);
                        remindersActivity.f3110H = indexOf;
                        if (indexOf >= 0) {
                            remindersActivity.f3109G.setItemChecked(indexOf, true);
                        }
                        AbstractC1256E0.m3027t(m365a, inflate, null);
                    }
                });
                AbstractC1256E0.m3002Q(m365a, inflate);
            }
            radioButton.setChecked(true);
            editText3.setText(String.valueOf(c1619a.f9255e));
            editText4.setText(String.valueOf(Math.max(0, c1619a.f9255e - max)));
            editText = editText3;
            i = max;
        } else {
            radioButton.setChecked(true);
            i = max;
            editText3.setText(String.valueOf(i + 1000));
            editText4.setText("1000");
            editText = editText3;
        }
        c2 = 0;
        m1948u(appCompatButton, jArr[c2]);
        editText5.setText(String.valueOf(Math.max(0L, jArr[c2] - AbstractC1680h.m4862X())));
        final RunnableC0005B runnableC0005B2 = new RunnableC0005B(radioButton2, findViewById, findViewById2, 9);
        runnableC0005B2.run();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: w0.m
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                int i5 = RemindersActivity.f3106I;
                RunnableC0005B.this.run();
            }
        });
        C1633o c1633o3 = new C1633o(new RunnableC1624f(zArr, editText, i, editText4));
        C1633o c1633o22 = new C1633o(new RunnableC1624f(zArr, editText4, editText, i));
        editText.addTextChangedListener(c1633o3);
        editText4.addTextChangedListener(c1633o22);
        editText5.addTextChangedListener(new C1633o(new Runnable() { // from class: w0.g
            @Override // java.lang.Runnable
            public final void run() {
                int i4;
                int i5 = RemindersActivity.f3106I;
                this.getClass();
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                try {
                    i4 = Integer.parseInt(editText5.getText().toString().trim());
                } catch (Exception unused) {
                    i4 = 0;
                }
                long m4862X = AbstractC1680h.m4862X() + Math.max(0, i4);
                jArr[0] = m4862X;
                RemindersActivity.m1948u(appCompatButton, m4862X);
                zArr2[0] = false;
            }
        }));
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: w0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = RemindersActivity.f3106I;
                final RemindersActivity remindersActivity = this;
                remindersActivity.getClass();
                final long[] jArr2 = jArr;
                LocalDate ofEpochDay = LocalDate.ofEpochDay(jArr2[0]);
                final boolean[] zArr2 = zArr;
                final AppCompatButton appCompatButton2 = appCompatButton;
                final EditText editText6 = editText5;
                new DatePickerDialog(remindersActivity, new DatePickerDialog.OnDateSetListener() { // from class: w0.j
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i5, int i6, int i7) {
                        int i8 = RemindersActivity.f3106I;
                        remindersActivity.getClass();
                        long epochDay = LocalDate.of(i5, i6 + 1, i7).toEpochDay();
                        long[] jArr3 = jArr2;
                        jArr3[0] = epochDay;
                        boolean[] zArr3 = zArr2;
                        zArr3[0] = true;
                        RemindersActivity.m1948u(appCompatButton2, epochDay);
                        editText6.setText(String.valueOf(Math.max(0L, jArr3[0] - AbstractC1680h.m4862X())));
                        zArr3[0] = false;
                    }
                }, ofEpochDay.getYear(), ofEpochDay.getMonthValue() - 1, ofEpochDay.getDayOfMonth()).show();
            }
        });
        C0117i c0117i2 = new C0117i(this, R.style.T500Split_Dialog);
        ((C0863b) c0117i2.f369g).f4328i = inflate;
        final DialogInterfaceC0867f m365a2 = c0117i2.m365a();
        m365a2.setCancelable(true);
        AbstractC1256E0.m3022o(m365a2);
        inflate.findViewById(R.id.reminder_edit_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a2, inflate, 4));
        inflate.findViewById(R.id.reminder_edit_save).setOnClickListener(new View.OnClickListener() { // from class: w0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4;
                int i5 = RemindersActivity.f3106I;
                RemindersActivity remindersActivity = RemindersActivity.this;
                remindersActivity.getClass();
                EditText editText6 = editText2;
                String trim = editText6.getText() != null ? editText6.getText().toString().trim() : "";
                if (trim.isEmpty()) {
                    Toast.makeText(remindersActivity, R.string.reminder_text_required, 0).show();
                    return;
                }
                if (trim.length() > 256) {
                    trim = trim.substring(0, Function.MAX_NARGS);
                }
                C1619a c1619a2 = c1619a;
                C1619a c1619a3 = c1619a2 != null ? c1619a2 : new C1619a();
                c1619a3.f9252b = enumC1620bArr[0];
                c1619a3.f9253c = trim;
                if (radioButton2.isChecked()) {
                    c1619a3.f9254d = 1;
                    c1619a3.f9256f = jArr[0];
                } else {
                    c1619a3.f9254d = 0;
                    try {
                        i4 = Integer.parseInt(editText.getText().toString().trim());
                    } catch (Exception unused) {
                        i4 = i;
                    }
                    c1619a3.f9255e = i4;
                }
                ArrayList arrayList = remindersActivity.f3107E;
                if (c1619a2 == null) {
                    arrayList.add(c1619a3);
                }
                AbstractC1680h.m4858T(arrayList, carData.getInstance().m1771r());
                AbstractC1687o.m4926U(remindersActivity, arrayList);
                remindersActivity.f3108F.notifyDataSetChanged();
                int indexOf = arrayList.indexOf(c1619a3);
                remindersActivity.f3110H = indexOf;
                if (indexOf >= 0) {
                    remindersActivity.f3109G.setItemChecked(indexOf, true);
                }
                AbstractC1256E0.m3027t(m365a2, inflate, null);
            }
        });
        AbstractC1256E0.m3002Q(m365a2, inflate);
    }
}
