package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String str = a > 0 ? "positive" : "negative";
        System.out.println(str);
    }
}
