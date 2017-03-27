package edu.up.hw2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by kurtisdavidson on 3/26/17.
 */

public class DuckHead {


    protected float headXCor; // x-coord
    protected float headYCor; // y-coord
    protected Paint headPaint; // how the spot is drawn
    private float width = 800;
    private float height = 700;

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    private void setHeadColor() {
        int color = Color.rgb(red, green, blue);
        headPaint = new Paint();
        headPaint.setColor(color);
    }

    public void setHeadColor(int newColor) {
        headPaint.setColor(newColor);
    }

    public DuckHead() {
        // place a spot in a random location
        headXCor = 600;
        headYCor = 200;
        setHeadColor();
    }

    public void draw(Canvas canvas) {
        // canvas.drawCircle(x, y, 300, chosenPaint);

        RectF head = new RectF(headXCor, headYCor, headXCor + width, headYCor + height);
        canvas.drawOval(head, headPaint);
    }
}
