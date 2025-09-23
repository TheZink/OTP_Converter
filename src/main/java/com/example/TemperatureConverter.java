package com.example;

public class TemperatureConverter {

    public static double FahrenheitToCelsius(double fahrenheit){
        double convert = (fahrenheit - 32) * 5.0 / 9.0;
        return convert;
    }
    
    public static double CelsiusToFahrenheit(double celsius){
        double convert = (celsius * 1.8) + 32;
        return convert;
    }

    public static boolean isExtremeTemperature(double celsius){
        if (celsius < -40.0 || celsius > 50.0){ return true; } 
        else { return false; }
    }

}
