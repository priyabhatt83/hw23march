package hw23march;

import java.util.Scanner;

public class AverageofNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the value of a, b, c, d and e");
        Scanner scanner = new Scanner(System.in);
        //define variables
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();


        System.out.println("Average = " +(a+b+c+d+e) / 5);

    }

}
