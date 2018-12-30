package com.pd.chocobar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.DrawableCompat;


public class ChocoBarUtils {

    static Drawable tintDrawable(@NonNull Drawable drawable, @ColorInt int color) {
        drawable = DrawableCompat.wrap(drawable);
        drawable = drawable.mutate();
        DrawableCompat.setTint(drawable, color);
        return drawable;
    }

    static Drawable makeTransparentDrawable(Context context, int width, int height) {
        Bitmap.Config conf = Bitmap.Config.ARGB_8888;
        Bitmap bmp = Bitmap.createBitmap(width, height, conf);
        return new BitmapDrawable(context.getResources(),bmp);
    }
}