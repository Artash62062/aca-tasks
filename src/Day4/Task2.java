package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*Write a Java program to determine whether an input number is an even number.*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Write the Number:");
        int number = scanner.nextInt();

        if(number%2==1) {
            System.out.println("Number is Odd");
        }
    }
}
