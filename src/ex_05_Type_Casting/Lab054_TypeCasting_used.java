package ex_05_Type_Casting;

public class Lab054_TypeCasting_used {
    public static void main(String[] args) {
        int course = 1000;
        float GST = 18.45f;
        // Narrowing type casting
        int total1 = course + (int)GST; // Narrowing Type casting (Explicit)
       // int total2 = course + GST; // Narrowing Type casting (Implicit) -> Not valid
        // Widening Type casting
        float total3 = course + (float)GST;  // Widening Type casting (explicit)
        float total4 = course + GST; //Widening type casting implicit (Implicit)
        System.out.println(total1);
        System.out.println(total3);
        System.out.println(total4);

    }
}
