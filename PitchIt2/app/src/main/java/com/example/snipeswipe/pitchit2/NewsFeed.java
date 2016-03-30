package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NewsFeed extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_feed);

        Button ach =(Button) findViewById(R.id.add_achievement);
        Button pho =(Button) findViewById(R.id.add_photo);
        Button vid =(Button) findViewById(R.id.add_video);



        ach.setTextColor(Color.parseColor("#FFFFFF"));
        pho.setTextColor(Color.parseColor("#FFFFFF"));
        vid.setTextColor(Color.parseColor("#FFFFFF"));



        ImageView iv;
        ImageView iv2;
        ImageView iv3;

        int j=1;

        for (int i=1;i<=5;i++) {
            int ivd1 = getResources().getIdentifier("profilePhoto" + i, "id", "com.example.snipeswipe.pitchit2");
            int ivd2 = getResources().getIdentifier("likeImage" + i, "id", "com.example.snipeswipe.pitchit2");
            int ivd3 = getResources().getIdentifier("commentImage" + i, "id", "com.example.snipeswipe.pitchit2");

            iv = (ImageView) findViewById(ivd1);
            iv2 = (ImageView) findViewById(ivd2);
            iv3 = (ImageView) findViewById(ivd3);

            if(j%2==1) {
                iv.setImageResource(R.drawable.boy);
            }
//            if(j==2) {
//                iv.setImageResource(R.drawable.girl);
//            }
//            if(j==4) {
//                iv.setImageResource(R.drawable.boy3);
//            }
            else {
                iv.setImageResource(R.drawable.boy2);
            }

            j++;

            iv2.setImageResource(R.drawable.like);
            iv3.setImageResource(R.drawable.comment);

        }


    }

    public void searchStart(View view){
        Log.d("Test", "Test");
        Intent intent = new Intent(NewsFeed.this, SearchPage.class);
        startActivity(intent);
    }


}
