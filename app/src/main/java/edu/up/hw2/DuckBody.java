package edu.up.hw2;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by Kurtis Davidson on 3/18/2017.
 */

public class DuckBody extends MainActivity{

    public static final int INIT_SIZE = 20;
    private int size = INIT_SIZE; // all spots begin at size 20
    protected float bodyXCor; // x-coord
    protected float bodyYCor; // y-coord
    protected float beakXCor; // x-coord
    protected float beakYCor; // y-coord

    private float width = 800;
    private float height = 700;

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    protected Paint bodyPaint; // how the spot is drawn
    protected Paint headPaint; // how the spot is drawn
    protected Paint beakPaint; // how the spot is drawn

    private void setBodyColor() {
        int color = Color.rgb(red, green, blue);
        bodyPaint = new Paint();
        bodyPaint.setColor(color);
    }

    private void setBeakColor() {
        int color = Color.rgb(red, green, blue);
        beakPaint = new Paint();
        beakPaint.setColor(color);
    }

    /** changes the body's color */
    public void setBodyColor(int newColor) {
        bodyPaint.setColor(newColor);
    }

    public void setBeakColor(int newColor) {
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
    public DuckBody() {
        // place a spot in a random location
        bodyXCor = 300;
        bodyYCor = 400;
        setBodyColor();
    }

    public void draw(Canvas canvas) {
        // canvas.drawCircle(x, y, 300, chosenPaint);

        RectF body = new RectF(bodyXCor, bodyYCor, bodyXCor + 800, bodyYCor + 700);
        canvas.drawOval(body, bodyPaint);
    }

}