package ex_05_Type_Casting;

public class Lab052_TypeCasting_Widening {
    public static void main(String[] args) {
        // Narrowing type casting
        byte a = 10;
       //  int b = a; // This is implicit type casting which is done automatically
        int b = (int)a; // this is explicit type casting
    }
}
