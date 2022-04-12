package com.example.multiappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button signin;
    private EditText username;

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

        username = findViewById(R.id.SignInName);

        signin = findViewById(R.id.SignInButton);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","You have logged in");
                Log.d("==>","username:"+username.getText().toString());
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}