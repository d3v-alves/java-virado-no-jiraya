package academy.devdojo.maratonajava.javacore.execption.checkedvsunchecked;

public class Unchecked01 {
    public static void main(String[] args) {

        String name = null;
        printLength(name);
    }

    private static void printLength(String myString) {
        System.out.println(myString.length());
    }
}
