package com.example.snipeswipe.pitchit2;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity  {


    int i=0;
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
        TabSpec tabChat = createTab(tabHost, "tabChat", "Chat", MessageList.class);
        TabSpec tabNotifications = createTab(tabHost, "tabAbout", "Notifications", Notifications.class);
        TabSpec tabSettings = createTab(tabHost, "tabSettings", "Settings", Settings.class);


        // add tab to tabhost
        tabHost.addTab(tabHome);
        tabHost.addTab(tabProfile);
        tabHost.addTab(tabChat);
        tabHost.addTab(tabNotifications);
        tabHost.addTab(tabSettings);

        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++){
            tabHost.getTabWidget().getChildAt(i).setPadding(0,0,10,0);
        }

    }

    private TabSpec createTab(TabHost tabHost, String tag, String label, Class<?> intent) {
        TabSpec tab = tabHost.newTabSpec(tag);

        if(i==0) {
            tab.setIndicator("", getResources().getDrawable(R.drawable.icon_home));
        }
        if(i==1) {
            tab.setIndicator("", getResources().getDrawable(R.drawable.icon_profile));
        }if(i==2) {
            tab.setIndicator("", getResources().getDrawable(R.drawable.icon_message));
        }if(i==3) {
            tab.setIndicator("", getResources().getDrawable(R.drawable.icon_notifications));
        }if(i==4) {
            tab.setIndicator("", getResources().getDrawable(R.drawable.icon_settings));
        }

        i++;
        tab.setContent(new Intent(this, intent));

        return tab;
    }
}
