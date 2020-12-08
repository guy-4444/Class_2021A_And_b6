package com.classy.class_2021a_and_b6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySPV3 {

    private static MySPV3 instance;
    private SharedPreferences prefs;

    private MySPV3(Context context) {
        prefs = context.getSharedPreferences("MY_SP", Context.MODE_PRIVATE);
    }

    public static void init(Context context) {
        if (instance == null) {
            instance = new MySPV3(context.getApplicationContext());
        }
    }

    public static MySPV3 getInstance() {
        return instance;
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key, String def) {
        return prefs.getString(key, def);
    }

    public void removeKey(String key) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key);
        editor.apply();
    }
}
