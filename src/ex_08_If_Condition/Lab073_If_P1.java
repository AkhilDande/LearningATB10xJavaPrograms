package ex_08_If_Condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab073_If_P1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter your Age: ");
       int age = sc.nextInt();
       // int age = Integer.parseInt(args[0]);
        if(age>=18)
        {
            System.out.println("You are allowed to Vote!");
        }
        System.out.println("You are not allowed to Vote!");
        //else
        //        {
        //            System.out.println("You are not allowed to Vote!");
        //        }
    }
}
