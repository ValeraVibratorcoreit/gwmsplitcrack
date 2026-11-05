package com.airbnb.lottie;

import android.util.Log;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p020J.C0144b;
import p091o.C1193c;

/* loaded from: classes.dex */
public class PerformanceTracker {
    private boolean enabled = false;
    private final Set<FrameListener> frameListeners = new C1193c();
    private final Map<String, MeanCalculator> layerRenderTimes = new HashMap();
    private final Comparator<C0144b> floatComparator = new Comparator<C0144b>() { // from class: com.airbnb.lottie.PerformanceTracker.1
        @Override // java.util.Comparator
        public int compare(C0144b c0144b, C0144b c0144b2) {
            float floatValue = ((Float) c0144b.f450b).floatValue();
            float floatValue2 = ((Float) c0144b2.f450b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    public interface FrameListener {
        void onFrameRendered(float f2);
    }

    public void addFrameListener(FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public List<C0144b> getSortedRenderTimes() {
        if (!this.enabled) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Map.Entry<String, MeanCalculator> entry : this.layerRenderTimes.entrySet()) {
            arrayList.add(new C0144b(entry.getKey(), Float.valueOf(entry.getValue().getMean())));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.enabled) {
            List<C0144b> sortedRenderTimes = getSortedRenderTimes();
            Log.d(C0578L.TAG, "Render times:");
            for (int i = 0; i < sortedRenderTimes.size(); i++) {
                C0144b c0144b = sortedRenderTimes.get(i);
                Log.d(C0578L.TAG, String.format("\t\t%30s:%.2f", c0144b.f449a, c0144b.f450b));
            }
        }
    }

    public void recordRenderTime(String str, float f2) {
        if (this.enabled) {
            MeanCalculator meanCalculator = this.layerRenderTimes.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                this.layerRenderTimes.put(str, meanCalculator);
            }
            meanCalculator.add(f2);
            if (str.equals("__container")) {
                Iterator<FrameListener> it = this.frameListeners.iterator();
                while (it.hasNext()) {
                    it.next().onFrameRendered(f2);
                }
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.frameListeners.remove(frameListener);
    }

    public void setEnabled(boolean z2) {
        this.enabled = z2;
    }
}
