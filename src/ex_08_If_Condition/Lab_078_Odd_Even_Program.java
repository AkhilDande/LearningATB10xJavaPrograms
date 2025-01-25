package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_078_Odd_Even_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.printf("%d is an Even number",num);
        }
       // System.out.printf("%d is an Odd Number",num);
        else
        {
            System.out.printf("%d is an odd number",num);
        }
    }
}
