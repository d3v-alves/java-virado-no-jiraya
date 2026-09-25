package academy.devdojo.maratonajava.javacore.execption.exception.test;

import academy.devdojo.maratonajava.javacore.execption.exception.domain.Reader1;
import academy.devdojo.maratonajava.javacore.execption.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readerFile2();
    }

    public static void readerFile2() {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {

        }
    }

    public static void readerFile() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}