package com.jcraft.jsch;

/* loaded from: classes.dex */
public interface HostKeyRepository {
    public static final int CHANGED = 2;
    public static final int NOT_INCLUDED = 1;

    /* renamed from: OK */
    public static final int f3784OK = 0;

    void add(HostKey hostKey, UserInfo userInfo);

    int check(String str, byte[] bArr);

    HostKey[] getHostKey();

    HostKey[] getHostKey(String str, String str2);

    String getKnownHostsRepositoryID();

    void remove(String str, String str2);

    void remove(String str, String str2, byte[] bArr);
}
