package Task29thJan_Core_Java_Basic_If_Else;

import java.util.Scanner;

public class Task3_Maximum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        if (num1>num2)
        {
            System.out.println("Num 1 is greater than Num 2");
        }
        else
        {
            System.out.println("Num 2 is greater than Num 1");
        }
    }
}
