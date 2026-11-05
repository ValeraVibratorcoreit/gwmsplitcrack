package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;

/* loaded from: classes.dex */
class MaskParser {
    private MaskParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Mask parse(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z2;
        boolean z3;
        jsonReader.beginObject();
        Mask.MaskMode maskMode = null;
        AnimatableShapeValue animatableShapeValue = null;
        AnimatableIntegerValue animatableIntegerValue = null;
        boolean z4 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        z2 = false;
                        break;
                    }
                    z2 = -1;
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z2 = true;
                        break;
                    }
                    z2 = -1;
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z2 = 2;
                        break;
                    }
                    z2 = -1;
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        z2 = 3;
                        break;
                    }
                    z2 = -1;
                    break;
                default:
                    z2 = -1;
                    break;
            }
            switch (z2) {
                case false:
                    animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case true:
                    animatableShapeValue = AnimatableValueParser.parseShapeData(jsonReader, lottieComposition);
                    break;
                case true:
                    z4 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.getClass();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                z3 = false;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 105:
                            if (nextString.equals("i")) {
                                z3 = true;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 110:
                            if (nextString.equals("n")) {
                                z3 = 2;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 115:
                            if (nextString.equals("s")) {
                                z3 = 3;
                                break;
                            }
                            z3 = -1;
                            break;
                        default:
                            z3 = -1;
                            break;
                    }
                    switch (z3) {
                        case false:
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case true:
                            lottieComposition.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case true:
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            Logger.warning("Unknown mask mode " + nextName + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, animatableShapeValue, animatableIntegerValue, z4);
    }
}
