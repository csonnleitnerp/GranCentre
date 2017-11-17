package com.example.chris.treballengrup;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class business extends AppCompatActivity {

    public ImageView web1;
    public ImageView web2;
    public ImageView web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        web1 = (ImageView) findViewById(R.id.web1);
        web2 = (ImageView) findViewById(R.id.web2);
        web3 = (ImageView) findViewById(R.id.web3);

        web1.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AnarWeb("http://www.apple.com/");
                }
            }
            );

        web2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://www.samsung.com/");
                    }
                }
        );

        web3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AnarWeb("http://www.huawei.com/");
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


    public void bropa (View v) {
        startActivity(new Intent(this,business2.class));
        Intent i = new Intent(this,business2.class);
        startActivity(i);
    }

    public void bcoche (View v) {
        startActivity(new Intent(this,business3.class));
        Intent i = new Intent(this,business3.class);
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
