package classStudent;

import java.util.Scanner;

public class Student {
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;


    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "Id= " + studentId + '\n' +
                        "studentName: " + studentName + '\n' +
                        "sex: " + (sex ? "Nam" : "Nữ") + '\n' +
                        "className: " + className + '\n' +
                        "age: " + age + '\n' +
                        "address: " + address + '\n'
                ;
    }
}
