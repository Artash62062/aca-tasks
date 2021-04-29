package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class Task16 {
    public static void main(String[] args) {
        double a,b,c;
        boolean hasAnswer;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c= scanner.nextInt();
        double d = (Math.pow(b,2)- 4*a*c);
        double x1;
        double x2;
        if(d >0) {
            x1 = (b*(-1))+Math.sqrt(d);
            x2 = (b*(-1))-Math.sqrt(d);
        } else {
            System.out.println("Have No Solutions");
        }

    }
}
