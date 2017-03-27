package edu.up.hw2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
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

    private DuckBody myDuckBody = new DuckBody();
    private DuckHead myDuckHead = new DuckHead();
    private DuckBeak myDuckBeak = new DuckBeak();
    private DuckLegs myDuckLegs = new DuckLegs();

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

    public void setDuckBody(DuckBody newDuck) {
        if (newDuck != null) {
            this.myDuckBody = newDuck;
        }
    }

    public void setDuckHead(DuckHead newDuck) {
        if (newDuck != null) {
            this.myDuckHead = newDuck;
        }
    }

    public void setDuckBeak(DuckBeak newDuck) {
        if (newDuck != null) {
            this.myDuckBeak = newDuck;
        }
    }

    public void setDuckLegs(DuckLegs newDuck) {
        if (newDuck != null) {
            this.myDuckLegs = newDuck;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        myDuckBody.draw(canvas);
        myDuckHead.draw(canvas);
        myDuckBeak.draw(canvas);
        myDuckLegs.draw(canvas);
    }

}