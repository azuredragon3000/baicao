package com.myapp.baicao_part1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
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
    public ViewStartGame(Context context, Bitmap[] bitmap, Point size,startnewview startview) {
        super(context);
        Drawable space = new BitmapDrawable(context.getResources(), bitmap[0]);
        Drawable poker = new BitmapDrawable(context.getResources(), bitmap[1]);
        this.startview = startview;
        space.setBounds(0,0,size.x,size.y);
        rect = new Rect(300,300,600,900);
        poker.setBounds(rect);
        Drawable[] bodies = {space,poker};
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
                startview.startview1();
            }
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        drawables.draw(canvas);
    }
}
