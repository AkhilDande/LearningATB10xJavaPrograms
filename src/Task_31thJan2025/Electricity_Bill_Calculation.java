package Task_31thJan2025;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units: ");
        int units = sc.nextInt();
        double bill;
        if (units>0)
        {
            if (units<100)
            {
                bill = 100*0.5;
                System.out.println("The total Electricity bill is: "+bill);
            }
            else if (units<200)
            {
                bill = (100*0.5) + ((units-100)*0.75);
                System.out.println("The total Electricity bill is: "+bill);
            }
            else if (units<300)
            {
                bill = (100*0.5) + (100*0.75) + ((units-200)*1.20);
                System.out.println("The total Electricity bill is: "+bill);
            }
            else {
                bill = (100 * 0.5) + (100 * 0.75) + (100 * 1.20) + (units - 300) * 1.50;
                System.out.println("The total Electricity bill is: " + bill);
            }
        }
        else
        {
            System.out.println("Units consumed should be more than 0");
        }
    }
}
