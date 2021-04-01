package com.myapp.baicao_part1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

public class ViewGame extends View {
    private LayerDrawable drawables;
    private Rect rect;
    private startnewview startview;

    public ViewGame(Context context, Bitmap[] bitmap, Point size, startnewview startview) {
        super(context);
        Drawable space = new BitmapDrawable(context.getResources(), bitmap[2]);
        Drawable poker = new BitmapDrawable(context.getResources(), bitmap[3]);
        this.startview = startview;
        space.setBounds(0,0,size.x,size.y);
        rect = new Rect(300,300,600,900);
        poker.setBounds(rect);
        Drawable[] bodies = {space,poker};
        drawables = new LayerDrawable(bodies);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        drawables.draw(canvas);
    }
}
