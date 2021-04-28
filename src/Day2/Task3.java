package Day2;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task3 {
    public static void main(String[] args) {

        int odd = 1;
        int even = 0;
        int oddSum=odd;
        int evenSum=even;
        for (int i = 0; i <3; i++) {
            odd += 2;
            oddSum +=odd;
            even +=2;
            evenSum+= even;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
