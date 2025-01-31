package Task29thJan_Core_Java_Basic_If_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4_Character_is_a_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
        {
            System.out.println("this character is  a Vowel");
        }
        else
        {
            System.out.println("This character is consonant");
        }

    }
}
