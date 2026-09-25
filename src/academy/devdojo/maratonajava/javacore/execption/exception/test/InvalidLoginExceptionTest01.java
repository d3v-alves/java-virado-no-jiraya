package academy.devdojo.maratonajava.javacore.execption.exception.test;

import academy.devdojo.maratonajava.javacore.execption.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            toLogin();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void toLogin() throws InvalidLoginException {
        Scanner keyboard = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "1234";
        System.out.println("User");
        String usernameTyped = keyboard.nextLine();
        System.out.println("Password");
        String passwordTyped = keyboard.nextLine();
        if (!usernameDB.equals(usernameTyped) ||  !passwordDB.equals(passwordTyped)) {
            throw new InvalidLoginException("Invalid username or password");
        }
        System.out.println("Login Successful");
    }
}
