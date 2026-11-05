package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {
    private List<ShapeModifierContent> shapeModifiers;
    private final Path tempPath;
    private final ShapeData tempShapeData;
    private Path valueCallbackEndPath;
    private Path valueCallbackStartPath;

    public ShapeKeyframeAnimation(List<Keyframe<ShapeData>> list) {
        super(list);
        this.tempShapeData = new ShapeData();
        this.tempPath = new Path();
    }

    public void setShapeModifiers(List<ShapeModifierContent> list) {
        this.shapeModifiers = list;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public boolean skipCache() {
        List<ShapeModifierContent> list = this.shapeModifiers;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public Path getValue(Keyframe<ShapeData> keyframe, float f2) {
        ShapeData shapeData = keyframe.startValue;
        ShapeData shapeData2 = keyframe.endValue;
        this.tempShapeData.interpolateBetween(shapeData, shapeData2 == null ? shapeData : shapeData2, f2);
        ShapeData shapeData3 = this.tempShapeData;
        List<ShapeModifierContent> list = this.shapeModifiers;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                shapeData3 = this.shapeModifiers.get(size).modifyShape(shapeData3);
            }
        }
        MiscUtils.getPathFromData(shapeData3, this.tempPath);
        if (this.valueCallback == null) {
            return this.tempPath;
        }
        if (this.valueCallbackStartPath == null) {
            this.valueCallbackStartPath = new Path();
            this.valueCallbackEndPath = new Path();
        }
        MiscUtils.getPathFromData(shapeData, this.valueCallbackStartPath);
        if (shapeData2 != null) {
            MiscUtils.getPathFromData(shapeData2, this.valueCallbackEndPath);
        }
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        float f3 = keyframe.startFrame;
        float floatValue = keyframe.endFrame.floatValue();
        Path path = this.valueCallbackStartPath;
        return (Path) lottieValueCallback.getValueInternal(f3, floatValue, path, shapeData2 == null ? path : this.valueCallbackEndPath, f2, getLinearCurrentKeyframeProgress(), getProgress());
    }
}
