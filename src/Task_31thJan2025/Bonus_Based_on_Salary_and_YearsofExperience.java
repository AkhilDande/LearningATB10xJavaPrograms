package Task_31thJan2025;

import java.util.Scanner;

public class Bonus_Based_on_Salary_and_YearsofExperience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your salary: ");
        //double salary = sc.nextDouble();
        System.out.println("Enter your years of experience: ");
        double exp = sc.nextDouble();
        double Percentage;
        if (exp>0) {
            System.out.println("Enter your salary: ");
            double salary = sc.nextDouble();
            if (exp < 1) {
                System.out.println("No Bonus");
            } else if (exp >= 1 && exp <= 3) {
                Percentage = ((5 * salary) / 100);
                System.out.println("Bonus is " + Percentage);
            } else if (exp >= 4 && exp <= 6) {
                Percentage = ((10 * salary) / 100);
                System.out.println("Bonus is " + Percentage);
            } else {
                Percentage = ((15 * salary) / 100);
                System.out.println("Bonus is " + Percentage);
            }
        }
        else
        {
            System.out.println("Please enter valid years of experience");
        }

    }
}
