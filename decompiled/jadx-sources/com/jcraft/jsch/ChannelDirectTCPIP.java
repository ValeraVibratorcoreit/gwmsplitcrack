package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ChannelDirectTCPIP extends Channel {
    private static final int LOCAL_MAXIMUM_PACKET_SIZE = 16384;
    private static final int LOCAL_WINDOW_SIZE_MAX = 131072;
    private static final byte[] _type = Util.str2byte("direct-tcpip");
    String host;
    String originator_IP_address = "127.0.0.1";
    int originator_port = 0;
    int port;

    public ChannelDirectTCPIP() {
        this.type = _type;
        setLocalWindowSizeMax(LOCAL_WINDOW_SIZE_MAX);
        setLocalWindowSize(LOCAL_WINDOW_SIZE_MAX);
        setLocalPacketSize(LOCAL_MAXIMUM_PACKET_SIZE);
    }

    @Override // com.jcraft.jsch.Channel
    public void connect(int i) {
        this.connectTimeout = i;
        try {
            Session session = getSession();
            if (!session.isConnected()) {
                throw new JSchException("session is down");
            }
            if (this.f3767io.f3785in == null) {
                sendChannelOpen();
                return;
            }
            Thread thread = new Thread(this);
            this.thread = thread;
            thread.setName("DirectTCPIP thread " + session.getHost());
            boolean z2 = session.daemon_thread;
            if (z2) {
                this.thread.setDaemon(z2);
            }
            this.thread.start();
        } catch (Exception e2) {
            this.f3767io.close();
            this.f3767io = null;
            Channel.del(this);
            if (e2 instanceof JSchException) {
                throw ((JSchException) e2);
            }
        }
    }

    @Override // com.jcraft.jsch.Channel
    public Packet genChannelOpenPacket() {
        Buffer buffer = new Buffer(this.originator_IP_address.length() + this.host.length() + 50 + 128);
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 90);
        buffer.putString(this.type);
        buffer.putInt(this.f3766id);
        buffer.putInt(this.lwsize);
        buffer.putInt(this.lmpsize);
        buffer.putString(Util.str2byte(this.host));
        buffer.putInt(this.port);
        buffer.putString(Util.str2byte(this.originator_IP_address));
        buffer.putInt(this.originator_port);
        return packet;
    }

    @Override // com.jcraft.jsch.Channel
    public void init() {
        this.f3767io = new C0701IO();
    }

    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    public void run() {
        C0701IO c0701io;
        InputStream inputStream;
        try {
            sendChannelOpen();
            Buffer buffer = new Buffer(this.rmpsize);
            Packet packet = new Packet(buffer);
            Session session = getSession();
            while (true) {
                if (!isConnected() || this.thread == null || (c0701io = this.f3767io) == null || (inputStream = c0701io.f3785in) == null) {
                    break;
                }
                int read = inputStream.read(buffer.buffer, 14, r4.length - 142);
                if (read <= 0) {
                    eof();
                    break;
                }
                packet.reset();
                buffer.putByte((byte) 94);
                buffer.putInt(this.recipient);
                buffer.putInt(read);
                buffer.skip(read);
                synchronized (this) {
                    try {
                        if (this.close) {
                            break;
                        } else {
                            session.write(packet, this, read);
                        }
                    } finally {
                    }
                }
            }
            eof();
            disconnect();
        } catch (Exception unused) {
            if (!this.connected) {
                this.connected = true;
            }
            disconnect();
        }
    }

    public void setHost(String str) {
        this.host = str;
    }

    @Override // com.jcraft.jsch.Channel
    public void setInputStream(InputStream inputStream) {
        this.f3767io.setInputStream(inputStream);
    }

    public void setOrgIPAddress(String str) {
        this.originator_IP_address = str;
    }

    public void setOrgPort(int i) {
        this.originator_port = i;
    }

    @Override // com.jcraft.jsch.Channel
    public void setOutputStream(OutputStream outputStream) {
        this.f3767io.setOutputStream(outputStream);
    }

    public void setPort(int i) {
        this.port = i;
    }
}
