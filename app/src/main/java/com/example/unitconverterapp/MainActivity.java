package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

//Main Activity Handles Length data and application
public class MainActivity extends AppCompatActivity {

    //Variables (objects of widgets)
    EditText value_input; //user input
    Button convert_button; //convert button
    TextView result_output; //result output
    Spinner destination_unit_spinner, source_unit_spinner;

    Button button_measurement; //Image button measurement
    Button button_weight; //Image button weight
    Button button_temperature; //Image button temperature

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare objects to layout
        value_input = findViewById(R.id.value_input); //user input
        result_output = findViewById(R.id.result_output); //result output
        convert_button = findViewById(R.id.convert_button); //convert button
        source_unit_spinner = findViewById(R.id.source_unit_spinner); //unit input
        destination_unit_spinner = findViewById(R.id.destination_unit_spinner); //unit output

        //declare object image buttons to change unit types
        button_measurement = findViewById(R.id.button_measurement); //measurement
        button_weight = findViewById(R.id.button_weight); //weight
        button_temperature = findViewById(R.id.button_temperature); //temperature

        //Create array to store array string of unit_types_length
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.unit_types_length));
        //call toString and convert each item in array into view
        source_unit_spinner.setAdapter(dataAdapter);
        destination_unit_spinner.setAdapter(dataAdapter);


        //Button OnClick Listener Temp
        button_temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "To Temperature Convertor!", Toast.LENGTH_SHORT).show();

                //Start weight Activity
                Intent myIntentTemp = new Intent(MainActivity.this, ConvertTempActivity.class);
                startActivity(myIntentTemp);
            }
        });

        //Button OnClick Listener Weight
        button_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "To Weight Convertor", Toast.LENGTH_SHORT).show();

                //Start weight Activity
                Intent myIntentWeight = new Intent(MainActivity.this, ConvertWeightActivity.class);
                startActivity(myIntentWeight);
            }
        });

        //Event handler for Convert button
        convert_button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                //Get inputs from spinners
                String unitA = source_unit_spinner.getSelectedItem().toString();
                String unitB = destination_unit_spinner.getSelectedItem().toString();
                //Check user input
                double input  = getInput();

                //Convert Length
                ConvertLength convertLen = new ConvertLength();
                double result = convertLen.lengthConversion(input, unitA, unitB);
                //Please wait for result to print
                Toast.makeText(MainActivity.this, result+"", Toast.LENGTH_SHORT).show();
                result_output.setText( String.valueOf( result ) );

            }
        });
    }

    //Method to store user input
    private Double getInput() {
        EditText userInput = findViewById(R.id.value_input);
        String input = userInput.getText().toString();
        Double validate = tryParseDouble(input);
        if (validate != 0)
            return validate;
        else
            return 0.0;
    }

    //Method to validate the userInput
    private double tryParseDouble(String userInput) {
        if (userInput != null || !userInput.isEmpty() ||!userInput.equals(".")) {
            try {
                return Double.parseDouble(userInput);
            }
            catch (Exception e) {
                Toast.makeText(this, "Enter a number.", Toast.LENGTH_SHORT).show();
                return 0;
            }
        }
        else
            Toast.makeText(this, "Enter a number.", Toast.LENGTH_SHORT).show();
        return 0;
    }


}