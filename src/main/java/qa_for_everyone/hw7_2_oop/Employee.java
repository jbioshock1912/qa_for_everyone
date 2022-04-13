package qa_for_everyone.hw7_2_oop;
import qa_for_everyone.oop3.Sex;

public class Employee {
    private String name;
    private int age;
    private double salaryPerDay;
    private Sex sex;

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
        double allDaysSalary = 0.0;
        int year = 2022;
        MonthUtils.setFebruary(monthArray, year);
        int workDays = MonthUtils.countWorkDays(monthArray, year);
        return allDaysSalary = allDaysSalary * workDays;  // а как установить потмо зарплату конкретному рабочему?
    }
}
