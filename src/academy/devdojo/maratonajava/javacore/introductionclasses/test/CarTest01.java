package academy.devdojo.maratonajava.javacore.introductionclasses.test;

import academy.devdojo.maratonajava.javacore.introductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.name = "Corvette C2";
        car1.model = "Chevrolet";
        car1.year = 1963;

        //car1 = car2;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;

        System.out.println("Name " + car1.name + "\n" + "Model " + car1.model + "\n" + "Year " + car1.year);
        System.out.println("\nName " + car2.name + "\n" + "Model " + car2.model + "\n" + "Year " + car2.year);
    }
}
