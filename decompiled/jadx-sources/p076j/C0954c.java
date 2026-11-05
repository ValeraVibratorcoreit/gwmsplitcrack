package p076j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.altaysoft.t500_split.R;

/* renamed from: j.c */
/* loaded from: classes.dex */
public final class C0954c extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f4569f;

    /* renamed from: a */
    public int f4570a;

    /* renamed from: b */
    public Resources.Theme f4571b;

    /* renamed from: c */
    public LayoutInflater f4572c;

    /* renamed from: d */
    public Configuration f4573d;

    /* renamed from: e */
    public Resources f4574e;

    public C0954c(Context context, int i) {
        super(context);
        this.f4570a = i;
    }

    /* renamed from: a */
    public final void m2496a(Configuration configuration) {
        if (this.f4574e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f4573d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f4573d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m2497b() {
        if (this.f4571b == null) {
            this.f4571b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4571b.setTo(theme);
            }
        }
        this.f4571b.applyStyle(this.f4570a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f4574e == null) {
            Configuration configuration = this.f4573d;
            if (configuration != null) {
                if (f4569f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f4569f = configuration2;
                }
                if (!configuration.equals(f4569f)) {
                    this.f4574e = createConfigurationContext(this.f4573d).getResources();
                }
            }
            this.f4574e = super.getResources();
        }
        return this.f4574e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4572c == null) {
            this.f4572c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4572c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4571b;
        if (theme != null) {
            return theme;
        }
        if (this.f4570a == 0) {
            this.f4570a = R.style.Theme_AppCompat_Light;
        }
        m2497b();
        return this.f4571b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f4570a != i) {
            this.f4570a = i;
            m2497b();
        }
    }
}
