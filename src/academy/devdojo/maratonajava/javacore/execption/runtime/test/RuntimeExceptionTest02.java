package academy.devdojo.maratonajava.javacore.execption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(1, 0);
    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Illegal argument, it can't divide by zero");
        }
        return a / b;
    }
}
