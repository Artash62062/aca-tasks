package Day2;

import java.util.Random;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int randInt = 15 + random.nextInt(15);
        System.out.println(randInt);
    }
}
