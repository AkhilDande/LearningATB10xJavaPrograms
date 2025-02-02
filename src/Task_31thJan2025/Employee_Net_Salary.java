package Task_31thJan2025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee_Net_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Basic pay: ");
        double bp = sc.nextDouble();
        System.out.println("Enter your tax deductions: ");
        double td = sc.nextDouble();
        double HRA = 0.45*bp;
        double DA = 0.25*bp;
        double Net_Salary = bp+HRA+DA - td;
        System.out.println("Basic pay: "+bp);
        System.out.println("HRA: "+HRA);
        System.out.println("DA: "+DA);
        System.out.println("Tax Deductions: "+td);
        System.out.println("Net Salary: "+Net_Salary);
    }
}
