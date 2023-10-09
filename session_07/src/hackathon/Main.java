package hackathon;

import hackathon.manage.ManageMark;
import hackathon.manage.ManageStudent;
import hackathon.manage.ManageSubject;
import hackathon.model.Subject;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String menu = "=========Menu chính==========\n" +
                "1.Quản lý học sinh\n" +
                "2.Quản lý môn học\n" +
                "3.Quản lý điểm\n" +
                "0.Thoát khỏi chương trình\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManageStudent.showManagementStundet();
                    break;
                case 2:
                    ManageSubject.showManagementSubject();
                    break;
                case 3:
                    ManageMark.showManagementMark();
                    break;
            }
        } while (choice != 0);
    }




}
