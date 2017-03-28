package edu.up.hw2;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
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
    public static int red;
    public static int green;
    public static int blue;

    MySurfaceView msv;

    // This is the house body
    HouseBody houseBody;
    // This is the house's left window
    LeftWindow leftWindow;
    // This is the house's right window
    RightWindow rightWindow;
    // This is the house's roof
    Roof roof;

    protected final int MAX = 255;
    protected final int MIN = 0;
    protected final int STEP = 1;

    private int defTargetSize = houseBody.INIT_SIZE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.msv = (MySurfaceView) this.findViewById(R.id.theSurfaceView);
        initDuck();

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
            msv.invalidate();
            initDuck();
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
            msv.invalidate();
            initDuck();
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
            msv.invalidate();
            initDuck();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    /**
     *
     *
     */
    protected void initDuck() {
        houseBody = new HouseBody();
        leftWindow = new LeftWindow();
        rightWindow = new RightWindow();
        roof = new Roof();
        msv.setHouseBody(houseBody);
        msv.setLeftWindow(leftWindow);
        msv.setRightWindow(rightWindow);
        msv.setRoof(roof);
        msv.invalidate();
    }


    public boolean onTouch(View v, MotionEvent event)
    {
        int x = (int)event.getX();
        int y = (int)event.getY();
        int currentColor;
        int newColor;

        if(msv.body.containsPoint(x,y))
        {
            object.setText("House Body");
            currentColor = msv.body.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));
            msv.body.setColor(Color.rgb(red,green,blue));
            newColor = msv.body.getColor();
            redSeekBar.setProgress(Color.red(newColor));
            greenSeekBar.setProgress(Color.green(newColor));
            blueSeekBar.setProgress(Color.blue(newColor));
            msv.body.setColor(Color.rgb(red,green,blue));

            msv.invalidate();
        }
        /*
        else if(topRight.containsPoint(x,y))
        {
            object.setText("Right Window");
            currentColor = topRight.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));

            topRight.setColor(Color.rgb(newRed,newGreen,newBlue));
            msv.invalidate();
        }
        else if(bottomLeft.containsPoint(x,y))
        {
            object.setText("Left Window");
            currentColor = bottomLeft.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));

            bottomLeft.setColor(Color.rgb(newRed,newGreen,newBlue));
            msv.invalidate();

        }
        else if(bottomRight.containsPoint(x,y))
        {
            object.setText("Roof");
            currentColor = bottomRight.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));

            bottomRight.setColor(Color.rgb(newRed,newGreen,newBlue));
            msv.invalidate();

        }
        else if(midLeft.containsPoint(x,y))
        {
            object.setText("Middle Left Circle");
            currentColor = midLeft.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));

            midLeft.setColor(Color.rgb(newRed,newGreen,newBlue));
            msv.invalidate();
        }
        else if(midRight.containsPoint(x,y))
        {
            object.setText("Middle Right Circle");
            currentColor = midRight.getColor();
            redSeekBar.setProgress(Color.red(currentColor));
            greenSeekBar.setProgress(Color.green(currentColor));
            blueSeekBar.setProgress(Color.blue(currentColor));

            midRight.setColor(Color.rgb(newRed,newGreen,newBlue));
            msv.invalidate();
        }
        */
        else
        {
            object.setText("No Element Selected");
            redSeekBar.setProgress(0);
            greenSeekBar.setProgress(0);
            blueSeekBar.setProgress(0);
            msv.invalidate();
        }
        return true;
    }


}
