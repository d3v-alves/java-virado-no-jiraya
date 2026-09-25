package academy.devdojo.maratonajava.javacore.execption.exception.domain;

public class InvalidLoginException extends Exception {

    public InvalidLoginException() {
        super("Invalid login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
