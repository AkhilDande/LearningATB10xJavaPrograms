package ex_05_Type_Casting;

public class Lab053_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val = 100;
        //byte b = val this is implicit type casting. Invalid - Implicit Casting narrowing is not allowed
        byte b = (byte)val; // this is explicit type casting. Valid - Explicit casting - Allowed.
        // Disadvantage of narrow typecasting is loss of data.
    }
}
