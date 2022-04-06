package qa_for_everyone.oop3;

public class Salary_3 {
    public double getSum(Employee_3[] employeeArray){
        double allSumOfSalary = 0.0;
        for (Employee_3 employee_3 : employeeArray) {
            allSumOfSalary = employee_3.getSalary() + allSumOfSalary;
        }
        return allSumOfSalary;
    }
}
