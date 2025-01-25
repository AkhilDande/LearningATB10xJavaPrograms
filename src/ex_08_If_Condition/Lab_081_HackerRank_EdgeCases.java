package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_081_HackerRank_EdgeCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int Score = sc.nextInt();
        char Grade;
        if(Score >= 90 && Score <= 100)
        {
            Grade = 'A';
        } else if (Score >= 80 && Score <= 89)
        {
            Grade = 'B';
        } else if (Score >= 70 && Score <= 79)
        {
            Grade = 'C';
        } else if (Score >= 60 && Score <= 69)
        {
            Grade = 'D';
        } else if (Score <= 0 || Score >= 100) {
            Grade ='O';
            System.out.println("lol, u are at God level!");
        } else {
            Grade = 'F';
        }
        System.out.printf("Your Grade is %c",Grade);
    }
}
