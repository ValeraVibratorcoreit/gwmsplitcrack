package p068f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jcraft.jsch.SftpATTRS;
import java.util.Arrays;

/* renamed from: f0.a0 */
/* loaded from: classes.dex */
public final class C0797a0 {

    /* renamed from: a */
    public int f4022a;

    /* renamed from: b */
    public int f4023b;

    /* renamed from: c */
    public boolean f4024c;

    /* renamed from: d */
    public boolean f4025d;

    /* renamed from: e */
    public boolean f4026e;

    /* renamed from: f */
    public int[] f4027f;

    /* renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f4028g;

    public C0797a0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f4028g = staggeredGridLayoutManager;
        m2285a();
    }

    /* renamed from: a */
    public final void m2285a() {
        this.f4022a = -1;
        this.f4023b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f4024c = false;
        this.f4025d = false;
        this.f4026e = false;
        int[] iArr = this.f4027f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
