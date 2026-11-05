package p098q0;

import android.content.pm.ApplicationInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.AppsList;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;

/* renamed from: q0.c */
/* loaded from: classes.dex */
public final class C1304c extends BaseAdapter {

    /* renamed from: a */
    public final ArrayList f6066a;

    /* renamed from: b */
    public final /* synthetic */ AppsList f6067b;

    public C1304c(AppsList appsList, ArrayList arrayList) {
        this.f6067b = appsList;
        this.f6066a = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6066a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f6066a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        AppsList appsList = this.f6067b;
        if (view == null) {
            view = appsList.getLayoutInflater().inflate(R.layout.app_drawer_element_grid, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.app_icon_list);
        TextView textView = (TextView) view.findViewById(R.id.app_name_list);
        TextView textView2 = (TextView) view.findViewById(R.id.app_pkg_list);
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f6066a.get(i);
        imageView.setImageDrawable(applicationInfo.loadIcon(appsList.getPackageManager()));
        textView.setText(applicationInfo.loadLabel(appsList.getPackageManager()));
        textView2.setText(applicationInfo.packageName);
        return view;
    }
}
