package mvc_pattern.controller;

import mvc_pattern.model.Student;
import mvc_pattern.service.Student.IStudentService;
import mvc_pattern.service.Student.StudentService;

import java.util.List;

public class StudentController {
    IStudentService iStudentService = new StudentService();
    public void getStudentList() {
        List<Student> students = iStudentService.findAll();
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public void addStudent(Student student) {
        iStudentService.addStudent(student);
    }

    public void deleteStudentById(String id) {
        iStudentService.deleteStudent(id);
    }

    public void updateStudent(String id, Student student) {
        iStudentService.addStudent(id,student);
    }
}
