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

import java.util.ArrayList;
import java.util.Random;

public class ViewGame extends SurfaceView implements Runnable{
    private LayerDrawable drawables;
    private Rect rect,rectbocbai,rectlatbai,rect1,rect2,rect3,rect4;
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
    private int numPoker,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    private int pokerPicked;
    private boolean tren;
    private myPoker[] mypoker;
    private float posX,posY;
    private int hesoa,hesob,hesoc,numberPK,hesod,numcards,nutdoiphuong,nutminh;
    private Point size;
    private boolean inotify,dp,ta;
    private BitmapDrawable bocbai,latbai,doiphuong,baiminh,gamemoi,thoatra;
    private boolean lat,lb;
    // 7 la bai dinh menh
    private ArrayList controlCards;
    private String win;

    public ViewGame(Context context,  Bitmap spaceBitmap2, myBitmapPoker[] pokerBitmap, Point size, startnewview startview,
                    Bitmap buttonchien,Bitmap chat) {

        super(context);
        controlCards = new ArrayList<Integer>();
        index = 0;
        win = "";
        dp = false;
        ta = false;
        this.size = size;
        this.startview = startview;
        animation = 0;
        inotify = false;
        numberPK = 6;
        numcards=2;
        this.spaceBitmap = spaceBitmap2;
        lat = false;

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
            mypoker[i] = new myPoker(context,this.pokerBitmap[i].bitmap_back,size,pokerBitmap[i].bitmap_front,pokerBitmap[i].number);
        }
        spaceBitmap = Bitmap.createScaledBitmap(spaceBitmap,size.x,size.y,false);
        int l = (size.x)/8;
        int t = (size.y)/8;
        int r = (4*size.x)/8;
        int b = (3*size.y)/8;
        m1 = l + (r-l)/15;
        m2 = b-((b-t)/2);
        rectbocbai = new Rect(l,t,r,b);
        bocbai = new BitmapDrawable(context.getResources(),chat);
        bocbai.setBounds(rectbocbai);

         l = (6*size.x)/8-size.x/20;
         t = (3*size.y)/8+size.y/20;
         r = (7*size.x)/8+size.x/20;
         b = (5*size.y)/8-size.y/20;
        m3 = r-2*(r-l)/3;
        m4 = b-((b-t)/2);
        rectlatbai = new Rect(l,t,r,b);
        latbai = new BitmapDrawable(context.getResources(),buttonchien);
        latbai.setBounds(rectlatbai);

        l = (6*size.x)/8-size.x/20;
        t = 0;
        r = (7*size.x)/8+size.x/20;
        b = (size.y)/8;//-size.y/20;
        m5 = r-3*(r-l)/4;
        m6 = b-((b-t)/2);
        rect1 = new Rect(l,t,r,b);
        doiphuong = new BitmapDrawable(context.getResources(),buttonchien);
        doiphuong.setBounds(rect1);

        l = (6*size.x)/8-size.x/20;
        t = (7*size.y)/8;//+size.y/20;
        r = (7*size.x)/8+size.x/20;
        b = (size.y);//-size.y/20;
        m7 = r-3*(r-l)/4;
        m8 = b-((b-t)/2);
        rect2 = new Rect(l,t,r,b);
        baiminh = new BitmapDrawable(context.getResources(),buttonchien);
        baiminh.setBounds(rect2);

        l = 0;
        t = (6*size.y)/8;
        r = (2*size.x)/8;//+size.x/20;
        b = (7*size.y)/8;//-size.y/20;
        m9 = r-3*(r-l)/4;
        m10 = b-((b-t)/2);
        rect3 = new Rect(l,t,r,b);
        gamemoi = new BitmapDrawable(context.getResources(),buttonchien);
        gamemoi.setBounds(rect3);

        l = 0;
        t = (7*size.y)/8;//+size.y/20;
        r = (2*size.x)/8;///+size.x/20;
        b = (size.y);//-size.y/20;
        m11 = r-3*(r-l)/4;
        m12 = b-((b-t)/2);
        rect4 = new Rect(l,t,r,b);
        thoatra = new BitmapDrawable(context.getResources(),buttonchien);
        thoatra.setBounds(rect4);

        shuffle_array();
    }

    private void shuffle_array() {
        Random rand = new Random();

        for (int i = 0; i < mypoker.length; i++) {
            int randomIndexToSwap = rand.nextInt(mypoker.length);
            myPoker temp = mypoker[randomIndexToSwap];
            mypoker[randomIndexToSwap] = mypoker[i];
            mypoker[i] = temp;
        }
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
                if((numPoker !=0)&&(!mPaused)&&(!inotify)) {
                    mPaused = true;
                    pokerPicked = numPoker;
                    numPoker--;
                }
            }
            if(rectbocbai.contains(x,y)||rect.contains(x, y)){
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
                    lb = true;
                    mypoker[(int)controlCards.get(0)].bitmap = mypoker[(int)controlCards.get(0)].bitmap2;
                    mypoker[(int)controlCards.get(1)].bitmap = mypoker[(int)controlCards.get(1)].bitmap2;
                    mypoker[(int)controlCards.get(2)].bitmap = mypoker[(int)controlCards.get(2)].bitmap2;

                    nutdoiphuong  =  mypoker[(int)controlCards.get(0)].number +  mypoker[(int)controlCards.get(1)].number +  mypoker[(int)controlCards.get(2)].number;

                    for(int t=3;t<controlCards.size();t++){
                        nutminh  =  nutminh+mypoker[(int)controlCards.get(t)].number;// +  mypoker[(int)controlCards.get(1)].number +  mypoker[(int)controlCards.get(2)].number;
                    }

                    if(nutdoiphuong > 21){
                        dp =true;
                        nutdoiphuong =0;
                    }
                    if(nutminh > 21){
                        ta = true;
                        nutminh=0;
                    }

                    checkwin();
                }
            }
            //newgame
            if(rect3.contains(x,y)){
                try {
                    newgame();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // exit
            if(rect4.contains(x,y)){
                stopgame();
            }
        }
        return true;
    }

    private void checkwin() {

        if(nutdoiphuong>nutminh){
            win = "bạn thua";
        }else if(nutdoiphuong < nutminh){
            win = "BẠN THẮNG";
        }else{
            win = "HÒA";
        }
    }

    private void stopgame()  {
        mPlaying=false;
        try {
        thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startview.startview0();
    }

    private void newgame() throws InterruptedException {

        mPlaying=false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startview.startview1();
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

               gamemoi.draw(mCanvas);
               thoatra.draw(mCanvas);
               mCanvas.drawText("GAME MỚI",m9,m10,mPaint);
               mCanvas.drawText("THOÁT RA",m11,m12,mPaint);

               if(lb) {
                   if(dp){
                       doiphuong.draw(mCanvas);
                       mCanvas.drawText("ĐỊCH BÙ ĐIỂM", m5, m6, mPaint);
                   }else{
                       doiphuong.draw(mCanvas);
                       mCanvas.drawText("ĐỊCH CÓ: " + nutdoiphuong + " ĐIỂM", m5, m6, mPaint);
                   }

                   if(ta){

                       baiminh.draw(mCanvas);
                       mCanvas.drawText("TA BÙ ĐIỂM: ", m7, m8, mPaint);
                   }else{

                       baiminh.draw(mCanvas);
                       mCanvas.drawText("TA CÓ: " + nutminh + " ĐIỂM", m7, m8, mPaint);
                   }


                   latbai.draw(mCanvas);
                   mCanvas.drawText(win,m3,m4,mPaint);
               }else{
                   bocbai.draw(mCanvas);
                   latbai.draw(mCanvas);
                   mCanvas.drawText("CHIẾN !!! ",m3,m4,mPaint);
                   mCanvas.drawText("CHẮC CHƯA, NẾU CHƯA THÌ BỐC THÊM BÀI",m1,m2,mPaint);
               }
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
            //controlCards[numberPK] = pokerPicked-1;
            controlCards.add(pokerPicked-1); // phan tu 1 tuong ung voi phan tu 6
            posY= mypoker[pokerPicked-1].getY();
            mypoker[pokerPicked-1].updateVitri(posX,posY);
            mypoker[pokerPicked-1].latbai(lat);

            pokerPicked = numPoker;
            numPoker--;
            numberPK--;

            if(numberPK==3){
                tren = false;
                lat = true;
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
