package qa_for_everyone.hw7_2_oop;
import qa_for_everyone.oop3.Sex;

public class Employee {
    private String name;
    private int age;
    private double salaryPerDay;
    private Sex sex;

    public Employee(String name, int age, double salaryPerDay, Sex sex) {
        this.name = name;
        this.age = age;
        this.salaryPerDay = salaryPerDay;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getSalary(Month[] monthArray){
        return MonthUtils.countWorkDays(monthArray) * salaryPerDay; // зачем создали метод котоырй считает рабочие дни?? ведь это всё есть в массиве можно оттуда дергать рабочие дни
    }
}
