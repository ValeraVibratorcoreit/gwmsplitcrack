package p095p0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: p0.m */
/* loaded from: classes.dex */
public final class C1234m extends RecyclerView {

    /* renamed from: B0 */
    public final /* synthetic */ ViewPager2 f5489B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234m(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.f5489B0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f5489B0.f2163y.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f5489B0;
        accessibilityEvent.setFromIndex(viewPager2.f2147i);
        accessibilityEvent.setToIndex(viewPager2.f2147i);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f2163y.f926d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f5489B0.f2161w && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f5489B0.f2161w && super.onTouchEvent(motionEvent);
    }
}
