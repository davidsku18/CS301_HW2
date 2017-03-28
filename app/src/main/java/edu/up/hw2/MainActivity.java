package edu.up.hw2;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Creates a GUI that lets the user change the color of the selected object
 * @author Kurtis Davidson
 * @version 03/28/2017
 */
public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    // GUI instance variables
    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;
    private TextView redVal;
    private TextView greenVal;
    private TextView blueVal;
    private TextView object;

    // the r, g, b values for the seekBars and setting the colors
    private int red;
    private int green;
    private int blue;

    // the selected object
    private int selectedObject;

    // the surface that things will be drawn upon
    MySurfaceView msv;

    // the maximum value for the seekBars
    protected final int MAX = 255;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize instance variables
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

        // locks orientation of the screen to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // sets the maximum value for the seekBars
        redSeekBar.setMax(MAX);
        greenSeekBar.setMax(MAX);
        blueSeekBar.setMax(MAX);

        // used for gesture detection
        msv.setOnTouchListener(this);
    }
    /**
     * SeekBar listener to change red value;
     */
    private class redSeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int redValue = progress;
            red = redValue;
            redVal.setText("" + redValue);
            if (selectedObject == 1) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.rect1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 2){
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 3) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 4) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle3.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 5) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle4.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 6) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.rect2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // not used
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // not used
        }
    }

    /**
     * SeekBar listener to change green value;
     */
    private class greenSeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int greenValue = progress;
            green = greenValue;
            greenVal.setText("" + greenValue);
            if (selectedObject == 1) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.rect1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 2){
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 3) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 4) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle3.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 5) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle4.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 6) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.rect2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // not used
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // not used
        }
    }

    /**
     * SeekBar listener to change blue value;
     */
    private class blueSeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int blueValue = progress;
            blue = blueValue;
            blueVal.setText("" + blueValue);
            if (selectedObject == 1) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.rect1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 2) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle1.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 3) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 4) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle3.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 5) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.circle4.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }
            else if (selectedObject == 6) {
                // sets the color of the selectedObject to the specified red, green, blue values
                msv.rect2.setColor(Color.rgb(red, green, blue));
                msv.invalidate();
            }

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // not used
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // not used
        }
    }

    /**
     * Listens to touch events and determines which object is being currently being selected
     *
     * @param v
     *          the view
     * @param event
     *          the motion event
     */
    public boolean onTouch(View v, MotionEvent event)
    {
        int x = (int)event.getX();
        int y = (int)event.getY();
        int currColor;

        if(msv.rect1.containsPoint(x,y))
        {
            // sets seekBars values to the current color of the selected object
            selectedObject = 1;
            object.setText("Rectangle 1");
            currColor = msv.rect1.getColor();
            redSeekBar.setProgress(Color.red(currColor));
            greenSeekBar.setProgress(Color.green(currColor));
            blueSeekBar.setProgress(Color.blue(currColor));
        }

        else if(msv.circle1.containsPoint(x,y))
        {
            // sets seekBars values to the current color of the selected object
            selectedObject = 2;
            object.setText("Circle 1");
            currColor = msv.circle1.getColor();
            redSeekBar.setProgress(Color.red(currColor));
            greenSeekBar.setProgress(Color.green(currColor));
            blueSeekBar.setProgress(Color.blue(currColor));
        }

        else if(msv.circle2.containsPoint(x,y))
        {
            // sets seekBars values to the current color of the selected object
            selectedObject = 3;
            object.setText("Circle 2");
            currColor = msv.circle2.getColor();
            redSeekBar.setProgress(Color.red(currColor));
            greenSeekBar.setProgress(Color.green(currColor));
            blueSeekBar.setProgress(Color.blue(currColor));
        }

        else if(msv.circle3.containsPoint(x,y))
        {
            // sets seekBars values to the current color of the selected object
            selectedObject = 4;
            object.setText("Circle 3");
            currColor = msv.circle3.getColor();
            redSeekBar.setProgress(Color.red(currColor));
            greenSeekBar.setProgress(Color.green(currColor));
            blueSeekBar.setProgress(Color.blue(currColor));
        }
        else if(msv.circle4.containsPoint(x,y))
        {
            // sets seekBars values to the current color of the selected object
            selectedObject = 5;
            object.setText("Circle 4");
            currColor = msv.circle4.getColor();
            redSeekBar.setProgress(Color.red(currColor));
            greenSeekBar.setProgress(Color.green(currColor));
            blueSeekBar.setProgress(Color.blue(currColor));
        }
        else if(msv.rect2.containsPoint(x,y))
        {
            // sets seekBars values to the current color of the selected object
            selectedObject = 6;
            object.setText("Rectangle 2");
            currColor = msv.rect2.getColor();
            redSeekBar.setProgress(Color.red(currColor));
            greenSeekBar.setProgress(Color.green(currColor));
            blueSeekBar.setProgress(Color.blue(currColor));
        }
        else
        {
            // sets seekBars to default 0, 0, 0 values if none of the object options are selected
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
