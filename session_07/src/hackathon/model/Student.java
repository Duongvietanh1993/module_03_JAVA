package hackathon.model;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private String birthDay;
    private String address;
    private String gender;
    private String phone;
    private static int count = 1;

    public Student() {
        this.studentId = count++;
    }

    public Student(String studentName, String birthDay, String address, String gender, String phone) {
        this.studentId = count++;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public void inputDataStudent(Student[] students, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        this.studentName = scanner.nextLine();

        // Kiểm tra tên không để trống
        while (this.studentName.isEmpty()) {
            System.err.println("Họ và tên không được để trống. Vui lòng nhập lại: ");
            this.studentName = scanner.nextLine();
        }

        System.out.println("Ngày sinh: ");
        this.birthDay = scanner.nextLine();

        // Kiểm tra Ngày sinh không để trống
        while (this.birthDay.isEmpty()) {
            System.err.println("Ngày sinh không được để trống. Vui lòng nhập lại: ");
            this.birthDay = scanner.nextLine();
        }

        System.out.println("Địa chỉ: ");
        this.address = scanner.nextLine();

        // Kiểm tra Địa chỉ không để trống
        while (this.address.isEmpty()) {
            System.err.println("Địa chỉ không được để trống. Vui lòng nhập lại: ");
            this.address = scanner.nextLine();
        }

        System.out.println("Giới tính: ");
        this.gender = scanner.nextLine();

        // Kiểm tra Giới tính không để trống
        while (this.gender.isEmpty()) {
            System.err.println("Giới tính không được để trống. Vui lòng nhập lại: ");
            this.gender = scanner.nextLine();
        }

        System.out.println("Số Điện Thoại: ");
        String phoneNum = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < index; i++) {
            if (students[i].phone.equals(phoneNum)) {
                check = true;
            }

        }
        // Kiểm tra Số Điện Thoại không để trống và ít nhất 10 ký tự
        while (phoneNum.isEmpty() || phoneNum.length() < 10 || phoneNum.charAt(0) != '0' || check) {
            System.err.println("Số Điện Thoại không được để trống,bắt đầu bằng '0' và phải có ít nhất 10 số. Vui lòng nhập lại: ");
            phoneNum = scanner.nextLine();
            check = false;
            for (int i = 0; i < index; i++) {
                if (students[i].phone.equals(phoneNum)) {
                    check = true;
                }
            }
        }
        this.phone = phoneNum;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "------ Học sinh " + studentId + " -----" + '\n' +
                "id: " + studentId + '\n' +
                "studentName: " + studentName + '\n' +
                "birthDay: " + birthDay + '\n' +
                "address: " + address + '\n' +
                "gender: " + gender + '\n' +
                "phone: " + phone + '\n';
    }
}
