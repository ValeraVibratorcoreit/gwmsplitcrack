package com.jcraft.jsch;

import com.sun.jna.Function;

/* loaded from: classes.dex */
public class KeyPairECDSA extends KeyPair {
    private int key_size;
    private byte[] name;
    private byte[] prv_array;
    private byte[] r_array;
    private byte[] s_array;
    private static byte[][] oids = {new byte[]{6, 8, 42, -122, 72, -50, 61, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};
    private static String[] names = {"nistp256", "nistp384", "nistp521"};
    private static final byte[] begin = Util.str2byte("-----BEGIN EC PRIVATE KEY-----");
    private static final byte[] end = Util.str2byte("-----END EC PRIVATE KEY-----");

    public KeyPairECDSA(JSch jSch) {
        this(jSch, null, null, null, null);
    }

    public static byte[][] fromPoint(byte[] bArr) {
        int i = 0;
        while (bArr[i] != 4) {
            i++;
        }
        int i2 = i + 1;
        int length = (bArr.length - i2) / 2;
        byte[] bArr2 = new byte[length];
        int length2 = (bArr.length - i2) / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, i2, bArr2, 0, length);
        System.arraycopy(bArr, i2 + length, bArr3, 0, length2);
        return new byte[][]{bArr2, bArr3};
    }

    public static KeyPair fromSSHAgent(JSch jSch, Buffer buffer) {
        byte[][] bytes = buffer.getBytes(5, "invalid key format");
        byte[] bArr = bytes[1];
        byte[][] fromPoint = fromPoint(bytes[2]);
        KeyPairECDSA keyPairECDSA = new KeyPairECDSA(jSch, bArr, fromPoint[0], fromPoint[1], bytes[3]);
        keyPairECDSA.publicKeyComment = new String(bytes[4]);
        keyPairECDSA.vendor = 0;
        return keyPairECDSA;
    }

    public static byte[] toPoint(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + 1 + bArr2.length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        return bArr3;
    }

    @Override // com.jcraft.jsch.KeyPair
    public void dispose() {
        super.dispose();
        Util.bzero(this.prv_array);
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] forSSHAgent() {
        if (isEncrypted()) {
            throw new JSchException("key is encrypted.");
        }
        Buffer buffer = new Buffer();
        buffer.putString(Util.str2byte("ecdsa-sha2-".concat(new String(this.name))));
        buffer.putString(this.name);
        buffer.putString(toPoint(this.r_array, this.s_array));
        buffer.putString(this.prv_array);
        buffer.putString(Util.str2byte(this.publicKeyComment));
        int length = buffer.getLength();
        byte[] bArr = new byte[length];
        buffer.getByte(bArr, 0, length);
        return bArr;
    }

    @Override // com.jcraft.jsch.KeyPair
    public void generate(int i) {
        this.key_size = i;
        try {
            KeyPairGenECDSA keyPairGenECDSA = (KeyPairGenECDSA) Class.forName(JSch.getConfig("keypairgen.ecdsa")).newInstance();
            keyPairGenECDSA.init(i);
            this.prv_array = keyPairGenECDSA.getD();
            this.r_array = keyPairGenECDSA.getR();
            this.s_array = keyPairGenECDSA.getS();
            String[] strArr = names;
            byte[] bArr = this.prv_array;
            this.name = Util.str2byte(strArr[bArr.length >= 64 ? (char) 2 : bArr.length >= 48 ? (char) 1 : (char) 0]);
        } catch (Exception e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getBegin() {
        return begin;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getEnd() {
        return end;
    }

    @Override // com.jcraft.jsch.KeyPair
    public int getKeySize() {
        return this.key_size;
    }

    @Override // com.jcraft.jsch.KeyPair
    public int getKeyType() {
        return 3;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getKeyTypeName() {
        return Util.str2byte("ecdsa-sha2-".concat(new String(this.name)));
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPrivateKey() {
        byte[] bArr = {1};
        byte[][] bArr2 = oids;
        byte[] bArr3 = this.r_array;
        byte[] bArr4 = bArr2[bArr3.length >= 64 ? (char) 2 : bArr3.length >= 48 ? (char) 1 : (char) 0];
        byte[] point = toPoint(bArr3, this.s_array);
        int i = ((point.length + 1) & 128) == 0 ? 3 : 4;
        int length = point.length + i;
        byte[] bArr5 = new byte[length];
        System.arraycopy(point, 0, bArr5, i, point.length);
        bArr5[0] = 3;
        if (i == 3) {
            bArr5[1] = (byte) (point.length + 1);
        } else {
            bArr5[1] = -127;
            bArr5[2] = (byte) (point.length + 1);
        }
        int countLength = countLength(length) + countLength(bArr4.length) + countLength(this.prv_array.length) + countLength(1) + 3 + this.prv_array.length + 1 + bArr4.length + 1 + length;
        byte[] bArr6 = new byte[countLength(countLength) + 1 + countLength];
        writeDATA(bArr6, (byte) -95, writeDATA(bArr6, (byte) -96, writeOCTETSTRING(bArr6, writeINTEGER(bArr6, writeSEQUENCE(bArr6, 0, countLength), bArr), this.prv_array), bArr4), bArr5);
        return bArr6;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPublicKeyBlob() {
        byte[] publicKeyBlob = super.getPublicKeyBlob();
        if (publicKeyBlob != null) {
            return publicKeyBlob;
        }
        if (this.r_array == null) {
            return null;
        }
        byte[] str2byte = Util.str2byte("ecdsa-sha2-".concat(new String(this.name)));
        byte[] bArr = this.name;
        byte[] bArr2 = this.r_array;
        byte[][] bArr3 = {str2byte, bArr, new byte[bArr2.length + 1 + this.s_array.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.s_array;
        System.arraycopy(bArr5, 0, bArr3[2], this.r_array.length + 1, bArr5.length);
        return Buffer.fromBytes(bArr3).buffer;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getSignature(byte[] bArr) {
        try {
            SignatureECDSA signatureECDSA = (SignatureECDSA) Class.forName(JSch.getConfig("ecdsa-sha2-".concat(new String(this.name)))).newInstance();
            signatureECDSA.init();
            signatureECDSA.setPrvKey(this.prv_array);
            signatureECDSA.update(bArr);
            return Buffer.fromBytes(new byte[][]{Util.str2byte("ecdsa-sha2-".concat(new String(this.name))), signatureECDSA.sign()}).buffer;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public Signature getVerifier() {
        try {
            SignatureECDSA signatureECDSA = (SignatureECDSA) Class.forName(JSch.getConfig("ecdsa-sha2-".concat(new String(this.name)))).newInstance();
            signatureECDSA.init();
            if (this.r_array == null && this.s_array == null && getPublicKeyBlob() != null) {
                Buffer buffer = new Buffer(getPublicKeyBlob());
                buffer.getString();
                buffer.getString();
                byte[][] fromPoint = fromPoint(buffer.getString());
                this.r_array = fromPoint[0];
                this.s_array = fromPoint[1];
            }
            signatureECDSA.setPubKey(this.r_array, this.s_array);
            return signatureECDSA;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public boolean parse(byte[] bArr) {
        int i;
        try {
            int i2 = this.vendor;
            if (i2 == 1 || i2 == 2 || bArr[0] != 48) {
                return false;
            }
            byte b2 = bArr[1];
            if ((b2 & 128) != 0) {
                int i3 = b2 & Byte.MAX_VALUE;
                i = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    int i5 = i + 1;
                    byte b3 = bArr[i];
                    i = i5;
                    i3 = i4;
                }
            } else {
                i = 2;
            }
            if (bArr[i] != 2) {
                return false;
            }
            int i6 = i + 1;
            int i7 = i + 2;
            int i8 = bArr[i6];
            int i9 = i8 & Function.USE_VARARGS;
            if ((i8 & 128) != 0) {
                int i10 = i8 & 127;
                i9 = 0;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    int i12 = (i9 << 8) + (bArr[i7] & Function.USE_VARARGS);
                    i7++;
                    i9 = i12;
                    i10 = i11;
                }
            }
            int i13 = i7 + i9;
            int i14 = i13 + 1;
            int i15 = i13 + 2;
            int i16 = bArr[i14];
            int i17 = i16 & Function.USE_VARARGS;
            if ((i16 & 128) != 0) {
                int i18 = i16 & 127;
                i17 = 0;
                while (true) {
                    int i19 = i18 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    int i20 = (i17 << 8) + (bArr[i15] & Function.USE_VARARGS);
                    i15++;
                    i17 = i20;
                    i18 = i19;
                }
            }
            byte[] bArr2 = new byte[i17];
            this.prv_array = bArr2;
            System.arraycopy(bArr, i15, bArr2, 0, i17);
            int i21 = i15 + i17;
            int i22 = i21 + 1;
            int i23 = i21 + 2;
            int i24 = bArr[i22];
            int i25 = i24 & Function.USE_VARARGS;
            if ((i24 & 128) != 0) {
                int i26 = i24 & 127;
                i25 = 0;
                while (true) {
                    int i27 = i26 - 1;
                    if (i26 <= 0) {
                        break;
                    }
                    int i28 = (i25 << 8) + (bArr[i23] & Function.USE_VARARGS);
                    i23++;
                    i25 = i28;
                    i26 = i27;
                }
            }
            byte[] bArr3 = new byte[i25];
            System.arraycopy(bArr, i23, bArr3, 0, i25);
            int i29 = i23 + i25;
            int i30 = 0;
            while (true) {
                byte[][] bArr4 = oids;
                if (i30 >= bArr4.length) {
                    break;
                }
                if (Util.array_equals(bArr4[i30], bArr3)) {
                    this.name = Util.str2byte(names[i30]);
                    break;
                }
                i30++;
            }
            int i31 = i29 + 1;
            int i32 = i29 + 2;
            int i33 = bArr[i31];
            int i34 = i33 & Function.USE_VARARGS;
            if ((i33 & 128) != 0) {
                int i35 = i33 & 127;
                i34 = 0;
                while (true) {
                    int i36 = i35 - 1;
                    if (i35 <= 0) {
                        break;
                    }
                    int i37 = (i34 << 8) + (bArr[i32] & Function.USE_VARARGS);
                    i32++;
                    i34 = i37;
                    i35 = i36;
                }
            }
            byte[] bArr5 = new byte[i34];
            System.arraycopy(bArr, i32, bArr5, 0, i34);
            byte[][] fromPoint = fromPoint(bArr5);
            this.r_array = fromPoint[0];
            this.s_array = fromPoint[1];
            byte[] bArr6 = this.prv_array;
            if (bArr6 != null) {
                this.key_size = bArr6.length >= 64 ? 521 : bArr6.length >= 48 ? 384 : Function.MAX_NARGS;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public KeyPairECDSA(JSch jSch, byte[] bArr) {
        this(jSch, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            if (Util.array_equals(bArr2, Util.str2byte("nistp384"))) {
                this.key_size = 384;
                this.name = bArr2;
            }
            if (Util.array_equals(bArr2, Util.str2byte("nistp521"))) {
                this.key_size = 521;
                this.name = bArr2;
            }
        }
    }

    public KeyPairECDSA(JSch jSch, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(jSch);
        this.name = Util.str2byte(names[0]);
        int i = Function.MAX_NARGS;
        this.key_size = Function.MAX_NARGS;
        if (bArr != null) {
            this.name = bArr;
        }
        this.r_array = bArr2;
        this.s_array = bArr3;
        this.prv_array = bArr4;
        if (bArr4 != null) {
            if (bArr4.length >= 64) {
                i = 521;
            } else if (bArr4.length >= 48) {
                i = 384;
            }
            this.key_size = i;
        }
    }
}
