package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
 int seekR, seekG, seekB;
SeekBar redSeekBar, greenSeekBar, blueSeekBar;
LinearLayout mScreen;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mScreen = (LinearLayout) findViewById(R.id.screen);
    redSeekBar = (SeekBar) findViewById(R.id.seekBar);
    greenSeekBar = (SeekBar) findViewById(R.id.seekBar2);
    blueSeekBar = (SeekBar) findViewById(R.id.seekBar3);
    updateBackground();

    redSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
    greenSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
    blueSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);

}

private SeekBar.OnSeekBarChangeListener seekBarChangeListener
= new SeekBar.OnSeekBarChangeListener()
{

@Override
public void onProgressChanged(SeekBar seekBar, int progress,
  boolean fromUser) {
// TODO Auto-generated method stub
 updateBackground();
}
@Override
public void onStartTrackingTouch(SeekBar seekBar) {
// TODO Auto-generated method stub
}

@Override
public void onStopTrackingTouch(SeekBar seekBar) {
// TODO Auto-generated method stub
}
};

private void updateBackground()
{
 seekR = redSeekBar.getProgress();
 seekG = greenSeekBar.getProgress();
 seekB = blueSeekBar.getProgress();
 mScreen.setBackgroundColor(
  0xff000000
  + seekR * 0x10000
  + seekG * 0x100
  + seekB
  );
}
}
