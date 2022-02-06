package simple.arrays;

import java.math.BigDecimal;
import java.util.Arrays;

import java.util.Scanner;
import java.util.regex.*;

import static java.lang.String.*;


public class SimpleArrays {


    public static void printTriangle() {

        char[][] arr = createTwoArray(5, 9);
        int row = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = row; j <= (arr[i].length - 1 - row); j += 2) {
                arr[i][j] = '*';
            } //end for j
            row++;
        }///end for i
        printTwoArray(arr);
    }//end printTriangle

    public static void printSquare() {

        char[][] arr = createTwoArray(10, 10);
        printTwoArray(arr);
    }//end printTriangle

    public static void printTwoArray(char[][] arrForPrint) {
        for (int i = 0; i < arrForPrint.length; i++) {
            for (int j = 0; j < arrForPrint[i].length; j++) {
                System.out.print(arrForPrint[i][j]);
            } //end for j
            System.out.println();
        }///end for i
        System.out.println();
    }//printTwoArray

    public static char[][] createTwoArray(int x, int y) {
        char[][] newArr = new char[x][y];
        for (char[] element : newArr) {
            Arrays.fill(element, '-');
        }///end for i
        return newArr;
    }//end createTwoArray

    public static void printPatternX() {
        int edge;
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            flag = false;
            System.out.println("Enter non-negative integer to determine size of triangles");
            edge = sc.nextInt();
            if (edge <= 0) {
                System.out.println("Error: size of triangles can't be negative or zero");
                flag = true;
            }
        } while (flag);

        char[][] arrA = createTwoArray(edge, edge);
        char[][] arrB = createTwoArray(edge, edge);
        char[][] arrC = createTwoArray(edge, edge);
        char[][] arrD = createTwoArray(edge, edge);
        for (int k = 0; k < edge; k++) {
            Arrays.fill(arrA[k], 0, k + 1, '#');
            Arrays.fill(arrB[k], 0, arrB.length - k, '#');
            Arrays.fill(arrC[k], k, arrC.length, '#');
            Arrays.fill(arrD[k], arrD.length - 1 - k, arrD.length, '#');
        }
        printTwoArray(arrA);
        printTwoArray(arrB);
        printTwoArray(arrC);
        printTwoArray(arrD);
    }//end printPatternX

    public static void reverseDouble() {
        //Double doubleString;
        boolean flag;

        do {
            flag = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter double number");
        /*
        doubleString = sc.nextDouble();
        System.out.println(doubleString);

        StringBuilder sb = new StringBuilder(new BigDecimal(doubleString.toString()).stripTrailingZeros().toPlainString());
        System.out.println(sb);

         */
            String doubleString = sc.nextLine();
            String pattern = "^\\d+,\\d+$";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(doubleString);

            if (m.matches()) {
                StringBuilder sb = new StringBuilder(doubleString).reverse();
                int i = 0;
                while (i < sb.length()) {
                    sb.insert(i, ' ');
                    i += 2;
                }
                System.out.println(sb);
            } else flag = true;
        }
        while (flag);
    }//end reverseDouble

    public static void numbersTribonacci(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) arr[i] = 0;
            else if (i == 2) arr[i] = 1;
            else arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        System.out.println(String.join(", ", Arrays.toString(arr)));
    }//end numbersTribonacci

    public static void numbersEiler() {
        System.out.println("maxDenominator 16:\t" + countingEiler(16));
        System.out.println("maxDenominator 10000:\t" + countingEiler(10000));
        System.out.println("maxDenominator 100000:\t" + countingEiler(100000));
    }

    public static double countingEiler(int maxDenominator) {

        double e = 1.0;
        double recursion = 1.0;
        int j = 1;
        do {
            recursion *= j;
            e = e + (1 / recursion);
        } while (++j <= maxDenominator);
        return e;
    }
/*
    public static BigDecimal countingEiler(int maxDenominator) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal recursion = BigDecimal.ONE;
        BigDecimal j = BigDecimal.ONE;
        do {
            recursion = recursion.multiply(j);
            e = e.add(BigDecimal.ONE.divide(recursion, RoundingMode.CEILING));
            j = j.add(BigDecimal.ONE);
        } while (j.intValue() <= maxDenominator);
        return e;
    }
*/

}//end class


