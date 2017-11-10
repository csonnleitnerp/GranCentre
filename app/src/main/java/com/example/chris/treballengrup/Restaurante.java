package com.example.chris.treballengrup;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Restaurante extends AppCompatActivity {


    public Button web1;
    public Button web2;
    public Button web3;
    public Button web4;
    public Button web5;

    public Button tel1;
    public Button tel2;
    public Button tel3;
    public Button tel4;
    public Button tel5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        web1 = (Button) findViewById(R.id.Web1);
        web2 = (Button) findViewById(R.id.Web2);
        web3 = (Button) findViewById(R.id.Web3);
        web4 = (Button) findViewById(R.id.Web4);
        web5 = (Button) findViewById(R.id.Web5);

        tel1 = (Button) findViewById(R.id.Tel1);
        tel2 = (Button) findViewById(R.id.Tel2);
        tel3 = (Button) findViewById(R.id.Tel3);
        tel4 = (Button) findViewById(R.id.Tel4);
        tel5 = (Button) findViewById(R.id.Tel5);

        web1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://www.eltrull.com/ca");
                    }
                }
        );

        web2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://www.viena.es/ca/restaurants/viena-granollers/");
                    }
                }
        );

        web3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://www.hotelfondaeuropa.com/ca/restaurante/");
                    }
                }
        );

        web4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://lamezzaluna.es/");
                    }
                }
        );

        web5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("https://www.tripadvisor.es/Restaurant_Review-g670666-d11758096-Reviews-Vinyam_Restaurant-Granollers_Catalonia.html");
                    }
                }
        );
}
    public void AnarWeb(String s) {
        //href="s";
        Uri uri= Uri.parse(s);
        Intent intent= new Intent(android.content.Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void opmain (View v) {
        startActivity(new Intent(this,MainActivity.class));
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
