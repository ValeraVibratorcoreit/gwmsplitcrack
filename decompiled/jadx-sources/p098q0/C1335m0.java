package p098q0;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: q0.m0 */
/* loaded from: classes.dex */
public final class C1335m0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".png") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg");
    }
}
