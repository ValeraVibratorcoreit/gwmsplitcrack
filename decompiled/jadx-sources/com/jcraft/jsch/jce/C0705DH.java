package com.jcraft.jsch.jce;

import com.jcraft.jsch.InterfaceC0700DH;
import com.jcraft.jsch.JSchException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* renamed from: com.jcraft.jsch.jce.DH */
/* loaded from: classes.dex */
public class C0705DH implements InterfaceC0700DH {

    /* renamed from: K */
    BigInteger f3799K;
    byte[] K_array;

    /* renamed from: e */
    BigInteger f3800e;
    byte[] e_array;

    /* renamed from: f */
    BigInteger f3801f;

    /* renamed from: g */
    BigInteger f3802g;
    private KeyAgreement myKeyAgree;
    private KeyPairGenerator myKpairGen;

    /* renamed from: p */
    BigInteger f3803p;

    @Override // com.jcraft.jsch.InterfaceC0700DH
    public void checkRange() {
    }

    @Override // com.jcraft.jsch.InterfaceC0700DH
    public byte[] getE() {
        if (this.f3800e == null) {
            this.myKpairGen.initialize(new DHParameterSpec(this.f3803p, this.f3802g));
            KeyPair generateKeyPair = this.myKpairGen.generateKeyPair();
            this.myKeyAgree.init(generateKeyPair.getPrivate());
            BigInteger y2 = ((DHPublicKey) generateKeyPair.getPublic()).getY();
            this.f3800e = y2;
            this.e_array = y2.toByteArray();
        }
        return this.e_array;
    }

    @Override // com.jcraft.jsch.InterfaceC0700DH
    public byte[] getK() {
        if (this.f3799K == null) {
            this.myKeyAgree.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.f3801f, this.f3803p, this.f3802g)), true);
            byte[] generateSecret = this.myKeyAgree.generateSecret();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            this.f3799K = bigInteger;
            bigInteger.toByteArray();
            this.K_array = generateSecret;
        }
        return this.K_array;
    }

    @Override // com.jcraft.jsch.InterfaceC0700DH
    public void init() {
        this.myKpairGen = KeyPairGenerator.getInstance("DH");
        this.myKeyAgree = KeyAgreement.getInstance("DH");
    }

    @Override // com.jcraft.jsch.InterfaceC0700DH
    public void setF(byte[] bArr) {
        setF(new BigInteger(1, bArr));
    }

    @Override // com.jcraft.jsch.InterfaceC0700DH
    public void setG(byte[] bArr) {
        setG(new BigInteger(1, bArr));
    }

    @Override // com.jcraft.jsch.InterfaceC0700DH
    public void setP(byte[] bArr) {
        setP(new BigInteger(1, bArr));
    }

    private void checkRange(BigInteger bigInteger) {
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger subtract = this.f3803p.subtract(bigInteger2);
        if (bigInteger2.compareTo(bigInteger) >= 0 || bigInteger.compareTo(subtract) >= 0) {
            throw new JSchException("invalid DH value");
        }
    }

    public void setF(BigInteger bigInteger) {
        this.f3801f = bigInteger;
    }

    public void setG(BigInteger bigInteger) {
        this.f3802g = bigInteger;
    }

    public void setP(BigInteger bigInteger) {
        this.f3803p = bigInteger;
    }
}
