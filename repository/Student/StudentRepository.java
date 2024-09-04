package mvc_pattern.repository.Student;

import mvc_pattern.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final static List<Student> students;
    static {
        students = new ArrayList<>();
        Student s1 = new Student("1", "Annie", LocalDate.parse("1999-09-09"), "annie@example.com", "Class 1");
        Student s2 = new Student("2", "Bee", LocalDate.parse("1998-08-18"), "bee@example.com", "Class 2");
        students.add(s1);
        students.add(s2);
    }

    @Override
    public List<Student> findALL() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void deleteStudent(String id) {
        for (Student student : students) {
            if (student.getCode().equals(id)) {
                students.remove(student);
                break;
            }
            else {
                System.out.println("Không tìm thấy sinh viên có mã id " + id);
            }
        }
    }

    @Override
    public void updateStudent(String id, Student student) {
        for (Student student : students) {
            if (student.getCode().equals(id)) {
                student.setName(student.getName());
                student.setLocalDate(student.getLocalDate());
                student.setEmail(student.getEmail());
                student.setClassName(student.getClassName());
                break;
            }
            else {
                System.out.println("Không tìm thấy sinh viên có mã id " + id);
            }
        }
    }
}
