package practice.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte choice;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Select task number for execution or exit");
            System.out.println("1 - 10 integer numbers");
            System.out.println("2 - 5 integer numbers");
            System.out.println("3 - Product of even numbers");
            System.out.println("4 - Class Car ");
            System.out.println("5 - exit");
            System.out.println("\n");
            choice = sc.nextByte();

            switch (choice) {
                case 1:
                    ;
                    break;
                case 2:
                    IntArrays.minimumIntNum();
                    break;
                case 3:
                    IntArrays.multiplyingEvenNumbers();
                    break;
                case 4:
                    IntArrays.sortingCars();
                    break;
                default:
                    break;
            }// end switch

        } while (choice != 5);// end do
    }
}
