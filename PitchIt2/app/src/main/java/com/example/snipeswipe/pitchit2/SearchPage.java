package com.example.snipeswipe.pitchit2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SearchPage extends AppCompatActivity {

    Spinner sports_names;
    ArrayAdapter<CharSequence> adapter_sports;

    Spinner locations;
    ArrayAdapter<CharSequence> adapter_locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        sports_names = (Spinner)findViewById(R.id.sportsSP);
        adapter_sports = ArrayAdapter.createFromResource(this, R.array.sports, android.R.layout.simple_spinner_item);
        adapter_sports.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sports_names.setAdapter(adapter_sports);

        locations = (Spinner)findViewById(R.id.locationSP);
        adapter_locations = ArrayAdapter.createFromResource(this, R.array.locations, android.R.layout.simple_spinner_item);
        adapter_locations.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locations.setAdapter(adapter_locations);

        Button findButton = (Button)findViewById(R.id.findBT);

        final EditText editText = (EditText) findViewById(R.id.searchBar);
        editText.requestFocus();


        SeekBar seekBar = (SeekBar)findViewById(R.id.ageSB);
        final TextView seekBarValueAge = (TextView)findViewById(R.id.ageTV);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValueAge.setText("Age (" + String.valueOf(progress) + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBarRating = (SeekBar)findViewById(R.id.ratingSB);
        final TextView seekBarValueRating = (TextView)findViewById(R.id.ratingTV);

        seekBarRating.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBarRating, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValueRating.setText("Rating ("+String.valueOf(progress)+")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBarRating) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBarRating) {
                // TODO Auto-generated method stub
            }
        });


        Button searchButton =(Button) findViewById(R.id.findBT);


        searchButton.setTextColor(Color.parseColor("#FFFFFF"));


    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void searchStart(View view){
        Log.d("Test", "Test");
        Intent intent = new Intent(SearchPage.this, Profile.class);
        startActivity(intent);
    }
}
