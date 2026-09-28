package academy.devdojo.maratonajava.javacore.execption.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person{
    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving employee");
    }
}
