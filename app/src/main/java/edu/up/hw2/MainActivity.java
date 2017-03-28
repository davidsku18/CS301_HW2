package edu.up.hw2;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;
    private TextView redVal;
    private TextView greenVal;
    private TextView blueVal;
    private TextView object;

    private int red;
    private int green;
    private int blue;

    private int selectedObject;

    MySurfaceView msv;

    protected final int MAX = 255;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.msv = (MySurfaceView) this.findViewById(R.id.theSurfaceView);

        object = (TextView)findViewById(R.id.object);

        redSeekBar = (SeekBar)findViewById(R.id.redSeekBar);
        greenSeekBar= (SeekBar)findViewById(R.id.greenSeekbar);
        blueSeekBar = (SeekBar)findViewById(R.id.blueSeekBar);

        redVal = (TextView)findViewById(R.id.redVal);
        greenVal = (TextView)findViewById(R.id.greenVal);
        blueVal = (TextView)findViewById(R.id.blueVal);

        redSeekBar.setOnSeekBarChangeListener(new redSeekBarListener());
        greenSeekBar.setOnSeekBarChangeListener(new greenSeekBarListener());
        blueSeekBar.setOnSeekBarChangeListener(new blueSeekBarListener());

        redSeekBar.setMax(MAX);
        greenSeekBar.setMax(MAX);
        blueSeekBar.setMax(MAX);
        msv.setOnTouchListener(this);
    }
    /**
     * Seekbar listener to change red value;
     */
    private class redSeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int redValue = progress;
            red = redValue;
            redVal.setText("" + redValue);
            if (selectedObject == 1) {
                msv.rect1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 2){
                msv.circle1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 3) {
                msv.circle2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 4) {
                msv.circle3.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 5) {
                msv.circle4.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 6) {
                msv.rect2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    /**
     * Seekbar listener to change green value;
     */
    private class greenSeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int greenValue = progress;
            green = greenValue;
            greenVal.setText("" + greenValue);
            if (selectedObject == 1) {
                msv.rect1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 2){
                msv.circle1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 3) {
                msv.circle2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 4) {
                msv.circle3.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 5) {
                msv.circle4.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 6) {
                msv.rect2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    /**
     * Seekbar listener to change blue value;
     */
    private class blueSeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int blueValue = progress;
            blue = blueValue;
            blueVal.setText("" + blueValue);
            if (selectedObject == 1) {
                msv.rect1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 2) {
                msv.circle1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 3) {
                msv.circle2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 4) {
                msv.circle3.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 5) {
                msv.circle4.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 6) {
                msv.rect2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    public boolean onTouch(View v, MotionEvent event)
    {
        int x = (int)event.getX();
        int y = (int)event.getY();
        int currentColor;

        if(msv.rect1.containsPoint(x,y))
        {
            selectedObject = 1;
            object.setText("Rectangle 1");
            currentColor = msv.rect1.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));
        }

        else if(msv.circle1.containsPoint(x,y))
        {
            selectedObject = 2;
            object.setText("Circle 1");
            currentColor = msv.circle1.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));
        }

        else if(msv.circle2.containsPoint(x,y))
        {
            selectedObject = 3;
            object.setText("Circle 2");
            currentColor = msv.circle2.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));
        }

        else if(msv.circle3.containsPoint(x,y))
        {
            selectedObject = 4;
            object.setText("Circle 3");
            currentColor = msv.circle3.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));
        }
        else if(msv.circle4.containsPoint(x,y))
        {
            selectedObject = 5;
            object.setText("Circle 4");
            currentColor = msv.circle4.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));
        }
        else if(msv.rect2.containsPoint(x,y))
        {
            selectedObject = 6;
            object.setText("Rectangle 2");
            currentColor = msv.rect2.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));
        }
        else
        {
            selectedObject = 0;
            object.setText("No Element Selected");
            redSeekBar.setProgress(0);
            greenSeekBar.setProgress(0);
            blueSeekBar.setProgress(0);
            msv.invalidate();
        }
        return true;
    }
}
