package com.altaysoft.t500_split.network;

import p064e.InterfaceC0766a;
import p066e1.InterfaceC0769b;

@InterfaceC0766a
/* loaded from: classes.dex */
public class ApiResponse {

    @InterfaceC0769b("error")
    public C0651a error = new C0651a();

    @InterfaceC0769b("version")
    public C0653c version = new C0653c();

    @InterfaceC0769b("actual")
    public boolean actual = false;

    @InterfaceC0769b("update")
    public long updateSize = 0;

    @InterfaceC0769b("success")
    public String successMessage = "";

    @InterfaceC0769b("user")
    public C0652b user = new C0652b();

    /* renamed from: com.altaysoft.t500_split.network.ApiResponse$a */
    public static class C0651a {

        /* renamed from: a */
        @InterfaceC0769b("message")
        public String f3070a = "";
    }

    /* renamed from: com.altaysoft.t500_split.network.ApiResponse$b */
    public static class C0652b {

        /* renamed from: a */
        @InterfaceC0769b("licence")
        public int f3071a = 0;

        /* renamed from: b */
        @InterfaceC0769b("demoRemain")
        public int f3072b = 0;

        /* renamed from: c */
        @InterfaceC0769b("partner")
        public int f3073c = 0;

        /* renamed from: d */
        @InterfaceC0769b("enabled")
        public int f3074d = 1;
    }

    /* renamed from: com.altaysoft.t500_split.network.ApiResponse$c */
    public static class C0653c {

        /* renamed from: a */
        @InterfaceC0769b("latest")
        public int f3075a = 0;

        /* renamed from: b */
        @InterfaceC0769b("whatsnew")
        public String f3076b = "";
    }
}
