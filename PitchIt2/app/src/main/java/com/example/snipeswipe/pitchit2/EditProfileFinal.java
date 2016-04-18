package com.example.snipeswipe.pitchit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class EditProfileFinal extends AppCompatActivity {

    TextView name, age, gender, height, weight, sport, education, leagues, email, phone;


    String[] data = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_final);




        data = getIntent().getStringArrayExtra("String");

        Log.d("profileDetails","after data");

        name = (TextView) findViewById(R.id.nameDisplayTV);
        age = (TextView) findViewById(R.id.ageDisplayTV);
        gender = (TextView) findViewById(R.id.genderDisplayTV);
        height = (TextView) findViewById(R.id.heightDisplayTV);
        weight = (TextView) findViewById(R.id.weightDisplayTV);
        sport = (TextView) findViewById(R.id.sportDisplayTV);
        education = (TextView) findViewById(R.id.educationDisplayTV);
        leagues = (TextView) findViewById(R.id.leaguesDisplayTV);
        email = (TextView) findViewById(R.id.emailIdDisplayTV);
        phone = (TextView) findViewById(R.id.phoneNumberDisplayTV);

        name.setText(data[0]);
        age.setText(data[1]);
        gender.setText(data[2]);
        height.setText(data[3]);
        weight.setText(data[4]);
        sport.setText(data[5]);
        education.setText(data[6]);
        leagues.setText(data[7]);
        email.setText(data[8]);
        phone.setText(data[9]);

        for (int i=0; i<10; i++)
        {
            Log.d("profileDetails", "Data"+i+"="+data[i]);
        }


    }
}
