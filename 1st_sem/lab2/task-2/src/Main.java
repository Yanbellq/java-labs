//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> customerRequests = new LinkedList<>();

        // Додавання нових запитів
        customerRequests.add("Запит 1");
        customerRequests.add("Запит 2");
        customerRequests.add("Запит 3");

        System.out.println("Черга запитів: " + customerRequests);

        // Обробка запитів у порядку FIFO
        while (!customerRequests.isEmpty()) {
            String currentRequest = customerRequests.poll();
            System.out.println("Обробляється: " + currentRequest);
            // Тут можна додати логіку обробки запиту
        }

        System.out.println("Черга запитів після обробки: " + customerRequests);
    }
}