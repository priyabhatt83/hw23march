package hw23march;

import java.util.Scanner;

public class VotingEligibilty {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age you want to check : ");
        age = sc.nextInt();
        // check voting eligiblity
        if(age>=18){
            System.out.println("PERSON IS ELIGIBLE FOR VOTING");
        }else {
            System.out.println("PERSON IS NOT ELIGIBLE FOR VOTING");

        }
    }
}
