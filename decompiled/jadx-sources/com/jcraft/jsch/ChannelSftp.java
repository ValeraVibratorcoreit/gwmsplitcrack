package com.jcraft.jsch;

import com.jcraft.jsch.Channel;
import com.sun.jna.Function;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.Hashtable;
import java.util.Vector;
import p006C.AbstractC0062j;
import p097q.AbstractC1241e;

/* loaded from: classes.dex */
public class ChannelSftp extends ChannelSession {
    public static final int APPEND = 2;
    private static final int LOCAL_MAXIMUM_PACKET_SIZE = 32768;
    private static final int LOCAL_WINDOW_SIZE_MAX = 2097152;
    private static final int MAX_MSG_LENGTH = 262144;
    public static final int OVERWRITE = 0;
    public static final int RESUME = 1;
    private static final int SSH_FILEXFER_ATTR_ACMODTIME = 8;
    private static final int SSH_FILEXFER_ATTR_EXTENDED = Integer.MIN_VALUE;
    private static final int SSH_FILEXFER_ATTR_PERMISSIONS = 4;
    private static final int SSH_FILEXFER_ATTR_SIZE = 1;
    private static final int SSH_FILEXFER_ATTR_UIDGID = 2;
    private static final int SSH_FXF_APPEND = 4;
    private static final int SSH_FXF_CREAT = 8;
    private static final int SSH_FXF_EXCL = 32;
    private static final int SSH_FXF_READ = 1;
    private static final int SSH_FXF_TRUNC = 16;
    private static final int SSH_FXF_WRITE = 2;
    private static final byte SSH_FXP_ATTRS = 105;
    private static final byte SSH_FXP_CLOSE = 4;
    private static final byte SSH_FXP_DATA = 103;
    private static final byte SSH_FXP_EXTENDED = -56;
    private static final byte SSH_FXP_EXTENDED_REPLY = -55;
    private static final byte SSH_FXP_FSETSTAT = 10;
    private static final byte SSH_FXP_FSTAT = 8;
    private static final byte SSH_FXP_HANDLE = 102;
    private static final byte SSH_FXP_INIT = 1;
    private static final byte SSH_FXP_LSTAT = 7;
    private static final byte SSH_FXP_MKDIR = 14;
    private static final byte SSH_FXP_NAME = 104;
    private static final byte SSH_FXP_OPEN = 3;
    private static final byte SSH_FXP_OPENDIR = 11;
    private static final byte SSH_FXP_READ = 5;
    private static final byte SSH_FXP_READDIR = 12;
    private static final byte SSH_FXP_READLINK = 19;
    private static final byte SSH_FXP_REALPATH = 16;
    private static final byte SSH_FXP_REMOVE = 13;
    private static final byte SSH_FXP_RENAME = 18;
    private static final byte SSH_FXP_RMDIR = 15;
    private static final byte SSH_FXP_SETSTAT = 9;
    private static final byte SSH_FXP_STAT = 17;
    private static final byte SSH_FXP_STATUS = 101;
    private static final byte SSH_FXP_SYMLINK = 20;
    private static final byte SSH_FXP_VERSION = 2;
    private static final byte SSH_FXP_WRITE = 6;
    public static final int SSH_FX_BAD_MESSAGE = 5;
    public static final int SSH_FX_CONNECTION_LOST = 7;
    public static final int SSH_FX_EOF = 1;
    public static final int SSH_FX_FAILURE = 4;
    public static final int SSH_FX_NO_CONNECTION = 6;
    public static final int SSH_FX_NO_SUCH_FILE = 2;
    public static final int SSH_FX_OK = 0;
    public static final int SSH_FX_OP_UNSUPPORTED = 8;
    public static final int SSH_FX_PERMISSION_DENIED = 3;
    private static final String UTF8 = "UTF-8";
    private static final String file_separator = File.separator;
    private static final char file_separatorc;
    private static boolean fs_is_bs;
    private Buffer buf;
    private String cwd;
    private String home;
    private String lcwd;
    private Buffer obuf;
    private Packet opacket;
    private Packet packet;
    private boolean interactive = false;
    private int seq = 1;
    private int[] ackid = new int[1];
    private int client_version = 3;
    private int server_version = 3;
    private String version = String.valueOf(3);
    private Hashtable extensions = null;
    private InputStream io_in = null;
    private boolean extension_posix_rename = false;
    private boolean extension_statvfs = false;
    private boolean extension_hardlink = false;
    private String fEncoding = UTF8;
    private boolean fEncoding_is_utf8 = true;

    /* renamed from: rq */
    private RequestQueue f3769rq = new RequestQueue(16);

    public class Header {
        int length;
        int rid;
        int type;

        public Header() {
        }
    }

    public class LsEntry implements Comparable {
        private SftpATTRS attrs;
        private String filename;
        private String longname;

        public LsEntry(String str, String str2, SftpATTRS sftpATTRS) {
            setFilename(str);
            setLongname(str2);
            setAttrs(sftpATTRS);
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof LsEntry) {
                return this.filename.compareTo(((LsEntry) obj).getFilename());
            }
            throw new ClassCastException("a decendent of LsEntry must be given.");
        }

        public SftpATTRS getAttrs() {
            return this.attrs;
        }

        public String getFilename() {
            return this.filename;
        }

        public String getLongname() {
            return this.longname;
        }

        public void setAttrs(SftpATTRS sftpATTRS) {
            this.attrs = sftpATTRS;
        }

        public void setFilename(String str) {
            this.filename = str;
        }

        public void setLongname(String str) {
            this.longname = str;
        }

        public String toString() {
            return this.longname;
        }
    }

    public interface LsEntrySelector {
        public static final int BREAK = 1;
        public static final int CONTINUE = 0;

        int select(LsEntry lsEntry);
    }

    public class RequestQueue {
        int count;
        int head;
        Request[] rrq;

        public class OutOfOrderException extends Exception {
            long offset;

            public OutOfOrderException(long j2) {
                this.offset = j2;
            }
        }

        public class Request {

            /* renamed from: id */
            int f3770id;
            long length;
            long offset;

            public Request() {
            }
        }

        public RequestQueue(int i) {
            this.rrq = null;
            this.rrq = new Request[i];
            int i2 = 0;
            while (true) {
                Request[] requestArr = this.rrq;
                if (i2 >= requestArr.length) {
                    init();
                    return;
                } else {
                    requestArr[i2] = new Request();
                    i2++;
                }
            }
        }

        public void add(int i, long j2, int i2) {
            int i3 = this.count;
            if (i3 == 0) {
                this.head = 0;
            }
            int i4 = this.head + i3;
            Request[] requestArr = this.rrq;
            if (i4 >= requestArr.length) {
                i4 -= requestArr.length;
            }
            Request request = requestArr[i4];
            request.f3770id = i;
            request.offset = j2;
            request.length = i2;
            this.count = i3 + 1;
        }

        public void cancel(Header header, Buffer buffer) {
            int i = this.count;
            for (int i2 = 0; i2 < i; i2++) {
                header = ChannelSftp.this.header(buffer, header);
                int i3 = header.length;
                int i4 = 0;
                while (true) {
                    Request[] requestArr = this.rrq;
                    if (i4 < requestArr.length) {
                        Request request = requestArr[i4];
                        if (request.f3770id == header.rid) {
                            request.f3770id = 0;
                            break;
                        }
                        i4++;
                    }
                }
                ChannelSftp.this.skip(i3);
            }
            init();
        }

        public int count() {
            return this.count;
        }

        public Request get(int i) {
            this.count--;
            int i2 = this.head;
            int i3 = i2 + 1;
            this.head = i3;
            Request[] requestArr = this.rrq;
            if (i3 == requestArr.length) {
                this.head = 0;
            }
            Request request = requestArr[i2];
            if (request.f3770id == i) {
                request.f3770id = 0;
                return request;
            }
            long offset = getOffset();
            int i4 = 0;
            while (true) {
                Request[] requestArr2 = this.rrq;
                if (i4 >= requestArr2.length) {
                    throw new SftpException(4, AbstractC0062j.m156j(i, "RequestQueue: unknown request id "));
                }
                Request request2 = requestArr2[i4];
                if (request2.f3770id == i) {
                    request2.f3770id = 0;
                    throw new OutOfOrderException(offset);
                }
                i4++;
            }
        }

        public long getOffset() {
            long j2 = Long.MAX_VALUE;
            int i = 0;
            while (true) {
                Request[] requestArr = this.rrq;
                if (i >= requestArr.length) {
                    return j2;
                }
                Request request = requestArr[i];
                if (request.f3770id != 0) {
                    long j3 = request.offset;
                    if (j2 > j3) {
                        j2 = j3;
                    }
                }
                i++;
            }
        }

        public void init() {
            this.count = 0;
            this.head = 0;
        }

        public int size() {
            return this.rrq.length;
        }
    }

    static {
        char c2 = File.separatorChar;
        file_separatorc = c2;
        fs_is_bs = ((byte) c2) == 92;
    }

    public ChannelSftp() {
        setLocalWindowSizeMax(LOCAL_WINDOW_SIZE_MAX);
        setLocalWindowSize(LOCAL_WINDOW_SIZE_MAX);
        setLocalPacketSize(LOCAL_MAXIMUM_PACKET_SIZE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        throwStatusError(r20.buf, r20.buf.getInt());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void _get(String str, OutputStream outputStream, SftpProgressMonitor sftpProgressMonitor, int i, long j2) {
        Header header;
        RequestQueue.Request request;
        Header header2;
        try {
            sendOPENR(Util.str2byte(str, this.fEncoding));
            Header header3 = header(this.buf, new Header());
            int i2 = header3.length;
            int i3 = header3.type;
            fill(this.buf, i2);
            int i4 = 101;
            if (i3 != 101 && i3 != 102) {
                throw new SftpException(4, "");
            }
            byte[] string = this.buf.getString();
            int i5 = 1;
            long j3 = i == 1 ? j2 : 0L;
            this.f3769rq.init();
            int length = this.buf.buffer.length - 13;
            if (this.server_version == 0) {
                length = 1024;
            }
            long j4 = j3;
            int i6 = length;
            int i7 = 1;
            loop0: while (true) {
                if (this.f3769rq.count() < i7) {
                    int i8 = i6;
                    sendREAD(string, j4, i6, this.f3769rq);
                    j4 += i8;
                    i6 = i8;
                    i7 = i7;
                } else {
                    int i9 = i7;
                    int i10 = i6;
                    header = header(this.buf, header3);
                    int i11 = header.length;
                    int i12 = header.type;
                    try {
                        request = this.f3769rq.get(header.rid);
                        if (i12 == i4) {
                            fill(this.buf, i11);
                            int i13 = this.buf.getInt();
                            if (i13 == i5) {
                                break;
                            } else {
                                throwStatusError(this.buf, i13);
                            }
                        }
                    } catch (RequestQueue.OutOfOrderException e2) {
                        j4 = e2.offset;
                        skip(header.length);
                        this.f3769rq.cancel(header, this.buf);
                        i6 = i10;
                        header3 = header;
                        i7 = i9;
                    }
                    if (i12 != 103) {
                        break;
                    }
                    this.buf.rewind();
                    fill(this.buf.buffer, 0, 4);
                    int i14 = this.buf.getInt();
                    int i15 = (i11 - 4) - i14;
                    int i16 = i14;
                    while (i16 > 0) {
                        byte[] bArr = this.buf.buffer;
                        int read = this.io_in.read(bArr, 0, i16 > bArr.length ? bArr.length : i16);
                        if (read < 0) {
                            break loop0;
                        }
                        outputStream.write(this.buf.buffer, 0, read);
                        int i17 = i10;
                        long j5 = read;
                        i16 -= read;
                        if (sftpProgressMonitor == null || sftpProgressMonitor.count(j5)) {
                            i10 = i17;
                        } else {
                            skip(i16);
                            if (i15 > 0) {
                                skip(i15);
                            }
                        }
                    }
                    int i18 = i10;
                    if (i15 > 0) {
                        skip(i15);
                    }
                    long j6 = i14;
                    if (j6 < request.length) {
                        this.f3769rq.cancel(header, this.buf);
                        sendREAD(string, request.offset + j6, (int) (request.length - j6), this.f3769rq);
                        header2 = header;
                        j4 = request.offset + request.length;
                    } else {
                        header2 = header;
                    }
                    i7 = i9 < this.f3769rq.size() ? i9 + 1 : i9;
                    i6 = i18;
                    header3 = header2;
                    i4 = 101;
                    i5 = 1;
                }
            }
            outputStream.flush();
            if (sftpProgressMonitor != null) {
                sftpProgressMonitor.end();
            }
            this.f3769rq.cancel(header, this.buf);
            _sendCLOSE(string, header);
        } catch (Exception e3) {
            if (!(e3 instanceof SftpException)) {
                throw new SftpException(4, "", e3);
            }
            throw ((SftpException) e3);
        }
    }

    private SftpATTRS _lstat(String str) {
        try {
            sendLSTAT(Util.str2byte(str, this.fEncoding));
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 == 105) {
                return SftpATTRS.getATTR(this.buf);
            }
            if (i2 == 101) {
                throwStatusError(this.buf, this.buf.getInt());
            }
            throw new SftpException(4, "");
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    private byte[] _realpath(String str) {
        sendREALPATH(Util.str2byte(str, this.fEncoding));
        Header header = header(this.buf, new Header());
        int i = header.length;
        int i2 = header.type;
        fill(this.buf, i);
        if (i2 != 101 && i2 != 104) {
            throw new SftpException(4, "");
        }
        if (i2 == 101) {
            throwStatusError(this.buf, this.buf.getInt());
        }
        int i3 = this.buf.getInt();
        byte[] bArr = null;
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                return bArr;
            }
            bArr = this.buf.getString();
            if (this.server_version <= 3) {
                this.buf.getString();
            }
            SftpATTRS.getATTR(this.buf);
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean _sendCLOSE(byte[] bArr, Header header) {
        sendCLOSE(bArr);
        return checkStatus(null, header);
    }

    private void _setStat(String str, SftpATTRS sftpATTRS) {
        try {
            sendSETSTAT(Util.str2byte(str, this.fEncoding), sftpATTRS);
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            int i3 = this.buf.getInt();
            if (i3 != 0) {
                throwStatusError(this.buf, i3);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    private SftpATTRS _stat(byte[] bArr) {
        try {
            sendSTAT(bArr);
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 == 105) {
                return SftpATTRS.getATTR(this.buf);
            }
            if (i2 == 101) {
                throwStatusError(this.buf, this.buf.getInt());
            }
            throw new SftpException(4, "");
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    private SftpStatVFS _statVFS(byte[] bArr) {
        if (!this.extension_statvfs) {
            throw new SftpException(8, "statvfs@openssh.com is not supported");
        }
        try {
            sendSTATVFS(bArr);
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 == 201) {
                return SftpStatVFS.getStatVFS(this.buf);
            }
            if (i2 == 101) {
                throwStatusError(this.buf, this.buf.getInt());
            }
            throw new SftpException(4, "");
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkStatus(int[] iArr, Header header) {
        Header header2 = header(this.buf, header);
        int i = header2.length;
        int i2 = header2.type;
        if (iArr != null) {
            iArr[0] = header2.rid;
        }
        fill(this.buf, i);
        if (i2 != 101) {
            throw new SftpException(4, "");
        }
        int i3 = this.buf.getInt();
        if (i3 == 0) {
            return true;
        }
        throwStatusError(this.buf, i3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fill(Buffer buffer, int i) {
        buffer.reset();
        fill(buffer.buffer, 0, i);
        buffer.skip(i);
    }

    private String getCwd() {
        if (this.cwd == null) {
            this.cwd = getHome();
        }
        return this.cwd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (com.jcraft.jsch.ChannelSftp.fs_is_bs == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r9 = com.jcraft.jsch.Util.unquote(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r0.addElement(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Vector glob_local(String str) {
        byte[] bArr;
        Vector vector = new Vector();
        byte[] str2byte = Util.str2byte(str, UTF8);
        int length = str2byte.length - 1;
        while (length >= 0) {
            byte b2 = str2byte[length];
            if (b2 == 42 || b2 == 63) {
                if (fs_is_bs || length <= 0 || str2byte[length - 1] != 92) {
                    break;
                }
                int i = length - 1;
                if (i <= 0 || str2byte[length - 2] != 92) {
                    length = i;
                    break;
                }
                length -= 3;
            } else {
                length--;
            }
        }
        while (length >= 0) {
            byte b3 = str2byte[length];
            if (b3 == file_separatorc || (fs_is_bs && b3 == 47)) {
                break;
            }
            length--;
        }
        if (length < 0) {
            if (!fs_is_bs) {
                str = Util.unquote(str);
            }
            vector.addElement(str);
            return vector;
        }
        if (length == 0) {
            bArr = new byte[]{(byte) file_separatorc};
        } else {
            bArr = new byte[length];
            System.arraycopy(str2byte, 0, bArr, 0, length);
        }
        int length2 = (str2byte.length - length) - 1;
        byte[] bArr2 = new byte[length2];
        System.arraycopy(str2byte, length + 1, bArr2, 0, length2);
        try {
            String[] list = new File(Util.byte2str(bArr, UTF8)).list();
            String str2 = Util.byte2str(bArr) + file_separator;
            for (int i2 = 0; i2 < list.length; i2++) {
                if (Util.glob(bArr2, Util.str2byte(list[i2], UTF8))) {
                    vector.addElement(str2 + list[i2]);
                }
            }
        } catch (Exception unused) {
        }
        return vector;
    }

    private Vector glob_remote(String str) {
        byte[] bArr;
        String str2;
        Vector vector = new Vector();
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf < 0) {
            vector.addElement(Util.unquote(str));
            return vector;
        }
        int i = 0;
        String substring = str.substring(0, lastIndexOf == 0 ? 1 : lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        String unquote = Util.unquote(substring);
        byte[][] bArr2 = new byte[1][];
        if (!isPattern(substring2, bArr2)) {
            if (!unquote.equals("/")) {
                unquote = unquote.concat("/");
            }
            StringBuilder m2942a = AbstractC1241e.m2942a(unquote);
            m2942a.append(Util.unquote(substring2));
            vector.addElement(m2942a.toString());
            return vector;
        }
        byte[] bArr3 = bArr2[0];
        sendOPENDIR(Util.str2byte(unquote, this.fEncoding));
        Header header = header(this.buf, new Header());
        int i2 = header.length;
        int i3 = header.type;
        fill(this.buf, i2);
        int i4 = 4;
        int i5 = 101;
        if (i3 != 101 && i3 != 102) {
            throw new SftpException(4, "");
        }
        if (i3 == 101) {
            throwStatusError(this.buf, this.buf.getInt());
        }
        byte[] string = this.buf.getString();
        String str3 = null;
        while (true) {
            sendREADDIR(string);
            header = header(this.buf, header);
            int i6 = header.length;
            int i7 = header.type;
            if (i7 != i5 && i7 != 104) {
                throw new SftpException(i4, "");
            }
            if (i7 == i5) {
                fill(this.buf, i6);
                if (_sendCLOSE(string, header)) {
                    return vector;
                }
                return null;
            }
            this.buf.rewind();
            fill(this.buf.buffer, i, i4);
            int i8 = i6 - 4;
            this.buf.reset();
            for (int i9 = this.buf.getInt(); i9 > 0; i9--) {
                if (i8 > 0) {
                    this.buf.shift();
                    Buffer buffer = this.buf;
                    byte[] bArr4 = buffer.buffer;
                    int length = bArr4.length;
                    int i10 = buffer.index;
                    int read = this.io_in.read(bArr4, i10, length > i10 + i8 ? i8 : bArr4.length - i10);
                    if (read <= 0) {
                        break;
                    }
                    this.buf.index += read;
                    i8 -= read;
                }
                byte[] string2 = this.buf.getString();
                if (this.server_version <= 3) {
                    this.buf.getString();
                }
                SftpATTRS.getATTR(this.buf);
                if (this.fEncoding_is_utf8) {
                    bArr = string2;
                    str2 = null;
                } else {
                    str2 = Util.byte2str(string2, this.fEncoding);
                    bArr = Util.str2byte(str2, UTF8);
                }
                if (Util.glob(bArr3, bArr)) {
                    if (str2 == null) {
                        str2 = Util.byte2str(string2, this.fEncoding);
                    }
                    if (str3 == null) {
                        str3 = !unquote.endsWith("/") ? unquote.concat("/") : unquote;
                    }
                    vector.addElement(str3 + str2);
                }
            }
            i = 0;
            i4 = 4;
            i5 = 101;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Header header(Buffer buffer, Header header) {
        buffer.rewind();
        fill(buffer.buffer, 0, 9);
        header.length = buffer.getInt() - 5;
        header.type = buffer.getByte() & Function.USE_VARARGS;
        header.rid = buffer.getInt();
        return header;
    }

    private static boolean isLocalAbsolutePath(String str) {
        return new File(str).isAbsolute();
    }

    private boolean isPattern(byte[] bArr) {
        int i;
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 == 42 || b2 == 63) {
                return true;
            }
            if (b2 == 92 && (i = i2 + 1) < length) {
                i2 = i;
            }
            i2++;
        }
        return false;
    }

    private boolean isRemoteDir(String str) {
        try {
            sendSTAT(Util.str2byte(str, this.fEncoding));
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 105) {
                return false;
            }
            return SftpATTRS.getATTR(this.buf).isDir();
        } catch (Exception unused) {
            return false;
        }
    }

    private String isUnique(String str) {
        Vector glob_remote = glob_remote(str);
        if (glob_remote.size() == 1) {
            return (String) glob_remote.elementAt(0);
        }
        throw new SftpException(4, str + " is not unique: " + glob_remote.toString());
    }

    private String localAbsolutePath(String str) {
        if (isLocalAbsolutePath(str)) {
            return str;
        }
        String str2 = this.lcwd;
        String str3 = file_separator;
        if (str2.endsWith(str3)) {
            return AbstractC0062j.m162p(new StringBuilder(), this.lcwd, str);
        }
        return this.lcwd + str3 + str;
    }

    private void putHEAD(Buffer buffer, byte b2, int i) {
        buffer.putByte((byte) 94);
        buffer.putInt(this.recipient);
        buffer.putInt(i + 4);
        buffer.putInt(i);
        buffer.putByte(b2);
    }

    private void read(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int read = this.io_in.read(bArr, i, i2);
            if (read <= 0) {
                throw new SftpException(4, "");
            }
            i += read;
            i2 -= read;
        }
    }

    private String remoteAbsolutePath(String str) {
        if (str.charAt(0) == '/') {
            return str;
        }
        String cwd = getCwd();
        return cwd.endsWith("/") ? cwd.concat(str) : AbstractC0062j.m169w(cwd, "/", str);
    }

    private void sendCLOSE(byte[] bArr) {
        sendPacketPath(SSH_FXP_CLOSE, bArr);
    }

    private void sendFSTAT(byte[] bArr) {
        sendPacketPath(SSH_FXP_FSTAT, bArr);
    }

    private void sendHARDLINK(byte[] bArr, byte[] bArr2) {
        sendPacketPath((byte) 0, bArr, bArr2, "hardlink@openssh.com");
    }

    private void sendINIT() {
        this.packet.reset();
        putHEAD(SSH_FXP_INIT, 5);
        this.buf.putInt(3);
        getSession().write(this.packet, this, 9);
    }

    private void sendLSTAT(byte[] bArr) {
        sendPacketPath(SSH_FXP_LSTAT, bArr);
    }

    private void sendMKDIR(byte[] bArr, SftpATTRS sftpATTRS) {
        this.packet.reset();
        putHEAD(SSH_FXP_MKDIR, bArr.length + 9 + (sftpATTRS != null ? sftpATTRS.length() : 4));
        Buffer buffer = this.buf;
        int i = this.seq;
        this.seq = i + 1;
        buffer.putInt(i);
        this.buf.putString(bArr);
        if (sftpATTRS != null) {
            sftpATTRS.dump(this.buf);
        } else {
            this.buf.putInt(0);
        }
        getSession().write(this.packet, this, bArr.length + 9 + (sftpATTRS != null ? sftpATTRS.length() : 4) + 4);
    }

    private void sendOPEN(byte[] bArr, int i) {
        this.packet.reset();
        putHEAD(SSH_FXP_OPEN, bArr.length + 17);
        Buffer buffer = this.buf;
        int i2 = this.seq;
        this.seq = i2 + 1;
        buffer.putInt(i2);
        this.buf.putString(bArr);
        this.buf.putInt(i);
        this.buf.putInt(0);
        getSession().write(this.packet, this, bArr.length + 21);
    }

    private void sendOPENA(byte[] bArr) {
        sendOPEN(bArr, 10);
    }

    private void sendOPENDIR(byte[] bArr) {
        sendPacketPath(SSH_FXP_OPENDIR, bArr);
    }

    private void sendOPENR(byte[] bArr) {
        sendOPEN(bArr, 1);
    }

    private void sendOPENW(byte[] bArr) {
        sendOPEN(bArr, 26);
    }

    private void sendPacketPath(byte b2, byte[] bArr) {
        sendPacketPath(b2, bArr, (String) null);
    }

    private void sendREAD(byte[] bArr, long j2, int i) {
        sendREAD(bArr, j2, i, null);
    }

    private void sendREADDIR(byte[] bArr) {
        sendPacketPath(SSH_FXP_READDIR, bArr);
    }

    private void sendREADLINK(byte[] bArr) {
        sendPacketPath(SSH_FXP_READLINK, bArr);
    }

    private void sendREALPATH(byte[] bArr) {
        sendPacketPath(SSH_FXP_REALPATH, bArr);
    }

    private void sendREMOVE(byte[] bArr) {
        sendPacketPath(SSH_FXP_REMOVE, bArr);
    }

    private void sendRENAME(byte[] bArr, byte[] bArr2) {
        sendPacketPath(SSH_FXP_RENAME, bArr, bArr2, this.extension_posix_rename ? "posix-rename@openssh.com" : null);
    }

    private void sendRMDIR(byte[] bArr) {
        sendPacketPath(SSH_FXP_RMDIR, bArr);
    }

    private void sendSETSTAT(byte[] bArr, SftpATTRS sftpATTRS) {
        this.packet.reset();
        putHEAD(SSH_FXP_SETSTAT, sftpATTRS.length() + bArr.length + 9);
        Buffer buffer = this.buf;
        int i = this.seq;
        this.seq = i + 1;
        buffer.putInt(i);
        this.buf.putString(bArr);
        sftpATTRS.dump(this.buf);
        getSession().write(this.packet, this, sftpATTRS.length() + bArr.length + 9 + 4);
    }

    private void sendSTAT(byte[] bArr) {
        sendPacketPath(SSH_FXP_STAT, bArr);
    }

    private void sendSTATVFS(byte[] bArr) {
        sendPacketPath((byte) 0, bArr, "statvfs@openssh.com");
    }

    private void sendSYMLINK(byte[] bArr, byte[] bArr2) {
        sendPacketPath(SSH_FXP_SYMLINK, bArr, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int sendWRITE(byte[] bArr, long j2, byte[] bArr2, int i, int i2) {
        this.opacket.reset();
        Buffer buffer = this.obuf;
        byte[] bArr3 = buffer.buffer;
        int length = bArr3.length;
        int i3 = buffer.index;
        if (length < i3 + 34 + bArr.length + i2 + 128) {
            i2 = bArr3.length - (((i3 + 34) + bArr.length) + 128);
        }
        putHEAD(buffer, SSH_FXP_WRITE, bArr.length + 21 + i2);
        Buffer buffer2 = this.obuf;
        int i4 = this.seq;
        this.seq = i4 + 1;
        buffer2.putInt(i4);
        this.obuf.putString(bArr);
        this.obuf.putLong(j2);
        Buffer buffer3 = this.obuf;
        if (buffer3.buffer != bArr2) {
            buffer3.putString(bArr2, i, i2);
        } else {
            buffer3.putInt(i2);
            this.obuf.skip(i2);
        }
        getSession().write(this.opacket, this, bArr.length + 21 + i2 + 4);
        return i2;
    }

    private void setCwd(String str) {
        this.cwd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skip(long j2) {
        while (j2 > 0) {
            long skip = this.io_in.skip(j2);
            if (skip <= 0) {
                return;
            } else {
                j2 -= skip;
            }
        }
    }

    private void throwStatusError(Buffer buffer, int i) {
        if (this.server_version >= 3 && buffer.getLength() >= 4) {
            throw new SftpException(i, Util.byte2str(buffer.getString(), UTF8));
        }
        throw new SftpException(i, "Failure");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        sendOPENW(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        throwStatusError(r24.buf, r24.buf.getInt());
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x000f, B:11:0x0034, B:14:0x003d, B:15:0x004e, B:18:0x0054, B:19:0x005b, B:24:0x0078, B:25:0x0089, B:27:0x008c, B:28:0x0097, B:31:0x00a2, B:33:0x00bd, B:35:0x00c3, B:89:0x01c0, B:91:0x01c5, B:93:0x01cd, B:97:0x01d2, B:98:0x01d5, B:45:0x00e2, B:47:0x00e8, B:51:0x017e, B:53:0x019b, B:59:0x00f6, B:61:0x00fc, B:63:0x0104, B:65:0x010a, B:68:0x011a, B:71:0x0126, B:73:0x014a, B:75:0x0153, B:76:0x0176, B:84:0x01af, B:86:0x01ba, B:108:0x0058), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019b A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x000f, B:11:0x0034, B:14:0x003d, B:15:0x004e, B:18:0x0054, B:19:0x005b, B:24:0x0078, B:25:0x0089, B:27:0x008c, B:28:0x0097, B:31:0x00a2, B:33:0x00bd, B:35:0x00c3, B:89:0x01c0, B:91:0x01c5, B:93:0x01cd, B:97:0x01d2, B:98:0x01d5, B:45:0x00e2, B:47:0x00e8, B:51:0x017e, B:53:0x019b, B:59:0x00f6, B:61:0x00fc, B:63:0x0104, B:65:0x010a, B:68:0x011a, B:71:0x0126, B:73:0x014a, B:75:0x0153, B:76:0x0176, B:84:0x01af, B:86:0x01ba, B:108:0x0058), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d2 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x000f, B:11:0x0034, B:14:0x003d, B:15:0x004e, B:18:0x0054, B:19:0x005b, B:24:0x0078, B:25:0x0089, B:27:0x008c, B:28:0x0097, B:31:0x00a2, B:33:0x00bd, B:35:0x00c3, B:89:0x01c0, B:91:0x01c5, B:93:0x01cd, B:97:0x01d2, B:98:0x01d5, B:45:0x00e2, B:47:0x00e8, B:51:0x017e, B:53:0x019b, B:59:0x00f6, B:61:0x00fc, B:63:0x0104, B:65:0x010a, B:68:0x011a, B:71:0x0126, B:73:0x014a, B:75:0x0153, B:76:0x0176, B:84:0x01af, B:86:0x01ba, B:108:0x0058), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void _put(InputStream inputStream, String str, SftpProgressMonitor sftpProgressMonitor, int i) {
        long size;
        Header header;
        int i2;
        byte[] string;
        byte[] bArr;
        int length;
        int length2;
        int size2;
        int i3;
        int i4;
        int i5;
        int i6;
        int read;
        int i7;
        byte[] bArr2;
        Header header2;
        int i8;
        byte[] bArr3;
        int i9;
        int i10;
        int i11;
        Header header3;
        int i12;
        int i13;
        Header header4;
        byte[] bArr4;
        InputStream inputStream2 = inputStream;
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            byte[] str2byte = Util.str2byte(str, this.fEncoding);
            if (i == 1 || i == 2) {
                try {
                    size = _stat(str2byte).getSize();
                } catch (Exception unused) {
                }
                if (i == 1 && size > 0 && inputStream2.skip(size) < size) {
                    throw new SftpException(4, "failed to resume for " + str);
                }
                sendOPENA(str2byte);
                header = header(this.buf, new Header());
                int i14 = header.length;
                i2 = header.type;
                fill(this.buf, i14);
                if (i2 != 101 && i2 != 102) {
                    throw new SftpException(4, "invalid type=" + i2);
                }
                string = this.buf.getString();
                long j2 = (i != 1 || i == 2) ? size : 0L;
                int i15 = this.seq;
                bArr = this.obuf.buffer;
                length = string.length + 39;
                length2 = (bArr.length - length) - 128;
                size2 = this.f3769rq.size();
                i3 = 0;
                while (true) {
                    i4 = length2;
                    i5 = length;
                    i6 = 0;
                    while (true) {
                        read = inputStream2.read(bArr, i5, i4);
                        if (read > 0) {
                            i5 += read;
                            i4 -= read;
                            i6 += read;
                        }
                        i7 = i6;
                        if (i4 > 0 || read <= 0) {
                            break;
                        } else {
                            i6 = i7;
                        }
                    }
                    if (i7 <= 0) {
                        bArr3 = bArr;
                        i9 = length2;
                        int i16 = i7;
                        while (i16 > 0) {
                            int i17 = this.seq;
                            if (i17 - 1 != i15 && (i17 - i15) - i3 < size2) {
                                i12 = i3;
                                i11 = size2;
                                header3 = header;
                                byte[] bArr5 = string;
                                int i18 = i11;
                                int i19 = i12;
                                Header header5 = header3;
                                i16 -= sendWRITE(string, j2, bArr3, 0, i16);
                                bArr4 = this.obuf.buffer;
                                if (bArr3 == bArr4) {
                                    i9 = (bArr4.length - length) - 128;
                                    i3 = i19;
                                    header = header5;
                                    bArr3 = bArr4;
                                } else {
                                    i3 = i19;
                                    header = header5;
                                }
                                size2 = i18;
                                string = bArr5;
                            }
                            while ((this.seq - i15) - i3 >= size2 && checkStatus(this.ackid, header)) {
                                int i20 = this.ackid[0];
                                if (i15 <= i20 && i20 <= this.seq - 1) {
                                    i13 = size2;
                                    header4 = header;
                                    i3++;
                                    size2 = i13;
                                    header = header4;
                                }
                                i13 = size2;
                                if (i20 != this.seq) {
                                    throw new SftpException(4, "ack error: startid=" + i15 + " seq=" + this.seq + " _ackid=" + i20);
                                }
                                header4 = header;
                                System.err.println("ack error: startid=" + i15 + " seq=" + this.seq + " _ackid=" + i20);
                                i3++;
                                size2 = i13;
                                header = header4;
                            }
                            i11 = size2;
                            header3 = header;
                            i12 = i3;
                            byte[] bArr52 = string;
                            int i182 = i11;
                            int i192 = i12;
                            Header header52 = header3;
                            i16 -= sendWRITE(string, j2, bArr3, 0, i16);
                            bArr4 = this.obuf.buffer;
                            if (bArr3 == bArr4) {
                            }
                            size2 = i182;
                            string = bArr52;
                        }
                        bArr2 = string;
                        i10 = size2;
                        header2 = header;
                        long j3 = i7;
                        j2 += j3;
                        if (sftpProgressMonitor != null && !sftpProgressMonitor.count(j3)) {
                            break;
                        }
                        header = header2;
                        string = bArr2;
                        bArr = bArr3;
                        length2 = i9;
                        size2 = i10;
                        inputStream2 = inputStream;
                    } else {
                        bArr2 = string;
                        header2 = header;
                        break;
                    }
                }
                i8 = this.seq - i15;
                while (i8 > i3 && checkStatus(null, header2)) {
                    i3++;
                }
                if (sftpProgressMonitor != null) {
                    sftpProgressMonitor.end();
                }
                _sendCLOSE(bArr2, header2);
            }
            size = 0;
            if (i == 1) {
                throw new SftpException(4, "failed to resume for " + str);
            }
            sendOPENA(str2byte);
            header = header(this.buf, new Header());
            int i142 = header.length;
            i2 = header.type;
            fill(this.buf, i142);
            if (i2 != 101) {
                throw new SftpException(4, "invalid type=" + i2);
            }
            string = this.buf.getString();
            if (i != 1) {
            }
            int i152 = this.seq;
            bArr = this.obuf.buffer;
            length = string.length + 39;
            length2 = (bArr.length - length) - 128;
            size2 = this.f3769rq.size();
            i3 = 0;
            while (true) {
                i4 = length2;
                i5 = length;
                i6 = 0;
                while (true) {
                    read = inputStream2.read(bArr, i5, i4);
                    if (read > 0) {
                    }
                    i7 = i6;
                    if (i4 > 0) {
                        break;
                        break;
                    }
                    i6 = i7;
                }
                if (i7 <= 0) {
                }
                header = header2;
                string = bArr2;
                bArr = bArr3;
                length2 = i9;
                size2 = i10;
                inputStream2 = inputStream;
            }
            i8 = this.seq - i152;
            while (i8 > i3) {
                i3++;
            }
            if (sftpProgressMonitor != null) {
            }
            _sendCLOSE(bArr2, header2);
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, e2.toString(), e2);
            }
            throw ((SftpException) e2);
        }
    }

    /* renamed from: cd */
    public void m2147cd(String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String isUnique = isUnique(remoteAbsolutePath(str));
            byte[] _realpath = _realpath(isUnique);
            SftpATTRS _stat = _stat(_realpath);
            if ((_stat.getFlags() & 4) == 0) {
                throw new SftpException(4, "Can't change directory: " + isUnique);
            }
            if (_stat.isDir()) {
                setCwd(Util.byte2str(_realpath, this.fEncoding));
            } else {
                throw new SftpException(4, "Can't change directory: " + isUnique);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public void chgrp(int i, String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            Vector glob_remote = glob_remote(remoteAbsolutePath(str));
            int size = glob_remote.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) glob_remote.elementAt(i2);
                SftpATTRS _stat = _stat(str2);
                _stat.setFLAGS(0);
                _stat.setUIDGID(_stat.uid, i);
                _setStat(str2, _stat);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public void chmod(int i, String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            Vector glob_remote = glob_remote(remoteAbsolutePath(str));
            int size = glob_remote.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) glob_remote.elementAt(i2);
                SftpATTRS _stat = _stat(str2);
                _stat.setFLAGS(0);
                _stat.setPERMISSIONS(i);
                _setStat(str2, _stat);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public void chown(int i, String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            Vector glob_remote = glob_remote(remoteAbsolutePath(str));
            int size = glob_remote.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) glob_remote.elementAt(i2);
                SftpATTRS _stat = _stat(str2);
                _stat.setFLAGS(0);
                _stat.setUIDGID(i, _stat.gid);
                _setStat(str2, _stat);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void disconnect() {
        super.disconnect();
    }

    public void exit() {
        disconnect();
    }

    public void get(String str, String str2) {
        get(str, str2, null, 0);
    }

    public int getBulkRequests() {
        return this.f3769rq.size();
    }

    public String getExtension(String str) {
        Hashtable hashtable = this.extensions;
        if (hashtable == null) {
            return null;
        }
        return (String) hashtable.get(str);
    }

    public String getHome() {
        if (this.home == null) {
            try {
                ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
                this.home = Util.byte2str(_realpath(""), this.fEncoding);
            } catch (Exception e2) {
                if (e2 instanceof SftpException) {
                    throw ((SftpException) e2);
                }
                throw new SftpException(4, "", e2);
            }
        }
        return this.home;
    }

    public int getServerVersion() {
        if (isConnected()) {
            return this.server_version;
        }
        throw new SftpException(4, "The channel is not connected.");
    }

    public void hardlink(String str, String str2) {
        if (!this.extension_hardlink) {
            throw new SftpException(8, "hardlink@openssh.com is not supported");
        }
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String remoteAbsolutePath = remoteAbsolutePath(str);
            String remoteAbsolutePath2 = remoteAbsolutePath(str2);
            String isUnique = isUnique(remoteAbsolutePath);
            if (str.charAt(0) != '/') {
                isUnique = isUnique.substring(getCwd().length() + (!r6.endsWith("/")));
            }
            if (isPattern(remoteAbsolutePath2)) {
                throw new SftpException(4, remoteAbsolutePath2);
            }
            sendHARDLINK(Util.str2byte(isUnique, this.fEncoding), Util.str2byte(Util.unquote(remoteAbsolutePath2), this.fEncoding));
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            int i3 = this.buf.getInt();
            if (i3 == 0) {
                return;
            }
            throwStatusError(this.buf, i3);
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void init() {
    }

    public void lcd(String str) {
        String localAbsolutePath = localAbsolutePath(str);
        if (!new File(localAbsolutePath).isDirectory()) {
            throw new SftpException(2, "No such directory");
        }
        try {
            localAbsolutePath = new File(localAbsolutePath).getCanonicalPath();
        } catch (Exception unused) {
        }
        this.lcwd = localAbsolutePath;
    }

    public String lpwd() {
        return this.lcwd;
    }

    /* renamed from: ls */
    public Vector m2148ls(String str) {
        final Vector vector = new Vector();
        m2149ls(str, new LsEntrySelector() { // from class: com.jcraft.jsch.ChannelSftp.3
            @Override // com.jcraft.jsch.ChannelSftp.LsEntrySelector
            public int select(LsEntry lsEntry) {
                vector.addElement(lsEntry);
                return 0;
            }
        });
        return vector;
    }

    public SftpATTRS lstat(String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            return _lstat(isUnique(remoteAbsolutePath(str)));
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    public void mkdir(String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            sendMKDIR(Util.str2byte(remoteAbsolutePath(str), this.fEncoding), null);
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            int i3 = this.buf.getInt();
            if (i3 == 0) {
                return;
            }
            throwStatusError(this.buf, i3);
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public void put(String str, String str2) {
        put(str, str2, (SftpProgressMonitor) null, 0);
    }

    public String pwd() {
        return getCwd();
    }

    public void quit() {
        disconnect();
    }

    public String readlink(String str) {
        try {
            if (this.server_version < 3) {
                throw new SftpException(8, "The remote sshd is too old to support symlink operation.");
            }
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            sendREADLINK(Util.str2byte(isUnique(remoteAbsolutePath(str)), this.fEncoding));
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 101 && i2 != 104) {
                throw new SftpException(4, "");
            }
            byte[] bArr = null;
            if (i2 != 104) {
                throwStatusError(this.buf, this.buf.getInt());
                return null;
            }
            int i3 = this.buf.getInt();
            for (int i4 = 0; i4 < i3; i4++) {
                bArr = this.buf.getString();
                if (this.server_version <= 3) {
                    this.buf.getString();
                }
                SftpATTRS.getATTR(this.buf);
            }
            return Util.byte2str(bArr, this.fEncoding);
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    public String realpath(String str) {
        try {
            return Util.byte2str(_realpath(remoteAbsolutePath(str)), this.fEncoding);
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    public void rename(String str, String str2) {
        String unquote;
        if (this.server_version < 2) {
            throw new SftpException(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String remoteAbsolutePath = remoteAbsolutePath(str);
            String remoteAbsolutePath2 = remoteAbsolutePath(str2);
            String isUnique = isUnique(remoteAbsolutePath);
            Vector glob_remote = glob_remote(remoteAbsolutePath2);
            int size = glob_remote.size();
            if (size >= 2) {
                throw new SftpException(4, glob_remote.toString());
            }
            if (size == 1) {
                unquote = (String) glob_remote.elementAt(0);
            } else {
                if (isPattern(remoteAbsolutePath2)) {
                    throw new SftpException(4, remoteAbsolutePath2);
                }
                unquote = Util.unquote(remoteAbsolutePath2);
            }
            sendRENAME(Util.str2byte(isUnique, this.fEncoding), Util.str2byte(unquote, this.fEncoding));
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            int i3 = this.buf.getInt();
            if (i3 == 0) {
                return;
            }
            throwStatusError(this.buf, i3);
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    /* renamed from: rm */
    public void m2150rm(String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            Vector glob_remote = glob_remote(remoteAbsolutePath(str));
            int size = glob_remote.size();
            Header header = new Header();
            for (int i = 0; i < size; i++) {
                sendREMOVE(Util.str2byte((String) glob_remote.elementAt(i), this.fEncoding));
                header = header(this.buf, header);
                int i2 = header.length;
                int i3 = header.type;
                fill(this.buf, i2);
                if (i3 != 101) {
                    throw new SftpException(4, "");
                }
                int i4 = this.buf.getInt();
                if (i4 != 0) {
                    throwStatusError(this.buf, i4);
                }
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public void rmdir(String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            Vector glob_remote = glob_remote(remoteAbsolutePath(str));
            int size = glob_remote.size();
            Header header = new Header();
            for (int i = 0; i < size; i++) {
                sendRMDIR(Util.str2byte((String) glob_remote.elementAt(i), this.fEncoding));
                header = header(this.buf, header);
                int i2 = header.length;
                int i3 = header.type;
                fill(this.buf, i2);
                if (i3 != 101) {
                    throw new SftpException(4, "");
                }
                int i4 = this.buf.getInt();
                if (i4 != 0) {
                    throwStatusError(this.buf, i4);
                }
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    @Override // com.jcraft.jsch.ChannelSession, com.jcraft.jsch.Channel, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setAgentForwarding(boolean z2) {
        super.setAgentForwarding(z2);
    }

    public void setBulkRequests(int i) {
        if (i > 0) {
            this.f3769rq = new RequestQueue(i);
            return;
        }
        throw new JSchException("setBulkRequests: " + i + " must be greater than 0.");
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(String str, String str2) {
        super.setEnv(str, str2);
    }

    public void setFilenameEncoding(String str) {
        int serverVersion = getServerVersion();
        if (3 <= serverVersion && serverVersion <= 5 && !str.equals(UTF8)) {
            throw new SftpException(4, "The encoding can not be changed for this sftp server.");
        }
        if (str.equals(UTF8)) {
            str = UTF8;
        }
        this.fEncoding = str;
        this.fEncoding_is_utf8 = str.equals(UTF8);
    }

    public void setMtime(String str, int i) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            Vector glob_remote = glob_remote(remoteAbsolutePath(str));
            int size = glob_remote.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) glob_remote.elementAt(i2);
                SftpATTRS _stat = _stat(str2);
                _stat.setFLAGS(0);
                _stat.setACMODTIME(_stat.getATime(), i);
                _setStat(str2, _stat);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPty(boolean z2) {
        super.setPty(z2);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPtySize(int i, int i2, int i3, int i4) {
        super.setPtySize(i, i2, i3, i4);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPtyType(String str) {
        super.setPtyType(str);
    }

    public void setStat(String str, SftpATTRS sftpATTRS) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            Vector glob_remote = glob_remote(remoteAbsolutePath(str));
            int size = glob_remote.size();
            for (int i = 0; i < size; i++) {
                _setStat((String) glob_remote.elementAt(i), sftpATTRS);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setTerminalMode(byte[] bArr) {
        super.setTerminalMode(bArr);
    }

    @Override // com.jcraft.jsch.ChannelSession, com.jcraft.jsch.Channel
    public /* bridge */ /* synthetic */ void setXForwarding(boolean z2) {
        super.setXForwarding(z2);
    }

    @Override // com.jcraft.jsch.Channel
    public void start() {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.f3767io.setOutputStream(pipedOutputStream);
            this.f3767io.setInputStream(new Channel.MyPipedInputStream(pipedOutputStream, this.rmpsize));
            InputStream inputStream = this.f3767io.f3785in;
            this.io_in = inputStream;
            if (inputStream == null) {
                throw new JSchException("channel is down");
            }
            new RequestSftp().request(getSession(), this);
            Buffer buffer = new Buffer(this.lmpsize);
            this.buf = buffer;
            this.packet = new Packet(buffer);
            Buffer buffer2 = new Buffer(this.rmpsize);
            this.obuf = buffer2;
            this.opacket = new Packet(buffer2);
            sendINIT();
            Header header = header(this.buf, new Header());
            int i = header.length;
            if (i > MAX_MSG_LENGTH) {
                throw new SftpException(4, "Received message is too long: " + i);
            }
            this.server_version = header.rid;
            this.extensions = new Hashtable();
            if (i > 0) {
                fill(this.buf, i);
                while (i > 0) {
                    byte[] string = this.buf.getString();
                    int length = i - (string.length + 4);
                    byte[] string2 = this.buf.getString();
                    i = length - (string2.length + 4);
                    this.extensions.put(Util.byte2str(string), Util.byte2str(string2));
                }
            }
            if (this.extensions.get("posix-rename@openssh.com") != null && this.extensions.get("posix-rename@openssh.com").equals("1")) {
                this.extension_posix_rename = true;
            }
            if (this.extensions.get("statvfs@openssh.com") != null && this.extensions.get("statvfs@openssh.com").equals("2")) {
                this.extension_statvfs = true;
            }
            if (this.extensions.get("hardlink@openssh.com") != null && this.extensions.get("hardlink@openssh.com").equals("1")) {
                this.extension_hardlink = true;
            }
            this.lcwd = new File(".").getCanonicalPath();
        } catch (Exception e2) {
            if (!(e2 instanceof JSchException)) {
                throw new JSchException(e2.toString(), e2);
            }
            throw ((JSchException) e2);
        }
    }

    public SftpATTRS stat(String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            return _stat(isUnique(remoteAbsolutePath(str)));
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    public SftpStatVFS statVFS(String str) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            return _statVFS(isUnique(remoteAbsolutePath(str)));
        } catch (Exception e2) {
            if (e2 instanceof SftpException) {
                throw ((SftpException) e2);
            }
            throw new SftpException(4, "", e2);
        }
    }

    public void symlink(String str, String str2) {
        if (this.server_version < 3) {
            throw new SftpException(8, "The remote sshd is too old to support symlink operation.");
        }
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String remoteAbsolutePath = remoteAbsolutePath(str);
            String remoteAbsolutePath2 = remoteAbsolutePath(str2);
            String isUnique = isUnique(remoteAbsolutePath);
            if (str.charAt(0) != '/') {
                isUnique = isUnique.substring(getCwd().length() + (!r6.endsWith("/")));
            }
            if (isPattern(remoteAbsolutePath2)) {
                throw new SftpException(4, remoteAbsolutePath2);
            }
            sendSYMLINK(Util.str2byte(isUnique, this.fEncoding), Util.str2byte(Util.unquote(remoteAbsolutePath2), this.fEncoding));
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            int i3 = this.buf.getInt();
            if (i3 == 0) {
                return;
            }
            throwStatusError(this.buf, i3);
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public String version() {
        return this.version;
    }

    private void sendPacketPath(byte b2, byte[] bArr, String str) {
        this.packet.reset();
        int length = bArr.length + 9;
        if (str == null) {
            putHEAD(b2, length);
            Buffer buffer = this.buf;
            int i = this.seq;
            this.seq = i + 1;
            buffer.putInt(i);
        } else {
            length += str.length() + 4;
            putHEAD(SSH_FXP_EXTENDED, length);
            Buffer buffer2 = this.buf;
            int i2 = this.seq;
            this.seq = i2 + 1;
            buffer2.putInt(i2);
            this.buf.putString(Util.str2byte(str));
        }
        this.buf.putString(bArr);
        getSession().write(this.packet, this, length + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendREAD(byte[] bArr, long j2, int i, RequestQueue requestQueue) {
        this.packet.reset();
        putHEAD(SSH_FXP_READ, bArr.length + 21);
        Buffer buffer = this.buf;
        int i2 = this.seq;
        this.seq = i2 + 1;
        buffer.putInt(i2);
        this.buf.putString(bArr);
        this.buf.putLong(j2);
        this.buf.putInt(i);
        getSession().write(this.packet, this, bArr.length + 25);
        if (requestQueue != null) {
            requestQueue.add(this.seq - 1, j2, i);
        }
    }

    public void get(String str, String str2, SftpProgressMonitor sftpProgressMonitor) {
        get(str, str2, sftpProgressMonitor, 0);
    }

    public void put(String str, String str2, int i) {
        put(str, str2, (SftpProgressMonitor) null, i);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(Hashtable hashtable) {
        super.setEnv(hashtable);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPtyType(String str, int i, int i2, int i3, int i4) {
        super.setPtyType(str, i, i2, i3, i4);
    }

    private boolean isPattern(String str, byte[][] bArr) {
        byte[] str2byte = Util.str2byte(str, UTF8);
        if (bArr != null) {
            bArr[0] = str2byte;
        }
        return isPattern(str2byte);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0 A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:35:0x0102, B:37:0x010a, B:44:0x0119, B:45:0x0130, B:47:0x0136, B:49:0x014d, B:50:0x015c, B:56:0x018e, B:61:0x01a0, B:62:0x01a3), top: B:34:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void get(String str, String str2, SftpProgressMonitor sftpProgressMonitor, int i) {
        boolean z2;
        String str3;
        File file;
        String str4;
        StringBuffer stringBuffer;
        String str5;
        String str6;
        int i2;
        StringBuffer stringBuffer2;
        String str7;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        boolean z3;
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String remoteAbsolutePath = remoteAbsolutePath(str);
            String localAbsolutePath = localAbsolutePath(str2);
            Vector glob_remote = glob_remote(remoteAbsolutePath);
            int size = glob_remote.size();
            try {
                if (size != 0) {
                    boolean isDirectory = new File(localAbsolutePath).isDirectory();
                    if (isDirectory) {
                        String str8 = file_separator;
                        if (!localAbsolutePath.endsWith(str8)) {
                            localAbsolutePath = localAbsolutePath + str8;
                        }
                        stringBuffer = new StringBuffer(localAbsolutePath);
                        str4 = localAbsolutePath;
                    } else {
                        if (size > 1) {
                            throw new SftpException(4, "Copying multiple files, but destination is missing or a file.");
                        }
                        str4 = localAbsolutePath;
                        stringBuffer = null;
                    }
                    String str9 = null;
                    int i3 = 0;
                    boolean z4 = false;
                    while (i3 < size) {
                        try {
                            String str10 = (String) glob_remote.elementAt(i3);
                            SftpATTRS _stat = _stat(str10);
                            if (!_stat.isDir()) {
                                if (isDirectory) {
                                    try {
                                        int lastIndexOf = str10.lastIndexOf(47);
                                        if (lastIndexOf == -1) {
                                            stringBuffer.append(str10);
                                        } else {
                                            stringBuffer.append(str10.substring(lastIndexOf + 1));
                                        }
                                        String stringBuffer3 = stringBuffer.toString();
                                        if (stringBuffer3.indexOf("..") != -1) {
                                            String canonicalPath = new File(str4).getCanonicalPath();
                                            String canonicalPath2 = new File(stringBuffer3).getCanonicalPath();
                                            if (canonicalPath2.length() > canonicalPath.length()) {
                                                if (canonicalPath2.substring(0, canonicalPath.length() + 1).equals(canonicalPath + file_separator)) {
                                                }
                                            }
                                            throw new SftpException(4, "writing to an unexpected file " + str10);
                                        }
                                        stringBuffer.delete(str4.length(), stringBuffer3.length());
                                        str5 = stringBuffer3;
                                    } catch (Exception e2) {
                                        e = e2;
                                        z2 = z4;
                                        str3 = null;
                                        if (!z2 && str3 != null) {
                                            file = new File(str3);
                                            if (file.exists() && file.length() == 0) {
                                                file.delete();
                                            }
                                        }
                                        if (e instanceof SftpException) {
                                            throw new SftpException(4, "", e);
                                        }
                                        throw ((SftpException) e);
                                    }
                                } else {
                                    str5 = str4;
                                }
                                try {
                                    File file2 = new File(str5);
                                    if (i == 1) {
                                        long size2 = _stat.getSize();
                                        long length = file2.length();
                                        if (length > size2) {
                                            throw new SftpException(4, "failed to resume for " + str5);
                                        }
                                        if (length == size2) {
                                            return;
                                        }
                                    }
                                    if (sftpProgressMonitor != null) {
                                        str6 = str10;
                                        i2 = i3;
                                        stringBuffer2 = stringBuffer;
                                        str7 = str4;
                                        sftpProgressMonitor.init(1, str10, str5, _stat.getSize());
                                        if (i == 1) {
                                            sftpProgressMonitor.count(file2.length());
                                        }
                                    } else {
                                        str6 = str10;
                                        i2 = i3;
                                        stringBuffer2 = stringBuffer;
                                        str7 = str4;
                                    }
                                    z4 = file2.exists();
                                    if (i == 0) {
                                        try {
                                            fileOutputStream2 = new FileOutputStream(str5);
                                            z3 = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = null;
                                            if (fileOutputStream != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        z3 = true;
                                        fileOutputStream2 = new FileOutputStream(str5, true);
                                    }
                                    try {
                                        _get(str6, fileOutputStream2, sftpProgressMonitor, i, new File(str5).length());
                                        fileOutputStream2.close();
                                        i3 = i2 + 1;
                                        str9 = str5;
                                        str4 = str7;
                                        stringBuffer = stringBuffer2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    str3 = str5;
                                    z2 = z4;
                                    if (!z2) {
                                        file = new File(str3);
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                    }
                                    if (e instanceof SftpException) {
                                    }
                                }
                            } else {
                                throw new SftpException(4, "not supported to get directory " + str10);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str3 = str9;
                        }
                    }
                    return;
                }
                throw new SftpException(2, "No such file");
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e6) {
            e = e6;
            z2 = false;
        }
    }

    public void put(String str, String str2, SftpProgressMonitor sftpProgressMonitor) {
        put(str, str2, sftpProgressMonitor, 0);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(byte[] bArr, byte[] bArr2) {
        super.setEnv(bArr, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int fill(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (i2 > 0) {
            int read = this.io_in.read(bArr, i3, i2);
            if (read <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += read;
            i2 -= read;
        }
        return i3 - i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        throwStatusError(r17.buf, r17.buf.getInt());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        fill(r17.buf, r12);
        r13 = r17.buf.getInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (r13 != r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        throwStatusError(r17.buf, r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* renamed from: ls */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2149ls(String str, LsEntrySelector lsEntrySelector) {
        byte[] str2byte;
        byte[] bArr;
        String str2;
        int glob;
        String str3;
        String byte2str;
        int i;
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String remoteAbsolutePath = remoteAbsolutePath(str);
            new Vector();
            int lastIndexOf = remoteAbsolutePath.lastIndexOf(47);
            int i2 = 1;
            int i3 = 0;
            String substring = remoteAbsolutePath.substring(0, lastIndexOf == 0 ? 1 : lastIndexOf);
            String substring2 = remoteAbsolutePath.substring(lastIndexOf + 1);
            String unquote = Util.unquote(substring);
            byte[][] bArr2 = new byte[1][];
            boolean isPattern = isPattern(substring2, bArr2);
            if (isPattern) {
                str2byte = bArr2[0];
            } else {
                String unquote2 = Util.unquote(remoteAbsolutePath);
                if (_stat(unquote2).isDir()) {
                    unquote = unquote2;
                    str2byte = null;
                } else if (this.fEncoding_is_utf8) {
                    str2byte = Util.unquote(bArr2[0]);
                } else {
                    str2byte = Util.str2byte(Util.unquote(substring2), this.fEncoding);
                }
            }
            sendOPENDIR(Util.str2byte(unquote, this.fEncoding));
            Header header = header(this.buf, new Header());
            int i4 = header.length;
            int i5 = header.type;
            fill(this.buf, i4);
            int i6 = 101;
            if (i5 != 101 && i5 != 102) {
                throw new SftpException(4, "");
            }
            byte[] string = this.buf.getString();
            int i7 = 0;
            while (i7 == 0) {
                sendREADDIR(string);
                header = header(this.buf, header);
                int i8 = header.length;
                int i9 = header.type;
                if (i9 != i6 && i9 != 104) {
                    throw new SftpException(4, "");
                }
                this.buf.rewind();
                fill(this.buf.buffer, i3, 4);
                int i10 = i8 - 4;
                int i11 = this.buf.getInt();
                this.buf.reset();
                while (i11 > 0) {
                    if (i10 > 0) {
                        this.buf.shift();
                        Buffer buffer = this.buf;
                        byte[] bArr3 = buffer.buffer;
                        int length = bArr3.length;
                        int i12 = buffer.index;
                        int fill = fill(bArr3, i12, length > i12 + i10 ? i10 : bArr3.length - i12);
                        this.buf.index += fill;
                        i10 -= fill;
                    }
                    byte[] string2 = this.buf.getString();
                    byte[] string3 = this.server_version <= 3 ? this.buf.getString() : null;
                    SftpATTRS attr = SftpATTRS.getATTR(this.buf);
                    if (i7 == i2) {
                        i11--;
                    } else {
                        if (str2byte == null) {
                            i = i2;
                        } else if (!isPattern) {
                            i = Util.array_equals(str2byte, string2);
                        } else {
                            if (this.fEncoding_is_utf8) {
                                bArr = string2;
                                str2 = null;
                            } else {
                                str2 = Util.byte2str(string2, this.fEncoding);
                                bArr = Util.str2byte(str2, UTF8);
                            }
                            String str4 = str2;
                            glob = Util.glob(str2byte, bArr);
                            str3 = str4;
                            if (glob != 0) {
                                if (str3 == null) {
                                    str3 = Util.byte2str(string2, this.fEncoding);
                                }
                                if (string3 == null) {
                                    byte2str = attr.toString() + " " + str3;
                                } else {
                                    byte2str = Util.byte2str(string3, this.fEncoding);
                                }
                                i7 = lsEntrySelector.select(new LsEntry(str3, byte2str, attr));
                            }
                            i11--;
                            i2 = 1;
                        }
                        str3 = null;
                        glob = i;
                        if (glob != 0) {
                        }
                        i11--;
                        i2 = 1;
                    }
                    i6 = 101;
                    i3 = 0;
                }
                i2 = 1;
            }
            _sendCLOSE(string, header);
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public void put(String str, String str2, SftpProgressMonitor sftpProgressMonitor, int i) {
        String str3;
        StringBuffer stringBuffer;
        String str4;
        String str5;
        int i2;
        String str6;
        StringBuffer stringBuffer2;
        FileInputStream fileInputStream;
        int lastIndexOf;
        int i3 = 4;
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String localAbsolutePath = localAbsolutePath(str);
            String remoteAbsolutePath = remoteAbsolutePath(str2);
            Vector glob_remote = glob_remote(remoteAbsolutePath);
            int size = glob_remote.size();
            if (size != 1) {
                if (size == 0) {
                    if (isPattern(remoteAbsolutePath)) {
                        throw new SftpException(4, remoteAbsolutePath);
                    }
                    Util.unquote(remoteAbsolutePath);
                }
                throw new SftpException(4, glob_remote.toString());
            }
            String str7 = (String) glob_remote.elementAt(0);
            boolean isRemoteDir = isRemoteDir(str7);
            Vector glob_local = glob_local(localAbsolutePath);
            int size2 = glob_local.size();
            if (isRemoteDir) {
                if (!str7.endsWith("/")) {
                    str7 = str7.concat("/");
                }
                stringBuffer = new StringBuffer(str7);
                str3 = str7;
            } else {
                if (size2 > 1) {
                    throw new SftpException(4, "Copying multiple files, but the destination is missing or a file.");
                }
                str3 = str7;
                stringBuffer = null;
            }
            int i4 = 0;
            while (i4 < size2) {
                String str8 = (String) glob_local.elementAt(i4);
                if (isRemoteDir) {
                    int lastIndexOf2 = str8.lastIndexOf(file_separatorc);
                    if (fs_is_bs && (lastIndexOf = str8.lastIndexOf(47)) != -1 && lastIndexOf > lastIndexOf2) {
                        lastIndexOf2 = lastIndexOf;
                    }
                    if (lastIndexOf2 == -1) {
                        stringBuffer.append(str8);
                    } else {
                        stringBuffer.append(str8.substring(lastIndexOf2 + 1));
                    }
                    String stringBuffer3 = stringBuffer.toString();
                    stringBuffer.delete(str3.length(), stringBuffer3.length());
                    str4 = stringBuffer3;
                } else {
                    str4 = str3;
                }
                long j2 = 0;
                if (i == 1) {
                    try {
                        j2 = _stat(str4).getSize();
                    } catch (Exception unused) {
                    }
                    long length = new File(str8).length();
                    if (length < j2) {
                        throw new SftpException(i3, "failed to resume for " + str4);
                    }
                    if (length == j2) {
                        return;
                    }
                }
                long j3 = j2;
                if (sftpProgressMonitor != null) {
                    stringBuffer2 = stringBuffer;
                    str5 = str4;
                    i2 = i4;
                    str6 = str8;
                    sftpProgressMonitor.init(0, str8, str4, new File(str8).length());
                    if (i == 1) {
                        sftpProgressMonitor.count(j3);
                    }
                } else {
                    str5 = str4;
                    i2 = i4;
                    str6 = str8;
                    stringBuffer2 = stringBuffer;
                }
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str6);
                    try {
                        _put(fileInputStream2, str5, sftpProgressMonitor, i);
                        fileInputStream2.close();
                        i4 = i2 + 1;
                        stringBuffer = stringBuffer2;
                        i3 = 4;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
            }
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, e2.toString(), e2);
            }
            throw ((SftpException) e2);
        }
    }

    private boolean isPattern(String str) {
        return isPattern(str, null);
    }

    private void putHEAD(byte b2, int i) {
        putHEAD(this.buf, b2, i);
    }

    private void sendPacketPath(byte b2, byte[] bArr, byte[] bArr2) {
        sendPacketPath(b2, bArr, bArr2, null);
    }

    private void sendPacketPath(byte b2, byte[] bArr, byte[] bArr2, String str) {
        this.packet.reset();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            putHEAD(b2, length);
            Buffer buffer = this.buf;
            int i = this.seq;
            this.seq = i + 1;
            buffer.putInt(i);
        } else {
            length += str.length() + 4;
            putHEAD(SSH_FXP_EXTENDED, length);
            Buffer buffer2 = this.buf;
            int i2 = this.seq;
            this.seq = i2 + 1;
            buffer2.putInt(i2);
            this.buf.putString(Util.str2byte(str));
        }
        this.buf.putString(bArr);
        this.buf.putString(bArr2);
        getSession().write(this.packet, this, length + 4);
    }

    private SftpATTRS _stat(String str) {
        return _stat(Util.str2byte(str, this.fEncoding));
    }

    private SftpStatVFS _statVFS(String str) {
        return _statVFS(Util.str2byte(str, this.fEncoding));
    }

    public void put(InputStream inputStream, String str) {
        put(inputStream, str, (SftpProgressMonitor) null, 0);
    }

    public void put(InputStream inputStream, String str, int i) {
        put(inputStream, str, (SftpProgressMonitor) null, i);
    }

    public void put(InputStream inputStream, String str, SftpProgressMonitor sftpProgressMonitor) {
        put(inputStream, str, sftpProgressMonitor, 0);
    }

    public void put(InputStream inputStream, String str, SftpProgressMonitor sftpProgressMonitor, int i) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String remoteAbsolutePath = remoteAbsolutePath(str);
            Vector glob_remote = glob_remote(remoteAbsolutePath);
            int size = glob_remote.size();
            if (size != 1) {
                if (size == 0) {
                    if (isPattern(remoteAbsolutePath)) {
                        throw new SftpException(4, remoteAbsolutePath);
                    }
                    Util.unquote(remoteAbsolutePath);
                }
                throw new SftpException(4, glob_remote.toString());
            }
            String str2 = (String) glob_remote.elementAt(0);
            if (sftpProgressMonitor != null) {
                try {
                    sftpProgressMonitor.init(0, "-", str2, -1L);
                } catch (Exception e2) {
                    e = e2;
                    str = str2;
                    if (e instanceof SftpException) {
                        SftpException sftpException = (SftpException) e;
                        if (sftpException.f3798id == 4 && isRemoteDir(str)) {
                            throw new SftpException(4, AbstractC0062j.m160n(str, " is a directory"));
                        }
                        throw sftpException;
                    }
                    throw new SftpException(4, e.toString(), e);
                }
            }
            _put(inputStream, str2, sftpProgressMonitor, i);
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void get(String str, OutputStream outputStream) {
        get(str, outputStream, null, 0, 0L);
    }

    public void get(String str, OutputStream outputStream, SftpProgressMonitor sftpProgressMonitor) {
        get(str, outputStream, sftpProgressMonitor, 0, 0L);
    }

    public void get(String str, OutputStream outputStream, SftpProgressMonitor sftpProgressMonitor, int i, long j2) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String isUnique = isUnique(remoteAbsolutePath(str));
            if (sftpProgressMonitor != null) {
                sftpProgressMonitor.init(1, isUnique, "??", _stat(isUnique).getSize());
                if (i == 1) {
                    sftpProgressMonitor.count(j2);
                }
            }
            _get(isUnique, outputStream, sftpProgressMonitor, i, j2);
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public InputStream get(String str) {
        return get(str, (SftpProgressMonitor) null, 0L);
    }

    public InputStream get(String str, SftpProgressMonitor sftpProgressMonitor) {
        return get(str, sftpProgressMonitor, 0L);
    }

    public InputStream get(String str, int i) {
        return get(str, (SftpProgressMonitor) null, 0L);
    }

    public InputStream get(String str, SftpProgressMonitor sftpProgressMonitor, int i) {
        return get(str, sftpProgressMonitor, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        throwStatusError(r8.buf, r8.buf.getInt());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream get(String str, SftpProgressMonitor sftpProgressMonitor, long j2) {
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String isUnique = isUnique(remoteAbsolutePath(str));
            byte[] str2byte = Util.str2byte(isUnique, this.fEncoding);
            SftpATTRS _stat = _stat(str2byte);
            if (sftpProgressMonitor != null) {
                sftpProgressMonitor.init(1, isUnique, "??", _stat.getSize());
            }
            sendOPENR(str2byte);
            Header header = header(this.buf, new Header());
            int i = header.length;
            int i2 = header.type;
            fill(this.buf, i);
            if (i2 != 101 && i2 != 102) {
                throw new SftpException(4, "");
            }
            byte[] string = this.buf.getString();
            this.f3769rq.init();
            return new InputStream(j2, sftpProgressMonitor, string) { // from class: com.jcraft.jsch.ChannelSftp.2
                Header header;
                long offset;
                long request_offset;
                final /* synthetic */ byte[] val$handle;
                final /* synthetic */ SftpProgressMonitor val$monitor;
                final /* synthetic */ long val$skip;
                boolean closed = false;
                int rest_length = 0;
                byte[] _data = new byte[1];
                byte[] rest_byte = new byte[1024];
                int request_max = 1;

                {
                    this.val$skip = j2;
                    this.val$monitor = sftpProgressMonitor;
                    this.val$handle = string;
                    this.offset = j2;
                    this.header = ChannelSftp.this.new Header();
                    this.request_offset = this.offset;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    SftpProgressMonitor sftpProgressMonitor2 = this.val$monitor;
                    if (sftpProgressMonitor2 != null) {
                        sftpProgressMonitor2.end();
                    }
                    ChannelSftp.this.f3769rq.cancel(this.header, ChannelSftp.this.buf);
                    try {
                        ChannelSftp.this._sendCLOSE(this.val$handle, this.header);
                    } catch (Exception unused) {
                        throw new IOException("error");
                    }
                }

                @Override // java.io.InputStream
                public int read() {
                    if (this.closed || read(this._data, 0, 1) == -1) {
                        return -1;
                    }
                    return this._data[0] & 255;
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr) {
                    if (this.closed) {
                        return -1;
                    }
                    return read(bArr, 0, bArr.length);
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i3, int i4) {
                    int i5 = i4;
                    if (this.closed) {
                        return -1;
                    }
                    bArr.getClass();
                    if (i3 < 0 || i5 < 0 || i3 + i5 > bArr.length) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i6 = 0;
                    if (i5 == 0) {
                        return 0;
                    }
                    int i7 = this.rest_length;
                    if (i7 > 0) {
                        if (i7 <= i5) {
                            i5 = i7;
                        }
                        System.arraycopy(this.rest_byte, 0, bArr, i3, i5);
                        int i8 = this.rest_length;
                        if (i5 != i8) {
                            byte[] bArr2 = this.rest_byte;
                            System.arraycopy(bArr2, i5, bArr2, 0, i8 - i5);
                        }
                        SftpProgressMonitor sftpProgressMonitor2 = this.val$monitor;
                        if (sftpProgressMonitor2 != null && !sftpProgressMonitor2.count(i5)) {
                            close();
                            return -1;
                        }
                        this.rest_length -= i5;
                        return i5;
                    }
                    if (ChannelSftp.this.buf.buffer.length - 13 < i5) {
                        i5 = ChannelSftp.this.buf.buffer.length - 13;
                    }
                    if (ChannelSftp.this.server_version == 0 && i5 > 1024) {
                        i5 = 1024;
                    }
                    ChannelSftp.this.f3769rq.count();
                    int length = ChannelSftp.this.server_version != 0 ? ChannelSftp.this.buf.buffer.length - 13 : 1024;
                    while (ChannelSftp.this.f3769rq.count() < this.request_max) {
                        try {
                            ChannelSftp channelSftp = ChannelSftp.this;
                            channelSftp.sendREAD(this.val$handle, this.request_offset, length, channelSftp.f3769rq);
                            this.request_offset += length;
                        } catch (Exception unused) {
                            throw new IOException("error");
                        }
                    }
                    ChannelSftp channelSftp2 = ChannelSftp.this;
                    Header header2 = channelSftp2.header(channelSftp2.buf, this.header);
                    this.header = header2;
                    this.rest_length = header2.length;
                    int i9 = header2.type;
                    int i10 = header2.rid;
                    try {
                        RequestQueue.Request request = ChannelSftp.this.f3769rq.get(this.header.rid);
                        if (i9 != 101 && i9 != 103) {
                            throw new IOException("error");
                        }
                        if (i9 == 101) {
                            ChannelSftp channelSftp3 = ChannelSftp.this;
                            channelSftp3.fill(channelSftp3.buf, this.rest_length);
                            int i11 = ChannelSftp.this.buf.getInt();
                            this.rest_length = 0;
                            if (i11 == 1) {
                                close();
                                return -1;
                            }
                            throw new IOException("error");
                        }
                        ChannelSftp.this.buf.rewind();
                        ChannelSftp channelSftp4 = ChannelSftp.this;
                        channelSftp4.fill(channelSftp4.buf.buffer, 0, 4);
                        int i12 = ChannelSftp.this.buf.getInt();
                        int i13 = this.rest_length - 4;
                        this.rest_length = i13;
                        int i14 = i13 - i12;
                        long j3 = i12;
                        this.offset += j3;
                        if (i12 <= 0) {
                            return 0;
                        }
                        if (i12 <= i5) {
                            i5 = i12;
                        }
                        int read = ChannelSftp.this.io_in.read(bArr, i3, i5);
                        if (read < 0) {
                            return -1;
                        }
                        int i15 = i12 - read;
                        this.rest_length = i15;
                        if (i15 > 0) {
                            if (this.rest_byte.length < i15) {
                                this.rest_byte = new byte[i15];
                            }
                            while (i15 > 0) {
                                int read2 = ChannelSftp.this.io_in.read(this.rest_byte, i6, i15);
                                if (read2 <= 0) {
                                    break;
                                }
                                i6 += read2;
                                i15 -= read2;
                            }
                        }
                        if (i14 > 0) {
                            ChannelSftp.this.io_in.skip(i14);
                        }
                        if (j3 < request.length) {
                            ChannelSftp.this.f3769rq.cancel(this.header, ChannelSftp.this.buf);
                            try {
                                ChannelSftp channelSftp5 = ChannelSftp.this;
                                channelSftp5.sendREAD(this.val$handle, request.offset + j3, (int) (request.length - j3), channelSftp5.f3769rq);
                                this.request_offset = request.offset + request.length;
                            } catch (Exception unused2) {
                                throw new IOException("error");
                            }
                        }
                        if (this.request_max < ChannelSftp.this.f3769rq.size()) {
                            this.request_max++;
                        }
                        SftpProgressMonitor sftpProgressMonitor3 = this.val$monitor;
                        if (sftpProgressMonitor3 == null || sftpProgressMonitor3.count(read)) {
                            return read;
                        }
                        close();
                        return -1;
                    } catch (RequestQueue.OutOfOrderException e2) {
                        this.request_offset = e2.offset;
                        skip(this.header.length);
                        ChannelSftp.this.f3769rq.cancel(this.header, ChannelSftp.this.buf);
                        return 0;
                    } catch (SftpException e3) {
                        throw new IOException("error: " + e3.toString());
                    }
                }
            };
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }

    public OutputStream put(String str) {
        return put(str, (SftpProgressMonitor) null, 0);
    }

    public OutputStream put(String str, int i) {
        return put(str, (SftpProgressMonitor) null, i);
    }

    public OutputStream put(String str, SftpProgressMonitor sftpProgressMonitor, int i) {
        return put(str, sftpProgressMonitor, i, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        throwStatusError(r16.buf, r16.buf.getInt());
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: Exception -> 0x0044, TRY_ENTER, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x000a, B:5:0x001f, B:12:0x0039, B:14:0x0048, B:15:0x004f, B:20:0x006c, B:21:0x0071, B:24:0x0074, B:25:0x007f, B:30:0x008f, B:32:0x008d, B:33:0x004c, B:38:0x009a, B:39:0x00b0), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x000a, B:5:0x001f, B:12:0x0039, B:14:0x0048, B:15:0x004f, B:20:0x006c, B:21:0x0071, B:24:0x0074, B:25:0x007f, B:30:0x008f, B:32:0x008d, B:33:0x004c, B:38:0x009a, B:39:0x00b0), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c A[Catch: Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:3:0x000a, B:5:0x001f, B:12:0x0039, B:14:0x0048, B:15:0x004f, B:20:0x006c, B:21:0x0071, B:24:0x0074, B:25:0x007f, B:30:0x008f, B:32:0x008d, B:33:0x004c, B:38:0x009a, B:39:0x00b0), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OutputStream put(String str, final SftpProgressMonitor sftpProgressMonitor, int i, long j2) {
        long size;
        int i2;
        long j3;
        try {
            ((Channel.MyPipedInputStream) this.io_in).updateReadSide();
            String isUnique = isUnique(remoteAbsolutePath(str));
            if (!isRemoteDir(isUnique)) {
                byte[] str2byte = Util.str2byte(isUnique, this.fEncoding);
                if (i == 1 || i == 2) {
                    try {
                        size = _stat(str2byte).getSize();
                    } catch (Exception unused) {
                    }
                    long j4 = size;
                    if (sftpProgressMonitor != null) {
                        sftpProgressMonitor.init(0, "-", isUnique, -1L);
                    }
                    if (i != 0) {
                        sendOPENW(str2byte);
                    } else {
                        sendOPENA(str2byte);
                    }
                    Header header = header(this.buf, new Header());
                    int i3 = header.length;
                    i2 = header.type;
                    fill(this.buf, i3);
                    if (i2 != 101 && i2 != 102) {
                        throw new SftpException(4, "");
                    }
                    final byte[] string = this.buf.getString();
                    if (i != 1 && i != 2) {
                        j3 = j2;
                        final long[] jArr = {j3};
                        return new OutputStream() { // from class: com.jcraft.jsch.ChannelSftp.1
                            private Header header;
                            private boolean init = true;
                            private boolean isClosed = false;
                            private int[] ackid = new int[1];
                            private int startid = 0;
                            private int _ackid = 0;
                            private int ackcount = 0;
                            private int writecount = 0;
                            byte[] _data = new byte[1];

                            {
                                this.header = ChannelSftp.this.new Header();
                            }

                            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                            public void close() {
                                if (this.isClosed) {
                                    return;
                                }
                                flush();
                                SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                                if (sftpProgressMonitor2 != null) {
                                    sftpProgressMonitor2.end();
                                }
                                try {
                                    ChannelSftp.this._sendCLOSE(string, this.header);
                                    this.isClosed = true;
                                } catch (IOException e2) {
                                    throw e2;
                                } catch (Exception e3) {
                                    throw new IOException(e3.toString());
                                }
                            }

                            @Override // java.io.OutputStream, java.io.Flushable
                            public void flush() {
                                if (this.isClosed) {
                                    throw new IOException("stream already closed");
                                }
                                if (this.init) {
                                    return;
                                }
                                while (this.writecount > this.ackcount && ChannelSftp.this.checkStatus(null, this.header)) {
                                    try {
                                        this.ackcount++;
                                    } catch (SftpException e2) {
                                        throw new IOException(e2.toString());
                                    }
                                }
                            }

                            @Override // java.io.OutputStream
                            public void write(byte[] bArr) {
                                write(bArr, 0, bArr.length);
                            }

                            @Override // java.io.OutputStream
                            public void write(byte[] bArr, int i4, int i5) {
                                if (this.init) {
                                    this.startid = ChannelSftp.this.seq;
                                    this._ackid = ChannelSftp.this.seq;
                                    this.init = false;
                                }
                                if (this.isClosed) {
                                    throw new IOException("stream already closed");
                                }
                                int i6 = i5;
                                while (i6 > 0) {
                                    try {
                                        int sendWRITE = ChannelSftp.this.sendWRITE(string, jArr[0], bArr, i4, i6);
                                        this.writecount++;
                                        long[] jArr2 = jArr;
                                        jArr2[0] = jArr2[0] + sendWRITE;
                                        i4 += sendWRITE;
                                        i6 -= sendWRITE;
                                        if (ChannelSftp.this.seq - 1 != this.startid && ChannelSftp.this.io_in.available() < 1024) {
                                        }
                                        while (ChannelSftp.this.io_in.available() > 0 && ChannelSftp.this.checkStatus(this.ackid, this.header)) {
                                            int i7 = this.ackid[0];
                                            this._ackid = i7;
                                            if (this.startid > i7 || i7 > ChannelSftp.this.seq - 1) {
                                                throw new SftpException(4, "");
                                            }
                                            this.ackcount++;
                                        }
                                    } catch (IOException e2) {
                                        throw e2;
                                    } catch (Exception e3) {
                                        throw new IOException(e3.toString());
                                    }
                                }
                                SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                                if (sftpProgressMonitor2 != null && !sftpProgressMonitor2.count(i5)) {
                                    close();
                                    throw new IOException("canceled");
                                }
                            }

                            @Override // java.io.OutputStream
                            public void write(int i4) {
                                byte[] bArr = this._data;
                                bArr[0] = (byte) i4;
                                write(bArr, 0, 1);
                            }
                        };
                    }
                    j3 = j2 + j4;
                    final long[] jArr2 = {j3};
                    return new OutputStream() { // from class: com.jcraft.jsch.ChannelSftp.1
                        private Header header;
                        private boolean init = true;
                        private boolean isClosed = false;
                        private int[] ackid = new int[1];
                        private int startid = 0;
                        private int _ackid = 0;
                        private int ackcount = 0;
                        private int writecount = 0;
                        byte[] _data = new byte[1];

                        {
                            this.header = ChannelSftp.this.new Header();
                        }

                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            if (this.isClosed) {
                                return;
                            }
                            flush();
                            SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                            if (sftpProgressMonitor2 != null) {
                                sftpProgressMonitor2.end();
                            }
                            try {
                                ChannelSftp.this._sendCLOSE(string, this.header);
                                this.isClosed = true;
                            } catch (IOException e2) {
                                throw e2;
                            } catch (Exception e3) {
                                throw new IOException(e3.toString());
                            }
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public void flush() {
                            if (this.isClosed) {
                                throw new IOException("stream already closed");
                            }
                            if (this.init) {
                                return;
                            }
                            while (this.writecount > this.ackcount && ChannelSftp.this.checkStatus(null, this.header)) {
                                try {
                                    this.ackcount++;
                                } catch (SftpException e2) {
                                    throw new IOException(e2.toString());
                                }
                            }
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] bArr) {
                            write(bArr, 0, bArr.length);
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] bArr, int i4, int i5) {
                            if (this.init) {
                                this.startid = ChannelSftp.this.seq;
                                this._ackid = ChannelSftp.this.seq;
                                this.init = false;
                            }
                            if (this.isClosed) {
                                throw new IOException("stream already closed");
                            }
                            int i6 = i5;
                            while (i6 > 0) {
                                try {
                                    int sendWRITE = ChannelSftp.this.sendWRITE(string, jArr2[0], bArr, i4, i6);
                                    this.writecount++;
                                    long[] jArr22 = jArr2;
                                    jArr22[0] = jArr22[0] + sendWRITE;
                                    i4 += sendWRITE;
                                    i6 -= sendWRITE;
                                    if (ChannelSftp.this.seq - 1 != this.startid && ChannelSftp.this.io_in.available() < 1024) {
                                    }
                                    while (ChannelSftp.this.io_in.available() > 0 && ChannelSftp.this.checkStatus(this.ackid, this.header)) {
                                        int i7 = this.ackid[0];
                                        this._ackid = i7;
                                        if (this.startid > i7 || i7 > ChannelSftp.this.seq - 1) {
                                            throw new SftpException(4, "");
                                        }
                                        this.ackcount++;
                                    }
                                } catch (IOException e2) {
                                    throw e2;
                                } catch (Exception e3) {
                                    throw new IOException(e3.toString());
                                }
                            }
                            SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                            if (sftpProgressMonitor2 != null && !sftpProgressMonitor2.count(i5)) {
                                close();
                                throw new IOException("canceled");
                            }
                        }

                        @Override // java.io.OutputStream
                        public void write(int i4) {
                            byte[] bArr = this._data;
                            bArr[0] = (byte) i4;
                            write(bArr, 0, 1);
                        }
                    };
                }
                size = 0;
                long j42 = size;
                if (sftpProgressMonitor != null) {
                }
                if (i != 0) {
                }
                Header header2 = header(this.buf, new Header());
                int i32 = header2.length;
                i2 = header2.type;
                fill(this.buf, i32);
                if (i2 != 101) {
                    throw new SftpException(4, "");
                }
                final byte[] string2 = this.buf.getString();
                if (i != 1) {
                    j3 = j2;
                    final long[] jArr22 = {j3};
                    return new OutputStream() { // from class: com.jcraft.jsch.ChannelSftp.1
                        private Header header;
                        private boolean init = true;
                        private boolean isClosed = false;
                        private int[] ackid = new int[1];
                        private int startid = 0;
                        private int _ackid = 0;
                        private int ackcount = 0;
                        private int writecount = 0;
                        byte[] _data = new byte[1];

                        {
                            this.header = ChannelSftp.this.new Header();
                        }

                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            if (this.isClosed) {
                                return;
                            }
                            flush();
                            SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                            if (sftpProgressMonitor2 != null) {
                                sftpProgressMonitor2.end();
                            }
                            try {
                                ChannelSftp.this._sendCLOSE(string2, this.header);
                                this.isClosed = true;
                            } catch (IOException e2) {
                                throw e2;
                            } catch (Exception e3) {
                                throw new IOException(e3.toString());
                            }
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public void flush() {
                            if (this.isClosed) {
                                throw new IOException("stream already closed");
                            }
                            if (this.init) {
                                return;
                            }
                            while (this.writecount > this.ackcount && ChannelSftp.this.checkStatus(null, this.header)) {
                                try {
                                    this.ackcount++;
                                } catch (SftpException e2) {
                                    throw new IOException(e2.toString());
                                }
                            }
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] bArr) {
                            write(bArr, 0, bArr.length);
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] bArr, int i4, int i5) {
                            if (this.init) {
                                this.startid = ChannelSftp.this.seq;
                                this._ackid = ChannelSftp.this.seq;
                                this.init = false;
                            }
                            if (this.isClosed) {
                                throw new IOException("stream already closed");
                            }
                            int i6 = i5;
                            while (i6 > 0) {
                                try {
                                    int sendWRITE = ChannelSftp.this.sendWRITE(string2, jArr22[0], bArr, i4, i6);
                                    this.writecount++;
                                    long[] jArr222 = jArr22;
                                    jArr222[0] = jArr222[0] + sendWRITE;
                                    i4 += sendWRITE;
                                    i6 -= sendWRITE;
                                    if (ChannelSftp.this.seq - 1 != this.startid && ChannelSftp.this.io_in.available() < 1024) {
                                    }
                                    while (ChannelSftp.this.io_in.available() > 0 && ChannelSftp.this.checkStatus(this.ackid, this.header)) {
                                        int i7 = this.ackid[0];
                                        this._ackid = i7;
                                        if (this.startid > i7 || i7 > ChannelSftp.this.seq - 1) {
                                            throw new SftpException(4, "");
                                        }
                                        this.ackcount++;
                                    }
                                } catch (IOException e2) {
                                    throw e2;
                                } catch (Exception e3) {
                                    throw new IOException(e3.toString());
                                }
                            }
                            SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                            if (sftpProgressMonitor2 != null && !sftpProgressMonitor2.count(i5)) {
                                close();
                                throw new IOException("canceled");
                            }
                        }

                        @Override // java.io.OutputStream
                        public void write(int i4) {
                            byte[] bArr = this._data;
                            bArr[0] = (byte) i4;
                            write(bArr, 0, 1);
                        }
                    };
                }
                j3 = j2 + j42;
                final long[] jArr222 = {j3};
                return new OutputStream() { // from class: com.jcraft.jsch.ChannelSftp.1
                    private Header header;
                    private boolean init = true;
                    private boolean isClosed = false;
                    private int[] ackid = new int[1];
                    private int startid = 0;
                    private int _ackid = 0;
                    private int ackcount = 0;
                    private int writecount = 0;
                    byte[] _data = new byte[1];

                    {
                        this.header = ChannelSftp.this.new Header();
                    }

                    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        if (this.isClosed) {
                            return;
                        }
                        flush();
                        SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                        if (sftpProgressMonitor2 != null) {
                            sftpProgressMonitor2.end();
                        }
                        try {
                            ChannelSftp.this._sendCLOSE(string2, this.header);
                            this.isClosed = true;
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Exception e3) {
                            throw new IOException(e3.toString());
                        }
                    }

                    @Override // java.io.OutputStream, java.io.Flushable
                    public void flush() {
                        if (this.isClosed) {
                            throw new IOException("stream already closed");
                        }
                        if (this.init) {
                            return;
                        }
                        while (this.writecount > this.ackcount && ChannelSftp.this.checkStatus(null, this.header)) {
                            try {
                                this.ackcount++;
                            } catch (SftpException e2) {
                                throw new IOException(e2.toString());
                            }
                        }
                    }

                    @Override // java.io.OutputStream
                    public void write(byte[] bArr) {
                        write(bArr, 0, bArr.length);
                    }

                    @Override // java.io.OutputStream
                    public void write(byte[] bArr, int i4, int i5) {
                        if (this.init) {
                            this.startid = ChannelSftp.this.seq;
                            this._ackid = ChannelSftp.this.seq;
                            this.init = false;
                        }
                        if (this.isClosed) {
                            throw new IOException("stream already closed");
                        }
                        int i6 = i5;
                        while (i6 > 0) {
                            try {
                                int sendWRITE = ChannelSftp.this.sendWRITE(string2, jArr222[0], bArr, i4, i6);
                                this.writecount++;
                                long[] jArr2222 = jArr222;
                                jArr2222[0] = jArr2222[0] + sendWRITE;
                                i4 += sendWRITE;
                                i6 -= sendWRITE;
                                if (ChannelSftp.this.seq - 1 != this.startid && ChannelSftp.this.io_in.available() < 1024) {
                                }
                                while (ChannelSftp.this.io_in.available() > 0 && ChannelSftp.this.checkStatus(this.ackid, this.header)) {
                                    int i7 = this.ackid[0];
                                    this._ackid = i7;
                                    if (this.startid > i7 || i7 > ChannelSftp.this.seq - 1) {
                                        throw new SftpException(4, "");
                                    }
                                    this.ackcount++;
                                }
                            } catch (IOException e2) {
                                throw e2;
                            } catch (Exception e3) {
                                throw new IOException(e3.toString());
                            }
                        }
                        SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                        if (sftpProgressMonitor2 != null && !sftpProgressMonitor2.count(i5)) {
                            close();
                            throw new IOException("canceled");
                        }
                    }

                    @Override // java.io.OutputStream
                    public void write(int i4) {
                        byte[] bArr = this._data;
                        bArr[0] = (byte) i4;
                        write(bArr, 0, 1);
                    }
                };
            }
            throw new SftpException(4, isUnique + " is a directory");
        } catch (Exception e2) {
            if (!(e2 instanceof SftpException)) {
                throw new SftpException(4, "", e2);
            }
            throw ((SftpException) e2);
        }
    }
}
