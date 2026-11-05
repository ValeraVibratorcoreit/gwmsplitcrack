package p098q0;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;

/* renamed from: q0.b */
/* loaded from: classes.dex */
public final class C1301b extends ArrayAdapter {

    /* renamed from: a */
    public ArrayList f6059a;

    /* renamed from: a */
    public final View m3156a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_drawer_element_big, viewGroup, false);
        PackageManager packageManager = viewGroup.getContext().getPackageManager();
        TextView textView = (TextView) inflate.findViewById(R.id.app_pkg_list);
        TextView textView2 = (TextView) inflate.findViewById(R.id.app_name_list);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.app_icon_list);
        C1298a c1298a = (C1298a) this.f6059a.get(i);
        textView.setText(c1298a.f6051a);
        ApplicationInfo applicationInfo = c1298a.f6052b;
        CharSequence charSequence = c1298a.f6053c;
        if (charSequence == null) {
            charSequence = packageManager.getApplicationLabel(applicationInfo);
        }
        textView2.setText(charSequence);
        if (applicationInfo != null) {
            imageView.setImageDrawable(packageManager.getApplicationIcon(applicationInfo));
        } else {
            imageView.setImageResource(android.R.color.transparent);
        }
        return inflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m3156a(viewGroup, i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (C1298a) super.getItem(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m3156a(viewGroup, i);
    }
}
