package com.example.multiappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","Activity PostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","Activity STARTO");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","Activity STAPH");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","Activity Destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>","WAOW");
    }
}