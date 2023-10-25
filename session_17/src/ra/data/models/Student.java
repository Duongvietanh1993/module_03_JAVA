package ra.data.models;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private boolean gender;

    private List<Mark> marks;

    public Student() {
    }

    public Student(int id, String name, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student(int id, String name, int age, boolean gender, List<Mark> marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
