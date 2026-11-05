package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class SHA512 implements HASH {

    /* renamed from: md */
    MessageDigest f3824md;

    @Override // com.jcraft.jsch.HASH
    public byte[] digest() {
        return this.f3824md.digest();
    }

    @Override // com.jcraft.jsch.HASH
    public int getBlockSize() {
        return 64;
    }

    @Override // com.jcraft.jsch.HASH
    public void init() {
        try {
            this.f3824md = MessageDigest.getInstance("SHA-512");
        } catch (Exception e2) {
            System.err.println(e2);
        }
    }

    @Override // com.jcraft.jsch.HASH
    public void update(byte[] bArr, int i, int i2) {
        this.f3824md.update(bArr, i, i2);
    }
}
