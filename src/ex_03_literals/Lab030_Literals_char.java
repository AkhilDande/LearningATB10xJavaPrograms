package ex_03_literals;

public class Lab030_Literals_char {
    public static void main(String[] args) {
        // Chars - Store value within in single quotes ''
        char c1 = 'A';
        // String c2 = "ABCD"; // String - bunch of char(multiple chars) which are within double quotes
        char c2 = 'B';
        char c3 = '@'; // char can store special characters within single quotes
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '('; // char can store brackets also
        char c8 = ' '; // char can store blank space within double quotes


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //System.out.println("AkhilDande");
//        System.out.println(" This is" + new_line + "Akhil");
//        System.out.println("This is" + tab_line +  "Akhil");
//        System.out.println("This is"+ back_space +  "Akhil");
        System.out.println("This is" + carriage_return + "Akhil");
        System.out.println("This is"+ back_space +  "Akhil");
        System.out.println("This is" + tab_line +  "Akhil");
        System.out.println("This is" + new_line + "Akhil");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char ruppes = '₹';
        char dollar = '$';
        System.out.println("Akhil has "+ruppes+10);
        System.out.println("Akhil has "+20+dollar);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        char c11  = '\u1F60';


    }
}
