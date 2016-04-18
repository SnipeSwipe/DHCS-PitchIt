package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SearchResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        ImageView iv, iv2;

//        iv= (ImageView)findViewById(R.id.image1);
//        iv.setImageResource(R.drawable.boy2);
//
//        iv= (ImageView)findViewById(R.id.image2);
//        iv.setImageResource(R.drawable.girl2);

        int j=1;

        for (int i=1;i<=7;i++) {
            int ivd1 = getResources().getIdentifier("image" + i, "id", "com.example.snipeswipe.pitchit2");
            int ivd2 = getResources().getIdentifier("ribbon" + i, "id", "com.example.snipeswipe.pitchit2");
//            int ivd3 = getResources().getIdentifier("commentImage" + i, "id", "com.example.snipeswipe.pitchit2");

            iv = (ImageView) findViewById(ivd1);
            iv2 = (ImageView) findViewById(ivd2);
//            iv3 = (ImageView) findViewById(ivd3);

            if(i==1){
                iv.setImageResource(R.drawable.boy2);
                iv2.setImageResource(R.drawable.scout_icon);
            }
            if(i==2){
                iv.setImageResource(R.drawable.girl2);
                iv2.setImageResource(R.drawable.player_icon);
            }
            if(i==3){
                iv.setImageResource(R.drawable.boy3);
                iv2.setImageResource(R.drawable.scout_icon);
            }
            if(i==4){
                iv.setImageResource(R.drawable.aman);
                iv2.setImageResource(R.drawable.player_icon);
            }
            if(i==5){
                iv.setImageResource(R.drawable.giroud6);
                iv2.setImageResource(R.drawable.player_icon);
            }
            if(i==6){
                iv.setImageResource(R.drawable.giroud2);
                iv2.setImageResource(R.drawable.player_icon);
            }
            if(i==7){
                iv.setImageResource(R.drawable.giroud1);
                iv2.setImageResource(R.drawable.player_icon);
            }

            j++;

        }
    }

    public void profStart(View view){
        Intent intent = new Intent(SearchResults.this, Profile.class);
        startActivity(intent);
    }

    public void profStart2(View view){
        Intent intent = new Intent(SearchResults.this, Profile2.class);
        startActivity(intent);
    }
    public void profStart3(View view){
        Intent intent = new Intent(SearchResults.this, Profile3.class);
        startActivity(intent);
    }
    public void profStart4(View view){
        Intent intent = new Intent(SearchResults.this, Profile4.class);
        startActivity(intent);
    }
    public void profStart5(View view){
        Intent intent = new Intent(SearchResults.this, Profile5.class);
        startActivity(intent);
    }
    public void profStart6(View view){
        Intent intent = new Intent(SearchResults.this, Profile6.class);
        startActivity(intent);
    }
    public void profStart7(View view){
        Intent intent = new Intent(SearchResults.this, Profile7.class);
        startActivity(intent);
    }


    public void rowClick(View view){
        Toast.makeText(SearchResults.this, "Feature not Available", Toast.LENGTH_SHORT).show();
    }
}
