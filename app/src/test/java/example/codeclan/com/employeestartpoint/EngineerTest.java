package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 24/10/2017.
 */

public class EngineerTest {

    Engineer engineer;

    @Before
    public void before(){
        engineer = new Engineer(10, "Dave", "000-100", 27000.00);
    }

    @Test
    public void canGetId(){
        assertEquals(10, engineer.getId());
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", engineer.getName());
    }

    @Test
    public void canSetName(){
        engineer.setName("Margaret");
        assertEquals("Margaret", engineer.getName());
    }

    @Test
    public void canGetSalary(){
        assertEquals(27000.00, engineer.getSalary(), 0.1);
    }

    @Test
    public void canGetSocialSecurityNumber(){
        assertEquals("000-100", engineer.getSocialSecurityNumber());
    }

    @Test
    public void canRaiseSalary(){
        engineer.raiseSalary(500.00);
        assertEquals(27500.00, engineer.getSalary(), 0.1);
    }

}
