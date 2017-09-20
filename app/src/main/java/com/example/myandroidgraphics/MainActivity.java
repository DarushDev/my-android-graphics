package com.example.myandroidgraphics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnWave, btnShimmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWave = (Button) findViewById(R.id.btnWave);
        btnShimmer = (Button) findViewById(R.id.btnShimmer);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnWave:

                break;
            case R.id.btnShimmer:

                break;
        }
    }
}
