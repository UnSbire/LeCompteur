package com.example.lecompteur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int comp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewResult= (TextView) findViewById(R.id.textView);


        Button increase= (Button) findViewById(R.id.button);
        Button decrease= (Button) findViewById(R.id.button2);
        Button RAZ= (Button) findViewById(R.id.button3);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String valeur=textViewResult.getText().toString();

                comp =Integer.parseInt(valeur) +1;

                textViewResult.setText(""+comp);

                //Toast.makeText(getApplicationContext(),"+",Toast.LENGTH_LONG).show();
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valeur=textViewResult.getText().toString();

                comp =Integer.parseInt(valeur) -1;

                if (comp >= 0)
                    textViewResult.setText(""+comp);

                //Toast.makeText(getApplicationContext(),"-",Toast.LENGTH_LONG).show();
            }
        });

        RAZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valeur=textViewResult.getText().toString();

                comp = 0;

                textViewResult.setText(""+comp);

                //Toast.makeText(getApplicationContext(),"Remise à Zero",Toast.LENGTH_LONG).show();
            }
        });

    }
}