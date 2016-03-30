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
import android.widget.TextView;
import android.widget.Toast;

public class NewsFeed extends AppCompatActivity {

    TextView[] likes = new TextView[5];
    String[] likeValue = new String[5];
    ImageView[] likeButton = new ImageView[5];


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
            else {
                iv.setImageResource(R.drawable.boy2);
            }

            j++;

            iv2.setImageResource(R.drawable.like);
            iv3.setImageResource(R.drawable.comment);

        }

        likes[0] = (TextView)findViewById(R.id.likeValue1);
        likes[1] = (TextView)findViewById(R.id.likeValue2);
        likes[2] = (TextView)findViewById(R.id.likeValue3);
        likes[3] = (TextView)findViewById(R.id.likeValue4);
        likes[4] = (TextView)findViewById(R.id.likeValue5);

        likeButton[0] = (ImageView)findViewById(R.id.likeImage1);
        likeButton[1] = (ImageView)findViewById(R.id.likeImage2);
        likeButton[2] = (ImageView)findViewById(R.id.likeImage3);
        likeButton[3] = (ImageView)findViewById(R.id.likeImage4);
        likeButton[4] = (ImageView)findViewById(R.id.likeImage5);


        likeButton[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                likeValue[0] = likes[0].getText().toString();

                int x = Integer.parseInt(likeValue[0]);
                x++;
                likes[0].setText(String.valueOf(x));
            }

        });

        likeButton[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                likeValue[1] = likes[1].getText().toString();

                int x = Integer.parseInt(likeValue[1]);
                x++;
                likes[1].setText(String.valueOf(x));
            }

        });
        likeButton[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                likeValue[2] = likes[2].getText().toString();

                int x = Integer.parseInt(likeValue[2]);
                x++;
                likes[2].setText(String.valueOf(x));
            }

        });
        likeButton[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                likeValue[3] = likes[3].getText().toString();

                int x = Integer.parseInt(likeValue[3]);
                x++;
                likes[3].setText(String.valueOf(x));
            }

        });
        likeButton[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                likeValue[4] = likes[4].getText().toString();

                int x = Integer.parseInt(likeValue[4]);
                x++;
                likes[4].setText(String.valueOf(x));
            }

        });

    }

    public void searchStart(View view){
        Log.d("Test", "Test");
        Intent intent = new Intent(NewsFeed.this, SearchPage.class);
        startActivity(intent);
    }

    public void photStart(View view){
        Intent intent = new Intent(NewsFeed.this, AddPhoto.class);
        startActivity(intent);
    }

    public void rowClick(View v){
        Toast.makeText(NewsFeed.this, "Click Not Implemented", Toast.LENGTH_SHORT).show();
    }
}
