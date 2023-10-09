package hackathon.model;

import java.util.Scanner;

public class Mark {
    static int count = 1;

    private int markId;
    private Student student;
    private Subject subject;
    private double score;

    public Mark(Student student, Subject subject, double point) {
        this.markId = count++;
        this.student = student;
        this.subject = subject;
        this.score = score;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        if (student == null || subject == null) {
            System.out.println("No student or subject available. Please add student and subject first.");
            return;
        }

        System.out.println("Enter the score for " + student.getStudentName() + " in " + subject.getSubjectName() + ": ");
        this.score = scanner.nextDouble();
    }




    @Override
    public String toString() {
        return "--- Mark ---" + '\n' +
                "markId: " + markId + '\n' +
                "student: " + student.getStudentName() + '\n' +
                "subject: " + subject.getSubjectName() + '\n' +
                "point: " + score + '\n';
    }
}
