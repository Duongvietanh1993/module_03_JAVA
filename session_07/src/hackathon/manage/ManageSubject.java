package hackathon.manage;

import hackathon.model.Mark;
import hackathon.model.Student;
import hackathon.model.Subject;

import java.util.Scanner;

public class ManageSubject {
    static Subject[] listSubjects = new Subject[100];
    static int countSubjects = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void showManagementSubject() {
        listSubjects[countSubjects++] = new Subject("MH124", "Văn");
        listSubjects[countSubjects++] = new Subject("MH125", "Anh");
        listSubjects[countSubjects++] = new Subject("MH123", "Toán");

        String menu = "=========Menu Quản lý Môn Học==========\n" +
                "1.Thêm mới\n" +
                "2.Hiển thị tất cả danh sách\n" +
                "3.Sửa thông tin\n" +
                "4.Xóa\n" +
                "0.Thoát khỏi chương trình\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addSubject();
                    break;
                case 2:
                    displayListSubject();
                    break;
                case 3:
                    editSubject();
                    break;
                case 4:
                    deleteSubject();
                    break;
            }
        } while (choice != 0);
    }


    /*Thêm mới*/
    public static void addSubject() {
        Subject newSubject = new Subject();
        newSubject.inputDataSubject();
        listSubjects[countSubjects++] = newSubject;
    }

    /*Hiển thị all*/
    public static void displayListSubject() {
        System.out.println("-----Danh sách môn học-----");
        for (int i = 0; i < countSubjects; i++) {
            System.out.println(listSubjects[i]);
        }
        System.out.println("----------------------------");
    }

    /*tìm kiếm theo id*/
    public static int findIndexById(String id) {
        for (int i = 0; i < countSubjects; i++) {
            if (listSubjects[i].getSubjectId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    /*sửa*/
    public static void editSubject(){
        System.out.println("Nhập vào Id môn học muốn sửa: ");
        String subjectId = scanner.nextLine();
        int editId = findIndexById(subjectId);
        if (editId != -1){
            Subject subject = listSubjects[editId];
            System.out.println("----- Cập nhật lại thông tin -----");
            System.out.println(subject);
            subject.inputDataSubject();
            listSubjects[editId] = subject;
            System.out.println("Thành công cập nhật lại thông tin");
        }else {
            System.out.println("Không tìm thấy học sinh có Id: "+subjectId);
        }
    }


    /*xóa*/
    public static void deleteSubject(){
        System.out.println("Nhập vào Id môn học muốn xóa: ");
        String subjectId = scanner.nextLine();
        int editId = findIndexById(subjectId);
        if (editId != -1) {
            Subject deletedSubject = listSubjects[editId];
            // Di chuyển các phần tử sau về trước để xóa học sinh
            for (int i = editId; i < countSubjects - 1; i++) {
                listSubjects[i] = listSubjects[i + 1];
            }
            countSubjects--;
            System.out.println("Đã xóa học sinh: \n" + deletedSubject);
        } else {
            System.err.println("Không tìm thấy sách có Id=" + subjectId);
        }
    }
}
