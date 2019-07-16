package com.example.alcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt_about_alc, bt_my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the button About alc to show the activity About alc
        bt_about_alc = findViewById(R.id.button_about_alc);
        bt_about_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutALC.class);
                startActivity(intent);
            }
        });

        //Set the button My profile to show the activity My Profile
        bt_my_profile = findViewById(R.id.button_my_profile);
        bt_my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyProfile.class);
                startActivity(intent);
            }
        });

    }
}
