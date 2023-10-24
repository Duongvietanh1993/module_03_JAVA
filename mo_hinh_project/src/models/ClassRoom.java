package models;

public class ClassRoom {

    private int classroomId;
    private String classroomName;
    private boolean status;
    private static int count = 0;

    public ClassRoom() {
        this.classroomId = count++;
    }

    public ClassRoom(String classroomName, boolean status) {
        this.classroomId = count++;
        this.classroomName = classroomName;
        this.status = status;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classroomId=" + classroomId +
                ", classroomName='" + classroomName + '\'' +
                ", status=" + status +
                '}';
    }
}
