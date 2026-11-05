package p098q0;

import android.util.Log;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.cfgData;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q0.i0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1323i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6149a;

    /* renamed from: b */
    public final /* synthetic */ String f6150b;

    public /* synthetic */ RunnableC1323i0(String str, int i) {
        this.f6149a = i;
        this.f6150b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Channel channel;
        Throwable th;
        ChannelExec channelExec;
        Throwable e2;
        Session session;
        cfgData cfgdata;
        InputStream inputStream;
        byte[] bArr;
        int read;
        int i = 1;
        Session session2 = 8;
        String str = this.f6150b;
        switch (this.f6149a) {
            case 0:
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                new Thread(new RunnableC1323i0(str, i)).start();
                return;
            case 1:
                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                for (int i2 = 0; i2 < 8; i2++) {
                    int m3313s = AbstractC1372y1.m3313s(0, str);
                    if (m3313s <= 0) {
                        return;
                    }
                    AbstractC1372y1.m3285P(m3313s, 0);
                    try {
                        Thread.sleep(120L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 2:
                C1287U0 c1287u0 = C1287U0.f5959M;
                if (!c1287u0.f5971b.f2607b3) {
                    return;
                }
                while (true) {
                    ArrayDeque arrayDeque = c1287u0.f5995z;
                    if (arrayDeque.size() < 8) {
                        arrayDeque.addLast(new C1285T0(4000L, str));
                        c1287u0.m3116o();
                        return;
                    }
                    arrayDeque.removeFirst();
                }
            default:
                try {
                    try {
                        JSch jSch = new JSch();
                        cfgdata = AbstractC1342o1.f6314a;
                        session = jSch.getSession(NativeLib.getStringByIndex(cfgdata.f2618e), NativeLib.getStringByIndex(cfgdata.f2613d), 22);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        session.setPassword(NativeLib.getStringByIndex(cfgdata.f2623f));
                        session.setConfig("StrictHostKeyChecking", "no");
                        session.setTimeout(5000);
                        session.connect(5000);
                        channelExec = (ChannelExec) session.openChannel("exec");
                        try {
                            channelExec.setCommand(str);
                            channelExec.setInputStream(null);
                            channelExec.setErrStream(null);
                            inputStream = channelExec.getInputStream();
                            channelExec.connect(5000);
                            bArr = new byte[1024];
                        } catch (JSchException e3) {
                            e2 = e3;
                            session = session;
                            Log.w("T500_Split:TBox", "SSH failed (TBox offline?): " + e2.getMessage());
                            if (channelExec != null) {
                                try {
                                    channelExec.disconnect();
                                } catch (Exception unused2) {
                                }
                            }
                            if (session == null) {
                                return;
                            }
                            try {
                                session.disconnect();
                                return;
                            } catch (Exception unused3) {
                                return;
                            }
                        } catch (IOException e4) {
                            e2 = e4;
                            session = session;
                            Log.w("T500_Split:TBox", "SSH failed (TBox offline?): " + e2.getMessage());
                            if (channelExec != null) {
                            }
                            if (session == null) {
                            }
                            session.disconnect();
                            return;
                        }
                    } catch (JSchException e5) {
                        e = e5;
                        channelExec = null;
                        e2 = e;
                        session = session;
                        Log.w("T500_Split:TBox", "SSH failed (TBox offline?): " + e2.getMessage());
                        if (channelExec != null) {
                        }
                        if (session == null) {
                        }
                        session.disconnect();
                        return;
                    } catch (IOException e6) {
                        e = e6;
                        channelExec = null;
                        e2 = e;
                        session = session;
                        Log.w("T500_Split:TBox", "SSH failed (TBox offline?): " + e2.getMessage());
                        if (channelExec != null) {
                        }
                        if (session == null) {
                        }
                        session.disconnect();
                        return;
                    } catch (Throwable th3) {
                        channel = null;
                        th = th3;
                        session2 = session;
                        if (channel != null) {
                            try {
                                channel.disconnect();
                            } catch (Exception unused4) {
                            }
                        }
                        if (session2 == 0) {
                            throw th;
                        }
                        try {
                            session2.disconnect();
                            throw th;
                        } catch (Exception unused5) {
                            throw th;
                        }
                    }
                } catch (JSchException e7) {
                    e = e7;
                    channelExec = null;
                    e2 = e;
                    session = null;
                    Log.w("T500_Split:TBox", "SSH failed (TBox offline?): " + e2.getMessage());
                    if (channelExec != null) {
                    }
                    if (session == null) {
                    }
                    session.disconnect();
                    return;
                } catch (IOException e8) {
                    e = e8;
                    channelExec = null;
                    e2 = e;
                    session = null;
                    Log.w("T500_Split:TBox", "SSH failed (TBox offline?): " + e2.getMessage());
                    if (channelExec != null) {
                    }
                    if (session == null) {
                    }
                    session.disconnect();
                    return;
                } catch (Throwable th4) {
                    channel = null;
                    th = th4;
                    session2 = 0;
                }
                while (true) {
                    if (inputStream.available() > 0 && (read = inputStream.read(bArr, 0, 1024)) >= 0) {
                        new String(bArr, 0, read);
                    }
                    if (channelExec.isClosed()) {
                        if (inputStream.available() > 0) {
                        }
                        try {
                            channelExec.disconnect();
                        } catch (Exception unused6) {
                        }
                        session.disconnect();
                        return;
                    }
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException unused7) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
        }
    }
}
