package p082l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.altaysoft.t500_split.media.C0639g;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p003B.C0043j;
import p008D.AbstractC0074e;
import p008D.InterfaceC0073d;
import p022K.C0198k;
import p038T.C0315i;
import p042V.C0340b;
import p042V.C0343e;
import p042V.C0346h;
import p042V.C0347i;
import p067f.AbstractC0770a;
import p121y0.AbstractC1687o;

/* renamed from: l.B */
/* loaded from: classes.dex */
public class C1051B implements InterfaceC1092W {

    /* renamed from: d */
    public static final int[] f5021d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final /* synthetic */ int f5022a;

    /* renamed from: b */
    public final View f5023b;

    /* renamed from: c */
    public Object f5024c;

    public C1051B(AbsSeekBar absSeekBar) {
        this.f5022a = 0;
        this.f5023b = absSeekBar;
    }

    @Override // p082l.InterfaceC1092W
    /* renamed from: a */
    public void mo2654a(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // p082l.InterfaceC1092W
    /* renamed from: b */
    public void mo2655b(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // p082l.InterfaceC1092W
    /* renamed from: c */
    public void mo2656c(int i, float f2) {
    }

    /* renamed from: d */
    public KeyListener m2657d(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0043j) ((C0639g) this.f5024c).f3011g).getClass();
        if (keyListener instanceof C0343e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0343e(keyListener);
    }

    /* renamed from: e */
    public void mo2658e(AttributeSet attributeSet, int i) {
        switch (this.f5022a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f5023b;
                C0198k m591r = C0198k.m591r(absSeekBar.getContext(), attributeSet, f5021d, i);
                Drawable m599i = m591r.m599i(0);
                if (m599i != null) {
                    if (m599i instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) m599i;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable m2661h = m2661h(animationDrawable.getFrame(i2), true);
                            m2661h.setLevel(10000);
                            animationDrawable2.addFrame(m2661h, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        m599i = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(m599i);
                }
                Drawable m599i2 = m591r.m599i(1);
                if (m599i2 != null) {
                    absSeekBar.setProgressDrawable(m2661h(m599i2, false));
                }
                m591r.m609t();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f5023b).getContext().obtainStyledAttributes(attributeSet, AbstractC0770a.f3902i, i, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    m2660g(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* renamed from: f */
    public C0340b m2659f(InputConnection inputConnection, EditorInfo editorInfo) {
        C0639g c0639g = (C0639g) this.f5024c;
        if (inputConnection == null) {
            c0639g.getClass();
            inputConnection = null;
        } else {
            C0043j c0043j = (C0043j) c0639g.f3011g;
            c0043j.getClass();
            if (!(inputConnection instanceof C0340b)) {
                inputConnection = new C0340b((EditText) c0043j.f141g, inputConnection, editorInfo);
            }
        }
        return (C0340b) inputConnection;
    }

    /* renamed from: g */
    public void m2660g(boolean z2) {
        C0347i c0347i = (C0347i) ((C0043j) ((C0639g) this.f5024c).f3011g).f142h;
        if (c0347i.f987h != z2) {
            if (c0347i.f986g != null) {
                C0315i m895a = C0315i.m895a();
                C0346h c0346h = c0347i.f986g;
                m895a.getClass();
                AbstractC1687o.m4939h("initCallback cannot be null", c0346h);
                ReentrantReadWriteLock reentrantReadWriteLock = m895a.f890a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    m895a.f891b.remove(c0346h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0347i.f987h = z2;
            if (z2) {
                C0347i.m938a(c0347i.f985f, C0315i.m895a().m896b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public Drawable m2661h(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0073d) {
            ((AbstractC0074e) ((InterfaceC0073d) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m2661h(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f5024c) == null) {
                    this.f5024c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C1051B(EditText editText) {
        this.f5022a = 1;
        this.f5023b = editText;
        this.f5024c = new C0639g(editText);
    }

    public C1051B(C1096Y c1096y) {
        this.f5022a = 2;
        this.f5024c = c1096y;
        this.f5022a = 2;
        this.f5023b = c1096y;
    }
}
