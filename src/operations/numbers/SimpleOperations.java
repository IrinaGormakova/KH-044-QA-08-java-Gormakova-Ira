package operations.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class SimpleOperations {


    public static void divisionFloat() throws IOException {
        float a, b;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first fractional number a");
        a = Float.parseFloat(br1.readLine());
        System.out.println("Enter the second fractional number b");
        b = Float.parseFloat(br1.readLine());
        float result = a / b;
        System.out.printf("Result a/b: %.3f", result);
        System.out.println();
    }//end divisionFloat

    public static void volumeCylinder() throws IOException {
        float radius;
        float height;
        float volume;
        boolean flag;

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        do {
            flag = false;
            System.out.println("Enter the radius of cylinder");
            radius = Float.parseFloat(br1.readLine());
            if (radius <= 0) {
                System.out.println("Error: radius value can't be negative");
                flag = true;
            }
        } while (flag);
        do {

            flag = false;
            System.out.println("Enter the height of cylinder");
            height = Float.parseFloat(br1.readLine());
            if (height <= 0) {
                System.out.println("Error: height value can't be negative");
                flag = true;
            }
        } while (flag);
        volume = (float) (Math.PI * Math.pow(radius, 2) * height);
        System.out.printf("Volume of cylinder: %.3f", volume);
        System.out.println();
    }//end volumeCylinder

    public static void hexToDec() throws IOException {

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter HEX number");
        int decNum = Integer.parseUnsignedInt(br1.readLine(), 16);
        System.out.println(decNum);
    }//end hexToDec

    public static void countingRoots() throws IOException {
        float root1, root2;

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number a");
        int a = Integer.parseInt(br1.readLine());
        System.out.println("Enter number b");
        int b = Integer.parseInt(br1.readLine());
        System.out.println("Enter number c");
        int c = Integer.parseInt(br1.readLine());
        int d = (int) (Math.pow(b, 2) - (4 * a * c));
        if (d > 0) {
            root1 = (float) (-b + Math.pow(d, 0.5)) / 2 * a;
            root2 = (float) (-b - Math.pow(d, 0.5)) / 2 * a;
            System.out.println("x1= " + root1 + "; x2=" + root2);
        } else if (d == 0) {
            root1 = ((-1) * b) / (2f * a);
            System.out.println("x1=x2= " + root1);
        } else System.out.println("Roots can't be calculated");
    }//end countingRoots

    public static void middleNum() throws IOException {
        int count = 0;
        int Sum = 0;
        int a, b, i;
        boolean flag = true;

        System.out.println("This method calculates average of numbers in a range");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the lower boundary of the range a");
        a = Integer.parseInt(br1.readLine());
        System.out.println("Enter the upper boundary of the range b");
        b = Integer.parseInt(br1.readLine());
        i = a;
        do {
            count++;
            Sum += i;
            if (a > b) {
                if (--i < b) flag = false;
            } else {
                if (++i > b) flag = false;
            }
        } while (flag);
        float result = (float) Sum / count;
        System.out.println("Average of numbers in a range from " + a + " to " + b + " equals " + result);
    }

}//end class
