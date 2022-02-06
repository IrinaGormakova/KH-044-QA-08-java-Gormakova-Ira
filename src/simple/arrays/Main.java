package simple.arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    byte choice;

    Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Select task number for execution or exit");
        System.out.println("1 - Eiler number");
        System.out.println("2 - Tribonacci numbers");
        System.out.println("3 - TriangularPatternX");
        System.out.println("4 - Reverse double");
        System.out.println("5 - Print triangle");
        System.out.println("6 - Print square");
        System.out.println("7 - exit");
        System.out.println("\n");
        choice=sc.nextByte();

        switch (choice){
            case 1:SimpleArrays.numbersEiler();
                break;
            case 2:SimpleArrays.numbersTribonacci(20);
                break;
            case 3:SimpleArrays.printPatternX();
                break;
            case 4: SimpleArrays.reverseDouble();
                break;
            case 5:SimpleArrays.printTriangle();
                break;
            case 6: SimpleArrays.printSquare();
                break;
            default: break;

        }// end switch

    } while (choice!=7);// end do
}

}

