package Day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num/=10;
        System.out.println(num%10);
        scanner.close();
    }
}
