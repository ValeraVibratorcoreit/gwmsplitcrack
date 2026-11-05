package com.jcraft.jsch;

import com.jcraft.jsch.ConfigRepository;
import com.jcraft.jsch.IdentityRepository;
import com.sun.jna.Function;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import p006C.AbstractC0062j;
import p109u0.AbstractC1561o;

/* loaded from: classes.dex */
public class Session implements Runnable {
    private static final int PACKET_MAX_SIZE = 262144;
    static final int SSH_MSG_CHANNEL_CLOSE = 97;
    static final int SSH_MSG_CHANNEL_DATA = 94;
    static final int SSH_MSG_CHANNEL_EOF = 96;
    static final int SSH_MSG_CHANNEL_EXTENDED_DATA = 95;
    static final int SSH_MSG_CHANNEL_FAILURE = 100;
    static final int SSH_MSG_CHANNEL_OPEN = 90;
    static final int SSH_MSG_CHANNEL_OPEN_CONFIRMATION = 91;
    static final int SSH_MSG_CHANNEL_OPEN_FAILURE = 92;
    static final int SSH_MSG_CHANNEL_REQUEST = 98;
    static final int SSH_MSG_CHANNEL_SUCCESS = 99;
    static final int SSH_MSG_CHANNEL_WINDOW_ADJUST = 93;
    static final int SSH_MSG_DEBUG = 4;
    static final int SSH_MSG_DISCONNECT = 1;
    static final int SSH_MSG_GLOBAL_REQUEST = 80;
    static final int SSH_MSG_IGNORE = 2;
    static final int SSH_MSG_KEXDH_INIT = 30;
    static final int SSH_MSG_KEXDH_REPLY = 31;
    static final int SSH_MSG_KEXINIT = 20;
    static final int SSH_MSG_KEX_DH_GEX_GROUP = 31;
    static final int SSH_MSG_KEX_DH_GEX_INIT = 32;
    static final int SSH_MSG_KEX_DH_GEX_REPLY = 33;
    static final int SSH_MSG_KEX_DH_GEX_REQUEST = 34;
    static final int SSH_MSG_NEWKEYS = 21;
    static final int SSH_MSG_REQUEST_FAILURE = 82;
    static final int SSH_MSG_REQUEST_SUCCESS = 81;
    static final int SSH_MSG_SERVICE_ACCEPT = 6;
    static final int SSH_MSG_SERVICE_REQUEST = 5;
    static final int SSH_MSG_UNIMPLEMENTED = 3;
    static final int buffer_margin = 128;
    private static final byte[] keepalivemsg = Util.str2byte("keepalive@jcraft.com");
    private static final byte[] nomoresessions = Util.str2byte("no-more-sessions@openssh.com");
    static Random random;
    private byte[] Ec2s;
    private byte[] Es2c;
    private byte[] IVc2s;
    private byte[] IVs2c;
    private byte[] I_C;
    private byte[] I_S;
    private byte[] K_S;
    private byte[] MACc2s;
    private byte[] MACs2c;
    private byte[] V_S;
    Buffer buf;
    private Cipher c2scipher;
    private MAC c2smac;
    private Compression deflater;
    String host;
    private Compression inflater;

    /* renamed from: io */
    private C0701IO f3797io;
    JSch jsch;
    String org_host;
    Packet packet;
    int port;
    private Cipher s2ccipher;
    private MAC s2cmac;
    private byte[] s2cmac_result1;
    private byte[] s2cmac_result2;
    private byte[] session_id;
    private Socket socket;
    Runnable thread;
    private UserInfo userinfo;
    String username;
    private byte[] V_C = Util.str2byte("SSH-2.0-JSCH-0.1.54");
    private int seqi = 0;
    private int seqo = 0;
    String[] guess = null;
    private int timeout = 0;
    private volatile boolean isConnected = false;
    private boolean isAuthed = false;
    private Thread connectThread = null;
    private Object lock = new Object();
    boolean x11_forwarding = false;
    boolean agent_forwarding = false;

    /* renamed from: in */
    InputStream f3796in = null;
    OutputStream out = null;
    SocketFactory socket_factory = null;
    private Hashtable config = null;
    private Proxy proxy = null;
    private String hostKeyAlias = null;
    private int serverAliveInterval = 0;
    private int serverAliveCountMax = 1;
    private IdentityRepository identityRepository = null;
    private HostKeyRepository hostkeyRepository = null;
    protected boolean daemon_thread = false;
    private long kex_start_time = 0;
    int max_auth_tries = 6;
    int auth_failures = 0;
    byte[] password = null;
    private volatile boolean in_kex = false;
    private volatile boolean in_prompt = false;
    int[] uncompress_len = new int[1];
    int[] compress_len = new int[1];
    private int s2ccipher_size = 8;
    private int c2scipher_size = 8;
    private GlobalRequestReply grr = new GlobalRequestReply();
    private HostKey hostkey = null;

    public class Forwarding {
        String bind_address;
        String host;
        int hostport;
        int port;

        private Forwarding() {
            this.bind_address = null;
            this.port = -1;
            this.host = null;
            this.hostport = -1;
        }
    }

    public class GlobalRequestReply {
        private int port;
        private int reply;
        private Thread thread;

        private GlobalRequestReply() {
            this.thread = null;
            this.reply = -1;
            this.port = 0;
        }

        public int getPort() {
            return this.port;
        }

        public int getReply() {
            return this.reply;
        }

        public Thread getThread() {
            return this.thread;
        }

        public void setPort(int i) {
            this.port = i;
        }

        public void setReply(int i) {
            this.reply = i;
        }

        public void setThread(Thread thread) {
            this.thread = thread;
            this.reply = -1;
        }
    }

    public Session(JSch jSch, String str, String str2, int i) {
        this.host = "127.0.0.1";
        this.org_host = "127.0.0.1";
        this.port = 22;
        this.username = null;
        this.jsch = jSch;
        Buffer buffer = new Buffer();
        this.buf = buffer;
        this.packet = new Packet(buffer);
        this.username = str;
        this.host = str2;
        this.org_host = str2;
        this.port = i;
        applyConfig();
        if (this.username == null) {
            try {
                this.username = (String) System.getProperties().get("user.name");
            } catch (SecurityException unused) {
            }
        }
        if (this.username == null) {
            throw new JSchException("username is not given.");
        }
    }

    private int _setPortForwardingR(String str, int i) {
        int port;
        synchronized (this.grr) {
            Buffer buffer = new Buffer(SSH_MSG_CHANNEL_FAILURE);
            Packet packet = new Packet(buffer);
            String normalize = ChannelForwardedTCPIP.normalize(str);
            this.grr.setThread(Thread.currentThread());
            this.grr.setPort(i);
            try {
                packet.reset();
                buffer.putByte((byte) 80);
                buffer.putString(Util.str2byte("tcpip-forward"));
                buffer.putByte((byte) 1);
                buffer.putString(Util.str2byte(normalize));
                buffer.putInt(i);
                write(packet);
                int reply = this.grr.getReply();
                int i2 = 0;
                while (i2 < 10 && reply == -1) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused) {
                    }
                    i2++;
                    reply = this.grr.getReply();
                }
                this.grr.setThread(null);
                if (reply != 1) {
                    throw new JSchException("remote port forwarding failed for listen port " + i);
                }
                port = this.grr.getPort();
            } catch (Exception e2) {
                this.grr.setThread(null);
                throw new JSchException(e2.toString(), e2);
            }
        }
        return port;
    }

    private void _write(Packet packet) {
        synchronized (this.lock) {
            try {
                encode(packet);
                C0701IO c0701io = this.f3797io;
                if (c0701io != null) {
                    c0701io.put(packet);
                    this.seqo++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void applyConfig() {
        String user;
        ConfigRepository configRepository = this.jsch.getConfigRepository();
        if (configRepository == null) {
            return;
        }
        ConfigRepository.Config config = configRepository.getConfig(this.org_host);
        if (this.username == null && (user = config.getUser()) != null) {
            this.username = user;
        }
        String hostname = config.getHostname();
        if (hostname != null) {
            this.host = hostname;
        }
        int port = config.getPort();
        if (port != -1) {
            this.port = port;
        }
        checkConfig(config, "kex");
        checkConfig(config, "server_host_key");
        checkConfig(config, "cipher.c2s");
        checkConfig(config, "cipher.s2c");
        checkConfig(config, "mac.c2s");
        checkConfig(config, "mac.s2c");
        checkConfig(config, "compression.c2s");
        checkConfig(config, "compression.s2c");
        checkConfig(config, "compression_level");
        checkConfig(config, "StrictHostKeyChecking");
        checkConfig(config, "HashKnownHosts");
        checkConfig(config, "PreferredAuthentications");
        checkConfig(config, "MaxAuthTries");
        checkConfig(config, "ClearAllForwardings");
        String value = config.getValue("HostKeyAlias");
        if (value != null) {
            setHostKeyAlias(value);
        }
        String value2 = config.getValue("UserKnownHostsFile");
        if (value2 != null) {
            KnownHosts knownHosts = new KnownHosts(this.jsch);
            knownHosts.setKnownHosts(value2);
            setHostKeyRepository(knownHosts);
        }
        String[] values = config.getValues("IdentityFile");
        if (values != null) {
            String[] values2 = configRepository.getConfig("").getValues("IdentityFile");
            if (values2 != null) {
                for (String str : values2) {
                    this.jsch.addIdentity(str);
                }
            } else {
                values2 = new String[0];
            }
            if (values.length - values2.length > 0) {
                IdentityRepository.Wrapper wrapper = new IdentityRepository.Wrapper(this.jsch.getIdentityRepository(), true);
                for (String str2 : values) {
                    int i = 0;
                    while (true) {
                        if (i >= values2.length) {
                            break;
                        }
                        if (str2.equals(values2[i])) {
                            str2 = null;
                            break;
                        }
                        i++;
                    }
                    if (str2 != null) {
                        wrapper.add(IdentityFile.newInstance(str2, null, this.jsch));
                    }
                }
                setIdentityRepository(wrapper);
            }
        }
        String value3 = config.getValue("ServerAliveInterval");
        if (value3 != null) {
            try {
                setServerAliveInterval(Integer.parseInt(value3));
            } catch (NumberFormatException unused) {
            }
        }
        String value4 = config.getValue("ConnectTimeout");
        if (value4 != null) {
            try {
                setTimeout(Integer.parseInt(value4));
            } catch (NumberFormatException unused2) {
            }
        }
        String value5 = config.getValue("MaxAuthTries");
        if (value5 != null) {
            setConfig("MaxAuthTries", value5);
        }
        String value6 = config.getValue("ClearAllForwardings");
        if (value6 != null) {
            setConfig("ClearAllForwardings", value6);
        }
    }

    private void applyConfigChannel(ChannelSession channelSession) {
        ConfigRepository configRepository = this.jsch.getConfigRepository();
        if (configRepository == null) {
            return;
        }
        ConfigRepository.Config config = configRepository.getConfig(this.org_host);
        String value = config.getValue("ForwardAgent");
        if (value != null) {
            channelSession.setAgentForwarding(value.equals("yes"));
        }
        String value2 = config.getValue("RequestTTY");
        if (value2 != null) {
            channelSession.setPty(value2.equals("yes"));
        }
    }

    public static boolean checkCipher(String str) {
        try {
            Cipher cipher = (Cipher) Class.forName(str).newInstance();
            cipher.init(0, new byte[cipher.getBlockSize()], new byte[cipher.getIVSize()]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String[] checkCiphers(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "CheckCiphers: ".concat(str));
            }
            String config = getConfig("cipher.c2s");
            String config2 = getConfig("cipher.s2c");
            Vector vector = new Vector();
            for (String str2 : Util.split(str, ",")) {
                if ((config2.indexOf(str2) != -1 || config.indexOf(str2) != -1) && !checkCipher(getConfig(str2))) {
                    vector.addElement(str2);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (JSch.getLogger().isEnabled(1)) {
                for (int i = 0; i < size; i++) {
                    JSch.getLogger().log(1, strArr[i] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private void checkConfig(ConfigRepository.Config config, String str) {
        String value = config.getValue(str);
        if (value != null) {
            setConfig(str, value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkHost(String str, int i, KeyExchange keyExchange) {
        int check;
        String knownHostsRepositoryID;
        boolean z2;
        boolean z3;
        String config = getConfig("StrictHostKeyChecking");
        String str2 = this.hostKeyAlias;
        if (str2 != null) {
            str = str2;
        }
        byte[] hostKey = keyExchange.getHostKey();
        String keyType = keyExchange.getKeyType();
        String fingerPrint = keyExchange.getFingerPrint();
        if (this.hostKeyAlias == null && i != 22) {
            str = "[" + str + "]:" + i;
        }
        HostKeyRepository hostKeyRepository = getHostKeyRepository();
        if (getConfig("HashKnownHosts").equals("yes") && (hostKeyRepository instanceof KnownHosts)) {
            this.hostkey = ((KnownHosts) hostKeyRepository).createHashedHostKey(str, hostKey);
        } else {
            this.hostkey = new HostKey(str, hostKey);
        }
        synchronized (hostKeyRepository) {
            check = hostKeyRepository.check(str, hostKey);
        }
        if ((config.equals("ask") || config.equals("yes")) && check == 2) {
            synchronized (hostKeyRepository) {
                knownHostsRepositoryID = hostKeyRepository.getKnownHostsRepositoryID();
            }
            if (knownHostsRepositoryID == null) {
                knownHostsRepositoryID = "known_hosts";
            }
            if (this.userinfo != null) {
                StringBuilder sb = new StringBuilder("WARNING: REMOTE HOST IDENTIFICATION HAS CHANGED!\nIT IS POSSIBLE THAT SOMEONE IS DOING SOMETHING NASTY!\nSomeone could be eavesdropping on you right now (man-in-the-middle attack)!\nIt is also possible that the ");
                sb.append(keyType);
                sb.append(" host key has just been changed.\nThe fingerprint for the ");
                sb.append(keyType);
                sb.append(" key sent by the remote host ");
                sb.append(str);
                sb.append(" is\n");
                sb.append(fingerPrint);
                sb.append(".\nPlease contact your system administrator.\nAdd correct host key in ");
                String m162p = AbstractC0062j.m162p(sb, knownHostsRepositoryID, " to get rid of this message.");
                if (config.equals("ask")) {
                    z2 = this.userinfo.promptYesNo(m162p + "\nDo you want to delete the old key and insert the new key?");
                    if (z2) {
                        throw new JSchException(AbstractC1561o.m4299c("HostKey has been changed: ", str));
                    }
                    synchronized (hostKeyRepository) {
                        hostKeyRepository.remove(str, keyExchange.getKeyAlgorithName(), null);
                    }
                    z3 = true;
                } else {
                    this.userinfo.showMessage(m162p);
                }
            }
            z2 = false;
            if (z2) {
            }
        } else {
            z3 = false;
        }
        if ((config.equals("ask") || config.equals("yes")) && check != 0 && !z3) {
            if (config.equals("yes")) {
                throw new JSchException("reject HostKey: " + this.host);
            }
            UserInfo userInfo = this.userinfo;
            if (userInfo == null) {
                if (check != 1) {
                    throw new JSchException("HostKey has been changed: " + this.host);
                }
                throw new JSchException("UnknownHostKey: " + this.host + ". " + keyType + " key fingerprint is " + fingerPrint);
            }
            if (!userInfo.promptYesNo("The authenticity of host '" + this.host + "' can't be established.\n" + keyType + " key fingerprint is " + fingerPrint + ".\nAre you sure you want to continue connecting?")) {
                throw new JSchException("reject HostKey: " + this.host);
            }
            z3 = true;
        }
        if (config.equals("no") && 1 == check) {
            z3 = true;
        }
        if (check == 0) {
            HostKey[] hostKey2 = hostKeyRepository.getHostKey(str, keyExchange.getKeyAlgorithName());
            String byte2str = Util.byte2str(Util.toBase64(hostKey, 0, hostKey.length));
            for (HostKey hostKey3 : hostKey2) {
                if (hostKey2[check].getKey().equals(byte2str) && hostKey3.getMarker().equals("@revoked")) {
                    UserInfo userInfo2 = this.userinfo;
                    if (userInfo2 != null) {
                        StringBuilder m163q = AbstractC0062j.m163q("The ", keyType, " host key for ");
                        m163q.append(this.host);
                        m163q.append(" is marked as revoked.\nThis could mean that a stolen key is being used to impersonate this host.");
                        userInfo2.showMessage(m163q.toString());
                    }
                    if (JSch.getLogger().isEnabled(1)) {
                        JSch.getLogger().log(1, "Host '" + this.host + "' has provided revoked key.");
                    }
                    throw new JSchException("revoked HostKey: " + this.host);
                }
            }
        }
        if (check == 0 && JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "Host '" + this.host + "' is known and matches the " + keyType + " host key");
        }
        if (z3 && JSch.getLogger().isEnabled(2)) {
            JSch.getLogger().log(2, "Permanently added '" + this.host + "' (" + keyType + ") to the list of known hosts.");
        }
        if (z3) {
            synchronized (hostKeyRepository) {
                hostKeyRepository.add(this.hostkey, this.userinfo);
            }
        }
    }

    public static boolean checkKex(Session session, String str) {
        try {
            ((KeyExchange) Class.forName(str).newInstance()).init(session, null, null, null, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String[] checkKexes(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "CheckKexes: ".concat(str));
            }
            Vector vector = new Vector();
            String[] split = Util.split(str, ",");
            for (int i = 0; i < split.length; i++) {
                if (!checkKex(this, getConfig(split[i]))) {
                    vector.addElement(split[i]);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (JSch.getLogger().isEnabled(1)) {
                for (int i2 = 0; i2 < size; i2++) {
                    JSch.getLogger().log(1, strArr[i2] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private String[] checkSignatures(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "CheckSignatures: ".concat(str));
            }
            Vector vector = new Vector();
            String[] split = Util.split(str, ",");
            for (int i = 0; i < split.length; i++) {
                try {
                    ((Signature) Class.forName(JSch.getConfig(split[i])).newInstance()).init();
                } catch (Exception unused) {
                    vector.addElement(split[i]);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (JSch.getLogger().isEnabled(1)) {
                for (int i2 = 0; i2 < size; i2++) {
                    JSch.getLogger().log(1, strArr[i2] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private byte[] expandKey(Buffer buffer, byte[] bArr, byte[] bArr2, byte[] bArr3, HASH hash, int i) {
        int blockSize = hash.getBlockSize();
        while (bArr3.length < i) {
            buffer.reset();
            buffer.putMPInt(bArr);
            buffer.putByte(bArr2);
            buffer.putByte(bArr3);
            hash.update(buffer.buffer, 0, buffer.index);
            byte[] bArr4 = new byte[bArr3.length + blockSize];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(hash.digest(), 0, bArr4, bArr3.length, blockSize);
            Util.bzero(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    private void initDeflater(String str) {
        int i;
        if (str.equals("none")) {
            this.deflater = null;
            return;
        }
        String config = getConfig(str);
        if (config != null) {
            if (str.equals("zlib") || (this.isAuthed && str.equals("zlib@openssh.com"))) {
                try {
                    try {
                        this.deflater = (Compression) Class.forName(config).newInstance();
                        try {
                            i = Integer.parseInt(getConfig("compression_level"));
                        } catch (Exception unused) {
                            i = 6;
                        }
                        this.deflater.init(1, i);
                    } catch (NoClassDefFoundError e2) {
                        throw new JSchException(e2.toString(), e2);
                    }
                } catch (Exception e3) {
                    throw new JSchException(e3.toString(), e3);
                }
            }
        }
    }

    private void initInflater(String str) {
        if (str.equals("none")) {
            this.inflater = null;
            return;
        }
        String config = getConfig(str);
        if (config != null) {
            if (str.equals("zlib") || (this.isAuthed && str.equals("zlib@openssh.com"))) {
                try {
                    Compression compression = (Compression) Class.forName(config).newInstance();
                    this.inflater = compression;
                    compression.init(0, 0);
                } catch (Exception e2) {
                    throw new JSchException(e2.toString(), e2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Forwarding parseForwarding(String str) {
        String[] split = str.split(" ");
        if (split.length > 1) {
            Vector vector = new Vector();
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() != 0) {
                    vector.addElement(split[i].trim());
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = 0;
            while (i2 < vector.size()) {
                stringBuffer.append((String) vector.elementAt(i2));
                i2++;
                if (i2 < vector.size()) {
                    stringBuffer.append(":");
                }
            }
            str = stringBuffer.toString();
        }
        Forwarding forwarding = new Forwarding();
        try {
            if (str.lastIndexOf(":") == -1) {
                throw new JSchException("parseForwarding: " + str);
            }
            forwarding.hostport = Integer.parseInt(str.substring(str.lastIndexOf(":") + 1));
            String substring = str.substring(0, str.lastIndexOf(":"));
            if (substring.lastIndexOf(":") == -1) {
                throw new JSchException("parseForwarding: " + str);
            }
            forwarding.host = substring.substring(substring.lastIndexOf(":") + 1);
            String substring2 = substring.substring(0, substring.lastIndexOf(":"));
            String str2 = "127.0.0.1";
            if (substring2.lastIndexOf(":") != -1) {
                forwarding.port = Integer.parseInt(substring2.substring(substring2.lastIndexOf(":") + 1));
                String substring3 = substring2.substring(0, substring2.lastIndexOf(":"));
                if (substring3.length() != 0) {
                    if (substring3.equals("*")) {
                    }
                    if (substring3.equals("localhost")) {
                        str2 = substring3;
                    }
                    forwarding.bind_address = str2;
                }
                substring3 = "0.0.0.0";
                if (substring3.equals("localhost")) {
                }
                forwarding.bind_address = str2;
            } else {
                forwarding.port = Integer.parseInt(substring2);
                forwarding.bind_address = "127.0.0.1";
            }
            return forwarding;
        } catch (NumberFormatException e2) {
            throw new JSchException("parseForwarding: " + e2.toString());
        }
    }

    private KeyExchange receive_kexinit(Buffer buffer) {
        int i = buffer.getInt();
        if (i != buffer.getLength()) {
            buffer.getByte();
            this.I_S = new byte[buffer.index - 5];
        } else {
            this.I_S = new byte[(i - 1) - buffer.getByte()];
        }
        byte[] bArr = buffer.buffer;
        int i2 = buffer.f3765s;
        byte[] bArr2 = this.I_S;
        System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
        if (!this.in_kex) {
            send_kexinit();
        }
        String[] guess = KeyExchange.guess(this.I_S, this.I_C);
        this.guess = guess;
        if (guess == null) {
            throw new JSchException("Algorithm negotiation fail");
        }
        if (!this.isAuthed && (guess[2].equals("none") || this.guess[3].equals("none"))) {
            throw new JSchException("NONE Cipher should not be chosen before authentification is successed.");
        }
        try {
            KeyExchange keyExchange = (KeyExchange) Class.forName(getConfig(this.guess[0])).newInstance();
            keyExchange.init(this, this.V_S, this.V_C, this.I_S, this.I_C);
            return keyExchange;
        } catch (Exception e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    private void receive_newkeys(Buffer buffer, KeyExchange keyExchange) {
        updateKeys(keyExchange);
        this.in_kex = false;
    }

    private void requestPortForwarding() {
        ConfigRepository configRepository;
        if (getConfig("ClearAllForwardings").equals("yes") || (configRepository = this.jsch.getConfigRepository()) == null) {
            return;
        }
        ConfigRepository.Config config = configRepository.getConfig(this.org_host);
        String[] values = config.getValues("LocalForward");
        if (values != null) {
            for (String str : values) {
                setPortForwardingL(str);
            }
        }
        String[] values2 = config.getValues("RemoteForward");
        if (values2 != null) {
            for (String str2 : values2) {
                setPortForwardingR(str2);
            }
        }
    }

    private void send_kexinit() {
        if (this.in_kex) {
            return;
        }
        String config = getConfig("cipher.c2s");
        String config2 = getConfig("cipher.s2c");
        String[] checkCiphers = checkCiphers(getConfig("CheckCiphers"));
        if (checkCiphers != null && checkCiphers.length > 0) {
            config = Util.diffString(config, checkCiphers);
            config2 = Util.diffString(config2, checkCiphers);
            if (config == null || config2 == null) {
                throw new JSchException("There are not any available ciphers.");
            }
        }
        String config3 = getConfig("kex");
        String[] checkKexes = checkKexes(getConfig("CheckKexes"));
        if (checkKexes != null && checkKexes.length > 0 && (config3 = Util.diffString(config3, checkKexes)) == null) {
            throw new JSchException("There are not any available kexes.");
        }
        String config4 = getConfig("server_host_key");
        String[] checkSignatures = checkSignatures(getConfig("CheckSignatures"));
        if (checkSignatures != null && checkSignatures.length > 0 && (config4 = Util.diffString(config4, checkSignatures)) == null) {
            throw new JSchException("There are not any available sig algorithm.");
        }
        this.in_kex = true;
        this.kex_start_time = System.currentTimeMillis();
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 20);
        synchronized (random) {
            random.fill(buffer.buffer, buffer.index, 16);
            buffer.skip(16);
        }
        buffer.putString(Util.str2byte(config3));
        buffer.putString(Util.str2byte(config4));
        buffer.putString(Util.str2byte(config));
        buffer.putString(Util.str2byte(config2));
        buffer.putString(Util.str2byte(getConfig("mac.c2s")));
        buffer.putString(Util.str2byte(getConfig("mac.s2c")));
        buffer.putString(Util.str2byte(getConfig("compression.c2s")));
        buffer.putString(Util.str2byte(getConfig("compression.s2c")));
        buffer.putString(Util.str2byte(getConfig("lang.c2s")));
        buffer.putString(Util.str2byte(getConfig("lang.s2c")));
        buffer.putByte((byte) 0);
        buffer.putInt(0);
        buffer.setOffSet(5);
        byte[] bArr = new byte[buffer.getLength()];
        this.I_C = bArr;
        buffer.getByte(bArr);
        write(packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_KEXINIT sent");
        }
    }

    private void send_newkeys() {
        this.packet.reset();
        this.buf.putByte((byte) 21);
        write(this.packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_NEWKEYS sent");
        }
    }

    private void start_discard(Buffer buffer, Cipher cipher, MAC mac, int i, int i2) {
        if (!cipher.isCBC()) {
            throw new JSchException("Packet corrupt");
        }
        if (i == PACKET_MAX_SIZE || mac == null) {
            mac = null;
        }
        int i3 = i2 - buffer.index;
        while (i3 > 0) {
            buffer.reset();
            byte[] bArr = buffer.buffer;
            int length = i3 > bArr.length ? bArr.length : i3;
            this.f3797io.getByte(bArr, 0, length);
            if (mac != null) {
                mac.update(buffer.buffer, 0, length);
            }
            i3 -= length;
        }
        if (mac != null) {
            mac.doFinal(buffer.buffer, 0);
        }
        throw new JSchException("Packet corrupt");
    }

    private void updateKeys(KeyExchange keyExchange) {
        byte[] bArr;
        byte[] k2 = keyExchange.getK();
        byte[] h = keyExchange.getH();
        HASH hash = keyExchange.getHash();
        if (this.session_id == null) {
            byte[] bArr2 = new byte[h.length];
            this.session_id = bArr2;
            System.arraycopy(h, 0, bArr2, 0, h.length);
        }
        this.buf.reset();
        this.buf.putMPInt(k2);
        this.buf.putByte(h);
        this.buf.putByte((byte) 65);
        this.buf.putByte(this.session_id);
        Buffer buffer = this.buf;
        hash.update(buffer.buffer, 0, buffer.index);
        this.IVc2s = hash.digest();
        Buffer buffer2 = this.buf;
        int i = buffer2.index;
        int length = (i - this.session_id.length) - 1;
        byte[] bArr3 = buffer2.buffer;
        bArr3[length] = (byte) (bArr3[length] + 1);
        hash.update(bArr3, 0, i);
        this.IVs2c = hash.digest();
        Buffer buffer3 = this.buf;
        byte[] bArr4 = buffer3.buffer;
        bArr4[length] = (byte) (bArr4[length] + 1);
        hash.update(bArr4, 0, buffer3.index);
        this.Ec2s = hash.digest();
        Buffer buffer4 = this.buf;
        byte[] bArr5 = buffer4.buffer;
        bArr5[length] = (byte) (bArr5[length] + 1);
        hash.update(bArr5, 0, buffer4.index);
        this.Es2c = hash.digest();
        Buffer buffer5 = this.buf;
        byte[] bArr6 = buffer5.buffer;
        bArr6[length] = (byte) (bArr6[length] + 1);
        hash.update(bArr6, 0, buffer5.index);
        this.MACc2s = hash.digest();
        Buffer buffer6 = this.buf;
        byte[] bArr7 = buffer6.buffer;
        bArr7[length] = (byte) (bArr7[length] + 1);
        hash.update(bArr7, 0, buffer6.index);
        this.MACs2c = hash.digest();
        try {
            this.s2ccipher = (Cipher) Class.forName(getConfig(this.guess[3])).newInstance();
            while (true) {
                int blockSize = this.s2ccipher.getBlockSize();
                bArr = this.Es2c;
                if (blockSize <= bArr.length) {
                    break;
                }
                this.buf.reset();
                this.buf.putMPInt(k2);
                this.buf.putByte(h);
                this.buf.putByte(this.Es2c);
                Buffer buffer7 = this.buf;
                hash.update(buffer7.buffer, 0, buffer7.index);
                byte[] digest = hash.digest();
                byte[] bArr8 = this.Es2c;
                byte[] bArr9 = new byte[bArr8.length + digest.length];
                System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                System.arraycopy(digest, 0, bArr9, this.Es2c.length, digest.length);
                this.Es2c = bArr9;
            }
            this.s2ccipher.init(1, bArr, this.IVs2c);
            this.s2ccipher_size = this.s2ccipher.getIVSize();
            MAC mac = (MAC) Class.forName(getConfig(this.guess[5])).newInstance();
            this.s2cmac = mac;
            byte[] expandKey = expandKey(this.buf, k2, h, this.MACs2c, hash, mac.getBlockSize());
            this.MACs2c = expandKey;
            this.s2cmac.init(expandKey);
            this.s2cmac_result1 = new byte[this.s2cmac.getBlockSize()];
            this.s2cmac_result2 = new byte[this.s2cmac.getBlockSize()];
            this.c2scipher = (Cipher) Class.forName(getConfig(this.guess[2])).newInstance();
            while (true) {
                int blockSize2 = this.c2scipher.getBlockSize();
                byte[] bArr10 = this.Ec2s;
                if (blockSize2 <= bArr10.length) {
                    this.c2scipher.init(0, bArr10, this.IVc2s);
                    this.c2scipher_size = this.c2scipher.getIVSize();
                    MAC mac2 = (MAC) Class.forName(getConfig(this.guess[4])).newInstance();
                    this.c2smac = mac2;
                    byte[] expandKey2 = expandKey(this.buf, k2, h, this.MACc2s, hash, mac2.getBlockSize());
                    this.MACc2s = expandKey2;
                    this.c2smac.init(expandKey2);
                    initDeflater(this.guess[6]);
                    initInflater(this.guess[7]);
                    return;
                }
                this.buf.reset();
                this.buf.putMPInt(k2);
                this.buf.putByte(h);
                this.buf.putByte(this.Ec2s);
                Buffer buffer8 = this.buf;
                hash.update(buffer8.buffer, 0, buffer8.index);
                byte[] digest2 = hash.digest();
                byte[] bArr11 = this.Ec2s;
                byte[] bArr12 = new byte[bArr11.length + digest2.length];
                System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                System.arraycopy(digest2, 0, bArr12, this.Ec2s.length, digest2.length);
                this.Ec2s = bArr12;
            }
        } catch (Exception e2) {
            if (!(e2 instanceof JSchException)) {
                throw new JSchException(e2.toString(), e2);
            }
            throw e2;
        }
    }

    public void addChannel(Channel channel) {
        channel.setSession(this);
    }

    public void connect() {
        connect(this.timeout);
    }

    public void delPortForwardingL(int i) {
        delPortForwardingL("127.0.0.1", i);
    }

    public void delPortForwardingR(int i) {
        delPortForwardingR(null, i);
    }

    public void disconnect() {
        if (this.isConnected) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "Disconnecting from " + this.host + " port " + this.port);
            }
            Channel.disconnect(this);
            this.isConnected = false;
            PortWatcher.delPort(this);
            ChannelForwardedTCPIP.delPort(this);
            ChannelX11.removeFakedCookie(this);
            synchronized (this.lock) {
                try {
                    if (this.connectThread != null) {
                        Thread.yield();
                        this.connectThread.interrupt();
                        this.connectThread = null;
                    }
                } finally {
                }
            }
            this.thread = null;
            try {
                C0701IO c0701io = this.f3797io;
                if (c0701io != null) {
                    InputStream inputStream = c0701io.f3785in;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    OutputStream outputStream = this.f3797io.out;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    OutputStream outputStream2 = this.f3797io.out_ext;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                }
                Proxy proxy = this.proxy;
                if (proxy == null) {
                    Socket socket = this.socket;
                    if (socket != null) {
                        socket.close();
                    }
                } else {
                    synchronized (proxy) {
                        this.proxy.close();
                    }
                    this.proxy = null;
                }
            } catch (Exception unused) {
            }
            this.f3797io = null;
            this.socket = null;
            this.jsch.removeSession(this);
        }
    }

    public void encode(Packet packet) {
        Compression compression = this.deflater;
        if (compression != null) {
            int[] iArr = this.compress_len;
            Buffer buffer = packet.buffer;
            iArr[0] = buffer.index;
            buffer.buffer = compression.compress(buffer.buffer, 5, iArr);
            packet.buffer.index = this.compress_len[0];
        }
        if (this.c2scipher != null) {
            packet.padding(this.c2scipher_size);
            byte b2 = packet.buffer.buffer[4];
            synchronized (random) {
                Random random2 = random;
                Buffer buffer2 = packet.buffer;
                random2.fill(buffer2.buffer, buffer2.index - b2, b2);
            }
        } else {
            packet.padding(8);
        }
        MAC mac = this.c2smac;
        if (mac != null) {
            mac.update(this.seqo);
            MAC mac2 = this.c2smac;
            Buffer buffer3 = packet.buffer;
            mac2.update(buffer3.buffer, 0, buffer3.index);
            MAC mac3 = this.c2smac;
            Buffer buffer4 = packet.buffer;
            mac3.doFinal(buffer4.buffer, buffer4.index);
        }
        Cipher cipher = this.c2scipher;
        if (cipher != null) {
            Buffer buffer5 = packet.buffer;
            byte[] bArr = buffer5.buffer;
            cipher.update(bArr, 0, buffer5.index, bArr, 0);
        }
        MAC mac4 = this.c2smac;
        if (mac4 != null) {
            packet.buffer.skip(mac4.getBlockSize());
        }
    }

    public String getClientVersion() {
        return Util.byte2str(this.V_C);
    }

    public String getConfig(String str) {
        Hashtable hashtable = this.config;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String config = JSch.getConfig(str);
        if (config != null) {
            return config;
        }
        return null;
    }

    public String getHost() {
        return this.host;
    }

    public HostKey getHostKey() {
        return this.hostkey;
    }

    public String getHostKeyAlias() {
        return this.hostKeyAlias;
    }

    public HostKeyRepository getHostKeyRepository() {
        HostKeyRepository hostKeyRepository = this.hostkeyRepository;
        return hostKeyRepository == null ? this.jsch.getHostKeyRepository() : hostKeyRepository;
    }

    public IdentityRepository getIdentityRepository() {
        IdentityRepository identityRepository = this.identityRepository;
        return identityRepository == null ? this.jsch.getIdentityRepository() : identityRepository;
    }

    public int getPort() {
        return this.port;
    }

    public String[] getPortForwardingL() {
        return PortWatcher.getPortForwarding(this);
    }

    public String[] getPortForwardingR() {
        return ChannelForwardedTCPIP.getPortForwarding(this);
    }

    public int getServerAliveCountMax() {
        return this.serverAliveCountMax;
    }

    public int getServerAliveInterval() {
        return this.serverAliveInterval;
    }

    public String getServerVersion() {
        return Util.byte2str(this.V_S);
    }

    public byte[] getSessionId() {
        return this.session_id;
    }

    public Channel getStreamForwarder(String str, int i) {
        ChannelDirectTCPIP channelDirectTCPIP = new ChannelDirectTCPIP();
        channelDirectTCPIP.init();
        addChannel(channelDirectTCPIP);
        channelDirectTCPIP.setHost(str);
        channelDirectTCPIP.setPort(i);
        return channelDirectTCPIP;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public UserInfo getUserInfo() {
        return this.userinfo;
    }

    public String getUserName() {
        return this.username;
    }

    public boolean isConnected() {
        return this.isConnected;
    }

    public void noMoreSessionChannels() {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 80);
        buffer.putString(nomoresessions);
        buffer.putByte((byte) 0);
        write(packet);
    }

    public Channel openChannel(String str) {
        if (!this.isConnected) {
            throw new JSchException("session is down");
        }
        try {
            Channel channel = Channel.getChannel(str);
            addChannel(channel);
            channel.init();
            if (channel instanceof ChannelSession) {
                applyConfigChannel((ChannelSession) channel);
            }
            return channel;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d0, code lost:
    
        r22.rewind();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d3, code lost:
    
        return r22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0118 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Buffer read(Buffer buffer) {
        char c2;
        int i;
        MAC mac;
        Compression compression;
        int command;
        while (true) {
            buffer.reset();
            this.f3797io.getByte(buffer.buffer, buffer.index, this.s2ccipher_size);
            int i2 = buffer.index;
            int i3 = this.s2ccipher_size;
            buffer.index = i2 + i3;
            Cipher cipher = this.s2ccipher;
            if (cipher != null) {
                byte[] bArr = buffer.buffer;
                cipher.update(bArr, 0, i3, bArr, 0);
            }
            byte[] bArr2 = buffer.buffer;
            int i4 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & Function.USE_VARARGS);
            if (i4 < 5 || i4 > PACKET_MAX_SIZE) {
                start_discard(buffer, this.s2ccipher, this.s2cmac, i4, PACKET_MAX_SIZE);
            }
            int i5 = (i4 + 4) - this.s2ccipher_size;
            int i6 = buffer.index;
            int i7 = i6 + i5;
            byte[] bArr3 = buffer.buffer;
            if (i7 > bArr3.length) {
                byte[] bArr4 = new byte[i6 + i5];
                System.arraycopy(bArr3, 0, bArr4, 0, i6);
                buffer.buffer = bArr4;
            }
            if (i5 % this.s2ccipher_size != 0) {
                String m156j = AbstractC0062j.m156j(i5, "Bad packet length ");
                if (JSch.getLogger().isEnabled(4)) {
                    JSch.getLogger().log(4, m156j);
                }
                c2 = 4;
                start_discard(buffer, this.s2ccipher, this.s2cmac, i4, PACKET_MAX_SIZE - this.s2ccipher_size);
            } else {
                c2 = 4;
            }
            if (i5 > 0) {
                this.f3797io.getByte(buffer.buffer, buffer.index, i5);
                buffer.index += i5;
                Cipher cipher2 = this.s2ccipher;
                if (cipher2 != null) {
                    byte[] bArr5 = buffer.buffer;
                    int i8 = this.s2ccipher_size;
                    i = i5;
                    cipher2.update(bArr5, i8, i, bArr5, i8);
                    mac = this.s2cmac;
                    if (mac == null) {
                        mac.update(this.seqi);
                        this.s2cmac.update(buffer.buffer, 0, buffer.index);
                        this.s2cmac.doFinal(this.s2cmac_result1, 0);
                        C0701IO c0701io = this.f3797io;
                        byte[] bArr6 = this.s2cmac_result2;
                        c0701io.getByte(bArr6, 0, bArr6.length);
                        if (!Arrays.equals(this.s2cmac_result1, this.s2cmac_result2)) {
                            if (i > PACKET_MAX_SIZE) {
                                throw new IOException("MAC Error");
                            }
                            start_discard(buffer, this.s2ccipher, this.s2cmac, i4, PACKET_MAX_SIZE - i);
                        }
                    }
                    this.seqi++;
                    compression = this.inflater;
                    if (compression != null) {
                        byte[] bArr7 = buffer.buffer;
                        byte b2 = bArr7[c2];
                        int[] iArr = this.uncompress_len;
                        iArr[0] = (buffer.index - 5) - b2;
                        byte[] uncompress = compression.uncompress(bArr7, 5, iArr);
                        if (uncompress == null) {
                            System.err.println("fail in inflater");
                            break;
                        }
                        buffer.buffer = uncompress;
                        buffer.index = this.uncompress_len[0] + 5;
                    }
                    command = buffer.getCommand() & 255;
                    if (command != 1) {
                        buffer.rewind();
                        buffer.getInt();
                        buffer.getShort();
                        throw new JSchException("SSH_MSG_DISCONNECT: " + buffer.getInt() + " " + Util.byte2str(buffer.getString()) + " " + Util.byte2str(buffer.getString()));
                    }
                    if (command == 2) {
                        continue;
                    } else if (command == 3) {
                        buffer.rewind();
                        buffer.getInt();
                        buffer.getShort();
                        int i9 = buffer.getInt();
                        if (JSch.getLogger().isEnabled(1)) {
                            JSch.getLogger().log(1, "Received SSH_MSG_UNIMPLEMENTED for " + i9);
                        }
                    } else if (command == c2) {
                        buffer.rewind();
                        buffer.getInt();
                        buffer.getShort();
                    } else if (command == SSH_MSG_CHANNEL_WINDOW_ADJUST) {
                        buffer.rewind();
                        buffer.getInt();
                        buffer.getShort();
                        Channel channel = Channel.getChannel(buffer.getInt(), this);
                        if (channel != null) {
                            channel.addRemoteWindowSize(buffer.getUInt());
                        }
                    } else if (command == 52) {
                        this.isAuthed = true;
                        if (this.inflater == null && this.deflater == null) {
                            initDeflater(this.guess[6]);
                            initInflater(this.guess[7]);
                        }
                    }
                }
            }
            i = i5;
            mac = this.s2cmac;
            if (mac == null) {
            }
            this.seqi++;
            compression = this.inflater;
            if (compression != null) {
            }
            command = buffer.getCommand() & 255;
            if (command != 1) {
            }
        }
    }

    public void rekey() {
        send_kexinit();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2;
        byte b2;
        this.thread = this;
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            KeyExchange keyExchange = null;
            while (true) {
                int i3 = 0;
                while (this.isConnected && this.thread != null) {
                    try {
                        try {
                            buffer = read(buffer);
                            int command = buffer.getCommand() & 255;
                            if (keyExchange != null && keyExchange.getState() == command) {
                                this.kex_start_time = System.currentTimeMillis();
                                boolean next = keyExchange.next(buffer);
                                if (!next) {
                                    throw new JSchException("verify: " + next);
                                }
                            } else if (command == SSH_MSG_KEXINIT) {
                                keyExchange = receive_kexinit(buffer);
                            } else if (command != SSH_MSG_NEWKEYS) {
                                switch (command) {
                                    case SSH_MSG_GLOBAL_REQUEST /* 80 */:
                                        buffer.getInt();
                                        buffer.getShort();
                                        buffer.getString();
                                        if (buffer.getByte() == 0) {
                                            break;
                                        } else {
                                            packet.reset();
                                            buffer.putByte((byte) 82);
                                            write(packet);
                                            break;
                                        }
                                    case SSH_MSG_REQUEST_SUCCESS /* 81 */:
                                    case SSH_MSG_REQUEST_FAILURE /* 82 */:
                                        Thread thread = this.grr.getThread();
                                        if (thread == null) {
                                            break;
                                        } else {
                                            this.grr.setReply(command == SSH_MSG_REQUEST_SUCCESS ? 1 : 0);
                                            if (command == SSH_MSG_REQUEST_SUCCESS && this.grr.getPort() == 0) {
                                                buffer.getInt();
                                                buffer.getShort();
                                                this.grr.setPort(buffer.getInt());
                                            }
                                            thread.interrupt();
                                            break;
                                        }
                                    default:
                                        switch (command) {
                                            case SSH_MSG_CHANNEL_OPEN /* 90 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                String byte2str = Util.byte2str(buffer.getString());
                                                if (!"forwarded-tcpip".equals(byte2str) && ((!"x11".equals(byte2str) || !this.x11_forwarding) && (!"auth-agent@openssh.com".equals(byte2str) || !this.agent_forwarding))) {
                                                    packet.reset();
                                                    buffer.putByte((byte) 92);
                                                    buffer.putInt(buffer.getInt());
                                                    buffer.putInt(1);
                                                    byte[] bArr = Util.empty;
                                                    buffer.putString(bArr);
                                                    buffer.putString(bArr);
                                                    write(packet);
                                                    break;
                                                } else {
                                                    Channel channel = Channel.getChannel(byte2str);
                                                    addChannel(channel);
                                                    channel.getData(buffer);
                                                    channel.init();
                                                    Thread thread2 = new Thread(channel);
                                                    thread2.setName("Channel " + byte2str + " " + this.host);
                                                    boolean z2 = this.daemon_thread;
                                                    if (z2) {
                                                        thread2.setDaemon(z2);
                                                    }
                                                    thread2.start();
                                                    break;
                                                }
                                                break;
                                            case SSH_MSG_CHANNEL_OPEN_CONFIRMATION /* 91 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel2 = Channel.getChannel(buffer.getInt(), this);
                                                int i4 = buffer.getInt();
                                                long uInt = buffer.getUInt();
                                                int i5 = buffer.getInt();
                                                if (channel2 == null) {
                                                    break;
                                                } else {
                                                    channel2.setRemoteWindowSize(uInt);
                                                    channel2.setRemotePacketSize(i5);
                                                    channel2.open_confirmation = true;
                                                    channel2.setRecipient(i4);
                                                    break;
                                                }
                                            case SSH_MSG_CHANNEL_OPEN_FAILURE /* 92 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel3 = Channel.getChannel(buffer.getInt(), this);
                                                if (channel3 == null) {
                                                    break;
                                                } else {
                                                    channel3.setExitStatus(buffer.getInt());
                                                    channel3.close = true;
                                                    channel3.eof_remote = true;
                                                    channel3.setRecipient(0);
                                                    break;
                                                }
                                            case SSH_MSG_CHANNEL_WINDOW_ADJUST /* 93 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel4 = Channel.getChannel(buffer.getInt(), this);
                                                if (channel4 != null) {
                                                    channel4.addRemoteWindowSize(buffer.getUInt());
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case SSH_MSG_CHANNEL_DATA /* 94 */:
                                                buffer.getInt();
                                                buffer.getByte();
                                                buffer.getByte();
                                                Channel channel5 = Channel.getChannel(buffer.getInt(), this);
                                                byte[] string = buffer.getString(iArr, iArr2);
                                                if (channel5 != null && (i = iArr2[0]) != 0) {
                                                    try {
                                                        try {
                                                            channel5.write(string, iArr[0], i);
                                                            channel5.setLocalWindowSize(channel5.lwsize - iArr2[0]);
                                                            if (channel5.lwsize < channel5.lwsize_max / 2) {
                                                                packet.reset();
                                                                buffer.putByte((byte) 93);
                                                                buffer.putInt(channel5.getRecipient());
                                                                buffer.putInt(channel5.lwsize_max - channel5.lwsize);
                                                                synchronized (channel5) {
                                                                    try {
                                                                        if (!channel5.close) {
                                                                            write(packet);
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                                channel5.setLocalWindowSize(channel5.lwsize_max);
                                                                break;
                                                            } else {
                                                                continue;
                                                            }
                                                        } catch (Exception unused) {
                                                            channel5.disconnect();
                                                            break;
                                                        }
                                                    } catch (Exception unused2) {
                                                        continue;
                                                    }
                                                }
                                                break;
                                            case SSH_MSG_CHANNEL_EXTENDED_DATA /* 95 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel6 = Channel.getChannel(buffer.getInt(), this);
                                                buffer.getInt();
                                                byte[] string2 = buffer.getString(iArr, iArr2);
                                                if (channel6 != null && (i2 = iArr2[0]) != 0) {
                                                    channel6.write_ext(string2, iArr[0], i2);
                                                    channel6.setLocalWindowSize(channel6.lwsize - iArr2[0]);
                                                    if (channel6.lwsize < channel6.lwsize_max / 2) {
                                                        packet.reset();
                                                        buffer.putByte((byte) 93);
                                                        buffer.putInt(channel6.getRecipient());
                                                        buffer.putInt(channel6.lwsize_max - channel6.lwsize);
                                                        synchronized (channel6) {
                                                            try {
                                                                if (!channel6.close) {
                                                                    write(packet);
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        channel6.setLocalWindowSize(channel6.lwsize_max);
                                                        break;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                break;
                                            case SSH_MSG_CHANNEL_EOF /* 96 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel7 = Channel.getChannel(buffer.getInt(), this);
                                                if (channel7 == null) {
                                                    break;
                                                } else {
                                                    channel7.eof_remote();
                                                    break;
                                                }
                                            case SSH_MSG_CHANNEL_CLOSE /* 97 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel8 = Channel.getChannel(buffer.getInt(), this);
                                                if (channel8 == null) {
                                                    break;
                                                } else {
                                                    channel8.disconnect();
                                                    break;
                                                }
                                            case SSH_MSG_CHANNEL_REQUEST /* 98 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                int i6 = buffer.getInt();
                                                byte[] string3 = buffer.getString();
                                                boolean z3 = buffer.getByte() != 0;
                                                Channel channel9 = Channel.getChannel(i6, this);
                                                if (channel9 != null) {
                                                    if (Util.byte2str(string3).equals("exit-status")) {
                                                        channel9.setExitStatus(buffer.getInt());
                                                        b2 = 99;
                                                    } else {
                                                        b2 = 100;
                                                    }
                                                    if (!z3) {
                                                        break;
                                                    } else {
                                                        packet.reset();
                                                        buffer.putByte(b2);
                                                        buffer.putInt(channel9.getRecipient());
                                                        write(packet);
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            case SSH_MSG_CHANNEL_SUCCESS /* 99 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel10 = Channel.getChannel(buffer.getInt(), this);
                                                if (channel10 != null) {
                                                    channel10.reply = 1;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case SSH_MSG_CHANNEL_FAILURE /* 100 */:
                                                buffer.getInt();
                                                buffer.getShort();
                                                Channel channel11 = Channel.getChannel(buffer.getInt(), this);
                                                if (channel11 != null) {
                                                    channel11.reply = 0;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            default:
                                                throw new IOException("Unknown SSH message type " + command);
                                        }
                                }
                            }
                        } catch (InterruptedIOException e2) {
                            if (!this.in_kex && i3 < this.serverAliveCountMax) {
                                sendKeepAliveMsg();
                            } else if (!this.in_kex || i3 >= this.serverAliveCountMax) {
                                throw e2;
                            }
                            i3++;
                        }
                    } catch (Exception e3) {
                        this.in_kex = false;
                        if (JSch.getLogger().isEnabled(1)) {
                            JSch.getLogger().log(1, "Caught an exception, leaving main loop due to " + e3.getMessage());
                        }
                    }
                }
                try {
                    disconnect();
                } catch (NullPointerException | Exception unused3) {
                }
                this.isConnected = false;
                return;
            }
            send_newkeys();
            receive_newkeys(buffer, keyExchange);
        }
        throw e2;
    }

    public void sendIgnore() {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 2);
        write(packet);
    }

    public void sendKeepAliveMsg() {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 80);
        buffer.putString(keepalivemsg);
        buffer.putByte((byte) 1);
        write(packet);
    }

    public void setClientVersion(String str) {
        this.V_C = Util.str2byte(str);
    }

    public void setConfig(Properties properties) {
        setConfig((Hashtable) properties);
    }

    public void setDaemonThread(boolean z2) {
        this.daemon_thread = z2;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setHostKeyAlias(String str) {
        this.hostKeyAlias = str;
    }

    public void setHostKeyRepository(HostKeyRepository hostKeyRepository) {
        this.hostkeyRepository = hostKeyRepository;
    }

    public void setIdentityRepository(IdentityRepository identityRepository) {
        this.identityRepository = identityRepository;
    }

    public void setInputStream(InputStream inputStream) {
        this.f3796in = inputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public void setPassword(String str) {
        if (str != null) {
            this.password = Util.str2byte(str);
        }
    }

    public void setPort(int i) {
        this.port = i;
    }

    public int setPortForwardingL(int i, String str, int i2) {
        return setPortForwardingL("127.0.0.1", i, str, i2);
    }

    public void setPortForwardingR(int i, String str, int i2) {
        setPortForwardingR(null, i, str, i2, null);
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public void setServerAliveCountMax(int i) {
        this.serverAliveCountMax = i;
    }

    public void setServerAliveInterval(int i) {
        setTimeout(i);
        this.serverAliveInterval = i;
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        this.socket_factory = socketFactory;
    }

    public void setTimeout(int i) {
        Socket socket = this.socket;
        if (socket == null) {
            if (i < 0) {
                throw new JSchException("invalid timeout value");
            }
            this.timeout = i;
        } else {
            try {
                socket.setSoTimeout(i);
                this.timeout = i;
            } catch (Exception e2) {
                throw new JSchException(e2.toString(), e2);
            }
        }
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userinfo = userInfo;
    }

    public void setUserName(String str) {
        this.username = str;
    }

    public void setX11Cookie(String str) {
        ChannelX11.setCookie(str);
    }

    public void setX11Host(String str) {
        ChannelX11.setHost(str);
    }

    public void setX11Port(int i) {
        ChannelX11.setPort(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r14.close != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r14.isConnected() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        monitor-enter(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r3 = 0;
        r3 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14.rwsize <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r9 = r14.rwsize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r9 <= r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r9 == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        r15 = (int) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r12.c2scipher == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        r2 = r12.c2scipher_size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r4 = r12.c2smac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r4 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        r3 = r4.getBlockSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r3 = r13.shift(r15, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r15 = r13.buffer.getCommand();
        r2 = r14.getRecipient();
        r14.rwsize -= r9;
        r11 = r3;
        r3 = r15;
        r15 = (int) (r7 - r9);
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r5 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        _write(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r15 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        r13.unshift(r3, r2, r4, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        monitor-enter(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (r12.in_kex == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r14.rwsize < r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r14.rwsize -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d4, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        _write(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dd, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00af, code lost:
    
        r2 = -1;
        r4 = 0;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0089, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00df, code lost:
    
        throw r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(Packet packet, Channel channel, int i) {
        int i2;
        long timeout = getTimeout();
        while (true) {
            if (!this.in_kex) {
                synchronized (channel) {
                    try {
                        long j2 = i;
                        boolean z2 = true;
                        if (channel.rwsize < j2) {
                            try {
                                try {
                                    channel.notifyme++;
                                    channel.wait(100L);
                                    i2 = channel.notifyme;
                                } catch (Throwable th) {
                                    channel.notifyme--;
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                i2 = channel.notifyme;
                            }
                            channel.notifyme = i2 - 1;
                        }
                        if (!this.in_kex) {
                            if (channel.rwsize >= j2) {
                                channel.rwsize -= j2;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                if (timeout > 0 && System.currentTimeMillis() - this.kex_start_time > timeout) {
                    throw new JSchException("timeout in waiting for rekeying process.");
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused2) {
                }
            }
        }
        throw new IOException("channel is broken");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0278, code lost:
    
        r7 = (com.jcraft.jsch.UserAuth) java.lang.Class.forName(getConfig("userauth.none")).newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0288, code lost:
    
        r8 = r7.start(r16);
        r9 = getConfig("PreferredAuthentications");
        r10 = com.jcraft.jsch.Util.split(r9, ",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0298, code lost:
    
        if (r8 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x029a, code lost:
    
        r7 = ((com.jcraft.jsch.UserAuthNone) r7).getMethods();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a0, code lost:
    
        if (r7 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a2, code lost:
    
        r9 = r7.toLowerCase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a8, code lost:
    
        r7 = com.jcraft.jsch.Util.split(r9, ",");
        r12 = 0;
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02cf, code lost:
    
        if (com.jcraft.jsch.JSch.getLogger().isEnabled(1) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d1, code lost:
    
        r3 = "Authentications that can continue: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d4, code lost:
    
        if (r12 >= r10.length) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d6, code lost:
    
        r3 = r3 + r10[r12];
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ea, code lost:
    
        if (r12 >= r10.length) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ec, code lost:
    
        r3 = r3 + ",";
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0303, code lost:
    
        com.jcraft.jsch.JSch.getLogger().log(1, r3);
        com.jcraft.jsch.JSch.getLogger().log(1, "Next authentication method: " + r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0337, code lost:
    
        if (getConfig("userauth." + r15) == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0339, code lost:
    
        r3 = (com.jcraft.jsch.UserAuth) java.lang.Class.forName(getConfig("userauth." + r15)).newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0381, code lost:
    
        if (r3 == null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0383, code lost:
    
        r8 = r3.start(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0387, code lost:
    
        if (r8 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0391, code lost:
    
        if (com.jcraft.jsch.JSch.getLogger().isEnabled(1) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0393, code lost:
    
        com.jcraft.jsch.JSch.getLogger().log(1, "Authentication succeeded (" + r15 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03bd, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0402, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03e9, code lost:
    
        r3 = r0.getMethods();
        r7 = com.jcraft.jsch.Util.split(r3, ",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03f7, code lost:
    
        if (r9.equals(r3) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03f9, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03fc, code lost:
    
        r9 = r3;
        r6 = 0;
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03fb, code lost:
    
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03e7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03b7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03e8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03c7, code lost:
    
        if (com.jcraft.jsch.JSch.getLogger().isEnabled(2) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03c9, code lost:
    
        com.jcraft.jsch.JSch.getLogger().log(2, "an exception during authentication\n" + r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03e5, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0441, code lost:
    
        throw new com.jcraft.jsch.JSchException("Auth cancel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0449, code lost:
    
        throw new com.jcraft.jsch.JSchException("Auth fail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x044a, code lost:
    
        r3 = r16.socket;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x044c, code lost:
    
        if (r3 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0454, code lost:
    
        r3.setSoTimeout(r16.timeout);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0459, code lost:
    
        r16.isAuthed = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x045d, code lost:
    
        monitor-enter(r16.lock);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0460, code lost:
    
        if (r16.isConnected != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0462, code lost:
    
        r3 = new java.lang.Thread(r16);
        r16.connectThread = r3;
        r3.setName("Connect thread " + r16.host + " session");
        r3 = r16.daemon_thread;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0486, code lost:
    
        if (r3 != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0488, code lost:
    
        r16.connectThread.setDaemon(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0491, code lost:
    
        r16.connectThread.start();
        requestPortForwarding();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x049a, code lost:
    
        com.jcraft.jsch.Util.bzero(r16.password);
        r16.password = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x048e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04a3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0380, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0361, code lost:
    
        if (com.jcraft.jsch.JSch.getLogger().isEnabled(2) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0363, code lost:
    
        com.jcraft.jsch.JSch.getLogger().log(2, "failed to load " + r15 + " method");
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02a7, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04af, code lost:
    
        throw new com.jcraft.jsch.JSchException(r0.toString(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0274, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04cc, code lost:
    
        throw new com.jcraft.jsch.JSchException("MaxAuthTries: " + getConfig("MaxAuthTries"), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04cd, code lost:
    
        r16.in_kex = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04ec, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid protocol(newkyes): " + ((int) r16.buf.getCommand()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04ee, code lost:
    
        r16.in_kex = false;
        r16.in_prompt = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04f4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04f5, code lost:
    
        r16.in_kex = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x050e, code lost:
    
        throw new com.jcraft.jsch.JSchException("verify: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x050f, code lost:
    
        r16.in_kex = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x052e, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid protocol(kex): " + ((int) r16.buf.getCommand()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x052f, code lost:
    
        r16.in_kex = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x054e, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid protocol: " + ((int) r16.buf.getCommand()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0556, code lost:
    
        throw new com.jcraft.jsch.JSchException("invalid server's version string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016d, code lost:
    
        if (r8 == r9.length) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        if (r8 < 7) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        if (r9[4] != 49) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017e, code lost:
    
        if (r9[6] != 57) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0180, code lost:
    
        r7 = new byte[r8];
        r16.V_S = r7;
        java.lang.System.arraycopy(r9, 0, r7, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (com.jcraft.jsch.JSch.getLogger().isEnabled(1) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        com.jcraft.jsch.JSch.getLogger().log(1, "Remote version string: " + com.jcraft.jsch.Util.byte2str(r16.V_S));
        com.jcraft.jsch.JSch.getLogger().log(1, "Local version string: " + com.jcraft.jsch.Util.byte2str(r16.V_C));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cd, code lost:
    
        send_kexinit();
        r7 = read(r16.buf);
        r16.buf = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01de, code lost:
    
        if (r7.getCommand() != com.jcraft.jsch.Session.SSH_MSG_KEXINIT) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e8, code lost:
    
        if (com.jcraft.jsch.JSch.getLogger().isEnabled(1) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ea, code lost:
    
        com.jcraft.jsch.JSch.getLogger().log(1, "SSH_MSG_KEXINIT received");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f3, code lost:
    
        r7 = receive_kexinit(r16.buf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f9, code lost:
    
        r16.buf = read(r16.buf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020b, code lost:
    
        if (r7.getState() != r16.buf.getCommand()) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020d, code lost:
    
        r16.kex_start_time = java.lang.System.currentTimeMillis();
        r8 = r7.next(r16.buf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0219, code lost:
    
        if (r8 == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        if (r7.getState() != 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0221, code lost:
    
        r8 = java.lang.System.currentTimeMillis();
        r16.in_prompt = true;
        checkHost(r16.host, r16.port, r7);
        r16.in_prompt = false;
        r16.kex_start_time = (java.lang.System.currentTimeMillis() - r8) + r16.kex_start_time;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023a, code lost:
    
        send_newkeys();
        r8 = read(r16.buf);
        r16.buf = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024b, code lost:
    
        if (r8.getCommand() != com.jcraft.jsch.Session.SSH_MSG_NEWKEYS) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0255, code lost:
    
        if (com.jcraft.jsch.JSch.getLogger().isEnabled(1) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0257, code lost:
    
        com.jcraft.jsch.JSch.getLogger().log(1, "SSH_MSG_NEWKEYS received");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0260, code lost:
    
        receive_newkeys(r16.buf, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
    
        r7 = getConfig("MaxAuthTries");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026b, code lost:
    
        if (r7 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x026d, code lost:
    
        r16.max_auth_tries = java.lang.Integer.parseInt(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x043a A[Catch: all -> 0x0083, Exception -> 0x02fe, TryCatch #2 {all -> 0x0083, blocks: (B:10:0x0066, B:288:0x006a, B:290:0x006e, B:291:0x00a4, B:17:0x00e1, B:19:0x00e5, B:20:0x00e8, B:22:0x00f4, B:23:0x00fd, B:25:0x0118, B:27:0x011f, B:29:0x0128, B:34:0x0135, B:39:0x0145, B:46:0x0151, B:49:0x0155, B:52:0x015b, B:55:0x015f, B:58:0x0165, B:62:0x016c, B:66:0x0172, B:70:0x017a, B:73:0x0180, B:75:0x0191, B:76:0x01cd, B:78:0x01e0, B:80:0x01ea, B:81:0x01f3, B:82:0x01f9, B:84:0x020d, B:86:0x021b, B:89:0x0221, B:90:0x023a, B:92:0x024d, B:94:0x0257, B:95:0x0260, B:97:0x0265, B:99:0x026d, B:102:0x0278, B:103:0x0288, B:105:0x029a, B:107:0x02a2, B:134:0x02a8, B:137:0x02b4, B:139:0x02b7, B:140:0x02bc, B:142:0x02bf, B:146:0x02c7, B:149:0x02d3, B:151:0x02d6, B:154:0x02ec, B:159:0x0303, B:161:0x0322, B:163:0x0339, B:166:0x0383, B:170:0x0389, B:172:0x0393, B:194:0x03bf, B:196:0x03c9, B:188:0x03e7, B:191:0x03e8, B:180:0x03e9, B:235:0x0359, B:237:0x0363, B:144:0x0408, B:199:0x040e, B:201:0x0414, B:203:0x041e, B:205:0x043a, B:206:0x0441, B:207:0x0442, B:208:0x0449, B:209:0x044a, B:212:0x0450, B:214:0x0454, B:215:0x0459, B:216:0x045d, B:231:0x04a3, B:245:0x04a5, B:246:0x04af, B:249:0x04b0, B:250:0x04cc, B:251:0x04cd, B:252:0x04ec, B:255:0x04ee, B:256:0x04f4, B:259:0x04f5, B:260:0x050e, B:262:0x050f, B:263:0x052e, B:264:0x052f, B:265:0x054e, B:266:0x054f, B:267:0x0556, B:276:0x0557, B:277:0x055e, B:292:0x008c, B:12:0x00b4, B:286:0x0562, B:111:0x0563, B:113:0x0565, B:115:0x0569, B:118:0x05a1, B:120:0x05a5, B:122:0x05ab, B:124:0x05af, B:125:0x05b1, B:127:0x05b2, B:128:0x05c8, B:129:0x05c9, B:130:0x05cb), top: B:9:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0442 A[Catch: all -> 0x0083, Exception -> 0x02fe, TryCatch #2 {all -> 0x0083, blocks: (B:10:0x0066, B:288:0x006a, B:290:0x006e, B:291:0x00a4, B:17:0x00e1, B:19:0x00e5, B:20:0x00e8, B:22:0x00f4, B:23:0x00fd, B:25:0x0118, B:27:0x011f, B:29:0x0128, B:34:0x0135, B:39:0x0145, B:46:0x0151, B:49:0x0155, B:52:0x015b, B:55:0x015f, B:58:0x0165, B:62:0x016c, B:66:0x0172, B:70:0x017a, B:73:0x0180, B:75:0x0191, B:76:0x01cd, B:78:0x01e0, B:80:0x01ea, B:81:0x01f3, B:82:0x01f9, B:84:0x020d, B:86:0x021b, B:89:0x0221, B:90:0x023a, B:92:0x024d, B:94:0x0257, B:95:0x0260, B:97:0x0265, B:99:0x026d, B:102:0x0278, B:103:0x0288, B:105:0x029a, B:107:0x02a2, B:134:0x02a8, B:137:0x02b4, B:139:0x02b7, B:140:0x02bc, B:142:0x02bf, B:146:0x02c7, B:149:0x02d3, B:151:0x02d6, B:154:0x02ec, B:159:0x0303, B:161:0x0322, B:163:0x0339, B:166:0x0383, B:170:0x0389, B:172:0x0393, B:194:0x03bf, B:196:0x03c9, B:188:0x03e7, B:191:0x03e8, B:180:0x03e9, B:235:0x0359, B:237:0x0363, B:144:0x0408, B:199:0x040e, B:201:0x0414, B:203:0x041e, B:205:0x043a, B:206:0x0441, B:207:0x0442, B:208:0x0449, B:209:0x044a, B:212:0x0450, B:214:0x0454, B:215:0x0459, B:216:0x045d, B:231:0x04a3, B:245:0x04a5, B:246:0x04af, B:249:0x04b0, B:250:0x04cc, B:251:0x04cd, B:252:0x04ec, B:255:0x04ee, B:256:0x04f4, B:259:0x04f5, B:260:0x050e, B:262:0x050f, B:263:0x052e, B:264:0x052f, B:265:0x054e, B:266:0x054f, B:267:0x0556, B:276:0x0557, B:277:0x055e, B:292:0x008c, B:12:0x00b4, B:286:0x0562, B:111:0x0563, B:113:0x0565, B:115:0x0569, B:118:0x05a1, B:120:0x05a5, B:122:0x05ab, B:124:0x05af, B:125:0x05b1, B:127:0x05b2, B:128:0x05c8, B:129:0x05c9, B:130:0x05cb), top: B:9:0x0066 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void connect(int i) {
        int i2;
        Exception exc;
        boolean z2;
        InputStream inputStream;
        OutputStream outputStream;
        boolean start;
        String[] split;
        String[] split2;
        int i3;
        boolean z3;
        Socket socket;
        if (this.isConnected) {
            throw new JSchException("session is already connected");
        }
        this.f3797io = new C0701IO();
        if (random == null) {
            try {
                random = (Random) Class.forName(getConfig("random")).newInstance();
            } catch (Exception e2) {
                throw new JSchException(e2.toString(), e2);
            }
        }
        Packet.setRandom(random);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "Connecting to " + this.host + " port " + this.port);
        }
        i2 = 0;
        try {
            try {
                Proxy proxy = this.proxy;
                if (proxy == null) {
                    try {
                        SocketFactory socketFactory = this.socket_factory;
                        if (socketFactory == null) {
                            Socket createSocket = Util.createSocket(this.host, this.port, i);
                            this.socket = createSocket;
                            inputStream = createSocket.getInputStream();
                            outputStream = this.socket.getOutputStream();
                        } else {
                            Socket createSocket2 = socketFactory.createSocket(this.host, this.port);
                            this.socket = createSocket2;
                            inputStream = this.socket_factory.getInputStream(createSocket2);
                            outputStream = this.socket_factory.getOutputStream(this.socket);
                        }
                        this.socket.setTcpNoDelay(true);
                        this.f3797io.setInputStream(inputStream);
                        this.f3797io.setOutputStream(outputStream);
                    } catch (Exception e3) {
                        exc = e3;
                        z2 = false;
                        this.in_kex = z2;
                        try {
                            if (this.isConnected) {
                                String obj = exc.toString();
                                this.packet.reset();
                                this.buf.checkFreeSize(obj.length() + 143);
                                this.buf.putByte((byte) 1);
                                this.buf.putInt(3);
                                this.buf.putString(Util.str2byte(obj));
                                this.buf.putString(Util.str2byte("en"));
                                write(this.packet);
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            disconnect();
                        } catch (Exception unused2) {
                        }
                        this.isConnected = false;
                        if (exc instanceof RuntimeException) {
                            throw ((RuntimeException) exc);
                        }
                        if (exc instanceof JSchException) {
                            throw ((JSchException) exc);
                        }
                        throw new JSchException("Session.connect: " + exc);
                    }
                } else {
                    synchronized (proxy) {
                        this.proxy.connect(this.socket_factory, this.host, this.port, i);
                        this.f3797io.setInputStream(this.proxy.getInputStream());
                        this.f3797io.setOutputStream(this.proxy.getOutputStream());
                        this.socket = this.proxy.getSocket();
                    }
                }
                if (i > 0 && (socket = this.socket) != null) {
                    socket.setSoTimeout(i);
                }
                this.isConnected = true;
                if (JSch.getLogger().isEnabled(1)) {
                    JSch.getLogger().log(1, "Connection established");
                }
                this.jsch.addSession(this);
                byte[] bArr = this.V_C;
                int length = bArr.length;
                int i4 = length + 1;
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                bArr2[length] = 10;
                this.f3797io.put(bArr2, 0, i4);
                while (true) {
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < this.buf.buffer.length && (i6 = this.f3797io.getByte()) >= 0) {
                        this.buf.buffer[i5] = (byte) i6;
                        i5++;
                        if (i6 == 10) {
                            break;
                        }
                    }
                    if (i6 < 0) {
                        throw new JSchException("connection is closed by foreign host");
                    }
                    byte[] bArr3 = this.buf.buffer;
                    if (bArr3[i5 - 1] == 10) {
                        int i7 = i5 - 1;
                        i5 = (i7 <= 0 || bArr3[i5 + (-2)] != 13) ? i7 : i5 - 2;
                    }
                    if (i5 <= 3 || (i5 != bArr3.length && (bArr3[0] != 83 || bArr3[1] != 83 || bArr3[2] != 72 || bArr3[3] != 45))) {
                    }
                }
            } catch (Throwable th) {
                Util.bzero(this.password);
                this.password = null;
                throw th;
            }
        } catch (Exception e4) {
            exc = e4;
            z2 = false;
        }
        while (!start && split != null && i3 < split.length) {
            int i8 = i3 + 1;
            String str = split[i3];
            int i9 = i2;
            while (true) {
                if (i9 >= split2.length) {
                    break;
                } else if (split2[i9].equals(str)) {
                    break;
                } else {
                    i9++;
                }
            }
            i3 = i8;
            i2 = 0;
        }
        if (this.auth_failures >= this.max_auth_tries) {
            JSch.getLogger().log(1, "Login trials exceeds " + this.max_auth_tries);
        }
        if (!z3) {
        }
        i3 = i8;
        i2 = 0;
    }

    public void delPortForwardingL(String str, int i) {
        PortWatcher.delPort(this, str, i);
    }

    public void delPortForwardingR(String str, int i) {
        ChannelForwardedTCPIP.delPort(this, str, i);
    }

    public void setConfig(Hashtable hashtable) {
        synchronized (this.lock) {
            try {
                if (this.config == null) {
                    this.config = new Hashtable();
                }
                Enumeration keys = hashtable.keys();
                while (keys.hasMoreElements()) {
                    String str = (String) keys.nextElement();
                    this.config.put(str, (String) hashtable.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPassword(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.password = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public int setPortForwardingL(String str, int i, String str2, int i2) {
        return setPortForwardingL(str, i, str2, i2, null);
    }

    public void setPortForwardingR(String str, int i, String str2, int i2) {
        setPortForwardingR(str, i, str2, i2, null);
    }

    public int setPortForwardingL(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) {
        return setPortForwardingL(str, i, str2, i2, serverSocketFactory, 0);
    }

    public void setPortForwardingR(int i, String str, int i2, SocketFactory socketFactory) {
        setPortForwardingR(null, i, str, i2, socketFactory);
    }

    public int setPortForwardingL(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory, int i3) {
        PortWatcher addPort = PortWatcher.addPort(this, str, i, str2, i2, serverSocketFactory);
        addPort.setConnectTimeout(i3);
        Thread thread = new Thread(addPort);
        thread.setName("PortWatcher Thread for " + str2);
        boolean z2 = this.daemon_thread;
        if (z2) {
            thread.setDaemon(z2);
        }
        thread.start();
        return addPort.lport;
    }

    public void setPortForwardingR(String str, int i, String str2, int i2, SocketFactory socketFactory) {
        ChannelForwardedTCPIP.addPort(this, str, i, _setPortForwardingR(str, i), str2, i2, socketFactory);
    }

    public void setPortForwardingR(int i, String str) {
        setPortForwardingR((String) null, i, str, (Object[]) null);
    }

    public void setPortForwardingR(int i, String str, Object[] objArr) {
        setPortForwardingR((String) null, i, str, objArr);
    }

    public void setPortForwardingR(String str, int i, String str2, Object[] objArr) {
        ChannelForwardedTCPIP.addPort(this, str, i, _setPortForwardingR(str, i), str2, objArr);
    }

    public void setConfig(String str, String str2) {
        synchronized (this.lock) {
            try {
                if (this.config == null) {
                    this.config = new Hashtable();
                }
                this.config.put(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int setPortForwardingR(String str) {
        Forwarding parseForwarding = parseForwarding(str);
        int _setPortForwardingR = _setPortForwardingR(parseForwarding.bind_address, parseForwarding.port);
        ChannelForwardedTCPIP.addPort(this, parseForwarding.bind_address, parseForwarding.port, _setPortForwardingR, parseForwarding.host, parseForwarding.hostport, null);
        return _setPortForwardingR;
    }

    public int setPortForwardingL(String str) {
        Forwarding parseForwarding = parseForwarding(str);
        return setPortForwardingL(parseForwarding.bind_address, parseForwarding.port, parseForwarding.host, parseForwarding.hostport);
    }

    public void write(Packet packet) {
        long timeout = getTimeout();
        while (this.in_kex) {
            if (timeout > 0 && System.currentTimeMillis() - this.kex_start_time > timeout && !this.in_prompt) {
                throw new JSchException("timeout in waiting for rekeying process.");
            }
            byte command = packet.buffer.getCommand();
            if (command == SSH_MSG_KEXINIT || command == SSH_MSG_NEWKEYS || command == SSH_MSG_KEXDH_INIT || command == 31 || command == 31 || command == SSH_MSG_KEX_DH_GEX_INIT || command == SSH_MSG_KEX_DH_GEX_REPLY || command == SSH_MSG_KEX_DH_GEX_REQUEST || command == 1) {
                break;
            } else {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            }
        }
        _write(packet);
    }
}
