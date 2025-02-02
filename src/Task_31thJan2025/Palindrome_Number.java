package Task_31thJan2025;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum =0;
        int rev;
        while (num != 0)
        {
            rev = num%10;
            sum = (sum*10)+rev;
            num = num/10;
        }
        if (sum == temp)
        {
            System.out.println(sum+" is a Palindrome Number");
        }
        else
        {
            System.out.println(sum+" is not a Palindrome Number");
        }
    }
}
