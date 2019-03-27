package hw23march;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        String name;
        int id;
        double basic_salary,HRA, TA, DA, PF , Gross_Salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name : ");
        name = sc.next();
        System.out.print("Enter id : ");
        id = sc.nextInt();
        System.out.print("Enter Basic Salary : £");
        basic_salary = sc.nextDouble();
           // declaring all deduction from gross pay
        HRA = (basic_salary * 10) / 100; // 10% of basic salary
        DA =  (basic_salary * 8)/ 100;   // 8% of basic Salary
        TA = (basic_salary * 9)/ 100;    // 9% of Basic salary
        PF = (basic_salary * 20)/ 100;   // 20% of basic salary
        Gross_Salary = basic_salary + HRA +DA + TA - PF;

        System.out.println(" HRA = £" +HRA );
        System.out.println(" DA = £" +DA);
        System.out.println(" TA = £" +TA);
        System.out.println(" PF = £" +PF);
        System.out.println(" Gross Salary = " +Gross_Salary);


}

    }
