package ex_07_Increment_decrement_OP;

public class Lab064_Post_Inc {
    public static void main(String[] args) {
        int a = 30;
        System.out.println(a++); // As this is post increment it will be assigned with original value which is initialized originally So, In this step the value of a++ is 30
        System.out.println(a); // from next assignments post a++ it will be assigned with increment value So, In this step the value of a++ is 31
    }
}
