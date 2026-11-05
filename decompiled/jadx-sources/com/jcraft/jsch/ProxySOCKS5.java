package com.jcraft.jsch;

import com.sun.jna.Function;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
public class ProxySOCKS5 implements Proxy {
    private static int DEFAULTPORT = 1080;

    /* renamed from: in */
    private InputStream f3795in;
    private OutputStream out;
    private String passwd;
    private String proxy_host;
    private int proxy_port;
    private Socket socket;
    private String user;

    public ProxySOCKS5(String str) {
        int i = DEFAULTPORT;
        if (str.indexOf(58) != -1) {
            try {
                String substring = str.substring(0, str.indexOf(58));
                try {
                    i = Integer.parseInt(str.substring(str.indexOf(58) + 1));
                } catch (Exception unused) {
                }
                str = substring;
            } catch (Exception unused2) {
            }
        }
        this.proxy_host = str;
        this.proxy_port = i;
    }

    private void fill(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read <= 0) {
                throw new JSchException("ProxySOCKS5: stream is closed");
            }
            i2 += read;
        }
    }

    public static int getDefaultPort() {
        return DEFAULTPORT;
    }

    @Override // com.jcraft.jsch.Proxy
    public void close() {
        try {
            InputStream inputStream = this.f3795in;
            if (inputStream != null) {
                inputStream.close();
            }
            OutputStream outputStream = this.out;
            if (outputStream != null) {
                outputStream.close();
            }
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (Exception unused) {
        }
        this.f3795in = null;
        this.out = null;
        this.socket = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
    
        if (r10[1] == 0) goto L25;
     */
    @Override // com.jcraft.jsch.Proxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void connect(SocketFactory socketFactory, String str, int i, int i2) {
        String str2;
        try {
            if (socketFactory == null) {
                Socket createSocket = Util.createSocket(this.proxy_host, this.proxy_port, i2);
                this.socket = createSocket;
                this.f3795in = createSocket.getInputStream();
                this.out = this.socket.getOutputStream();
            } else {
                Socket createSocket2 = socketFactory.createSocket(this.proxy_host, this.proxy_port);
                this.socket = createSocket2;
                this.f3795in = socketFactory.getInputStream(createSocket2);
                this.out = socketFactory.getOutputStream(this.socket);
            }
            if (i2 > 0) {
                this.socket.setSoTimeout(i2);
            }
            this.socket.setTcpNoDelay(true);
            byte[] bArr = new byte[1024];
            bArr[0] = 5;
            bArr[1] = 2;
            bArr[2] = 0;
            bArr[3] = 2;
            this.out.write(bArr, 0, 4);
            fill(this.f3795in, bArr, 2);
            int i3 = bArr[1] & 255;
            if (i3 != 0) {
                if (i3 == 2 && (str2 = this.user) != null && this.passwd != null) {
                    bArr[0] = 1;
                    bArr[1] = (byte) str2.length();
                    System.arraycopy(Util.str2byte(this.user), 0, bArr, 2, this.user.length());
                    int length = this.user.length();
                    int i4 = 2 + length;
                    int i5 = length + 3;
                    bArr[i4] = (byte) this.passwd.length();
                    System.arraycopy(Util.str2byte(this.passwd), 0, bArr, i5, this.passwd.length());
                    this.out.write(bArr, 0, i5 + this.passwd.length());
                    fill(this.f3795in, bArr, 2);
                }
                try {
                    this.socket.close();
                } catch (Exception unused) {
                }
                throw new JSchException("fail in SOCKS5 proxy");
            }
            bArr[0] = 5;
            bArr[1] = 1;
            bArr[2] = 0;
            byte[] str2byte = Util.str2byte(str);
            int length2 = str2byte.length;
            bArr[3] = 3;
            bArr[4] = (byte) length2;
            System.arraycopy(str2byte, 0, bArr, 5, length2);
            bArr[5 + length2] = (byte) (i >>> 8);
            bArr[length2 + 6] = (byte) (i & Function.USE_VARARGS);
            this.out.write(bArr, 0, length2 + 7);
            fill(this.f3795in, bArr, 4);
            if (bArr[1] != 0) {
                try {
                    this.socket.close();
                } catch (Exception unused2) {
                }
                throw new JSchException("ProxySOCKS5: server returns " + ((int) bArr[1]));
            }
            int i6 = bArr[3] & 255;
            if (i6 == 1) {
                fill(this.f3795in, bArr, 6);
                return;
            }
            if (i6 == 3) {
                fill(this.f3795in, bArr, 1);
                fill(this.f3795in, bArr, (bArr[0] & 255) + 2);
            } else {
                if (i6 != 4) {
                    return;
                }
                fill(this.f3795in, bArr, 18);
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            try {
                Socket socket = this.socket;
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception unused3) {
            }
            throw new JSchException("ProxySOCKS5: " + e3.toString(), e3);
        }
    }

    @Override // com.jcraft.jsch.Proxy
    public InputStream getInputStream() {
        return this.f3795in;
    }

    @Override // com.jcraft.jsch.Proxy
    public OutputStream getOutputStream() {
        return this.out;
    }

    @Override // com.jcraft.jsch.Proxy
    public Socket getSocket() {
        return this.socket;
    }

    public void setUserPasswd(String str, String str2) {
        this.user = str;
        this.passwd = str2;
    }

    public ProxySOCKS5(String str, int i) {
        this.proxy_host = str;
        this.proxy_port = i;
    }
}
