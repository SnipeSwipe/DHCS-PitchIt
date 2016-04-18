package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Profile3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile3);

        ImageView iv;
        iv = (ImageView) findViewById(R.id.profile_photo);
        iv.setImageResource(R.drawable.boy3);
//
        Button edit = (Button) findViewById(R.id.follow);
        edit.setTextColor(Color.parseColor("#ffffff"));
//
        iv = (ImageView) findViewById(R.id.ribbon);
        iv.setImageResource(R.drawable.scout_icon);

        iv = (ImageView) findViewById(R.id.photo1);
        iv.setImageResource(R.drawable.giroud1);

        iv = (ImageView) findViewById(R.id.photo2);
        iv.setImageResource(R.drawable.giroud2);

        iv = (ImageView) findViewById(R.id.photo3);
        iv.setImageResource(R.drawable.giroud3);

        iv = (ImageView) findViewById(R.id.photo4);
        iv.setImageResource(R.drawable.giroud5);

        iv = (ImageView) findViewById(R.id.video3);
        iv.setImageResource(R.drawable.giroud5);

        iv = (ImageView) findViewById(R.id.video4);
        iv.setImageResource(R.drawable.giroud4);

        iv = (ImageView) findViewById(R.id.video1);
        iv.setImageResource(R.drawable.giroud6);

        iv = (ImageView) findViewById(R.id.video2);
        iv.setImageResource(R.drawable.giroud7);

    }

    public void rowClick(View view){
        Toast.makeText(Profile3.this, "Feature Not Available", Toast.LENGTH_SHORT).show();
    }

    public void profClick(View view){
//        Toast.makeText(Profile.this, "", Toast.LENGTH_SHORT).show();
        Button button = (Button)findViewById(R.id.follow);
        button.setText("Followed");
    }

    public void photoClick(View view){
        Intent intent = new Intent(Profile3.this, ProfilePhotos.class);
        startActivity(intent);
    }

    public void videoClick(View view){
        Intent intent = new Intent(Profile3.this, ProfileVideos.class);
        startActivity(intent);
    }

    public void chatStart(View view){
        Intent intent = new Intent(Profile3.this, ChatTestActivity4.class);
        startActivity(intent);
    }
}
