package Task_25thJan2025;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();
        int wordlength = word.length()-1;
        String reversed_word = "";
        for(int i = wordlength; i>=0; i--)
        {
            reversed_word = reversed_word + word.charAt(i);
        }
        System.out.println("after reversing the word ->"+reversed_word);
        if (word.equals(reversed_word))
        {
            System.out.printf("%s is a palindrome",word);
        }
        else {
            System.out.printf("%s is not a Palindrome",word);
        }

    }
}
