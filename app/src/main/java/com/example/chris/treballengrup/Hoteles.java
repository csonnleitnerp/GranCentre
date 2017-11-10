package com.example.chris.treballengrup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Hoteles extends AppCompatActivity {

    public Button Hot1;
    public Button Hot2;
    public Button Hot3;
    public Button Hot4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        Hot1 = (Button)findViewById(R.id.Hotel1);
        Hot2 = (Button)findViewById(R.id.Hotel2);
        Hot3 = (Button)findViewById(R.id.Hotel3);
        Hot4 = (Button)findViewById(R.id.Hotel4);

        Hot1.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 1");
                      //  AnarWeb("http://www.hotelfondaeuropa.com/");
                    }
                }
        );

        Hot2.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 2");
                       // AnarWeb("http://www.hotelciutatgranollers.com/");
                    }
                }
        );

        Hot3.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 3");
                        //AnarWeb("https://www.aparthotelateneavalles.com/es/");
                    }
                }
        );

        Hot4.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 4");
                       // AnarWeb("https://www.hotel-bb.es/hotel/barcelona-granollers/");
                    }
                }
        );



    }

    public void MostraMissatge(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void AnarWeb(String s) {
        //href="s";
    }

    public void opmain (View v) {
        startActivity(new Intent(this,MainActivity.class));
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}

