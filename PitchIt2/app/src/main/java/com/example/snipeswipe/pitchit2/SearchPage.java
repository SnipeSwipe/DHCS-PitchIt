package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toolbar;

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
