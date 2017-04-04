package com.example.artur_laptop.zadanie2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import java.lang.String;
import android.widget.*;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button_submit = (Button) findViewById(R.id.button_submit);
        final EditText edit =  (EditText) findViewById(R.id.first_name);
        final EditText edit2 =  (EditText) findViewById(R.id.surname);



        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk3");
            }
        });
        button_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context,Obrazek.class);
                startActivity(intent);

            }
        });
    }
}
