package Day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/28/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
/* 2. Narrowing Primitive Conversion (Explicit)
   Write java program, which has double type variable(Input variable from console)
Cast double  to float,print both variables
Cast float to long, print both variables
Cast long to int, print both variables
Cast int to short, print both results
Cast short to byte, print both results
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        float numToFloat = (float) number;
        System.out.println("Double:" + number + " Float:" + numToFloat);
        long numToLong = (long) numToFloat;
        System.out.println("Float:" + numToFloat + " Long:" + numToLong);
        int numToInt = (int) numToLong;
        System.out.println("Long:" + numToLong + " Int:" + numToInt);
        short numToShort = (short) numToInt;
        System.out.println("Int:" + numToInt + " Short:" + numToShort);
        byte numToByte = (byte) numToShort;
        System.out.println("Short:" + numToShort + " Byte:" + numToByte);
    }
}
