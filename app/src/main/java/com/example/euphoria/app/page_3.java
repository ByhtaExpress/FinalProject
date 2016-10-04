package com.example.euphoria.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.Random;

public class page_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);

        Button button_correct2 = (Button) findViewById(R.id.button_correct2);
        button_correct2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
                startActivity(new Intent(page_3.this, page_4.class));

            }
        });
        Button but8 = (Button) findViewById(R.id.but8);
        but8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_3.this, page_3.class));

            }
        });
        Button but9 = (Button) findViewById(R.id.but9);
        but9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_3.this, page_3.class));

            }
        });
        Button but10 = (Button) findViewById(R.id.but10);
        but10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_3.this, page_3.class));

            }
        });
    }
}