package p076j;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: j.k */
/* loaded from: classes.dex */
public abstract class AbstractC0962k {
    /* renamed from: a */
    public static boolean m2504a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* renamed from: b */
    public static ActionMode m2505b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
