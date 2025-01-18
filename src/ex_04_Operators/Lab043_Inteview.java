package ex_04_Operators;

public class Lab043_Inteview {
    public static void main(String[] args) {
        int Ben_salary = 10;
        boolean b = Ben_salary > 10 || Ben_salary <= 10;
        System.out.println(b);
        // Ben_salary > 10 -> false
        // Ben_salary <= 10 => true
        // Ben_salary > 10 || Ben_salary <= 10   -> false || true -> true
    }
}
