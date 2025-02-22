package Task7Feb;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0; i < 5; i++)
        {
            for(int j = 0; j <= 2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
