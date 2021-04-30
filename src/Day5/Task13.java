package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quiz score:");
        int quizScore = scanner.nextInt();
        System.out.print("Mid-term score:");
        int midTermScore = scanner.nextInt();
        System.out.print("Final score:");
        int finalScore = scanner.nextInt();
        int averageScore = (quizScore + midTermScore + finalScore) / 3;
        int temp = averageScore+20 / 20;

        String grade = "grade = ";
        switch (temp) {
            case 6:
            case 5:
                grade += "A";
                System.out.println(grade);
                break;
            case 4:
                grade += "B";
                System.out.println(grade);
                break;
            case 3:
                grade += "C";
                System.out.println(grade);
                break;
            case 2:
            case 1:
                grade += "D";
                System.out.println(grade);
                break;
            default:
                System.out.println("Its not real get more than 100 or lass than 0 ");
        }

    }
}
