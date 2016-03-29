package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class NewsFeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_feed);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        ImageView iv;
        ImageView iv2;
        ImageView iv3;

        for (int i=1;i<=5;i++) {
            int ivd1 = getResources().getIdentifier("profilePhoto" + i, "id", "com.example.snipeswipe.pitchit2");
            int ivd2 = getResources().getIdentifier("likeImage" + i, "id", "com.example.snipeswipe.pitchit2");
            int ivd3 = getResources().getIdentifier("commentImage" + i, "id", "com.example.snipeswipe.pitchit2");

            iv = (ImageView) findViewById(ivd1);
            iv2 = (ImageView) findViewById(ivd2);
            iv3 = (ImageView) findViewById(ivd3);

            iv.setImageResource(R.drawable.sample);
            iv2.setImageResource(R.drawable.like);
            iv3.setImageResource(R.drawable.comment);

        }


    }

    public void searchStart(View view){
        Log.d("Test","Test");
        Intent intent = new Intent(NewsFeed.this, SearchPage.class);
        startActivity(intent);
    }


}
