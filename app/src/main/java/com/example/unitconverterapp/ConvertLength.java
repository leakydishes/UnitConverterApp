package com.example.unitconverterapp;

import android.widget.Toast;

public class ConvertLength {
    //Length Conversion
    public double lengthConversion(double input, String unitA, String unitB){
        // Constant variable to replace conversion
        double constant = 1;
        //check unitA against UnitB for conversion
        if (unitA.equals("INCH")) {
            if (unitB.equals("CENTIMETER")) constant = 2.45;
            else if (unitB.equals("FOOT")) constant = 0.0833333;
            else if (unitB.equals("YARD")) constant = 0.0277778;
            else if (unitB.equals("METER")) constant = 0.0254;
            else if (unitB.equals("MILE")) constant = 1.5783e-5;
            else if (unitB.equals("KILOMETER")) constant = 2.54e-5;
        }
        if (unitA.equals("CENTIMETER")) {
            if (unitB.equals("INCH")) constant = 0.393701;
            else if (unitB.equals("FOOT")) constant = 0.0328084;
            else if (unitB.equals("YARD")) constant = 0.0109361;
            else if (unitB.equals("METER")) constant = 0.01;
            else if (unitB.equals("MILE")) constant = 6.2137e-6;
            else if (unitB.equals("KILOMETER")) constant = 1e-5;
        }
        if (unitA.equals("FOOT")) {
            if (unitB.equals("CENTIMETER")) constant = 30.48;
            else if (unitB.equals("INCH")) constant = 12;
            else if (unitB.equals("YARD")) constant = 0.333333;
            else if (unitB.equals("METER")) constant = 0.3048;
            else if (unitB.equals("MILE")) constant = 0.000189394;
            else if (unitB.equals("KILOMETER")) constant = 0.0003048;
        }
        if (unitA.equals("YARD")) {
            if (unitB.equals("CENTIMETER")) constant = 91.44;
            else if (unitB.equals("FOOT")) constant = 3;
            else if (unitB.equals("INCH")) constant = 36;
            else if (unitB.equals("METER")) constant = 0.9144;
            else if (unitB.equals("MILE")) constant = 0.000568182;
            else if (unitB.equals("KILOMETER")) constant = 0.0009144;
        }
        if (unitA.equals("METER")) {
            if (unitB.equals("CENTIMETER")) constant = 100;
            else if (unitB.equals("FOOT")) constant = 3.28084;
            else if (unitB.equals("YARD")) constant = 1.09361;
            else if (unitB.equals("INCH")) constant = 39.3701;
            else if (unitB.equals("MILE")) constant = 0.000621371;
            else if (unitB.equals("KILOMETER")) constant = 0.001;
        }
        if (unitA.equals("MILE")) {
            if (unitB.equals("CENTIMETER")) constant = 160934;
            else if (unitB.equals("FOOT")) constant = 5280;
            else if (unitB.equals("YARD")) constant = 1760;
            else if (unitB.equals("INCH")) constant = 63360;
            else if (unitB.equals("METER")) constant = 1609.34;
            else if (unitB.equals("KILOMETER")) constant = 1.60934;
        }
        if (unitA.equals("KILOMETER")) {
            if (unitB.equals("CENTIMETER")) constant = 100000;
            else if (unitB.equals("FOOT")) constant = 3280.84;
            else if (unitB.equals("YARD")) constant = 1093.61;
            else if (unitB.equals("INCH")) constant = 39370.1;
            else if (unitB.equals("METER")) constant = 1000;
            else if (unitB.equals("MILE")) constant = 0.621371;
        }

        return input * constant;
    }

}
