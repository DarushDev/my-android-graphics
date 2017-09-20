package com.example.myandroidgraphics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.race604.drawable.wave.WaveDrawable;

/**
 * Created by Lenovo Desktop on 9/20/2017.
 */

public class WaveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewWave);
        WaveDrawable mWaveDrawable = new WaveDrawable(getResources().getDrawable(R.mipmap.ic_launcher));
        mWaveDrawable.setWaveAmplitude(20);
        mWaveDrawable.setWaveLength(500);
        mWaveDrawable.setWaveSpeed(8);
        mWaveDrawable.setIndeterminate(true);
        //mWaveDrawable.setLevel(2000);
        imageView.setImageDrawable(mWaveDrawable);
    }
}
