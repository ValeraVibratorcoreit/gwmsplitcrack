package com.jcraft.jsch;

/* loaded from: classes.dex */
class UserAuthKeyboardInteractive extends UserAuth {
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d2, code lost:
    
        r17.buf.getInt();
        r17.buf.getByte();
        r17.buf.getByte();
        r5 = r17.buf.getString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        if (r17.buf.getByte() != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ef, code lost:
    
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f2, code lost:
    
        r18.auth_failures++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f7, code lost:
    
        if (r14 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f9, code lost:
    
        r4 = r13;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0102, code lost:
    
        throw new com.jcraft.jsch.JSchAuthCancelException("keyboard-interactive");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010c, code lost:
    
        throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.byte2str(r5));
     */
    @Override // com.jcraft.jsch.UserAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean start(Session session) {
        UserInfo userInfo;
        String[] promptKeyboardInteractive;
        byte[][] bArr;
        super.start(session);
        UserInfo userInfo2 = this.userinfo;
        if (userInfo2 != null && !(userInfo2 instanceof UIKeyboardInteractive)) {
            return false;
        }
        String str = this.username + "@" + session.host;
        if (session.port != 22) {
            str = str + ":" + session.port;
        }
        byte[] bArr2 = session.password;
        byte[] str2byte = Util.str2byte(this.username);
        boolean z2 = false;
        while (session.auth_failures < session.max_auth_tries) {
            this.packet.reset();
            this.buf.putByte((byte) 50);
            this.buf.putString(str2byte);
            this.buf.putString(Util.str2byte("ssh-connection"));
            this.buf.putString(Util.str2byte("keyboard-interactive"));
            Buffer buffer = this.buf;
            byte[] bArr3 = Util.empty;
            buffer.putString(bArr3);
            this.buf.putString(bArr3);
            session.write(this.packet);
            byte[] bArr4 = bArr2;
            boolean z3 = z2;
            boolean z4 = true;
            while (true) {
                Buffer read = session.read(this.buf);
                this.buf = read;
                int command = read.getCommand() & 255;
                if (command == 52) {
                    return true;
                }
                if (command == 53) {
                    this.buf.getInt();
                    this.buf.getByte();
                    this.buf.getByte();
                    byte[] string = this.buf.getString();
                    this.buf.getString();
                    String byte2str = Util.byte2str(string);
                    UserInfo userInfo3 = this.userinfo;
                    if (userInfo3 != null) {
                        userInfo3.showMessage(byte2str);
                    }
                } else {
                    if (command == 51) {
                        break;
                    }
                    if (command != 60) {
                        return false;
                    }
                    this.buf.getInt();
                    this.buf.getByte();
                    this.buf.getByte();
                    String byte2str2 = Util.byte2str(this.buf.getString());
                    String byte2str3 = Util.byte2str(this.buf.getString());
                    Util.byte2str(this.buf.getString());
                    int i = this.buf.getInt();
                    String[] strArr = new String[i];
                    boolean[] zArr = new boolean[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        strArr[i2] = Util.byte2str(this.buf.getString());
                        zArr[i2] = this.buf.getByte() != 0;
                    }
                    if (bArr4 != null && i == 1 && !zArr[0] && strArr[0].toLowerCase().indexOf("password:") >= 0) {
                        bArr = new byte[][]{bArr4};
                        bArr4 = null;
                    } else if ((i <= 0 && byte2str2.length() <= 0 && byte2str3.length() <= 0) || (userInfo = this.userinfo) == null || (promptKeyboardInteractive = ((UIKeyboardInteractive) userInfo).promptKeyboardInteractive(str, byte2str2, byte2str3, strArr, zArr)) == null) {
                        bArr = null;
                    } else {
                        byte[][] bArr5 = new byte[promptKeyboardInteractive.length][];
                        for (int i3 = 0; i3 < promptKeyboardInteractive.length; i3++) {
                            bArr5[i3] = Util.str2byte(promptKeyboardInteractive[i3]);
                        }
                        bArr = bArr5;
                    }
                    this.packet.reset();
                    this.buf.putByte((byte) 61);
                    if (i <= 0 || (bArr != null && i == bArr.length)) {
                        this.buf.putInt(i);
                        for (int i4 = 0; i4 < i; i4++) {
                            this.buf.putString(bArr[i4]);
                        }
                    } else {
                        if (bArr == null) {
                            this.buf.putInt(i);
                            for (int i5 = 0; i5 < i; i5++) {
                                this.buf.putString(Util.empty);
                            }
                        } else {
                            this.buf.putInt(0);
                        }
                        if (bArr == null) {
                            z3 = true;
                        }
                    }
                    session.write(this.packet);
                    z4 = false;
                }
            }
        }
        return false;
    }
}
