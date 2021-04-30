package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = num % 2;
        switch (num) {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;
        }
    }
}
