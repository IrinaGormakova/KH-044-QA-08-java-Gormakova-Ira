package simple.input;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your name?");
//		name=br.readLine();
            String name=sc.nextLine();
            System.out.println("Where are you live, "+name+"?");
//		address=br.readLine();
            String address = sc.nextLine();
            System.out.println(name+" lives in "+address);
        }

    }

