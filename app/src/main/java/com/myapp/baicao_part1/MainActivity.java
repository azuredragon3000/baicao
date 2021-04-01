package com.myapp.baicao_part1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends Activity implements startnewview{

    private Bitmap[] bitmap;
    private Point size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BitmapStore bs = BitmapStore.getInstance(this);

        Display display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);

        bitmap = new Bitmap[4];
        bitmap[0] = getBitmap("bg", size);
        bitmap[1] = getBitmap("back1", size);
        bitmap[2] = getBitmap("bg2", size);
        bitmap[3] = getBitmap("back2", size);

        ViewStartGame startview = new ViewStartGame(this,bitmap,size,this);
        setContentView(startview);
    }

    public Bitmap getBitmap(String image, Point size) {
        BitmapStore.addBitmap(this,
                image,
                new PointF(size.x, size.y),
                1, true);
        Bitmap bitmap = BitmapStore.getBitmap(image);
        return bitmap;
    }

    @Override
    public void startview1() {
        ViewGame startview = new ViewGame(this,bitmap,size,this);
        setContentView(startview);
    }
}