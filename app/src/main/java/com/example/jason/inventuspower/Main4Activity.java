package com.example.jason.inventuspower;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button details_button = (Button) findViewById(R.id.details_button);


        TextView passView = (TextView) findViewById(R.id.statusID);

        passView.setText(Data.status);


        TextView dateView = (TextView) findViewById(R.id.time_text);

        Button exit_button = (Button) findViewById(R.id.exit_button);

        Button back_button = (Button) findViewById(R.id.back_button);

        dateView.setText(Data.date);

        if(Data.failStatus == 0) {
            details_button.setVisibility(View.GONE);
        }



        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                launchBack();


            }

        });

        exit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                launchRestart();


            }

        });

        details_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                launchFail();


            }

        });
    }

    private void launchRestart() {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


    private void launchBack() {

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    private void launchFail() {

        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

}
