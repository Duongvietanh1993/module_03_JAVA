package ra.data;

import ra.data.models.Mark;
import ra.data.models.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoObjectStream2 {
    public static void main(String[] args) throws IOException {
        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("java",10));
        marks.add(new Mark("SQL",10));
        Student student = new Student(1,"Viet Anh",30,true,marks);


        FileOutputStream fos = new FileOutputStream("session_17/src/ra/data/student.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);

        System.out.println("thuc hien ghi");
        outputStream.writeObject(student);
        outputStream.close();
        System.out.println("ket thuc ghi");
    }
}
