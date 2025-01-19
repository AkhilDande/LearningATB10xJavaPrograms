package Task_19thJan2025_Task_Part2;

public class CLI_Options_2 {
    public static void main(String[] args) {
        String num0 = args[0];
        int num1 = Integer.parseInt(num0);
        String num2 = args[1];
        int num3 = Integer.parseInt(num2);
        int Highest_num = num1>num3 ? num1 : num3;
        System.out.printf("%d is the Highest Number",Highest_num);
    }
}
