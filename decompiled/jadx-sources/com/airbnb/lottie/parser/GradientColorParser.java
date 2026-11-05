package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.sun.jna.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class GradientColorParser implements ValueParser<GradientColor> {
    private int colorPoints;

    public GradientColorParser(int i) {
        this.colorPoints = i;
    }

    private GradientColor addOpacityStopsToGradientIfNeeded(GradientColor gradientColor, List<Float> list) {
        int i = this.colorPoints * 4;
        if (list.size() <= i) {
            return gradientColor;
        }
        float[] positions = gradientColor.getPositions();
        int[] colors = gradientColor.getColors();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] mergeUniqueElements = mergeUniqueElements(gradientColor.getPositions(), fArr);
        int length = mergeUniqueElements.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = mergeUniqueElements[i3];
            int binarySearch = Arrays.binarySearch(positions, f2);
            int binarySearch2 = Arrays.binarySearch(fArr, f2);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = getColorInBetweenColorStops(f2, fArr2[binarySearch2], positions, colors);
            } else {
                iArr[i3] = getColorInBetweenOpacityStops(f2, colors[binarySearch], fArr, fArr2);
            }
        }
        return new GradientColor(mergeUniqueElements, iArr);
    }

    private int getColorInBetweenOpacityStops(float f2, int i, float[] fArr, float[] fArr2) {
        float lerp;
        if (fArr2.length < 2 || f2 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f3 = fArr[i2];
            if (f3 >= f2 || i2 == fArr.length - 1) {
                if (f3 <= f2) {
                    lerp = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f4 = fArr[i3];
                    lerp = MiscUtils.lerp(fArr2[i3], fArr2[i2], (f2 - f4) / (f3 - f4));
                }
                return Color.argb((int) (lerp * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    public static float[] mergeUniqueElements(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f2 = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f3 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f3) || f2 < f3) {
                fArr3[i4] = f2;
                i2++;
            } else if (Float.isNaN(f2) || f3 < f2) {
                fArr3[i4] = f3;
                i3++;
            } else {
                fArr3[i4] = f2;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }

    public int getColorInBetweenColorStops(float f2, float f3, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f2 == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f4 = fArr[i];
            if (f4 >= f2 || i == fArr.length - 1) {
                if (i == fArr.length - 1 && f2 >= f4) {
                    return Color.argb((int) (f3 * 255.0f), Color.red(iArr[i]), Color.green(iArr[i]), Color.blue(iArr[i]));
                }
                int i2 = i - 1;
                float f5 = fArr[i2];
                int evaluate = GammaEvaluator.evaluate((f2 - f5) / (f4 - f5), iArr[i2], iArr[i]);
                return Color.argb((int) (f3 * 255.0f), Color.red(evaluate), Color.green(evaluate), Color.blue(evaluate));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public GradientColor parse(JsonReader jsonReader, float f2) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z2) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.colorPoints = 2;
        }
        if (z2) {
            jsonReader.endArray();
        }
        if (this.colorPoints == -1) {
            this.colorPoints = arrayList.size() / 4;
        }
        int i = this.colorPoints;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.colorPoints * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f3 = (float) floatValue;
                    if (fArr[i5 - 1] >= f3) {
                        fArr[i5] = f3 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(Function.USE_VARARGS, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        return addOpacityStopsToGradientIfNeeded(new GradientColor(fArr, iArr), arrayList);
    }
}
