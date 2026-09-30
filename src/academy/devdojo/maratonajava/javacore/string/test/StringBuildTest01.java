package academy.devdojo.maratonajava.javacore.string.test;

public class StringBuildTest01 {
    public static void main(String[] args) {
        String name = "Douglas Alves";
        name.concat(" d3v_alves");
        name.substring(0,3);
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Douglas Alves");
        sb.append(" d3v_alves").append(" academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
