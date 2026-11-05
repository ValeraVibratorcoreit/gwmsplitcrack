package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.SignatureECDSA;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes.dex */
public abstract class SignatureECDSAN implements SignatureECDSA {
    KeyFactory keyFactory;
    Signature signature;

    private void bzero(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private byte[] chop0(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        bzero(bArr);
        return bArr2;
    }

    private byte[] insert0(byte[] bArr) {
        if ((bArr[0] & 128) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        bzero(bArr);
        return bArr2;
    }

    public abstract String getName();

    @Override // com.jcraft.jsch.Signature
    public void init() {
        String name = getName();
        this.signature = Signature.getInstance(name.equals("ecdsa-sha2-nistp384") ? "SHA384withECDSA" : name.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA");
        this.keyFactory = KeyFactory.getInstance("EC");
    }

    @Override // com.jcraft.jsch.SignatureECDSA
    public void setPrvKey(byte[] bArr) {
        byte[] insert0 = insert0(bArr);
        String str = insert0.length >= 64 ? "secp521r1" : insert0.length >= 48 ? "secp384r1" : "secp256r1";
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.signature.initSign(this.keyFactory.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, insert0), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // com.jcraft.jsch.SignatureECDSA
    public void setPubKey(byte[] bArr, byte[] bArr2) {
        byte[] insert0 = insert0(bArr);
        byte[] insert02 = insert0(bArr2);
        String str = insert0.length >= 64 ? "secp521r1" : insert0.length >= 48 ? "secp384r1" : "secp256r1";
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.signature.initVerify(this.keyFactory.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, insert0), new BigInteger(1, insert02)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // com.jcraft.jsch.Signature
    public byte[] sign() {
        byte[] sign = this.signature.sign();
        if (sign[0] != '0') {
            return sign;
        }
        int i = sign[1];
        int i2 = 3;
        if (i + 2 != sign.length && ((i & 128) == 0 || (sign[2] & 255) + 3 != sign.length)) {
            return sign;
        }
        if ((i & 128) != 0 && (sign[2] & 255) + 3 == sign.length) {
            i2 = 4;
        }
        int i3 = sign[i2];
        byte[] bArr = new byte[i3];
        int i4 = sign[i2 + 2 + i3];
        byte[] bArr2 = new byte[i4];
        System.arraycopy(sign, i2 + 1, bArr, 0, i3);
        System.arraycopy(sign, i2 + 3 + sign[i2], bArr2, 0, i4);
        byte[] chop0 = chop0(bArr);
        byte[] chop02 = chop0(bArr2);
        Buffer buffer = new Buffer();
        buffer.putMPInt(chop0);
        buffer.putMPInt(chop02);
        byte[] bArr3 = new byte[buffer.getLength()];
        buffer.setOffSet(0);
        buffer.getByte(bArr3);
        return bArr3;
    }

    @Override // com.jcraft.jsch.Signature
    public void update(byte[] bArr) {
        this.signature.update(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (((r11[2] & 255) + 3) != r11.length) goto L10;
     */
    @Override // com.jcraft.jsch.Signature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verify(byte[] bArr) {
        byte[] bArr2;
        if (bArr[0] == 48) {
            byte b2 = bArr[1];
            if (b2 + 2 != bArr.length) {
                if ((b2 & 128) != 0) {
                }
            }
            return this.signature.verify(bArr);
        }
        Buffer buffer = new Buffer(bArr);
        buffer.getString();
        buffer.getInt();
        byte[] mPInt = buffer.getMPInt();
        byte[] mPInt2 = buffer.getMPInt();
        byte[] insert0 = insert0(mPInt);
        byte[] insert02 = insert0(mPInt2);
        if (insert0.length < 64) {
            bArr2 = new byte[insert0.length + 6 + insert02.length];
            bArr2[0] = 48;
            bArr2[1] = (byte) (insert0.length + 4 + insert02.length);
            bArr2[2] = 2;
            bArr2[3] = (byte) insert0.length;
            System.arraycopy(insert0, 0, bArr2, 4, insert0.length);
            bArr2[insert0.length + 4] = 2;
            bArr2[insert0.length + 5] = (byte) insert02.length;
            System.arraycopy(insert02, 0, bArr2, insert0.length + 6, insert02.length);
        } else {
            bArr2 = new byte[insert0.length + 6 + insert02.length + 1];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) (insert0.length + 4 + insert02.length);
            bArr2[3] = 2;
            bArr2[4] = (byte) insert0.length;
            System.arraycopy(insert0, 0, bArr2, 5, insert0.length);
            bArr2[insert0.length + 5] = 2;
            bArr2[insert0.length + 6] = (byte) insert02.length;
            System.arraycopy(insert02, 0, bArr2, insert0.length + 7, insert02.length);
        }
        bArr = bArr2;
        return this.signature.verify(bArr);
    }
}
