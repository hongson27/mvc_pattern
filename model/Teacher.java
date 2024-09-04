package mvc_pattern.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private int salary;

    public Teacher(String code, String name, LocalDate localDate, String email, int salary) {
        super(code, name, localDate, email);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + ", " +
                "salary='" + salary + "'" +
                '}';
    }
}
