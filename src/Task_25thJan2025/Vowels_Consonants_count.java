package Task_25thJan2025;

import java.util.Scanner;

public class Vowels_Consonants_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to type something
        System.out.println("Enter a string:");

        // Read the user input
        String text = sc.nextLine();

        // Initialize counters for vowels and consonants
        int vowels = 0;
        int consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);// Get each character
            ch = Character.toLowerCase(ch); //to convert into lower case letter

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a consonant (a letter that's not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        // Print the result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
