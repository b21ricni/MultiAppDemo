package com.example.multiappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ProfileActivity extends AppCompatActivity {

    public ProfileActivity() {
        super();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","ProfileActivity_PostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","ProfileActivity_Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","ProfileActivity_Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","ProfileActivity_Destroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}