package qa_for_everyone.hw7_oop;

import java.util.ArrayList;
import java.util.List;

/*Необходимо создать утилитарный класс со следующими методами:
        поиск сотрудника в массиве по его имени
        поиск сотрудника в массиве по вхождению указанной строки в его имени
        подсчет зарплатного бюджета для всех сотрудников в массиве
        поиск наименьшей зарплаты в массиве
        поиск наибольшей зарплаты в массиве
        поиск наименьшего количества подчиненных в массиве менеджеров
        поиск наибольшего количества подчиненных в массиве менеджеров
        поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
        поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров*/
public class EmployeeHelper {

    static List<Employee> findEmployeeByName(Employee[] arrayEmployee, String name) { // или ничегон е возвращать???и как тогда использовать этот метод и сохранять значение??
        List<Employee> employeeFindByName = new ArrayList<Employee>();
        for (Employee employee : arrayEmployee) {
            if (employee.getName().equals(name)) {
                employeeFindByName.add(employee);
            }
        }
        return employeeFindByName;
    }

    public static List<Employee> findEmployeeByText(Employee[] arrayEmployee, String text) {
        List<Employee> employeeFindText = new ArrayList<Employee>();
        for (Employee employee : arrayEmployee) {
            if (employee.getName().contains(text)) {
                employeeFindText.add(employee);
            }
        }
        return employeeFindText;
    }

    public static double calculatingAllSalary(Employee[] arrayEmployee) {
        double allSalary = 0.0;
        for (Employee employee : arrayEmployee) {
            allSalary = allSalary + employee.getBaseSalary(); // если я его переопределила то считаться будет верно?у директора, менеджера и та кдалее
        }
        return allSalary;
    }

    public static double calculateSalaryForEmployee(Employee employee) {
        return employee.getBaseSalary();
    }

    public static double getMinSalary(Employee[] arrayEmployee) {
        double minSalary = 0.0; // а если Employee null ?
        for (Employee employee : arrayEmployee) {
            if (employee.getBaseSalary() < minSalary) {
                minSalary = employee.getBaseSalary();
            }
        }
        return minSalary;
    }

    public static double getMaxSalary(Employee[] arrayEmployee) {
        double maxSalary = 0.0;
        for (Employee employee : arrayEmployee) {
            if (employee.getBaseSalary() > maxSalary) {
                maxSalary = employee.getBaseSalary();
            }
        }
        return maxSalary;
    }

    public static int getMinCountOfSubordinates(Manager[] arrayManager) {
        int minCountOfSubordinates = 0;
        for (Manager manager : arrayManager) { // почему если вместо Manager поставить Employee то он не видит метода получить починенных?
            if (manager.getNumberOfSubordinates() < minCountOfSubordinates) {
                minCountOfSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return minCountOfSubordinates;
    }

    public static double getMaxBonusOfSalary(Manager[] arrayManager) {
        double maxBonus = 0.0;
        for (Manager manager : arrayManager) {
            double difference = manager.getSalary() - manager.getBaseSalary();
            if (difference > maxBonus) {
                maxBonus = difference;
            }
        }
        return maxBonus;
    }

    public static double getMinBonusOfSalary(Manager[] arrayManager) {
        double minBonus = 0.0;
        for (Manager manager : arrayManager) {
            double difference = manager.getSalary() - manager.getBaseSalary();
            if (difference < minBonus) {
                minBonus = difference;
            }
        }
        return minBonus;
    }


}


