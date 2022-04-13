package qa_for_everyone.hw7_2_oop;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }



    @Override
    public double getSalary(Month[] monthArray) { // что за исключение?
        return super.getSalary(monthArray) + (getSalary(monthArray) / 100 * getNumberOfSubordinates());
    }

}
