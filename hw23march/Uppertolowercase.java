package hw23march;

import java.util.Scanner;

public class Uppertolowercase {

    public static void main(String[] args){
        char ch;
        int temp;
        Scanner scanner = new Scanner(System.in);
        //mendatory for user to enter uppercase alphabet
        System.out.println("Enter a alphabet in Uppercase : ");
        ch = scanner.next().charAt(0);

        temp = (int) ch;
        temp = temp + 32;
        //A stsrt with 65 n small a start with 97 so we took diffrence which is 32
        ch = (char) temp;
        System.out.println("Equivalent character in Lowercase = "+ch);


    }
}
