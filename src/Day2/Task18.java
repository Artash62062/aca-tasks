package Day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        for (int i = 0; i < 3; i++) {
            sum += num % 10;
            num /=10;
        }
        System.out.println(sum);
    }
}
