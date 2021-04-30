package Day5;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task8 {
    public static void main(String[] args) throws IOException {
        System.out.println("input the Character to check is it Vowel");
        Scanner scanner = new Scanner(System.in);
        String character = scanner.next().toUpperCase();
        String errorCase = character + "isn't a Vowel";
        String successCase = character + "is a Vowel";
        switch (character) {
            case "A":
            case "I":
            case "O":
            case "E":
            case "U":
                System.out.println(successCase);
                break;
            default:
                System.out.println(errorCase);
        }
    }
}
