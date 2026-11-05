package com.jcraft.jsch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes.dex */
public class KnownHosts implements HostKeyRepository {
    private static final String _known_hosts = "known_hosts";
    private MAC hmacsha1;
    private JSch jsch;
    private String known_hosts = null;
    private Vector pool;
    private static final byte[] space = {32};

    /* renamed from: cr */
    private static final byte[] f3791cr = Util.str2byte("\n");

    public class HashedHostKey extends HostKey {
        private static final String HASH_DELIM = "|";
        private static final String HASH_MAGIC = "|1|";
        byte[] hash;
        private boolean hashed;
        byte[] salt;

        public HashedHostKey(KnownHosts knownHosts, String str, byte[] bArr) {
            this(knownHosts, str, 0, bArr);
        }

        public void hash() {
            if (this.hashed) {
                return;
            }
            MAC hmacsha1 = KnownHosts.this.getHMACSHA1();
            if (this.salt == null) {
                Random random = Session.random;
                synchronized (random) {
                    byte[] bArr = new byte[hmacsha1.getBlockSize()];
                    this.salt = bArr;
                    random.fill(bArr, 0, bArr.length);
                }
            }
            try {
                synchronized (hmacsha1) {
                    hmacsha1.init(this.salt);
                    byte[] str2byte = Util.str2byte(this.host);
                    hmacsha1.update(str2byte, 0, str2byte.length);
                    byte[] bArr2 = new byte[hmacsha1.getBlockSize()];
                    this.hash = bArr2;
                    hmacsha1.doFinal(bArr2, 0);
                }
            } catch (Exception unused) {
            }
            StringBuilder sb = new StringBuilder(HASH_MAGIC);
            byte[] bArr3 = this.salt;
            sb.append(Util.byte2str(Util.toBase64(bArr3, 0, bArr3.length)));
            sb.append(HASH_DELIM);
            byte[] bArr4 = this.hash;
            sb.append(Util.byte2str(Util.toBase64(bArr4, 0, bArr4.length)));
            this.host = sb.toString();
            this.hashed = true;
        }

        public boolean isHashed() {
            return this.hashed;
        }

        @Override // com.jcraft.jsch.HostKey
        public boolean isMatched(String str) {
            boolean array_equals;
            if (!this.hashed) {
                return super.isMatched(str);
            }
            MAC hmacsha1 = KnownHosts.this.getHMACSHA1();
            try {
                synchronized (hmacsha1) {
                    hmacsha1.init(this.salt);
                    byte[] str2byte = Util.str2byte(str);
                    hmacsha1.update(str2byte, 0, str2byte.length);
                    byte[] bArr = new byte[hmacsha1.getBlockSize()];
                    hmacsha1.doFinal(bArr, 0);
                    array_equals = Util.array_equals(this.hash, bArr);
                }
                return array_equals;
            } catch (Exception e2) {
                System.out.println(e2);
                return false;
            }
        }

        public HashedHostKey(KnownHosts knownHosts, String str, int i, byte[] bArr) {
            this("", str, i, bArr, null);
        }

        public HashedHostKey(String str, String str2, int i, byte[] bArr, String str3) {
            super(str, str2, i, bArr, str3);
            this.hashed = false;
            this.salt = null;
            this.hash = null;
            if (!this.host.startsWith(HASH_MAGIC) || this.host.substring(3).indexOf(HASH_DELIM) <= 0) {
                return;
            }
            String substring = this.host.substring(3);
            String substring2 = substring.substring(0, substring.indexOf(HASH_DELIM));
            String substring3 = substring.substring(substring.indexOf(HASH_DELIM) + 1);
            this.salt = Util.fromBase64(Util.str2byte(substring2), 0, substring2.length());
            byte[] fromBase64 = Util.fromBase64(Util.str2byte(substring3), 0, substring3.length());
            this.hash = fromBase64;
            if (this.salt.length == 20 && fromBase64.length == 20) {
                this.hashed = true;
            } else {
                this.salt = null;
                this.hash = null;
            }
        }
    }

    public KnownHosts(JSch jSch) {
        this.pool = null;
        this.hmacsha1 = null;
        this.jsch = jSch;
        this.hmacsha1 = getHMACSHA1();
        this.pool = new Vector();
    }

    private void addInvalidLine(String str) {
        this.pool.addElement(new HostKey(str, 6, null));
    }

    private String deleteSubString(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length2) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                break;
            }
            if (str2.equals(str.substring(i, indexOf))) {
                return str.substring(0, i) + str.substring(indexOf + 1);
            }
            i = indexOf + 1;
        }
        if (str.endsWith(str2) && length2 - i == length) {
            return str.substring(0, length == length2 ? 0 : (length2 - length) - 1);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MAC getHMACSHA1() {
        if (this.hmacsha1 == null) {
            try {
                this.hmacsha1 = (MAC) Class.forName(JSch.getConfig("hmac-sha1")).newInstance();
            } catch (Exception e2) {
                System.err.println("hmacsha1: " + e2);
            }
        }
        return this.hmacsha1;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void add(HostKey hostKey, UserInfo userInfo) {
        boolean z2;
        int i = hostKey.type;
        String host = hostKey.getHost();
        synchronized (this.pool) {
            z2 = false;
            for (int i2 = 0; i2 < this.pool.size(); i2++) {
                try {
                    ((HostKey) this.pool.elementAt(i2)).isMatched(host);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.pool.addElement(hostKey);
        String knownHostsRepositoryID = getKnownHostsRepositoryID();
        if (knownHostsRepositoryID != null) {
            File file = new File(Util.checkTilde(knownHostsRepositoryID));
            if (file.exists()) {
                z2 = true;
            } else if (userInfo != null) {
                boolean promptYesNo = userInfo.promptYesNo(knownHostsRepositoryID.concat(" does not exist.\nAre you sure you want to create it?"));
                File parentFile = file.getParentFile();
                if (promptYesNo && parentFile != null && !parentFile.exists()) {
                    promptYesNo = userInfo.promptYesNo("The parent directory " + parentFile + " does not exist.\nAre you sure you want to create it?");
                    if (promptYesNo) {
                        if (parentFile.mkdirs()) {
                            userInfo.showMessage(parentFile + " has been succesfully created.\nPlease check its access permission.");
                        } else {
                            userInfo.showMessage(parentFile + " has not been created.");
                            promptYesNo = false;
                        }
                    }
                }
                if (parentFile != null) {
                    z2 = promptYesNo;
                }
            }
            if (z2) {
                try {
                    sync(knownHostsRepositoryID);
                } catch (Exception e2) {
                    System.err.println("sync known_hosts: " + e2);
                }
            }
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public int check(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        try {
            HostKey hostKey = new HostKey(str, 0, bArr);
            synchronized (this.pool) {
                int i = 1;
                for (int i2 = 0; i2 < this.pool.size(); i2++) {
                    try {
                        HostKey hostKey2 = (HostKey) this.pool.elementAt(i2);
                        if (hostKey2.isMatched(str) && hostKey2.type == hostKey.type) {
                            if (Util.array_equals(hostKey2.key, bArr)) {
                                return 0;
                            }
                            i = 2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? check(str.substring(1, str.indexOf("]:")), bArr) : i;
            }
        } catch (JSchException unused) {
            return 1;
        }
    }

    public HostKey createHashedHostKey(String str, byte[] bArr) {
        HashedHostKey hashedHostKey = new HashedHostKey(this, str, bArr);
        hashedHostKey.hash();
        return hashedHostKey;
    }

    public void dump(OutputStream outputStream) {
        try {
            synchronized (this.pool) {
                for (int i = 0; i < this.pool.size(); i++) {
                    try {
                        HostKey hostKey = (HostKey) this.pool.elementAt(i);
                        String marker = hostKey.getMarker();
                        String host = hostKey.getHost();
                        String type = hostKey.getType();
                        String comment = hostKey.getComment();
                        if (type.equals("UNKNOWN")) {
                            outputStream.write(Util.str2byte(host));
                            outputStream.write(f3791cr);
                        } else {
                            if (marker.length() != 0) {
                                outputStream.write(Util.str2byte(marker));
                                outputStream.write(space);
                            }
                            outputStream.write(Util.str2byte(host));
                            byte[] bArr = space;
                            outputStream.write(bArr);
                            outputStream.write(Util.str2byte(type));
                            outputStream.write(bArr);
                            outputStream.write(Util.str2byte(hostKey.getKey()));
                            if (comment != null) {
                                outputStream.write(bArr);
                                outputStream.write(Util.str2byte(comment));
                            }
                            outputStream.write(f3791cr);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Exception e2) {
            System.err.println(e2);
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public HostKey[] getHostKey() {
        return getHostKey(null, null);
    }

    public String getKnownHostsFile() {
        return this.known_hosts;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public String getKnownHostsRepositoryID() {
        return this.known_hosts;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void remove(String str, String str2) {
        remove(str, str2, null);
    }

    public void setKnownHosts(String str) {
        try {
            this.known_hosts = str;
            setKnownHosts(new FileInputStream(Util.checkTilde(str)));
        } catch (FileNotFoundException unused) {
        }
    }

    public void sync() {
        String str = this.known_hosts;
        if (str != null) {
            sync(str);
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public HostKey[] getHostKey(String str, String str2) {
        HostKey[] hostKeyArr;
        synchronized (this.pool) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.pool.size(); i++) {
                    HostKey hostKey = (HostKey) this.pool.elementAt(i);
                    if (hostKey.type != 6) {
                        if (str != null) {
                            if (hostKey.isMatched(str)) {
                                if (str2 != null && !hostKey.getType().equals(str2)) {
                                }
                            }
                        }
                        arrayList.add(hostKey);
                    }
                }
                int size = arrayList.size();
                hostKeyArr = new HostKey[size];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    hostKeyArr[i2] = (HostKey) arrayList.get(i2);
                }
                if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                    HostKey[] hostKey2 = getHostKey(str.substring(1, str.indexOf("]:")), str2);
                    if (hostKey2.length > 0) {
                        HostKey[] hostKeyArr2 = new HostKey[hostKey2.length + size];
                        System.arraycopy(hostKeyArr, 0, hostKeyArr2, 0, size);
                        System.arraycopy(hostKey2, 0, hostKeyArr2, size, hostKey2.length);
                        hostKeyArr = hostKeyArr2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hostKeyArr;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void remove(String str, String str2, byte[] bArr) {
        boolean z2;
        synchronized (this.pool) {
            z2 = false;
            for (int i = 0; i < this.pool.size(); i++) {
                try {
                    HostKey hostKey = (HostKey) this.pool.elementAt(i);
                    if (str != null) {
                        if (hostKey.isMatched(str)) {
                            if (str2 != null) {
                                if (hostKey.getType().equals(str2)) {
                                    if (bArr != null && !Util.array_equals(bArr, hostKey.key)) {
                                    }
                                }
                            }
                        }
                    }
                    String host = hostKey.getHost();
                    if (!host.equals(str) && (!(hostKey instanceof HashedHostKey) || !((HashedHostKey) hostKey).isHashed())) {
                        hostKey.host = deleteSubString(host, str);
                        z2 = true;
                    }
                    this.pool.removeElement(hostKey);
                    z2 = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            try {
                sync();
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void sync(String str) {
        if (str == null) {
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(Util.checkTilde(str));
        dump(fileOutputStream);
        fileOutputStream.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0135, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0129, code lost:
    
        if (r3 != 10) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x012c, code lost:
    
        if (r3 == 32) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x012e, code lost:
    
        if (r3 != 9) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0131, code lost:
    
        r0.append((char) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0137, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0138, code lost:
    
        r4 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0140, code lost:
    
        if (r4.length() != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0142, code lost:
    
        addInvalidLine(com.jcraft.jsch.Util.byte2str(r9, 0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014a, code lost:
    
        if (r3 >= r1) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014c, code lost:
    
        r14 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014e, code lost:
    
        if (r14 == 32) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0150, code lost:
    
        if (r14 != 9) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0155, code lost:
    
        if (r3 >= r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0157, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x015a, code lost:
    
        if (r3 >= r1) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x015c, code lost:
    
        r7 = r3 + 1;
        r3 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0160, code lost:
    
        if (r3 != 13) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x016a, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0163, code lost:
    
        if (r3 != 10) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0166, code lost:
    
        r0.append((char) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x016c, code lost:
    
        r1 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0174, code lost:
    
        r17.pool.addElement(new com.jcraft.jsch.KnownHosts.HashedHostKey(r17, r11, r12, r13, com.jcraft.jsch.Util.fromBase64(com.jcraft.jsch.Util.str2byte(r4), 0, r4.length()), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0172, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0152, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x011a, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0105, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00ce, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00d1, code lost:
    
        addInvalidLine(com.jcraft.jsch.Util.byte2str(r9, 0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00da, code lost:
    
        r12 = r11;
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0097, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0191, code lost:
    
        addInvalidLine(com.jcraft.jsch.Util.byte2str(r9, 0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r3 >= r1) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r11 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == 32) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r11 != 9) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r11 != 35) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        addInvalidLine(com.jcraft.jsch.Util.byte2str(r9, 0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r3 < r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        addInvalidLine(com.jcraft.jsch.Util.byte2str(r9, 0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r3 >= r1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r11 = r3 + 1;
        r3 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r3 == 32) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (r3 != 9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        r0.append((char) r3);
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        r11 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        if (r3 >= r1) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008b, code lost:
    
        if (r11.length() != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008f, code lost:
    
        if (r3 >= r1) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
    
        r12 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        if (r12 == 32) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
    
        if (r12 != 9) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
    
        if (r11.charAt(0) != '@') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        if (r3 >= r1) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        r12 = r3 + 1;
        r3 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        if (r3 == 32) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
    
        if (r3 != 9) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
    
        r0.append((char) r3);
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b9, code lost:
    
        r12 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
    
        if (r3 >= r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c3, code lost:
    
        if (r12.length() != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c6, code lost:
    
        if (r3 >= r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c8, code lost:
    
        r13 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
    
        if (r13 == 32) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        if (r13 != 9) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
    
        if (r3 >= r1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e4, code lost:
    
        r13 = r3 + 1;
        r3 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e8, code lost:
    
        if (r3 == 32) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ea, code lost:
    
        if (r3 != 9) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ed, code lost:
    
        r0.append((char) r3);
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f3, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f4, code lost:
    
        r13 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fd, code lost:
    
        if (com.jcraft.jsch.HostKey.name2type(r13) == 6) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ff, code lost:
    
        r4 = com.jcraft.jsch.HostKey.name2type(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0103, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0107, code lost:
    
        if (r3 < r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0109, code lost:
    
        addInvalidLine(com.jcraft.jsch.Util.byte2str(r9, 0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0112, code lost:
    
        if (r3 >= r1) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0114, code lost:
    
        r4 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0116, code lost:
    
        if (r4 == 32) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0118, code lost:
    
        if (r4 != 9) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011d, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0120, code lost:
    
        if (r3 >= r1) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0122, code lost:
    
        r4 = r3 + 1;
        r3 = r9[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0126, code lost:
    
        if (r3 != 13) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setKnownHosts(InputStream inputStream) {
        this.pool.removeAllElements();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    byte[] bArr2 = bArr;
                    int i = 0;
                    while (true) {
                        int read = inputStream.read();
                        int i2 = -1;
                        if (read == -1) {
                            if (i == 0) {
                                try {
                                    inputStream.close();
                                    return;
                                } catch (IOException e2) {
                                    throw new JSchException(e2.toString(), e2);
                                }
                            }
                        } else if (read != 13) {
                            if (read == 10) {
                                break;
                            }
                            if (bArr2.length <= i) {
                                if (i > 10240) {
                                    break;
                                }
                                byte[] bArr3 = new byte[bArr2.length * 2];
                                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                                bArr2 = bArr3;
                            }
                            int i3 = i + 1;
                            bArr2[i] = (byte) read;
                            i = i3;
                        }
                    }
                    bArr = bArr2;
                }
            } catch (Exception e3) {
                if (!(e3 instanceof JSchException)) {
                    throw new JSchException(e3.toString(), e3);
                }
                throw ((JSchException) e3);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e4) {
                throw new JSchException(e4.toString(), e4);
            }
        }
    }
}
