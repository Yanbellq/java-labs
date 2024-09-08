package students;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk()
    {
        System.out.println("I'm walking");
    }
    public void run()
    {
        System.out.println("I'm run");
    }
}
