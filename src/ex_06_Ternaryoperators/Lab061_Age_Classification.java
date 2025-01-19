package ex_06_Ternaryoperators;

public class Lab061_Age_Classification {
    public static void main(String[] args) {
        String age = args[0];
        int age1 = Integer.parseInt(age);
        String Age_group = age1<18 ? "Minor" : (age1>18 ? (age1<65 ? "Adult" : "Senior Citizen") : "Senior Citizen");
        System.out.println(Age_group);


    }
}
