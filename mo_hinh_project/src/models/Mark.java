package models;

public class Mark {
    private int markId;
    private Student student;
    private Subject subject;
    private int count = 1;

    public Mark() {
        this.markId = count++;
    }

    public Mark(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
    }
}
