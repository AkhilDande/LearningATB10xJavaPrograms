package Task_30thJan;

import java.util.Scanner;

public class ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        double account_salary = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Amount you want to withdraw: ");
        double wda = sc.nextDouble();
        int mul =100;
        if(wda > 0)
        {
            if(wda%mul==0)
            {
                if (wda < account_salary)
                {
                    System.out.println("Amount is the deducted from the balance amount");
                }
                else
                {
                    System.out.println("Please make sure that amount you entered is not exceed the account balance");
                }
            }
            else
            {
                System.out.println("Please make sure that amount you entered should be a multiple of 100 (common ATM rule)");
            }
        }
        else
        {
            System.out.println("Please make sure that amount you entered greater than zero");
        }
    }
}
