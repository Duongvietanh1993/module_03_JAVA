package sevice.impl;

import models.ClassRoom;
import models.Mark;
import sevice.IMarkSevice;

import java.util.ArrayList;
import java.util.List;

public class MarkSeviceIMPL implements IMarkSevice {
    static List<Mark> markList = new ArrayList<>();
    @Override
    public List<Mark> findAll() {
        return null;
    }

    @Override
    public void save(Mark mark) {

    }

    @Override
    public void update(Mark mark) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Mark findById(int id) {
        return null;
    }
}
