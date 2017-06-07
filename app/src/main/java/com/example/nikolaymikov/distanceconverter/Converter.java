package com.example.nikolaymikov.distanceconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);



        Button btnConvert = (Button)findViewById(R.id.convertButton);
        Button btnReset = (Button)findViewById(R.id.resetButton);


        final EditText input_m = (EditText)findViewById(R.id.inputMeter);
        final TextView result_km = (TextView) findViewById(R.id.resultKM);

        final EditText input_km = (EditText)findViewById(R.id.inputKM);
        final TextView result_m = (TextView) findViewById(R.id.resultMeter);


        btnConvert.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v)
            {

                try
                {
                    double value_input_m = Double.parseDouble(input_m.getText().toString())/1000;
                    if(input_m.getText().toString().equals(""))
                    {
                        return;
                    }
                    else
                    {
                        result_km.setText(String.valueOf(value_input_m));
                    }

                }
                catch (Exception e)
                {
                    result_km.setText("Please, enter a number");
                }



                try
                {
                    double value_input_km = Double.parseDouble(input_km.getText().toString()) * 1000;

                    if (input_km.getText().toString().equals(""))
                    {
                        return;
                    }
                    else
                    {
                        result_m.setText(String.valueOf(value_input_km));
                    }

                }
                catch (Exception e)
                {
                    result_m.setText("Please, enter a number");
                }


            }

        });



        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v)
            {
                input_m.setText("");
                result_km.setText("");

                input_km.setText("");
                result_m.setText("");
            }

        });






    }
}
