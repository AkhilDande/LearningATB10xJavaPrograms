package Task_30thJan;

import java.util.Scanner;

public class Smallest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter the num 2: ");
        int num2 = sc.nextInt();
        if (num1<num2)
        {
            System.out.println("Num1 is the smallest number");
        }
        else {
            System.out.println("Num 2 is the smallest number");
        }
    }
}
