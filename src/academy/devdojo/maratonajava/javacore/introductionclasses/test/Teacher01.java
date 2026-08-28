package academy.devdojo.maratonajava.javacore.introductionclasses.test;

import academy.devdojo.maratonajava.javacore.introductionclasses.domain.Teacher;

public class Teacher01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Douglas";
        teacher.age = 20;
        teacher.sex = 'M';
        System.out.println("Name " + teacher.name + "\n" + "Age " + teacher.age + "\n" + "Sex " + teacher.sex + "\n");

    }
}
