package mvc_pattern.service.Teacher;

import mvc_pattern.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> displayList();
    void addTeacher(Teacher teacher);
    void updateTeacher(String id, Teacher teacher);

    void deleteTeacherById(String id);
}
