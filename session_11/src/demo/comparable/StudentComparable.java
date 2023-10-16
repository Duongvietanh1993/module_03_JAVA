package demo.comparable;

public class StudentComparable implements Comparable<StudentComparable> {
    private int id;


    public StudentComparable(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(StudentComparable s1) {
        return (this.id - s1.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
