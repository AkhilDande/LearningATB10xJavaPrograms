package ex_14_Strings;

public class Lab_129 {
    public static void main(String[] args) {
        String s1 = "Dhoni"; // S1 is not equal to s4 even though they have same values because they are stored in default location in JVM.
        String s2 = "Dhoni";
        String s3 = "Dhoni";
        String s4 = new String("dhoni");
        String s5 = new String("Dhoni");
        String s6 = new String("Dhoni");
        System.out.println(s1==s4);
        System.out.println(s2==s6);
        System.out.println(s3==s5);
    }
}
