package hw23march;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        String name;
        int id;
        double Sales_Amount, basic_salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name : ");
        name = sc.next();
        System.out.print("Enter id : ");
        id = sc.nextInt();
        System.out.print("Enter Basic Salary : £");
        basic_salary = sc.nextDouble();
        System.out.println("Enter The Sales Amount : ");
        Sales_Amount = sc.nextDouble();

        if (Sales_Amount >= 50000) {
            //on 50000 and aboe sales commission is 35%
            System.out.println("Sales_commission = " + (50000 * 30) / 100);
        }else if(Sales_Amount >= 30000) {
            //on 30000 and above sale commission is 20%
            System.out.println("Sales_commission = " + (30000 * 20) / 100);
        }else  if (Sales_Amount >= 10000) {
            //on 10000 and above sale commission is 10%
            System.out.println("Sales_commission = " + (10000 * 5) / 100);
        }else  if (Sales_Amount < 10000) {
            //on below £10000 sale commission is 2%
            System.out.println("Sales_commission = " + (10000 * 2) / 100);
        }

    }
}