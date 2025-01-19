package Tasks_19Jan_2025;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String marks = args[0];
        int marks1 = Integer.parseInt(marks);
        String Grade = marks1 >= 90 && marks1 <= 100 ? "A" :
                (marks1 >= 80 && marks1 <= 89) ? "B" :
                        (marks1 >= 70 && marks1 <= 79) ? "C" :
                                (marks1 >= 60 && marks1 <= 69) ? "D":
                                        (marks1 >= 0 && marks1 <= 59) ? "F" :
                                                "Invalid marks";
        System.out.println(Grade);
    }

}
