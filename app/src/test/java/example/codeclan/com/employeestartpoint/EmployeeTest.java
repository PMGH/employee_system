package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;

    @Before
    public void before() {
        employee = new Employee(0, "David Allan", "000-001", 25000.00);
    }

    @Test
    public void newEmployeeIdIsZero() {
        assertEquals(0, employee.getId());
    }

    @Test
    public void newEmployeeNameIsNull() {
        assertEquals("David Allan", employee.getName());
    }

    @Test
    public void newEmployeeSSnIsNull() {
        assertEquals("000-001", employee.getSocialSecurityNumber());
    }

    @Test
    public void newEmployeeSalaryIsNull() {
        assertEquals(25000.00, employee.getSalary(), 0.01);
    }

//    @Test
//    public void canSetEmployeeId() {
//        employee.setId(1);
//        assertEquals(1, employee.getId());
//    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
    }

//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("AB123456C");
//        assertEquals("AB123456C", employee.getSocialSecurityNumber());
//    }

//    @Test
//    public void canSetEmployeeSalary() {
//        employee.setSalary(30000.00);
//        assertEquals(30000.00, employee.getSalary(), 0.01);
//    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(5000.00);
        assertEquals(30000.00, employee.getSalary(), 0.1);
    }

    //    Prevent a negative value for the raiseSalary method.
    @Test
    public void cantGiveNegativeRaise(){
        employee.raiseSalary(-555.00);
        assertEquals(25000.00, employee.getSalary(), 0.1);
    }


    //    Prevent a null or empty value for the setName method.
    @Test
    public void cantSetNameToBlankOrNull(){
        employee.setName("");
        assertEquals("David Allan", employee.getName());

        employee.setName(null);
        assertEquals("David Allan", employee.getName());
    }

}
