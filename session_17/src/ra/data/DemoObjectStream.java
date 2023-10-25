package ra.data;

import ra.data.models.Student;

import java.io.*;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("ghi vao file");
        FileOutputStream fileOutputStream = new FileOutputStream("session_17/src/ra/data/student.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        Student student = new Student(1,"Viet Anh",30,true);

        outputStream.writeObject(student);
        outputStream.close();
        System.out.println("ghi thanh cong");

        System.out.println("doc tu file");
        FileInputStream fileInputStream = new FileInputStream("session_17/src/ra/data/student.dat");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Student student1 = (Student) inputStream.readObject();
        System.out.println(student1);
        inputStream.close();
        System.out.println("ket thuc doc file");
    }
}
