package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class AndOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the num:");
        int inputNum = scanner.nextInt();

        if(inputNum>10&& inputNum<=100) {
            System.out.println("input Number is in range of 10->100");
        } else if ( inputNum>100 && inputNum<=200 ) {
            System.out.println("Input num is in range of 100->200");
        } else if ( inputNum > 200 && inputNum <=300) {
            System.out.println("Input num is in range 200->300");
        } else {
            System.out.println("Number higher than 300 or number smaller than 10");
        }
    }
}
