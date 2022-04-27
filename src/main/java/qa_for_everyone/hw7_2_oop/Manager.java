package qa_for_everyone.hw7_2_oop;

import qa_for_everyone.oop3.Sex;

public final class Manager extends Employee {

    private int numberOfSubordinates;

    public Manager(String name, int age, double salaryPerDay, Sex sex, int numberOfSubordinates) {
        super(name, age, salaryPerDay, sex);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    private int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        var baseSalary = super.getSalary(monthArray);
        return baseSalary + (baseSalary / 100 * getNumberOfSubordinates());
    }
}
