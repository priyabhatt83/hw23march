package hw23march;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args){
       int num;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter any integer number : ");
       num = scanner.nextInt();
       //check condition for +ve, -ve and zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " IT'S ZERO.");


    }
}
