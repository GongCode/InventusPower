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

public class MainActivity extends AppCompatActivity {

    Calendar calendarDate;
    String Date;
    SimpleDateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText employerID = (EditText) findViewById(R.id.id_text);

        Data.resetCount();

        Button continue_button = (Button) findViewById(R.id.cont_button);

        TextView current_date = (TextView) findViewById(R.id.time_text);

        calendarDate = Calendar.getInstance();

        simpleDateFormat = new SimpleDateFormat("H:mm aa  MM/dd/yyyy");

        Date = simpleDateFormat.format(calendarDate.getTime());


        current_date.setText(Date);

        continue_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String id = employerID.getText().toString();

                if (validID(id)) {
                    launchTester();
                } else {

                    Toast.makeText(getApplicationContext(), "INVALID ID, try again.",
                            Toast.LENGTH_LONG).show();

                }

            }
        });
    }
        private void launchTester() {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);

        }

    boolean validID(String id) {
        if(id.length() == 0){
            return false;
        }
        return true;

    }

}
