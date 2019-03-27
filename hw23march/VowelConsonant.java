package hw23march;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = scanner.next().charAt(0);
        //by using chatAt function you are able to get the value of first char without using external casting
        //alphabet a,e,i,o,u are vowels, rest are consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println("Given character is an vowel");

        } else {
            System.out.println("Given character is a consonant");

        }

    }
}
