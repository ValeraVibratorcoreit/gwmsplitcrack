package com.jcraft.jsch;

/* loaded from: classes.dex */
abstract class Request {
    private boolean reply = false;
    private Session session = null;
    private Channel channel = null;

    public void request(Session session, Channel channel) {
        this.session = session;
        this.channel = channel;
        if (channel.connectTimeout > 0) {
            setReply(true);
        }
    }

    public void setReply(boolean z2) {
        this.reply = z2;
    }

    public boolean waitForReply() {
        return this.reply;
    }

    public void write(Packet packet) {
        if (this.reply) {
            this.channel.reply = -1;
        }
        this.session.write(packet);
        if (this.reply) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.channel.connectTimeout;
            while (this.channel.isConnected() && this.channel.reply == -1) {
                try {
                    Thread.sleep(10L);
                } catch (Exception unused) {
                }
                if (j2 > 0 && System.currentTimeMillis() - currentTimeMillis > j2) {
                    this.channel.reply = 0;
                    throw new JSchException("channel request: timeout");
                }
            }
            if (this.channel.reply == 0) {
                throw new JSchException("failed to send channel request");
            }
        }
    }
}
