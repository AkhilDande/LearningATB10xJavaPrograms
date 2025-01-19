package ex_06_Ternaryoperators;

public class Lab060_Max_of_ThreeNumbers {
    public static void main(String[] args) {
        int n1 = 4; int n2 = 9; int n3 =-7;
        int Higher_number = n1>n2 ? (n1>n3 ? n1 : n3):(n2>n3 ? n2 : n3);
        int Lower_number = n1<n2 ? (n1<n3 ? n1 : n3) : (n2<n3 ? n2 : n3);
        System.out.printf("%d is the Highest Number\n",Higher_number);
        System.out.printf("%d is the lowest number\n",Lower_number);
    }
}
