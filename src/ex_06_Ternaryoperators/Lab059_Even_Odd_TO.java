package ex_06_Ternaryoperators;

public class Lab059_Even_Odd_TO {
    public static void main(String[] args) {
        int E = 6;
        int O = 9;
        String Number_Type1 = (E%2==0) ? "is an even number" : "Not an Even Number";
        String Number_Type2 = (O%2!=0) ? "an Odd Number" : "Not an Odd Number";
        System.out.printf("%d %s\n",E,Number_Type1);
        System.out.printf("%d %s\n",O,Number_Type2);
    }
}
