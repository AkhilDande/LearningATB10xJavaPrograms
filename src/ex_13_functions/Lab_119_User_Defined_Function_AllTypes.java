package ex_13_functions;

public class Lab_119_User_Defined_Function_AllTypes {
    public static void main(String[] args) {
        // User Defined Functions are of four types.

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type
        greet();
        System.out.println(greet_hello());
        age_to_vote(18);
        int sum = sum(5,3);
        System.out.println(sum);

    }
    //  1.Without Parameters and Without Return Type.we need to mention void in the function as we are not returning anything.
    static void greet() {
        System.out.println("This is another example of user defined function");
    }
    // 2.Without Parameters but With Return Type. Syntax is static data_type function_name(){ return"statement"; }
    static String greet_hello() {
        return "Hello, this is without parameters but without return type";
    }
    // 3.With Parameters and Without Return Type. we need to mention void in the function as we are not returning anything.
    static void age_to_vote(int a){
        System.out.println("age to vote" + a);
    }
    // 4. With Parameters and With Return Type static data_type function_name(){ return"statement"; }
    static int sum(int a, int b){
        return a+b;
    }
}
