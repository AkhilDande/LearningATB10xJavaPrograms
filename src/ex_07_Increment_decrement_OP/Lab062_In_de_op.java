package ex_07_Increment_decrement_OP;

public class Lab062_In_de_op {
    public static void main(String[] args) {
        String Age0 = args[0];
        int Age1 = Integer.parseInt(Age0);
        String Can_I_go_goa1 = Age1>18 ? "Yes, you can go" : "No, you cant go";
        System.out.println(Can_I_go_goa1);

        String Age2 = args[1];
        int Age3 = Integer.parseInt(Age2);
        String Can_I_go_goa2 = Age3>18 ? "Yes, you can go" : "No, you cant go";
        System.out.println(Can_I_go_goa2);

        String Age4 = args[2];
        int Age5 = Integer.parseInt(Age4);
        String Can_I_go_goa3 = Age5>18 ? "Yes, you can go" : "No, you cant go";
        System.out.println(Can_I_go_goa3);
    }
}
