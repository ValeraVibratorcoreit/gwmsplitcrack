package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import com.sun.jna.Function;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;

/* loaded from: classes.dex */
public class SignatureDSA implements com.jcraft.jsch.SignatureDSA {
    KeyFactory keyFactory;
    Signature signature;

    @Override // com.jcraft.jsch.Signature
    public void init() {
        this.signature = Signature.getInstance("SHA1withDSA");
        this.keyFactory = KeyFactory.getInstance("DSA");
    }

    public byte[] normalize(byte[] bArr) {
        if (bArr.length <= 1 || bArr[0] != 0 || (bArr[1] & 128) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return normalize(bArr2);
    }

    @Override // com.jcraft.jsch.SignatureDSA
    public void setPrvKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.signature.initSign(this.keyFactory.generatePrivate(new DSAPrivateKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // com.jcraft.jsch.SignatureDSA
    public void setPubKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.signature.initVerify(this.keyFactory.generatePublic(new DSAPublicKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // com.jcraft.jsch.Signature
    public byte[] sign() {
        byte[] sign = this.signature.sign();
        int i = sign[3] & Function.USE_VARARGS;
        byte[] bArr = new byte[i];
        System.arraycopy(sign, 4, bArr, 0, i);
        int i2 = sign[i + 5] & Function.USE_VARARGS;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(sign, i + 6, bArr2, 0, i2);
        byte[] bArr3 = new byte[40];
        int i3 = i > 20 ? 1 : 0;
        int i4 = i > 20 ? 0 : 20 - i;
        if (i > 20) {
            i = 20;
        }
        System.arraycopy(bArr, i3, bArr3, i4, i);
        int i5 = i2 > 20 ? 1 : 0;
        int i6 = i2 > 20 ? 20 : 40 - i2;
        if (i2 > 20) {
            i2 = 20;
        }
        System.arraycopy(bArr2, i5, bArr3, i6, i2);
        return bArr3;
    }

    @Override // com.jcraft.jsch.Signature
    public void update(byte[] bArr) {
        this.signature.update(bArr);
    }

    @Override // com.jcraft.jsch.Signature
    public boolean verify(byte[] bArr) {
        Buffer buffer = new Buffer(bArr);
        if (new String(buffer.getString()).equals("ssh-dss")) {
            int i = buffer.getInt();
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, buffer.getOffSet(), bArr2, 0, i);
            bArr = bArr2;
        }
        byte[] bArr3 = new byte[20];
        System.arraycopy(bArr, 0, bArr3, 0, 20);
        byte[] normalize = normalize(bArr3);
        byte[] bArr4 = new byte[20];
        System.arraycopy(bArr, 20, bArr4, 0, 20);
        byte[] normalize2 = normalize(bArr4);
        byte b2 = (normalize[0] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte b3 = (normalize2[0] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte[] bArr5 = new byte[normalize.length + normalize2.length + 6 + b2 + b3];
        bArr5[0] = 48;
        byte length = (byte) (normalize.length + normalize2.length + 4);
        bArr5[1] = length;
        byte b4 = (byte) (length + b2);
        bArr5[1] = b4;
        bArr5[1] = (byte) (b4 + b3);
        bArr5[2] = 2;
        byte length2 = (byte) normalize.length;
        bArr5[3] = length2;
        bArr5[3] = (byte) (length2 + b2);
        System.arraycopy(normalize, 0, bArr5, b2 + 4, normalize.length);
        bArr5[bArr5[3] + 4] = 2;
        bArr5[bArr5[3] + 5] = (byte) normalize2.length;
        int i2 = bArr5[3] + 5;
        bArr5[i2] = (byte) (bArr5[i2] + b3);
        System.arraycopy(normalize2, 0, bArr5, bArr5[3] + 6 + b3, normalize2.length);
        return this.signature.verify(bArr5);
    }
}
