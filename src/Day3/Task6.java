package Day3;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Artash-PC on 4/28/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char nameFirstChar = (char) System.in.read();
        char nameSecondChar = (char) System.in.read();
        char nameThirdChar = (char) System.in.read();
        int birthYear = scanner.nextInt();

        System.out.println("Name:" + nameFirstChar+nameSecondChar+nameThirdChar);
        System.out.println("Year of birth:" + birthYear);
    }
}
