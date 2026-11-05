package com.jcraft.jsch.jce;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes.dex */
public class KeyPairGenRSA implements com.jcraft.jsch.KeyPairGenRSA {

    /* renamed from: c */
    byte[] f3812c;

    /* renamed from: d */
    byte[] f3813d;

    /* renamed from: e */
    byte[] f3814e;

    /* renamed from: ep */
    byte[] f3815ep;

    /* renamed from: eq */
    byte[] f3816eq;

    /* renamed from: n */
    byte[] f3817n;

    /* renamed from: p */
    byte[] f3818p;

    /* renamed from: q */
    byte[] f3819q;

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getC() {
        return this.f3812c;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getD() {
        return this.f3813d;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getE() {
        return this.f3814e;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getEP() {
        return this.f3815ep;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getEQ() {
        return this.f3816eq;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getN() {
        return this.f3817n;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getP() {
        return this.f3818p;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public byte[] getQ() {
        return this.f3819q;
    }

    @Override // com.jcraft.jsch.KeyPairGenRSA
    public void init(int i) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(i, new SecureRandom());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = generateKeyPair.getPublic();
        PrivateKey privateKey = generateKeyPair.getPrivate();
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) privateKey;
        this.f3813d = rSAPrivateKey.getPrivateExponent().toByteArray();
        this.f3814e = ((RSAPublicKey) publicKey).getPublicExponent().toByteArray();
        this.f3817n = rSAPrivateKey.getModulus().toByteArray();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) privateKey;
        this.f3812c = rSAPrivateCrtKey.getCrtCoefficient().toByteArray();
        this.f3815ep = rSAPrivateCrtKey.getPrimeExponentP().toByteArray();
        this.f3816eq = rSAPrivateCrtKey.getPrimeExponentQ().toByteArray();
        this.f3818p = rSAPrivateCrtKey.getPrimeP().toByteArray();
        this.f3819q = rSAPrivateCrtKey.getPrimeQ().toByteArray();
    }
}
