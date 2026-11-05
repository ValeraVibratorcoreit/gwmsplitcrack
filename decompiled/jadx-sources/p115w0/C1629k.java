package p115w0;

import android.view.View;
import android.widget.AdapterView;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import p070g.AbstractActivityC0870i;

/* renamed from: w0.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C1629k implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f9293f;

    /* renamed from: g */
    public final /* synthetic */ AbstractActivityC0870i f9294g;

    public /* synthetic */ C1629k(AbstractActivityC0870i abstractActivityC0870i, int i) {
        this.f9293f = i;
        this.f9294g = abstractActivityC0870i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        switch (this.f9293f) {
            case 0:
                RemindersActivity remindersActivity = (RemindersActivity) this.f9294g;
                remindersActivity.f3110H = i;
                remindersActivity.f3109G.setItemChecked(i, true);
                remindersActivity.f3108F.notifyDataSetChanged();
                break;
            default:
                UserThemeImportActivity userThemeImportActivity = (UserThemeImportActivity) this.f9294g;
                userThemeImportActivity.f3302H = i;
                userThemeImportActivity.f3301G.notifyDataSetChanged();
                userThemeImportActivity.m1998A();
                break;
        }
    }
}
