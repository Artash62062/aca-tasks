package Day4;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/*. Input int values a and b from console
if one of them is multiple of 7, and both positive, and a greater than b, print true
else print false*/
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if((a%7==0||b%7==0)&&(b>0)&&(a>b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
