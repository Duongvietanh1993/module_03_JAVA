package sevice.impl;

import models.ClassRoom;
import sevice.IClassRoomSevice;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomSeviceIMPL implements IClassRoomSevice {
    static List<ClassRoom> classRoomList = new ArrayList<>();


    @Override
    public List<ClassRoom> findAll() {
        return classRoomList;
    }

    @Override
    public void save(ClassRoom classRoom) {
        classRoomList.add(classRoom);
    }

    @Override
    public void update(ClassRoom classRoom) {
        ClassRoom classRoomEdit = findById(classRoom.getClassroomId());
        classRoomEdit.setClassroomName(classRoom.getClassroomName());
        classRoomEdit.setStatus(classRoom.isStatus());
    }

    @Override
    public void delete(int id) {
        classRoomList.remove(id);
    }

    @Override
    public ClassRoom findById(int id) {
        for (ClassRoom classRoom : classRoomList) {
            if (classRoom.getClassroomId() == id) {
                return classRoom;
            }
        }
        return null;
    }
}
