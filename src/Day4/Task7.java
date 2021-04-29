package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*Write a Java program that keeps a number from the user
and generates an integer between 1 and 7 and displays the name of the weekday.*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0 ;
        
        System.out.println("for Generating Random weekday day press 1");
        System.out.println("for getting weekday by Number press 2 ");
        int flag = scanner.nextInt();
        if( flag == 1 ) {
            System.out.print("input the number of weekday:");
            num = scanner.nextInt();
            if(num>7){
                System.out.println("Unknown number: Larges weekday number is 7 ");
            }
        } else if (flag == 2) {
            num = (int)((Math.random()*(7-1)+1));
        } else {
            System.out.println("Unknown Input");
        }
        if(num == 1 ) {
            System.out.println("Monday");
        } else if (num == 2 ) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4 ) {
            System.out.println("Thursday");
        } else if (num == 5 ) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else if (num == 7) {
            System.out.println("Sunday");
        }
    }
}
