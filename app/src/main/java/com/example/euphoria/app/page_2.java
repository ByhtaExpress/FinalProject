package com.example.euphoria.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class page_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);

        Button button_correct1 = (Button) findViewById(R.id.button_correct1);
        button_correct1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
                startActivity(new Intent(page_2.this, page_3.class));

            }
        });
        Button but5 = (Button) findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_2.this, page_2.class));

            }
        });
        Button but6 = (Button) findViewById(R.id.but6);
        but6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_2.this, page_2.class));

            }
        });
        Button but7 = (Button) findViewById(R.id.but7);
        but7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_2.this, page_2.class));

            }
        });
    }
}