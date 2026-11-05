package com.sun.jna.ptr;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/* loaded from: classes.dex */
public abstract class ByReference extends PointerType {
    public ByReference(int i) {
        setPointer(new Memory(i));
    }

    @Override // com.sun.jna.PointerType
    public String toString() {
        try {
            Object invoke = getClass().getMethod("getValue", null).invoke(this, null);
            return invoke == null ? String.format("null@0x%x", Long.valueOf(Pointer.nativeValue(getPointer()))) : String.format("%s@0x%x=%s", invoke.getClass().getSimpleName(), Long.valueOf(Pointer.nativeValue(getPointer())), invoke);
        } catch (Exception e2) {
            return "ByReference Contract violated - " + getClass().getName() + "#getValue raised exception: " + e2.getMessage();
        }
    }
}
