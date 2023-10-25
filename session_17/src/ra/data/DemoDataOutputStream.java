package ra.data;

import ra.data.models.Student;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataOutputStream {
    public static void main(String[] args) throws IOException {
        File studentFile = new File("session_17/src/ra/data/student.dat");
        studentFile.createNewFile();
        Student student = new Student(1,"Viet Anh",30,true);

        double PI = 3.14;
        String language="Java";

        FileOutputStream fos = new FileOutputStream(studentFile);

        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeDouble(PI);
        dos.writeUTF(language);
        dos.close();
    }
}
