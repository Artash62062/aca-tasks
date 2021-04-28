package Day3;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * @author Artash-PC on 4/28/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte num = scanner.nextByte();
        short numToShort = num;
        System.out.println("byte:" + num + " short:" + numToShort);
        int numToInt = numToShort;
        System.out.println("short:" + numToShort + " int:" + numToInt);
        long numToLong = numToInt;
        System.out.println("int:" + numToInt + " long:" + numToLong);
        float numToFloat = numToLong;
        System.out.println("long:" + numToLong + " float:" + numToFloat);
        double numToDouble = numToFloat;
        System.out.println("float:" + numToFloat + " double:" + numToDouble);
    }
}
