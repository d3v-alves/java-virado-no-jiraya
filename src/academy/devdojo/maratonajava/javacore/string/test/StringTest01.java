package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Douglas"; // String constant pool
        String name2 = "Douglas";
        name = name.concat(" Alves");
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Douglas"); // 1 - variavel de referencia, 2 - ojeto do tipo string, 3 - uma string no pool de string
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());


    }
}
