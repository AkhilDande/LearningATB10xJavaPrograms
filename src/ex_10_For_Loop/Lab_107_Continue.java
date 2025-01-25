package ex_10_For_Loop;

public class Lab_107_Continue {
    public static void main(String[] args) {
        for (int i=0; i<50; i++)
        {
            if (i==5){
                continue; // As we added continue here it will skips when i=5 without printing i value  and moves to next value(i=6)
            }
            System.out.println(i);
        }
    }
}
