package com.example.snipeswipe.pitchit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        // initial tabhost
        TabHost tabHost =  (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();

        // create tab
        TabSpec tabHome = createTab(tabHost, "tabHome", "Home", Main2Activity.class);
        TabSpec tabSetting = createTab(tabHost, "tabSetting", "Setting", Main3Activity.class);
//        TabSpec tabAbout = createTab(tabHost, "tabAbout", "About", TabAboutActivity.class);

        // add tab to tabhost
        tabHost.addTab(tabHome);
        tabHost.addTab(tabSetting);
//        tabHost.addTab(tabAbout);
    }

    private TabSpec createTab(TabHost tabHost, String tag, String label, Class<?> intent) {
        TabSpec tab = tabHost.newTabSpec(tag);
        tab.setIndicator(label);
        tab.setContent(new Intent(this, intent));

        return tab;
    }
}
