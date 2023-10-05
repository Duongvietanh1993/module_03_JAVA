package classEmployee;

public class Employee {
    int id;
    String name;
    int age;
    boolean gender;
    double rate;
    double salary;

    public Employee() {
    }

    static int count = 0;

    public Employee(String name, int age, boolean gender, double rate, double salary) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    double calSalary() {
        return rate * salary;
    }

    @Override
    public String toString() {
        return "---- Nhân Viên" + id + " ----" + '\n' +
                "id: " + id + '\n' +
                "Họ và tên: " + name + '\n' +
                "Tuổi: " + age + '\n' +
                "Giới tính: " + (gender?"Nam":"Nữ") + '\n' +
                "Hệ Số: " + rate + '\n' +
                "Lương cơ bản: " + salary+"$" + '\n' +
                "Lương được nhận: " + calSalary()+"$";
    }
}
