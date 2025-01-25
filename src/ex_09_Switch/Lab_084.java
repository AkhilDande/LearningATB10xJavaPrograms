package ex_09_Switch;

import java.util.Scanner;

public class Lab_084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser:");
        String browser = sc.next();
        switch (browser)
        {
            case "Chrome":
                System.out.println("Starting the chrome");
                break;
            case "Edge":
                System.out.println("Starting the Edge");
                break;
                case "Firefox":
                    System.out.println("Starting the Firefox");
                    break;
            default:
                System.out.println("I dont know which browser it is");
                break;


        }
    }
}
