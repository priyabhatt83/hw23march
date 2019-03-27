package hw23march;

import java.util.Scanner;

public class NameofCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter the any alphabet : ");
        ch = scanner.next().charAt(0);

        if (ch == 'a') {
            System.out.println("Aberdeen");
        } else if (ch == 'b') {
            System.out.println("Bristol");
        } else if (ch == 'c') {
            System.out.println("Chelsea");
        } else if (ch == 'd') {
            System.out.println("Derby");
        } else if (ch == 'e') {
            System.out.println("Exeter");
        } else if (ch == 'f') {
            System.out.println("Fairview");

        }
}}
