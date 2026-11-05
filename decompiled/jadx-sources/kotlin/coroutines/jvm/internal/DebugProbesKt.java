package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.jetbrains.annotations.NotNull;
import p001A0.C0006C;
import p001A0.RunnableC0011e;

/* JADX WARN: Classes with same name are omitted:
  GWM-split.apk:DebugProbesKt.bin
 */
/* compiled from: DebugProbes.kt */
@Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010��\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b��\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H��\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��¨\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlinx-coroutines-integration-testing_debugAgentTest"})
/* loaded from: GWM-split.apk:res/8o.apk:DebugProbesKt.bin */
public final class DebugProbesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Continuation<T> probeCoroutineCreated(@NotNull Continuation<? super T> continuation) {
        C0006C.m11a(continuation);
        return (Continuation<T>) DebugProbesImpl.INSTANCE.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void probeCoroutineResumed(@NotNull Continuation<?> continuation) {
        C0006C.m11a(continuation);
        DebugProbesImpl.INSTANCE.m20f(continuation);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A0.e, int] */
    public static final void probeCoroutineSuspended(@NotNull Continuation<?> continuation) {
        C0006C.m11a(continuation);
        ?? runnableC0011e = new RunnableC0011e(continuation, runnableC0011e);
    }
}
