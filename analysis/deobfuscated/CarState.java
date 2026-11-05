package deobfuscated.gauges;

import java.util.ArrayList;
import java.util.List;

/**
 * Реконструкция com.altaysoft.t500_split.carData в части скорости/оборотов.
 *
 * Native CAN-ридер вызывает setSpeed()/setRpm(); UI подписывается на LiveData.
 */
public final class CarState {

    private final LiveData<Float> speed = new LiveData<>(0f); // f2415T
    private final LiveData<Float> rpm   = new LiveData<>(0f); // f2417U
    private final LiveData<Float> odometer = new LiveData<>(0f); // f2485y0

    // --- вызывается из JNI ---
    public void setSpeed(float value) { speed.post(value); }
    public void setRpm(float value)   { rpm.post(value); }
    public void setOdometer(float value) { odometer.post(value); }

    // --- используется UI ---
    public float getSpeed() { return speed.get(); }   // m1780z
    public float getRpm()   { return rpm.get(); }     // m1779y
    public float getOdometer() { return odometer.get(); } // m1771r

    // --- подписки (в оригинале m1754i0 / m1750g0 / m1738a0) ---
    public void observeSpeed(Object owner, Observer<Float> o) { speed.observe(owner, o); }
    public void observeRpm(Object owner, Observer<Float> o)   { rpm.observe(owner, o); }
    public void observeOdometer(Object owner, Observer<Float> o) { odometer.observe(owner, o); }

    public interface Observer<T> { void onChanged(T value); }

    /** Упрощённая замена androidx.lifecycle.C0560y. */
    public static final class LiveData<T> {
        private T value;
        private final List<Observer<T>> observers = new ArrayList<>();

        public LiveData(T initial) { this.value = initial; }
        public T get() { return value; }
        public void post(T v) {
            value = v;
            for (Observer<T> o : new ArrayList<>(observers)) o.onChanged(v);
        }
        public void observe(Object owner, Observer<T> o) {
            observers.add(o);
            o.onChanged(value);
        }
    }
}
