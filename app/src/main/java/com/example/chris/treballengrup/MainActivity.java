package com.example.chris.treballengrup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void opmenu (View v) {
        startActivity(new Intent(this,Restaurante.class));
        Intent i = new Intent(this,Restaurante.class);
        startActivity(i);
    }

    public void opmovies (View v) {
        startActivity(new Intent(this,Movies.class));
        Intent i = new Intent(this,Movies.class);
        startActivity(i);
    }
}
