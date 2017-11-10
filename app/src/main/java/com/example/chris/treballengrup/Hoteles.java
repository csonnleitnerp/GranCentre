package com.example.chris.treballengrup;

import android.content.Intent;
import android.net.Uri;
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

    public Button Tel1;
    public Button Tel2;
    public Button Tel3;
    public Button Tel4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        Hot1 = (Button)findViewById(R.id.Hotel1);
        Hot2 = (Button)findViewById(R.id.Hotel2);
        Hot3 = (Button)findViewById(R.id.Hotel3);
        Hot4 = (Button)findViewById(R.id.Hotel4);

        Tel1 = (Button)findViewById(R.id.Hoteltelefon1);
        Tel2 = (Button)findViewById(R.id.Hoteltelefon2);
        Tel3 = (Button)findViewById(R.id.Hoteltelefon3);
        Tel4 = (Button)findViewById(R.id.Hoteltelefon4);

        Hot1.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 1");
                        AnarWeb("http://www.hotelfondaeuropa.com/");
                    }
                }
        );

        Hot2.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 2");
                        AnarWeb("http://www.hotelciutatgranollers.com/");
                    }
                }
        );

        Hot3.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 3");
                        AnarWeb("https://www.aparthotelateneavalles.com/es/");
                    }
                }
        );

        Hot4.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Hotel 4");
                        AnarWeb("https://www.hotel-bb.es/hotel/barcelona-granollers/");
                    }
                }
        );

        Tel1.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Telefon 1");
                        AnarTelefon("+34(93)8700312");
                    }
                }
        );

        Tel2.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Telefon 2");
                        AnarTelefon("+34(93)8796220");
                    }
                }
        );

        Tel3.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Telefon 3");
                        AnarTelefon("+34(93)8794820");
                    }
                }
        );

        Tel4.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MostraMissatge("Telefon 4");
                        AnarTelefon("+34(938)407132");
                    }
                }
        );



    }

    public void MostraMissatge(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void AnarWeb(String s) {
        //href="s";
        Uri uri= Uri.parse(s);
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
    }

    public void AnarTelefon(String s) {
        Uri uri= Uri.parse(s);
        Intent intent= new Intent(Intent.ACTION_DIAL,uri);
    }

    public void opmain (View v) {
        startActivity(new Intent(this,MainActivity.class));
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}

