package students;

import java.io.Serializable;

public class Student extends Person implements Runner, Serializable {
    private int course;

    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    public void walk()
    {
        System.out.println("Student Walk");
    };
    public void run()
    {
        System.out.println("Student Run");
    }
}
