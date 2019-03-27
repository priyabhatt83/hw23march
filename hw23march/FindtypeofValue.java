package hw23march;

import java.util.Scanner;

public class FindtypeofValue {
    public static void main(String[] args){
        char  ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        ch = scanner.next().charAt(0);

        //checking for alphabet
        if((ch >= 'a' && ch <= 'z')|| (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Entered Character Is Alphabet.");
        }// checking for numbers
        else if(ch >= '0' && ch <= '9')
        { System.out.println("Enter Character Is Number.");
        }else{
           System.out.println("Enter Character is Symbol. ");
        }

}}