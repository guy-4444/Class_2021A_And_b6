package com.classy.class_2021a_and_b6;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MySPV3.init(this);
        MySignal.init(this);

    }

}
