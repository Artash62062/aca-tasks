package Day4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt();
        boolean isInRange = (a > -1000 && a < 1000);
        boolean isMultiple = (a % 3 == 0 || a % 5 == 0);
        System.out.println("is num in range of (-1000,1000)" + isInRange);
        System.out.println("is num Multiple of 3 or 5 " + isMultiple);
    }
}
