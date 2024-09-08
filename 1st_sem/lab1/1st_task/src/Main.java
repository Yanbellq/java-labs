import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть символ: ");
        char symbol = scanner.next().charAt(0);

        int ascii = (int) symbol;

        System.out.println("Код ASCII для символу '" + symbol + "' : " + ascii);
    }
}

//TIP To see all <b>ASCII</b> codes, go to this site: "https://www.rapidtables.org/ru/code/text/ascii-table.html"