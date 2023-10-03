package thucHanh;

import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên sinh viên: ");
        String inputName = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Vị trí của sinh viên " + inputName + "là" + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không có tên sinh viên " + inputName + "trong danh sách");
        }
    }
}
