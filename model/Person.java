package mvc_pattern.model;

import java.time.LocalDate;

public class Person {
    private String code;
    private String name;
    private LocalDate localDate;
    private String email;

    public Person(String code, String name, LocalDate localDate, String email) {
        this.code = code;
        this.name = name;
        this.localDate = localDate;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                " code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", localDate=" + localDate +
                ", email='" + email + '\'' ;
    }
}
