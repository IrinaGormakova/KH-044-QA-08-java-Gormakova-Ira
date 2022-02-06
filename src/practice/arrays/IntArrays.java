package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntArrays {

    public static void multiplyingEvenNumbers() {
        int product = 1;
        int currentNum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers until the first negative number");
        while ((currentNum = sc.nextInt()) >= 0) {
            if (currentNum != 0 && (currentNum % 2) == 0) product *= currentNum;
        }
        System.out.println("Product of all entered even numbers= " + product);
    }//end multiplyingEvenNumbers

    public static void sortingCars() {
        ArrayList<Car> cars = new ArrayList<>();

        Car opel = new Car("Opel Astra", 1.6F, 1996);
        Car volkswagen = new Car("Volkswagen Polo", 1.6F, 2014);
        Car citroen = new Car("Citroen C3 ", 1.4F, 2018);
        Car nissan = new Car("Nissan Juke", 1.6F, 2018);

        cars.add(opel);
        cars.add(volkswagen);
        cars.add(citroen);
        cars.add(nissan);

        Collections.sort(cars);
        System.out.println("Cars sorted by the field year");
        System.out.println(cars);
        System.out.println("Enter model year...");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        for (Car element : cars) if (element.getProductionYear() == year) System.out.println(element);
    }//end sortingCars

    public static void minimumIntNum() {
        int[] arrInt = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any five integer numbers...");
        for (int i=0; i<arrInt.length; i++) arrInt[i] = sc.nextInt();
        int min = arrInt[0];
        int position = 0;
        int i = 0;
        do {
            if (arrInt[i] < min) {
                min = arrInt[i];
                position = i;
            }
        } while (++i < arrInt.length);

        System.out.print("Minimum number= " + min);
        System.out.println(" is in " + (position + 1) + " position");
        i = 1;
        for (int j = 0; j < 5; j++) {
            if (arrInt[j] > 0 && i != 0) i--;
            else if (arrInt[j] > 0 && i == 0) {
                i--;
                System.out.println("The second positive number= " + arrInt[j]);
                break;
            }
        }//end for
        if (i>=0) System.out.println("There are no positive numbers or only one in the array ");

    }//end minimumIntNum
}
