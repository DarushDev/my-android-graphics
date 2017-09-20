package com.example.myandroidgraphics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import tyrantgit.explosionfield.ExplosionField;

/**
 * Created by Lenovo Desktop on 9/20/2017.
 */

public class ExplosionActivity extends AppCompatActivity{

    ImageButton imageButton1;
    private ExplosionField mExplosionField;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explosion);

        imageButton1 = (ImageButton) findViewById(R.id.imageButton1);

        addListener(findViewById(R.id.root));
        mExplosionField = ExplosionField.attach2Window(this);

    }

    private void addListener(View root) {
        if (root instanceof ViewGroup) {
            ViewGroup parent = (ViewGroup) root;
            for (int i = 0; i < parent.getChildCount(); i++) {
                addListener(parent.getChildAt(i));
            }
        } else {
            root.setClickable(true);
            root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mExplosionField.explode(v);
                    v.setOnClickListener(null);
                }
            });
        }
    }
}
