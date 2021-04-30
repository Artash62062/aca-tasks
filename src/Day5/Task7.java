package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Capital of Great Britain is \n 1.London \n 2.Boston \n 3.Bern");
        int answerCode = scanner.nextInt();
        switch (answerCode) {
            case 1:
                System.out.println("Congratulations the answer is Correct");
                break;
            default:
                System.out.println("Incorrect answer try again later");
        }
    }
}
