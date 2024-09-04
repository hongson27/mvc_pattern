package mvc_pattern.service.Student;

import mvc_pattern.model.Student;

import java.util.List;

public interface IStudentService {
     List<Student> findAll();
     void addStudent(Student student);
     void deleteStudent(String id);
     void updateStudent(String id, Student student);
}
