package Task_30thJan;

import java.util.Scanner;

public class Smallest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3: ");
        int num3 = sc.nextInt();
            if (num1<num2 && num1< num3)
            {
                System.out.println("Num1 is the smallest Number");
            }
            else if (num2<num1 && num2<num3) {
                System.out.println("Num2 is the smallest number");

            }
            else {
                System.out.println("Num3 is the smallest number");
            }
    }
}
