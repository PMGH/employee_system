package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 24/10/2017.
 */

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director(3, "Jeremy Jones", "000-002", 70000.00, "America", 10000000.00);
    }

    @Test
    public void canGetId(){
        assertEquals(3, director.getId());
    }

    @Test
    public void canGetName(){
        assertEquals("Jeremy Jones", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Travis Rice");
        assertEquals("Travis Rice", director.getName());
    }

    @Test
    public void canGetSalary(){
        assertEquals(70000.00, director.getSalary(), 0.1);
    }

    @Test
    public void canGetSocialSecurityNumber(){
        assertEquals("000-002", director.getSocialSecurityNumber());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(12000.00);
        assertEquals(82000.00, director.getSalary(), 0.1);
    }

    @Test
    public void canGetDepartment(){
        assertEquals("America", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000000.00, director.getBudget(), 0.1);
    }
}
