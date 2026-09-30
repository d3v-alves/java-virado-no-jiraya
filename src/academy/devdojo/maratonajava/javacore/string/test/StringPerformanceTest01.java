package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30_0000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println(end - start);


    }

    private static void concatString(int large) {
        String text = "";
        for (int i = 0; i < large; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int large) {
        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < large; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int large) {
        StringBuffer sb = new StringBuffer(large);
        for (int i = 0; i < large; i++) {
            sb.append(1);
        }
    }
}
