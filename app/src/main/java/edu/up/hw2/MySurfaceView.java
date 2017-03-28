package edu.up.hw2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.SeekBar;

/**
 External Citation
 Date:    18 March 2017
 Problem: Couldn't implement SurfaceView Correctly
 Resource: DooDadDemo
 @author Andrew Nuxoll
 Solution: I used example code from this Demo
 */

public class MySurfaceView extends SurfaceView{

    CustomRect rect1 = new CustomRect("rect1", Color.RED, 300, 500, 1200, 1200);
    CustomCircle circle1 = new CustomCircle("circle1", Color.BLUE, 400, 200, 100);
    CustomCircle circle2 = new CustomCircle("circle1", Color.BLUE, 600, 200, 100);

    private void init(){
        setWillNotDraw(false);
    }

    public MySurfaceView(Context context) {
        super(context);
        init();
    }

    public MySurfaceView(Context context,
                         AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MySurfaceView(Context context,
                         AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void setRect1(CustomRect rect) {
        if (rect != null) {
            this.rect1 = rect;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        rect1.drawMe(canvas);
        circle1.drawMe(canvas);
        circle2.drawMe(canvas);
    }
}