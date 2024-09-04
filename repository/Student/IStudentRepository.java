package mvc_pattern.repository.Student;

import mvc_pattern.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findALL();
    void addStudent(Student student);
    void updateStudent(String id, Student student);
    void deleteStudent(String id);


}
