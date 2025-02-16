package Task7Feb;

import java.util.Scanner;

public class Check_if_a_Number_is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean isprime = true;
        int i;
        for (i=2; i< Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                isprime = false;
                break;
            }
        }
        if (isprime == true)
        {
            System.out.println(n+" is Prime number");
        }
        else
        {
            System.out.println(n+" is not a Prime number");
        }
    }
}
