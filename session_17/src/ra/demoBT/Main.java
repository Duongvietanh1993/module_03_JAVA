package ra.demoBT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File employeeFile = new File("session_17/src/ra/demoBT/employee.dat");
        employeeFile.createNewFile();

        List<Skill>skills= new ArrayList<>();
        skills.add( new Skill("khỏe", 6));
        Employee newEmployee = new Employee(1, "John", true, skills);

        FileOutputStream fileOutputStream = new FileOutputStream(employeeFile);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        System.out.println("Ghi vào File");
        outputStream.writeObject(newEmployee);
        outputStream.close();
        System.out.println("kết thúc ghi");

        FileInputStream fileInputStream = new FileInputStream(employeeFile);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Employee employee1= (Employee) inputStream.readObject();
        System.out.println("in ra");
        System.out.println(employee1);
    }
}
