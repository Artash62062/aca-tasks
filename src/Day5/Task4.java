package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b;
        int abs = a < 0 ? a * (-1) : a;
        System.out.println("max is " + max + "abs is" + abs);
    }
}
