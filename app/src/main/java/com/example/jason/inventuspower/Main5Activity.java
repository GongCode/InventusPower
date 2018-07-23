package com.example.jason.inventuspower;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button finish_button = (Button) findViewById(R.id.finish_button);

        Button exit_button = (Button) findViewById(R.id.exit_button);





        Spinner errorCode = (Spinner) findViewById(R.id.ErrorCode);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main5Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        errorCode.setAdapter(myAdapter);



       exit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                launchExit();


            }

        });

        finish_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                launchFinish();


            }

        });

    }

    private void launchFinish() {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


    private void launchExit() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
