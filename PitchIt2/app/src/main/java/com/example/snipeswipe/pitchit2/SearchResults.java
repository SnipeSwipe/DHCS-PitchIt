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

        ImageView iv;

        iv= (ImageView)findViewById(R.id.image1);
        iv.setImageResource(R.drawable.boy2);

        iv= (ImageView)findViewById(R.id.image2);
        iv.setImageResource(R.drawable.girl2);
    }

    public void profStart(View view){
        Intent intent = new Intent(SearchResults.this, Profile.class);
        startActivity(intent);
    }

    public void rowClick(View view){
        Toast.makeText(SearchResults.this, "Feature not Available", Toast.LENGTH_SHORT).show();
    }
}
