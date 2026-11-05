package com.jcraft.jsch;

import com.sun.jna.Function;

/* loaded from: classes.dex */
public class DHEC256 extends DHECN {
    public DHEC256() {
        this.sha_name = "sha-256";
        this.key_size = Function.MAX_NARGS;
    }
}
