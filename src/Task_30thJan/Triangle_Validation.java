package Task_30thJan;

import java.util.Scanner;

public class Triangle_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1 of the triangle: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the side2 of the triangle: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the side3 of the triangle: ");
        int side3 = sc.nextInt();
        if (side1+side2>side3 && side2+side3>side1 && side3+side1>side2)
        {
            System.out.println("This is a valid Triangle");
        }
        else
        {
            System.out.println("This is not a valid Triangle");
        }
    }
}
