package p016H;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p024L.InterfaceC0249s;
import p070g.C0862a;
import p070g.C0863b;
import p070g.C0865d;
import p070g.C0866e;
import p070g.DialogInterfaceC0867f;
import p079k.DialogInterfaceOnKeyListenerC1019n;

/* renamed from: H.i */
/* loaded from: classes.dex */
public final class C0117i implements InterfaceC0249s {

    /* renamed from: f */
    public final int f368f;

    /* renamed from: g */
    public final Object f369g;

    public C0117i(Context context) {
        this(context, DialogInterfaceC0867f.m2398i(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* renamed from: a */
    public DialogInterfaceC0867f m365a() {
        C0863b c0863b = (C0863b) this.f369g;
        DialogInterfaceC0867f dialogInterfaceC0867f = new DialogInterfaceC0867f(c0863b.f4320a, this.f368f);
        View view = c0863b.f4324e;
        C0866e c0866e = dialogInterfaceC0867f.f4359k;
        if (view != null) {
            c0866e.f4347p = view;
        } else {
            CharSequence charSequence = c0863b.f4323d;
            if (charSequence != null) {
                c0866e.f4335d = charSequence;
                TextView textView = c0866e.f4345n;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0863b.f4322c;
            if (drawable != null) {
                c0866e.f4343l = drawable;
                ImageView imageView = c0866e.f4344m;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0866e.f4344m.setImageDrawable(drawable);
                }
            }
        }
        if (c0863b.f4326g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0863b.f4321b.inflate(c0866e.f4351t, (ViewGroup) null);
            int i = c0863b.f4329j ? c0866e.f4352u : c0866e.f4353v;
            Object obj = c0863b.f4326g;
            ?? r8 = obj;
            if (obj == null) {
                r8 = new C0865d(c0863b.f4320a, i, R.id.text1, null);
            }
            c0866e.f4348q = r8;
            c0866e.f4349r = c0863b.f4330k;
            if (c0863b.f4327h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0862a(c0863b, c0866e));
            }
            if (c0863b.f4329j) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0866e.f4336e = alertController$RecycleListView;
        }
        View view2 = c0863b.f4328i;
        if (view2 != null) {
            c0866e.f4337f = view2;
            c0866e.f4338g = false;
        }
        dialogInterfaceC0867f.setCancelable(true);
        dialogInterfaceC0867f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0867f.setOnCancelListener(null);
        dialogInterfaceC0867f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC1019n dialogInterfaceOnKeyListenerC1019n = c0863b.f4325f;
        if (dialogInterfaceOnKeyListenerC1019n != null) {
            dialogInterfaceC0867f.setOnKeyListener(dialogInterfaceOnKeyListenerC1019n);
        }
        return dialogInterfaceC0867f;
    }

    @Override // p024L.InterfaceC0249s
    /* renamed from: e */
    public boolean mo366e(View view) {
        ((BottomSheetBehavior) this.f369g).m2031B(this.f368f);
        return true;
    }

    public C0117i(Context context, int i) {
        this.f369g = new C0863b(new ContextThemeWrapper(context, DialogInterfaceC0867f.m2398i(context, i)));
        this.f368f = i;
    }

    public C0117i(int i, C0118j[] c0118jArr) {
        this.f368f = i;
        this.f369g = c0118jArr;
    }

    public C0117i(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f369g = bottomSheetBehavior;
        this.f368f = i;
    }
}
