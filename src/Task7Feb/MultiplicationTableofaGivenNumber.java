package Task7Feb;

import java.util.Scanner;

public class MultiplicationTableofaGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i;
        int k;
        for (i=1; i<=10; i++)
        {
            k = n*i;
            System.out.printf("%d * %d = %d\n",n,i,k);
        }
    }
}
