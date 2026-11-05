package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector;
import com.airbnb.lottie.model.animatable.AnimatableTextStyle;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p091o.AbstractC1194d;
import p091o.C1195e;

/* loaded from: classes.dex */
public class TextLayer extends BaseLayer {
    private final C1195e codePointCache;
    private BaseKeyframeAnimation<Integer, Integer> colorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> colorCallbackAnimation;
    private final LottieComposition composition;
    private final Map<FontCharacter, List<ContentGroup>> contentsForCharacter;
    private final Paint fillPaint;
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix;
    private BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final RectF rectF;
    private final StringBuilder stringBuilder;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorCallbackAnimation;
    private final Paint strokePaint;
    private BaseKeyframeAnimation<Float, Float> strokeWidthAnimation;
    private BaseKeyframeAnimation<Float, Float> strokeWidthCallbackAnimation;
    private final TextKeyframeAnimation textAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeEndAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeOffsetAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeStartAnimation;
    private TextRangeUnits textRangeUnits;
    private BaseKeyframeAnimation<Float, Float> textSizeCallbackAnimation;
    private final List<TextSubLine> textSubLines;
    private BaseKeyframeAnimation<Float, Float> trackingAnimation;
    private BaseKeyframeAnimation<Float, Float> trackingCallbackAnimation;
    private BaseKeyframeAnimation<Typeface, Typeface> typefaceCallbackAnimation;

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$3 */
    public static /* synthetic */ class C06113 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class TextSubLine {
        private String text;
        private float width;

        private TextSubLine() {
            this.text = "";
            this.width = 0.0f;
        }

        public void set(String str, float f2) {
            this.text = str;
            this.width = f2;
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        AnimatableTextRangeSelector animatableTextRangeSelector;
        AnimatableTextRangeSelector animatableTextRangeSelector2;
        AnimatableIntegerValue animatableIntegerValue;
        AnimatableTextRangeSelector animatableTextRangeSelector3;
        AnimatableIntegerValue animatableIntegerValue2;
        AnimatableTextRangeSelector animatableTextRangeSelector4;
        AnimatableIntegerValue animatableIntegerValue3;
        AnimatableTextStyle animatableTextStyle;
        AnimatableIntegerValue animatableIntegerValue4;
        AnimatableTextStyle animatableTextStyle2;
        AnimatableFloatValue animatableFloatValue;
        AnimatableTextStyle animatableTextStyle3;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableTextStyle animatableTextStyle4;
        AnimatableColorValue animatableColorValue;
        AnimatableTextStyle animatableTextStyle5;
        AnimatableColorValue animatableColorValue2;
        this.stringBuilder = new StringBuilder(2);
        this.rectF = new RectF();
        this.matrix = new Matrix();
        int i = 1;
        this.fillPaint = new Paint(i) { // from class: com.airbnb.lottie.model.layer.TextLayer.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.strokePaint = new Paint(i) { // from class: com.airbnb.lottie.model.layer.TextLayer.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.contentsForCharacter = new HashMap();
        this.codePointCache = new C1195e();
        this.textSubLines = new ArrayList();
        this.textRangeUnits = TextRangeUnits.INDEX;
        this.lottieDrawable = lottieDrawable;
        this.composition = layer.getComposition();
        TextKeyframeAnimation createAnimation = layer.getText().createAnimation();
        this.textAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        addAnimation(createAnimation);
        AnimatableTextProperties textProperties = layer.getTextProperties();
        if (textProperties != null && (animatableTextStyle5 = textProperties.textStyle) != null && (animatableColorValue2 = animatableTextStyle5.color) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation2 = animatableColorValue2.createAnimation();
            this.colorAnimation = createAnimation2;
            createAnimation2.addUpdateListener(this);
            addAnimation(this.colorAnimation);
        }
        if (textProperties != null && (animatableTextStyle4 = textProperties.textStyle) != null && (animatableColorValue = animatableTextStyle4.stroke) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation3 = animatableColorValue.createAnimation();
            this.strokeColorAnimation = createAnimation3;
            createAnimation3.addUpdateListener(this);
            addAnimation(this.strokeColorAnimation);
        }
        if (textProperties != null && (animatableTextStyle3 = textProperties.textStyle) != null && (animatableFloatValue2 = animatableTextStyle3.strokeWidth) != null) {
            FloatKeyframeAnimation createAnimation4 = animatableFloatValue2.createAnimation();
            this.strokeWidthAnimation = createAnimation4;
            createAnimation4.addUpdateListener(this);
            addAnimation(this.strokeWidthAnimation);
        }
        if (textProperties != null && (animatableTextStyle2 = textProperties.textStyle) != null && (animatableFloatValue = animatableTextStyle2.tracking) != null) {
            FloatKeyframeAnimation createAnimation5 = animatableFloatValue.createAnimation();
            this.trackingAnimation = createAnimation5;
            createAnimation5.addUpdateListener(this);
            addAnimation(this.trackingAnimation);
        }
        if (textProperties != null && (animatableTextStyle = textProperties.textStyle) != null && (animatableIntegerValue4 = animatableTextStyle.opacity) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation6 = animatableIntegerValue4.createAnimation();
            this.opacityAnimation = createAnimation6;
            createAnimation6.addUpdateListener(this);
            addAnimation(this.opacityAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector4 = textProperties.rangeSelector) != null && (animatableIntegerValue3 = animatableTextRangeSelector4.start) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation7 = animatableIntegerValue3.createAnimation();
            this.textRangeStartAnimation = createAnimation7;
            createAnimation7.addUpdateListener(this);
            addAnimation(this.textRangeStartAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector3 = textProperties.rangeSelector) != null && (animatableIntegerValue2 = animatableTextRangeSelector3.end) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation8 = animatableIntegerValue2.createAnimation();
            this.textRangeEndAnimation = createAnimation8;
            createAnimation8.addUpdateListener(this);
            addAnimation(this.textRangeEndAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector2 = textProperties.rangeSelector) != null && (animatableIntegerValue = animatableTextRangeSelector2.offset) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation9 = animatableIntegerValue.createAnimation();
            this.textRangeOffsetAnimation = createAnimation9;
            createAnimation9.addUpdateListener(this);
            addAnimation(this.textRangeOffsetAnimation);
        }
        if (textProperties == null || (animatableTextRangeSelector = textProperties.rangeSelector) == null) {
            return;
        }
        this.textRangeUnits = animatableTextRangeSelector.units;
    }

    private String codePointToString(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!isModifier(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        C1195e c1195e = this.codePointCache;
        long j2 = codePointAt;
        if (c1195e.f5391a) {
            c1195e.m2854b();
        }
        if (AbstractC1194d.m2852b(c1195e.f5392b, c1195e.f5394d, j2) >= 0) {
            return (String) this.codePointCache.m2855c(j2, null);
        }
        this.stringBuilder.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.stringBuilder.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.stringBuilder.toString();
        this.codePointCache.m2857e(j2, sb);
        return sb;
    }

    private void configurePaint(DocumentData documentData, int i, int i2) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
        if (baseKeyframeAnimation != null) {
            this.fillPaint.setColor(baseKeyframeAnimation.getValue().intValue());
        } else if (this.colorAnimation == null || !isIndexInRangeSelection(i2)) {
            this.fillPaint.setColor(documentData.color);
        } else {
            this.fillPaint.setColor(this.colorAnimation.getValue().intValue());
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
        if (baseKeyframeAnimation2 != null) {
            this.strokePaint.setColor(baseKeyframeAnimation2.getValue().intValue());
        } else if (this.strokeColorAnimation == null || !isIndexInRangeSelection(i2)) {
            this.strokePaint.setColor(documentData.strokeColor);
        } else {
            this.strokePaint.setColor(this.strokeColorAnimation.getValue().intValue());
        }
        int i3 = 100;
        int intValue = this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue();
        if (this.opacityAnimation != null && isIndexInRangeSelection(i2)) {
            i3 = this.opacityAnimation.getValue().intValue();
        }
        int round = Math.round((((i3 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        this.fillPaint.setAlpha(round);
        this.strokePaint.setAlpha(round);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
        if (baseKeyframeAnimation3 != null) {
            this.strokePaint.setStrokeWidth(baseKeyframeAnimation3.getValue().floatValue());
        } else if (this.strokeWidthAnimation == null || !isIndexInRangeSelection(i2)) {
            this.strokePaint.setStrokeWidth(Utils.dpScale() * documentData.strokeWidth);
        } else {
            this.strokePaint.setStrokeWidth(this.strokeWidthAnimation.getValue().floatValue());
        }
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void drawCharacterAsGlyph(FontCharacter fontCharacter, float f2, DocumentData documentData, Canvas canvas, int i, int i2) {
        configurePaint(documentData, i2, i);
        List<ContentGroup> contentsForCharacter = getContentsForCharacter(fontCharacter);
        for (int i3 = 0; i3 < contentsForCharacter.size(); i3++) {
            Path path = contentsForCharacter.get(i3).getPath();
            path.computeBounds(this.rectF, false);
            this.matrix.reset();
            this.matrix.preTranslate(0.0f, Utils.dpScale() * (-documentData.baselineShift));
            this.matrix.preScale(f2, f2);
            path.transform(this.matrix);
            if (documentData.strokeOverFill) {
                drawGlyph(path, this.fillPaint, canvas);
                drawGlyph(path, this.strokePaint, canvas);
            } else {
                drawGlyph(path, this.strokePaint, canvas);
                drawGlyph(path, this.fillPaint, canvas);
            }
        }
    }

    private void drawCharacterFromFont(String str, DocumentData documentData, Canvas canvas, int i, int i2) {
        configurePaint(documentData, i2, i);
        if (documentData.strokeOverFill) {
            drawCharacter(str, this.fillPaint, canvas);
            drawCharacter(str, this.strokePaint, canvas);
        } else {
            drawCharacter(str, this.strokePaint, canvas);
            drawCharacter(str, this.fillPaint, canvas);
        }
    }

    private void drawFontTextLine(String str, DocumentData documentData, Canvas canvas, float f2, int i, int i2) {
        int i3 = 0;
        while (i3 < str.length()) {
            String codePointToString = codePointToString(str, i3);
            drawCharacterFromFont(codePointToString, documentData, canvas, i + i3, i2);
            canvas.translate(this.fillPaint.measureText(codePointToString) + f2, 0.0f);
            i3 += codePointToString.length();
        }
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void drawGlyphTextLine(String str, DocumentData documentData, Font font, Canvas canvas, float f2, float f3, float f4, int i) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            FontCharacter fontCharacter = (FontCharacter) this.composition.getCharacters().m2875b(FontCharacter.hashFor(str.charAt(i2), font.getFamily(), font.getStyle()), null);
            if (fontCharacter != null) {
                drawCharacterAsGlyph(fontCharacter, f3, documentData, canvas, i2, i);
                canvas.translate((Utils.dpScale() * ((float) fontCharacter.getWidth()) * f3) + f4, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawTextWithFont(DocumentData documentData, Font font, Canvas canvas, int i) {
        float floatValue;
        int size;
        int i2;
        int i3;
        List<TextSubLine> list;
        Typeface typeface = getTypeface(font);
        if (typeface == null) {
            return;
        }
        String str = documentData.text;
        TextDelegate textDelegate = this.lottieDrawable.getTextDelegate();
        if (textDelegate != null) {
            str = textDelegate.getTextInternal(getName(), str);
        }
        this.fillPaint.setTypeface(typeface);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.textSizeCallbackAnimation;
        float floatValue2 = baseKeyframeAnimation != null ? baseKeyframeAnimation.getValue().floatValue() : documentData.size;
        this.fillPaint.setTextSize(Utils.dpScale() * floatValue2);
        this.strokePaint.setTypeface(this.fillPaint.getTypeface());
        this.strokePaint.setTextSize(this.fillPaint.getTextSize());
        float f2 = documentData.tracking / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.trackingCallbackAnimation;
        if (baseKeyframeAnimation2 == null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.trackingAnimation;
            if (baseKeyframeAnimation3 != null) {
                floatValue = baseKeyframeAnimation3.getValue().floatValue();
            }
            float dpScale = ((Utils.dpScale() * f2) * floatValue2) / 100.0f;
            List<String> textLines = getTextLines(str);
            size = textLines.size();
            int i4 = -1;
            int i5 = 0;
            for (i2 = 0; i2 < size; i2++) {
                String str2 = textLines.get(i2);
                PointF pointF = documentData.boxSize;
                List<TextSubLine> splitGlyphTextIntoLines = splitGlyphTextIntoLines(str2, pointF == null ? 0.0f : pointF.x, font, 0.0f, dpScale, false);
                int i6 = 0;
                while (i6 < splitGlyphTextIntoLines.size()) {
                    TextSubLine textSubLine = splitGlyphTextIntoLines.get(i6);
                    i4++;
                    canvas.save();
                    if (offsetCanvas(canvas, documentData, i4, (this.textAnimation == null && this.textSizeCallbackAnimation == null && this.trackingCallbackAnimation == null) ? textSubLine.width : this.fillPaint.measureText(textSubLine.text))) {
                        i3 = i6;
                        list = splitGlyphTextIntoLines;
                        drawFontTextLine(textSubLine.text, documentData, canvas, dpScale, i5, i);
                    } else {
                        i3 = i6;
                        list = splitGlyphTextIntoLines;
                    }
                    i5 = textSubLine.text.length() + i5;
                    canvas.restore();
                    i6 = i3 + 1;
                    splitGlyphTextIntoLines = list;
                }
            }
        }
        floatValue = baseKeyframeAnimation2.getValue().floatValue();
        f2 += floatValue;
        float dpScale2 = ((Utils.dpScale() * f2) * floatValue2) / 100.0f;
        List<String> textLines2 = getTextLines(str);
        size = textLines2.size();
        int i42 = -1;
        int i52 = 0;
        while (i2 < size) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawTextWithGlyphs(DocumentData documentData, Matrix matrix, Font font, Canvas canvas, int i) {
        float floatValue;
        int i2;
        int i3;
        List<TextSubLine> list;
        int i4;
        int i5;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.textSizeCallbackAnimation;
        float floatValue2 = (baseKeyframeAnimation != null ? baseKeyframeAnimation.getValue().floatValue() : documentData.size) / 100.0f;
        float scale = Utils.getScale(matrix);
        List<String> textLines = getTextLines(documentData.text);
        int size = textLines.size();
        float f2 = documentData.tracking / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.trackingCallbackAnimation;
        if (baseKeyframeAnimation2 == null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.trackingAnimation;
            if (baseKeyframeAnimation3 != null) {
                floatValue = baseKeyframeAnimation3.getValue().floatValue();
            }
            float f3 = f2;
            int i6 = -1;
            i2 = 0;
            while (i2 < size) {
                String str = textLines.get(i2);
                PointF pointF = documentData.boxSize;
                List<TextSubLine> splitGlyphTextIntoLines = splitGlyphTextIntoLines(str, pointF == null ? 0.0f : pointF.x, font, floatValue2, f3, true);
                int i7 = 0;
                while (i7 < splitGlyphTextIntoLines.size()) {
                    TextSubLine textSubLine = splitGlyphTextIntoLines.get(i7);
                    int i8 = i6 + 1;
                    canvas.save();
                    if (offsetCanvas(canvas, documentData, i8, textSubLine.width)) {
                        i3 = i7;
                        list = splitGlyphTextIntoLines;
                        i4 = i8;
                        i5 = i2;
                        drawGlyphTextLine(textSubLine.text, documentData, font, canvas, scale, floatValue2, f3, i);
                    } else {
                        i3 = i7;
                        list = splitGlyphTextIntoLines;
                        i4 = i8;
                        i5 = i2;
                    }
                    canvas.restore();
                    i7 = i3 + 1;
                    splitGlyphTextIntoLines = list;
                    i6 = i4;
                    i2 = i5;
                }
                i2++;
            }
        }
        floatValue = baseKeyframeAnimation2.getValue().floatValue();
        f2 += floatValue;
        float f32 = f2;
        int i62 = -1;
        i2 = 0;
        while (i2 < size) {
        }
    }

    private TextSubLine ensureEnoughSubLines(int i) {
        for (int size = this.textSubLines.size(); size < i; size++) {
            this.textSubLines.add(new TextSubLine());
        }
        return this.textSubLines.get(i - 1);
    }

    private List<ContentGroup> getContentsForCharacter(FontCharacter fontCharacter) {
        if (this.contentsForCharacter.containsKey(fontCharacter)) {
            return this.contentsForCharacter.get(fontCharacter);
        }
        List<ShapeGroup> shapes = fontCharacter.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new ContentGroup(this.lottieDrawable, this, shapes.get(i), this.composition));
        }
        this.contentsForCharacter.put(fontCharacter, arrayList);
        return arrayList;
    }

    private List<String> getTextLines(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface getTypeface(Font font) {
        Typeface value;
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation = this.typefaceCallbackAnimation;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        Typeface typeface = this.lottieDrawable.getTypeface(font);
        return typeface != null ? typeface : font.getTypeface();
    }

    private boolean isIndexInRangeSelection(int i) {
        int length = this.textAnimation.getValue().text.length();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.textRangeStartAnimation;
        if (baseKeyframeAnimation == null || this.textRangeEndAnimation == null) {
            return true;
        }
        int min = Math.min(baseKeyframeAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        int max = Math.max(this.textRangeStartAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.textRangeOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            int intValue = baseKeyframeAnimation2.getValue().intValue();
            min += intValue;
            max += intValue;
        }
        if (this.textRangeUnits == TextRangeUnits.INDEX) {
            return i >= min && i < max;
        }
        float f2 = (i / length) * 100.0f;
        return f2 >= ((float) min) && f2 < ((float) max);
    }

    private boolean isModifier(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    private boolean offsetCanvas(Canvas canvas, DocumentData documentData, int i, float f2) {
        PointF pointF = documentData.boxPosition;
        PointF pointF2 = documentData.boxSize;
        float dpScale = Utils.dpScale();
        float f3 = (i * documentData.lineHeight * dpScale) + (pointF == null ? 0.0f : (documentData.lineHeight * dpScale) + pointF.y);
        if (this.lottieDrawable.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f3 >= pointF.y + pointF2.y + documentData.size) {
            return false;
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = C06113.$SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[documentData.justification.ordinal()];
        if (i2 == 1) {
            canvas.translate(f4, f3);
        } else if (i2 == 2) {
            canvas.translate((f4 + f5) - f2, f3);
        } else if (i2 == 3) {
            canvas.translate(((f5 / 2.0f) + f4) - (f2 / 2.0f), f3);
        }
        return true;
    }

    private List<TextSubLine> splitGlyphTextIntoLines(String str, float f2, Font font, float f3, float f4, boolean z2) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z2) {
                FontCharacter fontCharacter = (FontCharacter) this.composition.getCharacters().m2875b(FontCharacter.hashFor(charAt, font.getFamily(), font.getStyle()), null);
                if (fontCharacter != null) {
                    measureText = (Utils.dpScale() * ((float) fontCharacter.getWidth()) * f3) + f4;
                }
            } else {
                measureText = this.fillPaint.measureText(str.substring(i4, i4 + 1)) + f4;
            }
            if (charAt == ' ') {
                z3 = true;
                f7 = measureText;
            } else if (z3) {
                z3 = false;
                i3 = i4;
                f6 = measureText;
            } else {
                f6 += measureText;
            }
            f5 += measureText;
            if (f2 > 0.0f && f5 >= f2 && charAt != ' ') {
                i++;
                TextSubLine ensureEnoughSubLines = ensureEnoughSubLines(i);
                if (i3 == i2) {
                    ensureEnoughSubLines.set(str.substring(i2, i4).trim(), (f5 - measureText) - ((r9.length() - r7.length()) * f7));
                    i2 = i4;
                    i3 = i2;
                    f5 = measureText;
                    f6 = f5;
                } else {
                    ensureEnoughSubLines.set(str.substring(i2, i3 - 1).trim(), ((f5 - f6) - ((r7.length() - r13.length()) * f7)) - f7);
                    f5 = f6;
                    i2 = i3;
                }
            }
        }
        if (f5 > 0.0f) {
            i++;
            ensureEnoughSubLines(i).set(str.substring(i2), f5);
        }
        return this.textSubLines.subList(0, i);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t2, lottieValueCallback);
        if (t2 == LottieProperty.COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorCallbackAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.colorCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.strokeColorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeColorCallbackAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.strokeColorCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.strokeWidthCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeWidthCallbackAnimation = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            addAnimation(this.strokeWidthCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.trackingCallbackAnimation;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.trackingCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.trackingCallbackAnimation = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.trackingCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.textSizeCallbackAnimation;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.textSizeCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.textSizeCallbackAnimation = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            addAnimation(this.textSizeCallbackAnimation);
            return;
        }
        if (t2 != LottieProperty.TYPEFACE) {
            if (t2 == LottieProperty.TEXT) {
                this.textAnimation.setStringValueCallback(lottieValueCallback);
                return;
            }
            return;
        }
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation6 = this.typefaceCallbackAnimation;
        if (baseKeyframeAnimation6 != null) {
            removeAnimation(baseKeyframeAnimation6);
        }
        if (lottieValueCallback == null) {
            this.typefaceCallbackAnimation = null;
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.typefaceCallbackAnimation = valueCallbackKeyframeAnimation6;
        valueCallbackKeyframeAnimation6.addUpdateListener(this);
        addAnimation(this.typefaceCallbackAnimation);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i, DropShadow dropShadow) {
        DocumentData value = this.textAnimation.getValue();
        Font font = this.composition.getFonts().get(value.fontName);
        if (font == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        configurePaint(value, i, 0);
        if (this.lottieDrawable.useTextGlyphs()) {
            drawTextWithGlyphs(value, matrix, font, canvas, i);
        } else {
            drawTextWithFont(value, font, canvas, i);
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z2) {
        super.getBounds(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, this.composition.getBounds().width(), this.composition.getBounds().height());
    }
}
