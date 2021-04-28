package Day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/28/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */

/*
 3 .Write a Java program to convert temperature from Fahrenheit to
 Celsius degree. (Input parameter from console)
    Print the result
    Cast the result to float type,print float type
    Cast result to int,print int type
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatureFahrenheit = scanner.nextDouble();
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in celsius is :" + temperatureCelsius);
        float temperatureCelsiusFloat = (float) temperatureCelsius;
        System.out.println("Temperature in celsius casted to Float is :" + temperatureCelsiusFloat);
        int temperatureCelsiusInt = (int) temperatureCelsius;
        System.out.println("Temperature in celsius casted to Float is :" + temperatureCelsiusInt);
    }
}
