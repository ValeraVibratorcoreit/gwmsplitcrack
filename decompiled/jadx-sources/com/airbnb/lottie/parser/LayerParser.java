package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class LayerParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.m1624of("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final JsonReader.Options TEXT_NAMES = JsonReader.Options.m1624of("d", "a");
    private static final JsonReader.Options EFFECTS_NAMES = JsonReader.Options.m1624of("ty", "nm");

    /* renamed from: com.airbnb.lottie.parser.LayerParser$1 */
    public static /* synthetic */ class C06181 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private LayerParser() {
    }

    public static Layer parse(LottieComposition lottieComposition) {
        Rect bounds = lottieComposition.getBounds();
        return new Layer(Collections.emptyList(), lottieComposition, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new AnimatableTransform(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }

    public static Layer parse(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str;
        ArrayList arrayList;
        long j2;
        boolean z2;
        AnimatableTransform animatableTransform;
        ArrayList arrayList2;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        String str2 = null;
        Layer.MatteType matteType2 = matteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float f2 = 1.0f;
        AnimatableTransform animatableTransform2 = null;
        Layer.LayerType layerType = null;
        String str3 = null;
        AnimatableTextFrame animatableTextFrame = null;
        AnimatableTextProperties animatableTextProperties = null;
        AnimatableFloatValue animatableFloatValue = null;
        BlurEffect blurEffect = null;
        DropShadowEffect dropShadowEffect = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        long j3 = -1;
        float f7 = 0.0f;
        long j4 = 0;
        String str4 = "UNSET";
        boolean z4 = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str4 = jsonReader.nextString();
                    break;
                case 1:
                    j4 = jsonReader.nextInt();
                    break;
                case 2:
                    str3 = jsonReader.nextString();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (nextInt < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[nextInt];
                    }
                    break;
                case 4:
                    j3 = jsonReader.nextInt();
                    break;
                case 5:
                    i = (int) (Utils.dpScale() * jsonReader.nextInt());
                    break;
                case 6:
                    i2 = (int) (Utils.dpScale() * jsonReader.nextInt());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.nextString());
                    break;
                case 8:
                    animatableTransform2 = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                    break;
                case Platform.GNU /* 9 */:
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= Layer.MatteType.values().length) {
                        lottieComposition.addWarning("Unsupported matte type: " + nextInt2);
                    } else {
                        matteType2 = Layer.MatteType.values()[nextInt2];
                        int i4 = C06181.$SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[matteType2.ordinal()];
                        if (i4 == 1) {
                            lottieComposition.addWarning("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            lottieComposition.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.incrementMatteOrMaskCount(1);
                    }
                    break;
                case Platform.KFREEBSD /* 10 */:
                    ArrayList arrayList5 = arrayList3;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList5.add(MaskParser.parse(jsonReader, lottieComposition));
                    }
                    arrayList3 = arrayList5;
                    lottieComposition.incrementMatteOrMaskCount(arrayList3.size());
                    jsonReader.endArray();
                    break;
                case Platform.NETBSD /* 11 */:
                    arrayList2 = arrayList3;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ContentModel parse = ContentModelParser.parse(jsonReader, lottieComposition);
                        if (parse != null) {
                            arrayList4.add(parse);
                        }
                    }
                    jsonReader.endArray();
                    arrayList3 = arrayList2;
                    break;
                case Platform.DRAGONFLYBSD /* 12 */:
                    arrayList2 = arrayList3;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(TEXT_NAMES);
                        if (selectName == 0) {
                            animatableTextFrame = AnimatableValueParser.parseDocumentData(jsonReader, lottieComposition);
                        } else if (selectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                animatableTextProperties = AnimatableTextPropertiesParser.parse(jsonReader, lottieComposition);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    arrayList3 = arrayList2;
                    break;
                case 13:
                    arrayList2 = arrayList3;
                    jsonReader.beginArray();
                    ArrayList arrayList6 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(EFFECTS_NAMES);
                            if (selectName2 == 0) {
                                int nextInt3 = jsonReader.nextInt();
                                if (nextInt3 == 29) {
                                    blurEffect = BlurEffectParser.parse(jsonReader, lottieComposition);
                                } else if (nextInt3 == 25) {
                                    dropShadowEffect = new DropShadowEffectParser().parse(jsonReader, lottieComposition);
                                }
                            } else if (selectName2 != 1) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                arrayList6.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    lottieComposition.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList6);
                    arrayList3 = arrayList2;
                    break;
                case 14:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case DLLCallback.DLL_FPTRS /* 16 */:
                    arrayList2 = arrayList3;
                    f4 = (float) (jsonReader.nextDouble() * Utils.dpScale());
                    arrayList3 = arrayList2;
                    break;
                case 17:
                    arrayList2 = arrayList3;
                    f5 = (float) (jsonReader.nextDouble() * Utils.dpScale());
                    arrayList3 = arrayList2;
                    break;
                case 18:
                    f7 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    z3 = jsonReader.nextBoolean();
                    break;
                case 23:
                    if (jsonReader.nextInt() != 1) {
                        z4 = false;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                case 24:
                    int nextInt4 = jsonReader.nextInt();
                    if (nextInt4 >= LBlendMode.values().length) {
                        lottieComposition.addWarning("Unsupported Blend Mode: " + nextInt4);
                        lBlendMode2 = LBlendMode.NORMAL;
                        break;
                    } else {
                        lBlendMode2 = LBlendMode.values()[nextInt4];
                        break;
                    }
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList7 = new ArrayList();
        if (f7 > 0.0f) {
            arrayList = arrayList3;
            z2 = z4;
            str = str2;
            j2 = j4;
            arrayList7.add(new Keyframe(lottieComposition, valueOf, valueOf, null, 0.0f, Float.valueOf(f7)));
        } else {
            str = str2;
            arrayList = arrayList3;
            j2 = j4;
            z2 = z4;
        }
        if (f6 <= 0.0f) {
            f6 = lottieComposition.getEndFrame();
        }
        arrayList7.add(new Keyframe(lottieComposition, valueOf2, valueOf2, null, f7, Float.valueOf(f6)));
        arrayList7.add(new Keyframe(lottieComposition, valueOf, valueOf, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str4.endsWith(".ai") || "ai".equals(str)) {
            lottieComposition.addWarning("Convert your Illustrator layers to shape layers.");
        }
        if (z2) {
            if (animatableTransform2 == null) {
                animatableTransform2 = new AnimatableTransform();
            }
            AnimatableTransform animatableTransform3 = animatableTransform2;
            animatableTransform3.setAutoOrient(z2);
            animatableTransform = animatableTransform3;
        } else {
            animatableTransform = animatableTransform2;
        }
        return new Layer(arrayList4, lottieComposition, str4, j2, layerType, j3, str3, arrayList, animatableTransform, i, i2, i3, f2, f3, f4, f5, animatableTextFrame, animatableTextProperties, arrayList7, matteType2, animatableFloatValue, z3, blurEffect, dropShadowEffect, lBlendMode2);
    }
}
