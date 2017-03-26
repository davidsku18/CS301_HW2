package edu.up.hw2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Kurtis Davidson on 3/18/2017.
 */

public class Duck {

    protected float x; // x-coord
    protected float y; // y-coord
    private int circlXCor;
    private int CirclYCor;
    protected float vx;
    protected float vy;
    protected Paint myPaint; // how the spot is drawn

    protected void setRandomPaint() {
        int color = Color.rgb((int) (Math.random() * 256),
                (int) (Math.random() * 256), (int) (Math.random() * 256));
        myPaint = new Paint();
        myPaint.setColor(color);
    }

    public Duck() {
        // place a spot in a random location
        x = 900;
        y = 200;
        setRandomPaint();
    }


    public void setColor(int newColor) {
        myPaint.setColor(newColor);
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(x,y, 200, myPaint);
    }
}