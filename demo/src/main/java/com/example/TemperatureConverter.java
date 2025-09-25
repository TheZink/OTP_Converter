package com.example;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Celsius to Fahrenheit converter. Give a value: ");
        double celsiusToFar = scanner.nextDouble();

        TemperatureConverter converter = new TemperatureConverter();
        System.out.println(converter.CelsiusToFahrenheit(celsiusToFar) + 
                            " Fahrenheit");
        scanner.close();
    }

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
