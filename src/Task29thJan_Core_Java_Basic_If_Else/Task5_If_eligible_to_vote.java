package Task29thJan_Core_Java_Basic_If_Else;

import java.util.Scanner;

public class Task5_If_eligible_to_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Age: ");
        int age = sc.nextInt();
        if (age>= 18) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
