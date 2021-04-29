package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*Write a Java program that takes a year from the user and print whether that year is a leap year or not.*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isLeap = false;
        if(num%4==0) {
            if(num % 100==0 ) {
                if(num%400==0) {
                    isLeap = true;
                }
            }else {
                isLeap =true;
            }
        }

        if(isLeap) {
            System.out.println("Yes " + num + " is Tandz Year");
        } else {
            System.out.println("No " + num + " isn't Tandz Year");
        }
    }
}
