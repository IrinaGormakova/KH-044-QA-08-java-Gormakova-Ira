package middle.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleArrays {

    public static char[][] createTwoArray(int x, int y) {
        char[][] newArr = new char[x][y];
        for (char[] element : newArr) {
            Arrays.fill(element, '-');
        }///end for i
        return newArr;
    }//end createTwoArray


    public static void fillingTwoArray () {
        int edge;
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            flag = false;
            System.out.println("Enter non-negative integer to determine size of 2D array");
            edge = sc.nextInt();
            if (edge <= 0) {
                System.out.println("Error: size of triangles can't be negative or zero");
                flag = true;
            }
        } while (flag);
        int[][] snailArray = new int[edge][edge];

        int count_cell = edge * edge;
        int val_cell = 1;
        int k = 1;

        do {
            for (int i = edge - k; i >= k - 1; i--) {
                snailArray[i][edge - k] = val_cell;
                val_cell += 1;
            }
            for (int m = edge - 1 - k; m >= k - 1; m--) {
                snailArray[k - 1][m] = val_cell;
                val_cell += 1;
            }
            for (int n = k; n <= edge - k; n++) {
                snailArray[n][k - 1] = val_cell;
                val_cell += 1;
            }
            for (int j = k; j <= edge - 1 - k; j++) {
                snailArray[edge - k][j] = val_cell;
                val_cell += 1;
            }
            k += 1;
        } while (val_cell <= count_cell);
        for (int i = 0; i < snailArray.length; i++) {
            System.out.println(String.join("", Arrays.toString(snailArray[i])));
        }///end for i
        System.out.println();
    }//end fillingTwoArray

    public static void countingSum (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer to determine sum of its digits");
        System.out.println("Sum of number's digits= "+sumDigits(Math.abs(sc.nextInt())));
    }

    public static int sumDigits(int n) {
        String arrayDigits = Integer.toString(n);
        int sum = 0;
        int i = -1;
        while (++i < arrayDigits.length()) {
            sum += Integer.parseInt(Character.toString(arrayDigits.charAt(i)));
        }
        return sum;
    }//end sumDigits

    public  static void compareStrings (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first line");
        String str1 = sc.nextLine();
        System.out.println("Enter the second line");
        String str2 = sc.nextLine();
        StringBuilder str1Tr = new StringBuilder(removeDuplicatesRegex(removeSpaces(str1)));
        StringBuilder str2Tr = new StringBuilder(removeDuplicatesRegex(removeSpaces(str2)));
        int i=0;
        while (i < str1Tr.length()) {
            if (str2Tr.indexOf(String.valueOf(str1Tr.charAt(i))) >= 0) {
                str2Tr.deleteCharAt(str2Tr.indexOf(String.valueOf(str1Tr.charAt(i))));
                str1Tr.deleteCharAt(i);
            } else i++;
        }
        System.out.println("1st doesn’t contain "+str2Tr);
        System.out.println("2nd doesn’t contain "+str1Tr);
    }

    public static String removeSpaces(String input) {
        return (input.toLowerCase().replaceAll(" ", ""));
    }

    public static String removeDuplicatesRegex(String input) {
        return new StringBuilder(new StringBuilder(input).reverse().toString().replaceAll("(.)(?=.*\\1)", "")).reverse().toString();
    }

    public static void printTriangleNumbers (){
        int edge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer to determine size of 2D array");
        edge = Math.abs(sc.nextInt());
        int[][] arr = new int[edge][2*edge-1];
        int row = 0;
        int k;
        for (int i = arr.length - 1; i >= 0; i--) {
            k=edge-row;
            for (int j = row; j <= (arr[i].length - 1 - row); j += 2) {
                arr[i][j] = k--;
            } //end for j
            row++;
        }///end for i
        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.join("", Arrays.toString(arr[i])).replaceAll("0|,|]|\\[", " "));
        }///end for i
    }//end printTriangleNumbers

    public static void printPatterns (){
        int edge,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter non-negative integer to determine size of 2D array");
        edge = Math.abs(sc.nextInt());
        char [][] arr=createTwoArray(2*edge-1, 2*edge-1);
        for (k = 0; k < edge; k++) {
            Arrays.fill(arr[k], 0, edge - k, '#');
            Arrays.fill(arr[k], k+edge-1, arr[k].length, '#');
        }
        for (k = edge-1; k < arr.length; k++) {
            Arrays.fill(arr[k], 0, k-edge+2, '#');
            Arrays.fill(arr[k], arr[k].length-k+edge-2, arr[k].length, '#');
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.join("", Arrays.toString(arr[i])).replaceAll("-|,|]|\\[", " "));
        }///end for i
    }//end printPatterns
}// end class MiddleArrays
