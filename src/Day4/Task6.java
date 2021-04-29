package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*Write a Java program that reads a floating-point
number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number is less than 1,
or "large" if it exceeds 1,000,000 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if(num == 0) {
            System.out.println("Zero");
        } else if(num >0) {
            String answer = "Positive";
            if(num<1) {
                answer += "small";
            }
            if(num>1000000) {
                answer += "large";
            }
            System.out.println(answer);
        } else if(num < 0) {
            System.out.println("Negative");
        }
    }
}
