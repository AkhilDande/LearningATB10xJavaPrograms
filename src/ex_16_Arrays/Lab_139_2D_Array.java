package ex_16_Arrays;

import java.util.Scanner;

public class Lab_139_2D_Array {


    public static void main(String[] args) {
            //int [][] array_2d =  new int[3][3];
           // array_2d[0][0] = 90;
            //array_2d[0][1] = 91;
            //array_2d[0][2] = 92;
//        array_2d[0][3] = 92;

           // array_2d[1][0] = 1;
            //array_2d[1][1] = 3;
            //array_2d[1][2] = 5;

            //array_2d[2][0] = 2;
            //array_2d[2][1] = 4;
            //array_2d[2][2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[][] array_2d = new int[size][size];

        for (int i = 0; i< array_2d.length; i++)
        {
            for (int j = 0; j< array_2d.length; j++)
            {
                Scanner in = new Scanner(System.in);
                System.out.printf("Enter the Array%d%d value: ",i,j);
                array_2d[i][j] = in.nextInt();
            }

        }

        System.out.println("------------");

            for (int i = 0; i< array_2d.length; i++)
            {
                for (int j = 0; j< array_2d.length; j++)
                {
                    System.out.print(array_2d[i][j]+"|"); // Tp print in the same line we used print in this line
                }
                System.out.println(); // to print in the next line we used print ln in this line

            }
        }
    }

