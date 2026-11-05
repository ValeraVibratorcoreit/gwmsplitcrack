package com.jcraft.jsch;

/* loaded from: classes.dex */
public class RequestSubsystem extends Request {
    private String subsystem = null;

    public void request(Session session, Channel channel, String str, boolean z2) {
        setReply(z2);
        this.subsystem = str;
        request(session, channel);
    }

    @Override // com.jcraft.jsch.Request
    public void request(Session session, Channel channel) {
        super.request(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 98);
        buffer.putInt(channel.getRecipient());
        buffer.putString(Util.str2byte("subsystem"));
        buffer.putByte(waitForReply() ? (byte) 1 : (byte) 0);
        buffer.putString(Util.str2byte(this.subsystem));
        write(packet);
    }
}
