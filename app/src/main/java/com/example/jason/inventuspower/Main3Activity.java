package com.example.jason.inventuspower;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button pass_button = (Button) findViewById(R.id.pass_button);
        Button fail_button = (Button) findViewById(R.id.fail_button);
        Button rework_button = (Button) findViewById(R.id.rework_button);

        TextView passView = (TextView) findViewById(R.id.pass_count);

        passView.setText(Data.passCount + "");

        TextView failView = (TextView) findViewById(R.id.fail_count);

        failView.setText(Data.failCount + "");

        TextView reworkView = (TextView) findViewById(R.id.rework_count);

        reworkView.setText(Data.reworkCount + "");

        TextView cView = (TextView) findViewById(R.id.total_count);

        int total_count = Data.failCount + Data.passCount + Data.reworkCount;


        cView.setText(String.valueOf(total_count));




        Button restart_button = (Button) findViewById(R.id.exit_button);
        restart_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                launchRestart();


            }

        });

        pass_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                increase_pass();


            }

        });

        fail_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                increase_fail();


            }

        });

        rework_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                increase_rework();


            }

        });
    }

    private void launchRestart() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void increase_pass() {
        Data.passCount++;
        Data.status = "Pass";

        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
        Data.failStatus = 0;


    }
    private void increase_fail() {

        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
        Data.failCount++;
        Data.status = "Fail";
        Data.failStatus = 1;
    }
    private void increase_rework(){

        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
        Data.reworkCount++;
        Data.status = "Rework";
        Data.failStatus = 0;

    }
}
