package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OwnProfilePhotos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own_profile_photos);
    }

    public void addPhoto(View view){
        Intent intent = new Intent(OwnProfilePhotos.this, AddPhoto.class);
        startActivity(intent);

    }
}
