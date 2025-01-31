package ex_13_functions;

public class Lab_118_User_Defined {
    public static void main(String[] args) {
        main(); //Here we are calling the specific function so it goes to function that we are calling and performs whatever it is mentioned in that respective function. In this Case, here in the function it is defined to print a statement so it prints the statement whenever we call this function.
        greet();

    }
    static void main(){
        System.out.println("This is the example of user defined function");
    }

    static void greet(){
        System.out.println("This is another example of user defined function");
    }
}
