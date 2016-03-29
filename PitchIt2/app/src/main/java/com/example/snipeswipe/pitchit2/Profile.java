package com.example.snipeswipe.pitchit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView iv;
        iv = (ImageView) findViewById(R.id.profile_photo);
        iv.setImageResource(R.drawable.sample);

        iv = (ImageView) findViewById(R.id.ribbon);
        iv.setImageResource(R.drawable.like);
    }
}
