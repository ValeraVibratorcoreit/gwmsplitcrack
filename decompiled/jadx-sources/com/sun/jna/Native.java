package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006C.AbstractC0062j;
import p097q.AbstractC1241e;
import p109u0.AbstractC1561o;

/* loaded from: classes.dex */
public final class Native implements Version {
    public static final int BOOL_SIZE;
    static final int CB_HAS_INITIALIZER = 1;
    static final int CB_OPTION_DIRECT = 1;
    static final int CB_OPTION_IN_DLL = 2;
    private static final int CVT_ARRAY_BOOLEAN = 13;
    private static final int CVT_ARRAY_BYTE = 6;
    private static final int CVT_ARRAY_CHAR = 8;
    private static final int CVT_ARRAY_DOUBLE = 12;
    private static final int CVT_ARRAY_FLOAT = 11;
    private static final int CVT_ARRAY_INT = 9;
    private static final int CVT_ARRAY_LONG = 10;
    private static final int CVT_ARRAY_SHORT = 7;
    private static final int CVT_BOOLEAN = 14;
    private static final int CVT_BUFFER = 5;
    private static final int CVT_BYTE = 29;
    private static final int CVT_CALLBACK = 15;
    private static final int CVT_DEFAULT = 0;
    private static final int CVT_FLOAT = 16;
    private static final int CVT_INTEGER_TYPE = 21;
    private static final int CVT_JNIENV = 27;
    private static final int CVT_NATIVE_MAPPED = 17;
    private static final int CVT_NATIVE_MAPPED_STRING = 18;
    private static final int CVT_NATIVE_MAPPED_WSTRING = 19;
    private static final int CVT_OBJECT = 26;
    private static final int CVT_POINTER = 1;
    private static final int CVT_POINTER_TYPE = 22;
    private static final int CVT_SHORT = 28;
    private static final int CVT_STRING = 2;
    private static final int CVT_STRUCTURE = 3;
    private static final int CVT_STRUCTURE_BYVAL = 4;
    private static final int CVT_TYPE_MAPPER = 23;
    private static final int CVT_TYPE_MAPPER_STRING = 24;
    private static final int CVT_TYPE_MAPPER_WSTRING = 25;
    private static final int CVT_UNSUPPORTED = -1;
    private static final int CVT_WSTRING = 20;
    public static final boolean DEBUG_JNA_LOAD;
    private static final Level DEBUG_JNA_LOAD_LEVEL;
    public static final boolean DEBUG_LOAD;
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_ENCODING;
    private static final Callback.UncaughtExceptionHandler DEFAULT_HANDLER;
    static final String JNA_TMPLIB_PREFIX = "jna";
    private static final Logger LOG = Logger.getLogger(Native.class.getName());
    public static final int LONG_DOUBLE_SIZE;
    public static final int LONG_SIZE;
    static final int MAX_ALIGNMENT;
    static final int MAX_PADDING;
    public static final int POINTER_SIZE;
    public static final int SIZE_T_SIZE;
    private static final int TYPE_BOOL = 4;
    private static final int TYPE_LONG = 1;
    private static final int TYPE_LONG_DOUBLE = 5;
    private static final int TYPE_SIZE_T = 3;
    private static final int TYPE_VOIDP = 0;
    private static final int TYPE_WCHAR_T = 2;
    public static final int WCHAR_SIZE;
    private static final String _OPTION_ENCLOSING_LIBRARY = "enclosing-library";
    private static Callback.UncaughtExceptionHandler callbackExceptionHandler;
    private static final Object finalizer;
    static String jnidispatchPath;
    private static final Map<Class<?>, Reference<?>> libraries;
    private static final ThreadLocal<Memory> nativeThreadTerminationFlag;
    private static final Map<Thread, Pointer> nativeThreads;
    private static final Map<Class<?>, long[]> registeredClasses;
    private static final Map<Class<?>, NativeLibrary> registeredLibraries;
    private static final Map<Class<?>, Map<String, Object>> typeOptions;

    public static class AWT {
        private AWT() {
        }

        public static long getComponentID(Object obj) {
            if (GraphicsEnvironment.isHeadless()) {
                throw new HeadlessException("No native windows when headless");
            }
            Component component = (Component) obj;
            if (component.isLightweight()) {
                throw new IllegalArgumentException("Component must be heavyweight");
            }
            if (!component.isDisplayable()) {
                throw new IllegalStateException("Component must be displayable");
            }
            if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
                throw new IllegalStateException("Component must be visible");
            }
            return Native.getWindowHandle0(component);
        }

        public static long getWindowID(Window window) {
            return getComponentID(window);
        }
    }

    public static class Buffers {
        private Buffers() {
        }

        public static boolean isBuffer(Class<?> cls) {
            return Buffer.class.isAssignableFrom(cls);
        }
    }

    public interface ffi_callback {
        void invoke(long j2, long j3, long j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    static {
        Charset forName;
        String property = System.getProperty("native.encoding");
        if (property != null) {
            try {
                forName = Charset.forName(property);
            } catch (Exception e2) {
                LOG.log(Level.WARNING, AbstractC0062j.m161o("Failed to get charset for native.encoding value : '", property, "'"), (Throwable) e2);
            }
            if (forName == null) {
                forName = Charset.defaultCharset();
            }
            DEFAULT_CHARSET = forName;
            DEFAULT_ENCODING = forName.name();
            DEBUG_LOAD = Boolean.getBoolean("jna.debug_load");
            boolean z2 = Boolean.getBoolean("jna.debug_load.jna");
            DEBUG_JNA_LOAD = z2;
            DEBUG_JNA_LOAD_LEVEL = !z2 ? Level.INFO : Level.FINE;
            jnidispatchPath = null;
            typeOptions = Collections.synchronizedMap(new WeakHashMap());
            libraries = Collections.synchronizedMap(new WeakHashMap());
            Callback.UncaughtExceptionHandler uncaughtExceptionHandler = new Callback.UncaughtExceptionHandler() { // from class: com.sun.jna.Native.1
                @Override // com.sun.jna.Callback.UncaughtExceptionHandler
                public void uncaughtException(Callback callback, Throwable th) {
                    Native.LOG.log(Level.WARNING, "JNA: Callback " + callback + " threw the following exception", th);
                }
            };
            DEFAULT_HANDLER = uncaughtExceptionHandler;
            callbackExceptionHandler = uncaughtExceptionHandler;
            loadNativeDispatchLibrary();
            if (isCompatibleVersion(Version.VERSION_NATIVE, getNativeVersion())) {
                String lineSeparator = System.lineSeparator();
                StringBuilder sb = new StringBuilder();
                sb.append(lineSeparator);
                sb.append(lineSeparator);
                sb.append("There is an incompatible JNA native library installed on this system");
                sb.append(lineSeparator);
                sb.append("Expected: 7.0.4");
                sb.append(lineSeparator);
                sb.append("Found:    ");
                sb.append(getNativeVersion());
                sb.append(lineSeparator);
                sb.append(jnidispatchPath != null ? AbstractC0062j.m162p(new StringBuilder("(at "), jnidispatchPath, ")") : System.getProperty("java.library.path"));
                sb.append(".");
                sb.append(lineSeparator);
                sb.append("To resolve this issue you may do one of the following:");
                sb.append(lineSeparator);
                sb.append(" - remove or uninstall the offending library");
                sb.append(lineSeparator);
                sb.append(" - set the system property jna.nosys=true");
                sb.append(lineSeparator);
                sb.append(" - set jna.boot.library.path to include the path to the version of the ");
                sb.append(lineSeparator);
                sb.append("   jnidispatch library included with the JNA jar file you are using");
                sb.append(lineSeparator);
                throw new Error(sb.toString());
            }
            POINTER_SIZE = sizeof(0);
            int sizeof = sizeof(1);
            LONG_SIZE = sizeof;
            WCHAR_SIZE = sizeof(2);
            SIZE_T_SIZE = sizeof(3);
            BOOL_SIZE = sizeof(4);
            LONG_DOUBLE_SIZE = sizeof(5);
            initIDs();
            if (Boolean.getBoolean("jna.protected")) {
                setProtected(true);
            }
            if (Platform.isSPARC() || Platform.isWindows() || ((Platform.isLinux() && (Platform.isARM() || Platform.isPPC() || Platform.isMIPS() || Platform.isLoongArch())) || Platform.isAIX() || (Platform.isAndroid() && !Platform.isIntel()))) {
                sizeof = 8;
            }
            MAX_ALIGNMENT = sizeof;
            MAX_PADDING = (Platform.isMac() && Platform.isPPC()) ? 8 : sizeof;
            System.setProperty("jna.loaded", "true");
            finalizer = new Object() { // from class: com.sun.jna.Native.2
                public void finalize() {
                    Native.dispose();
                    super.finalize();
                }
            };
            registeredClasses = new WeakHashMap();
            registeredLibraries = new WeakHashMap();
            nativeThreadTerminationFlag = new ThreadLocal<Memory>() { // from class: com.sun.jna.Native.7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.lang.ThreadLocal
                public Memory initialValue() {
                    Memory memory = new Memory(4L);
                    memory.clear();
                    return memory;
                }
            };
            nativeThreads = Collections.synchronizedMap(new WeakHashMap());
            return;
        }
        forName = null;
        if (forName == null) {
        }
        DEFAULT_CHARSET = forName;
        DEFAULT_ENCODING = forName.name();
        DEBUG_LOAD = Boolean.getBoolean("jna.debug_load");
        boolean z22 = Boolean.getBoolean("jna.debug_load.jna");
        DEBUG_JNA_LOAD = z22;
        DEBUG_JNA_LOAD_LEVEL = !z22 ? Level.INFO : Level.FINE;
        jnidispatchPath = null;
        typeOptions = Collections.synchronizedMap(new WeakHashMap());
        libraries = Collections.synchronizedMap(new WeakHashMap());
        Callback.UncaughtExceptionHandler uncaughtExceptionHandler2 = new Callback.UncaughtExceptionHandler() { // from class: com.sun.jna.Native.1
            @Override // com.sun.jna.Callback.UncaughtExceptionHandler
            public void uncaughtException(Callback callback, Throwable th) {
                Native.LOG.log(Level.WARNING, "JNA: Callback " + callback + " threw the following exception", th);
            }
        };
        DEFAULT_HANDLER = uncaughtExceptionHandler2;
        callbackExceptionHandler = uncaughtExceptionHandler2;
        loadNativeDispatchLibrary();
        if (isCompatibleVersion(Version.VERSION_NATIVE, getNativeVersion())) {
        }
    }

    private Native() {
    }

    private static native long _getDirectBufferPointer(Buffer buffer);

    private static native long _getPointer(long j2);

    private static Map<String, Object> cacheOptions(Class<?> cls, Map<String, ?> map, Object obj) {
        HashMap hashMap = new HashMap(map);
        hashMap.put(_OPTION_ENCLOSING_LIBRARY, cls);
        typeOptions.put(cls, hashMap);
        if (obj != null) {
            libraries.put(cls, new WeakReference(obj));
        }
        if (!cls.isInterface() && Library.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Class<?> cls2 = interfaces[i];
                if (Library.class.isAssignableFrom(cls2)) {
                    cacheOptions(cls2, hashMap, obj);
                    break;
                }
                i++;
            }
        }
        return hashMap;
    }

    public static native void close(long j2);

    public static native synchronized long createNativeCallback(Callback callback, Method method, Class<?>[] clsArr, Class<?> cls, int i, int i2, String str);

    public static boolean deleteLibrary(File file) {
        if (file.delete()) {
            return true;
        }
        markTemporaryFile(file);
        return false;
    }

    public static void detach(boolean z2) {
        Thread currentThread = Thread.currentThread();
        if (z2) {
            nativeThreads.remove(currentThread);
            nativeThreadTerminationFlag.get();
            setDetachState(true, 0L);
        } else {
            Map<Thread, Pointer> map = nativeThreads;
            if (map.containsKey(currentThread)) {
                return;
            }
            Memory memory = nativeThreadTerminationFlag.get();
            map.put(currentThread, memory);
            setDetachState(false, memory.peer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispose() {
        CallbackReference.disposeAll();
        Memory.disposeAll();
        NativeLibrary.disposeAll();
        unregisterAll();
        jnidispatchPath = null;
        System.setProperty("jna.loaded", "false");
    }

    public static File extractFromResourcePath(String str) {
        return extractFromResourcePath(str, null);
    }

    public static native void ffi_call(long j2, long j3, long j4, long j5);

    public static native void ffi_free_closure(long j2);

    public static native long ffi_prep_cif(int i, int i2, long j2, long j3);

    public static native long ffi_prep_closure(long j2, ffi_callback ffi_callbackVar);

    public static Class<?> findDirectMappedClass(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & Function.MAX_NARGS) != 0) {
                return cls;
            }
        }
        int lastIndexOf = cls.getName().lastIndexOf("$");
        if (lastIndexOf != -1) {
            try {
                return findDirectMappedClass(Class.forName(cls.getName().substring(0, lastIndexOf), true, cls.getClassLoader()));
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new IllegalArgumentException("Can't determine class with native methods from the current context (" + cls + ")");
    }

    public static Class<?> findEnclosingLibraryClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Map<String, Object> map = typeOptions.get(cls);
        if (map != null) {
            Class<?> cls2 = (Class) map.get(_OPTION_ENCLOSING_LIBRARY);
            return cls2 != null ? cls2 : cls;
        }
        if (Library.class.isAssignableFrom(cls)) {
            return cls;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            cls = CallbackReference.findCallbackClass(cls);
        }
        Class<?> findEnclosingLibraryClass = findEnclosingLibraryClass(cls.getDeclaringClass());
        return findEnclosingLibraryClass != null ? findEnclosingLibraryClass : findEnclosingLibraryClass(cls.getSuperclass());
    }

    public static native long findSymbol(long j2, String str);

    public static native void free(long j2);

    public static native synchronized void freeNativeCallback(long j2);

    private static NativeMapped fromNative(Class<?> cls, Object obj) {
        return (NativeMapped) NativeMappedConverter.getInstance(cls).fromNative(obj, new FromNativeContext(cls));
    }

    private static native String getAPIChecksum();

    public static native byte getByte(Pointer pointer, long j2, long j3);

    public static byte[] getBytes(String str) {
        return getBytes(str, getDefaultStringEncoding());
    }

    public static Callback.UncaughtExceptionHandler getCallbackExceptionHandler() {
        return callbackExceptionHandler;
    }

    public static Class<?> getCallingClass() {
        Class<?>[] classContext = new SecurityManager() { // from class: com.sun.jna.Native.6
            @Override // java.lang.SecurityManager
            public Class<?>[] getClassContext() {
                return super.getClassContext();
            }
        }.getClassContext();
        if (classContext == null) {
            throw new IllegalStateException("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        }
        if (classContext.length >= 4) {
            return classContext[3];
        }
        throw new IllegalStateException("This method must be called from the static initializer of a class");
    }

    public static native char getChar(Pointer pointer, long j2, long j3);

    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Charset getCharset(String str) {
        Charset forName;
        if (str != null) {
            try {
                forName = Charset.forName(str);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException e2) {
                LOG.log(Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new Object[]{str, e2.getMessage()});
            }
            if (forName == null) {
                return forName;
            }
            Logger logger = LOG;
            Level level = Level.WARNING;
            Charset charset = DEFAULT_CHARSET;
            logger.log(level, "JNA Warning: Using fallback encoding {0}", charset);
            return charset;
        }
        forName = null;
        if (forName == null) {
        }
    }

    public static long getComponentID(Component component) {
        return AWT.getComponentID(component);
    }

    public static Pointer getComponentPointer(Component component) {
        return new Pointer(AWT.getComponentID(component));
    }

    private static int getConversion(Class<?> cls, TypeMapper typeMapper, boolean z2) {
        if (cls == Void.class) {
            cls = Void.TYPE;
        }
        if (typeMapper != null) {
            FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(cls);
            ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(cls);
            if (fromNativeConverter != null) {
                Class<?> nativeType = fromNativeConverter.nativeType();
                return nativeType == String.class ? CVT_TYPE_MAPPER_STRING : nativeType == WString.class ? CVT_TYPE_MAPPER_WSTRING : CVT_TYPE_MAPPER;
            }
            if (toNativeConverter != null) {
                Class<?> nativeType2 = toNativeConverter.nativeType();
                return nativeType2 == String.class ? CVT_TYPE_MAPPER_STRING : nativeType2 == WString.class ? CVT_TYPE_MAPPER_WSTRING : CVT_TYPE_MAPPER;
            }
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (String.class == cls) {
            return 2;
        }
        if (WString.class.isAssignableFrom(cls)) {
            return CVT_WSTRING;
        }
        if (Platform.HAS_BUFFERS && Buffers.isBuffer(cls)) {
            return 5;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            return Structure.ByValue.class.isAssignableFrom(cls) ? 4 : 3;
        }
        if (cls.isArray()) {
            char charAt = cls.getName().charAt(1);
            if (charAt == 'F') {
                return 11;
            }
            if (charAt == 'S') {
                return 7;
            }
            if (charAt == 'Z') {
                return CVT_ARRAY_BOOLEAN;
            }
            if (charAt == 'I') {
                return 9;
            }
            if (charAt == 'J') {
                return 10;
            }
            switch (charAt) {
                case 'B':
                    return 6;
                case 'C':
                    return 8;
                case 'D':
                    return 12;
            }
        }
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return CVT_BOOLEAN;
            }
            return 0;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            return CVT_CALLBACK;
        }
        if (IntegerType.class.isAssignableFrom(cls)) {
            return CVT_INTEGER_TYPE;
        }
        if (PointerType.class.isAssignableFrom(cls)) {
            return CVT_POINTER_TYPE;
        }
        if (NativeMapped.class.isAssignableFrom(cls)) {
            Class<?> nativeType3 = NativeMappedConverter.getInstance(cls).nativeType();
            return nativeType3 == String.class ? CVT_NATIVE_MAPPED_STRING : nativeType3 == WString.class ? CVT_NATIVE_MAPPED_WSTRING : CVT_NATIVE_MAPPED;
        }
        if (JNIEnv.class == cls) {
            return CVT_JNIENV;
        }
        if (z2) {
            return CVT_OBJECT;
        }
        return -1;
    }

    public static String getDefaultStringEncoding() {
        return System.getProperty("jna.encoding", DEFAULT_ENCODING);
    }

    public static Pointer getDirectBufferPointer(Buffer buffer) {
        long _getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (_getDirectBufferPointer == 0) {
            return null;
        }
        return new Pointer(_getDirectBufferPointer);
    }

    public static native ByteBuffer getDirectByteBuffer(Pointer pointer, long j2, long j3, long j4);

    public static native double getDouble(Pointer pointer, long j2, long j3);

    public static native float getFloat(Pointer pointer, long j2, long j3);

    public static native int getInt(Pointer pointer, long j2, long j3);

    public static native int getLastError();

    public static Map<String, Object> getLibraryOptions(Class<?> cls) {
        Map emptyMap;
        Map<Class<?>, Map<String, Object>> map = typeOptions;
        Map<String, Object> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        Class<?> findEnclosingLibraryClass = findEnclosingLibraryClass(cls);
        if (findEnclosingLibraryClass != null) {
            loadLibraryInstance(findEnclosingLibraryClass);
        } else {
            findEnclosingLibraryClass = cls;
        }
        Map<String, Object> map3 = map.get(findEnclosingLibraryClass);
        if (map3 != null) {
            map.put(cls, map3);
            return map3;
        }
        try {
            Field field = findEnclosingLibraryClass.getField("OPTIONS");
            field.setAccessible(true);
            emptyMap = (Map) field.get(null);
        } catch (NoSuchFieldException unused) {
            emptyMap = Collections.emptyMap();
        } catch (Exception e2) {
            throw new IllegalArgumentException("OPTIONS must be a public field of type java.util.Map (" + e2 + "): " + findEnclosingLibraryClass);
        }
        if (emptyMap == null) {
            throw new IllegalStateException("Null options field");
        }
        HashMap hashMap = new HashMap(emptyMap);
        if (!hashMap.containsKey(Library.OPTION_TYPE_MAPPER)) {
            hashMap.put(Library.OPTION_TYPE_MAPPER, lookupField(findEnclosingLibraryClass, "TYPE_MAPPER", TypeMapper.class));
        }
        if (!hashMap.containsKey(Library.OPTION_STRUCTURE_ALIGNMENT)) {
            hashMap.put(Library.OPTION_STRUCTURE_ALIGNMENT, lookupField(findEnclosingLibraryClass, "STRUCTURE_ALIGNMENT", Integer.class));
        }
        if (!hashMap.containsKey(Library.OPTION_STRING_ENCODING)) {
            hashMap.put(Library.OPTION_STRING_ENCODING, lookupField(findEnclosingLibraryClass, "STRING_ENCODING", String.class));
        }
        Map<String, Object> cacheOptions = cacheOptions(findEnclosingLibraryClass, hashMap, null);
        if (cls != findEnclosingLibraryClass) {
            typeOptions.put(cls, cacheOptions);
        }
        return cacheOptions;
    }

    public static native long getLong(Pointer pointer, long j2, long j3);

    public static NativeLibrary getNativeLibrary(Library library) {
        if (library == null) {
            throw new IllegalArgumentException("null passed to getNativeLibrary");
        }
        if (!Proxy.isProxyClass(library.getClass())) {
            throw new IllegalArgumentException("library object passed to getNativeLibrary in not a proxy");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (invocationHandler instanceof Library.Handler) {
            return ((Library.Handler) invocationHandler).getNativeLibrary();
        }
        throw new IllegalArgumentException("Object is not a properly initialized Library interface instance");
    }

    public static int getNativeSize(Class<?> cls, Object obj) {
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            if (length > 0) {
                return getNativeSize(cls.getComponentType(), Array.get(obj, 0)) * length;
            }
            throw new IllegalArgumentException("Arrays of length zero not allowed: " + cls);
        }
        if (Structure.class.isAssignableFrom(cls) && !Structure.ByReference.class.isAssignableFrom(cls)) {
            return Structure.size(cls, (Structure) obj);
        }
        try {
            return getNativeSize(cls);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("The type \"" + cls.getName() + "\" is not supported: " + e2.getMessage());
        }
    }

    private static native String getNativeVersion();

    public static Pointer getPointer(long j2) {
        long _getPointer = _getPointer(j2);
        if (_getPointer == 0) {
            return null;
        }
        return new Pointer(_getPointer);
    }

    public static native short getShort(Pointer pointer, long j2, long j3);

    public static String getSignature(Class<?> cls) {
        if (cls.isArray()) {
            return "[" + getSignature(cls.getComponentType());
        }
        if (cls.isPrimitive()) {
            if (cls == Void.TYPE) {
                return "V";
            }
            if (cls == Boolean.TYPE) {
                return "Z";
            }
            if (cls == Byte.TYPE) {
                return "B";
            }
            if (cls == Short.TYPE) {
                return "S";
            }
            if (cls == Character.TYPE) {
                return "C";
            }
            if (cls == Integer.TYPE) {
                return "I";
            }
            if (cls == Long.TYPE) {
                return "J";
            }
            if (cls == Float.TYPE) {
                return "F";
            }
            if (cls == Double.TYPE) {
                return "D";
            }
        }
        return "L" + replace(".", "/", cls.getName()) + ";";
    }

    public static String getString(Pointer pointer, long j2) {
        return getString(pointer, j2, getDefaultStringEncoding());
    }

    public static native byte[] getStringBytes(Pointer pointer, long j2, long j3);

    public static String getStringEncoding(Class<?> cls) {
        String str = (String) getLibraryOptions(cls).get(Library.OPTION_STRING_ENCODING);
        return str != null ? str : getDefaultStringEncoding();
    }

    public static int getStructureAlignment(Class<?> cls) {
        Integer num = (Integer) getLibraryOptions(cls).get(Library.OPTION_STRUCTURE_ALIGNMENT);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static File getTempDir() {
        File file;
        File file2;
        String property = System.getProperty("jna.tmpdir");
        if (property != null) {
            file = new File(property);
            file.mkdirs();
        } else {
            file = new File(System.getProperty("java.io.tmpdir"));
            if (Platform.isMac()) {
                file2 = new File(System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (Platform.isLinux() || Platform.isSolaris() || Platform.isAIX() || Platform.isDragonFlyBSD() || Platform.isFreeBSD() || Platform.isNetBSD() || Platform.isOpenBSD() || Platform.iskFreeBSD()) {
                String str = System.getenv("XDG_CACHE_HOME");
                file2 = new File((str == null || str.trim().isEmpty()) ? new File(System.getProperty("user.home"), ".cache") : new File(str), "JNA/temp");
            } else {
                file2 = new File(file, "jna-" + System.getProperty("user.name").hashCode());
            }
            file2.mkdirs();
            if (file2.exists() && file2.canWrite()) {
                file = file2;
            }
        }
        if (!file.exists()) {
            throw new IOException("JNA temporary directory '" + file + "' does not exist");
        }
        if (file.canWrite()) {
            return file;
        }
        throw new IOException("JNA temporary directory '" + file + "' is not writable");
    }

    public static Pointer getTerminationFlag(Thread thread) {
        return nativeThreads.get(thread);
    }

    public static TypeMapper getTypeMapper(Class<?> cls) {
        return (TypeMapper) getLibraryOptions(cls).get(Library.OPTION_TYPE_MAPPER);
    }

    public static String getWebStartLibraryPath(String str) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            String str2 = (String) ((Method) AccessController.doPrivileged(new PrivilegedAction<Method>() { // from class: com.sun.jna.Native.4
                @Override // java.security.PrivilegedAction
                public Method run() {
                    try {
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            })).invoke(Native.class.getClassLoader(), str);
            if (str2 != null) {
                return new File(str2).getParent();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static native String getWideString(Pointer pointer, long j2, long j3);

    public static native long getWindowHandle0(Component component);

    public static long getWindowID(Window window) {
        return AWT.getWindowID(window);
    }

    public static Pointer getWindowPointer(Window window) {
        return new Pointer(AWT.getWindowID(window));
    }

    public static native long indexOf(Pointer pointer, long j2, long j3, byte b2);

    private static native void initIDs();

    public static native int initialize_ffi_type(long j2);

    public static native double invokeDouble(Function function, long j2, int i, Object[] objArr);

    public static native float invokeFloat(Function function, long j2, int i, Object[] objArr);

    public static native int invokeInt(Function function, long j2, int i, Object[] objArr);

    public static native long invokeLong(Function function, long j2, int i, Object[] objArr);

    public static native Object invokeObject(Function function, long j2, int i, Object[] objArr);

    public static native long invokePointer(Function function, long j2, int i, Object[] objArr);

    public static Structure invokeStructure(Function function, long j2, int i, Object[] objArr, Structure structure) {
        invokeStructure(function, j2, i, objArr, structure.getPointer().peer, structure.getTypeInfo().peer);
        return structure;
    }

    private static native void invokeStructure(Function function, long j2, int i, Object[] objArr, long j3, long j4);

    public static native void invokeVoid(Function function, long j2, int i, Object[] objArr);

    public static boolean isCompatibleVersion(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length < 3 || split2.length < 3) {
            return false;
        }
        return Integer.parseInt(split[0]) == Integer.parseInt(split2[0]) && Integer.parseInt(split[1]) <= Integer.parseInt(split2[1]);
    }

    public static native synchronized boolean isProtected();

    public static boolean isSupportedNativeType(Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            return true;
        }
        try {
            return getNativeSize(cls) != 0;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean isUnpacked(File file) {
        return file.getName().startsWith(JNA_TMPLIB_PREFIX);
    }

    public static <T extends Library> T load(Class<T> cls) {
        return (T) load((String) null, cls);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls) {
        return (T) loadLibrary((String) null, cls);
    }

    private static void loadLibraryInstance(Class<?> cls) {
        if (cls == null || libraries.containsKey(cls)) {
            return;
        }
        try {
            for (Field field : cls.getFields()) {
                if (field.getType() == cls && Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    libraries.put(cls, new WeakReference(field.get(null)));
                    return;
                }
            }
        } catch (Exception e2) {
            throw new IllegalArgumentException("Could not access instance of " + cls + " (" + e2 + ")");
        }
    }

    private static void loadNativeDispatchLibrary() {
        if (!Boolean.getBoolean("jna.nounpack")) {
            try {
                removeTemporaryFiles();
            } catch (IOException e2) {
                LOG.log(Level.WARNING, "JNA Warning: IOException removing temporary files", (Throwable) e2);
            }
        }
        String property = System.getProperty("jna.boot.library.name", "jnidispatch");
        String property2 = System.getProperty("jna.boot.library.path");
        if (property2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property2, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                File file = new File(new File(stringTokenizer.nextToken()), System.mapLibraryName(property).replace(".dylib", ".jnilib"));
                String absolutePath = file.getAbsolutePath();
                Logger logger = LOG;
                Level level = DEBUG_JNA_LOAD_LEVEL;
                logger.log(level, "Looking in {0}", absolutePath);
                if (file.exists()) {
                    try {
                        logger.log(level, "Trying {0}", absolutePath);
                        System.setProperty("jnidispatch.path", absolutePath);
                        System.load(absolutePath);
                        jnidispatchPath = absolutePath;
                        logger.log(level, "Found jnidispatch at {0}", absolutePath);
                        return;
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                if (Platform.isMac()) {
                    String str = "dylib";
                    String str2 = "jnilib";
                    if (!absolutePath.endsWith("dylib")) {
                        str2 = "dylib";
                        str = "jnilib";
                    }
                    String str3 = absolutePath.substring(0, absolutePath.lastIndexOf(str)) + str2;
                    Logger logger2 = LOG;
                    Level level2 = DEBUG_JNA_LOAD_LEVEL;
                    logger2.log(level2, "Looking in {0}", str3);
                    if (new File(str3).exists()) {
                        try {
                            logger2.log(level2, "Trying {0}", str3);
                            System.setProperty("jnidispatch.path", str3);
                            System.load(str3);
                            jnidispatchPath = str3;
                            logger2.log(level2, "Found jnidispatch at {0}", str3);
                            return;
                        } catch (UnsatisfiedLinkError e3) {
                            Logger logger3 = LOG;
                            Level level3 = Level.WARNING;
                            StringBuilder m163q = AbstractC0062j.m163q("File found at ", str3, " but not loadable: ");
                            m163q.append(e3.getMessage());
                            logger3.log(level3, m163q.toString(), (Throwable) e3);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!Boolean.parseBoolean(System.getProperty("jna.nosys", "true")) || Platform.isAndroid()) {
            try {
                Logger logger4 = LOG;
                Level level4 = DEBUG_JNA_LOAD_LEVEL;
                logger4.log(level4, "Trying (via loadLibrary) {0}", property);
                System.loadLibrary(property);
                logger4.log(level4, "Found jnidispatch on system path");
                return;
            } catch (UnsatisfiedLinkError unused2) {
            }
        }
        if (Boolean.getBoolean("jna.noclasspath")) {
            throw new UnsatisfiedLinkError("Unable to locate JNA native support library");
        }
        loadNativeDispatchLibraryFromClasspath();
    }

    private static void loadNativeDispatchLibraryFromClasspath() {
        try {
            String replace = System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib");
            if (Platform.isAIX()) {
                replace = "libjnidispatch.a";
            }
            File extractFromResourcePath = extractFromResourcePath("/com/sun/jna/" + Platform.RESOURCE_PREFIX + "/" + replace, Native.class.getClassLoader());
            if (extractFromResourcePath == null && extractFromResourcePath == null) {
                throw new UnsatisfiedLinkError("Could not find JNA native support");
            }
            Logger logger = LOG;
            Level level = DEBUG_JNA_LOAD_LEVEL;
            logger.log(level, "Trying {0}", extractFromResourcePath.getAbsolutePath());
            System.setProperty("jnidispatch.path", extractFromResourcePath.getAbsolutePath());
            System.load(extractFromResourcePath.getAbsolutePath());
            String absolutePath = extractFromResourcePath.getAbsolutePath();
            jnidispatchPath = absolutePath;
            logger.log(level, "Found jnidispatch at {0}", absolutePath);
            if (!isUnpacked(extractFromResourcePath) || Boolean.getBoolean("jnidispatch.preserve")) {
                return;
            }
            deleteLibrary(extractFromResourcePath);
        } catch (IOException e2) {
            throw new UnsatisfiedLinkError(e2.getMessage());
        }
    }

    private static Object lookupField(Class<?> cls, String str, Class<?> cls2) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (Exception e2) {
            throw new IllegalArgumentException(str + " must be a public field of type " + cls2.getName() + " (" + e2 + "): " + cls);
        }
    }

    public static void main(String[] strArr) {
        Package r3 = Native.class.getPackage();
        String specificationTitle = r3 != null ? r3.getSpecificationTitle() : "Java Native Access (JNA)";
        String str = specificationTitle != null ? specificationTitle : "Java Native Access (JNA)";
        String str2 = Version.VERSION;
        String specificationVersion = r3 != null ? r3.getSpecificationVersion() : Version.VERSION;
        if (specificationVersion != null) {
            str2 = specificationVersion;
        }
        String m169w = AbstractC0062j.m169w(str, " API Version ", str2);
        PrintStream printStream = System.out;
        printStream.println(m169w);
        String implementationVersion = r3 != null ? r3.getImplementationVersion() : "5.18.1 (package information missing)";
        printStream.println("Version: ".concat(implementationVersion != null ? implementationVersion : "5.18.1 (package information missing)"));
        printStream.println(" Native: " + getNativeVersion() + " (" + getAPIChecksum() + ")");
        StringBuilder sb = new StringBuilder(" Prefix: ");
        sb.append(Platform.RESOURCE_PREFIX);
        printStream.println(sb.toString());
    }

    public static native long malloc(long j2);

    public static void markTemporaryFile(File file) {
        try {
            new File(file.getParentFile(), file.getName() + ".x").createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private static Class<?> nativeType(Class<?> cls) {
        return NativeMappedConverter.getInstance(cls).nativeType();
    }

    public static long open(String str) {
        return open(str, -1);
    }

    public static native long open(String str, int i);

    public static native void read(Pointer pointer, long j2, long j3, byte[] bArr, int i, int i2);

    public static native void read(Pointer pointer, long j2, long j3, char[] cArr, int i, int i2);

    public static native void read(Pointer pointer, long j2, long j3, double[] dArr, int i, int i2);

    public static native void read(Pointer pointer, long j2, long j3, float[] fArr, int i, int i2);

    public static native void read(Pointer pointer, long j2, long j3, int[] iArr, int i, int i2);

    public static native void read(Pointer pointer, long j2, long j3, long[] jArr, int i, int i2);

    public static native void read(Pointer pointer, long j2, long j3, short[] sArr, int i, int i2);

    public static void register(String str) {
        register(findDirectMappedClass(getCallingClass()), str);
    }

    private static native long registerMethod(Class<?> cls, String str, String str2, int[] iArr, long[] jArr, long[] jArr2, int i, long j2, long j3, Method method, long j4, int i2, boolean z2, ToNativeConverter[] toNativeConverterArr, FromNativeConverter fromNativeConverter, String str3);

    public static boolean registered(Class<?> cls) {
        boolean containsKey;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            containsKey = map.containsKey(cls);
        }
        return containsKey;
    }

    public static void removeTemporaryFiles() {
        File[] listFiles = getTempDir().listFiles(new FilenameFilter() { // from class: com.sun.jna.Native.5
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(".x") && str.startsWith(Native.JNA_TMPLIB_PREFIX);
            }
        });
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            File file = listFiles[i];
            File file2 = new File(file.getParentFile(), file.getName().substring(0, r4.length() - 2));
            if (!file2.exists() || file2.delete()) {
                file.delete();
            }
        }
    }

    public static String replace(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int indexOf = str3.indexOf(str);
            if (indexOf == -1) {
                sb.append(str3);
                return sb.toString();
            }
            sb.append(str3.substring(0, indexOf));
            sb.append(str2);
            str3 = str3.substring(str.length() + indexOf);
        }
    }

    public static native void setByte(Pointer pointer, long j2, long j3, byte b2);

    public static void setCallbackExceptionHandler(Callback.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = DEFAULT_HANDLER;
        }
        callbackExceptionHandler = uncaughtExceptionHandler;
    }

    public static void setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        CallbackReference.setCallbackThreadInitializer(callback, callbackThreadInitializer);
    }

    public static native void setChar(Pointer pointer, long j2, long j3, char c2);

    private static native void setDetachState(boolean z2, long j2);

    public static native void setDouble(Pointer pointer, long j2, long j3, double d);

    public static native void setFloat(Pointer pointer, long j2, long j3, float f2);

    public static native void setInt(Pointer pointer, long j2, long j3, int i);

    public static native void setLastError(int i);

    public static native void setLong(Pointer pointer, long j2, long j3, long j4);

    public static native void setMemory(Pointer pointer, long j2, long j3, long j4, byte b2);

    public static native void setPointer(Pointer pointer, long j2, long j3, long j4);

    public static native synchronized void setProtected(boolean z2);

    public static native void setShort(Pointer pointer, long j2, long j3, short s2);

    public static native void setWideString(Pointer pointer, long j2, long j3, String str);

    private static native int sizeof(int i);

    public static Library synchronizedLibrary(final Library library) {
        Class<?> cls = library.getClass();
        if (!Proxy.isProxyClass(cls)) {
            throw new IllegalArgumentException("Library must be a proxy class");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (invocationHandler instanceof Library.Handler) {
            final Library.Handler handler = (Library.Handler) invocationHandler;
            return (Library) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: com.sun.jna.Native.3
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    Object invoke;
                    synchronized (Library.Handler.this.getNativeLibrary()) {
                        invoke = Library.Handler.this.invoke(library, method, objArr);
                    }
                    return invoke;
                }
            });
        }
        throw new IllegalArgumentException("Unrecognized proxy handler: " + invocationHandler);
    }

    public static byte[] toByteArray(String str) {
        return toByteArray(str, getDefaultStringEncoding());
    }

    public static char[] toCharArray(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length + 1];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        return cArr;
    }

    private static Object toNative(ToNativeConverter toNativeConverter, Object obj) {
        return toNativeConverter.toNative(obj, new ToNativeContext());
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, getDefaultStringEncoding());
    }

    public static List<String> toStringList(char[] cArr) {
        return toStringList(cArr, 0, cArr.length);
    }

    public static void unregister() {
        unregister(findDirectMappedClass(getCallingClass()));
    }

    private static native void unregister(Class<?> cls, long[] jArr);

    private static void unregisterAll() {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                for (Map.Entry<Class<?>, long[]> entry : map.entrySet()) {
                    unregister(entry.getKey(), entry.getValue());
                }
                registeredClasses.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static native void write(Pointer pointer, long j2, long j3, byte[] bArr, int i, int i2);

    public static native void write(Pointer pointer, long j2, long j3, char[] cArr, int i, int i2);

    public static native void write(Pointer pointer, long j2, long j3, double[] dArr, int i, int i2);

    public static native void write(Pointer pointer, long j2, long j3, float[] fArr, int i, int i2);

    public static native void write(Pointer pointer, long j2, long j3, int[] iArr, int i, int i2);

    public static native void write(Pointer pointer, long j2, long j3, long[] jArr, int i, int i2);

    public static native void write(Pointer pointer, long j2, long j3, short[] sArr, int i, int i2);

    public static File extractFromResourcePath(String str, ClassLoader classLoader) {
        String str2;
        File file;
        File createTempFile;
        FileOutputStream fileOutputStream;
        Level level = (DEBUG_LOAD || (DEBUG_JNA_LOAD && str.contains("jnidispatch"))) ? Level.INFO : Level.FINE;
        if (classLoader == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = Native.class.getClassLoader();
        }
        Logger logger = LOG;
        logger.log(level, "Looking in classpath from {0} for {1}", new Object[]{classLoader, str});
        String mapSharedLibraryName = str.startsWith("/") ? str : NativeLibrary.mapSharedLibraryName(str);
        if (str.startsWith("/")) {
            str2 = str;
        } else {
            str2 = Platform.RESOURCE_PREFIX + "/" + mapSharedLibraryName;
        }
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        URL resource = classLoader.getResource(str2);
        if (resource == null) {
            String str3 = Platform.RESOURCE_PREFIX;
            if (str2.startsWith(str3)) {
                if (str3.startsWith("darwin")) {
                    resource = classLoader.getResource("darwin/" + str2.substring(str3.length() + 1));
                }
                if (resource == null) {
                    resource = classLoader.getResource(mapSharedLibraryName);
                }
            } else {
                if (str2.startsWith("com/sun/jna/" + str3 + "/")) {
                    if (str3.startsWith("com/sun/jna/darwin")) {
                        StringBuilder sb = new StringBuilder("com/sun/jna/darwin");
                        sb.append(str2.substring(("com/sun/jna/" + str3).length() + 1));
                        resource = classLoader.getResource(sb.toString());
                    }
                    if (resource == null) {
                        resource = classLoader.getResource(mapSharedLibraryName);
                    }
                }
            }
        }
        if (resource == null) {
            String property = System.getProperty("java.class.path");
            if (classLoader instanceof URLClassLoader) {
                property = Arrays.asList(((URLClassLoader) classLoader).getURLs()).toString();
            }
            throw new IOException("Native library (" + str2 + ") not found in resource path (" + property + ")");
        }
        logger.log(level, "Found library resource at {0}", resource);
        if (resource.getProtocol().toLowerCase().equals("file")) {
            try {
                file = new File(new URI(resource.toString()));
            } catch (URISyntaxException unused) {
                file = new File(resource.getPath());
            }
            LOG.log(level, "Looking in {0}", file.getAbsolutePath());
            if (file.exists()) {
                return file;
            }
            throw new IOException("File URL " + resource + " could not be properly decoded");
        }
        FileOutputStream fileOutputStream2 = null;
        if (Boolean.getBoolean("jna.nounpack")) {
            return null;
        }
        InputStream openStream = resource.openStream();
        try {
            if (openStream == null) {
                throw new IOException(AbstractC1561o.m4299c("Can't obtain InputStream for ", str2));
            }
            try {
                createTempFile = File.createTempFile(JNA_TMPLIB_PREFIX, Platform.isWindows() ? ".dll" : null, getTempDir());
                if (!Boolean.getBoolean("jnidispatch.preserve")) {
                    createTempFile.deleteOnExit();
                }
                logger.log(level, "Extracting library to {0}", createTempFile.getAbsolutePath());
                fileOutputStream = new FileOutputStream(createTempFile);
            } catch (IOException e2) {
                e = e2;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openStream.read(bArr, 0, 1024);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
                openStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                return createTempFile;
            } catch (IOException e3) {
                e = e3;
                throw new IOException("Failed to create temporary file for " + str + " library: " + e.getMessage());
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                try {
                    openStream.close();
                } catch (IOException unused4) {
                }
                if (fileOutputStream2 == null) {
                    throw th;
                }
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (IOException unused5) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static NativeMapped fromNative(Method method, Object obj) {
        Class<?> returnType = method.getReturnType();
        return (NativeMapped) NativeMappedConverter.getInstance(returnType).fromNative(obj, new MethodResultContext(returnType, null, null, method));
    }

    public static byte[] getBytes(String str, String str2) {
        return getBytes(str, getCharset(str2));
    }

    public static String getString(Pointer pointer, long j2, String str) {
        byte[] stringBytes = getStringBytes(pointer, pointer.peer, j2);
        if (str != null) {
            try {
                return new String(stringBytes, str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(stringBytes);
    }

    public static <T extends Library> T load(Class<T> cls, Map<String, ?> map) {
        return (T) load(null, cls, map);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls, Map<String, ?> map) {
        return (T) loadLibrary(null, cls, map);
    }

    public static void register(NativeLibrary nativeLibrary) {
        register(findDirectMappedClass(getCallingClass()), nativeLibrary);
    }

    public static byte[] toByteArray(String str, String str2) {
        return toByteArray(str, getCharset(str2));
    }

    public static String toString(byte[] bArr, String str) {
        return toString(bArr, getCharset(str));
    }

    public static List<String> toStringList(char[] cArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            if (cArr[i] == 0) {
                if (i4 == i) {
                    return arrayList;
                }
                arrayList.add(new String(cArr, i4, i - i4));
                i4 = i + 1;
            }
            i++;
        }
        if (i4 < i3) {
            arrayList.add(new String(cArr, i4, i3 - i4));
        }
        return arrayList;
    }

    public static void unregister(Class<?> cls) {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                long[] jArr = map.get(cls);
                if (jArr != null) {
                    unregister(cls, jArr);
                    map.remove(cls);
                    registeredLibraries.remove(cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] getBytes(String str, Charset charset) {
        return str.getBytes(charset);
    }

    public static <T extends Library> T load(String str, Class<T> cls) {
        return (T) load(str, cls, Collections.emptyMap());
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls) {
        return (T) loadLibrary(str, cls, Collections.emptyMap());
    }

    public static void register(Class<?> cls, String str) {
        register(cls, NativeLibrary.getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, cls.getClassLoader())));
    }

    public static byte[] toByteArray(String str, Charset charset) {
        byte[] bytes = getBytes(str, charset);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public static String toString(byte[] bArr, Charset charset) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (bArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        if (length == 0) {
            return "";
        }
        return new String(bArr, 0, length, charset);
    }

    private static Object fromNative(FromNativeConverter fromNativeConverter, Object obj, Method method) {
        return fromNativeConverter.fromNative(obj, new MethodResultContext(method.getReturnType(), null, null, method));
    }

    public static <T extends Library> T load(String str, Class<T> cls, Map<String, ?> map) {
        if (Library.class.isAssignableFrom(cls)) {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, newProxyInstance);
            return cls.cast(newProxyInstance);
        }
        throw new IllegalArgumentException("Interface (" + cls.getSimpleName() + ") of library=" + str + " does not extend Library");
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls, Map<String, ?> map) {
        if (Library.class.isAssignableFrom(cls)) {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, newProxyInstance);
            return cls.cast(newProxyInstance);
        }
        throw new IllegalArgumentException("Interface (" + cls.getSimpleName() + ") of library=" + str + " does not extend Library");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void register(Class<?> cls, NativeLibrary nativeLibrary) {
        ToNativeConverter[] toNativeConverterArr;
        long j2;
        FromNativeConverter fromNativeConverter;
        long j3;
        long j4;
        int i;
        String sb;
        Class<?>[] exceptionTypes;
        int i2;
        boolean z2;
        Method method;
        String str;
        Class<?> cls2;
        long j5;
        Class<?> cls3 = cls;
        NativeLibrary nativeLibrary2 = nativeLibrary;
        Method[] declaredMethods = cls.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        Map<String, ?> options = nativeLibrary.getOptions();
        TypeMapper typeMapper = (TypeMapper) options.get(Library.OPTION_TYPE_MAPPER);
        boolean equals = Boolean.TRUE.equals(options.get(Library.OPTION_ALLOW_OBJECTS));
        cacheOptions(cls3, options, null);
        for (Method method2 : declaredMethods) {
            if ((method2.getModifiers() & Function.MAX_NARGS) != 0) {
                arrayList.add(method2);
            }
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        int i3 = 0;
        while (i3 < size) {
            Method method3 = (Method) arrayList.get(i3);
            Class<?> returnType = method3.getReturnType();
            Class<?>[] parameterTypes = method3.getParameterTypes();
            long[] jArr2 = new long[parameterTypes.length];
            long[] jArr3 = new long[parameterTypes.length];
            int[] iArr = new int[parameterTypes.length];
            ToNativeConverter[] toNativeConverterArr2 = new ToNativeConverter[parameterTypes.length];
            long[] jArr4 = jArr;
            int conversion = getConversion(returnType, typeMapper, equals);
            if (conversion != -1) {
                int i4 = i3;
                try {
                    try {
                        if (conversion != 3) {
                            if (conversion != 4) {
                                switch (conversion) {
                                    default:
                                        switch (conversion) {
                                            case CVT_INTEGER_TYPE /* 21 */:
                                            case CVT_POINTER_TYPE /* 22 */:
                                                break;
                                            case CVT_TYPE_MAPPER /* 23 */:
                                            case CVT_TYPE_MAPPER_STRING /* 24 */:
                                            case CVT_TYPE_MAPPER_WSTRING /* 25 */:
                                                toNativeConverterArr = toNativeConverterArr2;
                                                FromNativeConverter fromNativeConverter2 = typeMapper.getFromNativeConverter(returnType);
                                                fromNativeConverter = fromNativeConverter2;
                                                j4 = Structure.FFIType.get(returnType.isPrimitive() ? returnType : Pointer.class).getPointer().peer;
                                                j3 = Structure.FFIType.get(fromNativeConverter2.nativeType()).getPointer().peer;
                                                break;
                                            case CVT_OBJECT /* 26 */:
                                                break;
                                            default:
                                                toNativeConverterArr = toNativeConverterArr2;
                                                j2 = Structure.FFIType.get(returnType).getPointer().peer;
                                                j4 = j2;
                                                j3 = j4;
                                                fromNativeConverter = null;
                                                break;
                                        }
                                    case CVT_NATIVE_MAPPED /* 17 */:
                                    case CVT_NATIVE_MAPPED_STRING /* 18 */:
                                    case CVT_NATIVE_MAPPED_WSTRING /* 19 */:
                                        toNativeConverterArr = toNativeConverterArr2;
                                        j4 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                        j5 = Structure.FFIType.get(NativeMappedConverter.getInstance(returnType).nativeType()).getPointer().peer;
                                        break;
                                }
                                String str2 = "(";
                                i = 0;
                                while (i < parameterTypes.length) {
                                    Class<?> cls4 = parameterTypes[i];
                                    StringBuilder m2942a = AbstractC1241e.m2942a(str2);
                                    Class<?>[] clsArr = parameterTypes;
                                    m2942a.append(getSignature(cls4));
                                    String sb2 = m2942a.toString();
                                    int conversion2 = getConversion(cls4, typeMapper, equals);
                                    iArr[i] = conversion2;
                                    if (conversion2 == -1) {
                                        throw new IllegalArgumentException(cls4 + " is not a supported argument type (in method " + method3.getName() + " in " + cls3 + ")");
                                    }
                                    if (conversion2 == CVT_NATIVE_MAPPED || conversion2 == CVT_NATIVE_MAPPED_STRING || conversion2 == CVT_NATIVE_MAPPED_WSTRING || conversion2 == CVT_INTEGER_TYPE) {
                                        cls4 = NativeMappedConverter.getInstance(cls4).nativeType();
                                    } else if (conversion2 == CVT_TYPE_MAPPER || conversion2 == CVT_TYPE_MAPPER_STRING || conversion2 == CVT_TYPE_MAPPER_WSTRING) {
                                        toNativeConverterArr[i] = typeMapper.getToNativeConverter(cls4);
                                    }
                                    if (conversion2 != 0) {
                                        if (conversion2 != 4) {
                                            switch (conversion2) {
                                                default:
                                                    switch (conversion2) {
                                                        case CVT_INTEGER_TYPE /* 21 */:
                                                        case CVT_POINTER_TYPE /* 22 */:
                                                            break;
                                                        case CVT_TYPE_MAPPER /* 23 */:
                                                        case CVT_TYPE_MAPPER_STRING /* 24 */:
                                                        case CVT_TYPE_MAPPER_WSTRING /* 25 */:
                                                            cls2 = returnType;
                                                            if (!cls4.isPrimitive()) {
                                                                cls4 = Pointer.class;
                                                            }
                                                            jArr3[i] = Structure.FFIType.get(cls4).getPointer().peer;
                                                            jArr2[i] = Structure.FFIType.get(toNativeConverterArr[i].nativeType()).getPointer().peer;
                                                            break;
                                                        default:
                                                            cls2 = returnType;
                                                            long j6 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                                            jArr2[i] = j6;
                                                            jArr3[i] = j6;
                                                            break;
                                                    }
                                                case CVT_NATIVE_MAPPED /* 17 */:
                                                case CVT_NATIVE_MAPPED_STRING /* 18 */:
                                                case CVT_NATIVE_MAPPED_WSTRING /* 19 */:
                                                    cls2 = returnType;
                                                    jArr2[i] = Structure.FFIType.get(cls4).getPointer().peer;
                                                    jArr3[i] = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                                    break;
                                            }
                                        }
                                        cls2 = returnType;
                                        jArr2[i] = Structure.FFIType.get(cls4).getPointer().peer;
                                        jArr3[i] = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                    } else {
                                        cls2 = returnType;
                                        long j7 = Structure.FFIType.get(cls4).getPointer().peer;
                                        jArr2[i] = j7;
                                        jArr3[i] = j7;
                                    }
                                    i++;
                                    parameterTypes = clsArr;
                                    returnType = cls2;
                                    str2 = sb2;
                                }
                                StringBuilder m2942a2 = AbstractC1241e.m2942a(AbstractC0062j.m160n(str2, ")"));
                                m2942a2.append(getSignature(returnType));
                                sb = m2942a2.toString();
                                exceptionTypes = method3.getExceptionTypes();
                                i2 = 0;
                                while (true) {
                                    if (i2 >= exceptionTypes.length) {
                                        z2 = false;
                                    } else if (LastErrorException.class.isAssignableFrom(exceptionTypes[i2])) {
                                        z2 = true;
                                    } else {
                                        i2++;
                                    }
                                }
                                Function function = nativeLibrary2.getFunction(method3.getName(), method3);
                                ArrayList arrayList2 = arrayList;
                                TypeMapper typeMapper2 = typeMapper;
                                method = method3;
                                long j8 = j4;
                                str = sb;
                                int i5 = size;
                                boolean z3 = equals;
                                jArr4[i4] = registerMethod(cls, method3.getName(), sb, iArr, jArr3, jArr2, conversion, j8, j3, method, function.peer, function.getCallingConvention(), z2, toNativeConverterArr, fromNativeConverter, function.encoding);
                                i3 = i4 + 1;
                                nativeLibrary2 = nativeLibrary;
                                jArr = jArr4;
                                size = i5;
                                equals = z3;
                                arrayList = arrayList2;
                                typeMapper = typeMapper2;
                                cls3 = cls;
                            } else {
                                toNativeConverterArr = toNativeConverterArr2;
                                j4 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                j5 = Structure.FFIType.get(returnType).getPointer().peer;
                            }
                            j3 = j5;
                            fromNativeConverter = null;
                            String str22 = "(";
                            i = 0;
                            while (i < parameterTypes.length) {
                            }
                            StringBuilder m2942a22 = AbstractC1241e.m2942a(AbstractC0062j.m160n(str22, ")"));
                            m2942a22.append(getSignature(returnType));
                            sb = m2942a22.toString();
                            exceptionTypes = method3.getExceptionTypes();
                            i2 = 0;
                            while (true) {
                                if (i2 >= exceptionTypes.length) {
                                }
                                i2++;
                            }
                            Function function2 = nativeLibrary2.getFunction(method3.getName(), method3);
                            ArrayList arrayList22 = arrayList;
                            TypeMapper typeMapper22 = typeMapper;
                            method = method3;
                            long j82 = j4;
                            str = sb;
                            int i52 = size;
                            boolean z32 = equals;
                            jArr4[i4] = registerMethod(cls, method3.getName(), sb, iArr, jArr3, jArr2, conversion, j82, j3, method, function2.peer, function2.getCallingConvention(), z2, toNativeConverterArr, fromNativeConverter, function2.encoding);
                            i3 = i4 + 1;
                            nativeLibrary2 = nativeLibrary;
                            jArr = jArr4;
                            size = i52;
                            equals = z32;
                            arrayList = arrayList22;
                            typeMapper = typeMapper22;
                            cls3 = cls;
                        }
                        jArr4[i4] = registerMethod(cls, method3.getName(), sb, iArr, jArr3, jArr2, conversion, j82, j3, method, function2.peer, function2.getCallingConvention(), z2, toNativeConverterArr, fromNativeConverter, function2.encoding);
                        i3 = i4 + 1;
                        nativeLibrary2 = nativeLibrary;
                        jArr = jArr4;
                        size = i52;
                        equals = z32;
                        arrayList = arrayList22;
                        typeMapper = typeMapper22;
                        cls3 = cls;
                    } catch (NoSuchMethodError unused) {
                        throw new UnsatisfiedLinkError("No method " + method.getName() + " with signature " + str + " in " + cls);
                    }
                    ArrayList arrayList222 = arrayList;
                    TypeMapper typeMapper222 = typeMapper;
                    method = method3;
                    long j822 = j4;
                    str = sb;
                    int i522 = size;
                    boolean z322 = equals;
                } catch (NoSuchMethodError unused2) {
                    method = method3;
                    str = sb;
                }
                toNativeConverterArr = toNativeConverterArr2;
                j2 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                j4 = j2;
                j3 = j4;
                fromNativeConverter = null;
                String str222 = "(";
                i = 0;
                while (i < parameterTypes.length) {
                }
                StringBuilder m2942a222 = AbstractC1241e.m2942a(AbstractC0062j.m160n(str222, ")"));
                m2942a222.append(getSignature(returnType));
                sb = m2942a222.toString();
                exceptionTypes = method3.getExceptionTypes();
                i2 = 0;
                while (true) {
                    if (i2 >= exceptionTypes.length) {
                    }
                    i2++;
                }
                Function function22 = nativeLibrary2.getFunction(method3.getName(), method3);
            } else {
                throw new IllegalArgumentException(returnType + " is not a supported return type (in method " + method3.getName() + " in " + cls3 + ")");
            }
        }
        Class<?> cls5 = cls3;
        long[] jArr5 = jArr;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            map.put(cls5, jArr5);
            registeredLibraries.put(cls5, nativeLibrary);
        }
    }

    public static String toString(char[] cArr) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        if (length == 0) {
            return "";
        }
        return new String(cArr, 0, length);
    }

    public static NativeLibrary getNativeLibrary(Class<?> cls) {
        NativeLibrary nativeLibrary;
        if (cls != null) {
            Class<?> findDirectMappedClass = findDirectMappedClass(cls);
            synchronized (registeredClasses) {
                try {
                    nativeLibrary = registeredLibraries.get(findDirectMappedClass);
                    if (nativeLibrary == null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " is not currently registered");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return nativeLibrary;
        }
        throw new IllegalArgumentException("null passed to getNativeLibrary");
    }

    public static int getNativeSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return 1;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return 2;
        }
        if (cls != Character.TYPE && cls != Character.class) {
            if (cls == Integer.TYPE || cls == Integer.class) {
                return 4;
            }
            if (cls == Long.TYPE || cls == Long.class) {
                return 8;
            }
            if (cls == Float.TYPE || cls == Float.class) {
                return 4;
            }
            if (cls == Double.TYPE || cls == Double.class) {
                return 8;
            }
            if (Structure.class.isAssignableFrom(cls)) {
                if (Structure.ByValue.class.isAssignableFrom(cls)) {
                    return Structure.size(cls);
                }
                return POINTER_SIZE;
            }
            if (!Pointer.class.isAssignableFrom(cls) && ((!Platform.HAS_BUFFERS || !Buffers.isBuffer(cls)) && !Callback.class.isAssignableFrom(cls) && String.class != cls && WString.class != cls)) {
                throw new IllegalArgumentException("Native size for type \"" + cls.getName() + "\" is unknown");
            }
            return POINTER_SIZE;
        }
        return WCHAR_SIZE;
    }
}
