package com.myapp.baicao_part1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;

public class ViewStartGame extends View {

    private LayerDrawable drawables;
    private Rect rect;
    private startnewview startview;
    public ViewStartGame(Context context, Bitmap spaceBitmap, Bitmap buttonBitmap, Point size, startnewview startview) {
        super(context);
        Drawable space = new BitmapDrawable(context.getResources(), spaceBitmap);
        Drawable button = new BitmapDrawable(context.getResources(), buttonBitmap);
        this.startview = startview;
        space.setBounds(0,0,size.x,size.y);
        int l = (size.x*2)/8;
        int t = (size.y*6)/8;
        int r = (size.x*4)/8;
        int b = (size.y*8)/8;

        rect = new Rect(l,t,r,b);
        button.setBounds(rect);
        Drawable[] bodies = {space,button};
        drawables = new LayerDrawable(bodies);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int i = event.getActionIndex();
        int x = (int) event.getX(i);
        int y = (int) event.getY(i);
        int eventType = event.getAction() & MotionEvent.ACTION_MASK;
        if (eventType == MotionEvent.ACTION_UP || eventType == MotionEvent.ACTION_POINTER_UP) {
            if(rect.contains(x,y)){
                try {
                    startview.startview1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        drawables.draw(canvas);
    }
}
