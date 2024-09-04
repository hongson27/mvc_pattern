package mvc_pattern.service.Student;

import mvc_pattern.model.Student;
import mvc_pattern.repository.Student.IStudentRepository;
import mvc_pattern.repository.Student.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findALL();
    }

    @Override
    public void addStudent(Student student) {
        iStudentRepository.addStudent(student);
    }

    @Override
    public void deleteStudent(String id) {
        iStudentRepository.deleteStudent(id);
    }

    @Override
    public void updateStudent(String id, Student student) {
        iStudentRepository.updateStudent(id, student);
    }
}
