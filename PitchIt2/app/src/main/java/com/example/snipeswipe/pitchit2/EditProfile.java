package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.List;

public class EditProfile extends AppCompatActivity {

    EditText name, age, gender, height, weight, sport, education, leagues, email, phone;
    String[] data = new String[10];
    Button save;
    int count=0, count2=0;
    DatabaseHandler db = new DatabaseHandler(this);


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

        List<Users> contacts = db.getAllUsers();

        for (Users cn : contacts) {
            count++;
        }

        for (Users cn : contacts) {
            count2++;
            if(count2==count) {
                String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Age: " + cn.getAge() + " ,Gender: " + cn.getGender()
                        + ",Height: " + cn.getHeight() + " ,Weight: " + cn.getWeight() + " ,Sport: " + cn.getSport() + " ,Education: " + cn.getEducation()
                        + " ,Leagues: " + cn.getLeagues() + " ,Email: " + cn.getEmail() + " ,Phone Number: " + cn.getPhoneNumber();
                Log.d("Info: ", log);

                data[0] = String.valueOf(cn.getName());
                data[1] = String.valueOf(cn.getAge());
                data[2] = String.valueOf(cn.getGender());
                data[3] = String.valueOf(cn.getHeight());
                data[4] = String.valueOf(cn.getWeight());
                data[5] = String.valueOf(cn.getSport());
                data[6] = String.valueOf(cn.getEducation());
                data[7] = String.valueOf(cn.getLeagues());
                data[8] = String.valueOf(cn.getEmail());
                data[9] = String.valueOf(cn.getPhoneNumber());

                Log.d("Info", data[4]);

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



            }
        }


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

                db.addContact(new Users(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]));


                final Intent open=new Intent(EditProfile.this, OwnProfile.class);
                open.putExtra("String", data);
                startActivity(open);


            }

        });


    }
}
