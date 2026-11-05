package p076j;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: j.l */
/* loaded from: classes.dex */
public abstract class AbstractC0963l {
    /* renamed from: a */
    public static void m2506a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }
}
