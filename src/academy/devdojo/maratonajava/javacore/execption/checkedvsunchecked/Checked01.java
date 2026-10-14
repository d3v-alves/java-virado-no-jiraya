package academy.devdojo.maratonajava.javacore.execption.checkedvsunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked01 {
    public static void main(String[] args) {

        readFile("myFile01.txt");

    }

    private static void readFile(String fileName){
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Hey, that file doesn't exist!");
        }
    }
}
