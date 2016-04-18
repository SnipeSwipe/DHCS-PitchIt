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

        ImageView iv;
        ImageView iv2;
        ImageView iv3;

        iv = (ImageView) findViewById(R.id.image2);
        iv.setImageResource(R.drawable.giroud7);

        iv2 = (ImageView) findViewById(R.id.image2);
        iv2.setImageResource(R.drawable.giroud4);

        iv3 = (ImageView) findViewById(R.id.image3);
        iv3.setImageResource(R.drawable.giroud3);

    }

    public void rowClick(View v){
        Toast.makeText(Notifications.this, "Click Not Implemented", Toast.LENGTH_SHORT).show();
    }


}
