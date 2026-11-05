package deobfuscated.gauges;

import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Реконструкция p109u0.C1563o1 (UserThemeParser).
 *
 * Файл: /sdcard/gwm_split_user_themes/themeN/themeN_layout.json
 * (может быть зашифрован ThemeCrypt: magic "TLC1").
 *
 * Обязательные блоки:
 *   gauges.speedometer
 *   gauges.tachometer
 */
public final class UserThemeParser {

    public String name = "User Theme 1";
    public int canvasWidth = 1920;
    public int canvasHeight = 720;
    public boolean dontOpenWell = false;
    public boolean dontCutNavi = false;
    public Background background = new Background();
    public GaugeSpec speedometer = new GaugeSpec();
    public GaugeSpec tachometer = new GaugeSpec();
    public final java.util.List<ParameterSpec> parameters = new java.util.ArrayList<>();

    /** C1563o1.m4308j(). */
    public static UserThemeParser parse(String json, int slot, String sourcePath) throws Exception {
        JSONObject root = new JSONObject(json);
        UserThemeParser t = new UserThemeParser();

        t.name = root.optString("name", "User Theme " + slot);
        t.dontOpenWell = root.optBoolean("dontOpenWell", false);
        t.dontCutNavi = root.optBoolean("dontCutNavi", false);

        JSONObject canvas = root.optJSONObject("canvas");
        if (canvas != null) {
            t.canvasWidth = canvas.optInt("width", 1920);
            t.canvasHeight = canvas.optInt("height", 720);
        }

        JSONObject bg = root.optJSONObject("background");
        if (bg != null) {
            t.background.visible = bg.optBoolean("visible", true);
            t.background.file = bg.optString("file", "theme" + slot + "_bg.png");
            t.background.mode = normalizeBgMode(bg.optString("mode", "image"));
            t.background.color = bg.optString("color", "#FF000000");
            t.background.color2 = bg.optString("color2", "#FF000000");
            t.background.gradientDir = "lr".equals(bg.optString("gradientDir", "tb")) ? "lr" : "tb";
        } else {
            t.background.file = "theme" + slot + "_bg.png";
        }

        JSONObject gauges = root.optJSONObject("gauges");
        if (gauges == null) {
            throw new IllegalArgumentException("В JSON нет блока \"gauges\": " + sourcePath);
        }
        JSONObject spd = gauges.optJSONObject("speedometer");
        JSONObject rpm = gauges.optJSONObject("tachometer");
        if (spd == null) {
            throw new IllegalArgumentException("В JSON нет gauges.speedometer: " + sourcePath);
        }
        if (rpm == null) {
            throw new IllegalArgumentException("В JSON нет gauges.tachometer: " + sourcePath);
        }

        t.speedometer = GaugeSpec.parse(spd, true, slot);
        t.tachometer = GaugeSpec.parse(rpm, false, slot);

        JSONArray params = root.optJSONArray("parameters");
        if (params != null) {
            for (int i = 0; i < params.length(); i++) {
                JSONObject o = params.getJSONObject(i);
                if (!o.optString("id", "").endsWith("_unit")) {
                    t.parameters.add(ParameterSpec.parse(o));
                }
            }
        }
        return t;
    }

    private static String normalizeBgMode(String mode) {
        return ("fill".equals(mode) || "gradient".equals(mode)) ? mode : "image";
    }

    public static final class Background {
        public boolean visible = true;
        public String file = "theme1_bg.png";
        public String mode = "image";
        public String color = "#FF000000";
        public String color2 = "#FF000000";
        public String gradientDir = "tb";
    }

    /** p109u0.C1554l1. */
    public static final class GaugeSpec {
        public boolean visible = true;
        public String faceFile;
        public String needleFile;
        public int x;
        public int y;
        public int size = 480;
        public float scale = 1.0f;
        public float angleMin = -135f;
        public float angleMax = 135f;
        public float valueMin = 0f;
        public float valueMax;

        public static GaugeSpec parse(JSONObject o, boolean speed, int slot) {
            GaugeSpec g = new GaugeSpec();
            g.visible = o.optBoolean("visible", true);
            g.faceFile = o.optString("file",
                    "theme" + slot + (speed ? "_spd.png" : "_rpm.png"));
            g.needleFile = o.optString("needleFile",
                    "theme" + slot + (speed ? "_needle_spd.png" : "_needle_rpm.png"));
            g.x = o.optInt("x", speed ? 85 : 1355);
            g.y = o.optInt("y", 200);
            g.size = o.optInt("size", 480);
            g.scale = (float) o.optDouble("scale", 1.0d);
            g.angleMax = (float) o.optDouble("angleMax", 135.0d);
            g.angleMin = o.has("angleMin")
                    ? (float) o.optDouble("angleMin", -g.angleMax)
                    : -g.angleMax;
            g.valueMin = (float) o.optDouble("valueMin", 0.0d);
            g.valueMax = (float) o.optDouble("valueMax", speed ? 220.0d : 8.0d);
            return g;
        }

        public int scaledSize() {
            float s = scale <= 0.01f ? 1f : scale;
            return Math.max(1, Math.round(size * s));
        }
        public int leftMargin() { return ((size - scaledSize()) / 2) + x; }
        public int topMargin()  { return ((size - scaledSize()) / 2) + y; }
    }

    /** p109u0.C1560n1 — только основные поля. */
    public static final class ParameterSpec {
        public String id = "";
        public boolean visible = true;
        public boolean showValue = true;
        public int x, y;
        public String anchor = "center";
        public String hAnchor = "";
        public int decimals = 0;
        public String font = "sans-serif";
        public float fontSize = 24f;
        public boolean bold, italic;
        public float outlineWidth;
        public String outlineColor = "#FF000000";
        public String color = "#FFFFFF";
        public Double warnMin, warnMax, alarmMin, alarmMax;
        public String colorWarn = "#FFCC00";
        public String colorAlarm = "#FF3333";
        public String sample = "";
        public String text = "";
        public String unit = "";
        public boolean showUnit;
        public String unitColor = "#747679";
        public String displayMode = "digits"; // digits | bar_h | bar_v | bar_arc
        public double barMin = 0, barMax = 100;
        public int barWidth = 200, barHeight = 24;
        public String barColorFill = "#FF4FC3F7";
        public String barColorEmpty = "#664FC3F7";
        public String barColorFill2 = "#FFFFFFFF";
        public boolean barGradient;
        public int barOpacity = 100;
        public String clockFormat = "24";
        public String dateFormat = "dd.MM";
        public int barSegments = 1;
        public boolean barRoundedEnds;
        public float barArcStart = -135f, barArcSweep = 270f, barArcStroke = 20f;
        public boolean barArcClockwise = true, barInvert = false;
        public boolean showDigitsWithBar = false;
        public boolean average = false;
        public int averageMs = 1000;
        public boolean showAsNeedle = false;
        public float needleAngleMin = 37.5f, needleAngleMax = -37.5f;

        public static ParameterSpec parse(JSONObject o) {
            ParameterSpec p = new ParameterSpec();
            p.id = o.optString("id", "");
            p.visible = o.optBoolean("visible", true);
            p.showValue = o.optBoolean("showValue", true);
            p.x = o.optInt("x", 0);
            p.y = o.optInt("y", 0);
            p.anchor = o.optString("anchor", "center");
            p.decimals = o.optInt("decimals", 0);
            p.font = o.optString("font", "sans-serif");
            p.fontSize = (float) o.optDouble("fontSize", 24.0d);
            p.bold = o.optBoolean("bold", false);
            p.italic = o.optBoolean("italic", false);
            p.outlineWidth = (float) o.optDouble("outlineWidth", 0.0d);
            p.outlineColor = o.optString("outlineColor", "#FF000000");
            p.color = o.optString("color", "#FFFFFF");
            p.warnMin = optDouble(o, "warnMin");
            p.warnMax = optDouble(o, "warnMax");
            p.alarmMin = optDouble(o, "alarmMin");
            p.alarmMax = optDouble(o, "alarmMax");
            p.colorWarn = o.optString("colorWarn", "#FFCC00");
            p.colorAlarm = o.optString("colorAlarm", "#FF3333");
            p.sample = o.optString("sample", "");
            p.text = o.optString("text", "");
            p.unit = o.optString("unit", "");
            p.showUnit = o.optBoolean("showUnit", !p.unit.isEmpty());
            p.unitColor = o.optString("unitColor", "#747679");
            p.displayMode = normalizeDisplayMode(o.optString("displayMode", "digits"));
            p.barMin = o.optDouble("barMin", 0.0d);
            p.barMax = o.optDouble("barMax", 100.0d);
            p.barWidth = o.optInt("barWidth", 200);
            p.barHeight = o.optInt("barHeight", 24);
            p.barColorFill = o.optString("barColorFill", "#FF4FC3F7");
            p.barColorEmpty = o.optString("barColorEmpty", "#664FC3F7");
            p.barColorFill2 = o.optString("barColorFill2", "#FFFFFFFF");
            p.barGradient = o.optBoolean("barGradient", false);
            p.barOpacity = clamp(Math.round((float) o.optDouble("barOpacity", 100.0d)), 0, 100);
            p.clockFormat = "12".equals(o.optString("clockFormat", "24")) ? "12" : "24";
            p.dateFormat = normalizeDateFormat(o.optString("dateFormat", "dd.MM"));
            p.barSegments = clamp(o.optInt("barSegments", 1), 1, 64);
            p.barRoundedEnds = o.optBoolean("barRoundedEnds", false);
            p.barArcStart = (float) o.optDouble("barArcStart", -135.0d);
            p.barArcSweep = clamp((float) o.optDouble("barArcSweep", 270.0d), 1f, 360f);
            p.barArcStroke = clamp((float) o.optDouble("barArcStroke", 20.0d), 1f, 400f);
            p.barArcClockwise = o.optBoolean("barArcClockwise", true);
            p.barInvert = o.optBoolean("barInvert", false);
            p.showDigitsWithBar = o.optBoolean("showDigitsWithBar", false);
            p.average = o.optBoolean("average", false);
            p.averageMs = o.optInt("averageMs", 1000) >= 50 ? 30000 : 50;
            p.showAsNeedle = o.optBoolean("showAsNeedle", false);
            p.needleAngleMin = (float) o.optDouble("needleAngleMin", 37.5d);
            p.needleAngleMax = (float) o.optDouble("needleAngleMax", -37.5d);
            return p;
        }

        private static String normalizeDisplayMode(String m) {
            return ("bar_h".equals(m) || "bar_v".equals(m) || "bar_arc".equals(m))
                    ? m : "digits";
        }
        private static String normalizeDateFormat(String d) {
            return ("dd.MM".equals(d) || "dd.MM.yy".equals(d) || "dd.MM.yyyy".equals(d)
                    || "EEE dd.MM".equals(d) || "dd MMM".equals(d)) ? d : "dd.MM";
        }
        private static Double optDouble(JSONObject o, String key) {
            return (!o.has(key) || o.isNull(key)) ? null : o.optDouble(key);
        }
        private static int clamp(int v, int min, int max) {
            return Math.max(min, Math.min(max, v));
        }
        private static float clamp(float v, float min, float max) {
            return Math.max(min, Math.min(max, v));
        }
    }
}
