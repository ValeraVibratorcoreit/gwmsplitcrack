package com.jcraft.jsch;

/* loaded from: classes.dex */
public class DHG1 extends KeyExchange {
    private static final int SSH_MSG_KEXDH_INIT = 30;
    private static final int SSH_MSG_KEXDH_REPLY = 31;

    /* renamed from: g */
    static final byte[] f3772g = {2};

    /* renamed from: p */
    static final byte[] f3773p = {0, -1, -1, -1, -1, -1, -1, -1, -1, -55, 15, -38, -94, 33, 104, -62, 52, -60, -58, 98, -117, Byte.MIN_VALUE, -36, 28, -47, 41, 2, 78, 8, -118, 103, -52, 116, 2, 11, -66, -90, 59, 19, -101, 34, 81, 74, 8, 121, -114, 52, 4, -35, -17, -107, 25, -77, -51, 58, 67, 27, 48, 43, 10, 109, -14, 95, 20, 55, 79, -31, 53, 109, 109, 81, -62, 69, -28, -123, -75, 118, 98, 94, 126, -58, -12, 76, 66, -23, -90, 55, -19, 107, 11, -1, 92, -74, -12, 6, -73, -19, -18, 56, 107, -5, 90, -119, -97, -91, -82, -97, 36, 17, 124, 75, 31, -26, 73, 40, 102, 81, -20, -26, 83, -127, -1, -1, -1, -1, -1, -1, -1, -1};
    byte[] I_C;
    byte[] I_S;
    byte[] V_C;
    byte[] V_S;
    private Buffer buf;

    /* renamed from: dh */
    InterfaceC0700DH f3774dh;

    /* renamed from: e */
    byte[] f3775e;
    private Packet packet;
    private int state;

    @Override // com.jcraft.jsch.KeyExchange
    public int getState() {
        return this.state;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public void init(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.session = session;
        this.V_S = bArr;
        this.V_C = bArr2;
        this.I_S = bArr3;
        this.I_C = bArr4;
        try {
            HASH hash = (HASH) Class.forName(session.getConfig("sha-1")).newInstance();
            this.sha = hash;
            hash.init();
        } catch (Exception e2) {
            System.err.println(e2);
        }
        Buffer buffer = new Buffer();
        this.buf = buffer;
        this.packet = new Packet(buffer);
        InterfaceC0700DH interfaceC0700DH = (InterfaceC0700DH) Class.forName(session.getConfig("dh")).newInstance();
        this.f3774dh = interfaceC0700DH;
        interfaceC0700DH.init();
        this.f3774dh.setP(f3773p);
        this.f3774dh.setG(f3772g);
        this.f3775e = this.f3774dh.getE();
        this.packet.reset();
        this.buf.putByte((byte) 30);
        this.buf.putMPInt(this.f3775e);
        session.write(this.packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_KEXDH_INIT sent");
            JSch.getLogger().log(1, "expecting SSH_MSG_KEXDH_REPLY");
        }
        this.state = SSH_MSG_KEXDH_REPLY;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public boolean next(Buffer buffer) {
        if (this.state != SSH_MSG_KEXDH_REPLY) {
            return false;
        }
        buffer.getInt();
        buffer.getByte();
        int i = buffer.getByte();
        if (i != SSH_MSG_KEXDH_REPLY) {
            System.err.println("type: must be 31 " + i);
            return false;
        }
        this.K_S = buffer.getString();
        byte[] mPInt = buffer.getMPInt();
        byte[] string = buffer.getString();
        this.f3774dh.setF(mPInt);
        this.f3774dh.checkRange();
        this.f3788K = normalize(this.f3774dh.getK());
        this.buf.reset();
        this.buf.putString(this.V_C);
        this.buf.putString(this.V_S);
        this.buf.putString(this.I_C);
        this.buf.putString(this.I_S);
        this.buf.putString(this.K_S);
        this.buf.putMPInt(this.f3775e);
        this.buf.putMPInt(mPInt);
        this.buf.putMPInt(this.f3788K);
        int length = this.buf.getLength();
        byte[] bArr = new byte[length];
        this.buf.getByte(bArr);
        this.sha.update(bArr, 0, length);
        this.f3787H = this.sha.digest();
        byte[] bArr2 = this.K_S;
        int i2 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean verify = verify(Util.byte2str(bArr2, 4, i2), this.K_S, 4 + i2, string);
        this.state = 0;
        return verify;
    }
}
