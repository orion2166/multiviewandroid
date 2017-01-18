package com.orion2166projects.multiviewandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    topview_activity views;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        views = (topview_activity)findViewById(R.id.view);
        views.setNumColumns(10);
        views.input_values(new String[]{"1","1","1","1"});
//        views.invalidate();
//        views.requestLayout();
    }

}
