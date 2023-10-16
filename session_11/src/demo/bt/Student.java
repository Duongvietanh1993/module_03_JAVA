package demo.bt;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private int id;
    private String name;
    private int age;
    private boolean status ;

    static int count=1;

    public Student() {
        this.id=count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age, boolean status) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.status = status;
    }





    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
