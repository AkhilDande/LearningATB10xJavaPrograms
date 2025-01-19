package ex_07_Increment_decrement_OP;

public class Lab065_Post_Inc {
    public static void main(String[] args) {
        int a = 40;
        int res = a++;
        System.out.println(a); // Here in this step it prints incremented value, As this is post increment In the above step itself it is assigned with its original expression and post that it will be assigned with incremented value
        System.out.println(res); // the value of a++ is 40
    }
}
