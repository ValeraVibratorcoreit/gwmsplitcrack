package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import p010D1.AbstractC0091o;
import p010D1.C0077a;
import p010D1.C0080d;
import p010D1.InterfaceC0079c;

/* loaded from: classes.dex */
final class JsonUtf8Reader extends JsonReader {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final C0077a buffer;
    private int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private final InterfaceC0079c source;
    private static final C0080d SINGLE_QUOTE_OR_SLASH = C0080d.m238a("'\\");
    private static final C0080d DOUBLE_QUOTE_OR_SLASH = C0080d.m238a("\"\\");
    private static final C0080d UNQUOTED_STRING_TERMINALS = C0080d.m238a("{}[]:, \n\t\r\f/\\;#=");
    private static final C0080d LINEFEED_OR_CARRIAGE_RETURN = C0080d.m238a("\n\r");
    private static final C0080d CLOSING_BLOCK_COMMENT = C0080d.m238a("*/");

    public JsonUtf8Reader(InterfaceC0079c interfaceC0079c) {
        if (interfaceC0079c == null) {
            throw new NullPointerException("source == null");
        }
        this.source = interfaceC0079c;
        this.buffer = interfaceC0079c.mo217a();
        pushScope(6);
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int doPeek() {
        int[] iArr = this.scopes;
        int i = this.stackSize;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int nextNonWhitespace = nextNonWhitespace(true);
            this.buffer.m228l();
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace != 59) {
                    if (nextNonWhitespace != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int nextNonWhitespace2 = nextNonWhitespace(true);
                    this.buffer.m228l();
                    if (nextNonWhitespace2 != 44) {
                        if (nextNonWhitespace2 != 59) {
                            if (nextNonWhitespace2 != 125) {
                                throw syntaxError("Unterminated object");
                            }
                            this.peeked = 2;
                            return 2;
                        }
                        checkLenient();
                    }
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.buffer.m228l();
                    this.peeked = PEEKED_DOUBLE_QUOTED_NAME;
                    return PEEKED_DOUBLE_QUOTED_NAME;
                }
                if (nextNonWhitespace3 == 39) {
                    this.buffer.m228l();
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 != 125) {
                    checkLenient();
                    if (!isLiteral((char) nextNonWhitespace3)) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = PEEKED_UNQUOTED_NAME;
                    return PEEKED_UNQUOTED_NAME;
                }
                if (i2 == 5) {
                    throw syntaxError("Expected name");
                }
                this.buffer.m228l();
                this.peeked = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                this.buffer.m228l();
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.source.mo219c(1L) && this.buffer.m220d(0L) == 62) {
                        this.buffer.m228l();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = PEEKED_EOF;
                    return PEEKED_EOF;
                }
                checkLenient();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.buffer.m228l();
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.buffer.m228l();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.buffer.m228l();
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.buffer.m228l();
                    this.peeked = 1;
                    return 1;
                }
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer.m220d(0L))) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i2 == 1) {
                this.buffer.m228l();
                this.peeked = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.peeked = 7;
        return 7;
    }

    private int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i) {
        if (i == 9 || i == 10 || i == 12 || i == PEEKED_DOUBLE_QUOTED_NAME || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.buffer.m232p(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.source.mo219c(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        checkLenient();
        r3 = r6.buffer.m220d(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.buffer.m228l();
        r6.buffer.m228l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (skipToEndOfBlockComment() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.buffer.m228l();
        r6.buffer.m228l();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int nextNonWhitespace(boolean z2) {
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.source.mo219c(i2)) {
                    if (z2) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                byte m220d = this.buffer.m220d(i);
                if (m220d != 10 && m220d != 32 && m220d != PEEKED_DOUBLE_QUOTED_NAME && m220d != 9) {
                    break;
                }
                i = i2;
            }
        }
    }

    private String nextQuotedValue(C0080d c0080d) {
        StringBuilder sb = null;
        while (true) {
            long mo224h = this.source.mo224h(c0080d);
            if (mo224h == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.m220d(mo224h) != 92) {
                if (sb == null) {
                    C0077a c0077a = this.buffer;
                    c0077a.getClass();
                    String m230n = c0077a.m230n(mo224h, AbstractC0091o.f271a);
                    this.buffer.m228l();
                    return m230n;
                }
                C0077a c0077a2 = this.buffer;
                c0077a2.getClass();
                sb.append(c0077a2.m230n(mo224h, AbstractC0091o.f271a));
                this.buffer.m228l();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            C0077a c0077a3 = this.buffer;
            c0077a3.getClass();
            sb.append(c0077a3.m230n(mo224h, AbstractC0091o.f271a));
            this.buffer.m228l();
            sb.append(readEscapeCharacter());
        }
    }

    private String nextUnquotedValue() {
        long mo224h = this.source.mo224h(UNQUOTED_STRING_TERMINALS);
        if (mo224h != -1) {
            C0077a c0077a = this.buffer;
            c0077a.getClass();
            return c0077a.m230n(mo224h, AbstractC0091o.f271a);
        }
        C0077a c0077a2 = this.buffer;
        c0077a2.getClass();
        try {
            return c0077a2.m230n(c0077a2.f240b, AbstractC0091o.f271a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i;
        byte m220d = this.buffer.m220d(0L);
        if (m220d == 116 || m220d == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (m220d == 102 || m220d == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (m220d != 110 && m220d != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.source.mo219c(i3)) {
                return 0;
            }
            byte m220d2 = this.buffer.m220d(i2);
            if (m220d2 != str.charAt(i2) && m220d2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.source.mo219c(length + 1) && isLiteral(this.buffer.m220d(length))) {
            return 0;
        }
        this.buffer.m232p(length);
        this.peeked = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (isLiteral(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        r16.peekedLong = r8;
        r16.buffer.m232p(r5);
        r16.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r16.peekedNumberLength = r5;
        r16.peeked = com.airbnb.lottie.parser.moshi.JsonUtf8Reader.PEEKED_NUMBER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        return com.airbnb.lottie.parser.moshi.JsonUtf8Reader.PEEKED_NUMBER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() {
        char c2;
        boolean z2 = true;
        long j2 = 0;
        int i = 0;
        char c3 = 0;
        boolean z3 = false;
        boolean z4 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.source.mo219c(i2)) {
                break;
            }
            byte m220d = this.buffer.m220d(i);
            if (m220d != 43) {
                if (m220d == 69 || m220d == 101) {
                    if (c3 != 2 && c3 != 4) {
                        return 0;
                    }
                    c3 = 5;
                } else if (m220d == 45) {
                    c2 = 6;
                    if (c3 == 0) {
                        c3 = 1;
                        z3 = true;
                    } else if (c3 != 5) {
                        return 0;
                    }
                } else if (m220d != 46) {
                    if (m220d < 48 || m220d > 57) {
                        break;
                    }
                    if (c3 == z2 || c3 == 0) {
                        j2 = -(m220d - 48);
                        c3 = 2;
                    } else if (c3 == 2) {
                        if (j2 == 0) {
                            return 0;
                        }
                        long j3 = (10 * j2) - (m220d - 48);
                        z4 &= j2 > MIN_INCOMPLETE_INTEGER || (j2 == MIN_INCOMPLETE_INTEGER && j3 < j2);
                        j2 = j3;
                    } else if (c3 == 3) {
                        c3 = 4;
                    } else if (c3 == 5 || c3 == 6) {
                        c3 = 7;
                    }
                } else {
                    if (c3 != 2) {
                        return 0;
                    }
                    c3 = 3;
                }
                i = i2;
                z2 = true;
            } else {
                c2 = 6;
                if (c3 != 5) {
                    return 0;
                }
            }
            c3 = c2;
            i = i2;
            z2 = true;
        }
    }

    private char readEscapeCharacter() {
        int i;
        if (!this.source.mo219c(1L)) {
            throw syntaxError("Unterminated escape sequence");
        }
        byte m228l = this.buffer.m228l();
        if (m228l == 10 || m228l == 34 || m228l == 39 || m228l == 47 || m228l == 92) {
            return (char) m228l;
        }
        if (m228l == 98) {
            return '\b';
        }
        if (m228l == 102) {
            return '\f';
        }
        if (m228l == 110) {
            return '\n';
        }
        if (m228l == 114) {
            return '\r';
        }
        if (m228l == 116) {
            return '\t';
        }
        if (m228l != 117) {
            if (this.lenient) {
                return (char) m228l;
            }
            throw syntaxError("Invalid escape sequence: \\" + ((char) m228l));
        }
        if (!this.source.mo219c(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c2 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte m220d = this.buffer.m220d(i2);
            char c3 = (char) (c2 << 4);
            if (m220d >= 48 && m220d <= 57) {
                i = m220d - 48;
            } else if (m220d >= 97 && m220d <= 102) {
                i = m220d - 87;
            } else {
                if (m220d < 65 || m220d > 70) {
                    C0077a c0077a = this.buffer;
                    c0077a.getClass();
                    throw syntaxError("\\u".concat(c0077a.m230n(4L, AbstractC0091o.f271a)));
                }
                i = m220d - 55;
            }
            c2 = (char) (i + c3);
        }
        this.buffer.m232p(4L);
        return c2;
    }

    private void skipQuotedValue(C0080d c0080d) {
        while (true) {
            long mo224h = this.source.mo224h(c0080d);
            if (mo224h == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.m220d(mo224h) != 92) {
                this.buffer.m232p(mo224h + 1);
                return;
            } else {
                this.buffer.m232p(mo224h + 1);
                readEscapeCharacter();
            }
        }
    }

    private boolean skipToEndOfBlockComment() {
        long mo223g = this.source.mo223g(CLOSING_BLOCK_COMMENT);
        boolean z2 = mo223g != -1;
        C0077a c0077a = this.buffer;
        c0077a.m232p(z2 ? mo223g + r1.mo244g() : c0077a.f240b);
        return z2;
    }

    private void skipToEndOfLine() {
        long mo224h = this.source.mo224h(LINEFEED_OR_CARRIAGE_RETURN);
        C0077a c0077a = this.buffer;
        c0077a.m232p(mo224h != -1 ? mo224h + 1 : c0077a.f240b);
    }

    private void skipUnquotedValue() {
        long mo224h = this.source.mo224h(UNQUOTED_STRING_TERMINALS);
        C0077a c0077a = this.buffer;
        if (mo224h == -1) {
            mo224h = c0077a.f240b;
        }
        c0077a.m232p(mo224h);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            pushScope(3);
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        C0077a c0077a = this.buffer;
        c0077a.getClass();
        try {
            c0077a.m232p(c0077a.f240b);
            this.source.close();
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i2 = this.stackSize;
        this.stackSize = i2 - 1;
        int[] iArr = this.pathIndices;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.peeked = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
        }
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        this.stackSize = i3;
        this.pathNames[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.peeked = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == PEEKED_EOF) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == PEEKED_NUMBER) {
            C0077a c0077a = this.buffer;
            long j2 = this.peekedNumberLength;
            c0077a.getClass();
            this.peekedString = c0077a.m230n(j2, AbstractC0091o.f271a);
        } else if (i == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            long j2 = this.peekedLong;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (i == PEEKED_NUMBER) {
            C0077a c0077a = this.buffer;
            long j3 = this.peekedNumberLength;
            c0077a.getClass();
            this.peekedString = c0077a.m230n(j3, AbstractC0091o.f271a);
        } else if (i == 9 || i == 8) {
            String nextQuotedValue = i == 9 ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i6 = this.stackSize - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_UNQUOTED_NAME) {
            str = nextUnquotedValue();
        } else if (i == PEEKED_DOUBLE_QUOTED_NAME) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 12) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else {
            if (i != PEEKED_BUFFERED_NAME) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            str = this.peekedString;
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() {
        String m230n;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 10) {
            m230n = nextUnquotedValue();
        } else if (i == 9) {
            m230n = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            m230n = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 11) {
            m230n = this.peekedString;
            this.peekedString = null;
        } else if (i == 16) {
            m230n = Long.toString(this.peekedLong);
        } else {
            if (i != PEEKED_NUMBER) {
                throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
            }
            C0077a c0077a = this.buffer;
            long j2 = this.peekedNumberLength;
            c0077a.getClass();
            m230n = c0077a.m230n(j2, AbstractC0091o.f271a);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return m230n;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case PEEKED_DOUBLE_QUOTED_NAME /* 13 */:
            case PEEKED_UNQUOTED_NAME /* 14 */:
            case PEEKED_BUFFERED_NAME /* 15 */:
                return JsonReader.Token.NAME;
            case 16:
            case PEEKED_NUMBER /* 17 */:
                return JsonReader.Token.NUMBER;
            case PEEKED_EOF /* 18 */:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.Options options) {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i < 12 || i > PEEKED_BUFFERED_NAME) {
            return -1;
        }
        if (i == PEEKED_BUFFERED_NAME) {
            return findName(this.peekedString, options);
        }
        int mo222f = this.source.mo222f(options.doubleQuoteSuffix);
        if (mo222f != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[mo222f];
            return mo222f;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, options);
        if (findName == -1) {
            this.peeked = PEEKED_BUFFERED_NAME;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_UNQUOTED_NAME) {
            skipUnquotedValue();
        } else if (i == PEEKED_DOUBLE_QUOTED_NAME) {
            skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 12) {
            skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i != PEEKED_BUFFERED_NAME) {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i = 0;
        do {
            int i2 = this.peeked;
            if (i2 == 0) {
                i2 = doPeek();
            }
            if (i2 == 3) {
                pushScope(1);
            } else if (i2 == 1) {
                pushScope(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (i2 == PEEKED_UNQUOTED_NAME || i2 == 10) {
                    skipUnquotedValue();
                } else if (i2 == 9 || i2 == PEEKED_DOUBLE_QUOTED_NAME) {
                    skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                } else if (i2 == 8 || i2 == 12) {
                    skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                } else if (i2 == PEEKED_NUMBER) {
                    this.buffer.m232p(this.peekedNumberLength);
                } else if (i2 == PEEKED_EOF) {
                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.peeked = 0;
            }
            i++;
            this.peeked = 0;
        } while (i != 0);
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.pathNames[i3 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.source + ")";
    }
}
