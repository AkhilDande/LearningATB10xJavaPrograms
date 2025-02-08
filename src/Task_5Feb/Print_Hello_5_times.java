package Task_5Feb;

import java.util.Scanner;

public class Print_Hello_5_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to print: ");
        int n = sc.nextInt();
        System.out.println("What do you want to print: ");
        String str = sc.next();
        for (int i =1; i<=n; i++)
        {
            System.out.println(str);
        }
    }
}
