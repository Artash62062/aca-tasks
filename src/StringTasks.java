import java.util.Scanner;

/**
 * @author Artash-PC on 4/28/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class StringTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        String string1 = String.valueOf(num1);
        String string2 = String.valueOf(num2);
        char charAtS1 = string1.charAt((string1.length() - 1) / 2);
        char charAtS2 = string2.charAt((string2.length() - 1) / 2);
        System.out.println(!(charAtS1 == charAtS2));
    }
}
