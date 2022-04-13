package qa_for_everyone.hw7_oop;

import java.util.Objects;

public class Director extends Employee {
    private int NumberOfSubordinates;

    Director(String name, double salary, int numberOfSubordinates) {
        super(name, salary);
        NumberOfSubordinates = numberOfSubordinates;
    }

    int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        double result = super.getBaseSalary();
        if (getNumberOfSubordinates() > 0) {
            result = super.getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary(), getNumberOfSubordinates());
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (this.getClass() != other.getClass()) return false;
        Director otherObj = (Director) other;
        return this.getName().equals(otherObj.getName()) && this.getSalary() == otherObj.getSalary() &&
                this.getNumberOfSubordinates() == otherObj.getNumberOfSubordinates();
    }
}
