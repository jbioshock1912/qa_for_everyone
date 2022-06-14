package qa_for_everyone.hw7_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeHelper {

    static List<Employee> findEmployeeByName(Employee[] arrayEmployee, String name) {
        List<Employee> employeeFindByName = new ArrayList<Employee>();
        for (Employee employee : arrayEmployee) {
            if (employee.getName().equals(name)) {
                employeeFindByName.add(employee);
            }
        }
        return employeeFindByName;
    }

    static List<Employee> findEmployeeByText(Employee[] arrayEmployee, String text) {
        List<Employee> employeeFindText = new ArrayList<Employee>();
        for (Employee employee : arrayEmployee) {
            if (employee.getName().contains(text)) {
                employeeFindText.add(employee);
            }
        }
        return employeeFindText;
    }

    static double calculatingAllSalary(Employee[] arrayEmployee) {
        double allSalary = 0.0;
        for (Employee employee : arrayEmployee) {
            allSalary = allSalary + employee.getSalary();
        }
        return allSalary;
    }

    static double calculateSalaryForEmployee(Employee employee) {
        return employee.getSalary();
    }

    static double getMinSalary(Employee[] arrayEmployee) {
        double minSalary = 0.0;
        for (Employee employee : arrayEmployee) {
            if (!Objects.isNull(employee) && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    static double getMaxSalary(Employee[] arrayEmployee) {
        double maxSalary = 0.0;
        for (Employee employee : arrayEmployee) {
            if (!Objects.isNull(employee) && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    static int getMinCountOfSubordinates(Manager[] arrayManager) {
        int minCountOfSubordinates = 0;
        for (Manager manager : arrayManager) {
            if (manager.getNumberOfSubordinates() < minCountOfSubordinates) {
                minCountOfSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return minCountOfSubordinates;
    }

    static double getMaxBonusOfSalary(Manager[] arrayManager) {
        double maxSalary = Integer.MIN_VALUE;
        for (Manager manager : arrayManager) {
            var difference = manager.getSalary() - manager.getBaseSalary();
            if (difference > maxSalary) {
                maxSalary = difference;
            }
        }
        return maxSalary;
    }

    public static double getMinBonusOfSalary(Manager[] arrayManager) {
        double minBonus = Integer.MAX_VALUE;
        for (Manager manager : arrayManager) {
            double difference = manager.getSalary() - manager.getBaseSalary();
            if (difference < minBonus) {
                minBonus = difference;
            }
        }
        return minBonus;
    }
}


