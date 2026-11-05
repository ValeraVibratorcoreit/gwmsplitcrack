package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float POLYGON_MAGIC_NUMBER = 0.25f;
    private static final float POLYSTAR_MAGIC_NUMBER = 0.47829f;
    private final boolean hidden;
    private final BaseKeyframeAnimation<?, Float> innerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> innerRoundednessAnimation;
    private boolean isPathValid;
    private final boolean isReversed;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, Float> outerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> outerRoundednessAnimation;
    private final BaseKeyframeAnimation<?, Float> pointsAnimation;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, Float> rotationAnimation;
    private final PolystarShape.Type type;
    private final Path path = new Path();
    private final Path lastSegmentPath = new Path();
    private final PathMeasure lastSegmentPathMeasure = new PathMeasure();
    private final float[] lastSegmentPosition = new float[2];
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    /* renamed from: com.airbnb.lottie.animation.content.PolystarContent$1 */
    public static /* synthetic */ class C05911 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.lottieDrawable = lottieDrawable;
        this.name = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.type = type;
        this.hidden = polystarShape.isHidden();
        this.isReversed = polystarShape.isReversed();
        FloatKeyframeAnimation createAnimation = polystarShape.getPoints().createAnimation();
        this.pointsAnimation = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = polystarShape.getPosition().createAnimation();
        this.positionAnimation = createAnimation2;
        FloatKeyframeAnimation createAnimation3 = polystarShape.getRotation().createAnimation();
        this.rotationAnimation = createAnimation3;
        FloatKeyframeAnimation createAnimation4 = polystarShape.getOuterRadius().createAnimation();
        this.outerRadiusAnimation = createAnimation4;
        FloatKeyframeAnimation createAnimation5 = polystarShape.getOuterRoundedness().createAnimation();
        this.outerRoundednessAnimation = createAnimation5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.innerRadiusAnimation = polystarShape.getInnerRadius().createAnimation();
            this.innerRoundednessAnimation = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.innerRadiusAnimation = null;
            this.innerRoundednessAnimation = null;
        }
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        baseLayer.addAnimation(createAnimation4);
        baseLayer.addAnimation(createAnimation5);
        if (type == type2) {
            baseLayer.addAnimation(this.innerRadiusAnimation);
            baseLayer.addAnimation(this.innerRoundednessAnimation);
        }
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
        createAnimation4.addUpdateListener(this);
        createAnimation5.addUpdateListener(this);
        if (type == type2) {
            this.innerRadiusAnimation.addUpdateListener(this);
            this.innerRoundednessAnimation.addUpdateListener(this);
        }
    }

    private void createPolygonPath() {
        double d;
        float f2;
        PolystarContent polystarContent;
        PolystarContent polystarContent2 = this;
        int floor = (int) Math.floor(polystarContent2.pointsAnimation.getValue().floatValue());
        double radians = Math.toRadians((polystarContent2.rotationAnimation == null ? 0.0d : r2.getValue().floatValue()) - 90.0d);
        double d2 = floor;
        float floatValue = polystarContent2.outerRoundednessAnimation.getValue().floatValue() / 100.0f;
        float floatValue2 = polystarContent2.outerRadiusAnimation.getValue().floatValue();
        double d3 = floatValue2;
        float cos = (float) (Math.cos(radians) * d3);
        float sin = (float) (Math.sin(radians) * d3);
        polystarContent2.path.moveTo(cos, sin);
        double d4 = (float) (6.283185307179586d / d2);
        double ceil = Math.ceil(d2);
        double d5 = radians + d4;
        int i = 0;
        while (true) {
            double d6 = i;
            if (d6 >= ceil) {
                PolystarContent polystarContent3 = polystarContent2;
                PointF value = polystarContent3.positionAnimation.getValue();
                polystarContent3.path.offset(value.x, value.y);
                polystarContent3.path.close();
                return;
            }
            int i2 = i;
            float cos2 = (float) (Math.cos(d5) * d3);
            double d7 = d4;
            float sin2 = (float) (Math.sin(d5) * d3);
            if (floatValue != 0.0f) {
                d = d3;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f2 = sin2;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f3 = floatValue2 * floatValue * POLYGON_MAGIC_NUMBER;
                float f4 = cos3 * f3;
                float f5 = sin3 * f3;
                float f6 = cos4 * f3;
                float f7 = f3 * sin4;
                if (d6 == ceil - 1.0d) {
                    polystarContent = this;
                    polystarContent.lastSegmentPath.reset();
                    polystarContent.lastSegmentPath.moveTo(cos, sin);
                    float f8 = cos - f4;
                    float f9 = sin - f5;
                    float f10 = cos2 + f6;
                    float f11 = f7 + f2;
                    polystarContent.lastSegmentPath.cubicTo(f8, f9, f10, f11, cos2, f2);
                    polystarContent.lastSegmentPathMeasure.setPath(polystarContent.lastSegmentPath, false);
                    PathMeasure pathMeasure = polystarContent.lastSegmentPathMeasure;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, polystarContent.lastSegmentPosition, null);
                    Path path = polystarContent.path;
                    float[] fArr = polystarContent.lastSegmentPosition;
                    path.cubicTo(f8, f9, f10, f11, fArr[0], fArr[1]);
                } else {
                    polystarContent = this;
                    polystarContent.path.cubicTo(cos - f4, sin - f5, cos2 + f6, f2 + f7, cos2, f2);
                }
            } else {
                d = d3;
                f2 = sin2;
                polystarContent = polystarContent2;
                if (d6 == ceil - 1.0d) {
                    sin = f2;
                    cos = cos2;
                    d4 = d7;
                    i = i2 + 1;
                    polystarContent2 = polystarContent;
                    d3 = d;
                } else {
                    polystarContent.path.lineTo(cos2, f2);
                }
            }
            d5 += d7;
            sin = f2;
            cos = cos2;
            d4 = d7;
            i = i2 + 1;
            polystarContent2 = polystarContent;
            d3 = d;
        }
    }

    private void createStarPath() {
        int i;
        float f2;
        float f3;
        double d;
        float f4;
        float f5;
        float f6;
        float f7;
        double d2;
        float f8;
        float f9;
        float f10;
        double d3;
        float floatValue = this.pointsAnimation.getValue().floatValue();
        double radians = Math.toRadians((this.rotationAnimation == null ? 0.0d : r2.getValue().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f11 = (float) (6.283185307179586d / d4);
        if (this.isReversed) {
            f11 *= -1.0f;
        }
        float f12 = f11 / 2.0f;
        float f13 = floatValue - ((int) floatValue);
        int i2 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f13) * f12;
        }
        float floatValue2 = this.outerRadiusAnimation.getValue().floatValue();
        float floatValue3 = this.innerRadiusAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.innerRoundednessAnimation;
        float floatValue4 = baseKeyframeAnimation != null ? baseKeyframeAnimation.getValue().floatValue() / 100.0f : 0.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.outerRoundednessAnimation;
        float floatValue5 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f5 = AbstractC0062j.m149c(floatValue2, floatValue3, f13, floatValue3);
            i = i2;
            double d5 = f5;
            float cos = (float) (Math.cos(radians) * d5);
            f4 = (float) (Math.sin(radians) * d5);
            this.path.moveTo(cos, f4);
            d = radians + ((f11 * f13) / 2.0f);
            f2 = cos;
            f3 = f12;
        } else {
            i = i2;
            double d6 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.path.moveTo(cos2, sin);
            f2 = cos2;
            f3 = f12;
            d = radians + f3;
            f4 = sin;
            f5 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f14 = f3;
        float f15 = f2;
        boolean z2 = false;
        while (true) {
            double d7 = i3;
            if (d7 >= ceil) {
                PointF value = this.positionAnimation.getValue();
                this.path.offset(value.x, value.y);
                this.path.close();
                return;
            }
            float f16 = z2 ? floatValue2 : floatValue3;
            if (f5 == 0.0f || d7 != ceil - 2.0d) {
                f6 = f11;
                f7 = f14;
            } else {
                f6 = f11;
                f7 = (f11 * f13) / 2.0f;
            }
            if (f5 == 0.0f || d7 != ceil - 1.0d) {
                d2 = d7;
                f8 = f5;
                f5 = f16;
            } else {
                d2 = d7;
                f8 = f5;
            }
            double d8 = f5;
            double d9 = ceil;
            float cos3 = (float) (Math.cos(d) * d8);
            float sin2 = (float) (d8 * Math.sin(d));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.path.lineTo(cos3, sin2);
                d3 = d;
                f9 = floatValue4;
                f10 = floatValue5;
            } else {
                f9 = floatValue4;
                double atan2 = (float) (Math.atan2(f4, f15) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f10 = floatValue5;
                d3 = d;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f17 = z2 ? f9 : f10;
                float f18 = z2 ? f10 : f9;
                float f19 = z2 ? floatValue3 : floatValue2;
                float f20 = z2 ? floatValue2 : floatValue3;
                float f21 = f19 * f17 * POLYSTAR_MAGIC_NUMBER;
                float f22 = cos4 * f21;
                float f23 = f21 * sin3;
                float f24 = f20 * f18 * POLYSTAR_MAGIC_NUMBER;
                float f25 = cos5 * f24;
                float f26 = f24 * sin4;
                if (i != 0) {
                    if (i3 == 0) {
                        f22 *= f13;
                        f23 *= f13;
                    } else if (d2 == d9 - 1.0d) {
                        f25 *= f13;
                        f26 *= f13;
                    }
                }
                this.path.cubicTo(f15 - f22, f4 - f23, cos3 + f25, sin2 + f26, cos3, sin2);
            }
            d = d3 + f7;
            z2 = !z2;
            i3++;
            f15 = cos3;
            f4 = sin2;
            floatValue5 = f10;
            floatValue4 = f9;
            f5 = f8;
            f11 = f6;
            ceil = d9;
        }
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t2 == LottieProperty.POLYSTAR_POINTS) {
            this.pointsAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_ROTATION) {
            this.rotationAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.innerRadiusAnimation) != null) {
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.outerRadiusAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t2 == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.innerRoundednessAnimation) != null) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t2 == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.outerRoundednessAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        int i = C05911.$SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[this.type.ordinal()];
        if (i == 1) {
            createStarPath();
        } else if (i == 2) {
            createPolygonPath();
        }
        this.path.close();
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        invalidate();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(trimPathContent);
                    trimPathContent.addListener(this);
                }
            }
        }
    }
}
