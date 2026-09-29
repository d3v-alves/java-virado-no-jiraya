package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Douglas"; // String constant pool
        String name2 = "Douglas";
        name.concat(" Alves");
        System.out.println(name);
        System.out.println(name == name2);
    }
}
