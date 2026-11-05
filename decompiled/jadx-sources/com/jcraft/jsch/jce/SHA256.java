package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class SHA256 implements HASH {

    /* renamed from: md */
    MessageDigest f3822md;

    @Override // com.jcraft.jsch.HASH
    public byte[] digest() {
        return this.f3822md.digest();
    }

    @Override // com.jcraft.jsch.HASH
    public int getBlockSize() {
        return 32;
    }

    @Override // com.jcraft.jsch.HASH
    public void init() {
        try {
            this.f3822md = MessageDigest.getInstance("SHA-256");
        } catch (Exception e2) {
            System.err.println(e2);
        }
    }

    @Override // com.jcraft.jsch.HASH
    public void update(byte[] bArr, int i, int i2) {
        this.f3822md.update(bArr, i, i2);
    }
}
