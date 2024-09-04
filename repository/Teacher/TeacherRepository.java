package mvc_pattern.repository.Teacher;

import mvc_pattern.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private final static List<Teacher> teachers;
    static {
        teachers = new ArrayList<>();
        Teacher t1 = new Teacher("1", "Fiora", LocalDate.parse("1999-09-09"), "fiora@example.com", 50000);
        Teacher t2 = new Teacher("2", "Graves", LocalDate.parse("1998-08-18"), "graves@example.com", 45000);
        // Add more teachers here
        teachers.add(t1);
        teachers.add(t2);
    }

    @Override
    public List<Teacher> displayList() {
        return teachers;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void updateTeacher(String id, Teacher teacher) {
        for (Teacher t : teachers) {
            if (t.getCode().equals(id)) {
                t.setName(teacher.getName());
                t.setLocalDate(teacher.getLocalDate());
                t.setEmail(teacher.getEmail());
                t.setSalary(teacher.getSalary());
                break;
            } else {
                System.out.println("Mã giảng viên không tồn tại");
            }
        }
    }

    @Override
    public void deleteTeacher(String id) {
        for (Teacher t : teachers) {
            if (t.getCode().equals(id)) {
                teachers.remove(t);
                break;
            } else {
                System.out.println("Mã giảng viên không tồn tại");
            }
        }
    }
}
