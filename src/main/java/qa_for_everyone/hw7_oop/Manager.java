package qa_for_everyone.hw7_oop;

public class Manager extends Employee {
    public static final int COEFFICIENT_3 = 3;

    private int NumberOfSubordinates;

    public Manager(String name, double salary, int numberOfSubordinates) {
        super(name, salary);
        NumberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

    int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
       double result = super.getBaseSalary();
        if (getNumberOfSubordinates() > 0){
            result = super.getBaseSalary() * (getNumberOfSubordinates() / 100.0 * COEFFICIENT_3);
        }
        return result;
    }
}
