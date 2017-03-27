package edu.up.hw2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by kurtisdavidson on 3/26/17.
 */

public class DuckLegs {


    protected float legsXCor; // x-coord
    protected float legsYCor; // y-coord
    protected Paint legsPaint; // how the spot is drawn
    private float width = 800;
    private float height = 700;

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    private void setLegsColor() {
        int color = Color.rgb(red, green, blue);
        legsPaint = new Paint();
        legsPaint.setColor(color);
    }

    public void setLegsColor(int newColor) {
        legsPaint.setColor(newColor);
    }

    public DuckLegs() {
        // place a spot in a random location
        legsXCor = 600;
        legsYCor = 200;
        setLegsColor();
    }

    public void draw(Canvas canvas) {
        canvas.drawRect(400, 800, 70, 60, legsPaint);
    }
}