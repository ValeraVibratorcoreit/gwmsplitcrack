package com.altaysoft.t500_split;

import android.content.Context;
import p064e.InterfaceC0766a;

@InterfaceC0766a
/* loaded from: classes.dex */
public class NativeLib {
    static {
        System.loadLibrary("native-lib");
    }

    public static native float approximate(float[][] fArr, float f2, float f3, float f4);

    public static native float[] decodeTPMS(String str);

    public static native byte[] decryptThemeImage(Context context, byte[] bArr);

    public static native float floatClamp(float f2, float f3, float f4);

    public static native String getJavaStringByIndex(int i);

    public static native int getPrefIntByIndex(int i);

    public static String getStringByIndex(int i) {
        return getJavaStringByIndex(i);
    }

    public static native void initCarData(carData cardata);

    public static native void initCfgData(cfgData cfgdata);

    public static native void nativeAckWellBack();

    public static native void nativeBindPanel(Context context);

    public static native void nativeBindView(carData cardata);

    public static native String[] nativeGetData(String[] strArr, int i);

    public static native void nativeInitReader(carData cardata);

    public static native void nativeInitStrings(Context context);

    public static native boolean nativeIsReaderRunning();

    public static native boolean nativeIsViewBound();

    public static native boolean nativePropBackgroundLightLvl(int i);

    public static native boolean nativePropBrkPedFeel(int i);

    public static native boolean nativePropDriveMode(int i);

    public static native boolean nativePropDriveModeHut(int i);

    public static native boolean nativePropEpsSteerMod(int i);

    public static native boolean nativePropHvacAc(int i);

    public static native boolean nativePropHvacAuto(int i);

    public static native boolean nativePropHvacBlow(int i);

    public static native boolean nativePropHvacDef(int i);

    public static native boolean nativePropHvacFan(int i);

    public static native boolean nativePropHvacHeatFl(int i);

    public static native boolean nativePropHvacHeatFr(int i);

    public static native boolean nativePropHvacHeatRl(int i);

    public static native boolean nativePropHvacHeatRr(int i);

    public static native boolean nativePropHvacInlet(int i);

    public static native boolean nativePropHvacPwr(int i);

    public static native boolean nativePropHvacRear(int i);

    public static native boolean nativePropHvacTemp(float f2);

    public static native boolean nativePropHvacVentFl(int i);

    public static native boolean nativePropHvacVentFr(int i);

    public static native boolean nativePropHvacVentRl(int i);

    public static native boolean nativePropHvacVentRr(int i);

    public static native boolean nativePropHvacWheel(int i);

    public static native boolean nativePropHvacWin(int i);

    public static native boolean nativePropMainVol(int i);

    public static native boolean nativePropMediaCue(Context context, String str, int i, String str2);

    public static native void nativePropPanelClear();

    public static native void nativePropPanelFeed(String str);

    public static native void nativeSetContext(Context context);

    public static native boolean nativeSetVolMedia(int i);

    public static native boolean nativeSetVolNavi(int i);

    public static native boolean nativeSetVolPhone(int i);

    public static native boolean nativeSetVolRing(int i);

    public static native boolean nativeSetVolVoice(int i);

    public static native void nativeStopReader();

    public static native void nativeUnbindPanel();

    public static native void nativeUnbindView();
}
