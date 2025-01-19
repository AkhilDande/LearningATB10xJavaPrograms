package Task_19thJan2025_Task_Part2;

public class CLI_Options_1 {
    public static void main(String[] args) {
       String name = args[0];
       String age = args[1];
       int age1 = Integer.parseInt(age);
       String salary = args[2];
       int salary1 = Integer.parseInt(salary);

        System.out.println(name);
        System.out.println(age1);
        System.out.println(salary1);

    }
}
