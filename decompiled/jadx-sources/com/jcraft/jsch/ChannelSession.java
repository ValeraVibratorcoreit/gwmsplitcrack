package com.jcraft.jsch;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
class ChannelSession extends Channel {
    private static byte[] _session = Util.str2byte("session");
    protected boolean agent_forwarding = false;
    protected boolean xforwading = false;
    protected Hashtable env = null;
    protected boolean pty = false;
    protected String ttype = "vt100";
    protected int tcol = 80;
    protected int trow = 24;
    protected int twp = 640;
    protected int thp = 480;
    protected byte[] terminal_mode = null;

    public ChannelSession() {
        this.type = _session;
        this.f3767io = new C0701IO();
    }

    private Hashtable getEnv() {
        if (this.env == null) {
            this.env = new Hashtable();
        }
        return this.env;
    }

    private byte[] toByteArray(Object obj) {
        return obj instanceof String ? Util.str2byte((String) obj) : (byte[]) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x002f, code lost:
    
        eof();
     */
    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        C0701IO c0701io;
        InputStream inputStream;
        Buffer buffer = new Buffer(this.rmpsize);
        Packet packet = new Packet(buffer);
        while (true) {
            try {
                if (!isConnected() || this.thread == null || (c0701io = this.f3767io) == null || (inputStream = c0701io.f3785in) == null) {
                    break;
                }
                int read = inputStream.read(buffer.buffer, 14, r3.length - 142);
                if (read != 0) {
                    if (read == -1) {
                        break;
                    }
                    if (this.close) {
                        break;
                    }
                    packet.reset();
                    buffer.putByte((byte) 94);
                    buffer.putInt(this.recipient);
                    buffer.putInt(read);
                    buffer.skip(read);
                    getSession().write(packet, this, read);
                }
            } catch (Exception unused) {
            }
        }
        Thread thread = this.thread;
        if (thread != null) {
            synchronized (thread) {
                thread.notifyAll();
            }
        }
        this.thread = null;
    }

    public void sendRequests() {
        Session session = getSession();
        if (this.agent_forwarding) {
            new RequestAgentForwarding().request(session, this);
        }
        if (this.xforwading) {
            new RequestX11().request(session, this);
        }
        if (this.pty) {
            RequestPtyReq requestPtyReq = new RequestPtyReq();
            requestPtyReq.setTType(this.ttype);
            requestPtyReq.setTSize(this.tcol, this.trow, this.twp, this.thp);
            byte[] bArr = this.terminal_mode;
            if (bArr != null) {
                requestPtyReq.setTerminalMode(bArr);
            }
            requestPtyReq.request(session, this);
        }
        Hashtable hashtable = this.env;
        if (hashtable != null) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                Object obj = this.env.get(nextElement);
                RequestEnv requestEnv = new RequestEnv();
                requestEnv.setEnv(toByteArray(nextElement), toByteArray(obj));
                requestEnv.request(session, this);
            }
        }
    }

    public void setAgentForwarding(boolean z2) {
        this.agent_forwarding = z2;
    }

    public void setEnv(Hashtable hashtable) {
        synchronized (this) {
            this.env = hashtable;
        }
    }

    public void setPty(boolean z2) {
        this.pty = z2;
    }

    public void setPtySize(int i, int i2, int i3, int i4) {
        setPtyType(this.ttype, i, i2, i3, i4);
        if (this.pty && isConnected()) {
            try {
                RequestWindowChange requestWindowChange = new RequestWindowChange();
                requestWindowChange.setSize(i, i2, i3, i4);
                requestWindowChange.request(getSession(), this);
            } catch (Exception unused) {
            }
        }
    }

    public void setPtyType(String str) {
        setPtyType(str, 80, 24, 640, 480);
    }

    public void setTerminalMode(byte[] bArr) {
        this.terminal_mode = bArr;
    }

    @Override // com.jcraft.jsch.Channel
    public void setXForwarding(boolean z2) {
        this.xforwading = z2;
    }

    public void setPtyType(String str, int i, int i2, int i3, int i4) {
        this.ttype = str;
        this.tcol = i;
        this.trow = i2;
        this.twp = i3;
        this.thp = i4;
    }

    public void setEnv(String str, String str2) {
        setEnv(Util.str2byte(str), Util.str2byte(str2));
    }

    public void setEnv(byte[] bArr, byte[] bArr2) {
        synchronized (this) {
            getEnv().put(bArr, bArr2);
        }
    }
}
