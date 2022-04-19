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
    private Employee[] employeeTest2;

    @Before
    public void createList() {

        employee = new Employee[10];
        employee[0] = new Worker("Nikolay", 254.0);
        employee[1] = new Worker("kk", 0.0);
        employee[2] = new Worker("Alice", 124.0);
        employee[3] = new Worker("Licelice", 15.1);
        employee[4] = new Manager("Julia", 12.0, 3);
        employee[5] = new Manager("Hulia", 12.0, 0);
        employee[6] = new Manager("Lia", 0.0, 0);
        employee[7] = new Director("Boris", 100, 10);
        employee[8]  = new Director("Toniya", 15, 10);
        employee[9] = new Director("Julia", 15, 10);

        manager = new Manager[3];
        manager[0] = new Manager("Julia", 12.0, 3);
        manager[1] = new Manager("Hulia", 12.0, 1);
        manager[2] = new Manager("Lia", 0.0, 0);

        employeeTest2 = new Employee[3];
        employeeTest2[0] = new Worker("Olga", 5.0);
        employeeTest2[1] = new Manager("Dima", 10.0, 2);
        employeeTest2[2] = new Director("Ivan", 100, 10);
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
        Assert.assertEquals(95.6, EmployeeHelper.calculatingAllSalary(employeeTest2), 0.0);
    }

    @Test
    public void calculateSalaryForEmployee() {
        assertEquals(90.0, EmployeeHelper.calculateSalaryForEmployee(employeeTest2[2]), 0.0);
        assertEquals(5.0, EmployeeHelper.calculateSalaryForEmployee(employeeTest2[0]), 0.0);
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
        //Arrays.asList(manager).stream().forEach(s -> System.out.println(s.getSalary() - s.getBaseSalary()));
        assertEquals(1.08, EmployeeHelper.getMaxBonusOfSalary(manager), 0.0);
    }

    @Test
    public void getMinBonusOfSalary() {
    }
}