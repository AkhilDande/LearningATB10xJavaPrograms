package ex_14_Strings;

public class Lab_130 {
    public static void main(String[] args) {
        String s1 = "Dhoni"; // S1 is not equal to s4 even though they have same values because they are stored in default location in JVM.
        String s2 = "Dhoni";
        String s3 = "Dhoni";
        String s4 = new String("Dhoni");
        String s5 = new String("dhoni");
        String s6 = new String("Dhoni");
        System.out.println(s1.equals(s4));// To check if the values in both strings are equal use "s1.equals(s2)". Note that in this case even if there is case difference it gives us input as false.
        System.out.println(s2.equals(s5));//
        System.out.println(s3.equalsIgnoreCase(s5)); //to ignore case difference we use  "s1.equalsIgnoreCase(s2)"
    }
}
