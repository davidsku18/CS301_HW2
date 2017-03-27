package edu.up.hw2;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Kurtis Davidson on 3/18/2017.
 */

public class Duck extends MainActivity{

    protected float x; // x-coord
    protected float y; // y-coord
    private int circlXCor;
    private int CirclYCor;
    protected float vx;
    protected float vy;
    protected Paint chosenPaint; // how the spot is drawn

    private void createColor() {
        int color = Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        chosenPaint = new Paint();
        chosenPaint.setColor(color);
    }

    public Duck() {
        // place a spot in a random location
        x = 0;
        y = 0;
        createColor();
    }

    public void setColor(int newColor) {
        chosenPaint.setColor(newColor);
    }

    public void draw(Canvas canvas) {

        canvas.drawCircle(x,y, 200, chosenPaint);
    }
}