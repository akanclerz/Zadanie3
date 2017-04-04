package com.example.artur_laptop.zadanie2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import static com.example.artur_laptop.zadanie2.R.drawable.android_czerwony;
import static com.example.artur_laptop.zadanie2.R.drawable.android_zielony;


/**
 * Created by Artur-laptop on 2017-04-04.
 */

public class Obrazek extends AppCompatActivity{

    //ImageView imageView1 = (ImageView) findViewById(R.id.imageView);
    //ImageView imageView2 = (ImageView) findViewById(R.id.imageView);


    ImageView image;

    public void zmienObrazek(View v)
    {
        image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(android_czerwony);
    }


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);
    }

    public void return_to_first_view(View v)
    {
        this.finish();
    }


    public void back(View v)
    {
        image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.android_zielony);
    }
}
