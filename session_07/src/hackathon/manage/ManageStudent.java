package hackathon.manage;

import hackathon.model.Student;

import java.util.Scanner;

public class ManageStudent {
    static Student[] listStudent = new Student[100];
    static int countStudent = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void showManagementStundet() {
        Student student1=new Student("việt","20/1/1000","HN","nam","0123456789");
        Student student2=new Student("anh","20/1/1000","HN","nam","0987654321");
        Student student3=new Student("dương","20/1/1000","HN","nam","011111111");
        listStudent[countStudent++]=student1;
        listStudent[countStudent++]=student2;
        listStudent[countStudent++]=student3;

        String menu = "=========Menu Quản lý Học sinh==========\n" +
                "1.Thêm mới\n" +
                "2.Hiển thị tất cả danh sách\n" +
                "3.Sửa thông tin\n" +
                "4.Xóa\n" +
                "0.Thoát khỏi chương trình\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayListStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
            }
        } while (choice != 0);
    }




    /*Thêm mới*/
    public static void addStudent() {
        Student newStudent = new Student();
        newStudent.inputDataStudent(listStudent,countStudent);

        listStudent[countStudent++] = newStudent;
    }

    /*Hiển thị all*/
    public static void displayListStudent() {
        System.out.println("-----Danh sách học sinh-----");
        for (int i = 0; i < countStudent; i++) {
            System.out.println(listStudent[i]);
        }
        System.out.println("----------------------------");
    }

    /*tìm kiếm theo id*/
    public static int findIndexById(int id) {
        for (int i = 0; i < countStudent; i++) {
            if (listStudent[i].getStudentId() == id) {
                return i;
            }
        }
        return -1;
    }

    /*sửa*/
    public static void editStudent(){
        System.out.println("Nhập vào Id học sinh muốn sửa: ");
        int studentId = scanner.nextInt();
        int editId = findIndexById(studentId);
        if (editId != -1){
            Student student = listStudent[editId];
            System.out.println("----- Cập nhật lại thông tin -----");
            System.out.println(student);
            student.inputDataStudent(listStudent,countStudent);
            listStudent[editId] = student;
            System.out.println("Thành công cập nhật lại thông tin");
        }else {
            System.out.println("Không tìm thấy học sinh có Id: "+studentId);
        }
    }


    /*xóa*/
    public static void deleteStudent(){
        System.out.println("Nhập vào Id muốn xóa: ");
        int studentId = scanner.nextInt();
        int editId = findIndexById(studentId);
        if (editId != -1) {
            Student deletedStudent = listStudent[editId];
            // Di chuyển các phần tử sau về trước để xóa học sinh
            for (int i = editId; i < countStudent - 1; i++) {
                listStudent[i] = listStudent[i + 1];
            }
            countStudent--;
            System.out.println("Đã xóa học sinh: \n" + deletedStudent);
        } else {
            System.err.println("Không tìm thấy sách có Id=" + studentId);
        }
    }
}
