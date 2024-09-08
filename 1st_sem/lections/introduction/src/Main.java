import students.Person;
import students.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 12);
        Person student = new Student("Bob", 16, 2);

        person.walk();
        student.walk();
    }
}