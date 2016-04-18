package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddAchievement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_achievement);
        Button b1;
        b1=(Button)findViewById(R.id.add_photo);
        b1.setTextColor(Color.parseColor("#FFFFFF"));
        final EditText editText = (EditText) findViewById(R.id.description);
        editText.requestFocus();
    }

    public void finClick(View view){
        Intent intent=new Intent(AddAchievement.this, NewsFeed.class);
        startActivity(intent);
    }
}
