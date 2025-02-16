package Task7Feb;

import java.util.Scanner;

public class factorial_of_a_number_using_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial Number: ");
        int n = sc.nextInt();
        int k =1;
        int i;
        for (i = n; n>0; n--)
        {
            k = k*n;
        }
        System.out.println(k);
    }
}
