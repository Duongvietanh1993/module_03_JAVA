package bt.sapXepHocSinh;

public class Student {
    private int id;
    private String name;
    private int score;

    private static int count = 1;

    public Student() {
        this.id = count++;
    }

    public Student(String name, int score) {
        this.id = count++;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "---------Student---------" + '\n' +
                "id: " + id + '\n' +
                "name: " + name + '\n' +
                "score: " + score + '\n';
    }
}
