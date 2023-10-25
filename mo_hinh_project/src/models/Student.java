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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
