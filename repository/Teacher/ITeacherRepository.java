package mvc_pattern.repository.Teacher;

import mvc_pattern.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> displayList();
    void addTeacher(Teacher teacher);
    void updateTeacher(String id, Teacher teacher);
    void deleteTeacher(String id);
}
