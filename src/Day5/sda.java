package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class sda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Text 1 - ");
        String text1 = scanner.nextLine();
        System.out.print("Enter Text 2 - ");
        String text2 = scanner.nextLine();
        String answer = ((String)text1 == (String) text2) ? "Texts are same" : "Texts aren't same";
        System.out.println(answer);
    }
}
