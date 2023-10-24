package views;

import config.Config;
import models.ClassRoom;
import models.Student;
import sevice.IClassRoomSevice;
import sevice.IStudentSevice;
import sevice.impl.ClassRoomSeviceIMPL;

import java.util.List;

public class ClassRoomView {
    IClassRoomSevice classRoomSevice = new ClassRoomSeviceIMPL();


    public void menu() {
        int choice;
        do {
            System.out.println("**********************MENU************************");
            System.out.println("1. Hiển thị danh sách lớp học");
            System.out.println("2. Thêm");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("0. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4): ");
            choice = Config.validate();
            switch (choice) {
                case 1:
                    showListClassRoom();
                    break;
                case 2:
                    addClassRoom();
                    break;
                case 3:
                    editClassRoom();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }

    private void addClassRoom() {
        System.out.println("Nhập số lượng lớp học cần thêm: ");
        int n = Config.validate();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập lớp thứ " + (i + 1));
            ClassRoom newClassRoom = new ClassRoom();
            System.out.println("Nhập tên lớp: ");
            newClassRoom.setClassroomName(Config.scanner().nextLine());
            System.out.println("Nhập trạng thái lớp (true/false): ");
            newClassRoom.setStatus(Boolean.parseBoolean(Config.scanner().nextLine()));
            classRoomSevice.save(newClassRoom);
        }
    }

    private void showListClassRoom() {
        System.out.println("Danh sách lớp học");
        List<ClassRoom> classRoomList = classRoomSevice.findAll();
        for (ClassRoom classRoom : classRoomList) {
            System.out.println(classRoom);
        }
    }

    private void editClassRoom() {
        System.out.println("Mời nhập ID cần sửa: ");
        int inEdit = Config.validate();
        ClassRoom classRoomEdit = classRoomSevice.findById(inEdit);
        if (classRoomEdit != null) {
            System.out.println("Đối tượng cần sửa: ");
            System.out.println(classRoomEdit);
            int choice;
            System.out.println("Chọn thông tin cần sửa");
            System.out.println("1.sửa tên");
            System.out.println("2.sửa trạng thái");
            choice = Config.validate();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên mới: ");
                    classRoomEdit.setClassroomName(Config.scanner().nextLine());
                    break;
                case 2:
                    System.out.println("Nhập trạng thái mới: ");
                    classRoomEdit.setStatus(!classRoomEdit.isStatus());
                    break;
                default:
                    System.out.println("không có lựa, chọn mời nhập lại");
            }

        } else {
            System.out.println("Không tìm thấy lớp theo ID");
        }
    }

    private void deleteClassRoom() {
        System.out.println("Nhập ID lớp ần xóa: ");
        int idDelete = Config.validate();

    }
}
