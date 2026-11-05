package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.altaysoft.t500_split.R;
import p006C.AbstractC0055c;
import p123z.AbstractC1695c;

/* renamed from: l.s */
/* loaded from: classes.dex */
public final class C1139s {

    /* renamed from: a */
    public final int[] f5250a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b */
    public final int[] f5251b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c */
    public final int[] f5252c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* renamed from: d */
    public final int[] f5253d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e */
    public final int[] f5254e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f */
    public final int[] f5255f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    /* renamed from: a */
    public static boolean m2754a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m2755b(Context context, int i) {
        int m2692c = AbstractC1074M0.m2692c(context, R.attr.colorControlHighlight);
        int m2691b = AbstractC1074M0.m2691b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC1074M0.f5075b;
        int[] iArr2 = AbstractC1074M0.f5077d;
        int m105b = AbstractC0055c.m105b(m2692c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC1074M0.f5076c, AbstractC1074M0.f5079f}, new int[]{m2691b, m105b, AbstractC0055c.m105b(m2692c, i), i});
    }

    /* renamed from: c */
    public static LayerDrawable m2756c(C1064H0 c1064h0, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable m2672c = c1064h0.m2672c(context, R.drawable.abc_star_black_48dp);
        Drawable m2672c2 = c1064h0.m2672c(context, R.drawable.abc_star_half_black_48dp);
        if ((m2672c instanceof BitmapDrawable) && m2672c.getIntrinsicWidth() == dimensionPixelSize && m2672c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) m2672c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            m2672c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m2672c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((m2672c2 instanceof BitmapDrawable) && m2672c2.getIntrinsicWidth() == dimensionPixelSize && m2672c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) m2672c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            m2672c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m2672c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: e */
    public static void m2757e(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1141t.f5271b;
        }
        mutate.setColorFilter(C1141t.m2763c(i, mode));
    }

    /* renamed from: d */
    public final ColorStateList m2758d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC1695c.m4959b(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1695c.m4959b(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m2755b(context, AbstractC1074M0.m2692c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m2755b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m2755b(context, AbstractC1074M0.m2692c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1695c.m4959b(context, R.color.abc_tint_spinner);
            }
            if (m2754a(this.f5251b, i)) {
                return AbstractC1074M0.m2693d(context, R.attr.colorControlNormal);
            }
            if (m2754a(this.f5254e, i)) {
                return AbstractC1695c.m4959b(context, R.color.abc_tint_default);
            }
            if (m2754a(this.f5255f, i)) {
                return AbstractC1695c.m4959b(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1695c.m4959b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList m2693d = AbstractC1074M0.m2693d(context, R.attr.colorSwitchThumbNormal);
        if (m2693d == null || !m2693d.isStateful()) {
            iArr[0] = AbstractC1074M0.f5075b;
            iArr2[0] = AbstractC1074M0.m2691b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1074M0.f5078e;
            iArr2[1] = AbstractC1074M0.m2692c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1074M0.f5079f;
            iArr2[2] = AbstractC1074M0.m2692c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1074M0.f5075b;
            iArr[0] = iArr3;
            iArr2[0] = m2693d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1074M0.f5078e;
            iArr2[1] = AbstractC1074M0.m2692c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1074M0.f5079f;
            iArr2[2] = m2693d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
