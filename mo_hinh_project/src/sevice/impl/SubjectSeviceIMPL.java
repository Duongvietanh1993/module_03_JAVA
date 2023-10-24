package sevice.impl;

import models.ClassRoom;
import models.Subject;
import sevice.ISubjectSevice;

import java.util.ArrayList;
import java.util.List;

public class SubjectSeviceIMPL implements ISubjectSevice {
    static List<Subject> subjectList = new ArrayList<>();
    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public void save(Subject subject) {

    }

    @Override
    public void update(Subject subject) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Subject findById(int id) {
        return null;
    }
}
