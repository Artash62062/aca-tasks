package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/* Given 3 positive numbers different from 0, Determine if there is a non-degenerate triangle with such sides.
Input numbers from console*/
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if(side1+side2>side3||side2+side3>side1||side1+side3<side2) {
            System.out.println(true);
        }
    }
}
