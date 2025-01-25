package ex_10_For_Loop;

public class Lab_108_Even_Numbers {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++)
        {
            if(i%2==0){
                System.out.println("Even "+i);
                continue; //As we given continue here in this line it will skip if i%2==0 or else it will print i value for which 1%2 is not equal to 0
            }
            System.out.println(i);
        }
    }
}
