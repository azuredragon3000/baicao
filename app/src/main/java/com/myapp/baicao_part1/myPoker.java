package com.myapp.baicao_part1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class myPoker {

    public Bitmap bitmap;
    private Point size;
    private float animationx,animationy;
    float l,t;
    private float hesogoc,hesogocy;
    private boolean tren;
    public Rect vitri;
    public Bitmap bitmap2;

    myPoker(Context context, Bitmap bitmap, Point size, Bitmap bitmap2){
            this.bitmap = bitmap;
            this.size = size;
            this.bitmap2 = bitmap2;
            hesogoc = 2/6;
            animationx = 0;
            animationy = 0;
            l = (size.x)/8;
            t = (size.y*3)/8;
            tren = true;
        vitri = new Rect((int)l,(int)t,(int)l+bitmap.getWidth(),(int)t+bitmap.getHeight());

    }

    void draw(Canvas canvas, Paint paint) {
        if(tren) {
            canvas.drawBitmap(bitmap, l + animationx, t - animationy, null);
        }else{
            canvas.drawBitmap(bitmap, l + animationx, t + animationy, null);
        }//canvas.drawText(animationx + " : " +animationy , 300,300,paint);
       // canvas.drawText("vi tri card1: "+ getvitri(),200,200,paint);
    }

    public void move(int hesoa, int hesob, int hesoc, boolean tren) {
        this.tren = tren;
        animationx = animationx+((size.x*hesoc)/(8*80));
        animationy = ((animationx*hesoa)/hesob);//(animationx*2280)/11520;
    }

    public float getX() {
        return (l+animationx);
    }

    public float getY() {
        if(tren) {
            return ( t-animationy);
        }else{
            return ( t+animationy);
        }
    }

    public void updateVitri(float posX, float posY) {
        vitri.set((int)posX,(int)posY,(int)posX+bitmap.getWidth(),(int)posY+bitmap.getHeight());
    }

    public String getvitri() {
        return vitri.left + " : "+ vitri.top;
    }
}
