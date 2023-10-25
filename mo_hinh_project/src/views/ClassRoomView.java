package views;

import config.Config;
import models.ClassRoom;
import models.Student;
import sevice.IClassRoomSevice;
import sevice.IStudentSevice;
import sevice.impl.ClassRoomSeviceIMPL;
import sevice.impl.StudentSeviceIMPL;

import java.util.List;

public class ClassRoomView {
    IClassRoomSevice classRoomSevice = new ClassRoomSeviceIMPL();
    IStudentSevice studentSevice = new StudentSeviceIMPL();

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
            choice = Config.validateInt();
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
                    deleteClassRoom();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }

    private void addClassRoom() {
        System.out.println("Nhập số lượng lớp học cần thêm: ");
        int n = Config.validateInt();
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
        int inEdit = Config.validateInt();
        ClassRoom classRoomEdit = classRoomSevice.findById(inEdit);
        if (classRoomEdit != null) {
            System.out.println("Đối tượng cần sửa: ");
            System.out.println(classRoomEdit);
            int choice;
            System.out.println("Chọn thông tin cần sửa");
            System.out.println("1.sửa tên");
            System.out.println("2.sửa trạng thái");
            choice = Config.validateInt();
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
        System.out.println("Nhập ID lớp học cần xóa: ");
        int idDelete = Config.validateInt();
        List<Student> studentList = studentSevice.findAll();
        for (Student student : studentList) {
            if (student.getClassRoom().getClassroomId() == idDelete){
                System.out.println("Lớp học đã tồn tại sinh viên không được xóa");
                return;
            }
        }
        boolean check = true;
        for (ClassRoom classroom : classRoomSevice.findAll()) {
            if (classroom.getClassroomId() == idDelete){
                classRoomSevice.delete(idDelete);
                System.out.println("Xóa lớp học thành công");
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Không tim thấy lớp học theo ID vừa nhâp");
        }
    }
}
