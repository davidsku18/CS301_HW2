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

    CustomRect body = new CustomRect("hosueBody", Color.BLACK, 300, 500, 1500, 1700);
    private HouseBody myHouseBody = new HouseBody();
    private LeftWindow myLeftWindow = new LeftWindow();
    private RightWindow myRightWindow = new RightWindow();
    private Roof myRoof = new Roof();

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

    public void setHouseBody(HouseBody newHouse) {
        if (newHouse != null) {
            this.myHouseBody = newHouse;
        }
    }

    public void setLeftWindow(LeftWindow newDuck) {
        if (newDuck != null) {
            this.myLeftWindow = newDuck;
        }
    }

    public void setRightWindow(RightWindow newDuck) {
        if (newDuck != null) {
            this.myRightWindow = newDuck;
        }
    }

    public void setRoof(Roof newDuck) {
        if (newDuck != null) {
            this.myRoof = newDuck;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawColor(Color.WHITE);
        myHouseBody.draw(canvas);
        myRightWindow.draw(canvas);
        myLeftWindow.draw(canvas);
        myRoof.draw(canvas);

    }

}