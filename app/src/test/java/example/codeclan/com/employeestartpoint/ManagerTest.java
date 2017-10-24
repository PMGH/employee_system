package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 24/10/2017.
 */

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager(2, "Jeremy Jones", "000-002", 35000.00, "Alaska");
    }

    @Test
    public void canGetId(){
        assertEquals(2, manager.getId());
    }

    @Test
    public void canGetName(){
        assertEquals("Jeremy Jones", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Travis Rice");
        assertEquals("Travis Rice", manager.getName());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetSocialSecurityNumber(){
        assertEquals("000-002", manager.getSocialSecurityNumber());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(7000.00);
        assertEquals(42000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetDepartment(){
        assertEquals("Alaska", manager.getDeptName());
    }

}
