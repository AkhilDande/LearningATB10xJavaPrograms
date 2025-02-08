package Task_5Feb;

public class While_multiplicationtable_of_7 {
    public static void main(String[] args) {
        int m =7;
        int i =1;
        int k;
        while (i<=10)
        {
            k=m*i;
            System.out.printf("%d * %d = %d\n",m,i,k);
            i++;
        }
    }
}
