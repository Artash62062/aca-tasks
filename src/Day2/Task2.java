package Day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        scanner.close();
        int hours = minutes/60;
        minutes%=60;
        System.out.println(hours + "hours and " + minutes+"minutes");
    }
}
