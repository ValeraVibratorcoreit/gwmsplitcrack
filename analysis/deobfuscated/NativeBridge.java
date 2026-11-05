package deobfuscated.nativebridge;

import android.content.Context;

/**
 * Реконструкция com.altaysoft.t500_split.NativeLib (JNI-мост).
 *
 * libnative-lib.so:
 *   - читает CAN и вызывает Java-сеттеры carData (setSpeed/setRpm/...);
 *   - инициализирует строковую конфигурацию cfgData (URL, ключи, имена prefs);
 *   - расшифровывает .bin-картинки встроенных тем;
 *   - обслуживает панель (pitch/roll/heading) и TPMS.
 *
 * libtheme_crypt.so:
 *   - ThemeCrypt.decrypt/encrypt для JSON user-тем (magic "TLC1").
 */
public final class NativeBridge {

    static {
        System.loadLibrary("native-lib");
    }

    // --- данные автомобиля ---
    public static native void initCarData(Object carData);
    public static native void nativeInitReader(Object carData);
    public static native void nativeBindView(Object carData);
    public static native void nativeUnbindView();
    public static native boolean nativeIsReaderRunning();
    public static native boolean nativeIsViewBound();

    // --- панель / датчики ---
    public static native void nativeBindPanel(Context context);
    public static native void nativeUnbindPanel();
    public static native void nativeAckWellBack();

    // --- конфигурация ---
    public static native void initCfgData(Object cfgData);
    public static native void nativeInitStrings(Context context);
    public static native void nativeSetContext(Context context);
    public static native String getJavaStringByIndex(int index);
    public static native int getPrefIntByIndex(int index);

    public static String getStringByIndex(int index) {
        return getJavaStringByIndex(index);
    }

    // --- темы ---
    public static native byte[] decryptThemeImage(Context context, byte[] encrypted);

    // --- вспомогательное ---
    public static native float floatClamp(float value, float min, float max);
    public static native float approximate(float[][] points, float x, float y, float z);
    public static native float[] decodeTPMS(String data);
    public static native String[] nativeGetData(String[] request, int mode);

    // --- свойства HVAC / drive mode / подсветки ---
    public static native boolean nativePropBackgroundLightLvl(int v);
    public static native boolean nativePropDriveMode(int v);
    public static native boolean nativePropEpsSteerMod(int v);
    public static native boolean nativePropHvacAc(int v);
    public static native boolean nativePropHvacAuto(int v);
    public static native boolean nativePropHvacFan(int v);
    public static native boolean nativePropHvacTemp(float v);
    public static native boolean nativePropHvacWheel(int v);
    public static native boolean nativePropHvacWin(int v);
    public static native boolean nativePropMainVol(int v);

    // --- медиа ---
    public static native boolean nativePropMediaCue(Context ctx, String pkg, int cmd, String arg);
    public static native boolean nativeSetVolMedia(int v);
    public static native boolean nativeSetVolNavi(int v);
    public static native boolean nativeSetVolPhone(int v);
    public static native boolean nativeSetVolRing(int v);
    public static native boolean nativeSetVolVoice(int v);
}
