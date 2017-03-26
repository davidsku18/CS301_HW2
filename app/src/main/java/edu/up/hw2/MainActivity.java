package edu.up.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;
    private TextView redVal;
    private TextView greenVal;
    private TextView blueVal;
    private int red;
    private int green;
    private int blue;

    // This is the duck
    Duck duck;

    protected final int MAX = 255;
    protected final int MIN = 0;
    protected final int STEP = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redSeekBar = (SeekBar)findViewById(R.id.redSeekBar);
        greenSeekBar= (SeekBar)findViewById(R.id.greenSeekbar);
        blueSeekBar = (SeekBar)findViewById(R.id.blueSeekBar);

        redVal = (TextView)findViewById(R.id.redVal);
        greenVal = (TextView)findViewById(R.id.greenVal);
        blueVal = (TextView)findViewById(R.id.blueVal);

        redSeekBar.setOnSeekBarChangeListener(new redSeekBarListener());
        greenSeekBar.setOnSeekBarChangeListener(new greenSeekBarListener());
        blueSeekBar.setOnSeekBarChangeListener(new blueSeekBarListener());

        redSeekBar.setMax((MAX-MIN)/STEP);
        greenSeekBar.setMax((MAX-MIN)/STEP);
        blueSeekBar.setMax((MAX-MIN)/STEP);
    }
    /**
     * Seekbar listener to change red value;
     */
    private class redSeekBarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int redValue = MIN + progress;
            red = redValue;
            redVal.setText("" + redValue);
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
            int greenValue = MIN + progress;
            green = greenValue;
            greenVal.setText("" + greenValue);
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
            int blueValue = MIN + progress;
            blue = blueValue;
            blueVal.setText("" + blueValue);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}
