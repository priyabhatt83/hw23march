package hw23march;

import java.util.Scanner;
public class PercentageandGrade {
    public static void main(String[] args) {
        String name;
        int roll, math, eng, sci;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Roll Number");
        roll = sc.nextInt();
        System.out.print("Enter marks in Maths , English , science : ");
        math = sc.nextInt();
        eng = sc.nextInt();
        sci = sc.nextInt();

        int total = math+eng+sci;
        float perc =(float)total/300*100;

        System.out.println("Total Marks = " +total);
        System.out.println("Percentage = " + perc);

        //declaring grade
        if(perc >=80){
            System.out.println(name + "has passed and achieved A+ Grade with" + perc + "%");
        }
        else if(perc >=60){
            System.out.println(name + "has passed and achieved A Grade with" + perc + "%");
        }
        else if(perc >=50){
            System.out.println(name + "has passed and achieved B Grade with" + perc + "%");
        }
        else if(perc >=35){
            System.out.println(name + "has passed and achieved c Grade with" + perc + "%");
        }
    }



}
