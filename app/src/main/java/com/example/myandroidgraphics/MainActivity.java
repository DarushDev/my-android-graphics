package com.example.myandroidgraphics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnWave, btnShimmer, btnExplode;
    public static final String TAG = "mytag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWave = (Button) findViewById(R.id.btnWave);
        btnShimmer = (Button) findViewById(R.id.btnShimmer);
        btnExplode = (Button) findViewById(R.id.btnExplode);


        btnWave.setOnClickListener(this);
        btnShimmer.setOnClickListener(this);
        btnExplode.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.btnWave:
                i = new Intent(MainActivity.this, WaveActivity.class);
                startActivity(i);
                break;
            case R.id.btnShimmer:
                i = new Intent(MainActivity.this, ShimmerActivity.class);
                startActivity(i);
                break;
            case R.id.btnExplode:
                i = new Intent(MainActivity.this, ExplosionActivity.class);
                startActivity(i);
                break;
        }
    }
}
