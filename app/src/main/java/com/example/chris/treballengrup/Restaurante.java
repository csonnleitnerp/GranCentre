package com.example.chris.treballengrup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class Restaurante extends AppCompatActivity {

    public Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnClickListener((View.OnClickListener) spinner);
    }

}
