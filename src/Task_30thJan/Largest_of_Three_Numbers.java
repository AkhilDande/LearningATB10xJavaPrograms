package Task_30thJan;

import java.util.Scanner;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Number 3: ");
        int num3 = sc.nextInt();
        int lar_num;
        if (num1 > num2 && num1 > num3){
            System.out.println("Num1 is the largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is the largest number");

        }
        else {
            System.out.println("Num3 is the largest number");
        }

    }
}
