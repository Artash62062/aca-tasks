package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*Write a java program, which has 2 String variables, initialize them from console.
Compare them with == assignment
Compare them with equals to */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        boolean equalByRef = firstString == secondString;
        boolean equalByVal = firstString.equals(secondString);

        System.out.println("is String1 == String2 :" + equalByRef + "\n is String2 equal to String1 ");
    }
}
