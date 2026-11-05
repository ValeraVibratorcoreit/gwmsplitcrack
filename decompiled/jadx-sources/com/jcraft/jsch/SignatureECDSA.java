package com.jcraft.jsch;

/* loaded from: classes.dex */
public interface SignatureECDSA extends Signature {
    void setPrvKey(byte[] bArr);

    void setPubKey(byte[] bArr, byte[] bArr2);
}
