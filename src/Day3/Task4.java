package Day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/28/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*
Compute area  and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = radius * Math.PI;
    }
}
