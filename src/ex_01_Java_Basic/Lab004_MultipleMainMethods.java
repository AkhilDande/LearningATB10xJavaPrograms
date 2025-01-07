package ex_01_Java_Basic;

public class Lab004_MultipleMainMethods {
    public static void main(String[] args) {
        System.out.println("Exact same name main methods wont work. because JVM gets confused if we have exact same main method name");
    }

    public static void main() {
        System.out.println("Only Different name main method work");
    }
}
