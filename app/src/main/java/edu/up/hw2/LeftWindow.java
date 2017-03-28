package edu.up.hw2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by kurtisdavidson on 3/26/17.
 */

public class LeftWindow {

    protected float leftWindowXCor; // x-coord
    protected float leftWindowYCor; // y-coord
    protected Paint leftWindowPaint; // how the spot is drawn

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    private void setLeftWindowColor() {
        int color = Color.rgb(red, green, blue);
        leftWindowPaint = new Paint();
        leftWindowPaint.setColor(color);
    }

    public void setLeftWindowColor(int newColor) {
        leftWindowPaint.setColor(newColor);
    }

    public LeftWindow() {
        // place a spot in a random location
        leftWindowXCor = 1000;
        leftWindowYCor = 200;
        setLeftWindowColor();
    }

    public void draw(Canvas canvas) {
        // canvas.drawCircle(x, y, 300, chosenPaint);

        //RectF head = new RectF(headXCor, headYCor, headXCor + 300, headYCor + 300);
        //canvas.drawOval(head, headPaint);
    }
}
