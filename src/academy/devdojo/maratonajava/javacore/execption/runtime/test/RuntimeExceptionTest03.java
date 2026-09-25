package academy.devdojo.maratonajava.javacore.execption.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        //opensConnection();
        opensConnection2();
    }

    private static String opensConnection() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing data in the file");
            return "Open connection";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing resource released by the OS");
        }
        return null;
    }

    private static void opensConnection2() {
        try {
            System.out.println("Opening file");
            System.out.println("Writing data in the file");
            throw new RuntimeException();
        } finally {
            System.out.println("Closing resource released by the OS");
        }
    }
}