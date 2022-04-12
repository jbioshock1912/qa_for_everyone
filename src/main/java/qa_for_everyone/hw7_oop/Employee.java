package qa_for_everyone.hw7_oop;
/*Необходимо создать класс Employee со следующими методами:
        getBaseSalary - получить базовую ставку
        setBaseSalary
        getName - получить имя
        setName
        getSalary - получить зарплату*/

import java.util.Objects;

/*  Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

    Необходимо создать класс Manager в который нужно добавить следующие методы:
   getNumberOfSubordinates - получить количество подчиненных
   setNumberOfSubordinates
   в классе, метод getSalary будет возвращать значение по формуле -
<базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.

   Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле -
<базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.*/
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return salary;
    }

    public void setBaseSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (this.getClass() != other.getClass()) return false;
        Employee otherObj = (Employee) other;
        return this.getName().equals(otherObj.getName()) && this.salary == otherObj.salary;
    }
}
