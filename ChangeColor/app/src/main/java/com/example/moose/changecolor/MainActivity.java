package com.example.moose.changecolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
     public TextView colorpan;
     public SeekBar redbar,greenbar,bluebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorpan =findViewById(R.id.colorpan);
        redbar =findViewById(R.id.redbar);
        greenbar=findViewById(R.id.greenbar);
        bluebar=findViewById(R.id.bluebar);
        redbar.setOnSeekBarChangeListener(this);
        greenbar.setOnSeekBarChangeListener(this);
        bluebar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int red=redbar.getProgress();
        int green=greenbar.getProgress();
        int blue=bluebar.getProgress();
        colorpan.setBackgroundColor(Color.rgb(red,green,blue));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
