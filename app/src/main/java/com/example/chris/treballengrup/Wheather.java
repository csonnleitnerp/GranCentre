package com.example.chris.treballengrup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Wheather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheather);
    }

    public void opmain (View v) {
        startActivity(new Intent(this,MainActivity.class));
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
