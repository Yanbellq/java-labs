import java.io.BufferedReader;
import java.io.FileReader;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Person implements Comparable<Person>
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other)
    {
        return Integer.compare();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //public static void methodThatTrowException;
//        try {
//            FileReader reader = new FileReader("file.txt");
//            int character;
//            while ((character = reader.read()) != -1) {
//                System.out.print((char) character);
//            }
//        }
//        catch (Exception e) {
//            System.out.println("Failed to read the file" + e.getMessage());
//        }
////        finally {
////            if (reader != null)
////            {
////                try {
////                    reader.close();
////                }
////                catch (Exception e) {
////                    System.out.println("Failed to close the reader" + e.getMessage());
////                }
////            }
////        }
//
//        //try with resorses
//        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt")))
//        {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        }
//        catch (Exception e) {
//            System.out.println("Failed to read the file" + e.getMessage());
//        }
//        public static void method1() throw MyCheckedException
//        {
//            try {
//                method2();
//            }
//            catch (MyCheckedException e) {
//                throw new MyCustomException("Failed in method1", e);
//            }
//        }
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.add(0, 9999999);
        numbers.remove(2);

        System.out.println(numbers);

        Queue<Person> people = new PriorityQueue<>();

        people.add(new Person("Bob", 17))
        people.add(new Person("Bob", 17))
        people.add(new Person("Bob", 17))

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

//public class MyCheckedException extends Exception
//{
//    public MyCheckedException() { super(); }
//    public MyCheckedException(String message) { super(message); }
//    public MyCheckedException(String message, Throwable cause) { super(message, cause); }
//    public MyCheckedException(Throwable cause) { super(cause); }
//}

public class Person implements Comparable<Person>
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other)
    {
        return Integer.compare(this.age, other.age);
    }
}
