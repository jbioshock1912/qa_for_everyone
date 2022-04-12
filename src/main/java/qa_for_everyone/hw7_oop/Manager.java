package qa_for_everyone.hw7_oop;

public class Manager extends Director {


    public Manager(String name, double salary, int numberOfSubordinates) {
        super(name, salary, numberOfSubordinates);
    }

    public double getSalary() {
       double result = super.getBaseSalary();
        if (getNumberOfSubordinates() > 0){
            result = super.getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3);
        }
        return result;
    }

    public void setSalary(double salary) {
        salary = getSalary();
    }
}
