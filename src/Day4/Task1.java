package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/* Write a Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age  = scanner.nextInt();
        if(age >=18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote ");
        }
    }
}
