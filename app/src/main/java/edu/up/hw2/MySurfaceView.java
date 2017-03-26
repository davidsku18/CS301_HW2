package edu.up.hw2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 External Citation
 Date:    18 March 2017
 Problem: Couldn't implement SurfaceView Correctly
 Resource: DooDadDemo
 @author Andrew Nuxoll
 Solution: I used example code from this Demo
 */

public class MySurfaceView extends SurfaceView {

    private SurfaceHolder surfaceHolder;
    private Bitmap bmpIcon;

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

    private void init(){
        surfaceHolder = getHolder();
        bmpIcon = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher);
        surfaceHolder.addCallback(new SurfaceHolder.Callback(){

            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                Canvas canvas = holder.lockCanvas(null);
                drawSomething(canvas);
                holder.unlockCanvasAndPost(canvas);
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder,
                                       int format, int width, int height) {
                // TODO Auto-generated method stub

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                // TODO Auto-generated method stub

            }});
    }

    protected void drawSomething(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
        canvas.drawBitmap(bmpIcon,
                getWidth()/2, getHeight()/2, null);
    }


}