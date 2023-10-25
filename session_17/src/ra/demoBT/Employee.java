package ra.demoBT;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
    int id;
    String name;
    boolean status;
    List<Skill> skills;

    public Employee() {
    }

    public Employee(int id, String name, boolean status, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skills = skills;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", skills=" + skills +
                '}';
    }
}
