package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class SiginUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_up);

        DatabaseHandler db = new DatabaseHandler(this);
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Users("Ravi","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));
        db.addContact(new Users("Srinivas","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));
        db.addContact(new Users("Tommy","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));
        db.addContact(new Users("Karthik","20","M","172","60","Basketball","BA","Zonals","gmail","09876543321"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Users> contacts = db.getAllUsers();

        for (Users cn : contacts) {
            String log = "Id: "+cn.getID() + " ,Name: " + cn.getName()+" ,Age: " + cn.getAge()+" ,Gender: " + cn.getGender()
            +",Height: " + cn.getHeight()+" ,Weight: " + cn.getWeight()+" ,Sport: " + cn.getSport()+" ,Education: " + cn.getEducation()
                    +" ,Leagues: " + cn.getLeagues()+" ,Email: " + cn.getEmail()+" ,Phone Number: " + cn.getPhoneNumber();
            Log.d("Info: ", log);
        }


    }


    public void startApp(View view) {
        Intent intent = new Intent(SiginUp.this, MainActivity.class);
        startActivity(intent);
    }
}
