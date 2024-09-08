import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть оцінку (ціле число від 1 до 12): ");
        int grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
                System.out.println("Незадовільно");
                break;
            case 3:
            case 4:
                System.out.println("Задовільно");
                break;
            case 5:
            case 6:
                System.out.println("Достатньо");
                break;
            case 7:
            case 8:
                System.out.println("Добре");
                break;
            case 9:
            case 10:
                System.out.println("Відмінно");
                break;
            case 11:
            case 12:
                System.out.println("Чудово");
                break;
            default:
                System.out.println("Невідома оцінка");
        }
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    }
}

