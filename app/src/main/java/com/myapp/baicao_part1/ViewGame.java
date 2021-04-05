package com.myapp.baicao_part1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class ViewGame extends SurfaceView implements Runnable{
    private LayerDrawable drawables;
    private Rect rect,rectbocbai,rectlatbai;
    private startnewview startview;
    private int index;
    private int animation;
    private boolean mPlaying;
    Drawable space;
    Drawable[] poker;
    private Thread thread;
    private long mNextFrameTime;
    private Canvas mCanvas;
    private SurfaceHolder mSurfaceHolder;
    private Paint mPaint;
    private boolean mPaused;
    private Bitmap spaceBitmap;
    private myBitmapPoker[] pokerBitmap;
    private int numPoker;
    private int pokerPicked;
    private boolean tren;
    private myPoker[] mypoker;
    private float posX,posY;
    private int hesoa,hesob,hesoc,numberPK,hesod,numcards,posY1,hesoa1,hesob1;
    private Point size;
    private boolean inotify;
    private TextDrawable bocbai,latbai;
    public ViewGame(Context context,  Bitmap spaceBitmap2, myBitmapPoker[] pokerBitmap, Point size, startnewview startview) {

        super(context);
        index = 0;
        this.size = size;
        this.startview = startview;
        animation = 0;
        inotify = false;
        numberPK = 6;
        numcards=2;
        this.spaceBitmap = spaceBitmap2;

        this.pokerBitmap = pokerBitmap;

        rect = new Rect(300,300,600,900);
        thread = new Thread(this);
        mPaint = new Paint();
        mPaint.setTextSize(30f);

        mypoker = new myPoker[52];

        hesoc = 7;
        posX = (size.x*hesoc)/8;
        posY = (size.y)/8;
        hesoa = 2*size.y;
        hesob = 6*size.x;
        tren = true;

        mPlaying = true;
        mPaused = false;
        mSurfaceHolder = getHolder();
        numPoker = 52;
        pokerPicked = 0;

        int w = ((size.x)/8);
        int h = ((size.y)/8)*2;
        for(int i=0;i<52;i++){
            this.pokerBitmap[i].bitmap_back = Bitmap.createScaledBitmap(this.pokerBitmap[i].bitmap_back,w,h,false);
            this.pokerBitmap[i].bitmap_front = Bitmap.createScaledBitmap(this.pokerBitmap[i].bitmap_front,w,h,false);
            mypoker[i] = new myPoker(context,this.pokerBitmap[i].bitmap_back,size,pokerBitmap[i].bitmap_front);
        }
        spaceBitmap = Bitmap.createScaledBitmap(spaceBitmap,size.x,size.y,false);

         rectbocbai = new Rect((5*size.x)/8,(3*size.y)/8+size.y/20,(6*size.x)/8+size.x/20,(5*size.y)/8-size.y/20);
        bocbai = new TextDrawable("Bốc Bài",rectbocbai);

         rectlatbai = new Rect((7*size.x)/8-size.x/20,(3*size.y)/8+size.y/20,(8*size.x)/8,(5*size.y)/8-size.y/20);
        latbai = new TextDrawable("Lật Bài",rectlatbai);

    }

    public void startView() {
        mPlaying = true;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int i = event.getActionIndex();
        int x = (int) event.getX(i);
        int y = (int) event.getY(i);
        int eventType = event.getAction() & MotionEvent.ACTION_MASK;
        if (eventType == MotionEvent.ACTION_UP || eventType == MotionEvent.ACTION_POINTER_UP) {
            if (rect.contains(x, y)) {
                if((numPoker !=0)&&(mPaused == false)) {
                    mPaused = true;
                    pokerPicked = numPoker;
                    numPoker--;
                }
            }
            if(rectbocbai.contains(x,y)){
                if(inotify){
                    if(numcards !=0) {
                        numberPK = 1;
                        mPaused = true;
                        numcards--;
                    }
                    //only pick 2 cards

                }
            }
            if(rectlatbai.contains(x,y)){
                if(inotify){

                }
            }
        }
        return true;
    }

    public void draw(){
        if (mSurfaceHolder.getSurface().isValid()) {
            mCanvas = mSurfaceHolder.lockCanvas();
          //  drawables.draw(mCanvas);
            mCanvas.drawBitmap(spaceBitmap,
                    0, 0 ,null);
         //   mCanvas.drawText("you picked: "+(52-numPoker)+" card, and your poker num is card "+pokerPicked,100,100,mPaint);
           for(int i=0;i<52;i++) {
               mypoker[i].draw(mCanvas,mPaint);
           }

           if(inotify){
               bocbai.draw(mCanvas);
               latbai.draw(mCanvas);
           }
            // Unlock the mCanvas and reveal the graphics for this frame
            mSurfaceHolder.unlockCanvasAndPost(mCanvas);
        }
    }


    @Override
    public void run() {
        while (mPlaying) {
            if(mPaused) {
                update();
            }
            draw();
        }
    }

    private void update() {

        if(numberPK==0) {
            mPaused = false;
            //numberPK=1;
            inotify = true;
        }else if(mypoker[pokerPicked-1].getX() == posX ) {

            posY= mypoker[pokerPicked-1].getY();
            mypoker[pokerPicked-1].updateVitri(posX,posY);

            pokerPicked = numPoker;
            numPoker--;
            numberPK--;

            if(numberPK==3){
                tren = false;
                hesod = 7;
                posX = (size.x*hesod)/8;
                hesoa = 2*size.y;
                hesob = 6*size.x;
            }else if(numberPK <3){
                hesod--;
                posX = (size.x * hesod) / 8;
                hesoa = 2 * size.y;
                hesob = (hesod - 1) * size.x;
            }else {
                tren = true;
                hesoc--;
                posX = (size.x * hesoc) / 8;
                hesoa = 2 * size.y;
                hesob = (hesoc - 1) * size.x;
            }
        }else{
            mypoker[pokerPicked-1].move(hesoa,hesob,hesoc-1,tren);
        }
    }
}
