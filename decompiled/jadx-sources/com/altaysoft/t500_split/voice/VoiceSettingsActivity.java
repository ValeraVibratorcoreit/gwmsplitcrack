package com.altaysoft.t500_split.voice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import java.io.File;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0015i;
import p001A0.C0013g;
import p001A0.C0021o;
import p001A0.C0025s;
import p001A0.C0031y;
import p001A0.EnumC0007a;
import p001A0.RunnableC0024r;
import p016H.C0117i;
import p070g.AbstractActivityC0870i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.EnumC1314f0;
import p121y0.AbstractC1680h;
import p123z.AbstractC1695c;

/* loaded from: classes.dex */
public class VoiceSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: M */
    public static final /* synthetic */ int f3324M = 0;

    /* renamed from: E */
    public Switch f3325E;

    /* renamed from: F */
    public TextView f3326F;

    /* renamed from: G */
    public TextView f3327G;

    /* renamed from: H */
    public LinearLayout f3328H;

    /* renamed from: I */
    public ScrollView f3329I;

    /* renamed from: J */
    public final Handler f3330J = new Handler(Looper.getMainLooper());

    /* renamed from: K */
    public boolean f3331K;

    /* renamed from: L */
    public boolean f3332L;

    /* renamed from: t */
    public static String m2010t(VoiceSettingsActivity voiceSettingsActivity) {
        EnumMap enumMap = AbstractC0015i.f43a;
        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(voiceSettingsActivity);
        String m23c = AbstractC0015i.m23c(m3026s);
        String m4860V = AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s));
        StringBuilder sb = new StringBuilder();
        sb.append(voiceSettingsActivity.getString(R.string.voice_help_cmd_flags));
        sb.append(voiceSettingsActivity.getString(R.string.voice_help_header, m23c, "https://alphacephei.com/vosk/models", m4860V));
        for (String str : AbstractC0015i.m25e(AbstractC1256E0.m3026s(voiceSettingsActivity)).f40a) {
            sb.append("    «");
            sb.append(str);
            sb.append("»\n");
        }
        sb.append(voiceSettingsActivity.getString(R.string.voice_help_commands_hdr, m23c));
        for (C0013g c0013g : AbstractC0015i.m25e(AbstractC1256E0.m3026s(voiceSettingsActivity)).f41b) {
            EnumC0007a enumC0007a = c0013g.f35a;
            int i = enumC0007a.f20a;
            if (i < 1 || i > 7 || !enumC0007a.f21b.startsWith("preset")) {
                i = 0;
            }
            if (i <= 0) {
                sb.append("• ");
                sb.append(c0013g.f37c);
                sb.append('\n');
                for (String str2 : c0013g.f38d) {
                    sb.append("    «");
                    sb.append(str2);
                    sb.append("»\n");
                }
            } else if (c0013g.f35a == EnumC0007a.PRESET_1) {
                int ordinal = m3026s.ordinal();
                sb.append(voiceSettingsActivity.getString(ordinal != 1 ? ordinal != 2 ? R.string.voice_help_presets_ru : R.string.voice_help_presets_ar : R.string.voice_help_presets_en));
            }
        }
        return sb.toString();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_voice_settings);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.voice_title);
        this.f3325E = (Switch) findViewById(R.id.swVoiceEnable);
        this.f3326F = (TextView) findViewById(R.id.tvVoiceStatus);
        this.f3327G = (TextView) findViewById(R.id.tvVoiceHelp);
        this.f3329I = (ScrollView) findViewById(R.id.voiceHelpScroll);
        this.f3328H = (LinearLayout) findViewById(R.id.voiceCmdList);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(R.id.btnVoiceInstall);
        AppCompatButton appCompatButton2 = (AppCompatButton) findViewById(R.id.btnVoiceDelete);
        AppCompatButton appCompatButton3 = (AppCompatButton) findViewById(R.id.btnVoiceBack);
        final int i = 0;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: A0.z

            /* renamed from: g */
            public final /* synthetic */ VoiceSettingsActivity f109g;

            {
                this.f109g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSettingsActivity voiceSettingsActivity = this.f109g;
                int i2 = 0;
                int i3 = 1;
                switch (i) {
                    case 0:
                        int i4 = VoiceSettingsActivity.f3324M;
                        voiceSettingsActivity.getClass();
                        if (AbstractC1695c.m4958a(voiceSettingsActivity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            voiceSettingsActivity.f3331K = true;
                            AbstractC1695c.m4965h(voiceSettingsActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 2102);
                            break;
                        } else {
                            voiceSettingsActivity.f3331K = false;
                            voiceSettingsActivity.f3326F.setText(R.string.voice_status_searching);
                            new Thread(new RunnableC0024r(i2, voiceSettingsActivity), "voice-scan").start();
                            break;
                        }
                    case 1:
                        int i5 = VoiceSettingsActivity.f3324M;
                        VoiceSettingsActivity voiceSettingsActivity2 = this.f109g;
                        voiceSettingsActivity2.getClass();
                        EnumMap enumMap = AbstractC0015i.f43a;
                        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(voiceSettingsActivity2);
                        File m4873n = AbstractC1680h.m4873n(voiceSettingsActivity2, m3026s);
                        if (m4873n == null) {
                            File externalFilesDir = voiceSettingsActivity2.getExternalFilesDir(null);
                            if (externalFilesDir == null) {
                                externalFilesDir = voiceSettingsActivity2.getFilesDir();
                            }
                            m4873n = new File(externalFilesDir, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s)));
                        }
                        File file = m4873n;
                        if (!file.exists()) {
                            voiceSettingsActivity2.m2012v(voiceSettingsActivity2.getString(R.string.voice_dlg_not_installed));
                            break;
                        } else {
                            View inflate = LayoutInflater.from(voiceSettingsActivity2).inflate(R.layout.dialog_voice_model_confirm, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(R.id.txt_voice_model_title);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_voice_model_msg);
                            AppCompatButton appCompatButton4 = (AppCompatButton) inflate.findViewById(R.id.btn_voice_model_go);
                            textView.setText(R.string.voice_delete_title);
                            textView2.setText(voiceSettingsActivity2.getString(R.string.voice_delete_msg, file.getAbsolutePath()));
                            appCompatButton4.setText(R.string.voice_btn_delete);
                            C0117i c0117i = new C0117i(voiceSettingsActivity2, R.style.T500Split_Dialog);
                            ((C0863b) c0117i.f369g).f4328i = inflate;
                            DialogInterfaceC0867f m365a = c0117i.m365a();
                            m365a.setCancelable(true);
                            m365a.setCanceledOnTouchOutside(false);
                            AbstractC1256E0.m3022o(m365a);
                            inflate.findViewById(R.id.btn_voice_model_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate, i3));
                            appCompatButton4.setOnClickListener(new ViewOnClickListenerC0028v(voiceSettingsActivity2, m365a, inflate, file, 1));
                            AbstractC1256E0.m3002Q(m365a, inflate);
                            break;
                        }
                    default:
                        int i6 = VoiceSettingsActivity.f3324M;
                        voiceSettingsActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: A0.z

            /* renamed from: g */
            public final /* synthetic */ VoiceSettingsActivity f109g;

            {
                this.f109g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSettingsActivity voiceSettingsActivity = this.f109g;
                int i22 = 0;
                int i3 = 1;
                switch (i2) {
                    case 0:
                        int i4 = VoiceSettingsActivity.f3324M;
                        voiceSettingsActivity.getClass();
                        if (AbstractC1695c.m4958a(voiceSettingsActivity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            voiceSettingsActivity.f3331K = true;
                            AbstractC1695c.m4965h(voiceSettingsActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 2102);
                            break;
                        } else {
                            voiceSettingsActivity.f3331K = false;
                            voiceSettingsActivity.f3326F.setText(R.string.voice_status_searching);
                            new Thread(new RunnableC0024r(i22, voiceSettingsActivity), "voice-scan").start();
                            break;
                        }
                    case 1:
                        int i5 = VoiceSettingsActivity.f3324M;
                        VoiceSettingsActivity voiceSettingsActivity2 = this.f109g;
                        voiceSettingsActivity2.getClass();
                        EnumMap enumMap = AbstractC0015i.f43a;
                        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(voiceSettingsActivity2);
                        File m4873n = AbstractC1680h.m4873n(voiceSettingsActivity2, m3026s);
                        if (m4873n == null) {
                            File externalFilesDir = voiceSettingsActivity2.getExternalFilesDir(null);
                            if (externalFilesDir == null) {
                                externalFilesDir = voiceSettingsActivity2.getFilesDir();
                            }
                            m4873n = new File(externalFilesDir, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s)));
                        }
                        File file = m4873n;
                        if (!file.exists()) {
                            voiceSettingsActivity2.m2012v(voiceSettingsActivity2.getString(R.string.voice_dlg_not_installed));
                            break;
                        } else {
                            View inflate = LayoutInflater.from(voiceSettingsActivity2).inflate(R.layout.dialog_voice_model_confirm, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(R.id.txt_voice_model_title);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_voice_model_msg);
                            AppCompatButton appCompatButton4 = (AppCompatButton) inflate.findViewById(R.id.btn_voice_model_go);
                            textView.setText(R.string.voice_delete_title);
                            textView2.setText(voiceSettingsActivity2.getString(R.string.voice_delete_msg, file.getAbsolutePath()));
                            appCompatButton4.setText(R.string.voice_btn_delete);
                            C0117i c0117i = new C0117i(voiceSettingsActivity2, R.style.T500Split_Dialog);
                            ((C0863b) c0117i.f369g).f4328i = inflate;
                            DialogInterfaceC0867f m365a = c0117i.m365a();
                            m365a.setCancelable(true);
                            m365a.setCanceledOnTouchOutside(false);
                            AbstractC1256E0.m3022o(m365a);
                            inflate.findViewById(R.id.btn_voice_model_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate, i3));
                            appCompatButton4.setOnClickListener(new ViewOnClickListenerC0028v(voiceSettingsActivity2, m365a, inflate, file, 1));
                            AbstractC1256E0.m3002Q(m365a, inflate);
                            break;
                        }
                    default:
                        int i6 = VoiceSettingsActivity.f3324M;
                        voiceSettingsActivity.finish();
                        break;
                }
            }
        });
        final int i3 = 2;
        appCompatButton3.setOnClickListener(new View.OnClickListener(this) { // from class: A0.z

            /* renamed from: g */
            public final /* synthetic */ VoiceSettingsActivity f109g;

            {
                this.f109g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSettingsActivity voiceSettingsActivity = this.f109g;
                int i22 = 0;
                int i32 = 1;
                switch (i3) {
                    case 0:
                        int i4 = VoiceSettingsActivity.f3324M;
                        voiceSettingsActivity.getClass();
                        if (AbstractC1695c.m4958a(voiceSettingsActivity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            voiceSettingsActivity.f3331K = true;
                            AbstractC1695c.m4965h(voiceSettingsActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 2102);
                            break;
                        } else {
                            voiceSettingsActivity.f3331K = false;
                            voiceSettingsActivity.f3326F.setText(R.string.voice_status_searching);
                            new Thread(new RunnableC0024r(i22, voiceSettingsActivity), "voice-scan").start();
                            break;
                        }
                    case 1:
                        int i5 = VoiceSettingsActivity.f3324M;
                        VoiceSettingsActivity voiceSettingsActivity2 = this.f109g;
                        voiceSettingsActivity2.getClass();
                        EnumMap enumMap = AbstractC0015i.f43a;
                        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(voiceSettingsActivity2);
                        File m4873n = AbstractC1680h.m4873n(voiceSettingsActivity2, m3026s);
                        if (m4873n == null) {
                            File externalFilesDir = voiceSettingsActivity2.getExternalFilesDir(null);
                            if (externalFilesDir == null) {
                                externalFilesDir = voiceSettingsActivity2.getFilesDir();
                            }
                            m4873n = new File(externalFilesDir, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s)));
                        }
                        File file = m4873n;
                        if (!file.exists()) {
                            voiceSettingsActivity2.m2012v(voiceSettingsActivity2.getString(R.string.voice_dlg_not_installed));
                            break;
                        } else {
                            View inflate = LayoutInflater.from(voiceSettingsActivity2).inflate(R.layout.dialog_voice_model_confirm, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(R.id.txt_voice_model_title);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_voice_model_msg);
                            AppCompatButton appCompatButton4 = (AppCompatButton) inflate.findViewById(R.id.btn_voice_model_go);
                            textView.setText(R.string.voice_delete_title);
                            textView2.setText(voiceSettingsActivity2.getString(R.string.voice_delete_msg, file.getAbsolutePath()));
                            appCompatButton4.setText(R.string.voice_btn_delete);
                            C0117i c0117i = new C0117i(voiceSettingsActivity2, R.style.T500Split_Dialog);
                            ((C0863b) c0117i.f369g).f4328i = inflate;
                            DialogInterfaceC0867f m365a = c0117i.m365a();
                            m365a.setCancelable(true);
                            m365a.setCanceledOnTouchOutside(false);
                            AbstractC1256E0.m3022o(m365a);
                            inflate.findViewById(R.id.btn_voice_model_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate, i32));
                            appCompatButton4.setOnClickListener(new ViewOnClickListenerC0028v(voiceSettingsActivity2, m365a, inflate, file, 1));
                            AbstractC1256E0.m3002Q(m365a, inflate);
                            break;
                        }
                    default:
                        int i6 = VoiceSettingsActivity.f3324M;
                        voiceSettingsActivity.finish();
                        break;
                }
            }
        });
        if (this.f3328H != null && !this.f3332L) {
            EnumMap enumMap = AbstractC0015i.f43a;
            EnumC1314f0 m3026s = AbstractC1256E0.m3026s(this);
            LayoutInflater from = LayoutInflater.from(this);
            for (EnumC0007a enumC0007a : EnumC0007a.values()) {
                Switch r9 = (Switch) from.inflate(R.layout.item_voice_cmd_switch, (ViewGroup) this.f3328H, false);
                enumC0007a.getClass();
                int ordinal = m3026s.ordinal();
                r9.setText(ordinal != 1 ? ordinal != 2 ? enumC0007a.f22c : enumC0007a.f24e : enumC0007a.f23d);
                r9.setTag(R.id.voiceCmdList, enumC0007a);
                r9.setChecked((cfgData.m1784i().f2555P0 & (1 << enumC0007a.f20a)) != 0);
                r9.setOnCheckedChangeListener(new C0025s(this, 1));
                this.f3328H.addView(r9);
            }
            this.f3332L = true;
        }
        this.f3327G.setText(m2010t(this));
        this.f3329I.setVisibility(0);
        AbstractC1256E0.m3021n(findViewById(android.R.id.content));
        m2011u();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 2101) {
            if (AbstractC1695c.m4958a(this, "android.permission.RECORD_AUDIO") == 0 && AbstractC1680h.m4881w(this)) {
                cfgData.m1784i().f2551O0 = true;
                cfgData.m1784i().m1795o(this);
                C0021o.m28d().m36j(this);
            } else if (AbstractC1695c.m4958a(this, "android.permission.RECORD_AUDIO") != 0) {
                m2012v(getString(R.string.voice_dlg_need_mic));
            }
            m2011u();
            return;
        }
        if (i == 2102) {
            if (AbstractC1695c.m4958a(this, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                this.f3331K = false;
                m2012v(getString(R.string.voice_dlg_need_storage));
            } else if (this.f3331K) {
                this.f3331K = false;
                this.f3326F.setText(R.string.voice_status_searching);
                new Thread(new RunnableC0024r(0, this), "voice-scan").start();
            }
        }
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        m2011u();
    }

    /* renamed from: u */
    public final void m2011u() {
        File file;
        boolean m4881w = AbstractC1680h.m4881w(this);
        cfgData m1784i = cfgData.m1784i();
        int i = 0;
        if (!m4881w && m1784i.f2551O0) {
            m1784i.f2551O0 = false;
            m1784i.m1795o(this);
            C0021o.m28d().m36j(this);
        }
        this.f3325E.setEnabled(m4881w);
        this.f3325E.setOnCheckedChangeListener(null);
        this.f3325E.setChecked(m4881w && m1784i.f2551O0);
        this.f3325E.setOnCheckedChangeListener(new C0031y(this, i, m1784i));
        if (this.f3328H != null) {
            for (int i2 = 0; i2 < this.f3328H.getChildCount(); i2++) {
                View childAt = this.f3328H.getChildAt(i2);
                if (childAt instanceof Switch) {
                    Switch r6 = (Switch) childAt;
                    Object tag = r6.getTag(R.id.voiceCmdList);
                    if (tag instanceof EnumC0007a) {
                        EnumC0007a enumC0007a = (EnumC0007a) tag;
                        r6.setOnCheckedChangeListener(null);
                        enumC0007a.getClass();
                        r6.setChecked((cfgData.m1784i().f2555P0 & (1 << enumC0007a.f20a)) != 0);
                        r6.setOnCheckedChangeListener(new C0025s(this, 0));
                    }
                }
            }
        }
        int i3 = C0021o.m28d().f78r;
        EnumMap enumMap = AbstractC0015i.f43a;
        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(this);
        String m23c = AbstractC0015i.m23c(m3026s);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.voice_status_lang, m23c));
        sb.append('\n');
        sb.append(m4881w ? getString(R.string.voice_status_model_yes) : getString(R.string.voice_status_model_no));
        sb.append('\n');
        sb.append(getString(R.string.voice_status_folder, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s))));
        sb.append('\n');
        if (m4881w) {
            EnumC1314f0 m3026s2 = AbstractC1256E0.m3026s(this);
            file = AbstractC1680h.m4873n(this, m3026s2);
            if (file == null) {
                File externalFilesDir = getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    externalFilesDir = getFilesDir();
                }
                file = new File(externalFilesDir, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s2)));
            }
        } else {
            EnumC1314f0 m3026s3 = AbstractC1256E0.m3026s(this);
            File externalFilesDir2 = getExternalFilesDir(null);
            if (externalFilesDir2 == null) {
                externalFilesDir2 = getFilesDir();
            }
            file = new File(externalFilesDir2, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s3)));
        }
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.contains("/Android/data/")) {
            absolutePath = absolutePath.substring(absolutePath.indexOf("/Android/data/") + 1);
        } else if (absolutePath.startsWith("/storage/emulated/0/")) {
            absolutePath = "Download/…" + absolutePath.substring(20);
        }
        sb.append(getString(R.string.voice_status_path, absolutePath));
        if (i3 == 3) {
            sb.append('\n');
            sb.append(getString(R.string.voice_status_engine_loaded));
        } else if (i3 == 2) {
            sb.append('\n');
            sb.append(getString(R.string.voice_status_engine_idle));
        } else {
            sb.append('\n');
            sb.append(getString(R.string.voice_status_engine_none));
        }
        sb.append('\n');
        sb.append(m1784i.f2551O0 ? getString(R.string.voice_status_voice_on) : getString(R.string.voice_status_voice_off));
        if (C0021o.m28d().f72l) {
            sb.append(getString(R.string.voice_status_listening));
        }
        this.f3326F.setText(sb.toString());
        this.f3327G.setText(m2010t(this));
    }

    /* renamed from: v */
    public final void m2012v(String str) {
        if (isFinishing()) {
            return;
        }
        AbstractC1372y1.m3288S(this, getString(R.string.Message), str, null);
    }
}
