package mvc_pattern.service.Teacher;

import mvc_pattern.model.Teacher;
import mvc_pattern.repository.Teacher.ITeacherRepository;
import mvc_pattern.repository.Teacher.TeacherRepository;

import java.util.List;

public class TeacherService implements ITeacherService {
    private ITeacherRepository iTeacherRepository = new TeacherRepository();

    @Override
    public List<Teacher> displayList() {
        return iTeacherRepository.displayList();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        iTeacherRepository.addTeacher(teacher);
    }

    @Override
    public void updateTeacher(String id, Teacher teacher) {
        iTeacherRepository.updateTeacher(id, teacher);
    }

    @Override
    public void deleteTeacherById(String id) {
        iTeacherRepository.deleteTeacher(id);
    }
}
