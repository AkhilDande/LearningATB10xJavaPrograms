package ex_04_Operators;

public class Lab038_Interview_MixedConcatenationplus {
    public static void main(String[] args) {
        String fname = "Akhil";
        String lname = "Dande";
        int a = 30;
        int b = 20;
        System.out.println(fname+lname+a+b); //performed concatenation along with string values
        System.out.println(fname+lname+(a+b)); // to perform concatenation along with sum value include int variables with brackets.
        System.out.println(a+b+fname+lname); //performed math and later concatinated it with string values
    }
}
