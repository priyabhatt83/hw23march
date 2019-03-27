package hw23march;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        String name;
        int roll, math, eng, sci;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Roll Number : ");
        roll = sc.nextInt();
        System.out.print("Enter marks in Maths , English , science : ");
        math = sc.nextInt();
        eng = sc.nextInt();
        sci = sc.nextInt();

        int total = math+eng+sci;
        float perc =(float)total/300*100;

        System.out.println("Total Marks = " +total+  " out of 300 ");
        System.out.println("Percentage = " + perc);

        //declaring grade
        if((math>=35) && (eng >= 35) && (sci >= 35)){
            System.out.println(name + " has passed ");
        }
        else {
            System.out.println(name + " has failed" );
        }
    }

}
