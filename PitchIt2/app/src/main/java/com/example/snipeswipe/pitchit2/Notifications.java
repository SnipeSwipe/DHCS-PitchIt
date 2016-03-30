package com.example.snipeswipe.pitchit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifications);
//
        ImageView iv;
//        iv = (ImageView) findViewById(R.id.image1);
//        iv.setImageResource(R.drawable.sample);


        for (int i=1;i<=3;i++) {
            int ivd1 = getResources().getIdentifier("image" + i, "id", "com.example.snipeswipe.pitchit2");

            iv = (ImageView) findViewById(ivd1);
//            iv2 = (ImageView) findViewById(ivd2);
//            iv3 = (ImageView) findViewById(ivd3);

            iv.setImageResource(R.drawable.sample);
//            iv2.setImageResource(R.drawable.like);
//            iv3.setImageResource(R.drawable.comment);

        }
    }

    public void rowClick(View v){
        Toast.makeText(Notifications.this, "Test", Toast.LENGTH_SHORT).show();
    }


}
