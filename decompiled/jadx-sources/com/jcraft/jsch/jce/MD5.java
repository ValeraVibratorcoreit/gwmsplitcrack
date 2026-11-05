package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class MD5 implements HASH {

    /* renamed from: md */
    MessageDigest f3820md;

    @Override // com.jcraft.jsch.HASH
    public byte[] digest() {
        return this.f3820md.digest();
    }

    @Override // com.jcraft.jsch.HASH
    public int getBlockSize() {
        return 16;
    }

    @Override // com.jcraft.jsch.HASH
    public void init() {
        try {
            this.f3820md = MessageDigest.getInstance("MD5");
        } catch (Exception e2) {
            System.err.println(e2);
        }
    }

    @Override // com.jcraft.jsch.HASH
    public void update(byte[] bArr, int i, int i2) {
        this.f3820md.update(bArr, i, i2);
    }
}
