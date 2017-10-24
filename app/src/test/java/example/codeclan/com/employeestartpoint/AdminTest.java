package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 24/10/2017.
 */

public class AdminTest {

    Admin admin;

    @Before
    public void before(){
        admin = new Admin(20, "Ned", "000-200", 21000.00);
    }

    @Test
    public void canGetId(){
        assertEquals(20, admin.getId());
    }

    @Test
    public void canGetName(){
        assertEquals("Ned", admin.getName());
    }

    @Test
    public void canSetName(){
        admin.setName("Alfred");
        assertEquals("Alfred", admin.getName());
    }

    @Test
    public void canGetSalary(){
        assertEquals(21000.00, admin.getSalary(), 0.1);
    }

    @Test
    public void canGetSocialSecurityNumber(){
        assertEquals("000-200", admin.getSocialSecurityNumber());
    }

    @Test
    public void canRaiseSalary(){
        admin.raiseSalary(1.98);
        assertEquals(21001.98, admin.getSalary(), 0.1);
    }

}
