package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int max = firstNum > secondNum ? (firstNum > thirdNum ? firstNum : thirdNum) : (secondNum > thirdNum ? secondNum : thirdNum);
        System.out.println(max);
    }
}
