package com.xw.banner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;

public class RoundBackgroundColorSpan extends ReplacementSpan {

    private int bgColor;
    private int textColor;
    private Context context;

    public RoundBackgroundColorSpan(Context context, int bgColor, int textColor) {
        super();
        this.bgColor = bgColor;
        this.textColor = textColor;
        this.context = context;
    }

    @Override
    public int getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        return ((int)paint.measureText(text, start, end)+20);
    }

    @Override
    public void draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint) {
        int color1 = paint.getColor();

        paint.setColor(this.bgColor);
        paint.setTextSize(dip2px(context,12));
        canvas.drawRoundRect(new RectF(x, top + 5, x + ((int) paint.measureText(text, start, end)+20), bottom - 5),
                dip2px(context,3), dip2px(context,3), paint);
        paint.setColor(this.textColor);
        canvas.drawText(text, start, end, x+10, y - 5, paint);
        paint.setColor(color1);
    }

    private int dip2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
