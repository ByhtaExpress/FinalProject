package com.example.euphoria.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

                           Button new_game = (Button) findViewById(R.id.new_game);
                        new_game.setOnClickListener(new View.OnClickListener() {


                 @Override
                         public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, page_1.class));


            }

        });
        Button button_exit = (Button) findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               finish();
                System.exit(0);
            }
        });


            }
}