package com.example.euphoria.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class page_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);

        Button button_correct = (Button) findViewById(R.id.button_correct);
        button_correct.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
                startActivity(new Intent(page_1.this, page_2.class));

            }
        });
        Button but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_1.this, page_1.class));

            }
        });
        Button but3 = (Button) findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_1.this, page_1.class));


            }
        });
        Button but4 = (Button) findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_1.this, page_1.class));


            }
        });

    }

}
