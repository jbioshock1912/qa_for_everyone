package qa_for_everyone.hw7_oop;

import java.util.Objects;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double getSalary();

    public String getName() {
        return name;
    }

    double getBaseSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (this.getClass() != other.getClass()) return false;
        Employee otherObj = (Employee) other;
        return this.getName().equals(otherObj.getName()) && this.salary == otherObj.salary;
    }
}
