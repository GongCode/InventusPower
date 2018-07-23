package com.example.jason.inventuspower;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button line = (Button) findViewById(R.id.line_button);
        line.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                continueView();

            }

        });



        Button restart_button = (Button) findViewById(R.id.exit_button);
        restart_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                launchRestart();


            }

        });
    }

    private void launchRestart() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void continueView(){

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
