package com.jcraft.jsch.jce;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

/* loaded from: classes.dex */
public class KeyPairGenDSA implements com.jcraft.jsch.KeyPairGenDSA {

    /* renamed from: g */
    byte[] f3804g;

    /* renamed from: p */
    byte[] f3805p;

    /* renamed from: q */
    byte[] f3806q;

    /* renamed from: x */
    byte[] f3807x;

    /* renamed from: y */
    byte[] f3808y;

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getG() {
        return this.f3804g;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getP() {
        return this.f3805p;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getQ() {
        return this.f3806q;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getX() {
        return this.f3807x;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getY() {
        return this.f3808y;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public void init(int i) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(i, new SecureRandom());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = generateKeyPair.getPublic();
        PrivateKey privateKey = generateKeyPair.getPrivate();
        this.f3807x = ((DSAPrivateKey) privateKey).getX().toByteArray();
        this.f3808y = ((DSAPublicKey) publicKey).getY().toByteArray();
        DSAParams params = ((DSAKey) privateKey).getParams();
        this.f3805p = params.getP().toByteArray();
        this.f3806q = params.getQ().toByteArray();
        this.f3804g = params.getG().toByteArray();
    }
}
