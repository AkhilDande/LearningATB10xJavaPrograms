package Task_5Feb;

import java.util.Scanner;

public class Print_even_numbers_from_1_to_20 {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many even numbers you want to print: ");
        int n = sc.nextInt();
        for (int i = 1; i>=0; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
                count++;
            }
            if (count == n)
            {
                break;
            }
        }
    }
}
