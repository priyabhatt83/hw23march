package hw23march;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b");
        Scanner scanner = new Scanner(System.in);
        //define variables
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before swapping the numbers a = " + a + " = and b = " + b );

        //swaping the numbers
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping the numbers a = " + a + " = and b = " + b );
    }
}