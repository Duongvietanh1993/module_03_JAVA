package classStudent.src;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        String nameStudent = input.nextLine();

        System.out.println("Nhập vào lớp: ");
        String classStudent = input.nextLine();

        Student student1 = new Student();
        student1.setName(nameStudent);
        student1.setClasses(classStudent);
        System.out.println(student1);
    }
}
