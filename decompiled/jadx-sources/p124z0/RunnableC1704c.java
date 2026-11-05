package p124z0;

import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import p010D1.AbstractC0088l;
import p112v0.EnumC1609b;

/* renamed from: z0.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1704c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9641a;

    /* renamed from: b */
    public final /* synthetic */ UserThemeImportActivity f9642b;

    public /* synthetic */ RunnableC1704c(UserThemeImportActivity userThemeImportActivity, int i) {
        this.f9641a = i;
        this.f9642b = userThemeImportActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserThemeImportActivity userThemeImportActivity = this.f9642b;
        switch (this.f9641a) {
            case 0:
                int i = UserThemeImportActivity.f3298V;
                if (userThemeImportActivity.m2001u()) {
                    userThemeImportActivity.m2002v(userThemeImportActivity.getString(R.string.ut_log_write, Integer.valueOf(userThemeImportActivity.f3303I)));
                    break;
                }
                break;
            case 1:
                userThemeImportActivity.finish();
                break;
            case 2:
                userThemeImportActivity.f3313S.fullScroll(130);
                break;
            case 3:
                int i2 = UserThemeImportActivity.f3298V;
                userThemeImportActivity.getClass();
                AbstractC0088l.m264Y(userThemeImportActivity, EnumC1609b.STORAGE);
                break;
            default:
                int i3 = UserThemeImportActivity.f3298V;
                userThemeImportActivity.m2003w();
                break;
        }
    }
}
