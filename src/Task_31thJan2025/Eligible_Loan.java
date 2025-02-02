package Task_31thJan2025;

import java.util.Scanner;

public class Eligible_Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        //System.out.println("Enter the salary: ");
        //double salary = sc.nextDouble();
        //System.out.println("Enter the Credit score: ");
        //int cs = sc.nextInt();
        if (age>0)
        {
            if (age >= 18)
            {
                if (age <= 80)
                {
                    System.out.println("Enter the salary: ");
                    double salary = sc.nextDouble();
                    if (salary>0)
                    {
                        if (salary>=30000)
                        {
                            System.out.println("Enter the Credit score: ");
                            int cs = sc.nextInt();
                            if (cs>0)
                            {
                                if (cs>=650)
                                {
                                    if (cs<=850)
                                    {
                                        System.out.println("Congrats! You are eligible for a Loan");

                                    }
                                    else
                                    {
                                        System.out.println("Please not that Max credit score threshold is 850");
                                    }

                                }
                                else
                                {
                                    System.out.println("Please note that minimum credit score threshold 650");
                                }
                            }
                            else
                            {
                                System.out.println("Credit score should be positive (>0)");
                            }

                        }
                        else
                        {
                            System.out.println("Please note that minimum salary threshold is (30,000)");
                        }
                    }
                    else
                    {
                        System.out.println("Salary should be positive number");
                    }
                }
                else
                {
                    System.out.println("Max Age should less than or equal to 80");
                }
            }
            else
            {
                System.out.println("Age should be greater than or equal to 18");
            }

        }
        else
        {
            System.out.println("Age should be greater than 0");
        }
        System.out.println();
    }
}
