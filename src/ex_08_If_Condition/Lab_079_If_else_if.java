package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_079_If_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2:");
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println("num1 is greater");
        } else if (num2>num1)
        {
            System.out.println("num2 is greater");
        }
        else
        {
            System.out.println("both are equal");
        }
    }
}
