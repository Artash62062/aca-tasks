package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Number");
        int num = scanner.nextInt();
        num = num+10;
        switch (num/10) {
            case 1 :
                System.out.println(num-10);
                break;
            default:
                System.out.println("Not allowed");
        }


    }
}
