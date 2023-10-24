package models;

public class Student {
    private int studentId;
    private String studentName;
    private ClassRoom classRoom;
    private String birthday;
    private boolean gender;
    private int phone;
    private String address;
    private static int count=0;

    public Student() {
        this.studentId=count++;
    }

    public Student(String studentName, ClassRoom classRoom, String birthday, boolean gender, int phone, String address) {
        this.studentId=count++;
        this.studentName = studentName;
        this.classRoom = classRoom;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
}
