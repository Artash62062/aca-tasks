package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task17 {
    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        int max = num1, min = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        if (num1 != max && num1 != min) {
            System.out.println(min + " " + num1 + " " + max);
        } else if (num2 != max && num2 != min) {
            System.out.println(min + " " + num2 + " " + max);
        } else {
            System.out.println(min + " " + num3 + " " + max);
        }

    }
}
