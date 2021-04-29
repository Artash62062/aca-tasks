package Day4;

/**
 * @author Artash-PC on 4/29/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/* Generate and print random integer number between 2 to 7(not using bound) */
public class Task3 {
    public static void main(String[] args) {
        System.out.print("The Random Number is:");
        System.out.print((int)((Math.random()*(7-2)+2)));
    }
}
