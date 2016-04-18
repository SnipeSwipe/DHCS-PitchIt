package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ImageView iv;
//        iv = (ImageView) findViewById(R.id.image1);
//        iv.setImageResource(R.drawable.sample);


        for (int i=1;i<=6;i++) {
            int ivd1 = getResources().getIdentifier("bullet" + i, "id", "com.example.snipeswipe.pitchit2");

            iv = (ImageView) findViewById(ivd1);
//            iv2 = (ImageView) findViewById(ivd2);
//            iv3 = (ImageView) findViewById(ivd3);

            iv.setImageResource(R.drawable.bullet);
//            iv2.setImageResource(R.drawable.like);
//            iv3.setImageResource(R.drawable.comment);

        }
    }

    public void rowClick(View v){
        Toast.makeText(Settings.this, "Test", Toast.LENGTH_SHORT).show();
    }

    public void notiStart(View view){
        Intent intent = new Intent(Settings.this, NotificationSettings.class);
        startActivity(intent);
    }

    public void privStart(View view){
        Intent intent = new Intent(Settings.this, PrivacySettings.class);
        startActivity(intent);
    }

    public void passStart(View view){
        Intent intent = new Intent(Settings.this, PasswordSettings.class);
        startActivity(intent);
    }

    public void helpStart(View view){
        Intent intent = new Intent(Settings.this, HelpSettings.class);
        startActivity(intent);
    }

    public void repoStart(View view){
        Intent intent = new Intent(Settings.this, ReportSettings.class);
        startActivity(intent);
    }


}
