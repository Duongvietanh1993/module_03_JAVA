package StudentMenu;

import java.util.Scanner;

public class Main {
    static Student[] studentList = new Student[100];
    static int studentCount = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student stu1 = new Student("Việt", 20, "HN", "123456789");
        Student stu2 = new Student("Anh", 21, "HN", "123456789");
        Student stu3 = new Student("Dương", 22, "HN", "123456789");

        studentList[studentCount] = stu1;
        studentCount++;
        studentList[studentCount] = stu2;
        studentCount++;
        studentList[studentCount] = stu3;
        studentCount++;


        int choice = 0;
        do {
            System.out.println("====== Menu ======");
            System.out.println("1.Thêm học sinh");
            System.out.println("2.sửa học sinh");
            System.out.println("3.Xóa học sinh");
            System.out.println("4.Tìm học sinh");
            System.out.println("5.Hiển thị toàn bộ danh sách");
            System.out.println("0.Thoát");
            System.out.println("Mời nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAddStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findIdStudent();
                    break;
                case 5:
                    showAll();
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        } while (choice != 0);

    }

    public static int findStudentIndexById(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (studentList[i].getStudentId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void showAddStudent() {
        if (studentCount >= 100) {
            System.out.println("Danh sách học sinh đã đầy");
        } else {
            Student newStudent = new Student();
            newStudent.inputData();
            studentList[studentCount] = newStudent;
            studentCount++;
            System.out.println("Đã thêm học sinh: " + newStudent);
        }
    }

    public static void showAll() {
        if (studentCount == 0) {
            System.out.println("Danh sách không có học sinh");
        } else {
            System.out.println("----- Danh sách tất cả học sinh -----");
            for (int i = 0; i < studentCount; i++) {
                System.out.println("Học sinh " + (i + 1) + ":");
                System.out.println(studentList[i]);
            }
        }
    }

    public static void editStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã học sinh cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findStudentIndexById(id);

        if (index != -1) {
            Student student = studentList[index];
            System.out.println("Thông tin học sinh cần sửa:");
            System.out.println(student);

            System.out.println("Nhập thông tin mới cho học sinh:");
            System.out.println("Tên: ");
            String name = scanner.nextLine();
            System.out.println("Tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println("Số điện thoại: ");
            String phoneNumber = scanner.nextLine();

            student.setStudentName(name);
            student.setAge(age);
            student.setAddress(address);
            student.setPhone(phoneNumber);

            System.out.println("Đã sửa thông tin học sinh thành công:");
            System.out.println(student);
        } else {
            System.out.println("Không tìm thấy học sinh có mã " + id);
        }
    }

    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã học sinh cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findStudentIndexById(id);

        if (index != -1) {
            Student deletedStudent = studentList[index];

            // Di chuyển các phần tử sau về trước để xóa học sinh
            for (int i = index; i < studentCount - 1; i++) {
                studentList[i] = studentList[i + 1];
            }

            studentCount--;
            System.out.println("Đã xóa học sinh: " + deletedStudent);
        } else {
            System.out.println("Không tìm thấy học sinh có mã " + id);
        }
    }

    public static void findIdStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã học sinh: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findStudentIndexById(id);

        if (index != -1) {
            System.out.println("Thông tin học sinh có mã " + id + ":");
            System.out.println(studentList[index]);
        } else {
            System.out.println("Không tìm thấy học sinh có mã " + id);
        }
    }
}
