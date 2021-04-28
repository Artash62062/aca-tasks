package Day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        System.out.println(num1+"\n"+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println(num1+"\n"+num2);
    }
}
