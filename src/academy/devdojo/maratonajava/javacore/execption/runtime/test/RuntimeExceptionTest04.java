package academy.devdojo.maratonajava.javacore.execption.runtime.test;

import javax.security.auth.login.FailedLoginException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ao executar o ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao executar o Exception");
        } catch (ArithmeticException e) {
            System.out.println("Erro ao executar o ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Erro ao executar o RuntimeException");
        }
        try {
            maybeThrowException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException {
    }
}