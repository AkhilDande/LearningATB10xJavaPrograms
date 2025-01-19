package Task_19thJan2025_Task_Part2;

public class Task1 {
    public static void main(String[] args) {
        int n1 = 4; int n2 = 9; int n3 =-7;
        int Higher_number = n1>n2 ? (n1>n3 ? n1 : n3):(n2>n3 ? n2 : n3);
        System.out.printf("%d is the Highest Number\n",Higher_number);
    }
}
