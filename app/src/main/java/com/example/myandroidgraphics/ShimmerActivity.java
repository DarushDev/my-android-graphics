package com.example.myandroidgraphics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.shimmer.ShimmerFrameLayout;

import static com.facebook.shimmer.ShimmerFrameLayout.MaskShape.RADIAL;

/**
 * Created by Lenovo Desktop on 9/20/2017.
 */

public class ShimmerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimmer);

        ShimmerFrameLayout container = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
        container.setDuration(2000);
        container.setAlpha(1f);
        container.setRepeatMode(2);
        container.setMaskShape(RADIAL);
        container.setAngle(ShimmerFrameLayout.MaskAngle.CW_270);
        container.setDropoff(0.5f);
        container.setIntensity(0f);
        container.setTilt(180);
        container.setFixedHeight(2000);
        container.startShimmerAnimation();
    }
}
