package Task_30thJan;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.printf("%d is a Leap year\n",year);
        }
        else {
            System.out.printf("%d is not a leap year\n", year);
        }
    }
}
