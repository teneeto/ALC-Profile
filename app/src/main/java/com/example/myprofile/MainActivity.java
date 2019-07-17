package com.example.myprofile;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button myProfileBtn;
    private Button aboutAlcBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar myProfileBar = getSupportActionBar();
        myProfileBar.setTitle("Alc 4 Phase 1");

        myProfileBtn = findViewById(R.id.my_profile_btn);
        myProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile();
            }
        });

        aboutAlcBtn = findViewById(R.id.about_alc_btn);
        aboutAlcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutAlc();
            }
        });
    }
    public void openMyProfile(){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
    public void openAboutAlc(){
        Intent intent = new Intent(this, AboutALC.class);
        startActivity(intent);
    }
}

