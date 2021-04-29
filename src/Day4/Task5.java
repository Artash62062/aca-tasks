package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*Take three numbers from the user and print the greatest number.*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int max = firstNum;
        if (secondNum > max) {
            max = secondNum;
        }
        if (thirdNum > max) {
            max = thirdNum;
        }
        System.out.println("The greatest number is " + thirdNum);
    }
}
