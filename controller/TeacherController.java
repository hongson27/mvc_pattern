package mvc_pattern.controller;

import mvc_pattern.model.Teacher;
import mvc_pattern.service.Teacher.ITeacherService;
import mvc_pattern.service.Teacher.TeacherService;

import java.util.List;

public class TeacherController {
    ITeacherService iTeacherService = new TeacherService();

    public void getTeacherList() {
        List<Teacher> teachers = iTeacherService.displayList();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void addTeacher(Teacher teacher) {
        iTeacherService.addTeacher(teacher);
    }

    public void updateTeacherById(String id, Teacher teacher) {
        iTeacherService.updateTeacher(id, teacher);
    }


    public void deleteTeacherById(String id) {
        iTeacherService.deleteTeacherById(id);
    }
}
