package com.classy.class_2021a_and_b6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String USERNAME = "USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // V0
        SharedPreferences prefs = getSharedPreferences("MY_SP", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(USERNAME, "Elena");
        editor.apply();
        String name0 = prefs.getString(USERNAME, "NA");

        // V1
        MySPV1.putString(this, USERNAME, "Elena");
        String name1 = MySPV1.getString(this, USERNAME, "NA");

        // V2
        MySPV2 mySPV2 = new MySPV2(this);
        mySPV2.putString(USERNAME, "Elena");
        String name2 = mySPV2.getString(USERNAME, "NA");

        // V3
        /*
            No Context
            No Instance
            Performance
            East to read and write
         */

    }



}