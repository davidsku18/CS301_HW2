package edu.up.hw2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;

/**
 * Created by kurtisdavidson on 3/26/17.
 */

public class Roof {

    protected float roofAXCor; // x-coord
    protected float roofAYCor; // y-coord
    protected float roofBXCor; // x-coord
    protected float roofBYCor; // y-coord
    protected float roofCXCor; // x-coord
    protected float roofCYCor; // y-coord

    protected Paint roofPaint; // how the spot is drawn
    private float width = 800;
    private float height = 700;

    int red = MainActivity.red;
    int green = MainActivity.green;
    int blue = MainActivity.blue;

    private void setRoofColor() {
        int color = Color.rgb(red, green, blue);
        roofPaint = new Paint();
        roofPaint.setColor(color);
    }

    public void setRoofColor(int newColor) {
        roofPaint.setColor(newColor);
    }

    public Roof() {
        // place a spot in a random location
        roofAXCor = 600;
        roofAYCor = 200;
        roofBXCor = 900;
        roofBYCor = 200;
        roofCXCor = 1500;
        roofCYCor = 500;
        setRoofColor();
    }

    public void draw(Canvas canvas) {
        roofPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        roofPaint.setAntiAlias(true);

        Point a = new Point(300, 500);
        Point b = new Point(900, 200);
        Point c = new Point(1800, 500);

        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        path.close();

        canvas.drawPath(path, roofPaint);
    }
}