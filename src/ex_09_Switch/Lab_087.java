package ex_09_Switch;

import java.util.Scanner;

public class Lab_087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item code: ");
        int itemcode = sc.nextInt();
        switch (itemcode){
            case 001:
                System.out.println("Electronics");
                break;
            case 002:
                System.out.println("Furniture");
                break;
            case 003:
                System.out.println("Kitchen Applainces");
                break;
            default:
                System.out.println("Automobile");
                break;
        }
    }
}
