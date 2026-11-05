package com.airbnb.lottie;

/* loaded from: classes.dex */
public class Lottie {
    private Lottie() {
    }

    public static void initialize(LottieConfig lottieConfig) {
        C0578L.setFetcher(lottieConfig.networkFetcher);
        C0578L.setCacheProvider(lottieConfig.cacheProvider);
        C0578L.setTraceEnabled(lottieConfig.enableSystraceMarkers);
        C0578L.setNetworkCacheEnabled(lottieConfig.enableNetworkCache);
        C0578L.setDisablePathInterpolatorCache(lottieConfig.disablePathInterpolatorCache);
        C0578L.setDefaultAsyncUpdates(lottieConfig.defaultAsyncUpdates);
        C0578L.setReducedMotionOption(lottieConfig.reducedMotionOption);
    }
}
