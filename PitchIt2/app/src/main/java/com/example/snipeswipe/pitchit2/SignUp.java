package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class SignUp extends AppCompatActivity {

    EditText name, age, gender, height, weight, sport, education, leagues, email, phone;
    String[] data = new String[10];
    DatabaseHandler db = new DatabaseHandler(this);

    int count=0;
    int count2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//        Log.d("Insert: ", "Inserting ..");
//        db.addContact(new Users("Ravi","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));
//        db.addContact(new Users("Srinivas","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));
//        db.addContact(new Users("Tommy","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));
//        db.addContact(new Users("Karthik","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");


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


        final String key = "bundle";



//                final Intent open=new Intent(EditProfile.this, EditProfileFinal.class);
//                open.putExtra("String", data);
//                startActivity(open);



    }

    public void startApp(View view){

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

        db.addContact(new Users(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]));

        Intent intent = new Intent(SignUp.this, MainActivity.class);
        startActivity(intent);
    }


}
