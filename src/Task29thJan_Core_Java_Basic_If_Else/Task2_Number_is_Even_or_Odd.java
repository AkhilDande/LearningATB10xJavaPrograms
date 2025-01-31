package Task29thJan_Core_Java_Basic_If_Else;

import java.util.Scanner;

public class Task2_Number_is_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        if (num%2==0)
        {
            System.out.println("This is a Even Number");
        }
            else
        {
            System.out.println("This is a odd number");
        }
    }
}
