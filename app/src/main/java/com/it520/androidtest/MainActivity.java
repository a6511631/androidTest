package com.it520.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(getClass().getSimpleName(), "onCreate: " + "hahahah");
        Log.d(getClass().getSimpleName(), "onCreate: " + "添加一个新功能");

    }
}
