package edu.up.hw2;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Kurtis Davidson on 3/18/2017.
 */

public class Duck extends MainActivity{

    public static final int INIT_SIZE = 20;
    private int size = INIT_SIZE; // all spots begin at size 20
    protected float x; // x-coord
    protected float y; // y-coord
    private int circlXCor;
    private int CirclYCor;
    protected float vx;
    protected float vy;
    protected Paint chosenPaint; // how the spot is drawn

    private void setColor() {
        int color = Color.rgb((int) (MainActivity.red), (int) (MainActivity.green), (int) (MainActivity.blue));
        chosenPaint = new Paint();
        chosenPaint.setColor(color);
    }

    /** changes the spot's color */
    public void setColor(int newColor) {
        chosenPaint.setColor(newColor);
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
    public Duck() {
        // place a spot in a random location
        x = 900;
        y = 300;
        setColor();
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(x, y, 300, chosenPaint);
    }
}