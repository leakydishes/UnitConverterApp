package com.example.unitconverterapp;

public class ConvertWeight {

    public double WeightConversion(double input, String unitA, String unitB)
    {
        // Constant variable to replace conversion
        double constant = 1;
        //check unitA against UnitB for conversion
        if (unitA.equals("KILOGRAM")) {
            if (unitB.equals("OUNCE")) constant = input * 35.274;
            else if (unitB.equals("POUND")) constant = input * 2.205;
            else if (unitB.equals("TON")) constant = input/907.2;
            else if (unitB.equals("GRAM")) constant = input * 1000;
        }
        if (unitA.equals("GRAM")) {
            if (unitB.equals("OUNCE")) constant = input/28.34952;
            else if (unitB.equals("POUND")) constant = input/453.592;
            else if (unitB.equals("TON")) constant = input * 1.0E-6;
            else if (unitB.equals("KILOGRAM")) constant = input/1000;
        }
        if (unitA.equals("POUND")) {
            if (unitB.equals("OUNCE")) constant = input * 16;
            else if (unitB.equals("TON")) constant = input * 0.00045359237;
            else if (unitB.equals("KILOGRAM")) constant = input + 0.45359237;
            else if (unitB.equals("GRAM")) constant = input + 453.59237;
        }
        if (unitA.equals("OUNCE")) {
            if (unitB.equals("POUND")) constant = input * 16;
            else if (unitB.equals("TON")) constant = input/32000;
            else if (unitB.equals("KILOGRAM")) constant = input * 0.02834952;
            else if (unitB.equals("GRAM")) constant = input * 28.34952;
        }
        if (unitA.equals("TON")) {
            if (unitB.equals("POUND")) constant = input/0.00045359237;
            else if (unitB.equals("OUNCE")) constant = input * 35273.96194958;
            else if (unitB.equals("KILOGRAM")) constant = input * 1000;
            else if (unitB.equals("GRAM")) constant = input * 1000000;
        }
        return constant;
    }
}
