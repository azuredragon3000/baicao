package com.myapp.baicao_part1;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

public class TextDrawable extends Drawable {

        private final String text;
        private final Paint paint;
        private Rect rect;
        private final Paint paint2;
        public TextDrawable(String text, Rect rect, float textsize, Paint.Style pain) {

            this.text = text;
            this.rect = rect;
            this.paint = new Paint();
            paint.setColor(Color.rgb(51, 57, 255));
            paint.setTypeface(Typeface.create("Arial", Typeface.ITALIC));
            paint.setTextSize(textsize);
            paint.setAntiAlias(true);
            paint.setFakeBoldText(true);
            paint.setShadowLayer(6f, 0, 0, Color.BLACK);
            paint.setStyle(pain);
            paint.setTextAlign(Paint.Align.LEFT);
            paint2 = new Paint();
            paint2.setColor(Color.rgb(51, 255, 63));
            paint2.setAntiAlias(true);
            paint2.setFakeBoldText(true);
            paint2.setShadowLayer(6f, 0, 0, Color.BLACK);
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            paint2.setTextAlign(Paint.Align.LEFT);

        }

        @Override
        public void draw(Canvas canvas) {

            canvas.drawRect(rect,paint2);
            canvas.drawText(text, rect.right-3*(rect.right-rect.left)/4, rect.bottom-(rect.bottom-rect.top)/2, paint);

        }

        @Override
        public void setAlpha(int alpha) {
            paint.setAlpha(alpha);
        }

        @Override
        public void setColorFilter(ColorFilter cf) {
            paint.setColorFilter(cf);
        }

        @Override
        public int getOpacity() {
            return PixelFormat.TRANSLUCENT;
        }
    }

