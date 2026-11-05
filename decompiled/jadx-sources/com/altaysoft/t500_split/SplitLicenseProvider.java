package com.altaysoft.t500_split;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

/* loaded from: classes.dex */
public class SplitLicenseProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        String stringByIndex;
        if (uri == null || (stringByIndex = NativeLib.getStringByIndex(34)) == null || !stringByIndex.equals(uri.getLastPathSegment())) {
            return null;
        }
        return NativeLib.getStringByIndex(88);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String stringByIndex;
        String callingPackage;
        String stringByIndex2;
        Context context;
        if (!((uri == null || (stringByIndex = NativeLib.getStringByIndex(34)) == null || !stringByIndex.equals(uri.getLastPathSegment())) ? false : true) || (callingPackage = getCallingPackage()) == null || (stringByIndex2 = NativeLib.getStringByIndex(50)) == null || !stringByIndex2.equals(callingPackage) || (context = getContext()) == null) {
            return null;
        }
        String stringByIndex3 = NativeLib.getStringByIndex(165);
        String stringByIndex4 = NativeLib.getStringByIndex(42);
        if (stringByIndex3 != null && stringByIndex4 != null) {
            int i = context.getSharedPreferences(stringByIndex3, 0).getInt(stringByIndex4, 1);
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{stringByIndex4});
            matrixCursor.addRow(new Object[]{Integer.valueOf(i)});
            return matrixCursor;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
