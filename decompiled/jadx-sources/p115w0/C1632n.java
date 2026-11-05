package p115w0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import java.io.File;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import p000A.AbstractC0001b;
import p070g.AbstractActivityC0870i;
import p098q0.ViewOnClickListenerC1346q;
import p121y0.AbstractC1680h;
import p121y0.C1676d;
import p121y0.C1684l;
import p121y0.C1685m;
import p124z0.AbstractC1709h;
import p124z0.C1708g;

/* renamed from: w0.n */
/* loaded from: classes.dex */
public final class C1632n extends BaseAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f9298a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0870i f9299b;

    public /* synthetic */ C1632n(AbstractActivityC0870i abstractActivityC0870i, int i) {
        this.f9298a = i;
        this.f9299b = abstractActivityC0870i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        switch (this.f9298a) {
            case 0:
                return ((RemindersActivity) this.f9299b).f3107E.size();
            case 1:
                return ((RefuelsActivity) this.f9299b).f3270F.size();
            case 2:
                return ((TripsActivity) this.f9299b).f3295F.size();
            default:
                return ((UserThemeImportActivity) this.f9299b).f3299E.size();
        }
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (this.f9298a) {
            case 0:
                return ((RemindersActivity) this.f9299b).f3107E.get(i);
            case 1:
                return ((RefuelsActivity) this.f9299b).f3270F.get(i);
            case 2:
                return ((TripsActivity) this.f9299b).f3295F.get(i);
            default:
                return (C1708g) ((UserThemeImportActivity) this.f9299b).f3299E.get(i);
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        switch (this.f9298a) {
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x038d, code lost:
    
        if (r1 >= 0.0f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d0  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2;
        View inflate;
        float f2;
        float f3;
        int i2;
        int i3;
        String string;
        String string2;
        float f4;
        float f5;
        ArrayList arrayList;
        File file;
        AbstractActivityC0870i abstractActivityC0870i = this.f9299b;
        switch (this.f9298a) {
            case 0:
                RemindersActivity remindersActivity = (RemindersActivity) abstractActivityC0870i;
                if (view != null) {
                    inflate = view;
                    z2 = false;
                } else {
                    z2 = false;
                    inflate = remindersActivity.getLayoutInflater().inflate(R.layout.item_reminder, viewGroup, false);
                }
                C1619a c1619a = (C1619a) remindersActivity.f3107E.get(i);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.reminder_icon);
                TextView textView = (TextView) inflate.findViewById(R.id.reminder_text);
                TextView textView2 = (TextView) inflate.findViewById(R.id.reminder_meta);
                imageView.setImageResource(c1619a.f9252b.f9260b);
                textView.setText(c1619a.f9253c);
                float m1771r = carData.getInstance().m1771r();
                boolean m4883y = AbstractC1680h.m4883y(c1619a, m1771r);
                boolean z3 = (m4883y || !AbstractC1680h.m4884z(c1619a, m1771r)) ? z2 : true;
                if (i == remindersActivity.f3110H) {
                    z2 = true;
                }
                inflate.setActivated(z2);
                int m3a = AbstractC0001b.m3a(remindersActivity, m4883y ? R.color.highspeed : z3 ? R.color.reminder_upcoming : R.color.btn_write_text);
                textView.setTextColor(m3a);
                textView2.setTextColor((m4883y || z3) ? m3a : AbstractC0001b.m3a(remindersActivity, R.color.title_text));
                if (m4883y || z3) {
                    imageView.setColorFilter(m3a);
                } else {
                    imageView.clearColorFilter();
                }
                if (c1619a.f9254d == 1) {
                    textView2.setText(remindersActivity.getString(R.string.reminder_meta_date, LocalDate.ofEpochDay(c1619a.f9256f).toString(), Integer.valueOf((int) (c1619a.f9256f - AbstractC1680h.m4862X()))));
                } else {
                    textView2.setText(remindersActivity.getString(R.string.reminder_meta_odo, Integer.valueOf(c1619a.f9255e), Integer.valueOf(c1619a.f9255e - Math.round(m1771r))));
                }
                return inflate;
            case 1:
                RefuelsActivity refuelsActivity = (RefuelsActivity) abstractActivityC0870i;
                View inflate2 = view != null ? view : refuelsActivity.getLayoutInflater().inflate(R.layout.item_refuel, viewGroup, false);
                C1676d c1676d = (C1676d) refuelsActivity.f3270F.get(i);
                TextView textView3 = (TextView) inflate2.findViewById(R.id.refuel_title);
                TextView textView4 = (TextView) inflate2.findViewById(R.id.refuel_meta);
                View findViewById = inflate2.findViewById(R.id.refuel_delete);
                long j2 = c1676d.f9558b;
                textView3.setText(j2 > 0 ? DateFormat.getDateTimeInstance(3, 3, Locale.getDefault()).format(new Date(j2)) : "—");
                float f6 = c1676d.f9562f;
                String string3 = f6 <= 0.0f ? refuelsActivity.getString(R.string.stats_value_na) : refuelsActivity.getString(R.string.trips_odo_km, Float.valueOf(f6));
                Float valueOf = Float.valueOf(c1676d.f9559c);
                Float valueOf2 = Float.valueOf(c1676d.f9560d);
                Float valueOf3 = Float.valueOf(RefuelsActivity.m1983t(c1676d, i));
                float m1983t = RefuelsActivity.m1983t(c1676d, i);
                float f7 = c1676d.f9562f;
                if (i <= 0) {
                    f2 = carData.getInstance().m1771r();
                    if (!Float.isNaN(f2)) {
                        if (!Float.isInfinite(f2)) {
                            break;
                        }
                    }
                    f2 = 0.0f;
                } else {
                    C1676d c1676d2 = (C1676d) refuelsActivity.f3270F.get(i - 1);
                    if (c1676d2 != null) {
                        f2 = c1676d2.f9562f;
                    }
                    f2 = 0.0f;
                }
                if (f7 > 0.0f && f2 > 0.0f) {
                    float f8 = f2 - f7;
                    if (f8 >= 0.1f && m1983t > 0.0f && !Float.isNaN(m1983t) && !Float.isInfinite(m1983t)) {
                        f3 = (m1983t * 100.0f) / f8;
                        textView4.setText(refuelsActivity.getString(R.string.refuels_meta, string3, valueOf, valueOf2, valueOf3, (!Float.isNaN(f3) || f3 < 0.0f) ? refuelsActivity.getString(R.string.stats_value_na) : refuelsActivity.getString(R.string.stats_value_fuel, Float.valueOf(f3))));
                        findViewById.setOnClickListener(new ViewOnClickListenerC1346q(this, 2, c1676d));
                        return inflate2;
                    }
                }
                f3 = Float.NaN;
                textView4.setText(refuelsActivity.getString(R.string.refuels_meta, string3, valueOf, valueOf2, valueOf3, (!Float.isNaN(f3) || f3 < 0.0f) ? refuelsActivity.getString(R.string.stats_value_na) : refuelsActivity.getString(R.string.stats_value_fuel, Float.valueOf(f3))));
                findViewById.setOnClickListener(new ViewOnClickListenerC1346q(this, 2, c1676d));
                return inflate2;
            case 2:
                TripsActivity tripsActivity = (TripsActivity) abstractActivityC0870i;
                View inflate3 = view != null ? view : tripsActivity.getLayoutInflater().inflate(R.layout.item_trip, viewGroup, false);
                C1685m c1685m = (C1685m) tripsActivity.f3295F.get(i);
                TextView textView5 = (TextView) inflate3.findViewById(R.id.trip_title);
                TextView textView6 = (TextView) inflate3.findViewById(R.id.trip_odo);
                TextView textView7 = (TextView) inflate3.findViewById(R.id.trip_meta);
                TextView textView8 = (TextView) inflate3.findViewById(R.id.trip_refuel);
                TextView textView9 = (TextView) inflate3.findViewById(R.id.trip_incomplete);
                View findViewById2 = inflate3.findViewById(R.id.trip_delete);
                long j3 = c1685m.f9605b;
                String format = j3 <= 0 ? "—" : DateFormat.getDateTimeInstance(3, 3, Locale.getDefault()).format(new Date(j3));
                long j4 = c1685m.f9606c;
                textView5.setText(tripsActivity.getString(R.string.trips_range, format, j4 > 0 ? DateFormat.getDateTimeInstance(3, 3, Locale.getDefault()).format(new Date(j4)) : "—"));
                float f9 = c1685m.f9608e;
                String str = "";
                if (f9 > 0.0f || c1685m.f9609f > 0.0f) {
                    if (f9 <= 0.0f) {
                        i2 = R.string.stats_value_na;
                        string = tripsActivity.getString(R.string.stats_value_na);
                        i3 = R.string.trips_odo_km;
                    } else {
                        i2 = R.string.stats_value_na;
                        Object[] objArr = {Float.valueOf(f9)};
                        i3 = R.string.trips_odo_km;
                        string = tripsActivity.getString(R.string.trips_odo_km, objArr);
                    }
                    float f10 = c1685m.f9609f;
                    string2 = tripsActivity.getString(R.string.trips_odo, string, f10 <= 0.0f ? tripsActivity.getString(i2) : tripsActivity.getString(i3, Float.valueOf(f10)));
                } else {
                    string2 = "";
                }
                if (string2.isEmpty()) {
                    textView6.setVisibility(8);
                } else {
                    textView6.setVisibility(0);
                    textView6.setText(string2);
                }
                Float valueOf4 = Float.valueOf(c1685m.f9610g);
                long max = Math.max(0L, c1685m.f9611h / 60000);
                long j5 = max / 60;
                long j6 = max % 60;
                String string4 = j5 > 0 ? tripsActivity.getString(R.string.trips_duration_hm, Long.valueOf(j5), String.format(Locale.getDefault(), "%02d", Long.valueOf(j6))) : tripsActivity.getString(R.string.trips_duration_m, Long.valueOf(j6));
                Float valueOf5 = Float.valueOf(c1685m.f9612i);
                Float valueOf6 = Float.valueOf(c1685m.f9613j);
                float f11 = c1685m.f9610g;
                if (f11 >= 0.1f) {
                    float f12 = c1685m.f9613j;
                    f4 = 0.0f;
                    if (f12 > 0.0f) {
                        f5 = (f12 * 100.0f) / f11;
                        textView7.setText(tripsActivity.getString(R.string.trips_meta, valueOf4, string4, valueOf5, valueOf6, (!Float.isNaN(f5) || f5 < f4) ? tripsActivity.getString(R.string.stats_value_na) : tripsActivity.getString(R.string.stats_value_fuel, Float.valueOf(f5))));
                        arrayList = c1685m.f9615l;
                        if (!arrayList.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C1684l c1684l = (C1684l) it.next();
                                if (c1684l != null) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(tripsActivity.getString(R.string.trips_refuel, Float.valueOf(c1684l.f9599a), Float.valueOf(c1684l.f9600b), Float.valueOf(c1684l.f9601c)));
                                }
                            }
                            str = sb.toString();
                        }
                        if (str.isEmpty()) {
                            textView8.setVisibility(0);
                            textView8.setText(str);
                        } else {
                            textView8.setVisibility(8);
                        }
                        textView9.setVisibility(c1685m.f9614k ? 8 : 0);
                        findViewById2.setOnClickListener(new ViewOnClickListenerC1346q(this, 3, c1685m));
                        return inflate3;
                    }
                } else {
                    f4 = 0.0f;
                }
                f5 = Float.NaN;
                textView7.setText(tripsActivity.getString(R.string.trips_meta, valueOf4, string4, valueOf5, valueOf6, (!Float.isNaN(f5) || f5 < f4) ? tripsActivity.getString(R.string.stats_value_na) : tripsActivity.getString(R.string.stats_value_fuel, Float.valueOf(f5))));
                arrayList = c1685m.f9615l;
                if (!arrayList.isEmpty()) {
                }
                if (str.isEmpty()) {
                }
                textView9.setVisibility(c1685m.f9614k ? 8 : 0);
                findViewById2.setOnClickListener(new ViewOnClickListenerC1346q(this, 3, c1685m));
                return inflate3;
            default:
                UserThemeImportActivity userThemeImportActivity = (UserThemeImportActivity) abstractActivityC0870i;
                View inflate4 = view == null ? userThemeImportActivity.getLayoutInflater().inflate(R.layout.item_user_theme_pack, viewGroup, false) : view;
                C1708g c1708g = (C1708g) userThemeImportActivity.f3299E.get(i);
                TextView textView10 = (TextView) inflate4.findViewById(R.id.pack_name);
                TextView textView11 = (TextView) inflate4.findViewById(R.id.pack_author);
                TextView textView12 = (TextView) inflate4.findViewById(R.id.pack_description);
                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.pack_preview);
                textView10.setText(c1708g.f9654b);
                String str2 = c1708g.f9655c;
                textView11.setText(str2);
                textView11.setVisibility(str2.isEmpty() ? 4 : 0);
                String str3 = c1708g.f9656d;
                textView12.setText(str3);
                textView12.setVisibility(str3.isEmpty() ? 4 : 0);
                inflate4.setActivated(i == userThemeImportActivity.f3302H);
                String absolutePath = c1708g.f9653a.getAbsolutePath();
                HashMap hashMap = userThemeImportActivity.f3300F;
                Bitmap bitmap = (Bitmap) hashMap.get(absolutePath);
                if (bitmap == null && (file = c1708g.f9657e) != null) {
                    Pattern pattern = AbstractC1709h.f9661a;
                    if (file.isFile()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        int i4 = options.outWidth;
                        int max2 = i4 > 480 ? Math.max(1, i4 / 480) : 1;
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = max2;
                        bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        hashMap.put(absolutePath, bitmap);
                    }
                }
                if (bitmap != null) {
                    imageView2.setImageBitmap(bitmap);
                } else {
                    imageView2.setImageDrawable(null);
                }
                return inflate4;
        }
    }
}
