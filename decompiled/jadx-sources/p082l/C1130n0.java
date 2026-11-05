package p082l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.altaysoft.t500_split.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p001A0.RunnableC0020n;
import p008D.AbstractC0070a;
import p033Q.ViewOnTouchListenerC0273g;

/* renamed from: l.n0 */
/* loaded from: classes.dex */
public class C1130n0 extends ListView {

    /* renamed from: f */
    public final Rect f5209f;

    /* renamed from: g */
    public int f5210g;

    /* renamed from: h */
    public int f5211h;

    /* renamed from: i */
    public int f5212i;

    /* renamed from: j */
    public int f5213j;

    /* renamed from: k */
    public int f5214k;

    /* renamed from: l */
    public C1126l0 f5215l;

    /* renamed from: m */
    public boolean f5216m;

    /* renamed from: n */
    public final boolean f5217n;

    /* renamed from: o */
    public boolean f5218o;

    /* renamed from: p */
    public ViewOnTouchListenerC0273g f5219p;

    /* renamed from: q */
    public RunnableC0020n f5220q;

    public C1130n0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f5209f = new Rect();
        this.f5210g = 0;
        this.f5211h = 0;
        this.f5212i = 0;
        this.f5213j = 0;
        this.f5217n = z2;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m2742a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2743b(MotionEvent motionEvent, int i) {
        boolean z2;
        boolean z3;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    if (z2 || z4) {
                        this.f5218o = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f5214k - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z2) {
                        ViewOnTouchListenerC0273g viewOnTouchListenerC0273g = this.f5219p;
                        if (viewOnTouchListenerC0273g != null) {
                            if (viewOnTouchListenerC0273g.f734u) {
                                viewOnTouchListenerC0273g.m802d();
                            }
                            viewOnTouchListenerC0273g.f734u = false;
                        }
                    } else {
                        if (this.f5219p == null) {
                            this.f5219p = new ViewOnTouchListenerC0273g(this);
                        }
                        ViewOnTouchListenerC0273g viewOnTouchListenerC0273g2 = this.f5219p;
                        boolean z5 = viewOnTouchListenerC0273g2.f734u;
                        viewOnTouchListenerC0273g2.f734u = true;
                        viewOnTouchListenerC0273g2.onTouch(this, motionEvent);
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.f5218o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f5214k - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z2) {
                }
                return z2;
            }
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.f5218o = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC1120i0.m2731a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f5214k;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f5214k = pointToPosition;
                AbstractC1120i0.m2731a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || pointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f5209f;
                rect.set(left, top, right, bottom);
                rect.left -= this.f5210g;
                rect.top -= this.f5211h;
                rect.right += this.f5212i;
                rect.bottom += this.f5213j;
                if (i2 >= 33) {
                    z3 = AbstractC1124k0.m2736a(this);
                } else {
                    Field field = AbstractC1128m0.f5208a;
                    if (field != null) {
                        try {
                            z3 = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z3 = false;
                }
                if (childAt3.isEnabled() != z3) {
                    boolean z7 = !z3;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1124k0.m2737b(this, z7);
                    } else {
                        Field field2 = AbstractC1128m0.f5208a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z7));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z6) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC0070a.m203e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC0070a.m203e(selector2, f2, f3);
                }
                C1126l0 c1126l0 = this.f5215l;
                if (c1126l0 != null) {
                    c1126l0.f5201g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = true;
                z4 = false;
            }
            if (z2) {
            }
            this.f5218o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f5214k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f5218o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f5214k - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f5209f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f5220q != null) {
            return;
        }
        super.drawableStateChanged();
        C1126l0 c1126l0 = this.f5215l;
        if (c1126l0 != null) {
            c1126l0.f5201g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f5218o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f5217n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f5217n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f5217n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f5217n && this.f5216m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f5220q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5220q == null) {
            RunnableC0020n runnableC0020n = new RunnableC0020n(13, this);
            this.f5220q = runnableC0020n;
            post(runnableC0020n);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC1122j0.f5176d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC1122j0.f5173a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC1122j0.f5174b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC1122j0.f5175c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f5218o && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5214k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0020n runnableC0020n = this.f5220q;
        if (runnableC0020n != null) {
            C1130n0 c1130n0 = (C1130n0) runnableC0020n.f59b;
            c1130n0.f5220q = null;
            c1130n0.removeCallbacks(runnableC0020n);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f5216m = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1126l0 c1126l0 = null;
        if (drawable != null) {
            C1126l0 c1126l02 = new C1126l0();
            Drawable drawable2 = c1126l02.f5200f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1126l02.f5200f = drawable;
            drawable.setCallback(c1126l02);
            c1126l02.f5201g = true;
            c1126l0 = c1126l02;
        }
        this.f5215l = c1126l0;
        super.setSelector(c1126l0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5210g = rect.left;
        this.f5211h = rect.top;
        this.f5212i = rect.right;
        this.f5213j = rect.bottom;
    }
}
