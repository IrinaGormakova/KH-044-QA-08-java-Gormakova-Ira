package operations.numbers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        byte choise=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Select task number for execution or exit");
            System.out.println("1 - division of 2 fractional numbers");
            System.out.println("2 - volume of cylinder");
            System.out.println("3 - from hex to decimal");
            System.out.println("4 - own example with increment/decrement");
            System.out.println("5 - x1, x2 for quadratic equation");
            System.out.println("6 - exit");
            System.out.println("\n");
            choise=Byte.parseByte(br.readLine());

            switch (choise){
                case 1:SimpleOperations.divisionFloat();
                    break;
                case 2: SimpleOperations.volumeCylinder();
                    break;
                case 3:SimpleOperations.hexToDec();
                    break;
                case 4:SimpleOperations.middleNum();
                    break;
                case 5: SimpleOperations.countingRoots();
                    break;
                default: break;

            }// end switch

        } while (choise!=6);// end do
    }
}

