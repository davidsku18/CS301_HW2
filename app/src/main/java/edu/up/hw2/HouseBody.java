package edu.up.hw2;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by Kurtis Davidson on 3/18/2017.
 */

public class HouseBody extends MainActivity{

    public static final int INIT_SIZE = 20;
    private int size = INIT_SIZE; // all spots begin at size 20
    protected float bodyXCor; // x-coord
    protected float bodyYCor; // y-coord

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    protected Paint bodyPaint; // how the spot is drawn

    private void setBodyColor() {
        int color = Color.rgb(red, green, blue);
        bodyPaint = new Paint();
        bodyPaint.setColor(color);
    }

    /** changes the body's color */
    public void setBodyColor(int newColor) {
        bodyPaint.setColor(newColor);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    /**
     * Makes a Duck object
     */
    public HouseBody() {
        // place a spot in a random location
        bodyXCor = 300;
        bodyYCor = 500;
        setBodyColor();
    }

    public void draw(Canvas canvas) {
        canvas.drawRect(bodyXCor, bodyYCor, 1200, 1200, bodyPaint);
    }

}