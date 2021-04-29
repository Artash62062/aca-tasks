package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*Given coordinates of two points in the coordinate plane.Write java program to check if the points lie in the same plane?(quarter)
Print In the same quarter , else print Not in the same quarter.
Input 4 coordinates from console, all 4 coordinates != 0.*/
public class Task13 {
    public static void main(String[] args) {
        int aCordX;
        int aCordY;

        int bCordX;
        int bCordY;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input X cordinate for a Point");
        aCordX = scanner.nextInt();
        System.out.println("Input Y cordinate for a Point");
        aCordY = scanner.nextInt();

        System.out.println("Input X cordinate for b Point");
        bCordX = scanner.nextInt();
        System.out.println("Input Y cordinate for b Point");
        bCordY = scanner.nextInt();
            boolean isInSameQuarter=false;
        if ((aCordX > 0 && bCordX > 0) && (aCordY > 0 && bCordY > 0)) {
            isInSameQuarter = true;
        } else if((aCordX < 0 && bCordX < 0) && (aCordY > 0 && bCordY > 0)) {
            isInSameQuarter =true;
        } else if((aCordX < 0 && bCordX < 0) && (aCordY < 0 && bCordY < 0)) {
            isInSameQuarter =true;
        } else if((aCordX > 0 && bCordX > 0) && (aCordY < 0 && bCordY < 0)) {
            isInSameQuarter = true;
        }

        System.out.println(isInSameQuarter);
    }
}

