package example.codeclan.com.employeestartpoint;

/**
 * Created by Peter on 24/10/2017.
 */

//    Create subclasses of Employee: Engineer and Admin.
public class Admin extends Employee {
    //    These should take in same parameters as Employee and pass to Employee constructor.
    public Admin(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
}
