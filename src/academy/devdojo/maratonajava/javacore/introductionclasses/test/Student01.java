package academy.devdojo.maratonajava.javacore.introductionclasses.test;

import academy.devdojo.maratonajava.javacore.introductionclasses.domain.Student;

public class Student01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Douglas";
        student.age = 18;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}