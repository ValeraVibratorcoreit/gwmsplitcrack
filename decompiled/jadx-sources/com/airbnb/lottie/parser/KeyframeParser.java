package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C0578L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.lang.ref.WeakReference;
import p026M.AbstractC0256a;
import p091o.C1202l;

/* loaded from: classes.dex */
class KeyframeParser {
    private static final float MAX_CP_VALUE = 100.0f;
    private static C1202l pathInterpolatorCache;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    static JsonReader.Options NAMES = JsonReader.Options.m1624of("t", "s", "e", "o", "i", "h", "to", "ti");
    static JsonReader.Options INTERPOLATOR_NAMES = JsonReader.Options.m1624of("x", "y");

    private static WeakReference<Interpolator> getInterpolator(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (KeyframeParser.class) {
            weakReference = (WeakReference) pathInterpolatorCache().m2875b(i, null);
        }
        return weakReference;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator m775b;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, MAX_CP_VALUE);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float clamp = MiscUtils.clamp(pointF2.y, -100.0f, MAX_CP_VALUE);
        pointF2.y = clamp;
        int hashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, clamp);
        WeakReference<Interpolator> interpolator = C0578L.getDisablePathInterpolatorCache() ? null : getInterpolator(hashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator == null || interpolator2 == null) {
            try {
                m775b = AbstractC0256a.m775b(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                m775b = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? AbstractC0256a.m775b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator2 = m775b;
            if (!C0578L.getDisablePathInterpolatorCache()) {
                try {
                    putInterpolator(hashFor, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator2;
    }

    public static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f2, ValueParser<T> valueParser, boolean z2, boolean z3) {
        return (z2 && z3) ? parseMultiDimensionalKeyframe(lottieComposition, jsonReader, f2, valueParser) : z2 ? parseKeyframe(lottieComposition, jsonReader, f2, valueParser) : parseStaticValue(jsonReader, f2, valueParser);
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f2, ValueParser<T> valueParser) {
        Interpolator interpolatorFor;
        T t2;
        jsonReader.beginObject();
        PointF pointF = null;
        T t3 = null;
        T t4 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f3 = 0.0f;
        boolean z2 = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t4 = valueParser.parse(jsonReader, f2);
                    break;
                case 2:
                    t3 = valueParser.parse(jsonReader, f2);
                    break;
                case 3:
                    pointF = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case 6:
                    pointF2 = JsonUtils.jsonToPoint(jsonReader, f2);
                    break;
                case 7:
                    pointF3 = JsonUtils.jsonToPoint(jsonReader, f2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z2) {
            interpolatorFor = LINEAR_INTERPOLATOR;
            t2 = t4;
        } else {
            interpolatorFor = (pointF == null || pointF4 == null) ? LINEAR_INTERPOLATOR : interpolatorFor(pointF, pointF4);
            t2 = t3;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t4, t2, interpolatorFor, f3, null);
        keyframe.pathCp1 = pointF2;
        keyframe.pathCp2 = pointF3;
        return keyframe;
    }

    private static <T> Keyframe<T> parseMultiDimensionalKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f2, ValueParser<T> valueParser) {
        Interpolator interpolator;
        Interpolator interpolatorFor;
        Interpolator interpolatorFor2;
        T t2;
        PointF pointF;
        Keyframe<T> keyframe;
        PointF pointF2;
        float f3;
        PointF pointF3;
        jsonReader.beginObject();
        PointF pointF4 = null;
        boolean z2 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t3 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f4 = 0.0f;
        PointF pointF11 = null;
        T t4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    pointF2 = pointF4;
                    f4 = (float) jsonReader.nextDouble();
                    pointF4 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    t3 = valueParser.parse(jsonReader, f2);
                    pointF4 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    t4 = valueParser.parse(jsonReader, f2);
                    pointF4 = pointF2;
                    break;
                case 3:
                    pointF2 = pointF4;
                    f3 = f4;
                    PointF pointF12 = pointF11;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName == 0) {
                                JsonReader.Token peek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (peek == token) {
                                    f7 = (float) jsonReader.nextDouble();
                                    f5 = f7;
                                } else {
                                    jsonReader.beginArray();
                                    f5 = (float) jsonReader.nextDouble();
                                    f7 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : f5;
                                    jsonReader.endArray();
                                }
                            } else if (selectName != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token peek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (peek2 == token2) {
                                    f8 = (float) jsonReader.nextDouble();
                                    f6 = f8;
                                } else {
                                    jsonReader.beginArray();
                                    f6 = (float) jsonReader.nextDouble();
                                    f8 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : f6;
                                    jsonReader.endArray();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f5, f6);
                        PointF pointF14 = new PointF(f7, f8);
                        jsonReader.endObject();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f4 = f3;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF5 = JsonUtils.jsonToPoint(jsonReader, f2);
                        f4 = f3;
                        pointF11 = pointF12;
                        pointF4 = pointF2;
                    }
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF15 = pointF11;
                            int selectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName2 != 0) {
                                pointF3 = pointF4;
                                if (selectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token peek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (peek3 == token3) {
                                        f12 = (float) jsonReader.nextDouble();
                                        f4 = f4;
                                        f10 = f12;
                                    } else {
                                        float f13 = f4;
                                        jsonReader.beginArray();
                                        float nextDouble = (float) jsonReader.nextDouble();
                                        float nextDouble2 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : nextDouble;
                                        jsonReader.endArray();
                                        f4 = f13;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f12 = nextDouble2;
                                        f10 = nextDouble;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f14 = f4;
                                JsonReader.Token peek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (peek4 == token4) {
                                    f11 = (float) jsonReader.nextDouble();
                                    f4 = f14;
                                    f9 = f11;
                                } else {
                                    jsonReader.beginArray();
                                    f9 = (float) jsonReader.nextDouble();
                                    f11 = jsonReader.peek() == token4 ? (float) jsonReader.nextDouble() : f9;
                                    jsonReader.endArray();
                                    f4 = f14;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f3 = f4;
                        PointF pointF16 = new PointF(f9, f10);
                        PointF pointF17 = new PointF(f11, f12);
                        jsonReader.endObject();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f4 = f3;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = JsonUtils.jsonToPoint(jsonReader, f2);
                        pointF4 = pointF2;
                    }
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case 6:
                    pointF11 = JsonUtils.jsonToPoint(jsonReader, f2);
                    break;
                case 7:
                    pointF4 = JsonUtils.jsonToPoint(jsonReader, f2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF18 = pointF4;
        float f15 = f4;
        PointF pointF19 = pointF11;
        jsonReader.endObject();
        if (z2) {
            interpolator = LINEAR_INTERPOLATOR;
            t2 = t3;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = interpolatorFor(pointF5, pointF6);
            } else {
                if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                    interpolatorFor = interpolatorFor(pointF7, pointF9);
                    interpolatorFor2 = interpolatorFor(pointF8, pointF10);
                    t2 = t4;
                    interpolator = null;
                    if (interpolatorFor != null || interpolatorFor2 == null) {
                        pointF = pointF19;
                        keyframe = new Keyframe<>(lottieComposition, t3, t2, interpolator, f15, null);
                    } else {
                        pointF = pointF19;
                        keyframe = new Keyframe<>(lottieComposition, t3, t2, interpolatorFor, interpolatorFor2, f15, null);
                    }
                    keyframe.pathCp1 = pointF;
                    keyframe.pathCp2 = pointF18;
                    return keyframe;
                }
                interpolator = LINEAR_INTERPOLATOR;
            }
            t2 = t4;
        }
        interpolatorFor = null;
        interpolatorFor2 = null;
        if (interpolatorFor != null) {
        }
        pointF = pointF19;
        keyframe = new Keyframe<>(lottieComposition, t3, t2, interpolator, f15, null);
        keyframe.pathCp1 = pointF;
        keyframe.pathCp2 = pointF18;
        return keyframe;
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f2, ValueParser<T> valueParser) {
        return new Keyframe<>(valueParser.parse(jsonReader, f2));
    }

    private static C1202l pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new C1202l();
        }
        return pathInterpolatorCache;
    }

    private static void putInterpolator(int i, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.m2876c(i, weakReference);
        }
    }
}
