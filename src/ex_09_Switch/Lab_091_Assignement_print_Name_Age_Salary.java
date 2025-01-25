package ex_09_Switch;

import java.util.Scanner;

public class Lab_091_Assignement_print_Name_Age_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.next();
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Enter your Salary:");
        double salary = sc.nextDouble();
        System.out.printf("Name: %s\n",name);
        System.out.printf("Age: %d\n",age);
        System.out.printf("Salary: %f\n",salary);
    }
}
