package academy.devdojo.maratonajava.introduction.type;

public class PrimitiveTypeExercise {
    static void main (){
        String name = "Douglas";
        String address = "123 Main St";
        double salary = 3500.99;
        String dateOfSalaryPayment = "05/20/2026";
        String report = "My name is " + name + " resident of the address " + address +
                " and I confirm that I received the salary of: $" + salary + " on date " + dateOfSalaryPayment;
        System.out.println(report);
    }
}
