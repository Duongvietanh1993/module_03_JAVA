package hackathon.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subject {
    private String subjectId;
    private String subjectName;


    public Subject() {
    }

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public void inputDataSubject(){
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^MH\\d{3}$"); // Biểu thức chính quy để kiểm tra id

        System.out.println("Mã Môn Học(bắt đầu bằng 'MH' và theo sau là 3 chữ số không trùng lặp): ");
        this.subjectId = scanner.nextLine();

        // Kiểm tra mã không để trống và đúng định dạng
        Matcher matcher = pattern.matcher(this.subjectId);
        while (this.subjectId.isEmpty() || !matcher.matches()) {
            System.err.println("Mã Môn Học không hợp lệ. Vui lòng nhập lại: ");
            this.subjectId = scanner.nextLine();
            matcher = pattern.matcher(this.subjectId);
        }

        System.out.println("Tên môn học: ");
        this.subjectName = scanner.nextLine();

        // Kiểm tra tên không để trống
        while (this.subjectName.isEmpty()) {
            System.err.println("Tên môn học không được để trống. Vui lòng nhập lại: ");
            this.subjectName = scanner.nextLine();
        }
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "---- Môn Học ----" +'\n' +
                "subjectId: " + subjectId + '\n' +
                "subjectName: " + subjectName + '\n' ;
    }
}
