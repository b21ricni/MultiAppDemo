package com.example.multiappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signin;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","Main Activity PostResumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","Main Activity Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","Main Activity Stopped");
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

        signin = findViewById(R.id.SignInButton);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","You have logged in");
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}