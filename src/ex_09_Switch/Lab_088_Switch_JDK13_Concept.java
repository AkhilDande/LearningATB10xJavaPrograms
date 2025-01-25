package ex_09_Switch;

import java.util.Scanner;

public class Lab_088_Switch_JDK13_Concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item code: ");
        int itemcode = sc.nextInt();
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("Electronics");
                break;
            case 004, 005, 006:
                System.out.println("Furniture");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
