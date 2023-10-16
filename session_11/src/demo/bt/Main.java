package demo.bt;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Họ và tên: ");
            String name = scanner.nextLine();
            System.out.println("tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("trạng thái (true và false): ");
            boolean statur = Boolean.parseBoolean(scanner.nextLine());
            Student newStudent = new Student(name, age, statur);
            students.add(newStudent);

            Collections.sort(students, new Comparator<Student>() {

                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            System.out.println(students);

        }
    }
}
