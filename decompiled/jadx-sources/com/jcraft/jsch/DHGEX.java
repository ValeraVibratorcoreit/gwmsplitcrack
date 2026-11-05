package com.jcraft.jsch;

/* loaded from: classes.dex */
public class DHGEX extends KeyExchange {
    private static final int SSH_MSG_KEX_DH_GEX_GROUP = 31;
    private static final int SSH_MSG_KEX_DH_GEX_INIT = 32;
    private static final int SSH_MSG_KEX_DH_GEX_REPLY = 33;
    private static final int SSH_MSG_KEX_DH_GEX_REQUEST = 34;
    static int min = 1024;
    static int preferred = 1024;
    byte[] I_C;
    byte[] I_S;
    byte[] V_C;
    byte[] V_S;
    private Buffer buf;

    /* renamed from: dh */
    InterfaceC0700DH f3780dh;

    /* renamed from: e */
    private byte[] f3781e;

    /* renamed from: g */
    private byte[] f3782g;

    /* renamed from: p */
    private byte[] f3783p;
    private Packet packet;
    private int state;
    int max = 1024;
    protected String hash = "sha-1";

    public int check2048(Class cls, int i) {
        InterfaceC0700DH interfaceC0700DH = (InterfaceC0700DH) cls.newInstance();
        interfaceC0700DH.init();
        byte[] bArr = new byte[257];
        bArr[1] = -35;
        bArr[256] = 115;
        interfaceC0700DH.setP(bArr);
        interfaceC0700DH.setG(new byte[]{2});
        try {
            interfaceC0700DH.getE();
            return 2048;
        } catch (Exception unused) {
            return i;
        }
    }

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
            HASH hash = (HASH) Class.forName(session.getConfig(this.hash)).newInstance();
            this.sha = hash;
            hash.init();
        } catch (Exception e2) {
            System.err.println(e2);
        }
        Buffer buffer = new Buffer();
        this.buf = buffer;
        this.packet = new Packet(buffer);
        Class<?> cls = Class.forName(session.getConfig("dh"));
        int check2048 = check2048(cls, this.max);
        this.max = check2048;
        preferred = check2048;
        InterfaceC0700DH interfaceC0700DH = (InterfaceC0700DH) cls.newInstance();
        this.f3780dh = interfaceC0700DH;
        interfaceC0700DH.init();
        this.packet.reset();
        this.buf.putByte((byte) 34);
        this.buf.putInt(min);
        this.buf.putInt(preferred);
        this.buf.putInt(this.max);
        session.write(this.packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_KEX_DH_GEX_REQUEST(" + min + "<" + preferred + "<" + this.max + ") sent");
            JSch.getLogger().log(1, "expecting SSH_MSG_KEX_DH_GEX_GROUP");
        }
        this.state = SSH_MSG_KEX_DH_GEX_GROUP;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public boolean next(Buffer buffer) {
        int i = this.state;
        if (i == SSH_MSG_KEX_DH_GEX_GROUP) {
            buffer.getInt();
            buffer.getByte();
            int i2 = buffer.getByte();
            if (i2 != SSH_MSG_KEX_DH_GEX_GROUP) {
                System.err.println("type: must be SSH_MSG_KEX_DH_GEX_GROUP " + i2);
                return false;
            }
            this.f3783p = buffer.getMPInt();
            this.f3782g = buffer.getMPInt();
            this.f3780dh.setP(this.f3783p);
            this.f3780dh.setG(this.f3782g);
            this.f3781e = this.f3780dh.getE();
            this.packet.reset();
            this.buf.putByte((byte) 32);
            this.buf.putMPInt(this.f3781e);
            this.session.write(this.packet);
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "SSH_MSG_KEX_DH_GEX_INIT sent");
                JSch.getLogger().log(1, "expecting SSH_MSG_KEX_DH_GEX_REPLY");
            }
            this.state = SSH_MSG_KEX_DH_GEX_REPLY;
            return true;
        }
        if (i != SSH_MSG_KEX_DH_GEX_REPLY) {
            return false;
        }
        buffer.getInt();
        buffer.getByte();
        int i3 = buffer.getByte();
        if (i3 != SSH_MSG_KEX_DH_GEX_REPLY) {
            System.err.println("type: must be SSH_MSG_KEX_DH_GEX_REPLY " + i3);
            return false;
        }
        this.K_S = buffer.getString();
        byte[] mPInt = buffer.getMPInt();
        byte[] string = buffer.getString();
        this.f3780dh.setF(mPInt);
        this.f3780dh.checkRange();
        this.f3788K = normalize(this.f3780dh.getK());
        this.buf.reset();
        this.buf.putString(this.V_C);
        this.buf.putString(this.V_S);
        this.buf.putString(this.I_C);
        this.buf.putString(this.I_S);
        this.buf.putString(this.K_S);
        this.buf.putInt(min);
        this.buf.putInt(preferred);
        this.buf.putInt(this.max);
        this.buf.putMPInt(this.f3783p);
        this.buf.putMPInt(this.f3782g);
        this.buf.putMPInt(this.f3781e);
        this.buf.putMPInt(mPInt);
        this.buf.putMPInt(this.f3788K);
        int length = this.buf.getLength();
        byte[] bArr = new byte[length];
        this.buf.getByte(bArr);
        this.sha.update(bArr, 0, length);
        this.f3787H = this.sha.digest();
        byte[] bArr2 = this.K_S;
        int i4 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean verify = verify(Util.byte2str(bArr2, 4, i4), this.K_S, 4 + i4, string);
        this.state = 0;
        return verify;
    }
}
