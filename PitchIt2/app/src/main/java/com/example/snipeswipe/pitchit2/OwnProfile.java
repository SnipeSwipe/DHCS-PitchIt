package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class OwnProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own_profile);

        ImageView iv;
        iv = (ImageView) findViewById(R.id.profile_photo);
        iv.setImageResource(R.drawable.sample);

        iv = (ImageView) findViewById(R.id.ribbon);
        iv.setImageResource(R.drawable.like);
    }

    public void searchStart(View v) {
        Log.d("Test", "Test");
        Intent intent = new Intent(OwnProfile.this, EditProfile.class);
        startActivity(intent);
    }

}
