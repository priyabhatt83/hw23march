package hw23march;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First integer number: " );
        int num = scanner.nextInt();

        //check if the number is divided by 2 or not
        if ( num % 2 == 0)
            System.out.println(num +" is even number");
        else
            System.out.println(num +" is odd number");

        }

    }
