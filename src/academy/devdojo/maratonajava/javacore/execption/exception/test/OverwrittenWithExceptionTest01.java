package academy.devdojo.maratonajava.javacore.execption.exception.test;

import academy.devdojo.maratonajava.javacore.execption.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.execption.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.execption.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverwrittenWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
