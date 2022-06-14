package qa_for_everyone.oop3;

public class Employee_3 {
    private String name;
    private int age;
    private Sex sex;
    private double salary;

    public boolean isSameName(Employee_3 employee){
        return this.name.equals(employee.name);
    }

    public double getSalary() {
        return salary;
    }
}
