package hw23march;

import java.util.Scanner;

public class Calculateasrequired {

    public static void main(String[] args){
        String symbol;
        float Ans;
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        num1 = scanner.nextInt();
        System.out.println("Enter second number :");
        num2 = scanner.nextInt();
     //choose operation to perform (+,-,*,/)
        System.out.println("Please enter sign (+ , - , / , *) = ");
        symbol = scanner.next();


        //add
        if( symbol.equals("+")) {
            Ans = num1 + num2;
            System.out.println("Addition of two numbers = " + Ans);
        }//subtraction
        else if( symbol.equals("-")){
            Ans = num1 - num2;
            System.out.println("Subtraction of two numbers = " +Ans);
        }
        //division
        else if( symbol.equals("/")){
            Ans = num1 / num2;
            System.out.println("Division of two numbers = " +Ans);
    }//multiplication
        else if( symbol.equals("*")) {
            Ans = num1 * num2;
            System.out.println("Multiplication of two numbers = " + Ans);
        }

}}
