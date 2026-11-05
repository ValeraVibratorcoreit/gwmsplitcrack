package com.jcraft.jsch;

/* loaded from: classes.dex */
class UserAuthPassword extends UserAuth {
    private final int SSH_MSG_USERAUTH_PASSWD_CHANGEREQ = 60;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x018c, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018e, code lost:
    
        r5.showMessage("Password must be changed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0193, code lost:
    
        if (r3 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0195, code lost:
    
        com.jcraft.jsch.Util.bzero(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0198, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019b, code lost:
    
        if (r4 != 51) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019d, code lost:
    
        r14.buf.getInt();
        r14.buf.getByte();
        r14.buf.getByte();
        r4 = r14.buf.getString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b8, code lost:
    
        if (r14.buf.getByte() != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ba, code lost:
    
        r15.auth_failures++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bf, code lost:
    
        if (r3 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c1, code lost:
    
        com.jcraft.jsch.Util.bzero(r3);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d0, code lost:
    
        throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.byte2str(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        if (r3 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d3, code lost:
    
        com.jcraft.jsch.Util.bzero(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d6, code lost:
    
        return false;
     */
    @Override // com.jcraft.jsch.UserAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean start(Session session) {
        super.start(session);
        byte[] bArr = session.password;
        String str = this.username + "@" + session.host;
        if (session.port != 22) {
            str = str + ":" + session.port;
        }
        String str2 = str;
        loop0: while (session.auth_failures < session.max_auth_tries) {
            try {
                if (bArr == null) {
                    UserInfo userInfo = this.userinfo;
                    if (userInfo == null) {
                        if (bArr != null) {
                            Util.bzero(bArr);
                        }
                        return false;
                    }
                    if (!userInfo.promptPassword("Password for " + str2)) {
                        throw new JSchAuthCancelException("password");
                    }
                    String password = this.userinfo.getPassword();
                    if (password == null) {
                        throw new JSchAuthCancelException("password");
                    }
                    bArr = Util.str2byte(password);
                }
                byte[] str2byte = Util.str2byte(this.username);
                this.packet.reset();
                this.buf.putByte((byte) 50);
                this.buf.putString(str2byte);
                this.buf.putString(Util.str2byte("ssh-connection"));
                this.buf.putString(Util.str2byte("password"));
                this.buf.putByte((byte) 0);
                this.buf.putString(bArr);
                session.write(this.packet);
                while (true) {
                    Buffer read = session.read(this.buf);
                    this.buf = read;
                    int command = read.getCommand() & 255;
                    if (command != 52) {
                        if (command != 53) {
                            if (command != 60) {
                                break;
                            }
                            this.buf.getInt();
                            this.buf.getByte();
                            this.buf.getByte();
                            byte[] string = this.buf.getString();
                            this.buf.getString();
                            UserInfo userInfo2 = this.userinfo;
                            if (userInfo2 == null || !(userInfo2 instanceof UIKeyboardInteractive)) {
                                break loop0;
                            }
                            String[] promptKeyboardInteractive = ((UIKeyboardInteractive) userInfo2).promptKeyboardInteractive(str2, "Password Change Required", Util.byte2str(string), new String[]{"New Password: "}, new boolean[]{false});
                            if (promptKeyboardInteractive == null) {
                                throw new JSchAuthCancelException("password");
                            }
                            byte[] str2byte2 = Util.str2byte(promptKeyboardInteractive[0]);
                            this.packet.reset();
                            this.buf.putByte((byte) 50);
                            this.buf.putString(str2byte);
                            this.buf.putString(Util.str2byte("ssh-connection"));
                            this.buf.putString(Util.str2byte("password"));
                            this.buf.putByte((byte) 1);
                            this.buf.putString(bArr);
                            this.buf.putString(str2byte2);
                            Util.bzero(str2byte2);
                            session.write(this.packet);
                        } else {
                            this.buf.getInt();
                            this.buf.getByte();
                            this.buf.getByte();
                            byte[] string2 = this.buf.getString();
                            this.buf.getString();
                            String byte2str = Util.byte2str(string2);
                            UserInfo userInfo3 = this.userinfo;
                            if (userInfo3 != null) {
                                userInfo3.showMessage(byte2str);
                            }
                        }
                    } else {
                        if (bArr != null) {
                            Util.bzero(bArr);
                        }
                        return true;
                    }
                }
            } catch (Throwable th) {
                if (bArr != null) {
                    Util.bzero(bArr);
                }
                throw th;
            }
        }
        if (bArr != null) {
            Util.bzero(bArr);
        }
        return false;
    }
}
