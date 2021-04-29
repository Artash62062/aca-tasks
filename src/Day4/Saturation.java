package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
//98,70,50,30,0
public class Saturation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Saturation");
        int saturation = scanner.nextInt();
        if(saturation>98) {
            System.out.println("You are Very Healthy");
        } else if (saturation > 70) {
            System.out.println("You Are Healthy");
        } else if (saturation > 50) {
            System.out.println("You are normal");
        } else if (saturation > 30) {
            System.out.println("You are not very good");
        } else if (saturation > 0) {
            System.out.println("you fill bad");
        } else {
            System.out.println("You Cant Read This");
        }
    }
}
