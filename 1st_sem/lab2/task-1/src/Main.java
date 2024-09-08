//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        try {
            login("user", "password");
        } catch (InvalidCredentialsException e) {
            System.out.println("Помилка входу: " + e.getMessage());
        }
    }

    public static void login(String username, String password) throws InvalidCredentialsException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я користувача: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Введіть пароль: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Вхід успішний!");
        } else {
            throw new InvalidCredentialsException("Невірне ім'я користувача або пароль.");
        }
    }
}