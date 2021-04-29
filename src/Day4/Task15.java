package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int counter =0;
        if(num1 == num2) {
            counter ++ ;
        }
        if(num2==num3) {
            counter ++;
        }
        if(num1 == num3) {
            counter++;
        }

        System.out.println(counter);
    }
}
