package Task_30thJan;

import java.util.Scanner;

public class Character_is_an_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charactet: ");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch) == true) //method "Character.isLetter(<Input variable>)" is used to check if entered character is Alphabet or not.
        {
            System.out.println("Character is an Alphabet");
        }
        else
        {
            System.out.println("Character is not an Alphabet");
        }
    }
}
