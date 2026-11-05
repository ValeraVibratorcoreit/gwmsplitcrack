package com.airbnb.lottie.network;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public interface LottieFetchResult extends Closeable {
    InputStream bodyByteStream();

    String contentType();

    String error();

    boolean isSuccessful();
}
