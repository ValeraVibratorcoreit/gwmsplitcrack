package p013F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import p008D.AbstractC0070a;
import p016H.C0112d;
import p022K.InterfaceC0176Y;
import p023K0.C0228a;
import p023K0.C0230c;
import p054a1.C0502k;
import p077j0.AbstractC0982m;
import p080k0.C1037f;
import p098q0.C1246B;

/* renamed from: F0.a */
/* loaded from: classes.dex */
public final class C0097a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f327a;

    /* renamed from: b */
    public final /* synthetic */ Object f328b;

    public /* synthetic */ C0097a(int i, Object obj) {
        this.f327a = i;
        this.f328b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f327a) {
            case 1:
                ((InterfaceC0176Y) this.f328b).mo299b();
                break;
            case 5:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f328b;
                actionBarOverlayLayout.f1746B = null;
                actionBarOverlayLayout.f1761o = false;
                break;
            case 6:
                ((C1246B) this.f328b).f5572r = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f327a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f328b).f3356h = null;
                break;
            case 1:
                ((InterfaceC0176Y) this.f328b).mo525a();
                break;
            case 2:
                C0502k c0502k = (C0502k) this.f328b;
                c0502k.m1238q();
                c0502k.f1584r.start();
                break;
            case 3:
                ((AbstractC0982m) this.f328b).m2557m();
                animator.removeListener(this);
                break;
            case 4:
                C1037f c1037f = (C1037f) this.f328b;
                ArrayList arrayList = new ArrayList(c1037f.f4924j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0228a) arrayList.get(i)).f584b.f603t;
                    if (colorStateList != null) {
                        AbstractC0070a.m206h(c1037f, colorStateList);
                    }
                }
                break;
            case 5:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f328b;
                actionBarOverlayLayout.f1746B = null;
                actionBarOverlayLayout.f1761o = false;
                break;
            case 6:
                C1246B c1246b = (C1246B) this.f328b;
                c1246b.f5572r = null;
                c1246b.m2959h();
                break;
            default:
                C0112d c0112d = (C0112d) this.f328b;
                c0112d.m357h();
                c0112d.f353e = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f327a) {
            case 1:
                ((InterfaceC0176Y) this.f328b).mo301c();
                break;
            case 4:
                C1037f c1037f = (C1037f) this.f328b;
                ArrayList arrayList = new ArrayList(c1037f.f4924j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0230c c0230c = ((C0228a) arrayList.get(i)).f584b;
                    ColorStateList colorStateList = c0230c.f603t;
                    if (colorStateList != null) {
                        AbstractC0070a.m205g(c1037f, colorStateList.getColorForState(c0230c.f607x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0097a(InterfaceC0176Y interfaceC0176Y, View view) {
        this.f327a = 1;
        this.f328b = interfaceC0176Y;
    }
}
