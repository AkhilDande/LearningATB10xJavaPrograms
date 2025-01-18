package ex_04_Operators;

public class Lab036_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        boolean b = false;
        System.out.println(!b);
        boolean c = true || false;
        System.out.println(c);
        boolean d = true && false;
        System.out.println(d);
        // logical AND(&&) Returns true if both statements are true
        // logical OR(||) Returns true if one of the statements is true
        // logical Not(!) Reverse the result, returns false if the result is true
    }
}
