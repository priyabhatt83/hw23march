package hw23march;

import java.util.Scanner;

public class DetermineLeapYear {
    public static void main(String[] args){
//here we want to check that enter year is leap year or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = scanner.nextInt();

        //if year is divisible by 4,it is leap year

        if(year % 4 == 0)
        System.out.println("Year" + year + "is a leap year");
        else
            System.out.println("Year" + year + "is not a leap year");

    }
}
