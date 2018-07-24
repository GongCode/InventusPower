package com.example.jason.inventuspower;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main4Activity extends AppCompatActivity {

    Calendar calendarDate;
    String Date;
    SimpleDateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final EditText text_box = (EditText) findViewById(R.id.editText);

        Button details_button = (Button) findViewById(R.id.details_button);


        TextView passView = (TextView) findViewById(R.id.statusID);

        passView.setText(Data.status);

        TextView current_date = (TextView) findViewById(R.id.time_text);

        calendarDate = Calendar.getInstance();

        simpleDateFormat = new SimpleDateFormat("H:mm aa");

        Date = simpleDateFormat.format(calendarDate.getTime());

        Data.date = Date;

        current_date.setText(Date);


        TextView dateView = (TextView) findViewById(R.id.time_text);

        Button finish_button = (Button) findViewById(R.id.fin_button);

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

        finish_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (text_box.getText().toString().isEmpty()){
                    Toast.makeText(Main4Activity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }else if (text_box.getText().toString() == "") {
                    Toast.makeText(Main4Activity.this, "Good Game", Toast.LENGTH_SHORT).show();
                }else{


                    launchFinish();
                }


            }

        });

        details_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (text_box.getText().toString().isEmpty()){
                    Toast.makeText(Main4Activity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }else {


                    launchFail();
                }





            }

        });
    }

    private void launchFinish() {

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
