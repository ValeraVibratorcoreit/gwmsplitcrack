package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.altaysoft.t500_split.media.C0639g;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.AbstractC0172U;
import p022K.AbstractC0222w;
import p022K.AbstractC0224x;
import p022K.C0190g;
import p022K.C0202m;
import p022K.C0208p;
import p022K.C0226y;
import p022K.InterfaceC0206o;
import p033Q.AbstractC0271e;
import p033Q.AbstractC0275i;
import p033Q.C0274h;
import p033Q.C0277k;
import p033Q.InterfaceC0276j;
import p121y0.AbstractC1687o;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0206o {

    /* renamed from: G */
    public static final float f1922G = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: H */
    public static final C0274h f1923H = new C0274h(0);

    /* renamed from: I */
    public static final int[] f1924I = {R.attr.fillViewport};

    /* renamed from: A */
    public int f1925A;

    /* renamed from: B */
    public C0277k f1926B;

    /* renamed from: C */
    public final C0208p f1927C;

    /* renamed from: D */
    public final C0202m f1928D;

    /* renamed from: E */
    public float f1929E;

    /* renamed from: F */
    public final C0190g f1930F;

    /* renamed from: f */
    public final float f1931f;

    /* renamed from: g */
    public long f1932g;

    /* renamed from: h */
    public final Rect f1933h;

    /* renamed from: i */
    public final OverScroller f1934i;

    /* renamed from: j */
    public final EdgeEffect f1935j;

    /* renamed from: k */
    public final EdgeEffect f1936k;

    /* renamed from: l */
    public int f1937l;

    /* renamed from: m */
    public boolean f1938m;

    /* renamed from: n */
    public boolean f1939n;

    /* renamed from: o */
    public View f1940o;

    /* renamed from: p */
    public boolean f1941p;

    /* renamed from: q */
    public VelocityTracker f1942q;

    /* renamed from: r */
    public boolean f1943r;

    /* renamed from: s */
    public boolean f1944s;

    /* renamed from: t */
    public final int f1945t;

    /* renamed from: u */
    public final int f1946u;

    /* renamed from: v */
    public final int f1947v;

    /* renamed from: w */
    public int f1948w;

    /* renamed from: x */
    public final int[] f1949x;

    /* renamed from: y */
    public final int[] f1950y;

    /* renamed from: z */
    public int f1951z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.altaysoft.t500_split.R.attr.nestedScrollViewStyle);
        this.f1933h = new Rect();
        this.f1938m = true;
        this.f1939n = false;
        this.f1940o = null;
        this.f1941p = false;
        this.f1944s = true;
        this.f1948w = -1;
        this.f1949x = new int[2];
        this.f1950y = new int[2];
        this.f1930F = new C0190g(getContext(), new C0639g(10, this));
        int i = Build.VERSION.SDK_INT;
        this.f1935j = i >= 31 ? AbstractC0271e.m792a(context, attributeSet) : new EdgeEffect(context);
        this.f1936k = i >= 31 ? AbstractC0271e.m792a(context, attributeSet) : new EdgeEffect(context);
        this.f1931f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1934i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1945t = viewConfiguration.getScaledTouchSlop();
        this.f1946u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1947v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1924I, com.altaysoft.t500_split.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1927C = new C0208p();
        this.f1928D = new C0202m(this);
        setNestedScrollingEnabled(true);
        AbstractC0169Q.m505j(this, f1923H);
    }

    /* renamed from: l */
    public static boolean m1338l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1338l((View) parent, nestedScrollView);
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: a */
    public final void mo642a(View view, View view2, int i, int i2) {
        C0208p c0208p = this.f1927C;
        if (i2 == 1) {
            c0208p.f561b = i;
        } else {
            c0208p.f560a = i;
        }
        this.f1928D.m639g(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: b */
    public final void mo643b(View view, int i) {
        C0208p c0208p = this.f1927C;
        if (i == 1) {
            c0208p.f561b = 0;
        } else {
            c0208p.f560a = 0;
        }
        m1354w(i);
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: c */
    public final void mo644c(View view, int i, int i2, int[] iArr, int i3) {
        this.f1928D.m635c(i, i2, iArr, null, i3);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        if (this.f1934i.isFinished()) {
            return;
        }
        this.f1934i.computeScrollOffset();
        int currY = this.f1934i.getCurrY();
        int i2 = currY - this.f1925A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1936k;
        EdgeEffect edgeEffect2 = this.f1935j;
        if (i2 <= 0 || AbstractC1687o.m4949t(edgeEffect2) == 0.0f) {
            if (i2 < 0 && AbstractC1687o.m4949t(edgeEffect) != 0.0f) {
                float f2 = height;
                round = Math.round(AbstractC1687o.m4915J(edgeEffect, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i2) {
                    edgeEffect.finish();
                }
            }
            this.f1925A = currY;
            int[] iArr = this.f1950y;
            iArr[1] = 0;
            this.f1928D.m635c(0, i2, iArr, null, 1);
            i = i2 - iArr[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                m1347p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.f1928D.m636d(0, scrollY2, 0, i3, this.f1949x, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1934i.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1934i.getCurrVelocity());
                    }
                }
                this.f1934i.abortAnimation();
                m1354w(1);
            }
            if (this.f1934i.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m1354w(1);
                return;
            }
        }
        round = Math.round(AbstractC1687o.m4915J(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect2.finish();
        }
        i2 -= round;
        this.f1925A = currY;
        int[] iArr2 = this.f1950y;
        iArr2[1] = 0;
        this.f1928D.m635c(0, i2, iArr2, null, 1);
        i = i2 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f1934i.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // p022K.InterfaceC0206o
    /* renamed from: d */
    public final void mo648d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1345n(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1341i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1928D.m633a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1928D.m634b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1928D.m635c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1928D.m636d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1935j;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (AbstractC0275i.m804a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (AbstractC0275i.m804a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1936k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0275i.m804a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (AbstractC0275i.m804a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: e */
    public final void mo645e(View view, int i, int i2, int i3, int i4, int i5) {
        m1345n(i4, i5, null);
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: f */
    public final boolean mo646f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: g */
    public final boolean m1339g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1344m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1350s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1933h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m1350s(m1340h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !m1344m(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0208p c0208p = this.f1927C;
        return c0208p.f561b | c0208p.f560a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1929E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1929E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1929E;
    }

    /* renamed from: h */
    public final int m1340h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1928D.m638f(0);
    }

    /* renamed from: i */
    public final boolean m1341i(KeyEvent keyEvent) {
        this.f1933h.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? m1343k(33) : m1339g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? m1343k(130) : m1339g(130);
                }
                if (keyCode == 62) {
                    m1348q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m1343k(33);
                }
                if (keyCode == 93) {
                    return m1343k(130);
                }
                if (keyCode == 122) {
                    m1348q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                m1348q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1928D.f546d;
    }

    /* renamed from: j */
    public final void m1342j(int i) {
        if (getChildCount() > 0) {
            this.f1934i.fling(getScrollX(), getScrollY(), 0, i, 0, 0, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE, 0, 0);
            this.f1928D.m639g(2, 1);
            this.f1925A = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: k */
    public final boolean m1343k(int i) {
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1933h;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1349r(i, rect.top, rect.bottom);
    }

    /* renamed from: m */
    public final boolean m1344m(View view, int i, int i2) {
        Rect rect = this.f1933h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m1345n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1928D.m636d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: o */
    public final void m1346o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1948w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1937l = (int) motionEvent.getY(i);
            this.f1948w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1942q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1939n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        int i;
        int i2;
        char c2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c3;
        boolean z2;
        VelocityTracker velocityTracker;
        float f3;
        float f4;
        long j2;
        float sqrt;
        int i4;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i5;
        float f5;
        if (motionEvent.getAction() != 8 || this.f1941p) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            f2 = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f2 = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            i = 26;
        } else {
            f2 = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f2 == 0.0f) {
            return false;
        }
        m1350s(-((int) (getVerticalScrollFactorCompat() * f2)), i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0190g c0190g = this.f1930F;
        c0190g.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i6 = c0190g.f517f;
        int[] iArr = c0190g.f519h;
        if (i6 == source && c0190g.f518g == deviceId && c0190g.f516e == i) {
            c3 = 0;
            z2 = false;
        } else {
            Context context = c0190g.f512a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                i3 = AbstractC0172U.m512b(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    c2 = 0;
                    i3 = Integer.MAX_VALUE;
                    iArr[c2] = i3;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i7 < 34) {
                        scaledMaximumFlingVelocity = AbstractC0172U.m511a(viewConfiguration, deviceId3, i, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        boolean z3 = (device2 == null || device2.getMotionRange(i, source3) == null) ? false : true;
                        int i8 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                        if (z3) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                i8 = dimensionPixelSize;
                            }
                        }
                        scaledMaximumFlingVelocity = i8;
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0190g.f517f = source;
                    c0190g.f518g = deviceId;
                    c0190g.f516e = i;
                    c3 = 0;
                    z2 = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        i3 = Integer.MAX_VALUE;
                    }
                    i3 = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = i3;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i7 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0190g.f517f = source;
            c0190g.f518g = deviceId;
            c0190g.f516e = i;
            c3 = 0;
            z2 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0190g.f514c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0190g.f514c = null;
            }
        } else {
            if (c0190g.f514c == null) {
                c0190g.f514c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0190g.f514c;
            Map map = AbstractC0224x.f575a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0224x.f575a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C0226y());
                }
                C0226y c0226y = (C0226y) map2.get(velocityTracker4);
                c0226y.getClass();
                long eventTime = motionEvent.getEventTime();
                int i9 = c0226y.f581d;
                long[] jArr = c0226y.f579b;
                if (i9 != 0 && eventTime - jArr[c0226y.f582e] > 40) {
                    c0226y.f581d = 0;
                    c0226y.f580c = 0.0f;
                }
                int i10 = (c0226y.f582e + 1) % 20;
                c0226y.f582e = i10;
                int i11 = c0226y.f581d;
                if (i11 != 20) {
                    c0226y.f581d = i11 + 1;
                }
                c0226y.f578a[i10] = motionEvent.getAxisValue(26);
                jArr[c0226y.f582e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C0226y c0226y2 = (C0226y) AbstractC0224x.f575a.get(velocityTracker4);
            if (c0226y2 != null) {
                int i12 = c0226y2.f581d;
                if (i12 >= 2) {
                    int i13 = c0226y2.f582e;
                    int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                    long[] jArr2 = c0226y2.f579b;
                    long j3 = jArr2[i13];
                    while (true) {
                        j2 = jArr2[i14];
                        if (j3 - j2 <= 100) {
                            break;
                        }
                        c0226y2.f581d--;
                        i14 = (i14 + 1) % 20;
                    }
                    int i15 = c0226y2.f581d;
                    if (i15 >= 2) {
                        float[] fArr2 = c0226y2.f578a;
                        if (i15 == 2) {
                            int i16 = (i14 + 1) % 20;
                            if (j2 != jArr2[i16]) {
                                velocityTracker = velocityTracker4;
                                i4 = 1000;
                                sqrt = fArr2[i16] / (r7 - j2);
                            }
                        } else {
                            float f6 = 0.0f;
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 >= c0226y2.f581d - 1) {
                                    break;
                                }
                                int i19 = i17 + i14;
                                long j4 = jArr2[i19 % 20];
                                int i20 = (i19 + 1) % 20;
                                if (jArr2[i20] == j4) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i5 = 1;
                                } else {
                                    i18++;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                    float f7 = fArr2[i20];
                                    long j5 = jArr2[i20];
                                    fArr = fArr2;
                                    float f8 = f7 / (j5 - j4);
                                    float abs = (Math.abs(f8) * (f8 - sqrt2)) + f6;
                                    i5 = 1;
                                    if (i18 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f6 = abs;
                                }
                                i17 += i5;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            sqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                            i4 = 1000;
                        }
                        f5 = sqrt * i4;
                        c0226y2.f580c = f5;
                        if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                            c0226y2.f580c = -Math.abs(Float.MAX_VALUE);
                        } else if (c0226y2.f580c > Math.abs(Float.MAX_VALUE)) {
                            c0226y2.f580c = Math.abs(Float.MAX_VALUE);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                i4 = 1000;
                sqrt = 0.0f;
                f5 = sqrt * i4;
                c0226y2.f580c = f5;
                if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f3 = AbstractC0222w.m686a(velocityTracker, i);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i == 0) {
                    f3 = velocityTracker5.getXVelocity();
                } else if (i == 1) {
                    f3 = velocityTracker5.getYVelocity();
                } else {
                    C0226y c0226y3 = (C0226y) AbstractC0224x.f575a.get(velocityTracker5);
                    f3 = (c0226y3 == null || i != 26) ? 0.0f : c0226y3.f580c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0190g.f513b.f3011g;
            float f9 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f9);
            if (z2 || (signum != Math.signum(c0190g.f515d) && signum != 0.0f)) {
                nestedScrollView.f1934i.abortAnimation();
            }
            if (Math.abs(f9) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f9, iArr[1]));
                if (max == 0.0f) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView.f1934i.abortAnimation();
                    nestedScrollView.m1342j((int) max);
                    f4 = max;
                }
                c0190g.f515d = f4;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1941p) {
            return true;
        }
        int i = action & Function.USE_VARARGS;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1948w;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1937l) > this.f1945t && (2 & getNestedScrollAxes()) == 0) {
                                this.f1941p = true;
                                this.f1937l = y2;
                                if (this.f1942q == null) {
                                    this.f1942q = VelocityTracker.obtain();
                                }
                                this.f1942q.addMovement(motionEvent);
                                this.f1951z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1346o(motionEvent);
                    }
                }
            }
            this.f1941p = false;
            this.f1948w = -1;
            VelocityTracker velocityTracker = this.f1942q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1942q = null;
            }
            if (this.f1934i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m1354w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1937l = y3;
                    this.f1948w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1942q;
                    if (velocityTracker2 == null) {
                        this.f1942q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1942q.addMovement(motionEvent);
                    this.f1934i.computeScrollOffset();
                    if (!m1353v(motionEvent) && this.f1934i.isFinished()) {
                        z2 = false;
                    }
                    this.f1941p = z2;
                    this.f1928D.m639g(2, 0);
                }
            }
            if (!m1353v(motionEvent) && this.f1934i.isFinished()) {
                z2 = false;
            }
            this.f1941p = z2;
            VelocityTracker velocityTracker3 = this.f1942q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1942q = null;
            }
        }
        return this.f1941p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z2, i, i2, i3, i4);
        int i6 = 0;
        this.f1938m = false;
        View view = this.f1940o;
        if (view != null && m1338l(view, this)) {
            View view2 = this.f1940o;
            Rect rect = this.f1933h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1340h = m1340h(rect);
            if (m1340h != 0) {
                scrollBy(0, m1340h);
            }
        }
        this.f1940o = null;
        if (!this.f1939n) {
            if (this.f1926B != null) {
                scrollTo(getScrollX(), this.f1926B.f737a);
                this.f1926B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1939n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1943r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        m1342j((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1928D.m634b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f1928D.m635c(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1345n(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo642a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && m1344m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0277k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0277k c0277k = (C0277k) parcelable;
        super.onRestoreInstanceState(c0277k.getSuperState());
        this.f1926B = c0277k;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0277k c0277k = new C0277k(super.onSaveInstanceState());
        c0277k.f737a = getScrollY();
        return c0277k;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1344m(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f1933h;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int m1340h = m1340h(rect);
        if (m1340h != 0) {
            if (this.f1944s) {
                m1352u(0, false, m1340h);
            } else {
                scrollBy(0, m1340h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo646f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo643b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1942q == null) {
            this.f1942q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1951z = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, this.f1951z);
        C0202m c0202m = this.f1928D;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1936k;
            EdgeEffect edgeEffect2 = this.f1935j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1942q;
                velocityTracker.computeCurrentVelocity(1000, this.f1947v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1948w);
                if (Math.abs(yVelocity) >= this.f1946u) {
                    if (AbstractC1687o.m4949t(edgeEffect2) != 0.0f) {
                        if (m1351t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m1342j(-yVelocity);
                        }
                    } else if (AbstractC1687o.m4949t(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (m1351t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            m1342j(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f3 = i2;
                        if (!c0202m.m634b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            m1342j(i2);
                        }
                    }
                } else if (this.f1934i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1948w = -1;
                this.f1941p = false;
                VelocityTracker velocityTracker2 = this.f1942q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1942q = null;
                }
                m1354w(0);
                this.f1935j.onRelease();
                this.f1936k.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1948w);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1948w + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.f1937l - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (AbstractC1687o.m4949t(edgeEffect2) != 0.0f) {
                        float f4 = -AbstractC1687o.m4915J(edgeEffect2, -height, x2);
                        if (AbstractC1687o.m4949t(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (AbstractC1687o.m4949t(edgeEffect) != 0.0f) {
                        float m4915J = AbstractC1687o.m4915J(edgeEffect, height, 1.0f - x2);
                        if (AbstractC1687o.m4949t(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = m4915J;
                    }
                    int round = Math.round(f2 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i4 = i3 - round;
                    if (!this.f1941p && Math.abs(i4) > this.f1945t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1941p = true;
                        i4 = i4 > 0 ? i4 - this.f1945t : i4 + this.f1945t;
                    }
                    if (this.f1941p) {
                        int m1350s = m1350s(i4, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f1937l = y2 - m1350s;
                        this.f1951z += m1350s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1941p && getChildCount() > 0 && this.f1934i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1948w = -1;
                this.f1941p = false;
                VelocityTracker velocityTracker3 = this.f1942q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1942q = null;
                }
                m1354w(0);
                this.f1935j.onRelease();
                this.f1936k.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1937l = (int) motionEvent.getY(actionIndex);
                this.f1948w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1346o(motionEvent);
                this.f1937l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1948w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1941p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1934i.isFinished()) {
                this.f1934i.abortAnimation();
                m1354w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1937l = y3;
            this.f1948w = pointerId;
            c0202m.m639g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1942q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final boolean m1347p(int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z2 = false;
        } else {
            i2 = 0;
            z2 = true;
        }
        if (i5 <= i4) {
            if (i5 >= 0) {
                i4 = i5;
                z3 = false;
                if (z3 && !this.f1928D.m638f(1)) {
                    this.f1934i.springBack(i2, i4, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i2, i4);
                return z2 || z3;
            }
            i4 = 0;
        }
        z3 = true;
        if (z3) {
            this.f1934i.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        if (z2) {
            return true;
        }
    }

    /* renamed from: q */
    public final void m1348q(int i) {
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1933h;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m1349r(i, i2, i3);
    }

    /* renamed from: r */
    public final boolean m1349r(int i, int i2, int i3) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z3 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z5 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1350s(z3 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1938m) {
            this.f1940o = view2;
        } else {
            Rect rect = this.f1933h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1340h = m1340h(rect);
            if (m1340h != 0) {
                scrollBy(0, m1340h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m1340h = m1340h(rect);
        boolean z3 = m1340h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, m1340h);
            } else {
                m1352u(0, false, m1340h);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1942q) != null) {
            velocityTracker.recycle();
            this.f1942q = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1938m = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final int m1350s(int i, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        VelocityTracker velocityTracker;
        C0202m c0202m = this.f1928D;
        if (i3 == 1) {
            c0202m.m639g(2, i3);
        }
        boolean m635c = this.f1928D.m635c(0, i, this.f1950y, this.f1949x, i3);
        int[] iArr = this.f1950y;
        int[] iArr2 = this.f1949x;
        if (m635c) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m1347p(i4, 0, scrollY, scrollRange) && !c0202m.m638f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1928D.m636d(0, scrollY2, 0, i4 - scrollY2, this.f1949x, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f1936k;
        EdgeEffect edgeEffect2 = this.f1935j;
        if (i8 < 0) {
            if (z4) {
                AbstractC1687o.m4915J(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z4) {
            AbstractC1687o.m4915J(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i3 == 0 && (velocityTracker = this.f1942q) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m1354w(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1943r) {
            this.f1943r = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0202m c0202m = this.f1928D;
        if (c0202m.f546d) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            AbstractC0158F.m445z(c0202m.f545c);
        }
        c0202m.f546d = z2;
    }

    public void setOnScrollChangeListener(InterfaceC0276j interfaceC0276j) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1944s = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f1928D.m639g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1354w(0);
    }

    /* renamed from: t */
    public final boolean m1351t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float m4949t = AbstractC1687o.m4949t(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1931f * 0.015f;
        double log = Math.log(abs / f2);
        double d = f1922G;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < m4949t;
    }

    /* renamed from: u */
    public final void m1352u(int i, boolean z2, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1932g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1934i.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1928D.m639g(2, 1);
            } else {
                m1354w(1);
            }
            this.f1925A = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1934i.isFinished()) {
                this.f1934i.abortAnimation();
                m1354w(1);
            }
            scrollBy(i, i2);
        }
        this.f1932g = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final boolean m1353v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1935j;
        if (AbstractC1687o.m4949t(edgeEffect) != 0.0f) {
            AbstractC1687o.m4915J(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1936k;
        if (AbstractC1687o.m4949t(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC1687o.m4915J(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: w */
    public final void m1354w(int i) {
        this.f1928D.m640h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
