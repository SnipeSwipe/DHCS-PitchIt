package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditProfile extends AppCompatActivity {

    EditText name, age, gender, height, weight, sport, education, leagues, email, phone;
    String[] data = new String[10];
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        name = (EditText) findViewById(R.id.nameDisplayTV);
        age = (EditText) findViewById(R.id.ageDisplayTV);
        gender = (EditText) findViewById(R.id.genderDisplayTV);
        height = (EditText) findViewById(R.id.heightDisplayTV);
        weight = (EditText) findViewById(R.id.weightDisplayTV);
        sport = (EditText) findViewById(R.id.sportDisplayTV);
        education = (EditText) findViewById(R.id.educationDisplayTV);
        leagues = (EditText) findViewById(R.id.leaguesDisplayTV);
        email = (EditText) findViewById(R.id.emailIdDisplayTV);
        phone = (EditText) findViewById(R.id.phoneNumberDisplayTV);


        save = (Button)findViewById(R.id.save);
        final String key = "bundle";


        save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                data[0] = name.getText().toString();
                data[1] = age.getText().toString();
                data[2] = gender.getText().toString();
                data[3] = height.getText().toString();
                data[4] = weight.getText().toString();
                data[5] = sport.getText().toString();
                data[6] = education.getText().toString();
                data[7] = leagues.getText().toString();
                data[8] = email.getText().toString();
                data[9] = phone.getText().toString();

                final Intent open=new Intent(EditProfile.this, EditProfileFinal.class);
                open.putExtra("String", data);
                startActivity(open);


            }

        });


    }
}
