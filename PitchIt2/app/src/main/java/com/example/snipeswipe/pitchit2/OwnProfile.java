package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class OwnProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own_profile);

        ImageView iv;
        iv = (ImageView) findViewById(R.id.profile_photo);
        iv.setImageResource(R.drawable.girl);

        Button edit = (Button) findViewById(R.id.editButton);
        edit.setTextColor(Color.parseColor("#ffffff"));

        iv = (ImageView) findViewById(R.id.ribbon);
        iv.setImageResource(R.drawable.player_icon);

        iv = (ImageView) findViewById(R.id.photo1);
        iv.setImageResource(R.drawable.girl_prof1);

        iv = (ImageView) findViewById(R.id.photo2);
        iv.setImageResource(R.drawable.girl_prof2);

        iv = (ImageView) findViewById(R.id.photo3);
        iv.setImageResource(R.drawable.girl_prof3);

        iv = (ImageView) findViewById(R.id.photo4);
        iv.setImageResource(R.drawable.girl_prof4);

        iv = (ImageView) findViewById(R.id.video3);
        iv.setImageResource(R.drawable.girl_prof1);

        iv = (ImageView) findViewById(R.id.video4);
        iv.setImageResource(R.drawable.girl_prof2);

        iv = (ImageView) findViewById(R.id.video1);
        iv.setImageResource(R.drawable.girl_prof3);

        iv = (ImageView) findViewById(R.id.video2);
        iv.setImageResource(R.drawable.girl_prof4);



    }

    public void searchStart(View v) {
        Log.d("Test", "Test");
        Intent intent = new Intent(OwnProfile.this, EditProfile.class);
        startActivity(intent);
    }

    public void photoClick(View v){
        Intent intent = new Intent(OwnProfile.this, OwnProfilePhotos.class);
        startActivity(intent);
    }

    public void videoClick(View v){
        Intent intent = new Intent(OwnProfile.this, OwnProfileVideos.class);
        startActivity(intent);
    }

    public void rowClick(View view){
        Toast.makeText(OwnProfile.this, "Feature Not Available", Toast.LENGTH_SHORT).show();
    }

}
