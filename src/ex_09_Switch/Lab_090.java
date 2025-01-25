package ex_09_Switch;

import java.util.Scanner;

public class Lab_090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Letter:");
        char letter = sc.next().charAt(0); // To take character as Input.
        switch (letter){
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
            default:
                System.out.println("Helloooo");
                break;

        }

    }
}
