package sevice.impl;

import models.ClassRoom;
import models.Student;
import sevice.IStudentSevice;

import java.util.ArrayList;
import java.util.List;

public class StudentSeviceIMPL implements IStudentSevice {
    static List<Student> studentList = new ArrayList<>();
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
