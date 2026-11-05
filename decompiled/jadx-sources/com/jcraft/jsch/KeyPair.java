package com.jcraft.jsch;

import com.sun.jna.Function;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public abstract class KeyPair {
    public static final int DSA = 1;
    public static final int ECDSA = 3;
    public static final int ERROR = 0;
    public static final int RSA = 2;
    public static final int UNKNOWN = 4;
    static final int VENDOR_FSECURE = 1;
    static final int VENDOR_OPENSSH = 0;
    static final int VENDOR_PKCS8 = 3;
    static final int VENDOR_PUTTY = 2;
    private Cipher cipher;
    private HASH hash;
    JSch jsch;
    private byte[] passphrase;
    private Random random;

    /* renamed from: cr */
    private static final byte[] f3789cr = Util.str2byte("\n");
    static byte[][] header = {Util.str2byte("Proc-Type: 4,ENCRYPTED"), Util.str2byte("DEK-Info: DES-EDE3-CBC,")};
    private static byte[] space = Util.str2byte(" ");
    private static final String[] header1 = {"PuTTY-User-Key-File-2: ", "Encryption: ", "Comment: ", "Public-Lines: "};
    private static final String[] header2 = {"Private-Lines: "};
    private static final String[] header3 = {"Private-MAC: "};
    int vendor = 0;
    protected String publicKeyComment = "no comment";
    protected boolean encrypted = false;
    protected byte[] data = null;

    /* renamed from: iv */
    private byte[] f3790iv = null;
    private byte[] publickeyblob = null;

    public class ASN1 {
        byte[] buf;
        int length;
        int start;

        public ASN1(KeyPair keyPair, byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        private int getLength(int[] iArr) {
            int i = iArr[0];
            int i2 = i + 1;
            byte b2 = this.buf[i];
            int i3 = b2 & 255;
            if ((b2 & 128) != 0) {
                int i4 = b2 & Byte.MAX_VALUE;
                i3 = 0;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    i3 = (this.buf[i2] & 255) + (i3 << 8);
                    i4 = i5;
                    i2++;
                }
            }
            iArr[0] = i2;
            return i3;
        }

        public byte[] getContent() {
            int[] iArr = {this.start + 1};
            int length = getLength(iArr);
            byte[] bArr = new byte[length];
            System.arraycopy(this.buf, iArr[0], bArr, 0, length);
            return bArr;
        }

        public ASN1[] getContents() {
            byte[] bArr = this.buf;
            int i = this.start;
            byte b2 = bArr[i];
            int[] iArr = {i + 1};
            int length = getLength(iArr);
            if (b2 == 5) {
                return new ASN1[0];
            }
            int i2 = iArr[0];
            Vector vector = new Vector();
            while (length > 0) {
                int i3 = i2 + 1;
                iArr[0] = i3;
                int length2 = getLength(iArr);
                int i4 = iArr[0];
                int i5 = i4 - i3;
                vector.addElement(KeyPair.this.new ASN1(this.buf, i2, i5 + 1 + length2));
                i2 = i4 + length2;
                length = ((length - 1) - i5) - length2;
            }
            ASN1[] asn1Arr = new ASN1[vector.size()];
            for (int i6 = 0; i6 < vector.size(); i6++) {
                asn1Arr[i6] = (ASN1) vector.elementAt(i6);
            }
            return asn1Arr;
        }

        public int getType() {
            return this.buf[this.start] & 255;
        }

        public boolean isINTEGER() {
            return getType() == 2;
        }

        public boolean isOBJECT() {
            return getType() == 6;
        }

        public boolean isOCTETSTRING() {
            return getType() == 4;
        }

        public boolean isSEQUENCE() {
            return getType() == 48;
        }

        public ASN1(byte[] bArr, int i, int i2) {
            this.buf = bArr;
            this.start = i;
            this.length = i2;
            if (i + i2 > bArr.length) {
                throw KeyPair.this.new ASN1Exception();
            }
        }
    }

    public class ASN1Exception extends Exception {
        public ASN1Exception() {
        }
    }

    public KeyPair(JSch jSch) {
        this.jsch = jSch;
    }

    private static byte a2b(byte b2) {
        return (byte) ((48 > b2 || b2 > 57) ? b2 - 87 : b2 - 48);
    }

    private static byte b2a(byte b2) {
        return (byte) ((b2 < 0 || b2 > 9) ? b2 + 55 : b2 + 48);
    }

    private byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] genKey = genKey(bArr2, bArr3);
            this.cipher.init(1, genKey, bArr3);
            Util.bzero(genKey);
            byte[] bArr4 = new byte[bArr.length];
            this.cipher.update(bArr, 0, bArr.length, bArr4, 0);
            return bArr4;
        } catch (Exception unused) {
            return null;
        }
    }

    private byte[] encrypt(byte[] bArr, byte[][] bArr2, byte[] bArr3) {
        if (bArr3 == null) {
            return bArr;
        }
        if (this.cipher == null) {
            this.cipher = genCipher();
        }
        int iVSize = this.cipher.getIVSize();
        byte[] bArr4 = new byte[iVSize];
        bArr2[0] = bArr4;
        if (this.random == null) {
            this.random = genRandom();
        }
        this.random.fill(bArr4, 0, iVSize);
        byte[] genKey = genKey(bArr3, bArr4);
        int iVSize2 = this.cipher.getIVSize();
        int length = ((bArr.length / iVSize2) + 1) * iVSize2;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length2 = iVSize2 - (bArr.length % iVSize2);
        for (int i = length - 1; length - length2 <= i; i--) {
            bArr5[i] = (byte) length2;
        }
        try {
            this.cipher.init(0, genKey, bArr4);
            this.cipher.update(bArr5, 0, length, bArr5, 0);
        } catch (Exception unused) {
        }
        Util.bzero(genKey);
        return bArr5;
    }

    private Cipher genCipher() {
        try {
            this.cipher = (Cipher) Class.forName(JSch.getConfig("3des-cbc")).newInstance();
        } catch (Exception unused) {
        }
        return this.cipher;
    }

    private HASH genHash() {
        try {
            HASH hash = (HASH) Class.forName(JSch.getConfig("md5")).newInstance();
            this.hash = hash;
            hash.init();
        } catch (Exception unused) {
        }
        return this.hash;
    }

    public static KeyPair genKeyPair(JSch jSch, int i) {
        return genKeyPair(jSch, i, 1024);
    }

    private Random genRandom() {
        if (this.random == null) {
            try {
                this.random = (Random) Class.forName(JSch.getConfig("random")).newInstance();
            } catch (Exception e2) {
                System.err.println("connect: random " + e2);
            }
        }
        return this.random;
    }

    public static KeyPair load(JSch jSch, String str) {
        String m160n = AbstractC0062j.m160n(str, ".pub");
        if (!new File(m160n).exists()) {
            m160n = null;
        }
        return load(jSch, str, m160n);
    }

    public static KeyPair loadPPK(JSch jSch, byte[] bArr) {
        KeyPair keyPairDSA;
        Buffer buffer = new Buffer(bArr);
        Hashtable hashtable = new Hashtable();
        while (parseHeader(buffer, hashtable)) {
        }
        String str = (String) hashtable.get("PuTTY-User-Key-File-2");
        if (str == null) {
            return null;
        }
        byte[] parseLines = parseLines(buffer, Integer.parseInt((String) hashtable.get("Public-Lines")));
        while (parseHeader(buffer, hashtable)) {
        }
        byte[] parseLines2 = parseLines(buffer, Integer.parseInt((String) hashtable.get("Private-Lines")));
        while (parseHeader(buffer, hashtable)) {
        }
        byte[] fromBase64 = Util.fromBase64(parseLines2, 0, parseLines2.length);
        byte[] fromBase642 = Util.fromBase64(parseLines, 0, parseLines.length);
        if (str.equals("ssh-rsa")) {
            Buffer buffer2 = new Buffer(fromBase642);
            buffer2.skip(fromBase642.length);
            buffer2.getByte(new byte[buffer2.getInt()]);
            byte[] bArr2 = new byte[buffer2.getInt()];
            buffer2.getByte(bArr2);
            byte[] bArr3 = new byte[buffer2.getInt()];
            buffer2.getByte(bArr3);
            keyPairDSA = new KeyPairRSA(jSch, bArr3, bArr2, null);
        } else {
            if (!str.equals("ssh-dss")) {
                return null;
            }
            Buffer buffer3 = new Buffer(fromBase642);
            buffer3.skip(fromBase642.length);
            buffer3.getByte(new byte[buffer3.getInt()]);
            byte[] bArr4 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr4);
            byte[] bArr5 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr5);
            byte[] bArr6 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr6);
            byte[] bArr7 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr7);
            keyPairDSA = new KeyPairDSA(jSch, bArr4, bArr5, bArr6, bArr7, null);
        }
        keyPairDSA.encrypted = !hashtable.get("Encryption").equals("none");
        keyPairDSA.vendor = 2;
        keyPairDSA.publicKeyComment = (String) hashtable.get("Comment");
        if (!keyPairDSA.encrypted) {
            keyPairDSA.data = fromBase64;
            keyPairDSA.parse(fromBase64);
        } else {
            if (!Session.checkCipher(JSch.getConfig("aes256-cbc"))) {
                throw new JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
            }
            try {
                Cipher cipher = (Cipher) Class.forName(JSch.getConfig("aes256-cbc")).newInstance();
                keyPairDSA.cipher = cipher;
                keyPairDSA.f3790iv = new byte[cipher.getIVSize()];
                keyPairDSA.data = fromBase64;
            } catch (Exception unused) {
                throw new JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
            }
        }
        return keyPairDSA;
    }

    private static boolean parseHeader(Buffer buffer, Hashtable hashtable) {
        String str;
        String str2;
        byte b2;
        byte[] bArr = buffer.buffer;
        int i = buffer.index;
        int i2 = i;
        while (true) {
            str = null;
            if (i2 >= bArr.length || (b2 = bArr[i2]) == 13) {
                break;
            }
            if (b2 == 58) {
                str2 = new String(bArr, i, i2 - i);
                i = i2 + 1;
                if (i < bArr.length && bArr[i] == 32) {
                    i = i2 + 2;
                }
            } else {
                i2++;
            }
        }
        str2 = null;
        if (str2 == null) {
            return false;
        }
        int i3 = i;
        while (true) {
            if (i3 >= bArr.length) {
                break;
            }
            if (bArr[i3] == 13) {
                str = new String(bArr, i, i3 - i);
                i = i3 + 1;
                if (i < bArr.length && bArr[i] == 10) {
                    i = i3 + 2;
                }
            } else {
                i3++;
            }
        }
        if (str != null) {
            hashtable.put(str2, str);
            buffer.index = i;
        }
        return str != null;
    }

    private static byte[] parseLines(Buffer buffer, int i) {
        byte[] bArr;
        byte[] bArr2 = buffer.buffer;
        int i2 = buffer.index;
        byte[] bArr3 = null;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                break;
            }
            int i4 = i2;
            while (true) {
                if (bArr2.length <= i4) {
                    break;
                }
                int i5 = i4 + 1;
                if (bArr2[i4] == 13) {
                    if (bArr3 == null) {
                        int i6 = (i5 - i2) - 1;
                        bArr = new byte[i6];
                        System.arraycopy(bArr2, i2, bArr, 0, i6);
                    } else {
                        bArr = new byte[((bArr3.length + i5) - i2) - 1];
                        System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                        System.arraycopy(bArr2, i2, bArr, bArr3.length, (i5 - i2) - 1);
                        for (int i7 = 0; i7 < bArr3.length; i7++) {
                            bArr3[i7] = 0;
                        }
                    }
                    i4 = i5;
                    bArr3 = bArr;
                } else {
                    i4 = i5;
                }
            }
            if (bArr2[i4] == 10) {
                i4++;
            }
            i2 = i4;
            i = i3;
        }
        if (bArr3 != null) {
            buffer.index = i2;
        }
        return bArr3;
    }

    public void copy(KeyPair keyPair) {
        this.publickeyblob = keyPair.publickeyblob;
        this.vendor = keyPair.vendor;
        this.publicKeyComment = keyPair.publicKeyComment;
        this.cipher = keyPair.cipher;
    }

    public int countLength(int i) {
        int i2 = 1;
        if (i <= 127) {
            return 1;
        }
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }

    public void dispose() {
        Util.bzero(this.passphrase);
    }

    public void finalize() {
        dispose();
    }

    public abstract byte[] forSSHAgent();

    public synchronized byte[] genKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        try {
            if (this.cipher == null) {
                this.cipher = genCipher();
            }
            if (this.hash == null) {
                this.hash = genHash();
            }
            int blockSize = this.cipher.getBlockSize();
            bArr3 = new byte[blockSize];
            int blockSize2 = this.hash.getBlockSize();
            int i = ((blockSize / blockSize2) * blockSize2) + (blockSize % blockSize2 == 0 ? 0 : blockSize2);
            byte[] bArr4 = new byte[i];
            try {
                int i2 = this.vendor;
                byte[] bArr5 = null;
                if (i2 == 0) {
                    int i3 = 0;
                    while (i3 + blockSize2 <= i) {
                        if (bArr5 != null) {
                            this.hash.update(bArr5, 0, bArr5.length);
                        }
                        this.hash.update(bArr, 0, bArr.length);
                        HASH hash = this.hash;
                        int i4 = 8;
                        if (bArr2.length <= 8) {
                            i4 = bArr2.length;
                        }
                        hash.update(bArr2, 0, i4);
                        bArr5 = this.hash.digest();
                        System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                        i3 += bArr5.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i2 == 1) {
                    int i5 = 0;
                    while (i5 + blockSize2 <= i) {
                        if (bArr5 != null) {
                            this.hash.update(bArr5, 0, bArr5.length);
                        }
                        this.hash.update(bArr, 0, bArr.length);
                        bArr5 = this.hash.digest();
                        System.arraycopy(bArr5, 0, bArr4, i5, bArr5.length);
                        i5 += bArr5.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i2 == 2) {
                    HASH hash2 = (HASH) Class.forName(JSch.getConfig("sha-1")).newInstance();
                    byte[] bArr6 = new byte[4];
                    bArr3 = new byte[40];
                    for (int i6 = 0; i6 < 2; i6++) {
                        hash2.init();
                        bArr6[3] = (byte) i6;
                        hash2.update(bArr6, 0, 4);
                        hash2.update(bArr, 0, bArr.length);
                        System.arraycopy(hash2.digest(), 0, bArr3, i6 * 20, 20);
                    }
                }
            } catch (Exception e2) {
                System.err.println(e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bArr3;
    }

    public abstract void generate(int i);

    public abstract byte[] getBegin();

    public abstract byte[] getEnd();

    public String getFingerPrint() {
        if (this.hash == null) {
            this.hash = genHash();
        }
        byte[] publicKeyBlob = getPublicKeyBlob();
        if (publicKeyBlob == null) {
            return null;
        }
        return Util.getFingerPrint(this.hash, publicKeyBlob);
    }

    public abstract int getKeySize();

    public abstract int getKeyType();

    public abstract byte[] getKeyTypeName();

    public abstract byte[] getPrivateKey();

    public byte[] getPublicKeyBlob() {
        return this.publickeyblob;
    }

    public String getPublicKeyComment() {
        return this.publicKeyComment;
    }

    public abstract byte[] getSignature(byte[] bArr);

    public abstract Signature getVerifier();

    public boolean isEncrypted() {
        return this.encrypted;
    }

    public abstract boolean parse(byte[] bArr);

    public void setPassphrase(String str) {
        if (str == null || str.length() == 0) {
            setPassphrase((byte[]) null);
        } else {
            setPassphrase(Util.str2byte(str));
        }
    }

    public void setPublicKeyComment(String str) {
        this.publicKeyComment = str;
    }

    public int writeDATA(byte[] bArr, byte b2, int i, byte[] bArr2) {
        bArr[i] = b2;
        int writeLength = writeLength(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, writeLength, bArr2.length);
        return writeLength + bArr2.length;
    }

    public int writeINTEGER(byte[] bArr, int i, byte[] bArr2) {
        bArr[i] = 2;
        int writeLength = writeLength(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, writeLength, bArr2.length);
        return writeLength + bArr2.length;
    }

    public int writeLength(byte[] bArr, int i, int i2) {
        int countLength = countLength(i2) - 1;
        if (countLength == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        bArr[i] = (byte) (countLength | 128);
        int i4 = i + 1 + countLength;
        while (countLength > 0) {
            bArr[(r1 + countLength) - 1] = (byte) (i2 & Function.USE_VARARGS);
            i2 >>>= 8;
            countLength--;
        }
        return i4;
    }

    public int writeOCTETSTRING(byte[] bArr, int i, byte[] bArr2) {
        bArr[i] = 4;
        int writeLength = writeLength(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, writeLength, bArr2.length);
        return writeLength + bArr2.length;
    }

    public void writePrivateKey(OutputStream outputStream) {
        writePrivateKey(outputStream, (byte[]) null);
    }

    public void writePublicKey(OutputStream outputStream, String str) {
        byte[] publicKeyBlob = getPublicKeyBlob();
        byte[] base64 = Util.toBase64(publicKeyBlob, 0, publicKeyBlob.length);
        try {
            outputStream.write(getKeyTypeName());
            outputStream.write(space);
            outputStream.write(base64, 0, base64.length);
            outputStream.write(space);
            outputStream.write(Util.str2byte(str));
            outputStream.write(f3789cr);
        } catch (Exception unused) {
        }
    }

    public void writeSECSHPublicKey(OutputStream outputStream, String str) {
        byte[] publicKeyBlob = getPublicKeyBlob();
        int i = 0;
        byte[] base64 = Util.toBase64(publicKeyBlob, 0, publicKeyBlob.length);
        try {
            outputStream.write(Util.str2byte("---- BEGIN SSH2 PUBLIC KEY ----"));
            byte[] bArr = f3789cr;
            outputStream.write(bArr);
            outputStream.write(Util.str2byte("Comment: \"" + str + "\""));
            outputStream.write(bArr);
            while (i < base64.length) {
                int i2 = 70;
                if (base64.length - i < 70) {
                    i2 = base64.length - i;
                }
                outputStream.write(base64, i, i2);
                outputStream.write(f3789cr);
                i += i2;
            }
            outputStream.write(Util.str2byte("---- END SSH2 PUBLIC KEY ----"));
            outputStream.write(f3789cr);
        } catch (Exception unused) {
        }
    }

    public int writeSEQUENCE(byte[] bArr, int i, int i2) {
        bArr[i] = 48;
        return writeLength(bArr, i + 1, i2);
    }

    public static KeyPair genKeyPair(JSch jSch, int i, int i2) {
        KeyPair keyPairDSA = i == 1 ? new KeyPairDSA(jSch) : i == 2 ? new KeyPairRSA(jSch) : i == 3 ? new KeyPairECDSA(jSch) : null;
        if (keyPairDSA != null) {
            keyPairDSA.generate(i2);
        }
        return keyPairDSA;
    }

    public void writePrivateKey(OutputStream outputStream, byte[] bArr) {
        if (bArr == null) {
            bArr = this.passphrase;
        }
        byte[] privateKey = getPrivateKey();
        byte[][] bArr2 = new byte[1][];
        byte[] encrypt = encrypt(privateKey, bArr2, bArr);
        if (encrypt != privateKey) {
            Util.bzero(privateKey);
        }
        int i = 0;
        byte[] bArr3 = bArr2[0];
        byte[] base64 = Util.toBase64(encrypt, 0, encrypt.length);
        try {
            outputStream.write(getBegin());
            byte[] bArr4 = f3789cr;
            outputStream.write(bArr4);
            if (bArr != null) {
                outputStream.write(header[0]);
                outputStream.write(bArr4);
                outputStream.write(header[1]);
                for (int i2 = 0; i2 < bArr3.length; i2++) {
                    outputStream.write(b2a((byte) ((bArr3[i2] >>> 4) & 15)));
                    outputStream.write(b2a((byte) (bArr3[i2] & 15)));
                }
                byte[] bArr5 = f3789cr;
                outputStream.write(bArr5);
                outputStream.write(bArr5);
            }
            while (true) {
                if (i >= base64.length) {
                    break;
                }
                int i3 = i + 64;
                if (i3 >= base64.length) {
                    outputStream.write(base64, i, base64.length - i);
                    outputStream.write(f3789cr);
                    break;
                } else {
                    outputStream.write(base64, i, 64);
                    outputStream.write(f3789cr);
                    i = i3;
                }
            }
            outputStream.write(getEnd());
            outputStream.write(f3789cr);
        } catch (Exception unused) {
        }
    }

    public void setPassphrase(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.passphrase = bArr;
    }

    public boolean decrypt(String str) {
        if (str != null && str.length() != 0) {
            return decrypt(Util.str2byte(str));
        }
        return !this.encrypted;
    }

    public void writePublicKey(String str, String str2) {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        writePublicKey(fileOutputStream, str2);
        fileOutputStream.close();
    }

    public boolean decrypt(byte[] bArr) {
        boolean z2 = this.encrypted;
        if (!z2) {
            return true;
        }
        if (bArr == null) {
            return !z2;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        byte[] decrypt = decrypt(this.data, bArr2, this.f3790iv);
        Util.bzero(bArr2);
        if (parse(decrypt)) {
            this.encrypted = false;
        }
        return !this.encrypted;
    }

    public void writeSECSHPublicKey(String str, String str2) {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        writeSECSHPublicKey(fileOutputStream, str2);
        fileOutputStream.close();
    }

    public static KeyPair load(JSch jSch, String str, String str2) {
        byte[] bArr;
        try {
            byte[] fromFile = Util.fromFile(str);
            try {
                bArr = Util.fromFile(str2 == null ? AbstractC0062j.m160n(str, ".pub") : str2);
            } catch (IOException e2) {
                if (str2 != null) {
                    throw new JSchException(e2.toString(), e2);
                }
                bArr = null;
            }
            try {
                return load(jSch, fromFile, bArr);
            } finally {
                Util.bzero(fromFile);
            }
        } catch (IOException e3) {
            throw new JSchException(e3.toString(), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01dc, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x03f4, code lost:
    
        if (r24 == null) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x03f6, code lost:
    
        if (r15 == 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03f8, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03f9, code lost:
    
        if (r3 >= r12) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03ff, code lost:
    
        if (r24[r3] != 45) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0402, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0406, code lost:
    
        if ((r12 - r3) == 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0408, code lost:
    
        r3 = r3 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0409, code lost:
    
        if (r3 == 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x040b, code lost:
    
        r4 = new byte[r3];
        java.lang.System.arraycopy(r24, r13, r4, 0, r3);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0412, code lost:
    
        if (r7 >= r3) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0414, code lost:
    
        r8 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0418, code lost:
    
        if (r8 != 10) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0437, code lost:
    
        if (r8 != 45) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x043a, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x043d, code lost:
    
        if (r7 <= 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x043f, code lost:
    
        r7 = com.jcraft.jsch.Util.fromBase64(r4, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0446, code lost:
    
        com.jcraft.jsch.Util.bzero(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0475, code lost:
    
        if (r7 == null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0479, code lost:
    
        if (r7.length <= 4) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0480, code lost:
    
        if (r7[0] != 63) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0487, code lost:
    
        if (r7[1] != 111) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x048d, code lost:
    
        if (r7[2] != (-7)) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0494, code lost:
    
        if (r7[3] != (-21)) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0496, code lost:
    
        r3 = new com.jcraft.jsch.Buffer(r7);
        r3.getInt();
        r3.getInt();
        r3.getString();
        r4 = com.jcraft.jsch.Util.byte2str(r3.getString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x04b2, code lost:
    
        if (r4.equals("3des-cbc") != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04ba, code lost:
    
        if (r4.equals("none") == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04bc, code lost:
    
        r3.getInt();
        r3.getInt();
        r7 = new byte[r7.length - r3.getOffSet()];
        r3.getByte(r7);
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0507, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0509, code lost:
    
        if (r25 == 0) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06a6, code lost:
    
        r8 = "";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x050b, code lost:
    
        r8 = r25.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x050e, code lost:
    
        if (r25.length <= 4) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0515, code lost:
    
        if (r25[0] != 45) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0517, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x051a, code lost:
    
        if (r25[1] != 45) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x051f, code lost:
    
        if (r25[2] != 45) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0524, code lost:
    
        if (r25[3] != 45) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0526, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0527, code lost:
    
        r9 = r9 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0529, code lost:
    
        if (r25.length <= r9) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x052f, code lost:
    
        if (r25[r9] != 10) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0532, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0539, code lost:
    
        if (r25.length > r9) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x053b, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x053e, code lost:
    
        if (r12 == false) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0544, code lost:
    
        if (r25[r9] != 10) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0546, code lost:
    
        r13 = r9 + 1;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x054a, code lost:
    
        if (r11 >= r25.length) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x054c, code lost:
    
        r14 = r25[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x054e, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0552, code lost:
    
        if (r14 != 10) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0557, code lost:
    
        if (r14 != 58) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x055a, code lost:
    
        r11 = r11 + 1;
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0565, code lost:
    
        r9 = r9 + 1;
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0561, code lost:
    
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x056d, code lost:
    
        if (r25.length > r9) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x056f, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0570, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0571, code lost:
    
        if (r12 == false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0573, code lost:
    
        if (r4 >= r8) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0575, code lost:
    
        r11 = r25[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0579, code lost:
    
        if (r11 != 10) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0589, code lost:
    
        if (r11 != 45) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x058c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x058f, code lost:
    
        if (r12 == false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0591, code lost:
    
        r4 = com.jcraft.jsch.Util.fromBase64(r25, r9, r4 - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0596, code lost:
    
        if (r24 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0599, code lost:
    
        if (r15 != 4) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x059d, code lost:
    
        r8 = r4[8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x05a1, code lost:
    
        if (r8 != 100) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x05a3, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x05a8, code lost:
    
        if (r8 != 114) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x05aa, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x057b, code lost:
    
        java.lang.System.arraycopy(r25, r4 + 1, r25, r4, (r8 - r4) - 1);
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x055f, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0563, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x056a, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x053d, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x05ad, code lost:
    
        r20 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x05b0, code lost:
    
        r9 = r25[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x05b6, code lost:
    
        if (r9 != 115(0x73, float:1.61E-43)) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x05bb, code lost:
    
        if (r25[1] != 115(0x73, float:1.61E-43)) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x05c2, code lost:
    
        if (r25[2] != 104(0x68, float:1.46E-43)) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x05c9, code lost:
    
        if (r25[3] != 45) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05cb, code lost:
    
        if (r24 != null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05cf, code lost:
    
        if (r25.length <= 7) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x05d1, code lost:
    
        r4 = r25[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05d6, code lost:
    
        if (r4 != 100) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x05d8, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05dc, code lost:
    
        if (r4 != 114(0x72, float:1.6E-43)) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x05de, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05df, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05e0, code lost:
    
        if (r4 >= r8) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x05e4, code lost:
    
        if (r25[r4] != 32) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x05e8, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x05eb, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x05ec, code lost:
    
        if (r4 >= r8) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x05ee, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05ef, code lost:
    
        if (r9 >= r8) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x05f3, code lost:
    
        if (r25[r9] != 32) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05f6, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x05ff, code lost:
    
        r22 = r9;
        r9 = com.jcraft.jsch.Util.fromBase64(r25, r4, r9 - r4);
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0606, code lost:
    
        r11 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0608, code lost:
    
        if (r4 >= r8) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x060a, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x060b, code lost:
    
        if (r4 >= r8) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0611, code lost:
    
        if (r25[r4] != 10) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0614, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0617, code lost:
    
        if (r4 <= 0) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x061f, code lost:
    
        if (r25[r4 - 1] != 13) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0621, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0623, code lost:
    
        if (r11 >= r4) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x062b, code lost:
    
        r4 = new java.lang.String(r25, r11, r4 - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x062f, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x062d, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0605, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0636, code lost:
    
        if (r9 != 101(0x65, float:1.42E-43)) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x063d, code lost:
    
        if (r25[1] != 99) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0644, code lost:
    
        if (r25[2] != 100) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0649, code lost:
    
        if (r25[3] != 115(0x73, float:1.61E-43)) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x064b, code lost:
    
        if (r24 != null) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x064f, code lost:
    
        if (r25.length <= 7) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0651, code lost:
    
        r15 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0652, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0653, code lost:
    
        if (r4 >= r8) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0657, code lost:
    
        if (r25[r4] != 32) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x065b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x065e, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x065f, code lost:
    
        if (r4 >= r8) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0661, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0662, code lost:
    
        if (r9 >= r8) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0666, code lost:
    
        if (r25[r9] != 32) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0669, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0672, code lost:
    
        r22 = r9;
        r9 = com.jcraft.jsch.Util.fromBase64(r25, r4, r9 - r4);
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0679, code lost:
    
        r11 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x067b, code lost:
    
        if (r4 >= r8) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x067d, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x067e, code lost:
    
        if (r4 >= r8) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0684, code lost:
    
        if (r25[r4] != 10) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0687, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x068a, code lost:
    
        if (r4 <= 0) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0692, code lost:
    
        if (r25[r4 - 1] != 13) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0694, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0696, code lost:
    
        if (r11 >= r4) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x069e, code lost:
    
        r20 = new java.lang.String(r25, r11, r4 - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0678, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0534, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x04cf, code lost:
    
        r3.getInt();
        r3.getByte(new byte[r7.length - r3.getOffSet()]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x04f3, code lost:
    
        throw new com.jcraft.jsch.JSchException("unknown privatekey format: " + r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0505, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0445, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0420, code lost:
    
        if (r4[r7 - 1] != 13) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0422, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0425, code lost:
    
        r9 = r7 + 1;
        java.lang.System.arraycopy(r4, r9, r4, r7 - r8, r3 - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x042e, code lost:
    
        if (r8 == 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0430, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0432, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0424, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x045e, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0473, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid privatekey: " + r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0474, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x03ea, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x03eb, code lost:
    
        if (r6 == 3) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x03ed, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06b4  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KeyPair load(JSch jSch, byte[] bArr, byte[] bArr2) {
        int i;
        char c2;
        Cipher cipher;
        byte[] bArr3;
        boolean z2;
        String str;
        byte[] bArr4;
        ?? r9;
        KeyPair keyPairPKCS8;
        byte b2;
        byte b3;
        int i2;
        byte b4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c3;
        int i9;
        byte b5;
        byte[] bArr5 = new byte[8];
        if (bArr2 == 0 && bArr != null && bArr.length > 11 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && ((b5 = bArr[3]) == 7 || b5 == 19)) {
            Buffer buffer = new Buffer(bArr);
            buffer.skip(bArr.length);
            String str2 = new String(buffer.getString());
            buffer.rewind();
            if (str2.equals("ssh-rsa")) {
                return KeyPairRSA.fromSSHAgent(jSch, buffer);
            }
            if (str2.equals("ssh-dss")) {
                return KeyPairDSA.fromSSHAgent(jSch, buffer);
            }
            if (!str2.equals("ecdsa-sha2-nistp256") && !str2.equals("ecdsa-sha2-nistp384") && !str2.equals("ecdsa-sha2-nistp521")) {
                throw new JSchException("privatekey: invalid key ".concat(new String(bArr, 4, 7)));
            }
            return KeyPairECDSA.fromSSHAgent(jSch, buffer);
        }
        if (bArr != null) {
            try {
                KeyPair loadPPK = loadPPK(jSch, bArr);
                if (loadPPK != null) {
                    return loadPPK;
                }
            } catch (Exception e2) {
                if (!(e2 instanceof JSchException)) {
                    throw new JSchException(e2.toString(), e2);
                }
                throw ((JSchException) e2);
            }
        }
        int length = bArr != null ? bArr.length : 0;
        int i10 = 0;
        while (i10 < length && (bArr[i10] != 45 || (i9 = i10 + 4) >= length || bArr[i10 + 1] != 45 || bArr[i10 + 2] != 45 || bArr[i10 + 3] != 45 || bArr[i9] != 45)) {
            i10++;
        }
        boolean z3 = true;
        i = 0;
        c2 = 0;
        cipher = null;
        loop1: while (true) {
            if (i10 >= length) {
                break;
            }
            byte b6 = bArr[i10];
            if (b6 == 66 && (i8 = i10 + 3) < length && bArr[i10 + 1] == 69 && bArr[i10 + 2] == 71 && bArr[i8] == 73) {
                int i11 = i10 + 6;
                int i12 = i10 + 8;
                if (i12 >= length) {
                    throw new JSchException("invalid privatekey: " + bArr);
                }
                byte b7 = bArr[i11];
                if (b7 == 68 && bArr[i10 + 7] == 83 && bArr[i12] == 65) {
                    c3 = 3;
                    c2 = 1;
                } else if (b7 == 82 && bArr[i10 + 7] == 83 && bArr[i12] == 65) {
                    c3 = 3;
                    c2 = 2;
                } else if (b7 == 69 && bArr[i10 + 7] == 67) {
                    c3 = 3;
                    c2 = 3;
                } else {
                    if (b7 == 83 && bArr[i10 + 7] == 83 && bArr[i12] == 72) {
                        i = 1;
                    } else {
                        int i13 = i10 + 12;
                        if (i13 < length && b7 == 80 && bArr[i10 + 7] == 82 && bArr[i12] == 73) {
                            int i14 = i10 + 9;
                            if (bArr[i14] == 86 && bArr[i10 + 10] == 65 && bArr[i10 + 11] == 84 && bArr[i13] == 69) {
                                i11 = i14;
                                i = 3;
                                c3 = 3;
                                c2 = 4;
                                z3 = false;
                            }
                        }
                        int i15 = i10 + 14;
                        if (i15 >= length || b7 != 69 || bArr[i10 + 7] != 78 || bArr[i12] != 67 || bArr[i10 + 9] != 82 || bArr[i10 + 10] != 89) {
                            break;
                        }
                        int i16 = i10 + 11;
                        if (bArr[i16] != 80 || bArr[i13] != 84 || bArr[i10 + 13] != 69 || bArr[i15] != 68) {
                            break;
                        }
                        i11 = i16;
                        i = 3;
                    }
                    c3 = 3;
                    c2 = 4;
                }
                i10 = i11 + 3;
            } else if (b6 == 65 && (i7 = i10 + 7) < length && bArr[i10 + 1] == 69 && bArr[i10 + 2] == 83 && bArr[i10 + 3] == 45 && bArr[i10 + 4] == 50 && bArr[i10 + 5] == 53 && bArr[i10 + 6] == 54 && bArr[i7] == 45) {
                i10 += 8;
                if (Session.checkCipher(JSch.getConfig("aes256-cbc"))) {
                    cipher = (Cipher) Class.forName(JSch.getConfig("aes256-cbc")).newInstance();
                    bArr5 = new byte[cipher.getIVSize()];
                } else {
                    throw new JSchException("privatekey: aes256-cbc is not available " + bArr);
                }
            } else {
                if (b6 == 65) {
                    int i17 = i10 + 7;
                    if (i17 < length && bArr[i10 + 1] == 69 && bArr[i10 + 2] == 83 && bArr[i10 + 3] == 45 && bArr[i10 + 4] == 49 && bArr[i10 + 5] == 57 && bArr[i10 + 6] == 50 && bArr[i17] == 45) {
                        i10 += 8;
                        if (Session.checkCipher(JSch.getConfig("aes192-cbc"))) {
                            cipher = (Cipher) Class.forName(JSch.getConfig("aes192-cbc")).newInstance();
                            bArr5 = new byte[cipher.getIVSize()];
                        } else {
                            throw new JSchException("privatekey: aes192-cbc is not available " + bArr);
                        }
                    } else {
                        b2 = 65;
                    }
                } else {
                    b2 = 65;
                }
                if (b6 == b2 && (i6 = i10 + 7) < length && bArr[i10 + 1] == 69 && bArr[i10 + 2] == 83 && bArr[i10 + 3] == 45 && bArr[i10 + 4] == 49 && bArr[i10 + 5] == 50 && bArr[i10 + 6] == 56 && bArr[i6] == 45) {
                    i10 += 8;
                    if (Session.checkCipher(JSch.getConfig("aes128-cbc"))) {
                        cipher = (Cipher) Class.forName(JSch.getConfig("aes128-cbc")).newInstance();
                        bArr5 = new byte[cipher.getIVSize()];
                    } else {
                        throw new JSchException("privatekey: aes128-cbc is not available " + bArr);
                    }
                } else if (b6 == 67 && (i5 = i10 + 3) < length && bArr[i10 + 1] == 66 && bArr[i10 + 2] == 67 && bArr[i5] == 44) {
                    i10 += 4;
                    for (int i18 = 0; i18 < bArr5.length; i18++) {
                        int i19 = i10 + 1;
                        int a2b = (a2b(bArr[i10]) << 4) & 240;
                        i10 += 2;
                        bArr5[i18] = (byte) (a2b + (a2b(bArr[i19]) & 15));
                    }
                } else {
                    if (b6 != 13 || (i4 = i10 + 1) >= bArr.length) {
                        b3 = 10;
                    } else {
                        b3 = 10;
                        if (bArr[i4] == 10) {
                            i10 = i4;
                        }
                    }
                    if (b6 == b3 && (i2 = i10 + 1) < bArr.length) {
                        byte b8 = bArr[i2];
                        if (b8 == b3) {
                            i10 += 2;
                            break;
                        }
                        if (b8 == 13 && (i3 = i10 + 2) < bArr.length && bArr[i3] == 10) {
                            i10 += 3;
                            break;
                        }
                        for (int i20 = i2; i20 < bArr.length && (b4 = bArr[i20]) != 10; i20++) {
                            if (b4 != 58) {
                            }
                        }
                    }
                    i10++;
                }
            }
        }
        bArr4 = null;
        String str3 = str;
        if (c2 == 1) {
            keyPairPKCS8 = new KeyPairDSA(jSch);
        } else if (c2 == 2) {
            keyPairPKCS8 = new KeyPairRSA(jSch);
        } else if (c2 == 3) {
            keyPairPKCS8 = new KeyPairECDSA(jSch, bArr2);
        } else {
            keyPairPKCS8 = i == 3 ? new KeyPairPKCS8(jSch) : null;
        }
        if (keyPairPKCS8 != null) {
            keyPairPKCS8.encrypted = z2;
            keyPairPKCS8.publickeyblob = bArr4;
            keyPairPKCS8.vendor = i;
            keyPairPKCS8.publicKeyComment = str3;
            keyPairPKCS8.cipher = cipher;
            if (z2) {
                keyPairPKCS8.encrypted = true;
                keyPairPKCS8.f3790iv = bArr5;
                keyPairPKCS8.data = bArr3;
            } else {
                if (!keyPairPKCS8.parse(bArr3)) {
                    throw new JSchException("invalid privatekey: " + bArr);
                }
                keyPairPKCS8.encrypted = false;
                return keyPairPKCS8;
            }
        }
        return keyPairPKCS8;
        bArr4 = r9;
        String str32 = str;
        if (c2 == 1) {
        }
        if (keyPairPKCS8 != null) {
        }
        return keyPairPKCS8;
        String str322 = str;
        if (c2 == 1) {
        }
        if (keyPairPKCS8 != null) {
        }
        return keyPairPKCS8;
    }

    public void writePrivateKey(String str) {
        writePrivateKey(str, (byte[]) null);
    }

    public void writePrivateKey(String str, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        writePrivateKey(fileOutputStream, bArr);
        fileOutputStream.close();
    }
}
