package ex_16_Arrays;

import java.util.Scanner;

public class Lab_138_Arrays_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size in integer only: ");
        int size = sc.nextInt();
        int[] ui = new int[size]; //Here, an integer array ui is created with the size provided by the user. The array will hold size number of elements.

        for (int i=0; i<size; i++)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("Please enter the %d index value: ",i);
            ui[i] = in.nextInt();
        }

        System.out.println("---------");

        for (int j =0; j< ui.length; j++){
            System.out.println(ui[j]);
        }
    }
}
