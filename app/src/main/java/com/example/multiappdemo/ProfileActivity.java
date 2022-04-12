package com.example.multiappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Button singout;
    private TextView username_view;

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
        Log.d("==>","CreatePA");
        singout = findViewById(R.id.SignOutButton);
        username_view = findViewById(R.id.ProfileUsername);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");
        Log.d("==>","username from intent:" + username);

        username_view.setText(username);

        singout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Sign out pressed");
                finish();
            }
        });
    }
}