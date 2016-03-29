package com.example.snipeswipe.pitchit2;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
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
        TabSpec tabHome = createTab(tabHost, "tabHome", "Home", NewsFeed.class);
        TabSpec tabProfile = createTab(tabHost, "tabProfile", "Profile", OwnProfile.class);
        TabSpec tabChat = createTab(tabHost, "tabChat", "Chat", ChatActivity.class);
        TabSpec tabNotifications = createTab(tabHost, "tabAbout", "Notifications", Notifications.class);
        TabSpec tabSettings = createTab(tabHost, "tabSettings", "Settings", Settings.class);


        // add tab to tabhost
        tabHost.addTab(tabHome);
        tabHost.addTab(tabProfile);
        tabHost.addTab(tabChat);
        tabHost.addTab(tabNotifications);
        tabHost.addTab(tabSettings);
    }

    private TabSpec createTab(TabHost tabHost, String tag, String label, Class<?> intent) {
        TabSpec tab = tabHost.newTabSpec(tag);
        tab.setIndicator(label);
        tab.setContent(new Intent(this, intent));

        return tab;
    }
}
