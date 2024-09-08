//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int maxNumber = scanner.nextInt();

        int first = 0, second = 1, next;

        System.out.print("Ряд Фібоначчі до " + maxNumber + ": ");

        while (first <= maxNumber) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }
    }
}