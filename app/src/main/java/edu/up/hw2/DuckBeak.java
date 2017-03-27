package edu.up.hw2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by kurtisdavidson on 3/26/17.
 */

public class DuckBeak {

    protected float beakXCor; // x-coord
    protected float beakYCor; // y-coord
    protected Paint beakPaint; // how the spot is drawn
    private float width = 800;
    private float height = 700;

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    private void setBeakColor() {
        int color = Color.rgb(red, green, blue);
        beakPaint = new Paint();
        beakPaint.setColor(color);
    }

    public void setBeakColor(int newColor) {
        beakPaint.setColor(newColor);
    }

    public DuckBeak() {
        // place a spot in a random location
        beakXCor = 600;
        beakYCor = 200;
        setBeakColor();
    }

    public void draw(Canvas canvas) {

    }
}