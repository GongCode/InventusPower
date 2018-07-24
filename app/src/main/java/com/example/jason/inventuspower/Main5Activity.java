package com.example.jason.inventuspower;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button finish_button = (Button) findViewById(R.id.finish_button);

        Button exit_button = (Button) findViewById(R.id.exit_button);

        final TextView warning_text = (TextView) findViewById(R.id.warning_text);

        warning_text.setVisibility(View.GONE);

        final TextView custom_text = (TextView) findViewById(R.id.custom_text);

        custom_text.setVisibility(View.GONE);







        spinner = (Spinner) findViewById(R.id.ErrorCode);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItemId()  == 0) {
                    warning_text.setVisibility(View.VISIBLE);

                } else if (spinner.getSelectedItemId() == 5) {

                    custom_text.setVisibility(View.VISIBLE);



                } else {


                    //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();

                    Toast.makeText(Main5Activity.this, spinner.getSelectedItem().toString() + " selected", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });

        //List<String> codes = new ArrayList<>();
        //codes.add(0, "juf");
       // codes.add("dd");





        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main5Activity.this,
               android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.error_codes));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);





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
