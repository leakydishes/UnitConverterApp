package com.example.unitconverterapp;

public class ConvertTemp {

    public double TempConversion(double input, String unitA, String unitB)
    {
        // Constant variable to replace conversion
        double constant = 1;
        //check unitA against UnitB for conversion
        if (unitA.equals("CELSIUS")) {
            if (unitB.equals("FAHRENHEIT")) constant = (input * 1.8) + 32;
            else if (unitB.equals("KELVIN")) constant = input + 273.15;
        }
        if (unitA.equals("FAHRENHEIT")) {
            if (unitB.equals("CELSIUS")) constant = (input - 32)/ 1.8;
            else if (unitB.equals("KELVIN")) constant = input + 273.15;
        }
        if (unitA.equals("KELVIN")) {
            if (unitB.equals("CELSIUS")) constant = input - 273.15;
            else if (unitB.equals("FAHRENHEIT")) constant = (input-273.15) * 1.8 + 32;
        }
        return constant;
    }

}
