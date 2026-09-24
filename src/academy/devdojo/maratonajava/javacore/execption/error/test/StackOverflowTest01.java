package academy.devdojo.maratonajava.javacore.execption.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        recursive();
    }
}
