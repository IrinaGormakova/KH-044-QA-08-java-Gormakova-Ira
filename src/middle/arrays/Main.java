package middle.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte choice;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Select task number for execution or exit");
            System.out.println("1 - Patterns");
            System.out.println("2 - Print triangle numbers");
            System.out.println("3 - Strings comparison");
            System.out.println("4 - ");
            System.out.println("5 - Sum of number's digits");
            System.out.println("6 - Snail");
            System.out.println("7 - exit");
            System.out.println("\n");
            choice = sc.nextByte();

            switch (choice) {
                case 1:
                    MiddleArrays.printPatterns();
                    break;
                case 2:
                    MiddleArrays.printTriangleNumbers();
                    break;
                case 3:
                    MiddleArrays.compareStrings();
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    MiddleArrays.countingSum();
                    break;
                case 6:
                    MiddleArrays.fillingTwoArray();
                    break;
                default:
                    break;

            }// end switch

        } while (choice!=7);// end do
    }
}
