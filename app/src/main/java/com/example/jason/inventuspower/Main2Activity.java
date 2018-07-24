package com.example.jason.inventuspower;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {

    Calendar calendarDate;
    String Date;
    SimpleDateFormat simpleDateFormat;


    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        final TextView warning_text = (TextView) findViewById(R.id.warning);

        warning_text.setVisibility(View.GONE);

        final EditText custom_text = (EditText) findViewById(R.id.text_box);

        custom_text.setVisibility(View.GONE);

        TextView current_date = (TextView) findViewById(R.id.time_text);

        calendarDate = Calendar.getInstance();

        simpleDateFormat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy");

        Date = simpleDateFormat.format(calendarDate.getTime());

        Data.date = Date;

        current_date.setText(Date);




        Button line = (Button) findViewById(R.id.line_button);
        line.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (Data.selected_option == 0) {
                    Toast.makeText(Main2Activity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
                }else {


                    continueView();
                }
                }

        });



        Button restart_button = (Button) findViewById(R.id.exit_button);
        restart_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                launchRestart();


            }

        });



        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItemId()  == 0) {
                    warning_text.setVisibility(View.VISIBLE);
                    Data.selected_option = 0;
                    custom_text.setVisibility(View.GONE);

                } else if (spinner.getSelectedItemId() == 5) {

                    custom_text.setVisibility(View.VISIBLE);
                    warning_text.setVisibility(View.GONE);

                    Data.selected_option = 1;


                } else {
                    custom_text.setVisibility(View.GONE);
                    Data.selected_option = 1;
                    warning_text.setVisibility(View.GONE);

                    //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();

                    Toast.makeText(Main2Activity.this, spinner.getSelectedItem().toString() + " selected", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });



        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main2Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.lines));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);

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
