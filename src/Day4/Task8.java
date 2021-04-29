package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the Balls Count:");
        int iceCreamBallCount = scanner.nextInt();
        if(iceCreamBallCount<3 || iceCreamBallCount==4||iceCreamBallCount==5) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
