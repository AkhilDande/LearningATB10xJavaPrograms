package ex_16_Arrays;

import java.util.Arrays;

public class Lab_137_Find_Second_Largest_Number {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max =0;
        for (int i =0; i< numbers.length; i++)
        {
            if (numbers[i]>max)
            {
                max = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println("-------");
        Arrays.sort(numbers);
        int j;
        for (j = 0; j< numbers.length; j++)
        {
            System.out.println(numbers[j]);
        }
        System.out.println(numbers[numbers.length - 2]);


    }
}
