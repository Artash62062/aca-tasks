package Day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        short c = scanner.nextShort();
        int a = scanner.nextInt();
        int sum = a+b+c;
        System.out.println(sum);
    }
}
