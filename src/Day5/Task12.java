package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the weekday :");
        String string = scanner.nextLine().toLowerCase();
        switch (string) {
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Unexpected Weekday");
        }
    }
}
