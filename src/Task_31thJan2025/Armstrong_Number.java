package Task_31thJan2025;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        double arm = 0;
        int count = 0;
        int l;
        while (num != 0)
        {
            num=num/10;
            count++;
        }
        int on = temp;
        while (temp != 0)
        {
            l = temp%10;
            arm = arm + Math.pow(l, count);
            temp = temp/10;
        }
        if (arm == on)
        {
            System.out.println(on+" is a armstrong number");
        }
        else
        {
            System.out.println(on+" is not armstrong number");
        }

    }
}
