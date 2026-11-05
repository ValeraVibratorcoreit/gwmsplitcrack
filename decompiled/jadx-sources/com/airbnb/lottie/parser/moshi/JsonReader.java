package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p010D1.C0077a;
import p010D1.C0080d;
import p010D1.C0083g;
import p010D1.InterfaceC0078b;
import p010D1.InterfaceC0079c;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    boolean failOnUnknown;
    boolean lenient;
    int stackSize;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];

    public static final class Options {
        final C0083g doubleQuoteSuffix;
        final String[] strings;

        private Options(String[] strArr, C0083g c0083g) {
            this.strings = strArr;
            this.doubleQuoteSuffix = c0083g;
        }

        /* renamed from: of */
        public static Options m1624of(String... strArr) {
            try {
                C0080d[] c0080dArr = new C0080d[strArr.length];
                C0077a c0077a = new C0077a();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.string(c0077a, strArr[i]);
                    c0077a.m228l();
                    try {
                        c0080dArr[i] = new C0080d(c0077a.m229m(c0077a.f240b));
                    } catch (EOFException e2) {
                        throw new AssertionError(e2);
                    }
                }
                return new Options((String[]) strArr.clone(), C0083g.m249b(c0080dArr));
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: of */
    public static JsonReader m1623of(InterfaceC0079c interfaceC0079c) {
        return new JsonUtf8Reader(interfaceC0079c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void string(InterfaceC0078b interfaceC0078b, String str) {
        int i;
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        C0077a c0077a = (C0077a) interfaceC0078b;
        c0077a.m235s(34);
        int length = str.length();
        int i2 = 0;
        for (0; i < length; i + 1) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    c0077a.m237u(str, i2, i);
                }
                c0077a.m237u(str2, 0, str2.length());
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                c0077a.m237u(str2, 0, str2.length());
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            c0077a.m237u(str, i2, length);
        }
        c0077a.m235s(34);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract Token peek();

    public final void pushScope(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.scopes;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.scopes;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int selectName(Options options);

    public abstract void skipName();

    public abstract void skipValue();

    public final JsonEncodingException syntaxError(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }
}
