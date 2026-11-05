package deobfuscated.gauges;

import android.widget.ImageView;

/**
 * Реконструкция p098q0.C1260G0 (GaugeAnimator) — user themes.
 *
 * value -> angle:
 *   ratio = (clamp(value, min, max) - min) / (max - min)
 *   angle = (angleMax - angleMin) * ratio + angleMin
 *
 * Сглаживание:
 *   alpha = 1 - exp(-dt / 300)
 *   current = (target - current) * alpha + current
 *
 * Шаг вызывается каждые 16 мс, пока |angle - lastAngle| > 0.01.
 */
public final class GaugeAnimator {

    public final float valueMin;
    public final float valueMax;
    public final long smoothingMs;
    public final float angleMin;
    public final float angleMax;
    public final float angleDeadband;

    private float currentValue;
    private float targetValue;
    private float currentAngle;
    private float lastAngle;
    private boolean dirty = true;

    public GaugeAnimator(float valueMin, float valueMax, long smoothingMs,
                         float initialValue, float angleMin, float angleMax,
                         float angleDeadband) {
        this.valueMin = valueMin;
        this.valueMax = valueMax;
        this.smoothingMs = Math.max(1L, smoothingMs);
        this.angleMin = angleMin;
        this.angleMax = angleMax;
        this.angleDeadband = Math.min(0.02f, Math.max(0.01f, angleDeadband));

        this.currentValue = clamp(initialValue, valueMin, valueMax);
        this.targetValue = this.currentValue;
        this.currentAngle = angleFor(this.currentValue);
        this.lastAngle = this.currentAngle;
    }

    public void setTarget(float value) {
        this.targetValue = clamp(value, valueMin, valueMax);
    }

    public float currentAngle() { return currentAngle; }

    /**
     * @param scale дополнительный масштаб ImageView (обычно 1.0)
     * @param dt    миллисекунды с прошлого шага
     * @param view  стрелка
     * @return true, если угол изменился
     */
    public boolean step(float scale, float dt, ImageView view) {
        if (dt < 1f) dt = 1f;
        if (dt > 100f) dt = 100f;

        float alpha = 1f - (float) Math.exp(-dt / (float) smoothingMs);
        currentValue = (targetValue - currentValue) * alpha + currentValue;

        // Мёртвая зона, чтобы стрелка не дрожала.
        float range = valueMax - valueMin;
        if (Math.abs(currentValue - targetValue) <= Math.max(0.001f, range) * 5e-4f) {
            currentValue = targetValue;
        }
        currentValue = clamp(currentValue, valueMin, valueMax);

        float newAngle = angleFor(currentValue);
        boolean changed = Math.abs(newAngle - lastAngle) > angleDeadband || dirty;

        if (view != null && changed) {
            if (scale <= 0.01f) scale = 1f;
            if (view.getWidth() != 0) {
                view.setPivotX(view.getWidth() / 2f);
                view.setPivotY(view.getHeight() / 2f);
                view.setScaleX(scale);
                view.setScaleY(scale);
            }
            view.setRotation(newAngle);
            lastAngle = newAngle;
            currentAngle = newAngle;
            dirty = false;
        }
        return changed;
    }

    private float angleFor(float value) {
        float range = valueMax - valueMin;
        if (range <= 0f) return angleMin;
        float ratio = (clamp(value, valueMin, valueMax) - valueMin) / range;
        return (angleMax - angleMin) * ratio + angleMin;
    }

    private static float clamp(float v, float min, float max) {
        return Math.max(min, Math.min(max, v));
    }
}
