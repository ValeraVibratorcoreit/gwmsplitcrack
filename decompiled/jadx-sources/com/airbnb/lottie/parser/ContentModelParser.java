package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.sun.jna.Platform;

/* loaded from: classes.dex */
class ContentModelParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.m1624of("ty", "d");

    private ContentModelParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ce, code lost:
    
        if (r3.equals("fl") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ContentModel parse(JsonReader jsonReader, LottieComposition lottieComposition) {
        ContentModel contentModel;
        String str;
        char c2 = 1;
        jsonReader.beginObject();
        int i = 2;
        while (true) {
            contentModel = null;
            if (!jsonReader.hasNext()) {
                str = null;
                break;
            }
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
                break;
            }
            if (selectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                i = jsonReader.nextInt();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3270:
                break;
            case 3295:
                if (str.equals("gf")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                contentModel = CircleShapeParser.parse(jsonReader, lottieComposition, i);
                break;
            case 1:
                contentModel = ShapeFillParser.parse(jsonReader, lottieComposition);
                break;
            case 2:
                contentModel = GradientFillParser.parse(jsonReader, lottieComposition);
                break;
            case 3:
                contentModel = ShapeGroupParser.parse(jsonReader, lottieComposition);
                break;
            case 4:
                contentModel = GradientStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case 5:
                contentModel = MergePathsParser.parse(jsonReader);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModel = RectangleShapeParser.parse(jsonReader, lottieComposition);
                break;
            case 7:
                contentModel = RoundedCornersParser.parse(jsonReader, lottieComposition);
                break;
            case '\b':
                contentModel = RepeaterParser.parse(jsonReader, lottieComposition);
                break;
            case Platform.GNU /* 9 */:
                contentModel = ShapePathParser.parse(jsonReader, lottieComposition);
                break;
            case Platform.KFREEBSD /* 10 */:
                contentModel = PolystarShapeParser.parse(jsonReader, lottieComposition, i);
                break;
            case Platform.NETBSD /* 11 */:
                contentModel = ShapeStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                contentModel = ShapeTrimPathParser.parse(jsonReader, lottieComposition);
                break;
            case '\r':
                contentModel = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                Logger.warning("Unknown shape type ".concat(str));
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModel;
    }
}
