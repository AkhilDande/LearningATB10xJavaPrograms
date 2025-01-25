package ex_10_For_Loop;

public class Lab_106_Break {
    public static void main(String[] args) {
        for (int i=0; i<50; i++)
        {
            if (i==5){
                break; // As we added break here it stops when i = 5 and prints i value from 0 to 4
            }
            System.out.println(i);
        }
    }
}
