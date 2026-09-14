package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.domain.Student;
import academy.devdojo.maratonajava.javacore.introductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Ragnar";
        student01.age = 30;
        student01.sex = 'M';

        student02.name = "Loki";
        student02.age = 30;
        student02.sex = 'M';

        printer.print(student01);

        printer.print(student02);
    }
}
