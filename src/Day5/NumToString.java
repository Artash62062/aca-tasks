package Day5;

import java.util.Scanner;

/**
 * @author Artash-PC on 4/30/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class NumToString {


    public static void main(String[] args) {

        String thousand = " Հզար";
        String million = " Միլիոն";
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numLength = String.valueOf(num).length();
        String answer = "";
        int millions = num / 1000000;
        num %= 1000000;
        int thousands = num / 1000;
        num = num % 1000;
        if (millions > 0) {
            answer += getHundredsString(millions) + million;
        }
        if (thousands > 0) {
            answer += getHundredsString(thousands) + thousand;
        }

        if (num > 0) {
            answer += getHundredsString(num);
        }

        System.out.println(answer);

    }


    public static String getHundredsString(int num) {
        String hundred = " Հարյուր";

        int firstNum = num / 100;
        int secondNum = num % 100 / 10;
        int thirdNum = num % 10;
        String retString = "";

        if (firstNum == 1 ) {
            retString +=  hundred;
        } else if( firstNum > 0) {
            retString += getPointNum(firstNum) +hundred;
        }

        if (secondNum <= 0) {
            return retString += getPointNum(thirdNum);
        } else if (secondNum == 1) {
            retString += tasnyQanisner(thirdNum);
        } else {
            retString += getTens(secondNum) + getPointNum(thirdNum);
        }

        return retString;
    }

    public static String getPointNum(int num) {
        String one = " Մեկ";
        String two = " Երկու";
        String tree = " Երեք";
        String four = " Չորս";
        String five = " Հինգ";
        String six = " Վեց";
        String seven = " Յոթ";
        String eight = " Ութ";
        String nine = " Ինը";
        String str = "";
        switch (num) {
            case 1:
                str += one;
                break;
            case 2:
                str += two;
                break;
            case 3:
                str += tree;
                break;
            case 4:
                str += four;
                break;
            case 5:
                str += five;
                break;
            case 6:
                str += six;
                break;
            case 7:
                str += seven;
                break;
            case 8:
                str += eight;
                break;
            case 9:
                str += nine;
                break;
            default:
        }
        return str;
    }

    public static String getTens(int num) {

        String twenty = " Քսան";
        String thirty = " Երեսուն";
        String forty = " Քառասուն";
        String fifty = " Հիսուն";
        String sixty = " Վաթսուն";
        String seventy = " Յոթանասուն";
        String eighty = " Ութանասուն";
        String ninety = " Իննսուն";
        String str = "";
        switch (num) {
            case 2:
                str += twenty;
                break;
            case 3:
                str += thirty;
                break;
            case 4:
                str += forty;
                break;
            case 5:
                str += fifty;
                break;
            case 6:
                str += sixty;
                break;
            case 7:
                str += seventy;
                break;
            case 8:
                str += eighty;
                break;
            case 9:
                str += ninety;
                break;
            default:
        }
        return str;
    }

    public static String tasnyQanisner(int num) {

        String eleven = " Տասնմեկ";
        String twelve = " Տասներկու";
        String thirteen = " Տասներեք";
        String fourteen = " Տասնըչորս";
        String fifteen = " Տասնըհինգ";
        String sixteen = " Տասնըվեց";
        String seventeen = " Տասնըյոթ";
        String nineteen = " Տասնըութ";
        String eighteen = " Տասնըինը";
        String teen = " Տաս";
        String str = "";
        switch (num) {
            case 0:
                str += teen;
            case 1:
                str += eleven;
                break;
            case 2:
                str += twelve;
                break;
            case 3:
                str += thirteen;
                break;
            case 4:
                str += fourteen;
                break;
            case 5:
                str += fifteen;
                break;
            case 6:
                str += sixteen;
                break;
            case 7:
                str += seventeen;
                break;
            case 8:
                str += nineteen;
                break;
            case 9:
                str += eighteen;
                break;

        }
        return str;
    }

}
