package ex_06_Ternaryoperators;

public class Lab057_Interview_Nested_TO {
    public static void main(String[] args) {
        int num = 25;
        String res = num>20 ? (num>30 ? "Greater than 30" : "Inbetween 20 and 30") : "Not Inbetween 20 and 30" ;
        System.out.println(res);
    }
}
