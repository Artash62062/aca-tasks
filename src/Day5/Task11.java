package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number :");
        int num1 = scanner.nextInt();
        System.out.print("input the second number :");
        int num2 = scanner.nextInt();
        System.out.println("Enter the Operation (+,-,/,* ,other operators will be added soon) :");
        String operator = scanner.nextLine();
        int answer ;
        String answerStr = num1 + operator + num2 + "=";
        switch (operator){
            case "+":
                answer = num1 + num2;
                System.out.println(answerStr + answer);
                break;
            case"-":
                answer = num1 - num2;
                System.out.println(answerStr + answer);
                break;
            case"*":
                answer = num1 * num2;
                System.out.println(answerStr + answer);
                break;
            case"/":
                answer = num1 / num2;
                System.out.println(answerStr + answer);
                break;
            default:
                System.out.println("Unexpected Number or Operator");
        }
    }
}
