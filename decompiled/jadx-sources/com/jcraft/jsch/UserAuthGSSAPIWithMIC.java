package com.jcraft.jsch;

/* loaded from: classes.dex */
public class UserAuthGSSAPIWithMIC extends UserAuth {
    private static final int SSH_MSG_USERAUTH_GSSAPI_ERROR = 64;
    private static final int SSH_MSG_USERAUTH_GSSAPI_ERRTOK = 65;
    private static final int SSH_MSG_USERAUTH_GSSAPI_EXCHANGE_COMPLETE = 63;
    private static final int SSH_MSG_USERAUTH_GSSAPI_MIC = 66;
    private static final int SSH_MSG_USERAUTH_GSSAPI_RESPONSE = 60;
    private static final int SSH_MSG_USERAUTH_GSSAPI_TOKEN = 61;
    private static final byte[][] supported_oid = {new byte[]{6, 9, 42, -122, 72, -122, -9, 18, 1, 2, 2}};
    private static final String[] supported_method = {"gssapi-with-mic.krb5"};

    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108 A[SYNTHETIC] */
    @Override // com.jcraft.jsch.UserAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean start(Session session) {
        String str;
        GSSContext gSSContext;
        byte[] mic;
        byte command;
        super.start(session);
        byte[] str2byte = Util.str2byte(this.username);
        this.packet.reset();
        this.buf.putByte((byte) 50);
        this.buf.putString(str2byte);
        this.buf.putString(Util.str2byte("ssh-connection"));
        this.buf.putString(Util.str2byte("gssapi-with-mic"));
        this.buf.putInt(supported_oid.length);
        int i = 0;
        while (true) {
            byte[][] bArr = supported_oid;
            if (i >= bArr.length) {
                break;
            }
            this.buf.putString(bArr[i]);
            i++;
        }
        session.write(this.packet);
        while (true) {
            Buffer read = session.read(this.buf);
            this.buf = read;
            int command2 = read.getCommand() & 255;
            if (command2 == 51) {
                return false;
            }
            if (command2 == SSH_MSG_USERAUTH_GSSAPI_RESPONSE) {
                this.buf.getInt();
                this.buf.getByte();
                this.buf.getByte();
                byte[] string = this.buf.getString();
                int i2 = 0;
                while (true) {
                    byte[][] bArr2 = supported_oid;
                    if (i2 >= bArr2.length) {
                        str = null;
                        break;
                    }
                    if (Util.array_equals(string, bArr2[i2])) {
                        str = supported_method[i2];
                        break;
                    }
                    i2++;
                }
                if (str == null) {
                    return false;
                }
                try {
                    gSSContext = (GSSContext) Class.forName(session.getConfig(str)).newInstance();
                    gSSContext.create(this.username, session.host);
                    byte[] bArr3 = new byte[0];
                    while (!gSSContext.isEstablished()) {
                        try {
                            bArr3 = gSSContext.init(bArr3, 0, bArr3.length);
                            if (bArr3 != null) {
                                this.packet.reset();
                                this.buf.putByte((byte) 61);
                                this.buf.putString(bArr3);
                                session.write(this.packet);
                            }
                            if (!gSSContext.isEstablished()) {
                                Buffer read2 = session.read(this.buf);
                                this.buf = read2;
                                int command3 = read2.getCommand() & 255;
                                if (command3 == 64) {
                                    Buffer read3 = session.read(this.buf);
                                    this.buf = read3;
                                    command = read3.getCommand();
                                } else {
                                    if (command3 == SSH_MSG_USERAUTH_GSSAPI_ERRTOK) {
                                        Buffer read4 = session.read(this.buf);
                                        this.buf = read4;
                                        command = read4.getCommand();
                                    }
                                    if (command3 != 51) {
                                        return false;
                                    }
                                    this.buf.getInt();
                                    this.buf.getByte();
                                    this.buf.getByte();
                                    bArr3 = this.buf.getString();
                                }
                                command3 = command & 255;
                                if (command3 != 51) {
                                }
                            }
                        } catch (JSchException unused) {
                            return false;
                        }
                    }
                    Buffer buffer = new Buffer();
                    buffer.putString(session.getSessionId());
                    buffer.putByte((byte) 50);
                    buffer.putString(str2byte);
                    buffer.putString(Util.str2byte("ssh-connection"));
                    buffer.putString(Util.str2byte("gssapi-with-mic"));
                    mic = gSSContext.getMIC(buffer.buffer, 0, buffer.getLength());
                } catch (JSchException | Exception unused2) {
                }
                if (mic == null) {
                    return false;
                }
                this.packet.reset();
                this.buf.putByte((byte) 66);
                this.buf.putString(mic);
                session.write(this.packet);
                gSSContext.dispose();
                Buffer read5 = session.read(this.buf);
                this.buf = read5;
                int command4 = read5.getCommand() & 255;
                if (command4 == 52) {
                    return true;
                }
                if (command4 == 51) {
                    this.buf.getInt();
                    this.buf.getByte();
                    this.buf.getByte();
                    byte[] string2 = this.buf.getString();
                    if (this.buf.getByte() != 0) {
                        throw new JSchPartialAuthException(Util.byte2str(string2));
                    }
                }
                return false;
            }
            if (command2 != 53) {
                return false;
            }
            this.buf.getInt();
            this.buf.getByte();
            this.buf.getByte();
            byte[] string3 = this.buf.getString();
            this.buf.getString();
            String byte2str = Util.byte2str(string3);
            UserInfo userInfo = this.userinfo;
            if (userInfo != null) {
                userInfo.showMessage(byte2str);
            }
        }
    }
}
