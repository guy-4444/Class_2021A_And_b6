package com.classy.class_2021a_and_b6;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class MySignal {

    private static MySignal instance;
    private Context context;

    public static MySignal getInstance() {
        return instance;
    }

    private MySignal(Context context) {
        this.context = context.getApplicationContext();
    }

    public static void init(Context context) {
        if (instance == null) {
            instance = new MySignal(context);
        }
    }

    public void vibrate() {
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            v.vibrate(500);
        }
    }
}
