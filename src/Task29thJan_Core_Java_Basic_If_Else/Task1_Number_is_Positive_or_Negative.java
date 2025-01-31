package Task29thJan_Core_Java_Basic_If_Else;

import java.util.Scanner;

public class Task1_Number_is_Positive_or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        if (num>0)
        {
            System.out.println("This is a positive number");
        }
        else
        {
            System.out.println("This is a negative number");
        }
    }
}
