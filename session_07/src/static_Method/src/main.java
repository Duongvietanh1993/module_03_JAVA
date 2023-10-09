package static_Method.src;

public class main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Minh");
        Student s2 = new Student(222,"Nam");
        Student s3 = new Student(333,"Nguyên");

        s1.display();
        s2.display();
        s3.display();
    }
}
