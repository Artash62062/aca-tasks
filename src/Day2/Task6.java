package Day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        int average = (firstNum+secondNum+thirdNum)/3;
        System.out.println(average);
        System.out.println(firstNum-secondNum-thirdNum);
        System.out.println(firstNum+secondNum+thirdNum);
    }
}
