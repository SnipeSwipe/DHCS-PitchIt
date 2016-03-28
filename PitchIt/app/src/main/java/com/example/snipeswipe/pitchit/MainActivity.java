package com.example.snipeswipe.pitchit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();

        Intent intentAndroid = new Intent().setClass(this, Main2Activity.class);
        ImageView iv;
        ImageView iv2;
        ImageView iv3;

        for (int i=1;i<=5;i++) {
            int ivd1 = getResources().getIdentifier("profilePhoto" + i, "id", "com.example.snipeswipe.pitchit");
            int ivd2 = getResources().getIdentifier("likeImage" + i, "id", "com.example.snipeswipe.pitchit");
            int ivd3 = getResources().getIdentifier("commentImage" + i, "id", "com.example.snipeswipe.pitchit");

            iv = (ImageView) findViewById(ivd1);
            iv2 = (ImageView) findViewById(ivd2);
            iv3 = (ImageView) findViewById(ivd3);

            iv.setImageResource(R.drawable.sample);
            iv2.setImageResource(R.drawable.like);
            iv3.setImageResource(R.drawable.comment);

        }

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("", getResources().getDrawable(R.drawable.newsfeed_tab));
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Profile");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Messages");
        host.addTab(spec);

        //Tab 4
        spec = host.newTabSpec("Tab Four");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Notifications");
        host.addTab(spec);

        //Tab 5
        spec = host.newTabSpec("Tab Five");
        spec.setContent(R.id.tab5);
        spec.setIndicator("Settings");
        host.addTab(spec);
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

    public void clickNew(View v)
    {
        Toast.makeText(this, "You liked the shit out of this button", Toast.LENGTH_LONG).show();
    }
}
