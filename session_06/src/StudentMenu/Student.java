package StudentMenu;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private String address;
    private String phone;

    static int count = 1;

    public Student() {
        this.studentId = count++;
    }

    public Student(String studentName, int age, String address, String phone) {
        this.studentId = count++;
        this.studentName = studentName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Thêm mới học sinh -----");
        System.out.println("Họ và tên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.println("Số Điện Thoại: ");
        this.phone = scanner.nextLine();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "--- Student " + studentId + " ---" + '\n' +
                "Id: " + studentId + '\n' +
                "Họ và tên: " + studentName + '\n' +
                "Tuổi: " + age + '\n' +
                "Địa chỉ: " + address + '\n' +
                "SDT: " + phone;
    }


}
