package com.sun.jna;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006C.AbstractC0062j;
import p097q.AbstractC1241e;
import p109u0.AbstractC1561o;

/* loaded from: classes.dex */
public abstract class Structure {
    public static final int ALIGN_DEFAULT = 0;
    public static final int ALIGN_GNUC = 2;
    public static final int ALIGN_MSVC = 3;
    public static final int ALIGN_NONE = 1;
    protected static final int CALCULATE_SIZE = -1;
    private int actualAlignType;
    private int alignType;
    private Structure[] array;
    private boolean autoRead;
    private boolean autoWrite;
    private String encoding;
    private Pointer memory;
    private final Map<String, NativeStringTracking> nativeStrings;
    private boolean readCalled;
    private int size;
    private int structAlignment;
    private Map<String, StructField> structFields;
    private long typeInfo;
    private TypeMapper typeMapper;
    private static final Logger LOG = Logger.getLogger(Structure.class.getName());
    static final ReentrantReadWriteLock cacheStructureLock = new ReentrantReadWriteLock();
    static final Map<Class<?>, LayoutInfo> layoutInfo = new WeakHashMap();
    static final Map<Class<?>, List<String>> fieldOrder = new WeakHashMap();
    static final Map<Class<?>, List<Field>> fieldList = new WeakHashMap();
    static final Map<Class<?>, Boolean> validationMap = new WeakHashMap();
    private static final ThreadLocal<Map<Pointer, Structure>> reads = new ThreadLocal<Map<Pointer, Structure>>() { // from class: com.sun.jna.Structure.1
        @Override // java.lang.ThreadLocal
        public synchronized Map<Pointer, Structure> initialValue() {
            return new HashMap();
        }
    };
    private static final ThreadLocal<Set<Structure>> busy = new ThreadLocal<Set<Structure>>() { // from class: com.sun.jna.Structure.2
        @Override // java.lang.ThreadLocal
        public synchronized Set<Structure> initialValue() {
            return new StructureSet();
        }
    };
    private static final Pointer PLACEHOLDER_MEMORY = new Pointer(0) { // from class: com.sun.jna.Structure.3
        @Override // com.sun.jna.Pointer
        public Pointer share(long j2, long j3) {
            return this;
        }
    };

    public static class AutoAllocated extends Memory {
        public AutoAllocated(int i) {
            super(i);
            super.clear();
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return "auto-" + super.toString();
        }
    }

    public interface ByReference {
    }

    public interface ByValue {
    }

    @FieldOrder({"size", "alignment", "type", "elements"})
    public static class FFIType extends Structure {
        private static final int FFI_TYPE_STRUCT = 13;
        private static final Map<Pointer, FFIType> ffiTypeInfo;
        private static final Map<Class, Map<Integer, FFIType>> typeInfoMap = new WeakHashMap();
        private static final Map<Class, FFIType> unionHelper = new WeakHashMap();
        public short alignment;
        public Pointer elements;
        public size_t size;
        public short type;

        public static class FFITypes {
            private static Pointer ffi_type_double;
            private static Pointer ffi_type_float;
            private static Pointer ffi_type_longdouble;
            private static Pointer ffi_type_pointer;
            private static Pointer ffi_type_sint16;
            private static Pointer ffi_type_sint32;
            private static Pointer ffi_type_sint64;
            private static Pointer ffi_type_sint8;
            private static Pointer ffi_type_uint16;
            private static Pointer ffi_type_uint32;
            private static Pointer ffi_type_uint64;
            private static Pointer ffi_type_uint8;
            private static Pointer ffi_type_void;

            private FFITypes() {
            }
        }

        public static class size_t extends IntegerType {
            private static final long serialVersionUID = 1;

            public size_t() {
                this(0L);
            }

            public size_t(long j2) {
                super(Native.SIZE_T_SIZE, j2);
            }
        }

        static {
            HashMap hashMap = new HashMap();
            ffiTypeInfo = hashMap;
            if (Native.POINTER_SIZE == 0) {
                throw new Error("Native library not initialized");
            }
            if (FFITypes.ffi_type_void == null) {
                throw new Error("FFI types not initialized");
            }
            hashMap.put(FFITypes.ffi_type_void, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_void));
            hashMap.put(FFITypes.ffi_type_float, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_float));
            hashMap.put(FFITypes.ffi_type_double, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_double));
            hashMap.put(FFITypes.ffi_type_longdouble, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_longdouble));
            hashMap.put(FFITypes.ffi_type_uint8, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_uint8));
            hashMap.put(FFITypes.ffi_type_sint8, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_sint8));
            hashMap.put(FFITypes.ffi_type_uint16, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_uint16));
            hashMap.put(FFITypes.ffi_type_sint16, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_sint16));
            hashMap.put(FFITypes.ffi_type_uint32, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_uint32));
            hashMap.put(FFITypes.ffi_type_sint32, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_sint32));
            hashMap.put(FFITypes.ffi_type_uint64, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_uint64));
            hashMap.put(FFITypes.ffi_type_sint64, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_sint64));
            hashMap.put(FFITypes.ffi_type_pointer, (FFIType) Structure.newInstance(FFIType.class, FFITypes.ffi_type_pointer));
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((FFIType) it.next()).read();
            }
            Class cls = Void.TYPE;
            Map<Pointer, FFIType> map = ffiTypeInfo;
            storeTypeInfo(cls, map.get(FFITypes.ffi_type_void));
            storeTypeInfo(Void.class, map.get(FFITypes.ffi_type_void));
            storeTypeInfo(Float.TYPE, map.get(FFITypes.ffi_type_float));
            storeTypeInfo(Float.class, map.get(FFITypes.ffi_type_float));
            storeTypeInfo(Double.TYPE, map.get(FFITypes.ffi_type_double));
            storeTypeInfo(Double.class, map.get(FFITypes.ffi_type_double));
            storeTypeInfo(Long.TYPE, map.get(FFITypes.ffi_type_sint64));
            storeTypeInfo(Long.class, map.get(FFITypes.ffi_type_sint64));
            storeTypeInfo(Integer.TYPE, map.get(FFITypes.ffi_type_sint32));
            storeTypeInfo(Integer.class, map.get(FFITypes.ffi_type_sint32));
            storeTypeInfo(Short.TYPE, map.get(FFITypes.ffi_type_sint16));
            storeTypeInfo(Short.class, map.get(FFITypes.ffi_type_sint16));
            FFIType fFIType = map.get(Native.WCHAR_SIZE == 2 ? FFITypes.ffi_type_uint16 : FFITypes.ffi_type_uint32);
            storeTypeInfo(Character.TYPE, fFIType);
            storeTypeInfo(Character.class, fFIType);
            storeTypeInfo(Byte.TYPE, map.get(FFITypes.ffi_type_sint8));
            storeTypeInfo(Byte.class, map.get(FFITypes.ffi_type_sint8));
            storeTypeInfo(Pointer.class, map.get(FFITypes.ffi_type_pointer));
            storeTypeInfo(String.class, map.get(FFITypes.ffi_type_pointer));
            storeTypeInfo(WString.class, map.get(FFITypes.ffi_type_pointer));
            storeTypeInfo(Boolean.TYPE, map.get(FFITypes.ffi_type_uint32));
            storeTypeInfo(Boolean.class, map.get(FFITypes.ffi_type_uint32));
        }

        public FFIType(FFIType fFIType) {
            this.type = (short) 13;
            this.size = fFIType.size;
            this.alignment = fFIType.alignment;
            this.type = fFIType.type;
            this.elements = fFIType.elements;
        }

        public static FFIType get(Object obj) {
            return obj == null ? getTypeInfo(Pointer.class, 0) : obj instanceof Class ? get(null, (Class) obj) : get(obj, obj.getClass());
        }

        private static FFIType getTypeInfo(Class cls, int i) {
            ReentrantReadWriteLock reentrantReadWriteLock = Structure.cacheStructureLock;
            reentrantReadWriteLock.readLock().lock();
            try {
                Map<Integer, FFIType> map = typeInfoMap.get(cls);
                if (map == null) {
                    reentrantReadWriteLock.readLock().unlock();
                    return null;
                }
                FFIType fFIType = map.get(Integer.valueOf(i));
                reentrantReadWriteLock.readLock().unlock();
                return fFIType;
            } catch (Throwable th) {
                Structure.cacheStructureLock.readLock().unlock();
                throw th;
            }
        }

        private void init(Pointer[] pointerArr) {
            Memory memory = new Memory(Native.POINTER_SIZE * pointerArr.length);
            this.elements = memory;
            memory.write(0L, pointerArr, 0, pointerArr.length);
            write();
        }

        private static boolean isFloatType(FFIType fFIType) {
            Pointer pointer = fFIType.getPointer();
            return pointer.equals(FFITypes.ffi_type_float) || pointer.equals(FFITypes.ffi_type_double);
        }

        private static boolean isIntegerType(FFIType fFIType) {
            Pointer pointer = fFIType.getPointer();
            return pointer.equals(FFITypes.ffi_type_uint8) || pointer.equals(FFITypes.ffi_type_sint8) || pointer.equals(FFITypes.ffi_type_uint16) || pointer.equals(FFITypes.ffi_type_sint16) || pointer.equals(FFITypes.ffi_type_uint32) || pointer.equals(FFITypes.ffi_type_sint32) || pointer.equals(FFITypes.ffi_type_uint64) || pointer.equals(FFITypes.ffi_type_sint64) || pointer.equals(FFITypes.ffi_type_pointer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Map lambda$storeTypeInfo$0(Class cls) {
            return new HashMap();
        }

        private static void storeTypeInfo(Class cls, FFIType fFIType) {
            storeTypeInfo(cls, 0, fFIType);
        }

        private static void storeTypeInfo(Class cls, int i, FFIType fFIType) {
            ReentrantReadWriteLock reentrantReadWriteLock = Structure.cacheStructureLock;
            reentrantReadWriteLock.writeLock().lock();
            try {
                typeInfoMap.computeIfAbsent(cls, new C0723b()).put(Integer.valueOf(i), fFIType);
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                Structure.cacheStructureLock.writeLock().unlock();
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static FFIType get(Object obj, Class<?> cls) {
            ToNativeConverter toNativeConverter;
            TypeMapper typeMapper = Native.getTypeMapper(cls);
            if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
                cls = toNativeConverter.nativeType();
            }
            FFIType typeInfo = getTypeInfo(cls, cls.isArray() ? Array.getLength(obj) : 0);
            if (typeInfo != null) {
                return typeInfo;
            }
            ReentrantReadWriteLock reentrantReadWriteLock = Structure.cacheStructureLock;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (Platform.HAS_BUFFERS) {
                    if (!Buffer.class.isAssignableFrom(cls)) {
                    }
                    Map<Class, Map<Integer, FFIType>> map = typeInfoMap;
                    map.put(cls, map.get(Pointer.class));
                    FFIType fFIType = map.get(Pointer.class).get(0);
                    reentrantReadWriteLock.writeLock().unlock();
                    return fFIType;
                }
                if (!Callback.class.isAssignableFrom(cls)) {
                    if (Structure.class.isAssignableFrom(cls)) {
                        if (obj == null) {
                            obj = Structure.newInstance(cls, Structure.PLACEHOLDER_MEMORY);
                        }
                        if (ByReference.class.isAssignableFrom(cls)) {
                            Map<Class, Map<Integer, FFIType>> map2 = typeInfoMap;
                            map2.put(cls, map2.get(Pointer.class));
                            FFIType fFIType2 = map2.get(Pointer.class).get(0);
                            reentrantReadWriteLock.writeLock().unlock();
                            return fFIType2;
                        }
                        FFIType fFIType3 = new FFIType((Structure) obj);
                        storeTypeInfo(cls, fFIType3);
                        reentrantReadWriteLock.writeLock().unlock();
                        return fFIType3;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    if (NativeMapped.class.isAssignableFrom(cls)) {
                        NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                        return get(nativeMappedConverter.toNative(obj, new ToNativeContext()), nativeMappedConverter.nativeType());
                    }
                    if (cls.isArray()) {
                        FFIType fFIType4 = new FFIType(obj, cls);
                        storeTypeInfo(cls, Array.getLength(obj), fFIType4);
                        return fFIType4;
                    }
                    throw new IllegalArgumentException("Unsupported type " + cls);
                }
                Map<Class, Map<Integer, FFIType>> map3 = typeInfoMap;
                map3.put(cls, map3.get(Pointer.class));
                FFIType fFIType5 = map3.get(Pointer.class).get(0);
                reentrantReadWriteLock.writeLock().unlock();
                return fFIType5;
            } catch (Throwable th) {
                Structure.cacheStructureLock.writeLock().unlock();
                throw th;
            }
        }

        public FFIType() {
            this.type = (short) 13;
        }

        public FFIType(Structure structure) {
            Pointer[] pointerArr;
            int i;
            this.type = (short) 13;
            structure.ensureAllocated(true);
            int i2 = 0;
            if (structure instanceof Union) {
                int i3 = 0;
                boolean z2 = false;
                FFIType fFIType = null;
                for (StructField structField : structure.fields().values()) {
                    FFIType fieldTypeInfo = structure.getFieldTypeInfo(structField);
                    z2 = isIntegerType(fieldTypeInfo) ? true : z2;
                    if (fFIType == null || i3 < (i = structField.size) || (i3 == i && Structure.class.isAssignableFrom(structField.type))) {
                        i3 = structField.size;
                        fFIType = fieldTypeInfo;
                    }
                }
                if (((Platform.isIntel() && Platform.is64Bit() && !Platform.isWindows()) || Platform.isARM() || Platform.isLoongArch()) && z2 && isFloatType(fFIType)) {
                    FFIType fFIType2 = new FFIType(fFIType);
                    if (fFIType2.size.intValue() == 4) {
                        fFIType2.type = ffiTypeInfo.get(FFITypes.ffi_type_uint32).type;
                    } else if (fFIType2.size.intValue() == 8) {
                        fFIType2.type = ffiTypeInfo.get(FFITypes.ffi_type_uint64).type;
                    }
                    fFIType2.write();
                    fFIType = fFIType2;
                }
                pointerArr = new Pointer[]{fFIType.getPointer(), null};
                unionHelper.put(structure.getClass(), fFIType);
            } else {
                pointerArr = new Pointer[structure.fields().size() + 1];
                Iterator<StructField> it = structure.fields().values().iterator();
                while (it.hasNext()) {
                    pointerArr[i2] = structure.getFieldTypeInfo(it.next()).getPointer();
                    i2++;
                }
            }
            init(pointerArr);
            write();
        }

        public FFIType(Object obj, Class<?> cls) {
            this.type = (short) 13;
            int length = Array.getLength(obj);
            Pointer[] pointerArr = new Pointer[length + 1];
            Pointer pointer = get(null, cls.getComponentType()).getPointer();
            for (int i = 0; i < length; i++) {
                pointerArr[i] = pointer;
            }
            init(pointerArr);
            write();
        }
    }

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FieldOrder {
        String[] value();
    }

    public static class LayoutInfo {
        private int alignType;
        private int alignment;
        private final Map<String, StructField> fields;
        private int size;
        private TypeMapper typeMapper;
        private boolean variable;

        private LayoutInfo() {
            this.size = -1;
            this.alignment = 1;
            this.fields = Collections.synchronizedMap(new LinkedHashMap());
            this.alignType = 0;
        }
    }

    public static class NativeStringTracking {
        private NativeString peer;
        private final Object value;

        public NativeStringTracking(Object obj) {
            this.value = obj;
        }
    }

    public static class StructField {
        public FromNativeContext context;
        public Field field;
        public boolean isReadOnly;
        public boolean isVolatile;
        public String name;
        public FromNativeConverter readConverter;
        public Class<?> type;
        public ToNativeConverter writeConverter;
        public int size = -1;
        public int offset = -1;

        public String toString() {
            return this.name + "@" + this.offset + "[" + this.size + "] (" + this.type + ")";
        }
    }

    public static class StructureSet extends AbstractCollection<Structure> implements Set<Structure> {
        private int count;
        Structure[] elements;

        private void ensureCapacity(int i) {
            Structure[] structureArr = this.elements;
            if (structureArr == null) {
                this.elements = new Structure[(i * 3) / 2];
            } else if (structureArr.length < i) {
                Structure[] structureArr2 = new Structure[(i * 3) / 2];
                System.arraycopy(structureArr, 0, structureArr2, 0, structureArr.length);
                this.elements = structureArr2;
            }
        }

        private int indexOf(Structure structure) {
            for (int i = 0; i < this.count; i++) {
                Structure structure2 = this.elements[i];
                if (structure == structure2 || (structure.getClass() == structure2.getClass() && structure.size() == structure2.size() && structure.getPointer().equals(structure2.getPointer()))) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return indexOf((Structure) obj) != -1;
        }

        public Structure[] getElements() {
            return this.elements;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Structure> iterator() {
            int i = this.count;
            Structure[] structureArr = new Structure[i];
            if (i > 0) {
                System.arraycopy(this.elements, 0, structureArr, 0, i);
            }
            return Arrays.asList(structureArr).iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int indexOf = indexOf((Structure) obj);
            if (indexOf == -1) {
                return false;
            }
            int i = this.count - 1;
            this.count = i;
            if (i >= 0) {
                Structure[] structureArr = this.elements;
                structureArr[indexOf] = structureArr[i];
                structureArr[i] = null;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.count;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Structure structure) {
            if (contains(structure)) {
                return false;
            }
            ensureCapacity(this.count + 1);
            Structure[] structureArr = this.elements;
            int i = this.count;
            this.count = i + 1;
            structureArr[i] = structure;
            return true;
        }
    }

    public Structure() {
        this(0);
    }

    private int addPadding(int i) {
        return addPadding(i, this.structAlignment);
    }

    public static void autoRead(Structure[] structureArr) {
        structureArrayCheck(structureArr);
        Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoRead();
            return;
        }
        for (Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoRead();
            }
        }
    }

    public static void autoWrite(Structure[] structureArr) {
        structureArrayCheck(structureArr);
        Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoWrite();
            return;
        }
        for (Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoWrite();
            }
        }
    }

    private Class<?> baseClass() {
        return (((this instanceof ByReference) || (this instanceof ByValue)) && Structure.class.isAssignableFrom(getClass().getSuperclass())) ? getClass().getSuperclass() : getClass();
    }

    public static Set<Structure> busy() {
        return busy.get();
    }

    public static List<String> createFieldsOrder(List<String> list, String... strArr) {
        return createFieldsOrder(list, (List<String>) Arrays.asList(strArr));
    }

    private LayoutInfo deriveLayout(boolean z2, boolean z3) {
        Class<?> cls;
        List<Field> fields = getFields(z2);
        if (fields == null) {
            return null;
        }
        LayoutInfo layoutInfo2 = new LayoutInfo();
        layoutInfo2.alignType = this.alignType;
        layoutInfo2.typeMapper = this.typeMapper;
        boolean z4 = true;
        boolean z5 = true;
        int i = 0;
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            Class<?> type = field.getType();
            if (type.isArray()) {
                layoutInfo2.variable = z4;
            }
            StructField structField = new StructField();
            structField.isVolatile = Modifier.isVolatile(modifiers);
            boolean isFinal = Modifier.isFinal(modifiers);
            structField.isReadOnly = isFinal;
            if (isFinal) {
                if (!Platform.RO_FIELDS) {
                    throw new IllegalArgumentException("This VM does not support read-only fields (field '" + field.getName() + "' within " + getClass() + ")");
                }
                field.setAccessible(z4);
            }
            structField.field = field;
            structField.name = field.getName();
            structField.type = type;
            if (Callback.class.isAssignableFrom(type) && !type.isInterface()) {
                throw new IllegalArgumentException("Structure Callback field '" + field.getName() + "' must be an interface");
            }
            if (type.isArray() && Structure.class.equals(type.getComponentType())) {
                throw new IllegalArgumentException("Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined");
            }
            if (Modifier.isPublic(field.getModifiers())) {
                Object fieldValue = getFieldValue(structField.field);
                if (fieldValue == null && type.isArray()) {
                    if (z2) {
                        throw new IllegalStateException("Array fields must be initialized");
                    }
                    return null;
                }
                if (NativeMapped.class.isAssignableFrom(type)) {
                    NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(type);
                    cls = nativeMappedConverter.nativeType();
                    structField.writeConverter = nativeMappedConverter;
                    structField.readConverter = nativeMappedConverter;
                    structField.context = new StructureReadContext(this, field);
                } else {
                    TypeMapper typeMapper = this.typeMapper;
                    if (typeMapper != null) {
                        ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(type);
                        FromNativeConverter fromNativeConverter = this.typeMapper.getFromNativeConverter(type);
                        if (toNativeConverter != null && fromNativeConverter != null) {
                            fieldValue = toNativeConverter.toNative(fieldValue, new StructureWriteContext(this, structField.field));
                            Class cls2 = fieldValue != null ? fieldValue.getClass() : Pointer.class;
                            structField.writeConverter = toNativeConverter;
                            structField.readConverter = fromNativeConverter;
                            structField.context = new StructureReadContext(this, field);
                            cls = cls2;
                        } else if (toNativeConverter != null || fromNativeConverter != null) {
                            throw new IllegalArgumentException("Structures require bidirectional type conversion for " + type);
                        }
                    }
                    cls = type;
                }
                if (fieldValue == null) {
                    fieldValue = initializeField(structField.field, type);
                }
                try {
                    structField.size = getNativeSize(cls, fieldValue);
                    int nativeAlignment = getNativeAlignment(cls, fieldValue, z5);
                    if (nativeAlignment == 0) {
                        throw new Error("Field alignment is zero for field '" + structField.name + "' within " + getClass());
                    }
                    layoutInfo2.alignment = Math.max(layoutInfo2.alignment, nativeAlignment);
                    int i2 = i % nativeAlignment;
                    if (i2 != 0) {
                        i += nativeAlignment - i2;
                    }
                    if (this instanceof Union) {
                        structField.offset = 0;
                        i = Math.max(i, structField.size);
                    } else {
                        structField.offset = i;
                        i += structField.size;
                    }
                    layoutInfo2.fields.put(structField.name, structField);
                } catch (IllegalArgumentException e2) {
                    if (!z2 && this.typeMapper == null) {
                        return null;
                    }
                    throw new IllegalArgumentException("Invalid Structure field in " + getClass() + ", field name '" + structField.name + "' (" + structField.type + "): " + e2.getMessage(), e2);
                }
            }
            z5 = false;
            z4 = true;
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Structure " + getClass() + " has unknown or zero size (ensure all fields are public)");
        }
        int addPadding = addPadding(i, layoutInfo2.alignment);
        if ((this instanceof ByValue) && !z3) {
            getTypeInfo();
        }
        layoutInfo2.size = addPadding;
        return layoutInfo2;
    }

    private List<String> fieldOrder() {
        Class<?> cls = getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            Map<Class<?>, List<String>> map = fieldOrder;
            List<String> list = map.get(cls);
            if (list != null) {
                reentrantReadWriteLock.readLock().unlock();
                return list;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                List<String> computeIfAbsent = map.computeIfAbsent(cls, new C0722a(0, this));
                reentrantReadWriteLock.writeLock().unlock();
                return computeIfAbsent;
            } catch (Throwable th) {
                cacheStructureLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            cacheStructureLock.readLock().unlock();
            throw th2;
        }
    }

    private String format(Class<?> cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(".") + 1);
    }

    private static <T> Constructor<T> getPointerConstructor(Class<T> cls) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(Pointer.class)) {
                return constructor;
            }
        }
        return null;
    }

    private Object initializeField(Field field, Class<?> cls) {
        if (!Structure.class.isAssignableFrom(cls) || ByReference.class.isAssignableFrom(cls)) {
            if (!NativeMapped.class.isAssignableFrom(cls)) {
                return null;
            }
            NativeMapped defaultValue = NativeMappedConverter.getInstance(cls).defaultValue();
            setFieldValue(field, defaultValue);
            return defaultValue;
        }
        try {
            Structure newInstance = newInstance((Class<Structure>) cls, PLACEHOLDER_MEMORY);
            setFieldValue(field, newInstance);
            return newInstance;
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Can't determine size of nested structure", e2);
        }
    }

    private void initializeFields() {
        for (Field field : getFieldList()) {
            try {
                if (field.get(this) == null) {
                    initializeField(field, field.getType());
                }
            } catch (Exception e2) {
                throw new Error("Exception reading field '" + field.getName() + "' in " + getClass(), e2);
            }
        }
    }

    private void initializeTypeMapper(TypeMapper typeMapper) {
        if (typeMapper == null) {
            typeMapper = Native.getTypeMapper(getClass());
        }
        this.typeMapper = typeMapper;
        layoutChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$fieldOrder$1(Class cls) {
        return getFieldOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getFieldList$0(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (!cls.equals(Structure.class)) {
            for (Field field : cls.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                    arrayList2.add(field);
                }
            }
            arrayList.addAll(0, arrayList2);
            arrayList2.clear();
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$validateFields$2(Class cls) {
        for (Field field : getFieldList()) {
            validateField(field.getName(), field.getType());
        }
        return Boolean.TRUE;
    }

    private void layoutChanged() {
        if (this.size != -1) {
            this.size = -1;
            if (this.memory instanceof AutoAllocated) {
                this.memory = null;
            }
            ensureAllocated();
        }
    }

    private static <T extends Structure> T newInstance(Class<T> cls, long j2) {
        try {
            T t2 = (T) newInstance(cls, j2 == 0 ? PLACEHOLDER_MEMORY : new Pointer(j2));
            if (j2 != 0) {
                t2.conditionalAutoRead();
            }
            return t2;
        } catch (Throwable th) {
            LOG.log(Level.WARNING, "JNA: Error creating structure", th);
            return null;
        }
    }

    public static Map<Pointer, Structure> reading() {
        return reads.get();
    }

    private static <T extends Comparable<T>> List<T> sort(Collection<? extends T> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void structureArrayCheck(Structure[] structureArr) {
        if (ByReference[].class.isAssignableFrom(structureArr.getClass())) {
            return;
        }
        Pointer pointer = structureArr[0].getPointer();
        int size = structureArr[0].size();
        for (int i = 1; i < structureArr.length; i++) {
            if (structureArr[i].getPointer().peer != pointer.peer + (size * i)) {
                throw new IllegalArgumentException("Structure array elements must use contiguous memory (bad backing address at Structure array index " + i + ")");
            }
        }
    }

    public static <T extends Structure> T updateStructureByReference(Class<T> cls, T t2, Pointer pointer) {
        if (pointer == null) {
            return null;
        }
        if (t2 != null && pointer.equals(t2.getPointer())) {
            t2.autoRead();
            return t2;
        }
        T t3 = (T) reading().get(pointer);
        if (t3 != null && cls.equals(t3.getClass())) {
            t3.autoRead();
            return t3;
        }
        T t4 = (T) newInstance(cls, pointer);
        t4.conditionalAutoRead();
        return t4;
    }

    public static void validate(Class<? extends Structure> cls) {
        try {
            cls.getConstructor(null);
        } catch (NoSuchMethodException | SecurityException unused) {
            throw new IllegalArgumentException("No suitable constructor found for class: ".concat(cls.getName()));
        }
    }

    private void validateField(String str, Class<?> cls) {
        ToNativeConverter toNativeConverter;
        TypeMapper typeMapper = this.typeMapper;
        if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
            validateField(str, toNativeConverter.nativeType());
            return;
        }
        if (cls.isArray()) {
            validateField(str, cls.getComponentType());
            return;
        }
        try {
            getNativeSize(cls);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Invalid Structure field in " + getClass() + ", field name '" + str + "' (" + cls + "): " + e2.getMessage(), e2);
        }
    }

    private void validateFields() {
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            Map<Class<?>, Boolean> map = validationMap;
            if (map.containsKey(getClass())) {
                reentrantReadWriteLock.readLock().unlock();
                return;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                map.computeIfAbsent(getClass(), new C0722a(1, this));
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                cacheStructureLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            cacheStructureLock.readLock().unlock();
            throw th2;
        }
    }

    public void allocateMemory() {
        allocateMemory(false);
    }

    public Memory autoAllocate(int i) {
        return new AutoAllocated(i);
    }

    public void cacheTypeInfo(Pointer pointer) {
        this.typeInfo = pointer.peer;
    }

    public int calculateSize(boolean z2) {
        return calculateSize(z2, false);
    }

    public void clear() {
        ensureAllocated();
        this.nativeStrings.clear();
        this.memory.clear(size());
    }

    public void conditionalAutoRead() {
        if (this.readCalled) {
            return;
        }
        autoRead();
    }

    public boolean dataEquals(Structure structure) {
        return dataEquals(structure, false);
    }

    public void ensureAllocated() {
        ensureAllocated(false);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Structure) && obj.getClass() == getClass() && ((Structure) obj).getPointer().equals(getPointer());
    }

    public int fieldOffset(String str) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField != null) {
            return structField.offset;
        }
        throw new IllegalArgumentException(AbstractC1561o.m4299c("No such field: ", str));
    }

    public Map<String, StructField> fields() {
        return this.structFields;
    }

    public boolean getAutoRead() {
        return this.autoRead;
    }

    public boolean getAutoWrite() {
        return this.autoWrite;
    }

    public List<Field> getFieldList() {
        Class<?> cls = getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            Map<Class<?>, List<Field>> map = fieldList;
            List<Field> list = map.get(cls);
            if (list != null) {
                reentrantReadWriteLock.readLock().unlock();
                return list;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                List<Field> computeIfAbsent = map.computeIfAbsent(cls, new C0722a(2, cls));
                reentrantReadWriteLock.writeLock().unlock();
                return computeIfAbsent;
            } catch (Throwable th) {
                cacheStructureLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            cacheStructureLock.readLock().unlock();
            throw th2;
        }
    }

    public List<String> getFieldOrder() {
        LinkedList linkedList = new LinkedList();
        for (Class<?> cls = getClass(); cls != Structure.class; cls = cls.getSuperclass()) {
            FieldOrder fieldOrder2 = (FieldOrder) cls.getAnnotation(FieldOrder.class);
            if (fieldOrder2 != null) {
                linkedList.addAll(0, Arrays.asList(fieldOrder2.value()));
            }
        }
        return Collections.unmodifiableList(linkedList);
    }

    public FFIType getFieldTypeInfo(StructField structField) {
        ToNativeConverter toNativeConverter;
        Class<?> cls = structField.type;
        Object fieldValue = getFieldValue(structField.field);
        TypeMapper typeMapper = this.typeMapper;
        if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
            cls = toNativeConverter.nativeType();
            fieldValue = toNativeConverter.toNative(fieldValue, new ToNativeContext());
        }
        return FFIType.get(fieldValue, cls);
    }

    public Object getFieldValue(Field field) {
        try {
            return field.get(this);
        } catch (Exception e2) {
            throw new Error("Exception reading field '" + field.getName() + "' in " + getClass(), e2);
        }
    }

    public List<Field> getFields(boolean z2) {
        ArrayList arrayList = new ArrayList(getFieldList());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((Field) it.next()).getName());
        }
        List<String> fieldOrder2 = fieldOrder();
        if (fieldOrder2.size() == arrayList.size() || arrayList.size() <= 1) {
            if (new HashSet(fieldOrder2).equals(hashSet)) {
                sortFields(arrayList, fieldOrder2);
                return arrayList;
            }
            throw new Error("Structure.getFieldOrder() on " + getClass() + " returns names (" + sort(fieldOrder2) + ") which do not match declared field names (" + sort(hashSet) + ")");
        }
        if (!z2) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Structure.getFieldOrder() on ");
        sb.append(getClass());
        sb.append(fieldOrder2.size() < arrayList.size() ? " does not provide enough" : " provides too many");
        sb.append(" names [");
        sb.append(fieldOrder2.size());
        sb.append("] (");
        sb.append(sort(fieldOrder2));
        sb.append(") to match declared fields [");
        sb.append(arrayList.size());
        sb.append("] (");
        sb.append(sort(hashSet));
        sb.append(")");
        throw new Error(sb.toString());
    }

    public int getNativeAlignment(Class<?> cls, Object obj, boolean z2) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            Class<?> nativeType = nativeMappedConverter.nativeType();
            obj = nativeMappedConverter.toNative(obj, new ToNativeContext());
            cls = nativeType;
        }
        int nativeSize = Native.getNativeSize(cls, obj);
        if (!cls.isPrimitive() && Long.class != cls && Integer.class != cls && Short.class != cls && Character.class != cls && Byte.class != cls && Boolean.class != cls && Float.class != cls && Double.class != cls) {
            if ((Pointer.class.isAssignableFrom(cls) && !Function.class.isAssignableFrom(cls)) || ((Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(cls)) || Callback.class.isAssignableFrom(cls) || WString.class == cls || String.class == cls)) {
                nativeSize = Native.POINTER_SIZE;
            } else if (Structure.class.isAssignableFrom(cls)) {
                if (ByReference.class.isAssignableFrom(cls)) {
                    nativeSize = Native.POINTER_SIZE;
                } else {
                    if (obj == null) {
                        obj = newInstance(cls, PLACEHOLDER_MEMORY);
                    }
                    nativeSize = ((Structure) obj).getStructAlignment();
                }
            } else {
                if (!cls.isArray()) {
                    throw new IllegalArgumentException("Type " + cls + " has unknown native alignment");
                }
                nativeSize = getNativeAlignment(cls.getComponentType(), null, z2);
            }
        }
        int i = this.actualAlignType;
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return Math.min(8, nativeSize);
        }
        if (i != 2) {
            return nativeSize;
        }
        if (!z2 || !Platform.isMac() || !Platform.isPPC()) {
            nativeSize = Math.min(Native.MAX_ALIGNMENT, nativeSize);
        }
        if (z2 || !Platform.isAIX()) {
            return nativeSize;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return 4;
        }
        return nativeSize;
    }

    public int getNativeSize(Class<?> cls) {
        return getNativeSize(cls, null);
    }

    public Pointer getPointer() {
        ensureAllocated();
        return this.memory;
    }

    public String getStringEncoding() {
        return this.encoding;
    }

    public int getStructAlignment() {
        if (this.size == -1) {
            calculateSize(true);
        }
        return this.structAlignment;
    }

    public Pointer getTypeInfo() {
        Pointer pointer = getTypeInfo(this).getPointer();
        cacheTypeInfo(pointer);
        return pointer;
    }

    public TypeMapper getTypeMapper() {
        return this.typeMapper;
    }

    public int hashCode() {
        return getPointer() != null ? getPointer().hashCode() : getClass().hashCode();
    }

    public void read() {
        if (this.memory == PLACEHOLDER_MEMORY) {
            return;
        }
        this.readCalled = true;
        ensureAllocated();
        if (busy().add(this)) {
            boolean z2 = this instanceof ByReference;
            if (z2) {
                reading().put(getPointer(), this);
            }
            try {
                Iterator<StructField> it = fields().values().iterator();
                while (it.hasNext()) {
                    readField(it.next());
                }
            } finally {
                busy().remove(this);
                if (z2 && reading().get(getPointer()) == this) {
                    reading().remove(getPointer());
                }
            }
        }
    }

    public Object readField(String str) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField != null) {
            return readField(structField);
        }
        throw new IllegalArgumentException(AbstractC1561o.m4299c("No such field: ", str));
    }

    public void setAlignType(int i) {
        this.alignType = i;
        if (i == 0 && (i = Native.getStructureAlignment(getClass())) == 0) {
            i = Platform.isWindows() ? 3 : 2;
        }
        this.actualAlignType = i;
        layoutChanged();
    }

    public void setAutoRead(boolean z2) {
        this.autoRead = z2;
    }

    public void setAutoSynch(boolean z2) {
        setAutoRead(z2);
        setAutoWrite(z2);
    }

    public void setAutoWrite(boolean z2) {
        this.autoWrite = z2;
    }

    public void setFieldValue(Field field, Object obj) {
        setFieldValue(field, obj, false);
    }

    public void setStringEncoding(String str) {
        this.encoding = str;
    }

    public int size() {
        ensureAllocated();
        return this.size;
    }

    public void sortFields(List<Field> list, List<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            String str = list2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (str.equals(list.get(i2).getName())) {
                    Collections.swap(list, i, i2);
                    break;
                }
                i2++;
            }
        }
    }

    public Structure[] toArray(Structure[] structureArr) {
        ensureAllocated();
        Pointer pointer = this.memory;
        if (pointer instanceof AutoAllocated) {
            int size = size() * structureArr.length;
            if (((Memory) pointer).size() < size) {
                useMemory(autoAllocate(size));
            }
        }
        structureArr[0] = this;
        int size2 = size();
        for (int i = 1; i < structureArr.length; i++) {
            Structure newInstance = newInstance((Class<Structure>) getClass(), this.memory.share(i * size2, size2));
            structureArr[i] = newInstance;
            newInstance.conditionalAutoRead();
        }
        if (!(this instanceof ByValue)) {
            this.array = structureArr;
        }
        return structureArr;
    }

    public String toString() {
        return toString(Boolean.getBoolean("jna.dump_memory"));
    }

    public void useMemory(Pointer pointer) {
        useMemory(pointer, 0);
    }

    public void write() {
        if (this.memory == PLACEHOLDER_MEMORY) {
            return;
        }
        ensureAllocated();
        if (this instanceof ByValue) {
            getTypeInfo();
        }
        if (busy().add(this)) {
            try {
                for (StructField structField : fields().values()) {
                    if (!structField.isVolatile) {
                        writeField(structField);
                    }
                }
            } finally {
                busy().remove(this);
            }
        }
    }

    public void writeField(String str) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField == null) {
            throw new IllegalArgumentException(AbstractC1561o.m4299c("No such field: ", str));
        }
        writeField(structField);
    }

    public Structure(TypeMapper typeMapper) {
        this(null, 0, typeMapper);
    }

    private int addPadding(int i, int i2) {
        int i3;
        return (this.actualAlignType == 1 || (i3 = i % i2) == 0) ? i : i + (i2 - i3);
    }

    private void allocateMemory(boolean z2) {
        allocateMemory(calculateSize(true, z2));
    }

    public static List<String> createFieldsOrder(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureAllocated(boolean z2) {
        if (this.memory == null) {
            allocateMemory(z2);
            return;
        }
        if (this.size == -1) {
            int calculateSize = calculateSize(true, z2);
            this.size = calculateSize;
            Pointer pointer = this.memory;
            if (pointer instanceof AutoAllocated) {
                return;
            }
            try {
                this.memory = pointer.share(0L, calculateSize);
            } catch (IndexOutOfBoundsException e2) {
                throw new IllegalArgumentException("Structure exceeds provided memory bounds", e2);
            }
        }
    }

    private void setFieldValue(Field field, Object obj, boolean z2) {
        try {
            field.set(this, obj);
        } catch (IllegalAccessException e2) {
            if (!Modifier.isFinal(field.getModifiers())) {
                throw new Error("Unexpectedly unable to write to field '" + field.getName() + "' within " + getClass(), e2);
            }
            if (!z2) {
                throw new UnsupportedOperationException("Attempt to write to read-only field '" + field.getName() + "' within " + getClass(), e2);
            }
            throw new UnsupportedOperationException("This VM does not support Structures with final fields (field '" + field.getName() + "' within " + getClass() + ")", e2);
        }
    }

    public int calculateSize(boolean z2, boolean z3) {
        Class<?> cls = getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            Map<Class<?>, LayoutInfo> map = layoutInfo;
            LayoutInfo layoutInfo2 = map.get(cls);
            reentrantReadWriteLock.readLock().unlock();
            if (layoutInfo2 == null || this.alignType != layoutInfo2.alignType || this.typeMapper != layoutInfo2.typeMapper) {
                layoutInfo2 = deriveLayout(z2, z3);
            }
            if (layoutInfo2 == null) {
                return -1;
            }
            this.structAlignment = layoutInfo2.alignment;
            this.structFields = layoutInfo2.fields;
            if (!layoutInfo2.variable) {
                reentrantReadWriteLock.readLock().lock();
                try {
                    if (map.containsKey(cls)) {
                        if (this.alignType == 0) {
                            if (this.typeMapper != null) {
                            }
                            reentrantReadWriteLock.readLock().unlock();
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    reentrantReadWriteLock.writeLock().lock();
                    map.put(cls, layoutInfo2);
                    reentrantReadWriteLock.readLock().lock();
                    reentrantReadWriteLock.writeLock().unlock();
                    reentrantReadWriteLock.readLock().unlock();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return layoutInfo2.size;
        } finally {
            cacheStructureLock.readLock().unlock();
        }
    }

    public boolean dataEquals(Structure structure, boolean z2) {
        if (z2) {
            structure.getPointer().clear(structure.size());
            structure.write();
            getPointer().clear(size());
            write();
        }
        byte[] byteArray = structure.getPointer().getByteArray(0L, structure.size());
        byte[] byteArray2 = getPointer().getByteArray(0L, size());
        if (byteArray.length != byteArray2.length) {
            return false;
        }
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] != byteArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public int getNativeSize(Class<?> cls, Object obj) {
        return Native.getNativeSize(cls, obj);
    }

    public String toString(boolean z2) {
        return toString(0, true, z2);
    }

    public void useMemory(Pointer pointer, int i) {
        useMemory(pointer, i, false);
    }

    public Structure(int i) {
        this((Pointer) null, i);
    }

    public static FFIType getTypeInfo(Object obj) {
        return FFIType.get(obj);
    }

    public static int size(Class<? extends Structure> cls) {
        return size(cls, null);
    }

    private String toString(int i, boolean z2, boolean z3) {
        String str;
        String str2;
        String sb;
        ensureAllocated();
        String lineSeparator = System.lineSeparator();
        String str3 = format(getClass()) + "(" + getPointer() + ")";
        if (!(getPointer() instanceof Memory)) {
            str3 = str3 + " (" + size() + " bytes)";
        }
        String str4 = "";
        for (int i2 = 0; i2 < i; i2++) {
            str4 = AbstractC0062j.m160n(str4, "  ");
        }
        if (!z2) {
            str = "...}";
        } else {
            Iterator<StructField> it = fields().values().iterator();
            String str5 = lineSeparator;
            while (it.hasNext()) {
                StructField next = it.next();
                Object fieldValue = getFieldValue(next.field);
                String format = format(next.type);
                String m160n = AbstractC0062j.m160n(str5, str4);
                if (!next.type.isArray() || fieldValue == null) {
                    str2 = "";
                } else {
                    format = format(next.type.getComponentType());
                    str2 = "[" + Array.getLength(fieldValue) + "]";
                }
                StringBuilder m2942a = AbstractC1241e.m2942a(m160n);
                m2942a.append(String.format("  %s %s%s@0x%X", format, next.name, str2, Integer.valueOf(next.offset)));
                String sb2 = m2942a.toString();
                if (fieldValue instanceof Structure) {
                    fieldValue = ((Structure) fieldValue).toString(i + 1, !(fieldValue instanceof ByReference), z3);
                }
                String m160n2 = AbstractC0062j.m160n(sb2, "=");
                if (fieldValue instanceof Long) {
                    StringBuilder m2942a2 = AbstractC1241e.m2942a(m160n2);
                    m2942a2.append(String.format("0x%08X", (Long) fieldValue));
                    sb = m2942a2.toString();
                } else if (fieldValue instanceof Integer) {
                    StringBuilder m2942a3 = AbstractC1241e.m2942a(m160n2);
                    m2942a3.append(String.format("0x%04X", (Integer) fieldValue));
                    sb = m2942a3.toString();
                } else if (fieldValue instanceof Short) {
                    StringBuilder m2942a4 = AbstractC1241e.m2942a(m160n2);
                    m2942a4.append(String.format("0x%02X", (Short) fieldValue));
                    sb = m2942a4.toString();
                } else if (fieldValue instanceof Byte) {
                    StringBuilder m2942a5 = AbstractC1241e.m2942a(m160n2);
                    m2942a5.append(String.format("0x%01X", (Byte) fieldValue));
                    sb = m2942a5.toString();
                } else {
                    StringBuilder m2942a6 = AbstractC1241e.m2942a(m160n2);
                    m2942a6.append(String.valueOf(fieldValue).trim());
                    sb = m2942a6.toString();
                }
                String m160n3 = AbstractC0062j.m160n(sb, lineSeparator);
                if (!it.hasNext()) {
                    m160n3 = AbstractC0062j.m169w(m160n3, str4, "}");
                }
                str5 = m160n3;
            }
            str = str5;
        }
        if (i == 0 && z3) {
            String str6 = str + lineSeparator + "memory dump" + lineSeparator;
            byte[] byteArray = getPointer().getByteArray(0L, size());
            for (int i3 = 0; i3 < byteArray.length; i3++) {
                int i4 = i3 % 4;
                if (i4 == 0) {
                    str6 = AbstractC0062j.m160n(str6, "[");
                }
                byte b2 = byteArray[i3];
                if (b2 >= 0 && b2 < 16) {
                    str6 = AbstractC0062j.m160n(str6, "0");
                }
                StringBuilder m2942a7 = AbstractC1241e.m2942a(str6);
                m2942a7.append(Integer.toHexString(byteArray[i3] & 255));
                str6 = m2942a7.toString();
                if (i4 == 3 && i3 < byteArray.length - 1) {
                    str6 = AbstractC0062j.m169w(str6, "]", lineSeparator);
                }
            }
            str = AbstractC0062j.m160n(str6, "]");
        }
        return AbstractC0062j.m169w(str3, " {", str);
    }

    public void allocateMemory(int i) {
        if (i == -1) {
            i = calculateSize(false);
        } else if (i <= 0) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "Structure size must be greater than zero: "));
        }
        if (i != -1) {
            Pointer pointer = this.memory;
            if (pointer == null || (pointer instanceof AutoAllocated)) {
                this.memory = autoAllocate(i);
            }
            this.size = i;
        }
    }

    public void useMemory(Pointer pointer, int i, boolean z2) {
        try {
            this.nativeStrings.clear();
            if ((this instanceof ByValue) && !z2) {
                int size = size();
                byte[] bArr = new byte[size];
                pointer.read(0L, bArr, 0, size);
                this.memory.write(0L, bArr, 0, size);
            } else {
                if (this.size == -1) {
                    this.size = calculateSize(false);
                }
                int i2 = this.size;
                if (i2 != -1) {
                    this.memory = pointer.share(i, i2);
                } else {
                    this.memory = pointer.share(i);
                }
            }
            this.array = null;
            this.readCalled = false;
        } catch (IndexOutOfBoundsException e2) {
            throw new IllegalArgumentException("Structure exceeds provided memory bounds", e2);
        }
    }

    public Structure(int i, TypeMapper typeMapper) {
        this(null, i, typeMapper);
    }

    public static <T extends Structure> T newInstance(Class<T> cls, Pointer pointer) {
        try {
            Constructor pointerConstructor = getPointerConstructor(cls);
            if (pointerConstructor != null) {
                return (T) pointerConstructor.newInstance(pointer);
            }
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Instantiation of " + cls + " (Pointer) not allowed, is it public?", e2);
        } catch (InstantiationException e3) {
            throw new IllegalArgumentException("Can't instantiate " + cls, e3);
        } catch (SecurityException unused) {
        } catch (InvocationTargetException e4) {
            throw new IllegalArgumentException("Exception thrown while instantiating an instance of " + cls, e4);
        }
        T t2 = (T) newInstance(cls);
        if (pointer != PLACEHOLDER_MEMORY) {
            t2.useMemory(pointer);
        }
        return t2;
    }

    public static <T extends Structure> int size(Class<T> cls, T t2) {
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            LayoutInfo layoutInfo2 = layoutInfo.get(cls);
            reentrantReadWriteLock.readLock().unlock();
            int i = (layoutInfo2 == null || layoutInfo2.variable) ? -1 : layoutInfo2.size;
            if (i != -1) {
                return i;
            }
            if (t2 == null) {
                t2 = (T) newInstance(cls, PLACEHOLDER_MEMORY);
            }
            return t2.size();
        } catch (Throwable th) {
            cacheStructureLock.readLock().unlock();
            throw th;
        }
    }

    public Structure(Pointer pointer) {
        this(pointer, 0);
    }

    public Structure(Pointer pointer, int i) {
        this(pointer, i, null);
    }

    public static List<String> createFieldsOrder(String str) {
        return Collections.unmodifiableList(Collections.singletonList(str));
    }

    public Structure(Pointer pointer, int i, TypeMapper typeMapper) {
        this.size = -1;
        this.nativeStrings = new HashMap(8);
        this.autoRead = true;
        this.autoWrite = true;
        setAlignType(i);
        setStringEncoding(Native.getStringEncoding(getClass()));
        initializeTypeMapper(typeMapper);
        validateFields();
        if (pointer != null) {
            useMemory(pointer, 0, true);
        } else {
            allocateMemory(-1);
        }
        initializeFields();
    }

    public static List<String> createFieldsOrder(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public void autoRead() {
        if (!getAutoRead()) {
            return;
        }
        read();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            Structure[] structureArr = this.array;
            if (i >= structureArr.length) {
                return;
            }
            structureArr[i].autoRead();
            i++;
        }
    }

    public void autoWrite() {
        if (!getAutoWrite()) {
            return;
        }
        write();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            Structure[] structureArr = this.array;
            if (i >= structureArr.length) {
                return;
            }
            structureArr[i].autoWrite();
            i++;
        }
    }

    public Object readField(StructField structField) {
        int i = structField.offset;
        Class<?> cls = structField.type;
        FromNativeConverter fromNativeConverter = structField.readConverter;
        if (fromNativeConverter != null) {
            cls = fromNativeConverter.nativeType();
        }
        Object obj = null;
        Object fieldValue = (Structure.class.isAssignableFrom(cls) || Callback.class.isAssignableFrom(cls) || (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(cls)) || Pointer.class.isAssignableFrom(cls) || NativeMapped.class.isAssignableFrom(cls) || cls.isArray()) ? getFieldValue(structField.field) : null;
        if (cls == String.class) {
            Pointer pointer = this.memory.getPointer(i);
            if (pointer != null) {
                obj = pointer.getString(0L, this.encoding);
            }
        } else {
            obj = this.memory.getValue(i, cls, fieldValue);
        }
        if (fromNativeConverter != null) {
            Object fromNative = fromNativeConverter.fromNative(obj, structField.context);
            if (fieldValue == null || !fieldValue.equals(fromNative)) {
                fieldValue = fromNative;
            }
        } else {
            fieldValue = obj;
        }
        if (cls.equals(String.class) || cls.equals(WString.class)) {
            if (fieldValue != null) {
                NativeStringTracking nativeStringTracking = new NativeStringTracking(fieldValue);
                NativeStringTracking put = this.nativeStrings.put(structField.name, nativeStringTracking);
                if (put != null) {
                    nativeStringTracking.peer = put.peer;
                }
            } else {
                this.nativeStrings.remove(structField.name);
            }
        }
        setFieldValue(structField.field, fieldValue, true);
        return fieldValue;
    }

    public void writeField(String str, Object obj) {
        ensureAllocated();
        StructField structField = fields().get(str);
        if (structField != null) {
            setFieldValue(structField.field, obj);
            writeField(structField, obj);
            return;
        }
        throw new IllegalArgumentException(AbstractC1561o.m4299c("No such field: ", str));
    }

    public Structure[] toArray(int i) {
        return toArray((Structure[]) Array.newInstance(getClass(), i));
    }

    public static <T extends Structure> T newInstance(Class<T> cls) {
        T t2 = (T) Klass.newInstance(cls);
        if (t2 instanceof ByValue) {
            t2.allocateMemory();
        }
        return t2;
    }

    public void writeField(StructField structField) {
        if (structField.isReadOnly) {
            return;
        }
        writeField(structField, getFieldValue(structField.field));
    }

    private void writeField(StructField structField, Object obj) {
        NativeString nativeString;
        String str;
        int i = structField.offset;
        Class<?> cls = structField.type;
        ToNativeConverter toNativeConverter = structField.writeConverter;
        if (toNativeConverter != null) {
            obj = toNativeConverter.toNative(obj, new StructureWriteContext(this, structField.field));
            cls = toNativeConverter.nativeType();
        }
        if (String.class == cls || WString.class == cls) {
            if (obj != null) {
                NativeStringTracking nativeStringTracking = new NativeStringTracking(obj);
                NativeStringTracking put = this.nativeStrings.put(structField.name, nativeStringTracking);
                if (put != null && obj.equals(put.value)) {
                    nativeStringTracking.peer = put.peer;
                    return;
                }
                if (cls == WString.class) {
                    nativeString = new NativeString(obj.toString(), true);
                } else {
                    nativeString = new NativeString(obj.toString(), this.encoding);
                }
                nativeStringTracking.peer = nativeString;
                obj = nativeString.getPointer();
            } else {
                this.nativeStrings.remove(structField.name);
            }
        }
        try {
            this.memory.setValue(i, obj, cls);
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder("Structure field \"");
            sb.append(structField.name);
            sb.append("\" was declared as ");
            sb.append(structField.type);
            if (structField.type == cls) {
                str = "";
            } else {
                str = " (native type " + cls + ")";
            }
            throw new IllegalArgumentException(AbstractC0062j.m162p(sb, str, ", which is not supported within a Structure"), e2);
        }
    }
}
