package ex_09_Switch;

import java.util.Scanner;

public class Lab_089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int val = sc.nextInt();
        switch (val){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("minus one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case -2:
                System.out.println("Minus Two");
                break;

        }
    }
}
