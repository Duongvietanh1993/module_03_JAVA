package user;

public class Student extends User{
    public String subject;

    public Student() {
    }

    public Student(String subject) {
        this.subject = subject;
    }

    public Student(String userName, String password, int id, String subject) {
        super(userName, password, id);
        this.subject = subject;
    }


    @Override
    public void displaUser() {
        super.displaUser();
        System.out.println(subject);
    }
}
