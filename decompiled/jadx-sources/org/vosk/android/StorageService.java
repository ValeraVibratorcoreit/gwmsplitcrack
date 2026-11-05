package org.vosk.android;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.altaysoft.t500_split.media.RunnableC0642j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import org.vosk.Model;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public class StorageService {
    protected static final String TAG = "StorageService";

    public interface Callback<R> {
        void onComplete(R r2);
    }

    private static void copyAssets(AssetManager assetManager, String str, File file) {
        String[] list = assetManager.list(str);
        if (list == null) {
            return;
        }
        if (list.length == 0) {
            if (str.endsWith("uuid")) {
                return;
            }
            copyFile(assetManager, str, file);
            return;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            String str2 = TAG;
            Log.v(str2, "Making directory " + file2.getAbsolutePath());
            if (!file2.mkdirs()) {
                Log.v(str2, "Failed to create directory " + file2.getAbsolutePath());
            }
        }
        for (String str3 : list) {
            copyAssets(assetManager, AbstractC0062j.m169w(str, "/", str3), file);
        }
    }

    private static void copyFile(AssetManager assetManager, String str, File file) {
        Log.v(TAG, "Copy " + str + " to " + file);
        InputStream open = assetManager.open(str);
        FileOutputStream fileOutputStream = new FileOutputStream(file + "/" + str);
        byte[] bArr = new byte[4000];
        while (true) {
            int read = open.read(bArr);
            if (read == -1) {
                open.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean deleteContents(File file) {
        File[] listFiles = file.listFiles();
        boolean z2 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z2 &= deleteContents(file2);
                }
                if (!file2.delete()) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unpack$2(Context context, String str, String str2, Handler handler, Callback callback, Callback callback2) {
        try {
            handler.post(new RunnableC1210a(callback, 2, new Model(sync(context, str, str2))));
        } catch (IOException e2) {
            handler.post(new RunnableC1210a(callback2, 3, e2));
        }
    }

    private static String readLine(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream)).readLine();
    }

    public static String sync(Context context, String str, String str2) {
        AssetManager assets = context.getAssets();
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            throw new IOException("cannot get external files dir, external storage state is " + Environment.getExternalStorageState());
        }
        File file = new File(externalFilesDir, str2);
        String absolutePath = new File(file, str).getAbsolutePath();
        try {
            if (readLine(new FileInputStream(new File(file, str + "/uuid"))).equals(readLine(assets.open(str + "/uuid")))) {
                return absolutePath;
            }
        } catch (FileNotFoundException unused) {
        }
        deleteContents(file);
        copyAssets(assets, str, file);
        copyFile(assets, AbstractC0062j.m160n(str, "/uuid"), file);
        return absolutePath;
    }

    public static void unpack(Context context, String str, String str2, Callback<Model> callback, Callback<IOException> callback2) {
        Executors.newSingleThreadExecutor().execute(new RunnableC0642j(context, str, str2, new Handler(Looper.getMainLooper()), callback, callback2, 1));
    }
}
