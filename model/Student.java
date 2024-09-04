package mvc_pattern.model;

import java.time.LocalDate;

public class Student extends Person {
    private String className;
    public Student(String code, String name, LocalDate localDate, String email, String className) {
        super(code, name, localDate, email);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", " +
                "className='"  + className + '\'' +
                '}' ;
    }
}
