package pro.sky.java.course2.collection.list;

import java.util.Objects;

public class Employee {
    static int count = 1;
    private int id;
    private String surname;
    private String name;

    public Employee(String surname, String name) {

        this.id = count;
        this.surname = surname;
        this.name = name;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }

    public String toString() {
        return "ID:" + this.id + " " + this.surname + " " + this.name + " ";
    }
}