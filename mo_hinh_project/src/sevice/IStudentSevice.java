package sevice;

import models.Student;

import java.util.List;

public interface IStudentSevice extends IGeneric<Student>{

    List<Student> findByName(String name);

}
