package Day2;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(arithmeticSequence(10));
        System.out.println(arithmeticSequence(15));
        String string = "Artash";
        char c = string.charAt(4);
        System.out.println(c);
    }

    public static int arithmeticSequence (int n) {
        return 3 *n*n - 12*n;
    }
}
