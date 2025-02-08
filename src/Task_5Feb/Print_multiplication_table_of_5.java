package Task_5Feb;

import java.util.Scanner;

public class Print_multiplication_table_of_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which table you want to print: ");
        int n = sc.nextInt();
        int k;
        int i;
        for (i = 1; i<=10; i++)
        {
            k = 5*i;
            System.out.printf("%d * %d = %d\n", n,i,k);
        }
    }
}
