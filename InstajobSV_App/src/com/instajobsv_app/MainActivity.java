package com.instajobsv_app;

import android.R.color;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.widget.TabHost.OnTabChangeListener;


public class MainActivity extends Activity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        
        Resources res = getResources();
        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
       tabs.setup();
       tabs.setBackgroundColor(Color.LTGRAY);
   TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
   spec.setContent(R.id.tab1);
   spec.setIndicator(null,res.getDrawable(R.drawable.ic_action_search));
   tabs.addTab(spec);
       
   spec=tabs.newTabSpec("mitab2");
   spec.setContent(R.id.tab2);
   spec.setIndicator(null,res.getDrawable(R.drawable.ic_action_important));
   tabs.addTab(spec);
   
   spec=tabs.newTabSpec("mitab3");
   spec.setContent(R.id.tab3);
   spec.setIndicator(null,res.getDrawable(R.drawable.ic_action_labels));
   tabs.addTab(spec);
       
   spec=tabs.newTabSpec("mitab4");
   spec.setContent(R.id.tab4);
   spec.setIndicator(null,res.getDrawable(R.drawable.ic_action_person));
   tabs.addTab(spec);
   
   tabs.setCurrentTab(0);
       
       
   tabs.setOnTabChangedListener(new OnTabChangeListener() {
              public void onTabChanged(String tabId) {
              Log.i("AndroidTabsDemo", "Pulsada pestaña: " + tabId);
              }
            });
        } 
    }


