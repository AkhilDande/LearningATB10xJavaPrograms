package ex_16_Arrays;

import java.util.Arrays;

public class Lab_133 {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length);

        System.out.println("  - - - - - -");

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("  - - - - - -");


        for (int i = 0; i < marks.length; i++) { // 0,1,2,3,4
            System.out.println(marks[i]);
        }

        System.out.println("  - - - - - -");

        Arrays.sort(marks);// 51,87,90,91,100
        for (int i =0; i< marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
