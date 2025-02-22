package Task7Feb;

import java.util.Scanner;

public class While_Factorial_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int n = sc.nextInt();
        int k = 1;
        while (n>=1)
        {
            k = k*n;
            n--;
        }
        System.out.println(k);
    }
}
