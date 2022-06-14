package qa_for_everyone.hw7_2_oop;

import qa_for_everyone.oop3.Sex;

public class ManagerWrapper {

    private final Employee employee;
    private final int numberOfSubordinates;

    public ManagerWrapper(String name, int age, double salaryPerDay, Sex sex, int numberOfSubordinates) {
        employee = new Employee(name, age, salaryPerDay, sex);
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
