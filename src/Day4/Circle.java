package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requestId;
        int radius;
        System.out.print("Input the radius of Circle:");
        radius = scanner.nextInt();
        System.out.println("Press 1 for Perimeter");
        System.out.println("Press 2 for Area");
        requestId = scanner.nextInt();
        if (requestId == 1) {
            System.out.println(2 * Math.PI * radius);
        } else if (requestId == 2) {
            System.out.println(Math.PI * Math.pow(radius, 2));
        } else {
            System.out.println("Undefined Request:");
        }
    }
}
