package Task_31thJan2025;

import java.util.Scanner;

public class Travel_Based_on_VisaStatus_and_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        if (age > 0)
        {
            if (age>=18)
            {
                System.out.println("What is your visa status (valid or invalid): ");
                String vs = sc.next();
                vs = vs.toLowerCase();
                if (vs.equals("valid"))
                {
                    System.out.println("Congrats! you are eligilbe to travel");
                }
                else
                {
                    System.out.println("Your Visa is invalid");
                }
            }
            else
            {
                System.out.println("Please note that your age should be 18 or more than 18");
            }
        }
        else
        {
            System.out.println("Enter valid age");
        }
    }
}
