package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*.Input from console int a and int b, if a and b corresponds for following requirements print “Both a and b legal”, if any of them does not correspond print about it like this “a is legal b is illegal ''. or vice versa
a > 10 and b is not equal to 10
both a and b is positive
both a and b is negative
a > 10 b < 1 both of them are odd
a is a multiple of 5 OR b is a multiple of 5
a is not a multiple of 5 but b is a multiple of 5*/
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String string;

        System.out.println("a > 10 and b is not equal to 10");
        if (a > 10 && b != 10) {
            string = "Both a and b is Legal";
        } else if (a > 10) {
            string = "a is legal b is illegal";
        } else if (b != 10) {
            string = "b is legal a is illegal";
        } else {
            string = "both is illegal";
        }

        System.out.println("both a and b is positive");
        System.out.println(string);
        if (a > 0 && b > 0) {
            string = "Both a and b is Legal";
        } else if (a > 0) {
            string = "a is legal b is illegal";
        } else if (b > 10) {
            string = "b is legal a is illegal";
        } else {
            string = "both is illegal";
        }
        System.out.println(string);


        System.out.println("both a and b is negative");
        if (a < 0 && b < 0) {
            string = "Both a and b is Legal";
        } else if (a < 10) {
            string = "a is legal b is illegal";
        } else if (b < 0) {
            string = "b is legal a is illegal";
        } else {
            string = "both is illegal";
        }
        System.out.println(string);

        System.out.println("a > 10 b < 1 both of them are odd");
        if ((a > 10 && b < 1) && (a % 2 != 0 && b % 2 != 0)) {
            string = "Both a and b is Legal";
        } else if (a > 10 && a % 2 != 0) {
            string = "a is legal b is illegal";
        } else if (b < 1 && b % 2 != 0) {
            string = "b is legal a is illegal";
        } else {
            string = "both is illegal";
        }
        System.out.println(string);

        System.out.println("a > 10 b < 1 both of them are odd");
        if ((a > 10 || b < 1) && (a % 2 != 0 && b % 2 != 0)) {
            string = "Both a and b is Legal";
        } else if (a > 10 && a % 2 != 0) {
            string = "a is legal b is illegal";
        } else if (b < 1 && b % 2 != 0) {
            string = "b is legal a is illegal";
        } else {
            string = "both is illegal";
        }
        System.out.println(string);

        System.out.println("a is a multiple of 5 OR b is a multiple of 5");
        if (a % 5 == 0 && b % 5 == 0) {
            string = "Both a and b is Legal";
        } else if (a % 5 == 0) {
            string = "a is legal b is illegal";
        } else if (b % 5 == 0) {
            string = "b is legal a is illegal";
        } else {
            string = "both is illegal";
        }
        System.out.println(string);

        System.out.println("a is not a multiple of 5 but b is a multiple of 5*/");
        if (a % 5 != 0 && b % 5 == 0) {
            string = "Both a and b is Legal";
        } else if (a % 5 != 0) {
            string = "a is legal b is illegal";
        } else if (b % 5 == 0) {
            string = "b is legal a is illegal";
        } else {
            string = "both is illegal";
        }
        System.out.println(string);
    }
}
