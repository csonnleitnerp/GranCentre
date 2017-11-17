package com.example.chris.treballengrup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class business3 extends AppCompatActivity {

    public ImageView web1;
    public ImageView web2;
    public ImageView web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business3);

        web1 = (ImageView) findViewById(R.id.web1);
        web2 = (ImageView) findViewById(R.id.web2);
        web3 = (ImageView) findViewById(R.id.web3);

        web1.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AnarWeb("http://www.volkswagen.es//");
                }
            }
            );

        web2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://www.seat.es/");
                    }
                }
        );

        web3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://www.audi.es/");
                    }
                }
        );

    }

    public void AnarWeb(String s) {
        //href="s";
        Uri uri= Uri.parse(s);
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void bmovil (View v) {
        startActivity(new Intent(this,business.class));
        Intent i = new Intent(this,business.class);
        startActivity(i);
    }

    public void bropa (View v) {
        startActivity(new Intent(this,business2.class));
        Intent i = new Intent(this,business2.class);
        startActivity(i);
    }

    public void opmain (View v) {
        startActivity(new Intent(this,MainActivity.class));
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    //Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
      //      Uri.parse("http://www.google.es"));


}
