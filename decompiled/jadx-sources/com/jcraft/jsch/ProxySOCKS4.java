package com.jcraft.jsch;

import com.sun.jna.Function;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class ProxySOCKS4 implements Proxy {
    private static int DEFAULTPORT = 1080;

    /* renamed from: in */
    private InputStream f3794in;
    private OutputStream out;
    private String passwd;
    private String proxy_host;
    private int proxy_port;
    private Socket socket;
    private String user;

    public ProxySOCKS4(String str) {
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

    public static int getDefaultPort() {
        return DEFAULTPORT;
    }

    @Override // com.jcraft.jsch.Proxy
    public void close() {
        try {
            InputStream inputStream = this.f3794in;
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
        this.f3794in = null;
        this.out = null;
        this.socket = null;
    }

    @Override // com.jcraft.jsch.Proxy
    public void connect(SocketFactory socketFactory, String str, int i, int i2) {
        try {
            if (socketFactory == null) {
                Socket createSocket = Util.createSocket(this.proxy_host, this.proxy_port, i2);
                this.socket = createSocket;
                this.f3794in = createSocket.getInputStream();
                this.out = this.socket.getOutputStream();
            } else {
                Socket createSocket2 = socketFactory.createSocket(this.proxy_host, this.proxy_port);
                this.socket = createSocket2;
                this.f3794in = socketFactory.getInputStream(createSocket2);
                this.out = socketFactory.getOutputStream(this.socket);
            }
            if (i2 > 0) {
                this.socket.setSoTimeout(i2);
            }
            this.socket.setTcpNoDelay(true);
            byte[] bArr = new byte[1024];
            int i3 = 4;
            bArr[0] = 4;
            bArr[1] = 1;
            bArr[2] = (byte) (i >>> 8);
            bArr[3] = (byte) (i & Function.USE_VARARGS);
            try {
                byte[] address = InetAddress.getByName(str).getAddress();
                int i4 = 0;
                while (i4 < address.length) {
                    int i5 = i3 + 1;
                    bArr[i3] = address[i4];
                    i4++;
                    i3 = i5;
                }
                String str2 = this.user;
                if (str2 != null) {
                    System.arraycopy(Util.str2byte(str2), 0, bArr, i3, this.user.length());
                    i3 += this.user.length();
                }
                bArr[i3] = 0;
                this.out.write(bArr, 0, i3 + 1);
                int i6 = 0;
                while (i6 < 8) {
                    int read = this.f3794in.read(bArr, i6, 8 - i6);
                    if (read <= 0) {
                        throw new JSchException("ProxySOCKS4: stream is closed");
                    }
                    i6 += read;
                }
                if (bArr[0] != 0) {
                    throw new JSchException("ProxySOCKS4: server returns VN " + ((int) bArr[0]));
                }
                if (bArr[1] == 90) {
                    return;
                }
                try {
                    this.socket.close();
                } catch (Exception unused) {
                }
                throw new JSchException("ProxySOCKS4: server returns CD " + ((int) bArr[1]));
            } catch (UnknownHostException e2) {
                throw new JSchException("ProxySOCKS4: " + e2.toString(), e2);
            }
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception e4) {
            try {
                Socket socket = this.socket;
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception unused2) {
            }
            throw new JSchException("ProxySOCKS4: " + e4.toString());
        }
    }

    @Override // com.jcraft.jsch.Proxy
    public InputStream getInputStream() {
        return this.f3794in;
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

    public ProxySOCKS4(String str, int i) {
        this.proxy_host = str;
        this.proxy_port = i;
    }
}
