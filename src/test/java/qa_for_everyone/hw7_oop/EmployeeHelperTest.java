package qa_for_everyone.hw7_oop;


import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeHelperTest {

    private Employee[] employee;
    private Manager[] manager;

    @Before
    public void createList() {
        employee = new Employee[10];
        Employee one = new Worker("Nikolay", 254.0);
        Employee two = new Worker("kk", 0.0);
        Employee three = new Worker("Alice", 124.0);
        Employee four = new Worker("Licelice", 15.1);
        Employee five = new Manager("Julia", 12.0, 3);
        Employee six = new Manager("Hulia", 12.0, 0);
        Employee seven = new Manager("Lia", 0.0, 0);
        Employee eight = new Director("Boris", 100, 10);
        Employee nine = new Director("Toniya", 15, 10);
        Employee ten = new Director("Julia", 15, 10);
        employee[0] = one;
        employee[1] = two;
        employee[2] = three;
        employee[3] = four;
        employee[4] = five;
        employee[5] = six;
        employee[6] = seven;
        employee[7] = eight;
        employee[8] = nine;
        employee[9] = ten;
        manager = new Manager[3];
        manager[0] = new Manager("Julia", 12.0, 3);
        manager[1] = new Manager("Hulia", 12.0, 0);
        manager[2] = new Manager("Lia", 0.0, 0);
    }


    @Test
    public void findEmployeeByName() {
        List<Employee> expectedResult = new ArrayList<Employee>();
        expectedResult.add(new Director("Julia", 15, 10));
        expectedResult.add(new Manager("Julia", 12.0, 3));
        List<Employee> actualResult = EmployeeHelper.findEmployeeByName(employee, "Julia");
        Assert.assertTrue(CollectionUtils.isEqualCollection(expectedResult, actualResult));
    }

    @Test
    public void findEmployeeByText() {
        List<Employee> expectedResult = new ArrayList<Employee>();
        expectedResult.add(new Director("Julia", 15, 10));
        expectedResult.add(new Manager("Julia", 12.0, 3));
        expectedResult.add(new Manager("Hulia", 12.0, 0));
        List<Employee> actualResult = EmployeeHelper.findEmployeeByText(employee, "lia");
    }

    @Test
    public void calculatingAllSalary() {
        Assert.assertEquals(547.1, EmployeeHelper.calculatingAllSalary(employee), 0.0);
    }

    @Test
    public void calculateSalaryForEmployee() {
        assertEquals(1188.0, EmployeeHelper.calculateSalaryForEmployee(employee[6]), 0.0);
    }

    @Test
    public void getMinSalary() {
        assertEquals(0.0, EmployeeHelper.getMinSalary(employee), 0.0);
    }

    @Test
    public void getMaxSalary() {
        assertEquals(254.0, EmployeeHelper.getMaxSalary(employee), 0.0);
    }

    @Test
    public void getMinCountOfSubordinates() {
        assertEquals(0, EmployeeHelper.getMinCountOfSubordinates(manager));
    }

    @Test
    public void getMaxBonusOfSalary() {
        assertEquals(1200.0, EmployeeHelper.getMaxBonusOfSalary(manager), 0.0);
    }

    @Test
    public void getMinBonusOfSalary() {
    }
}