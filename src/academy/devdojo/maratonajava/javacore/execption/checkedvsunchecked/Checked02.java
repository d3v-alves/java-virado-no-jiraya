package academy.devdojo.maratonajava.javacore.execption.checkedvsunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked02 {
    public static void main(String[] args) throws FileNotFoundException {

        readFile("myFile01.txt");

    }
    private static void readFile(String fileName) throws FileNotFoundException{
        FileReader reader = new FileReader(fileName);
    }
}
