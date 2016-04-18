package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class OwnProfile extends AppCompatActivity {

    TextView name, sports, age, following, followers, height, weight, rating, achievements;
    String[] data = new String[10];


    int count=0, count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own_profile);

        name = (TextView) findViewById(R.id.name);
        age = (TextView) findViewById(R.id.age);
        sports = (TextView) findViewById(R.id.sports);
        height = (TextView) findViewById(R.id.height);
        weight = (TextView) findViewById(R.id.weight);
        following = (TextView) findViewById(R.id.following);
        followers = (TextView) findViewById(R.id.followers);
        rating = (TextView) findViewById(R.id.rating);
        achievements = (TextView) findViewById(R.id.achievements);


        ImageView iv;

        Button edit = (Button) findViewById(R.id.editButton);
        edit.setTextColor(Color.parseColor("#ffffff"));



        DatabaseHandler db = new DatabaseHandler(this);
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
                height.setText(data[3]);
                weight.setText(data[4]);
                sports.setText(data[5]);
                followers.setText("0");
                following.setText("0");
                rating.setText("0");

                if(data[0].equals("Aman Agarwal") && data[1].equals("20") && data[2].equals("Male") && data[3].equals("185") && data[4].equals("76"))
                {
                    iv = (ImageView) findViewById(R.id.profile_photo);
                    iv.setImageResource(R.drawable.aman);

                    followers.setText("12");
                    following.setText("10");
                    rating.setText("3");
                    achievements.setText(" - Inter School Ranking: 34 \n - Finished 3rd in Rama Tennis\n   Tournament");

                    iv = (ImageView) findViewById(R.id.ribbon);
                    iv.setImageResource(R.drawable.player_icon);

                    iv = (ImageView) findViewById(R.id.photo1);
                    iv.setImageResource(R.drawable.girl_prof1);

                    iv = (ImageView) findViewById(R.id.photo2);
                    iv.setImageResource(R.drawable.girl_prof2);

                    iv = (ImageView) findViewById(R.id.photo3);
                    iv.setImageResource(R.drawable.girl_prof3);

                    iv = (ImageView) findViewById(R.id.photo4);
                    iv.setImageResource(R.drawable.girl_prof4);

                    iv = (ImageView) findViewById(R.id.video3);
                    iv.setImageResource(R.drawable.girl_prof1);

                    iv = (ImageView) findViewById(R.id.video4);
                    iv.setImageResource(R.drawable.girl_prof2);

                    iv = (ImageView) findViewById(R.id.video1);
                    iv.setImageResource(R.drawable.girl_prof3);

                    iv = (ImageView) findViewById(R.id.video2);
                    iv.setImageResource(R.drawable.girl_prof4);

                }

                else {
                    iv = (ImageView) findViewById(R.id.profile_photo);
                    iv.setImageResource(R.drawable.fb_def);
                    achievements.setText("You currently have no achievements");

                }
            }
        }

    }

    public void searchStart(View v) {
        Log.d("Test", "Test");
        Intent intent = new Intent(OwnProfile.this, EditProfile.class);
        startActivity(intent);
    }

    public void photoClick(View v){
        Intent intent = new Intent(OwnProfile.this, OwnProfilePhotos.class);
        startActivity(intent);
    }

    public void videoClick(View v){
        Intent intent = new Intent(OwnProfile.this, OwnProfileVideos.class);
        startActivity(intent);
    }

    public void rowClick(View view){
        Toast.makeText(OwnProfile.this, "Feature Not Available", Toast.LENGTH_SHORT).show();
    }

}
