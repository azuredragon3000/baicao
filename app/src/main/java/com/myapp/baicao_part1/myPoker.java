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
    public Rect vitri,vitribandau;
    public Bitmap bitmap2,bitmap1;
    public int number;
    myPoker(Context context, Bitmap bitmap, Point size, Bitmap bitmap2, int number){
            this.bitmap = bitmap;
            this.bitmap1 = bitmap;
            this.size = size;
            this.bitmap2 = bitmap2;
            hesogoc = 2/6;
            animationx = 0;
            animationy = 0;
            l = (size.x)/8;
            t = (size.y*3)/8;
            this.number = number;
            tren = true;
        vitri = new Rect((int)l,(int)t,(int)l+bitmap.getWidth(),(int)t+bitmap.getHeight());
        vitribandau = new Rect((int)l,(int)t,(int)l+bitmap.getWidth(),(int)t+bitmap.getHeight());
    }

    void getvitribandau(){
        vitri.set(vitribandau);
    }
    void draw(Canvas canvas, Paint paint) {
        if(tren) {
            canvas.drawBitmap(bitmap, l + animationx, t - animationy, null);
        }else{
            canvas.drawBitmap(bitmap, l + animationx, t + animationy, null);
        }
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

    public void latbai(boolean lat) {
        if(lat){
            bitmap = bitmap2;
        }
    }
}
