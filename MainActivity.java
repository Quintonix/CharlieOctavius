package com.tpurecore.android.connec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mConnecButton;    //setting up the Button member variables, prefix m is Android convention

    //This is the Android main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This takes the View and casts it to a Button
        mConnecButton = (Button) findViewById(R.id.connec_button);
        //This is the click listener with an inline class to move to the LoginActivity
        mConnecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });







    }
}
