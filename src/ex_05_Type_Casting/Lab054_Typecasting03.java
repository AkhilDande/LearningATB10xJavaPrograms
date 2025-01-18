package ex_05_Type_Casting;

public class Lab054_Typecasting03 {
    public static void main(String[] args) {
        long pn = 987654321;
       //short s = pn; //this is implicit type casting this is not allowed and not valid
        short s = (short) pn; // Explicit type casting is valid and allowed
    }
}
