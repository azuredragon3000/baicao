package com.myapp.baicao_part1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends Activity implements startnewview,Runnable{

    private myBitmapPoker[] arrPoker;
    private Bitmap space1,space2,button,buttonchien,chat;
    private Point size;
    private Thread thread;
    private boolean ready;
    ViewStartGame startview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BitmapStore bs = BitmapStore.getInstance(this);
        thread = new Thread(this);
        Display display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);

        space1 = getBitmap("bg", size);
        button = getBitmap("button", size);
        space2 = getBitmap("bg2", size);

        buttonchien = getBitmap("buttonchien",size);
        chat = getBitmap("chat2",size);
        arrPoker = new myBitmapPoker[52];

        startview = new ViewStartGame(this,space1,button,size,this);
        setContentView(startview);
        thread.start();
    }


    @Override
    public void startview0()  {
        setContentView(startview);
    }


    public Bitmap getBitmap(String image, Point size) {
        BitmapStore.addBitmap(this,
                image,
                new PointF(size.x, size.y),
                1, false);
        Bitmap bitmap = BitmapStore.getBitmap(image);
        return bitmap;
    }

    @Override
    public void run() {
        Bitmap temp = getBitmap("back2",size);
        arrPoker = getCards(temp);
        ready = true;

    }

    @Override
    public void startview1() throws InterruptedException {
        if(ready) {
            thread.join();
            ViewGame startview = new ViewGame(this, space2, arrPoker, size, this,buttonchien,chat);
            setContentView(startview);
            startview.startView();
        }else{
            setAds();
        }
    }

    private void setAds() {
    }


    private myBitmapPoker[] getCards(Bitmap temp) {
        myBitmapPoker[] t_arrPoker = new myBitmapPoker[52];

        Bitmap haibit = getBitmap("hai_bit",size);
        Bitmap haichuon = getBitmap("hai_chuon",size);
        Bitmap hairo = getBitmap("hai_ro",size);
        Bitmap haico = getBitmap("hai_co",size);
        Bitmap babit = getBitmap("ba_bit",size);
        Bitmap bachuon = getBitmap("ba_chuon",size);
        Bitmap baro = getBitmap("ba_ro",size);
        Bitmap baco = getBitmap("ba_co",size);
        Bitmap bonbit = getBitmap("bon_bit",size);
        Bitmap bonchuon = getBitmap("bon_chuon",size);
        Bitmap bonro = getBitmap("bon_ro",size);
        Bitmap bonco = getBitmap("bon_co",size);
        Bitmap nambit = getBitmap("nam_bit",size);
        Bitmap namchuon = getBitmap("nam_chuon",size);
        Bitmap namro = getBitmap("nam_ro",size);
        Bitmap namco = getBitmap("nam_co",size);
        Bitmap saubit = getBitmap("sau_bit",size);
        Bitmap sauchuon = getBitmap("sau_chuon",size);
        Bitmap sauro = getBitmap("sau_ro",size);
        Bitmap sauco = getBitmap("sau_co",size);
        Bitmap baybit = getBitmap("bay_bit",size);
        Bitmap baychuon = getBitmap("bay_chuon",size);
        Bitmap bayro = getBitmap("bay_ro",size);
        Bitmap bayco = getBitmap("bay_co",size);
        Bitmap tambit = getBitmap("tam_bit",size);
        Bitmap tamchuon = getBitmap("tam_chuon",size);
        Bitmap tamro = getBitmap("tam_ro",size);
        Bitmap tamco = getBitmap("tam_co",size);
        Bitmap chinbit = getBitmap("chin_bit",size);
        Bitmap chinchuon = getBitmap("chin_chuon",size);
        Bitmap chinro = getBitmap("chin_ro",size);
        Bitmap chinco = getBitmap("chin_co",size);
        Bitmap muoibit = getBitmap("muoi_bit",size);
        Bitmap muoichuon = getBitmap("muoi_chuon",size);
        Bitmap muoiro = getBitmap("muoi_ro",size);
        Bitmap muoico = getBitmap("muoi_co",size);
        Bitmap jbit = getBitmap("gi_bit1",size);
        Bitmap jchuon = getBitmap("gi_chuon2",size);
        Bitmap jro = getBitmap("gi_ro2",size);
        Bitmap jco = getBitmap("gi_co",size);
        Bitmap dambit = getBitmap("queen_bit",size);
        Bitmap damchuon = getBitmap("queen_chuon",size);
        Bitmap damro = getBitmap("queen_ro",size);
        Bitmap damco = getBitmap("queen_co",size);
        Bitmap giabit = getBitmap("gia_bit",size);
        Bitmap giachuon = getBitmap("gia_chuon",size);
        Bitmap giaro = getBitmap("gia_ro",size);
        Bitmap giaco = getBitmap("gia_co",size);
        Bitmap xibit = getBitmap("xi_bit",size);
        Bitmap xichuon = getBitmap("xi_chuon",size);
        Bitmap xiro = getBitmap("xi_ro",size);
        Bitmap xico = getBitmap("xi_co",size);



        t_arrPoker[0] = new myBitmapPoker(temp,haibit,2);
        t_arrPoker[1] = new myBitmapPoker(temp,haichuon,2);
        t_arrPoker[2] = new myBitmapPoker(temp,hairo,2);
        t_arrPoker[3] = new myBitmapPoker(temp,haico,2);

        t_arrPoker[4] = new myBitmapPoker(temp,babit,3);
        t_arrPoker[5] = new myBitmapPoker(temp,bachuon,3);
        t_arrPoker[6] = new myBitmapPoker(temp,baro,3);
        t_arrPoker[7] = new myBitmapPoker(temp,baco,3);

        t_arrPoker[8] = new myBitmapPoker(temp,bonbit,4);
        t_arrPoker[9] = new myBitmapPoker(temp,bonchuon,4);
        t_arrPoker[10] = new myBitmapPoker(temp,bonro,4);
        t_arrPoker[11] = new myBitmapPoker(temp,bonco,4);

        t_arrPoker[12] = new myBitmapPoker(temp,nambit,5);
        t_arrPoker[13] = new myBitmapPoker(temp,namchuon,5);
        t_arrPoker[14] = new myBitmapPoker(temp,namro,5);
        t_arrPoker[15] = new myBitmapPoker(temp,namco,5);

        t_arrPoker[16] = new myBitmapPoker(temp,saubit,6);
        t_arrPoker[17] = new myBitmapPoker(temp,sauchuon,6);
        t_arrPoker[18] = new myBitmapPoker(temp,sauro,6);
        t_arrPoker[19] = new myBitmapPoker(temp,sauco,6);

        t_arrPoker[20] = new myBitmapPoker(temp,baybit,7);
        t_arrPoker[21] = new myBitmapPoker(temp,baychuon,7);
        t_arrPoker[22] = new myBitmapPoker(temp,bayro,7);
        t_arrPoker[23] = new myBitmapPoker(temp,bayco,7);

        t_arrPoker[24] = new myBitmapPoker(temp,tambit,8);
        t_arrPoker[25] = new myBitmapPoker(temp,tamchuon,8);
        t_arrPoker[26] = new myBitmapPoker(temp,tamro,8);
        t_arrPoker[27] = new myBitmapPoker(temp,tamco,8);

        t_arrPoker[28] = new myBitmapPoker(temp,chinbit,9);
        t_arrPoker[29] = new myBitmapPoker(temp,chinchuon,9);
        t_arrPoker[30] = new myBitmapPoker(temp,chinro,9);
        t_arrPoker[31] = new myBitmapPoker(temp,chinco,9);

        t_arrPoker[32] = new myBitmapPoker(temp,muoibit,10);
        t_arrPoker[33] = new myBitmapPoker(temp,muoichuon,10);
        t_arrPoker[34] = new myBitmapPoker(temp,muoiro,10);
        t_arrPoker[35] = new myBitmapPoker(temp,muoico,10);

        t_arrPoker[36] = new myBitmapPoker(temp,jbit,10);
        t_arrPoker[37] = new myBitmapPoker(temp,jchuon,10);
        t_arrPoker[38] = new myBitmapPoker(temp,jro,10);
        t_arrPoker[39] = new myBitmapPoker(temp,jco,10);

        t_arrPoker[40] = new myBitmapPoker(temp,dambit,10);
        t_arrPoker[41] = new myBitmapPoker(temp,damchuon,10);
        t_arrPoker[42] = new myBitmapPoker(temp,damro,10);
        t_arrPoker[43] = new myBitmapPoker(temp,damco,10);

        t_arrPoker[44] = new myBitmapPoker(temp,giabit,10);
        t_arrPoker[45] = new myBitmapPoker(temp,giachuon,10);
        t_arrPoker[46] = new myBitmapPoker(temp,giaro,10);
        t_arrPoker[47] = new myBitmapPoker(temp,giaco,10);
        t_arrPoker[48] = new myBitmapPoker(temp,xibit,10);
        t_arrPoker[49] = new myBitmapPoker(temp,xichuon,10);
        t_arrPoker[50] = new myBitmapPoker(temp,xiro,10);
        t_arrPoker[51] = new myBitmapPoker(temp,xico,10);


        return t_arrPoker;
    }


}

class myBitmapPoker{
    Bitmap bitmap_back;
    Bitmap bitmap_front;
    int number;
    myBitmapPoker(Bitmap b1, Bitmap b2, int num){
        bitmap_back = b1;
        bitmap_front = b2;
        number = num;
    }
}