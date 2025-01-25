package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_082_HackerRank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        int side1 =sc.nextInt();
        System.out.println("Enter the side2: ");
        int side2 =sc.nextInt();
        System.out.println("Enter the side3: ");
        int side3 =sc.nextInt();
        if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("This is an Equilateral Triangle");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("This is a an Isosceles Triangle");
        }
        else {
            System.out.println("This is a scalene Triangle ");
        }
    }
}
