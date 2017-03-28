package edu.up.hw2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class RightWindow {

    protected float rightWindowXCor; // x-coord
    protected float rightWindowYCor; // y-coord
    protected Paint rightWindowPaint; // how the spot is drawn

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    private void setRightWindowColor() {
        int color = Color.rgb(red, green, blue);
        rightWindowPaint = new Paint();
        rightWindowPaint.setColor(color);
    }

    public void setRightWindowColor(int newColor) {
        rightWindowPaint.setColor(newColor);
    }

    public RightWindow() {
        // place a spot in a random location
        rightWindowXCor = 1000;
        rightWindowYCor = 200;
        setRightWindowColor();
    }

    public void draw(Canvas canvas) {
        // canvas.drawCircle(x, y, 300, chosenPaint);

        //RectF head = new RectF(headXCor, headYCor, headXCor + 300, headYCor + 300);
        //canvas.drawOval(head, headPaint);
    }
}