package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class SHA1 implements HASH {

    /* renamed from: md */
    MessageDigest f3821md;

    @Override // com.jcraft.jsch.HASH
    public byte[] digest() {
        return this.f3821md.digest();
    }

    @Override // com.jcraft.jsch.HASH
    public int getBlockSize() {
        return 20;
    }

    @Override // com.jcraft.jsch.HASH
    public void init() {
        try {
            this.f3821md = MessageDigest.getInstance("SHA-1");
        } catch (Exception e2) {
            System.err.println(e2);
        }
    }

    @Override // com.jcraft.jsch.HASH
    public void update(byte[] bArr, int i, int i2) {
        this.f3821md.update(bArr, i, i2);
    }
}
